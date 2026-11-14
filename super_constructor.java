class Animal{
    Animal(){
        System.out.println("animal class");
    }
}
class Dog extends  Animal{
    Dog(){
        super();
        System.out.println("Dog class");
    }
}
public class super_constructor {
    public static void main(String[] args) {
        Dog D = new Dog();

    }
}

