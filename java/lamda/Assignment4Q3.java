package lambda3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
interface Condition
{
	boolean test(Assignment4Q3 p);
}
public class Assignment4Q3 {
	public String name;

	public Assignment4Q3 (String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "name: "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List <Assignment4Q3> list= Arrays.asList(
    	       new Assignment4Q3("mobile"),
    	       new Assignment4Q3("tv"),
    	       new Assignment4Q3("tab")
       );
    
       
     desplay(list,p->p.name.equals("mobile"),p->System.out.println(p));
    		 /*new Condition() {
		@Override
		public boolean test(Assignment4Q3 p) {
			// TODO Auto-generated method stub
			return p.name.equals("mobile");
		} 
    	 
     });*/
       
	}
	private static void desplay(List<Assignment4Q3> list,Predicate<Assignment4Q3> predicate,Consumer<Assignment4Q3> consumer) {
		for(Assignment4Q3 s:list)
		{
			if(predicate.test(s))
			{
				consumer.accept(s);;
			}
		}
		
	}

	
}
