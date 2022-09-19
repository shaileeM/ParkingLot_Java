package ParkingLot;

public class ParkingSlot {
	public int row;
	public int col;
	public int level;
	public Car carOccupyingSlot;
	
	public ParkingSlot(int row, int col,int level)
	{
		this.level = level;
		this.row = row;
		this.col = col;
	}
	public void park(Car c)
	{
		carOccupyingSlot =c;
	}
}
