package Parking.Core;
public class ParkingPermit{
	private static int nextId = 500;
        protected int permitId;
	private String plateNo;
	private ParkingZone zone;
	private IssueDate issueDate;

		public ParkingPermit(String plateNo, ParkingZone zone, int d, int m, int y){
		this.plateNo = plateNo;
		this.zone = zone;
		issueDate = new IssueDate(d,m,y);
		nextId++;
}
		public int standardFee(){
		 return 1000;
}
		public void printBasic(){
			System.out.println("Plate No.: "+plateNo);
			System.out.println(zone.getLabel());
		        System.out.println("IssueDate: "+ issueDate.format());
}
		public static int getIssuedCount(){
			return nextId;
}
}