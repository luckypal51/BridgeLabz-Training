package functionalinterface.password;

public class Main {
      public static void main(String[] args) {
		System.out.println("Password Strength is : "+Password.checkStrength("asdfghjkl"));
		System.out.println("Password Strength is : "+Password.checkStrength("lucky"));
		System.out.println("Password Strength is : "+Password.checkStrength("gjvnhfnhfbjgvj"));
	}
}
