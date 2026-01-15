package Question.SmartCheckout;

import java.util.HashMap;

public class Node {
     public String name;
     public Node next;
     HashMap<String,Product> product = new HashMap<>();
     public Node(String name) {
    	 this.name = name;
     }
     
     public void addProduct(String productName,int quantity,double price) {
    	if(product.containsKey(productName)) {
    		Product pro = product.get(productName);
    		pro.quantity +=quantity;
    	}else {
    		Product pro = new Product(productName,quantity,price);
    		product.put(productName, pro);
    	}
     }
     
     public void viewCart() {
    	 System.out.println("\n----------"+name+" Cart--------");
    	 for(var a:product.entrySet()) {
    		 System.out.println("\n-----Product Detail-----");
    		 System.out.println("Product Name     : "+a.getValue().product);
    		 System.out.println("Product Price    : "+a.getValue().amount);
    		 System.out.println("Product Quantity : "+a.getValue().quantity);
    	 }
     }
     public double totalprice() {
    	 double amount = 0;
    	 for(var a : product.entrySet()) {
    		 amount += a.getValue().amount * a.getValue().quantity;
    	 }
    	 return amount;
     }
}
