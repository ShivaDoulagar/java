public class access_modifiers{
    public static void main(String[] args) {
        student shiva = new student();
        shiva.setname("Shiva");
        shiva.setrollno(69);
        shiva.setdob(2004);
        System.out.println("The name of the student is "+shiva.getname());
        System.out.println("The year of the birth of "+shiva.getname()+" is "+shiva.getdob());
        System.out.println("The rollNo of "+shiva.getname()+" is "+shiva.getrollno());
    }
}
class student{
    private String name;
    private int dob;
    private int rollno;
    public void setname(String a){
        this.name=a;
    }
    public String getname(){
        return name;
    }
    public void setdob(int n){
        this.dob = n;
    }
    public int getdob(){
        return dob;
    }
    public void setrollno(int m){
        this.rollno = m;
    }
    public int getrollno(){
        return rollno;   
    }
}