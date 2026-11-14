public class finally_block_expection {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("hello world");
        try{
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("exception handling");
        }finally{
            System.out.println("i will run always ");
        }
System.out.println("Bye guys");
    }
}
