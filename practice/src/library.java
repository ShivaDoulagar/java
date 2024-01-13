public class library{
    public static void main(String[] args) {
        lib centLib=new lib();
        centLib.addbook("Shiva the coder");
        System.out.println();
        centLib.addbook("Shiva knows how to code");
        System.out.println();
        centLib.addbook("Printing hello world");
        System.out.println();
        System.out.println();
        centLib.avalablebook();
        System.out.println();
        centLib.issuebook("Shiva the coder");
        System.out.println();
        centLib.issuedbooks();
    }
}

class lib{
    String[] books;
    String[] ret;
    int no_of_books;
    lib(){
        this.books = new String[100];
        this.ret = new String[100];
        no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added into the library");
    }
    void avalablebook(){
        System.out.println("The avalable books are:");
        for(int i=0;i<no_of_books;i++){
            System.out.println(" *"+books[i]);
        }
    }
    void issuebook(String book){
        for (int i=0;i<no_of_books;i++){
            if (books[i]==book){
                System.out.println("The book is issued ");
                books[i]=ret[i];
                books[i]=null;
                break;
            }
            System.out.println("");
        }
    }
    void returnbook(String book){
        for (int i=0;i<no_of_books;i++){
            if (ret[i]==book){
                addbook(book);
                System.out.println("The book has been returned");
                break;
            }
        }
        System.out.println("The book which you are trying is not issued from here");
    }
    void issuedbooks(){
        for (int i=0;i<no_of_books;i++){
            System.out.println("->"+ret[i]);
        }
    }
}