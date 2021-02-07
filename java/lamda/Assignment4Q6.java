package lambda6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class name
{
public String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public name() {
		super();
		this.name = name;
	}
	public  List<String> convertToUpperCase(List<String> list)
	{
		//UnaryOperator<String> unary=i->i.replaceAll(name, i.toUpperCase());
		//UnaryOperator<String> unary= i->i.replaceAll(name, getName().toUpperCase());
		list.replaceAll(String::toUpperCase);
		return list;
	}
	public String toString()
	{
		return "name"+name;
	}
}
public class Assignment4Q6 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<>();
         list.add("venkat");
         list.add("sai");
         list.add("varma");
         name n=new name();
         System.out.println(n.convertToUpperCase(list));
	}

}
