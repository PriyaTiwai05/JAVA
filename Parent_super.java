class student{
    String name = "parent class";
}
class collagestudent extends student{
    String name = "child class";
    void Display(){
        System.out.println(name);
        System.out.println(super.name);//parent class
    }
}

public class Parent_super {
    public static void main(String[] args) {
        collagestudent s = new collagestudent();
        s.Display();
    }
}
