package Staff;
public class Pilot extends Employee{
private int flightHours;
public Pilot(String id, String name, int hours){
	super(id,name);
	flightHours= hours;
}
public void displayInfo(){
	super.displayInfo();
	System.out.println("Flight Hours: "+flightHours);
}
}