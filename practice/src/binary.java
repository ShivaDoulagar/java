import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        System.out.println("PROGRAM FOR THE BINARY SEARCH");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The entered elements are ");
        for(int i=0;i<n;i++){
            System.out.print("  "+array[i]);
        }
        System.out.println();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (array[i]<array[j]){
                    int temp;
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("The elements after sorting are");
        for (int i=0;i<n;i++){
            System.out.println("  "+array[i]);
        }
        System.out.println("Enter the key which you want to find");
        int key = sc.nextInt();
        int mid = n/2;
        if(key==array[mid]){
            System.out.println("The number is found");
        }
        else if(key>array[mid]){
            for (int i=mid;i<n;i++){
                if(key==array[i]){
                    System.out.println("The key is found");
                }
            }
        }
        else if(key<array[mid]){
            for (int i=mid;i>n;i--){
                if(key==array[i]){
                    System.out.println("The key is found");
                }
            }
        }
        else {
            System.out.println("The key is not found");
        }
    }
}
