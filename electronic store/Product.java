public class Product{
     private String productId;
     private String brand;
     private double price;
     private WarrantyCard warranty;

         public Product(String productId, String brand, double price, int warrantyMonths,String supportPhone){
          this.productId =productId;
          this.brand =brand;
          this.price =price;
          this.warranty = new WarrantyCard(warrantyMonths , supportPhone);

}


          public void displayinfo(){
          System.out.println("Product Id: "+productId);      
          System.out.println("Product Brand: "+brand);      
          System.out.println("Product Price: "+price);      
          warranty.displayinfo();
}


}