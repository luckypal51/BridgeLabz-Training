package Question.IceCreamRush;

public class IceCreamFlavour {
      public String name;
      public int sold;
      
      public IceCreamFlavour(String name, int sold) {
    	   this.name = name;
    	   this.sold = sold;
      }
      
      @Override
    public String toString() {
      return "\nFlavour : "+this.name+" | Unit Sold : "+this.sold;
    }
}
