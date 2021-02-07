package lamda8;

import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable {
	 public void run(){  
	      Consumer <Integer> f=(t)->{
	        for(int i=0;i<t;i++)
	        System.out.print(i);
	      };
	      f.accept(10);
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Assignment4Q8 a1=new Assignment4Q8();
           Thread t=new Thread(a1);
           t.start();
	}

}
