package x.o_extended;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{
    private static final int WIDTH = 900;
    private static final int HIGHT = 700;

    public static int getHIGHT() {
        return HIGHT;
    }

    public static int getWIDTH() {
        return WIDTH;
    }
    public static int getVisina() {
        return HIGHT;
    }
    public static int getDuzina() {
        return WIDTH;
    }
    
    public Frame() {
        setSize(WIDTH, HIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Fields dugme = new Fields();
        dugme.setBounds(0, 0, 600, 600);
        dugme.setVisible(true);
        Options opcije = new Options(dugme);
        opcije.setVisible(true);
        opcije.setBounds(650, 0, WIDTH, HIGHT);
        
        add(opcije);
        add(dugme);
            
    }
}
