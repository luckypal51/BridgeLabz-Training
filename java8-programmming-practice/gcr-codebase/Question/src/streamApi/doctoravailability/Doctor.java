package streamApi.doctoravailability;

public class Doctor {
       public String name;
       public String speciality;
       public boolean availableOnWeekend;
	  
       public Doctor(String name, String speciality, boolean availableOnWeekend) {
		this.name = name;
		this.speciality = speciality;
		this.availableOnWeekend = availableOnWeekend;
	   }

	   @Override
	   public String toString() {
		return "Doctor [name=" + name + ", speciality=" + speciality + ", availableOnWeekend=" + availableOnWeekend
				+ "]";
	   }
       
       
}
