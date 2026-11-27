public class StoreMain{
   public static void main(String[] args){

          Phone p1 = new Phone("P101", "Samsung", 80000, 12, "042-1111111", 128);
          Phone p2 = new Phone("P102", "Apple", 250000, 24, "042-2222222", 256);

          Laptop L= new Laptop("P103", "Dell", 180000, 12, "042-3333333", 16);

          SalesAssistant s1 = new SalesAssistant("E101", "Ayesha");
          SalesAssistant s2 = new SalesAssistant("E102", "Bilal");

          StoreBranch branch = new StoreBranch("Lahore Branch");
        branch.addProduct(p1);
        branch.addProduct(p2);
        branch.addProduct(L);

        branch.addAssistant(s1);
        branch.addAssistant(s2);


            branch.addProduct(
            new Phone("P104", "Google", 140000, 12, "042-4444444", 128)
        );

            branch.addProduct(
            new Laptop("P105", "HP", 150000, 12, "042-5555555", 8)
        ); 
        branch.displayInventory();
        branch.displayAssistants();

}
}