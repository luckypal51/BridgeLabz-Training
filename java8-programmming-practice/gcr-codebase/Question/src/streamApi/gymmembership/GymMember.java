package streamApi.gymmembership;

import java.time.LocalDate;

public class GymMember {
      public String name;
      public LocalDate expiry;
	
      public GymMember(String name, LocalDate expiry) {
		this.name = name;
		this.expiry = expiry;
	  }

	  @Override
	  public String toString() {
		return "GymMember [name=" + name + ", expiry=" + expiry + "]";
	  }
      
      
}
