public class sumoffirst {
    static int sum(int a){
        if (a==0){
            return 0;
        }
        else if (a==1){
            return 1;
        }
        else {
            return a + sum(a-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("program to find the sum of first n natural numbers using recursion");
        System.out.println("the sum of 5 is "+sum(5));
        System.out.println("the sum of 0 is "+sum(0));
    }
}