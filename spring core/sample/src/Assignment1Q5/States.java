package Assignment1Q5;


import Assignment1Q4.capitals;

public class States {

	private capitals state1;
	private capitals state2;
	
	public capitals getState1() {
		return state1;
	}

	public void setState1(capitals state1) {
		this.state1 = state1;
	}

	public capitals getState2() {
		return state2;
	}

	public void setState2(capitals state2) {
		this.state2 = state2;
	}

	public void print()
	{
	    System.out.println("state1 :" + state1+ "  capital :" +state1 );
	    System.out.println("state2 :" + state2+"   capital :" +state2);
	}

}
