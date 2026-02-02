package streamApi.emailnotification;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Users> users = new ArrayList<>();
		users.add(new Users(101,"Lucky"));
		users.add(new Users(102,"Himesh"));
		users.add(new Users(103,"Nageshwar"));
		users.add(new Users(104,"Arvind"));
		
		
		String email = "We are congratulation to get invite";
		
		users.stream().forEach(x->x.emailNotification(email));
	}
}
