class SiCi {
	double p;
	int t;
	double r;
	public double simpleinterest(double principalAmount,int time,double interestRate)
	{
		this.p=principalAmount;
		this.t=time;
		this.r=interestRate;
		double si=(p*t*r)/100;
		return si;
	}
	public double compoundInterest(double principalAmount,int time,double interestRate)
	{
		this.p=principalAmount;
		this.t=time;
		this.r=interestRate;
     	double ci= p * Math.pow(1 + (r / 100), t);
		return ci;
	}

}

public class Assignment1Q3 {

	public static void main(String[] args) {
		SiCi a=new SiCi();
		System.out.println(a.simpleinterest(100.0, 5, 2.5));
		System.out.println(a.compoundInterest(1000, 5, 2.5));

	}

}
