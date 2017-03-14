import java.io.*;
import java.util.*;
import com.google.gson.Gson;
public class MainDirectory {
	
	private Gson g;
	private LinkedList<Employee> dir;
	
	public MainDirectory(){
		this.g = new Gson();
		this.dir = new LinkedList<Employee>();
	}
	
	public void add()
	{
		BufferedReader fr = null;
		try {
			fr = new BufferedReader(new FileReader("testies.txt"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String input="";
		
		try {
			input = fr.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		Employee e = g.fromJson(input, Employee.class);
		if (dir.size()==0)
		{
			dir.add(e);
		}
		else{
			int c;
			for(int i=0; i<dir.size(); i++){
				c = e.getLastName().compareToIgnoreCase(dir.get(i).getLastName());
				if(c<0){
					if (i == dir.size()-1)
					{
						dir.add(i, e);
						i++;
					}
				}
				else if(c>0){
					dir.add(i, e);
					i = dir.size();
				}
				else {
					c = e.getFirstName().compareToIgnoreCase(dir.get(i).getFirstName());
					if(c<0){
						dir.add(i+1, e);
						i = dir.size();
					}
					else {
						dir.add(i,e);
						i = dir.size();
					}
				}
			}
		}
	}
	
	public void print(){
		String out;
		for(int i=0; i<dir.size(); i++){
			out = dir.get(i).toString();
			System.out.println(out);
		}
	}
	
	public void clear(){
		this.dir = new LinkedList<Employee>();
	}
}
