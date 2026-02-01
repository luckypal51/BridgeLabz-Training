package functionalinterface.password;

public interface Password {
     public static Strength checkStrength(String s) {
    	 if(s.length()>10) {
    		 return Strength.Strong;
    	 }
    	 if(s.length()>7) {
    		 return Strength.Medium;
    	 }
    	 return Strength.Weak;
     }
}
