package lamda5;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.*;

public class Assignment4Q5 {
   
  public static String processWords(List<String> list)
  {
	  StringBuilder s=new StringBuilder();
	    
	  Consumer <List> firstletter =l->{
		  Iterator<String> itr=list.iterator();
		  while(itr.hasNext())
		  {
			  s.append(itr.next().charAt(0));
		  }
	  };
	  firstletter.accept(list);
	  String s1=s.toString();
	  return s1;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("alpha","bravo","charley");
       System.out.println(processWords(list));
	}

}
