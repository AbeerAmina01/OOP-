public class OrderItem{
          private FoodItem item;
          private int quantity;

              public OrderItem(FoodItem item, int quantity){
                  this.item = item;
                  this.quantity = quantity;
}
             public double getSubTotal(){
                  return item.getprice()*quantity;
              
}
             public int getquantity(){
                  return quantity;
}
            public int getItemCode(){
                   return item.getItemCode();
}
             public String getItemName(){
                   return item.getItemName();
}

             public void displayOrderItem(){
                  System.out.println("Food Item:"+item);
                  System.out.println("Quantity:"+quantity);
}

}