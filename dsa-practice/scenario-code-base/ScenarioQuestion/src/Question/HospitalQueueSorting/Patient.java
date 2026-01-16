package Questions.HospitalQueueSorting;

public class Patient {
       int priority;
       Patient next;
       
       public Patient(int priority) {
    	   this.priority = priority;
    	   this.next = null;
       }
}
