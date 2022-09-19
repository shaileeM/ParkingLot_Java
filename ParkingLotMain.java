package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotMain {

	public static void main(String[] args)
	{
		Levels l1 = new Levels(0,2);
		Levels l2 = new Levels(1,2);
		List<Levels> listOfLevels = new ArrayList<Levels>();
		listOfLevels.add(l2);
		listOfLevels.add(l2);
		
		ParkingLot parkingLot = new ParkingLot(listOfLevels);
		
		System.out.println(parkingLot.park(new Car("L123")));
		System.out.println(parkingLot.park(new Car("L124")));
		System.out.println(parkingLot.park(new Car("L125")));
		System.out.println(parkingLot.park(new Car("L126")));
		System.out.println(parkingLot.park(new Car("L127")));
		
	}
	

}
