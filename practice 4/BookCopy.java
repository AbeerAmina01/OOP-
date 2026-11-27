public class BookCopy{
        private String copyId;
        private Book book;
        private boolean available;

	public BookCopy(String copyId, Book book){
		this.copyId = copyId;
 		this.book = book;
		this.available = true;
}

		public String getCopyId(){
			return copyId;
}
		public Book getBook(){
			return book;
}

            public boolean isAvailable(){
		return available;
}
	    public boolean tryBorrow(){
		if(!available){
                    return false;
}
                  available = false;
                    return true;
}

}