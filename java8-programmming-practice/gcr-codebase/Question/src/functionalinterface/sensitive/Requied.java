package functionalinterface.sensitive;

public class Requied {
    public void requiedToEncrypt(Object obj) {
    	if(obj instanceof SensitiveClass) {
    		System.out.println("The class Requied encryption      : "+obj.getClass().getSimpleName());
    	}else {
    		System.out.println("The class not required encryption : "+obj.getClass().getSimpleName() );
    	}
    }
}
