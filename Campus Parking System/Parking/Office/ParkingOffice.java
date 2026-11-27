package Parking.Office;
import Parking.Core.IssueDate;
import Parking.Core.ParkingPermit;
import Parking.Core.ParkingZone;

public class ParkingOffice{
	private ParkingZone[] zones;
	private int count=0;

		public ParkingOffice(){
			this(3);
}
		public ParkingOffice(int capacity){
			zones = new ParkingZone[capacity];
			
}
		public void addZone(ParkingZone z){
			 if(count<zones.length){
				zones[count]=z;
				count++;
}
}
		public ParkingZone getZone(int index){
				return zones[index];				
}
		public void printZones(){
			for(int i =0; i<zones.length; i++){
			System.out.println(zones[i].getLabel());
}	
}
}