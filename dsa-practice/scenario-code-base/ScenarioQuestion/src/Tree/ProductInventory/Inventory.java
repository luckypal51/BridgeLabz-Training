package Tree.ProductInventory;

public class Inventory {
	Product root;
	
	public void insert(Product s) {
		Product temp = root;
		root = insert(s,temp);
	}
	public Product insert(Product s, Product cur) {
		if(cur==null) {
			return s;
		}
		if(s.id<cur.id) {
			cur.left = insert(s,cur.left);
		}else {
			cur.right = insert(s,cur.right);
		}
		return cur;
	}
	public void delete(int id) {
		if(root==null) {
			System.out.println("The List is Empty");
			return;
		}
		root = delete(id,root);
	}
	public Product delete(int id, Product cur) {
		if(cur==null) {
			System.out.println("Not found");
			return cur;
		}
		if(id<cur.id) {
			cur.left = delete(id,cur.left);
		}else if(id>cur.id) {
			cur.right = delete(id,cur.right);
		}else {
			if(cur.right!=null) {
				  Product parent = cur;
			        Product temp = cur.right;
			        while (temp.left != null) {
			            parent = temp;
			            temp = temp.left;
			        }
			        if (parent != cur) {
		                parent.left = temp.right;
		                temp.right = cur.right; 
		            }

		           temp.left = cur.left;
		           return temp;
		            
			}else {
				return cur.left;
			}
		}
		return cur;
	}
	public void view() {
		view(root);
	}
	public void view(Product cur) {
		if(cur==null) {
			return;
		}
		view(cur.left);
		System.out.println(cur.toString());
		view(cur.right);
	}
}
