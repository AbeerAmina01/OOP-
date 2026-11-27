public class OrderItem{
   private FoodItem item;
   private int quantity;

   public OrderItem(FoodItem item, int quantity){
      this.item = item;
      this.quantity = quantity;
}
  public double getSubTotal(){
    return item.getPrice () * quantity;
}
public int getItemCode() {
 return item.getItemCode();
 }
 public String getName() {
 return item.getName();
 }
 public int getQuantity() {
 return quantity;
 }
   public void displayOrderItem(){
      System.out.printf("%-20s %3d %8.2f %10.2f%n", item.getName(), quantity, item.getPrice(), getSubTotal());

}
}