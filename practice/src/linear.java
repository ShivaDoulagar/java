import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        System.out.println("Program for linear Search");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to Enter");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the key which you want to verify");
        int key = sc.nextInt();
        for (int i=0;i<n;i++){
            if (array[i]==key){
                System.out.println("The key is found");
            }
        }
        if (array[n-1]!=key){
            System.out.println("The key is not present in the given elements");   
        }
    }
}
