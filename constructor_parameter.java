class student{
    String name;
    int age;
    student(String n,int a){
       name = n;
       age = a;
    }
    void display(){
        System.out.println("name " + name);
        System.out.println("age " + age);
    }
}
public class constructor_parameter {
    public static void main(String[] args) {
        student s1 = new student("priya", 20);
        s1.display();
    }
}
