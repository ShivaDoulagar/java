// public class inheritance {
//     public static void main(String[] args) {
//         sounds dog = new sounds();
//         System.out.println(dog.name("Dog"));
//         System.out.println(dog.sound("bhav bhav"));
//     }
// }

// class animal{
//     static String name (String Name){
//         return Name;
//     }
// }

// class sounds extends animal{
//     static String sound(String sound){
//         return sound;
//     }
// }

public class inheritance{
    public static void main(String[] args) {
        derived one = new derived();
        one.setx(56);
        System.out.println(one.getx()); 

    }
}

class base{
    int x;
    public void setx(int x){
        this.x =x;
    }
    public int getx(){
        System.out.println("I am accessing form the derived class");
        return x;
    }
}

class derived extends base{
    int y;
    public void sety(int y){
        this.y=y;
    }
    public int gety(){
        return y;
    }
}