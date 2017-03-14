import java.util.LinkedList;

public class Directory {
	LinkedList<Employee> dir;
	
	public Directory()
	{
		dir = new LinkedList<Employee>();
	}
	
	public void add(String l, String f, String d, String p)
	{
		Employee e = new Employee(l,f,d,p);
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
		DirectoryProxy.add(e);
	}
	
	public void print()
	{
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
