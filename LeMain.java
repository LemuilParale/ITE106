public class LeMain{
	public static void main(String[]args){
	LemLamp led = new LemLamp();
	LemLamp halogen = new LemLamp();
	LemLamp Flourescent = new LemLamp();
	LemLamp Incandescent = new LemLamp();

	
	led.name = args[0];
	halogen.name = args[2];
	Flourescent.name = args[0];
	Incandescent.name = args[2];
	
	System.out.println(led.name);
	System.out.println(halogen.name);
	System.out.println(Flourescent.name);
	System.out.println(Incandescent.name);
	
	led.turnOn() ;

	halogen.turnOff();
	halogen.isOn = Boolean.parseBoolean(args[1]);
	
	Flourescent.isOn =Boolean.parseBoolean (args[3]);
	Flourescent.turnOn();
	
	Incandescent.isOn = Boolean.parseBoolean(args[1]);
	Incandescent.turnOff();
	}
}