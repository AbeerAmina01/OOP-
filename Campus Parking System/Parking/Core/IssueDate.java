package Parking.Core;
public class IssueDate{
	private int day;
	private int month;
	private int year;
		
		public IssueDate(int d, int m, int y){
			this.day = d;
			this.month = m;
			this.year = y;
}
		public String format(){
			String date= String.format("%2d/%2d/%4",day,month,year);
			return date;
}
}