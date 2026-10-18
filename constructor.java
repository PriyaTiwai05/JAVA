class Student{
    String name;
    int rollno;
    Student(String n,int r){
        name = n;
        rollno = r;

    }
    void Display(){
        System.out.println("Name :"+ name);
        System.out.println("Roll No :"+ rollno);
    }
}
public class constructor {
    public static  void main(String[] args){
        Student s1 = new Student("Priya", 2451);
        Student s2 = new Student("Khushbu", 2443);
        s1.Display();
        s2.Display();
    }
}
