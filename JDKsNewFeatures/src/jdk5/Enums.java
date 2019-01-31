package jdk5;

public class Enums {

	// Class showing usage and capabilities/restrictions of enums

	// Enums can be part of class as standard member variables
	public enum ERR_LVS { INFO, DEBUG, WARN, ERROR, FATAL} // ; is optional

	public static void main(String[] args) {
		
		//forech with enums
		for(WeatherSeasons ws: WeatherSeasons.values())  //values() predifined method giving array of values
		{
			System.out.println("In "+ ws.name() + " is avarage " + ws.getAvgTemp() + " cel. degreases");
		}
		
		
		
		System.out.println("----------------------------------------------------------");
		
		
		//swith with enums
		WeatherSeasons winter = WeatherSeasons.WINTER;
		winter.setAvgTemp(-15);
		
		switch (winter)
		{
			case SUMMER:
				System.out.println("We have summer outsiude with " + winter.getAvgTemp() + " cel. degreases");	
			break;
			case WINTER:
				System.out.println("Brr, We have winter outsiude with " + winter.getAvgTemp() + " cel. degreases");	
			break;
			default:
				System.out.println(" Other seasons");
		
		}
		

	}

	// private enum EnumExts extends ERR_LVS {}; //cannot extend any class because it internally extends Enum class
	private enum InterfEnum implements Cloneable {}; // enum may implement many interfaces

}

// enums should be threat similar to classes
enum WeatherSeasons {

	WINTER(-1), SPRING(20), SUMMER(27), FALL(14);

	private int avgTemp; // Can have internal variables

	WeatherSeasons(int aAvgTemp) // Can have custom constructor
	{
		this.avgTemp = aAvgTemp;
	}

	public int getAvgTemp() // can have public methods
	{
		return avgTemp;
	}

	public void setAvgTemp(int aAvgTemp) // can have public methods
	{
		this.avgTemp = aAvgTemp;
	}
}