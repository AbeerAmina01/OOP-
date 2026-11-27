public class Phone extends Product{
       private int StorageGB;


          public Phone(String productId, String brand, double price,int warrantyMonths,String supportPhone, int StorageGB){
          super(productId,brand, price, warrantyMonths,  supportPhone);
          this.StorageGB = StorageGB;
}
  @Override    
           public void displayinfo(){
              super.displayinfo();
              System.out.println("Storage in GB:");
}

}