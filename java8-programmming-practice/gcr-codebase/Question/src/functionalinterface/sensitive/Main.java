package functionalinterface.sensitive;

public class Main {
       public static void main(String[] args) {
		Requied req = new Requied();
		req.requiedToEncrypt(new Login("pallucky936@gmail.com","45425fghjk"));
		req.requiedToEncrypt(new Post(1520,"The world"));
	}
}
