public class LibrarySection{
	private String sectionName;
	private LibraryItem[] items;
	private int count;

		public LibrarySection(String sectionName, LibraryItem[] items, int count){
			this.sectionName = sectionName;
			items = new LibraryItem[4];
			this.count = count;
}
		public void displaySection(){
			System.out.println("Section Name: "+sectionName);
			for(int i =0; i<items.length; i++){
			items[i].displayItem();
}
}
}