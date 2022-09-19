package ParkingLot;

import java.util.List;

public class ParkingLot {
	
	private Car c;
	public List<Levels> listOfLevels;
	
	public ParkingLot(List<Levels> l)
	{
		this.listOfLevels = l;
	}
	//find parking in all the levels
	public boolean park(Car c)
	{
		this.c = c;
		for(Levels eachLevel : listOfLevels)
		{
			if(eachLevel.park(c))
			{
				return true;
			}
			else
			{
				continue;
			}
		}
		return false;
	}

}
