public class Book extends LibraryItem{
	private String author;
	
		public Book(String Id, String title, BarcodeLabel label,String author){
		super( Id, title, label);
		this.author = author;
}
		public void displayBook(){
			super.displayItem();
 			System.out.println("Author Name: "+author);
}
}