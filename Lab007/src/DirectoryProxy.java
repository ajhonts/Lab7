import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.*;
import com.google.gson.*;
import com.google.gson.stream.*;

public class DirectoryProxy {

	public static void add(Employee e)
	{
		Gson g = new Gson();
		String out = g.toJson(e);
		
		try {
			PrintWriter pw = new PrintWriter("testies.txt", "UTF-8");
			pw.println(out);
			pw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
