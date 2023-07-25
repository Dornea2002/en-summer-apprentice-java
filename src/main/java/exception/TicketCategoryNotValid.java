package exception;

public class TicketCategoryNotValid extends RuntimeException{
    public TicketCategoryNotValid() {
    }
    private String message;

    public TicketCategoryNotValid(String message) {
        super(message);
        this.message = message;
    }
}
