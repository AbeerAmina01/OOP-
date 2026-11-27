public class Member{
        private String id;
        private Loan currentLoan;
        

		public Member(String id){
                  this.id = id;
                  this.currentLoan = null;
}
                public String getId(){
			return id;
}
		public boolean hasLoan(){
			return currentLoan != null;
}
		public Loan getLoan(){
			return currentLoan;
}
		public void setLoan(Loan loan){
			this.currentLoan= loan;
}

}