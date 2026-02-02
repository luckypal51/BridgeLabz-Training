package streamApi.stock;

public class Stock {
       public String stockName;
       public double price;
       
	   public Stock(String stockName, double price) {
		this.stockName = stockName;
		this.price = price;
	   }

	   @Override
	   public String toString() {
		return "Stock [stockName=" + stockName + ", price=" + price + "]";
	   }
       
}
