public class overriding{
    public static void main(String[] args) {
        // A car = new A();
        // car.meth1();
        // B game = new B();
        // game.meth2();
        B car = new B();
        car.meth1();
        car.meth2();
        car.meth3();
    }
}
class A{
    public void meth1(){
        System.out.println("supra");
    }
    public void meth2(){
        System.out.println("GTR");
    }
}
class B extends A{
    public void meth3(){
        System.out.println("Valorent");
    }
}