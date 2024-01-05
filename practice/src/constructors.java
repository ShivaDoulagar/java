public class constructors {
    public static void main(String[] args) {
        mum d = new mum();
    }
}

class dad{
    dad(){
        System.out.println("I am form dad's class");
    }
    dad(int a){
        System.out.println("I am a overloaded constructor with value: "+a);
    }
}
class mum extends dad{
    mum(){
        super(0);//if we pass using super key word then the dad's class overloaded methord will be called
        System.out.println("I am from mum's class");
    }
}
