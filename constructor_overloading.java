class student{
    String name;
    int age;
    student(){
name = "unkown";
age = 0;
    }
    student(String name){
this.name = name;
age = 0;
    }
student(String name,int age){
    this.name=name;
    this.age = age;
}
void display(){
    System.out.println( name + " " + age) ;
}
}
public class constructor_overloading {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Priya");
        student s3 = new student("khushbu",20);

        s1.display();
        s2.display();
        s3.display();

    }
}
