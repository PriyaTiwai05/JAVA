 class simple {
    String name;
    int age;
void display(){
    System.out.println("name " + name);
    System.out.println("age " + age);
}
}
public class simpleclass{
    public static void  main(String[] args){
     simple s1 = new simple();
     s1.name = "A";
     s1.age = 20;
     s1.display();
    }
}

