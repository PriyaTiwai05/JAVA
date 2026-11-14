class Student{
    String name;
    Student(String name){
        this.name = name;
    }
}
class collagestudent extends  Student{
    int rollno;
    collagestudent(String name,int rollno){
        super(name);
        this.rollno = rollno;
    }
    void didplay(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
}
public class super_paramaterized_constructor {
    public static void main(String[] args) {
        collagestudent s = new  collagestudent("priya",101);
        s.didplay();
    }
}


