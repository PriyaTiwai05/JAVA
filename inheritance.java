class Animal{
    String name = "Animal";
    void eat(){
        System.out.println("Animal is eating ");
    }
}
class Dog extends  Animal {
    void bark(){
        System.out.println("DOG IS BARKING");
    }
}
public class inheritance {
    public static void main(String[] args) {
       Dog d = new Dog();
   d.eat() ;
   d.bark(); 
    }
   
}
