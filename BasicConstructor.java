class Student{
    String name;
    int age;
Student(){
    name = "unknown";
    age = 0;
}
void display(){
    System.out.println("NAME: " + name);
    System.out.println("Age: " + age);
}

}
public class BasicConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
    
}
