public class constructors {
    public static void main(String[] args) {
        // mum d = new mum(2,5);
        shiva sh = new shiva(1,2,3);
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
        //super(0);        //if we pass using super key word then the dad's class overloaded methord will be called
        System.out.println("I am from mum's class");
    }
    mum(int a ,int b){
        super(a);
        System.out.println("I am the derived overloaded constructor with value: "+b);
    }
}
class shiva extends mum{
    shiva(){
        System.out.println("I am constructor from the shiva's class");
    }
    shiva(int a,int b,int c){
        super (a,b);
        System.out.println("I am the constructor from the shiva's class holding value of "+c);
    }
}
