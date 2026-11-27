package Fleet;
public MaintenanceLog{
private int inspectionCount;
private String engineerPhone;
public MaintenanceLog(int count, String phone){
	inspectionCount= count;
	engineerPhone= phone;
} 
public void displayLog(){
	System.out.println("Inspection Count: "+inspectionCount);
	System.out.println("Engineer Contact no: "+engineerPhone);
}
}