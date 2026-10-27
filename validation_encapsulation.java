class Student {

    private int age;

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}
public class validation_encapsulation {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setAge(20);
    System.out.println(s1.getAge());
    s1.setAge(-5);
  }  
}
