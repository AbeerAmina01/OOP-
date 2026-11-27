public class FoodItem{
        private int ItemCode;
        private String name;
        private double price;
        private FoodCategory category;

              public FoodItem(int ItemCode, String name, double price){
                   this(ItemCode, name, price,FoodCategory.MAIN_COURSE);
}
              public  FoodItem(int ItemCode, String name, double price, FoodCategory category){
                   this.ItemCode = ItemCode;
                   this.name = name;
                   this.price = price;
                   this.category = category;

}
             public double getprice(){
                   return price;
}
             public int getItemCode(){
                   return ItemCode;
}
             public String getItemName(){
                   return name;
}
             public void displayItem(){
                  System.out.println("Item Code:"+ItemCode);
                  System.out.println("Name:"+name);
                  System.out.println("Price:"+price);
                  System.out.println("Food Category:"+category);
}
}