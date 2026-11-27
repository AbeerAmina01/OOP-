public class WarrantyCard{
        private int WarrantyMonths;
        private String supportPhone;

         public WarrantyCard(int WarrantyMonths, String supportPhone){
              this.WarrantyMonths = WarrantyMonths;
              this.supportPhone = supportPhone;


}
        public void displayinfo(){
            System.out.println("Warranty:"+WarrantyMonths);
            System.out.println("Support:"+supportPhone);

}



}