public class Laptop extends Product{
       private int ramGB;
       
         public Laptop(String productId, String brand, double price,int warrantyMonths,String supportPhone, int ramGB){
         super(productId,brand, price, warrantyMonths,  supportPhone);
         this.ramGB = ramGB;
}

@Override
          public void displayinfo(){
              super.displayinfo();
             System.out.println(" Ram in GB:"+ramGB);
}

}