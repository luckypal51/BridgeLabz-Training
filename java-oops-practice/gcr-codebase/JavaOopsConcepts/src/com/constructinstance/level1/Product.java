package com.constructinstance.level1;

public class Product {
     public static int totalProduct=0;
     String productName;
     double price;
     
     public Product() {
    	 this("Samsung s24 Ultra", 150000);
     }
     public Product(String productName,double price) {
    	 this.productName = productName;
    	 this.price = price;
    	 totalProduct++;
     }
     public void totalProduct() {
    	 System.out.println("The total product is "+totalProduct);
     }
     
     public void displayProduct() {
    	 System.out.println("The name of product "+this.productName);
    	 System.out.println("The name of product "+this.price);
     }
     public static void main(String[] args) {
    	 Product p = new Product();
    	 Product p1 = new Product("Tablet",24000);
    	 p1.displayProduct();
    	 p.displayProduct();
    	 p.totalProduct();
     }
}
