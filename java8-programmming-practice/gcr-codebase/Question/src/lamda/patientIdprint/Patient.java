package lamda.patientIdprint;

public class Patient {
      public int patient_id;
      public String patient_name;
      public String dept_name;
      
	  public Patient(int patient_id, String patient_name, String dept_name) {
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.dept_name = dept_name;
	  }

	  @Override
	  public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", dept_name=" + dept_name
				+ "]";
	  }
      
	  
}
