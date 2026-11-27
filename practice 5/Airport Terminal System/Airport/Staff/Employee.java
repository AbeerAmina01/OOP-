package Staff;
public class Employee{
private String employeeId;
private String name;
public Employee(String id, String name){
	employeeId= id;
	this.name= name;
}
public void displayInfo(){
	System.out.println("Employee ID: "+ employeeId);
	System.out.println("Name: "+name);
}
}
