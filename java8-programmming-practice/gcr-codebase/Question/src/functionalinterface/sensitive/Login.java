package functionalinterface.sensitive;

public class Login implements SensitiveClass{
   public String email;
   public String password;
   
   public Login(String email, String password) {
	this.email = email;
	this.password = password;
   }  
}
