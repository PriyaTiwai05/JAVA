class student{
    private String  name;
    private int age;

    public void setName(String name){
        this.name = name;
    
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    
    }
    public int getAge(){
        return age;
    }


}

public class encapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("PRIYA");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
