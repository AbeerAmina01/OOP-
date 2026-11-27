public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("M01");
        Member member2 = new Member("M02");
        Book book = new Book("Java Basics");
        BookCopy copy = new BookCopy("COPY-01", book);
        LibraryDesk desk = new LibraryDesk();
        // Scenario 1: successful borrowing.
        showState("BEFORE borrowing", member1, copy);
        Loan result = desk.borrow(
            member1, copy, "2026-10-03", "2026-10-10"
        );
        if (result != null) {
            System.out.println("Request: SUCCESS");
            System.out.println(
                "Borrower: " + result.getMember().getId()
            );
            System.out.println(
                "Book: " + result.getCopy().getBook().getTitle()
            );
            System.out.println("Due date: " + result.getDueOn());
        } else {
            System.out.println("Request: REJECTED");
        }
        showState("AFTER borrowing", member1, copy);
  // Scenario 2: another member requests this copy.
        Loan secondResult = desk.borrow(
            member2, copy, "2026-10-03", "2026-10-10"
        );
        System.out.println();
        System.out.println(
            "Second member rejected: " + (secondResult == null)
        );
        showState("AFTER rejected request", member2, copy);
        // Scenario 3: member1 already has a current loan.
        BookCopy anotherCopy = new BookCopy("COPY-02", book);
        Loan thirdResult = desk.borrow(
            member1, anotherCopy, "2026-10-03", "2026-10-10"
        );
        System.out.println();
        System.out.println(
            "Existing borrower rejected: " + (thirdResult == null)
        );
        System.out.println(
            "COPY-02 remains available: " + anotherCopy.isAvailable()
        );
    }
    private static void showState(String heading,
                                  Member member,
                                  BookCopy copy) {
        System.out.println();
        System.out.println(heading);
        System.out.println("Member: " + member.getId());
        System.out.println("Copy: " + copy.getCopyId());
        System.out.println("Available: " + copy.isAvailable());
        Loan current = member.getLoan();
        if (current == null) {
            System.out.println("Current loan: null");
        } else {
            System.out.println("Current loan: " + current.getStatus());
        }
    }
}