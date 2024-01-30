public class default_methords {
    public static void main(String[] args) {
        school shiva = new school();
        shiva.classB();
        shiva.classC();
    }
}

interface kindergarden{
    void classA();
    void classB();
    default void classC(){ 
        System.out.println("I am from class C");
    }
}

class lower_School{
    void class1(){
        System.out.println("I am student form 1st class");
    }
    void class2(){
        System.out.println("I am Student form class 2 ");
    }
}

class school extends lower_School implements kindergarden{
    public void classA(){
        System.out.println("I am from class A");
    }
    public void classB(){
        System.out.println("I am form class B");
    }
    public void classC(){
        System.out.println("Hey! i am form class C and you?");
    }
}
