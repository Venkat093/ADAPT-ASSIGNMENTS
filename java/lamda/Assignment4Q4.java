package lambda4;

import java.util.ArrayList;

public class Assignment4Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employlist =new ArrayList<>();
		employlist.add("Venkat");
		employlist.add("sai");
		employlist.add("kumar");
		employlist.add("varma");
		removeoddlength(employlist);
		for(String s:employlist)
		{
			System.out.println(s);
		}

	}
	public static ArrayList<String> removeoddlength(ArrayList<String> employlist)
	{
		
	employlist.removeIf(n->((n.length())%3==0));
	return employlist;
		
	}
}
