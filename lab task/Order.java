public class Order{
    private int orderNo;
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

     public Order (int orderNo, Customer customer){
       this(orderNo, customer, 5);
}
     public Order(int orderNo, Customer customer, int itemCount){
       this.orderNo = orderNo;
       this.customer = customer;
       items = new OrderItem[itemCount];
       itemCount = 0;
}
   public void addItem(FoodItem item, int quantity) {
    if(quantity <= 0){
         System.out.println("Quantity must be positive");
       return;
}
   if(itemCount >= items.length){
      System.out.println("Order is full");
}
  items[itemCount] = new OrderItem(item, quantity);
    itemCount++;
}
   public void  findItem(int itemCode){
     for(int i = 0; i<itemCount; i++){
        if (items[i]!= null && items[i].getItemCode()== itemCode){
      System.out.println("Item Found:"+ items[i].getName()+  "| Quantity:"+ items[i].getQuantity());
      return;
}
}
    System.out.println("Item not found");
}
    public double calculateTotal(){
      double total = 0;
        for(int i = 0; i<itemCount; i ++){
           total += items[i].getSubTotal();
}
        return total;
}
   public void displayOrder(){
             System.out.println("============================================");
        System.out.println("             CAFETERIA ORDER");
        System.out.println("============================================");

        System.out.println("Order No: " + orderNo);
        customer.display();

        System.out.println("--------------------------------------------");

        System.out.printf("%-20s %3s %8s %10s%n",
                "Item", "Qty", "Price", "Subtotal");

        for (int i = 0; i < itemCount; i++) {
            items[i].displayOrderItem();
        }

        System.out.println("--------------------------------------------");

        System.out.printf("Total Bill: Rs. %.2f%n", calculateTotal());
    }

}