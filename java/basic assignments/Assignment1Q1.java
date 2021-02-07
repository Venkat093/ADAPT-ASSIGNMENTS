
class armstrong {
	public int number(int n)
	{
		int s=0;
		int temp=n;
	while(n>0)
	{
		int m=n%10;
		n=n/10;
		s=s+(m*m*m);
		
	}
	
	if(s==temp)
	{
	 System.out.println("yes"+ s);
	 return s;
	}
	else
	{
	System.out.println("no" + s);
	return s;
	}
	}

}
public class Assignment1Q1 {

	public static void main(String[] args) {
		armstrong a =new armstrong();
		a.number(371);
	
	}

}
