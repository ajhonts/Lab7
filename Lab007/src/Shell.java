import java.util.Scanner;

public class Shell {
	public static void main(String[] args)
	{
		Directory d = new Directory();
		MainDirectory md = new MainDirectory();
		
		Scanner p = new Scanner(System.in);
		String input;
		System.out.println("Add as last,first,department,phone");
		while(true)
		{
			System.out.print(">> ");
			input = p.nextLine();
			
			if (input.matches("ADD .*,.*,.*,.*")) 
			{
				String[] e;
				e = input.split(" ");
				e = e[1].split(",");
				d.add(e[0],e[1],e[2],e[3]);
				md.add();
			}
			else if (input.matches("PRINT"))
			{
				d.print();
				md.print();
			}
			else if (input.matches("CLEAR"))
			{
				d.clear();
				md.clear();
			}
			else
			{
				System.out.println("Command not found");
			}
		}
	}}

	
	

