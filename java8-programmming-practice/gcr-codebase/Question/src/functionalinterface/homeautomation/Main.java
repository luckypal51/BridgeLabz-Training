package functionalinterface.homeautomation;

public class Main {
	public static void main(String[] args) {
		AC a = new AC();
		TV t = new TV();
		Lights light = new Lights();
		a.turnOn.turnOn();
		a.turnOff.turnOff();
		t.turnOn.turnOn();
		t.turnOff.turnOff();
		light.turnOn.turnOn();
		light.turnOff.turnOff();
	}
}
