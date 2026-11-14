class Student{
    void didplay(){
        System.out.println("i am parent");
    }
}
class collagestudent extends Student{
void didplay(){
        System.out.println("i am child");
    }
    void show(){
        didplay();
        super.didplay();
    }
}
public class super_method {
    public static void main(String[] args) {
        collagestudent s = new collagestudent();
        s.show();
    }
}
