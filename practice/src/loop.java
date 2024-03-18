public class loop{
    public static void main(String[] args) {
        String name = "hello world";
        char[] na=name.toCharArray();
        String result="";
        for(int i=0;i<na.length;i++){
            for(char a='a';a<='z';a++){
                if(na[i]==a){
                    result+=a;
                    System.out.println(result);
                }
                
            }
        }
        
    }
}
