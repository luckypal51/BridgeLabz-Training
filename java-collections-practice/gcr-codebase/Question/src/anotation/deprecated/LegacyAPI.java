package anotation.deprecated;

public class LegacyAPI {
	@Deprecated
     public void oldFeature() {
    	 System.out.println("Old features");
     }
	
	public void newFeature() {
		System.out.println("new Feature");
	}
}
