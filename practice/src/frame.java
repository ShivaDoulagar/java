import java.awt.*;
import java.awt.event.*;

public class frame {
    public static void main(String[] args) {
        Frame f = new Frame("Durga printers");
        Label login,pass;
        login = new Label("login");
        login.setBounds(50,75,100,30);
        pass = new Label("Password");
        pass.setBounds(50,125,100,30);
        TextField user,pas;
        user = new TextField();
        user.setBounds(125, 75, 200, 30);
        pas = new TextField();
        pas.setBounds(125, 125, 200, 30);
        Button lo,ca;
        lo = new Button("Login");
        lo.setBounds(100, 200, 100, 25);
        ca = new Button("Cancel");
        ca.setBounds(200, 200, 100, 25);
        f.add(lo);
        f.add(ca);
        f.add(pas);
        f.add(user);
        f.add(login);
        f.add(pass);
        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
        f.addWindowListener(new myclass());
    }
}

class myclass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
