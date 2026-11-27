public class SalesAssistant{
          private String employeeId;
          private String name;

             public SalesAssistant(String employeeId, String name){
                 this.employeeId = employeeId;
                 this.name = name;

}


              public void displayinfo(){
                  System.out.println("Employee Id: "+employeeId);
                  System.out.println("Employee Name:"+name);

}  

}