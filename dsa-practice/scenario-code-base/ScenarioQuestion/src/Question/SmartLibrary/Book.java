package Question.SmartLibrary;

public class Book {
   
	public String name;
    public int id;
	
    public Book(String name, int id) {
		this.name = name;
		this.id = id;
	}  
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\nBook Title : "+this.name+" || Id : "+this.id;
    }
}
