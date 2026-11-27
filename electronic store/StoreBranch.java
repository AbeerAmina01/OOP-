public class StoreBranch{
       private String branchName;
       private Product[] products = new Product[4];
       private SalesAssistant[] assistants = new SalesAssistant[2];
       private int productcount =0;
       private int assistantcount =0;

          public StoreBranch(String branchName){
              this.branchName = branchName;
}

           public void addProduct(Product product){
                if(productcount < products.length){
                    products[productcount] = product;
                      productcount++;

}
   else {
         System.out.println("Product capacity is full");
}
  }         
           public void addAssistant(SalesAssistant assistant ){
                 if(assistantcount < assistants.length ){
                assistants[assistantcount]= assistant;
                      assistantcount ++;
} else{
         System.out.println("Assistant capacity is full");

}
}
           public void displayInventory(){
                 System.out.println("Products at "+branchName+ ":");
               for (int i = 0; i <productcount; i ++){
           products[i].displayinfo();

}
}
           public void displayAssistants(){
System.out.println("Assistants at"+branchName +": ");
         for(int i = 0; i <assistantcount; i++){
             assistants[i].displayinfo();
}
                  
}
}