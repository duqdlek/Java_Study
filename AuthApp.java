
public class AuthApp {

	public static void main(String[] args) {

	String id = "ffofforu";
	String inputId = args[0];
	
	String pw = "11111";
	String inputPw = args[1];
	
	System.out.println("Hi.");
	
//	if(inputId.equals(id)) {	
//		if(inputPw.equals(pw)) {
//	System.out.print("Welcome");
//	}	else System.out.println("Wrong password!");
//	}
//	
//	else {
//		System.out.println("Who Are You?");
//	}
	
	if(inputId.equals(id) && inputPw.equals(pw)) {	
         System.out.print("Welcome");
    }
    else {
	System.out.println("Who Are You?");
    }
	
	}

}
