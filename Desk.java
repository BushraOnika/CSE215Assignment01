package CSE215TheoryAssignment01;

public class Desk extends Furniture{
    private int height; //Encapsulation
    private int width;//Encapsulation
    //Encapsulation

    public Desk() {
        height=1;
        width=1;
    }

    public Desk(String color, int warranty, int height, int width) {
        super(color, warranty);
        this.height = height;
        this.width = width;
    }

    public int getHeight() { //Accessors

        return height;
    }

    public void setHeight(int height) { // mutators

        this.height = height;
    }

    public int getWidth() { //Accessors

        return width;
    }

    public void setWidth(int width) { // mutators

        this.width = width;
    }
    public Desk printDesk(Desk d){ //Method(s) with Objects as parameters and Objects as return types
        Desk desk = new Desk();
        desk.width = this.getWidth()+d.getWidth();
        desk.height = this.getHeight()+d.getHeight();
        return desk;
    }

    @Override
    public String toString() {
        return "Desk\n"+super.toString()+
                "\nHeight:" + height +
                "\nWidth:" + width +"\n";
    }
}
