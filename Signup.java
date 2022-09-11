import java.awt.*;
import java.awt.event.*;

public class Signup extends Frame {
    Signup() {

        setLayout(null);

        Label L1 = new Label("Signup Form");
        L1.setFont(new Font("", Font.PLAIN, 30));
        L1.setBounds(290, 50, 175, 40);
        add(L1);

        Label l1 = new Label("Name:");
        l1.setFont(new Font("", Font.PLAIN, 30));
        l1.setBounds(175, 175, 100, 30);
        add(l1);

        TextField t1 = new TextField(15);
        t1.setFont(new Font("", Font.PLAIN, 20));
        t1.setBounds(360, 175, 200, 27);
        add(t1);

        Label l2 = new Label("Age:");
        l2.setFont(new Font("", Font.PLAIN, 30));
        l2.setBounds(175, 250, 100, 33);
        add(l2);

        TextField t2 = new TextField(15);
        t2.setFont(new Font("", Font.PLAIN, 20));
        t2.setBounds(360, 250, 200, 27);
        add(t2);

        Label l3 = new Label("Number:");
        l3.setFont(new Font("", Font.PLAIN, 30));
        l3.setBounds(175, 325, 120, 33);
        add(l3);

        TextField t3 = new TextField(15);
        t3.setFont(new Font("", Font.PLAIN, 20));
        t3.setBounds(360, 325, 200, 27);
        add(t3);

        Label l4 = new Label("Email:");
        l4.setFont(new Font("", Font.PLAIN, 30));
        l4.setBounds(175, 400, 100, 30);
        add(l4);

        TextField t4 = new TextField(15);
        t4.setFont(new Font("", Font.PLAIN, 20));
        t4.setBounds(360, 400, 200, 27);
        add(t4);

        Label l5 = new Label("Password:");
        l5.setFont(new Font("", Font.PLAIN, 30));
        l5.setBounds(175, 475, 145, 30);
        add(l5);

        TextField t5 = new TextField(15);
        t5.setFont(new Font("", Font.PLAIN, 20));
        t5.setBounds(360, 475, 200, 27);
        add(t5);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
        setSize(800, 800);
        setTitle("Railway Reservation System");
        setLayout(new FlowLayout());
        // setResizable(true);
    }

    public static void main(String[] args) {
        Signup a = new Signup();

    }
}