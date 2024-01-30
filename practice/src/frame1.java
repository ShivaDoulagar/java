import java.awt.*;
import java.awt.event.*;
public class frame1 {
    public static void main(String[] args) {
        frame fra = new frame();
        fra.fr();

    }
}

class frame extends close{
    public void fr(){
        Frame f = new Frame("frame");
        f.setSize(500,300 );
        f.setVisible(true);
        f.addWindowListener(new close());
    }
}
class close extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}