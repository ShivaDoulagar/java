import java.util.Scanner;
public class multiplication {
    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d *%d =%d\n",n,i,n*i);
        }
    }
    static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void down(int n){
        for (int i=n;i>=0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fabi(int n){
        if (n==1 ||n==2 ){
            return n-1;
        }
        else {
            return fabi(n-1)+fabi(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program to print multiplication table");
        System.out.println("Enter the number");
        int a = sc.nextInt();
        mul(a);
        pattern(a);
        System.out.println();
        down(a);
        System.out.println(fabi(a));
    }
}
