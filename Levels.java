package ParkingLot;

import java.util.LinkedList;
import java.util.List;

public class Levels {

	private int levelNo;
	private int rows;
	public List<ParkingSlot> ps;
	public int slots_per_row =2;
	public List<ParkingSlot> takenSlots;
	
	public Levels(int levelNo, int rows)
	{
		this.levelNo = levelNo;
		this.rows = rows;
		this.takenSlots = new LinkedList<>();
	}
	
	public boolean park(Car car)
	{
		ParkingSlot freeSpot = findNextAvailableSlot();
		if(freeSpot==null)
		{
			return false;
		}
		else
		{
			//add slot to taken slot
			takenSlots.add(freeSpot);
			//park the car
			freeSpot.park(car);
			//resturn true
			return true;
		}
		
	}

	private ParkingSlot findNextAvailableSlot() {
		
		//main logic to find available slot
		int totalNoOfSlots = rows * slots_per_row;
		//if all slots are taken for that level
		if(takenSlots.size() >= totalNoOfSlots)
		{
			return null;
		}
		else if(takenSlots.isEmpty()) //If no slots are booked for that level
		{
			return new ParkingSlot(0,0,levelNo);
		}
		else //some empty spaces
		{
			ParkingSlot lastOccupiedSlot = takenSlots.get(takenSlots.size()-1);
			if(lastOccupiedSlot.col < slots_per_row) //if space is remaining in the row
			{
				return new ParkingSlot(lastOccupiedSlot.row, lastOccupiedSlot.col+1,levelNo);
			}
			else //free space in next row
			{
				return new ParkingSlot(lastOccupiedSlot.row+1,0,levelNo);
			}
		}
		
		
	}
}

