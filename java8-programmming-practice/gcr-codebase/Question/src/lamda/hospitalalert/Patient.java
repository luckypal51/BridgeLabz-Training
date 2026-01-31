package lamda.hospitalalert;

public class Patient {
      public int patientId;
      public String name;
      public AlertType alert;
      
	  public Patient(int patientId, String name, AlertType alert) {
		this.patientId = patientId;
		this.name = name;
		this.alert = alert;
	  }

	  @Override
	  public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", alert=" + alert + "]";
	  }
      
      
}
