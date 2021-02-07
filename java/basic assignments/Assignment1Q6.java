import java.util.Scanner;
class Login {
	String user1;
	String password1;
	String a="Ajay";
	String b="Password";
	@SuppressWarnings("resource")
	public void loginUser(String user1,String password1)
	{
		//this.user=user;
		//this.password=password;
		System.out.println("Enter user id");
		//Scanner sc=new Scanner(System.in);
		 //user1=sc.nextLine();
		//System.out.println("enter your password");
		//Scanner sc=new Scanner(System.in);
		 //password1 = sc.nextLine();
		if(user1==a&&password1==b)
		{
			System.out.println("welcoom "+user1);
			//return "Ajay";
		}
		else
		{
			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
		    // return"Ajay";
		}
	}


}

public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login user1=new Login();
		user1.loginUser("Ajay","Password");


	}

}
