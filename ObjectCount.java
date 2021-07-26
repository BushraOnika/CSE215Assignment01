package CSE215TheoryAssignment01;
class CountObject{
    static int count=0;

    public CountObject() {
        count++;
    }
}
public class ObjectCount {
    public static void main(String[] args) {
     CountObject c1 = new CountObject();
     CountObject c2 = new CountObject();
     CountObject c3 = new CountObject();
        System.out.println("Number of objects  are : "+CountObject.count);
    }
}
