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
        user = new TextField("Username");
        user.setBounds(125, 75, 200, 30);
        pas = new TextField("Password");
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
// Label l1, l2;
// l1 = new Label("User Name");
// l1.setBounds(50, 100, 100, 30);
// l2 = new Label("Password");
// l2.setBounds(50, 150, 100, 30);
// f.add(l1);
// f.add(l2);
// f.setSize(400, 400);
// f.setLayout(null);
// f.setVisible(true);