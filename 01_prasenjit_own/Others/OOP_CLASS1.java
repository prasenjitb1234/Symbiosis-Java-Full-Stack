class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something.");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}
// second example with student class

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOP_CLASS1 {
    public static void main(String args[]){

//        example 1 Pen example
//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "Gel";
//
//        pen1.write();
//
//        Pen pen2 = new Pen();
//
//        pen2.color = "black";
//        pen2.type = "ballpoint";
//
//
//        pen1.printColor();
//        pen2.printColor();
//        example 1 Pen example   ends


//        example 2 starts

        Student s1  = new Student();
        s1.name = "Prasenjit";
        s1.age = 20;

        s1.printInfo();









    }
}
