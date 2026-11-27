public class Loan{
     private Member member;
     private BookCopy copy;
     private String startedOn;
     private String dueOn;
     private String status;

		public Loan(Member member, BookCopy copy,
                String startedOn, String dueOn) {
        	this.member = member;
       		this.copy = copy;
        	this.startedOn = startedOn;
        	this.dueOn = dueOn;
        	this.status = "ACTIVE";
    }
    		public Member getMember() {
        		return member;
    }
    		public BookCopy getCopy() {
        		return copy;
    }
    		public String getStartedOn() {
        		return startedOn;
    }
    		public String getDueOn() {
			return dueOn;
    }
		public String getStatus(){
                    return status;
}


}