import java.util.Scanner;
public class sumfinder {
    public static void main(String[] args) {
        System.out.println("program to find the sum from the key");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The entered elements are");
        for (int i=0;i<n;i++){
            System.out.print("    "+array[i]);
        }
        System.out.println("\nEnter the key");
        int key = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==n-1 && n==j && array[i]+array[j]!=key ){
                    System.out.println("The key is not found");
                }
                else if (array[i]+array[j]==key){
                    System.out.println("The key pair is found and they are "+array[i]+" and "+array[j]);
                }
            }
        }
    }
}