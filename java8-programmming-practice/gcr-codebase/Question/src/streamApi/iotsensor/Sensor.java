package streamApi.iotsensor;

public class Sensor {
     public int id;
     public String name;
     public double reading;

	 public Sensor(int id, String name, double reading) {
		this.id = id;
		this.name = name;
		this.reading = reading;
	 }
     
	 @Override
		public String toString() {
			return "Sensor [id=" + id + ", name=" + name + ", reading=" + reading + "]";
		}
}
