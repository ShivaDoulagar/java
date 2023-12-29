import java.util.Scanner;
public class sum_array {
    public static void main(String[] args) {
        System.out.println("program to find the sum of elements of array");
        System.out.println("Enter the number of elements which you want ot enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.print("The sum of elements of array are is ");
        int sum = 0;
        for( int i=0;i<n;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
