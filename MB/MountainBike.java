class MountainBike extend Bicycle{
	public int seatHeight;
	
	public MountainBike(int gear,int speed,int startHeight){
		super(gear,speed);
		seatHeight = startHeight;
	}
	public void seatHeight(int newValue){
		seatHeight = newValue;
	}
	@Overrride public String toString(){
		return(super.toString() + "\nseat height is " + seatHeight);
	}
	
}