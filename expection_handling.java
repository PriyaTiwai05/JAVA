public class expection_handling {
    public static void main(String[] args) {
        int a[]= new int[5];
        System.out.println("hello guys");
        try {
            System.out.println(a[8]);
        } catch (Exception e) {
            System.out.println("Expection");
        }
        System.out.println("BYe guys");
    }
}
