public class LibraryItem{
	private String itemId;
	private String title;
	private BarcodeLabel label;

		public LibraryItem(String Id, String title, BarcodeLabel label){
			this.itemId = Id;
			this.title = title;
			this.label = label;
}
		public void displayItem(){
			System.out.println("Item ID: "+itemId);
			System.out.println("Title: "+title);
			label.displayLabel();
}
}