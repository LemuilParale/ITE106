public class lLamp{
	public boolean isOn;
	public String name;
	
	void turnOn() {
	isOn = true;
	name = "Seven";
	System.out.println("Light on? " + isOn);
	
}

	void turnOff() {
		isOn = false;
		name= "Pedre";
		System.out.println("Light off? " + isOn);
	}
}