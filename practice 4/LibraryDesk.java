public class LibraryDesk{
      
		public Loan borrow(Member member, BookCopy copy,
                       String startedOn, String dueOn){
			if(member.hasLoan()){
				return null;
                        }
                boolean accepted = copy.tryBorrow();
                    if(!accepted){
                         return null;
                        }
                 Loan loan = new Loan(member,copy,startedOn, dueOn);

    		 member.setLoan(loan);     
               
 		return loan;
}

}