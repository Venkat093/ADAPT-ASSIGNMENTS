import java.util.Scanner;
class ResultDeclaration {
	double a,b,c;
public String declairResults(double subject1Marks, double subject2Marks, double subject3Marks)
	
{
	this.a=subject1Marks;
    this.b=subject2Marks;
    this.c=subject3Marks;
    //Scanner sc=new Scanner(System.in);
    //double a=sc.nextDouble();
    //double b=sc.nextDouble();
    //double d=sc.nextDouble();    
    if(a>60&&b>60&&c>60)
    {
    	 return "passed";
    }
    else if(a>60&&b>60||b>60&&c>60||a>60&&c>60)
    {
    	return "promoted";
    	//System.out.println("promoted");
    }
    else {
   return "failed";
    	// 	System.out.println("failed");
    }
}
    
}

public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultDeclaration s1=new ResultDeclaration();
		System.out.println(s1.declairResults(70, 80, 90));
		ResultDeclaration s2=new ResultDeclaration();
		System.out.println(s2.declairResults(50, 40, 30));
		ResultDeclaration s3=new ResultDeclaration();
        System.out.println(s3.declairResults(70, 50, 80));
	}

}
