package functionalinterface.BackUpSerialization;

public class BackUpProcess {

	public void backUp(Object obj) {
		if(obj instanceof BackUpSerialization) {
			System.out.println("Class is eligible for back up     : "+obj.getClass().getName().toString());
		}else {
			System.out.println("Class is not eligible for back up : "+obj.getClass().getName().toString());
		}
	}
}
