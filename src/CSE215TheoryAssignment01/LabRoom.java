package CSE215TheoryAssignment01;

import java.util.Scanner;

public class LabRoom {
    int chair , table , computer;

    public LabRoom(int chair, int table, int computer) {
        this.chair = chair;
        this.table = table;
        this.computer = computer;
    }

    public LabRoom(int chair, int table) {
        this.chair = chair;
        this.table = table;
    }

    public LabRoom(int chair) {
        this.chair = chair;
    }
    public void add(int c,int t,int pc){
        chair = chair+c;
        table+=t;
        computer+=pc;
        System.out.println("Chairs number : "+chair);
        System.out.println("Tables number : "+table);
        System.out.println("Computers number : "+computer);

    }
    public void remove(int c,int t,int pc){
        chair -= c;
        table -= t;
        computer -= pc;
        System.out.println("Chairs number : "+chair);
        System.out.println("Tables number : "+table);
        System.out.println("Computers number : "+computer);

    }

    public void add(){
        int c,t,pc;
        Scanner sc = new Scanner(System.in);
        System.out.println("chairs");
        c=sc.nextInt();
        System.out.println("tables");
        t=sc.nextInt();
        System.out.println("computers");
        pc=sc.nextInt();
        chair = chair+c;
        table+=t;
        computer+=pc;
        System.out.println("Chairs number : "+chair);
        System.out.println("Tables number : "+table);
        System.out.println("Computers number : "+computer);

    }
    public void remove(){
        int c,t,pc;
        Scanner sc = new Scanner(System.in);
        c=sc.nextInt();
        t=sc.nextInt();
        pc=sc.nextInt();
        chair = chair-c;
        table-=t;
        computer-=pc;
        System.out.println("Chairs number : "+chair);
        System.out.println("Tables number : "+table);
        System.out.println("Computers number : "+computer);

    }


}
class Room {
    public static void main(String[] args) {
        LabRoom lab = new LabRoom(5, 10, 8);
        LabRoom lab2 = new LabRoom(3);
        System.out.println("1st lab");
        lab.add();
        System.out.println("1st lab add");
        lab.add(2, 3, 4);
        System.out.println("2nd lab add");
        lab2.add();
        System.out.println("2nd lab add");
        lab2.add(6,2,3);
        System.out.println("1st lab remove");
        lab.remove();
        System.out.println("1st lab remove");
        lab.remove(2,3,4);
        System.out.println("2nd lab remove");
        lab2.remove(2,3,4);
        System.out.println("2nd lab remove");
        lab2.remove();

    }
}
