package Fleet;
public class Aircraft{
private String aircraftId;
private String model;
private double fuelCapacity;
private MaintenanceLog log;

	public Aircraft(String id, String model, double fuel, int inspections, String phone){
		this.aircraftId=id;
		this.model=model;
		fuelCapacity=fuel;
		log = new Maintenance(inspections,phone);
}

	public void displayInfo(){
	System.out.println("Aircraft ID: "+aircraftId);
	System.out.println("Model: "+model);
	System.out.println("Fuel Capacity:"+fuelCapacity);
	log.displayLog();

}
}