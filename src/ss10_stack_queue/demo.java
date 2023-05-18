package ss10_stack_queue;

public class demo {
    public static void main(String[] args) {
       int[] a = {1,2,3,3};
      int b = a.length / 2;
      int c = 0;
      int d = a.length -1;
        System.out.println(b);
        for (int i = 0; i < b; i++) {
            c += a[i];
        }
        if (c == d){
            System.out.println("mang dep");
        } else {
            System.out.println("mang xau");
        }
    }
}
