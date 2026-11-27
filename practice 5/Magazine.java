public class Magazine extends LibraryItem{
	private int issueNumber;
	
		public Magazine(String Id, String title, BarcodeLabel label, int issuenumber){
		super( Id, title, label);
		this.issueNumber = issueNumber;
}
		public void displayMagazine(){
			super.displayItem();
			System.out.println("Issue Number: "+issueNumber);
}
}