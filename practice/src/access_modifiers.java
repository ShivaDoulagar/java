public class access_modifiers {
    public static void main(String[] args) {
        cse shiva = new cse();
        shiva.setname("shiva");
        shiva.setrollNo(69);
        shiva.setdobyear(2004);
        System.out.println(shiva.getname());
        System.out.println(shiva.getrollNo());
        System.out.println(shiva.getdobyear());
    }
}

class cse{
    private String name;
    private int dobyear;
    public int rollNo;
    public void setname(String n){
        this.name = n;
    }
    public String getname(){
        return name;
    }
    public void setdobyear(int n){
        this.dobyear=n;
    }
    public int getdobyear(){
        return dobyear;
    }
    public void setrollNo(int a){
        this.rollNo = a;
    }
    public int getrollNo(){
        return rollNo;
    }
}