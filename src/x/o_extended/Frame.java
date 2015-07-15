package x.o_extended;

import javax.swing.JFrame;

public class Frame extends JFrame{
    private static final int Width = 900;
    private static final int Height = 700;

    public static int getHight() {
        return Height;
    }

    public static int getWIdth() {
        return Width;
    }
    
    public Frame() {
        setSize(Width, Height);
        
        System.out.println("" + Width + " i " + Height);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        MainPanel panel = new MainPanel();
        panel.setVisible(true);
        getContentPane().add(panel);            
    }
}
