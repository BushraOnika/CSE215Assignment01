package CSE215TheoryAssignment01;

public class StudentDesk extends Furniture{
    //Aggression relationship
    private int drawers;
    private int selves;
    private Desk desks;

    public StudentDesk() {
    }

    public StudentDesk(int drawers, int selves, Desk desks) {
        this.drawers = drawers;
        this.selves = selves;
        this.desks = desks;
    }

    public StudentDesk(String color, int warranty, int drawers, int selves, Desk desks) {
        super(color, warranty);
        this.drawers = drawers;
        this.selves = selves;
        this.desks = desks;
    }

    @Override
    public String toString() {
        return "For Student desk"+
                "\nDrawers=" + drawers +
                "\nselves=" + selves +
                "\nStudent Desk has a " + desks;
    }
}
