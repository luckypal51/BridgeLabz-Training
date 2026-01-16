package Question.EventManager;

public class Ticket {
       double price;
       
       public Ticket(double price) {
    	   this.price = price;
       }
       @Override
    public String toString() {
    	// TODO Auto-generated method stub
      return "Price is "+this.price;
    }
}
