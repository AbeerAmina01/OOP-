public class Inventory{
         private Product[] products;
         private int count=0;
         private static final int MAX_SIZE = 10;   

            public Inventory(){
	products=new Product[MAX_SIZE];
}
public boolean add(Product P){
	if(count<MAX_SIZE){
	products[count]=P;
	count++;
	return true;
	}
	System.out.println("Slots Filled!");
	return false;
}
public Product findById(String id){
	for(int i=0; i<count;i++){
		if(id==products[i].getId()){
			return products[i];
		}
	}
	System.out.println("Not Found");
	return null;
}
public void displayAll(){
	System.out.println("Inventory # 01");
	for(int i=0; i<count;i++){
		products[i].displayDetails();
	}
}
}