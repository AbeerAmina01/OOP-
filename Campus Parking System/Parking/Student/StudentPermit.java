package Parking.Student;
import Parking.Core.IssueDate;
import Parking.Core.ParkingPermit;
import Parking.Core.ParkingZone;

public class StudentPermit extends ParkingPermit {
	protected String department;
	
		public StudentPermit(String plateNo, ParkingZone zone, int d, int m, int y, String dept){
		super( plateNo,zone, d, m,  y);
		this.department = dept;
}
		public int StudentFee(){
			return 600;
}
 		public void printStudent(){
			super.printBasic();
			System.out.println("Department: "+department);
}
}