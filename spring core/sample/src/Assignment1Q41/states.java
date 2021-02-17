package Assignment1Q41;

import org.springframework.context.annotation.Configuration;

@Configuration
public class states {
	private String state1="andhrapradesh";
	private String state2="telangana";
	public String getState1() {
		return state1;
	}
	public void setState1(String state1) {
		this.state1 = state1;
	}
	public String getState2() {
		return state2;
	}
	public void setState2(String state2) {
		this.state2 = state2;
	}

	 public void display()
	 {
		 System.out.println("state1: "+state1+"  state2: "+state2);
	 }
	
}
