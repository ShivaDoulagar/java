// // public class varargs {
// //     static int sum(int ...arr){
// //     int result = 0;
// //     for (int a: arr){
// //         result += a;
// //     }
// //     return result;
// // }
// //     public static void main(String[] args) {
// //         System.out.println("The sum of 3 and 5 is :"+ sum(3,5));
// //     }
// // }

// public class varargs{
//     public static void main(String[] args) {
//         A add = new A();
//         System.out.println("The sum of the 3 and 5 is "+ add.sum(3,5));
//         System.out.println("The sum of 4 , 4 ,5 is "+ add.sum(4,4,5));
//         System.out.println("The sum of empty is "+ add.sum());
//     }
// }

// class A{
//     static int sum(int ...array){
//         int result =0;
//         for (int a :array){
//             result += a;
//         }
//         return result;
//     }
// }



// public class varargs{
//     public static void main(String[] args) {
//         A add = new A();
//         System.out.println("the sum of 3 and 8 is "+ add.sum(3,8));
//         System.out.println("the sum of 3 ,8 and 4 is "+ add.sum(3,8,4));
//         System.out.println("the sum of 3 ,8,5 and 4 is "+ add.sum(3,8,4,5));
//     }
// }
// class A{
//     static int sum(int ...array){
//         int result = 0;
//         for (int a :array){
//             result += a;
//         }
//         return result;
//     }
// }




public class varargs{
    public static void main(String[] args) {
        System.out.println("Program for varargs");
        A add = new A();
        System.out.println("The sum of 2 50 and 48 is "+add.sum(2,48,50));
    }
}
class A{
    int sum(int ...array){
        int result =0;
        for (int a :array){
            result +=a;
        }
        return result;
    }
}