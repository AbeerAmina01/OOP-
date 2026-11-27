public class Order{
         private int orderNo;
         private Customer customer;
         private OrderItem[] items;
         private int ItemCount=0;

               public Order(int orderNo, Customer customer ){
                    this(orderNo, customer, 5);
		}
               public Order(int orderNo, Customer customer, int ItemCount){
                    this.orderNo = orderNo;
                    this.customer = customer;
                    items = new OrderItem[ItemCount];
		}
               public void addItem(FoodItem item,int quantity){
			 if(quantity<=0){
                          System.out.println("Negative entry");
               		 }
			if(ItemCount >= items.length){
                          System.out.println("Capacity full");
			  return;
			}
			items[i] = new OrderItem(item, quantity);
                   	 ItemCount++;
                       
      			}
		}
              public void findItem(int ItemCode){
                     for(int i =0; i<ItemCount; i++){
                       if(items[i].getItemCode()==ItemCode){
                          System.out.println("Item Found:"+items[i].getItemName()+"| Quantity:"+items[i].getquantity());
                         }
                  }                    
		}
               public double calculateTotal(){
                      double total =0;
                      for(int i=0; i<items.length; i++){
                        total +=items[i].getSubTotal();
			}
			return total;        
		}
	public void displayOrder(){
             System.out.println("============================================");
        System.out.println("             CAFETERIA ORDER");
        System.out.println("============================================");

        System.out.println("Order No: " + orderNo);
        customer.displayCustomer();

        System.out.println("--------------------------------------------");

        System.out.printf("%-20s %3s %8s %10s%n",
                "Item", "Qty", "Price", "Subtotal");

        for (int i = 0; i < ItemCount; i++) {
            items[i].displayOrderItem();
        }

        System.out.println("--------------------------------------------");

        System.out.printf("Total Bill: Rs. %.2f%n", calculateTotal());
 }  

}