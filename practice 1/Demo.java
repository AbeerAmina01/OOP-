public class Demo{

      public static void main (String[] args){
        Date d1 = new Date(15, 8, 2026);
        Date d2 = new Date(10, 9, 2026);

     Product p = new Product("Notebook", 250, d1);

    ElectronicProduct ep=new ElectronicProduct("Laptop", 180000, d2, 12);

	ep.displayDetails();

	Laptop laptop=new Laptop("Laptop", 180000, new Date(10, 9, 2026), 12, 16);

	laptop.displayDetails();
    }
}

