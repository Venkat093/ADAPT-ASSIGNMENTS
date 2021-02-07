package lambda1;
@FunctionalInterface
interface add
{
	public double addition(int x ,int y);
}
@FunctionalInterface
interface subtract
{
	public double subtraction(int a,int b);
	//public int multiplication();
}
interface multiplication
{
	public int multiplication(int a,int b);
}
interface div
{
	public int div(int a,int b);
}


public class Assignment4Q1 {

	public static void main(String[] args) {
		 add A1=(int num1,int num2)->  num1+num2;
		 System.out.println(A1.addition(13, 5));
		 subtract s1=(int a,int b)-> a-b;
		 System.out.println(s1.subtraction(13, 5));
		 multiplication m1=(int a,int b) ->a*b;
		 System.out.println(m1.multiplication(13, 15));
		 div d1=(int a,int b)->a/b;
		 System.out.println(d1.div(13, 5));
		 

}
}
