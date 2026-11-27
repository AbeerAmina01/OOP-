package Parking.Student;
import Parking.Core.IssueDate;
import Parking.Core.ParkingPermit;
import Parking.Core.ParkingZone;

public class ReservedStudentPermit extends StudentPermit{
	        private int slotNo;

		public ReservedStudentPermit(String plateNo, ParkingZone zone, int d, int m, int y, String dept, int slot){
		super(plateNo,zone, d, m, y, dept);
		this.slotNo = slot;
}
		public int reservedFee(){
			int reservedFee= super.StudentFee()+200;
			return reservedFee;
}
		public void printReserved(){
			super.printStudent();
			System.out.println("Slot NO:"+slotNo);

}
		public int check(){						
			int check=(permitId +slotNo)%10;
				return check;
}
		public String VerificationCode(){
			String code= String.format(department+"-"+permitId+"-"+"S" +slotNo+check());
			return code;
			
}
}