public class dynamic_methord {
    public static void main(String[] args) {
        vehicle me = new air();
        me.car();
    }
}

class vehicle{
    public void car(){
        System.out.println("I am a car.....");
    }
    public void bike(){
        System.out.println("I am a bike......");
    }
}

class air extends vehicle{
    public void car(){
        System.out.println("I am a Plane.....");
    }
}
