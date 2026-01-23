package Tree.studentManagementSystem;

public class Main {
    public static void main(String[] args) {
    	StudentTree college = new StudentTree();
    	college.add(new Student(104,"Lucky Pal",67.5));
    	college.add(new Student(103,"himesh Kurmi",100));
    	college.add(new Student(105,"Nageshwar",52));
    	college.view();
    	college.search(103);
    	college.delete(104);
    	college.view();
    	
    }
}
