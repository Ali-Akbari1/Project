package CarDealership;

public class Car extends Vehicle {
	
	
	private int fc;
	private int fh;
	private int s;
	private double c;

	public Car(int fECity, int fEHwy, int seating, double cargo) {
		super(fECity, fEHwy, seating, cargo);
		
		fc = fECity;
		fh = fEHwy;
		s = seating;
		c = cargo;
		
	}

	String cargoContainer() {
		return("Cargo Volume of the Car is: "+ super.getCargoVolume() + "Cubic Feet");
	}

	@Override
	String description() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String toString() 
	{
		String c1 = String.valueOf(c);
		return(fc + fh + s + c1);

	}
}
