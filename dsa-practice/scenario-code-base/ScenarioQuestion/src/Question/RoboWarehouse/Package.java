package Question.RoboWarehouse;

public class Package {
      public int id;
      public double weight;
      
      public Package(int id, double weight) {
    	  this.id = id;
    	  this.weight = weight;
      }
      
      @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\n Package Id : "+this.id+" | Package Weight : "+this.weight;
    }
}
