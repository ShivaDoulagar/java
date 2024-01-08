public class overriding{
    public static void main(String[] args) {
        B b = new B();
        b.meth2();
    }
}

class A{
    public void meth1(){
        System.out.println("I am methord 1 of class A ");
    }
    public void meth2(){
        System.out.println("I am methord 2 from the class A");
    }
}
class B{
    // @Override
    public void meth2(){
        System.out.println("I am methord 2 from class B ");
    }
}