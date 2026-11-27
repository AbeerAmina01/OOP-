public class Vehicle{
	private String brand;
	private int servicePriority;

		public Vehicle(String brand, int servicePriority){
			this.brand = brand;
			this.servicePriority=servicePriority;
}
		public String getBrand(){
			return brand;
}
		public int servicePriority(){
			return servicePriority;
}
		public int compareTo(Vehicle other){}
}