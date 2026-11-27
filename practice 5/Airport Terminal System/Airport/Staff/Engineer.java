package Staff;
public class Engineer extends Employee{
private String specialization;
public Engineer(String id, String name, String specialize){
	super(id,name);
	specialization= specialize;
}
public void displayInfo(){
	super.displayInfo();
	System.out.println("Specialization: "+specialization);
}
}