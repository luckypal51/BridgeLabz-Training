package Tree.HospitalManagementSystem;

public class Patient {
    int id;
    String name;
    long checkInTime;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.checkInTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Patient{id=" + id + " | name='" + name + "' |  time=" + checkInTime + "}";
    }
}
