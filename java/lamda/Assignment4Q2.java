import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

class orders
{
	private int totalPrice;
    private String status;


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public orders(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}


	public String toString()
	{
		return "total:"+totalPrice +"order status: "+status;
	}

}

     //interface Condition {
	   //boolean test(orders o);}


public class Assignment4Q2  {
	  
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List <orders> order=Arrays.asList(
		   new orders(10000,"Accepted"),
		   new orders(12000,"denied"),
		   new orders(2000,"denied"),
		   new orders(5000,"Accepted")
		   );
   
    Collections.sort(order, (orders o1,orders o2)->o1.getStatus().compareTo(o2.getStatus()));
    print(order,o->o.getTotalPrice()==10000);
    /*  Collections.sort(order, new Comparator<orders>() {

		@Override
		public int compare(orders o1, orders o2) {
			// TODO Auto-generated method stub
			return o1.getTotalPrice()-o2.getTotalPrice();
		}
    	
    });*/
    /* Collections.sort(order, new Comparator<orders>()
   {
	@Override
	public int compare(orders o1, orders o2) {
		return o1.getStatus().compareTo(o2.getStatus());
	}   
   });*/
   //print(order);
   /*print(order,new Condition() {
	
   
    @Override
	public boolean test(orders o) {
		return o.getTotalPrice()>10000;
		}
		});
	}*/
   System.out.println("printing alll");
    print(order,o->true);
	}
	
	
   private static void print(List<orders> order,Predicate<orders> predicate )
   {
	   for(orders o:order)
	   {
		   if(predicate.test(o))
		   {
			   o.getStatus().matches("Accept");
			   System.out.println(o);
		   }
	   }
   }
   	
}
	
