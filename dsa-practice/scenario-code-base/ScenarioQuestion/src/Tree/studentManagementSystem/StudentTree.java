package Tree.studentManagementSystem;

public class StudentTree {
	  private Student root;

	    public void add(Student s) {
	        root = addRec(root, s);
	    }

	    private Student addRec(Student cur, Student s) {
	        if (cur == null) {
	            return s; 
	        }

	        if (s.getRollno() < cur.getRollno()) {
	            cur.setLeft(addRec(cur.getLeft(), s));
	        } else {
	            cur.setRight(addRec(cur.getRight(), s));
	        }

	        return cur;
	    }

	    public void search(int rollno) {
	        searchRec(root, rollno);
	    }

	    private void searchRec(Student cur, int rollno) {
	        if (cur == null) {
	            System.out.println("Roll number not Found !!");
	            return;
	        }

	        if (cur.getRollno() == rollno) {
	            System.out.println(cur);
	            return;
	        }

	        if (rollno < cur.getRollno()) {
	            searchRec(cur.getLeft(), rollno);
	        } else {
	            searchRec(cur.getRight(), rollno);
	        }
	    }
	    public void delete(int rollno) {
	        root = deleteRec(root, rollno);
	    }

	    private Student deleteRec(Student cur, int rollno) {
	        if (cur == null) return null;

	        if (rollno < cur.getRollno()) {
	            cur.setLeft(deleteRec(cur.getLeft(), rollno));
	        } 
	        else if (rollno > cur.getRollno()) {
	            cur.setRight(deleteRec(cur.getRight(), rollno));
	        } 
	        else {
	         
	            if (cur.getLeft() == null) return cur.getRight();
	            if (cur.getRight() == null) return cur.getLeft();

	           
	            Student successor = minValueNode(cur.getRight());
	            cur.setRollno(successor.getRollno());
	            cur.setRight(deleteRec(cur.getRight(), successor.getRollno()));
	        }
	        return cur;
	    }

	    private Student minValueNode(Student node) {
	        Student cur = node;
	        while (cur.getLeft() != null) {
	            cur = cur.getLeft();
	        }
	        return cur;
	    }
	    
	    public void view() {
	       Student temp = root;
	       view(temp);
	    }
	    public void view(Student cur) {
	    	if(cur==null) {
	    	   return;
	    	}
	    	
	    	view(cur.getLeft());
	    	System.out.println(cur.toString());
	    	view(cur.getRight());
	    }
}
