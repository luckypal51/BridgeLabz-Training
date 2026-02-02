package streamApi.emailnotification;

public class Users {
    public int id;
    public String name;
    
    public Users(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void emailNotification(String email) {
    	System.out.println(this.name+" recievied the email : "+email);
    }
}
