package x.o_extended;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fields extends JPanel implements ActionListener {

    private static int Size;
    private JButton[][] X_O;
    private static boolean finished;
    static boolean brojac = true;
                      
    public static boolean isFisnished() {
        return finished;
    }
    public static int getX_OSize() {
        return Size;
    }
    public static void setSize(int size) {
        Fields.Size = size;
    }
    
    public Fields() {
        makingGame();
        finished = false;
        generateFields();
    }

    private void makingGame() {
        Size = 4;
        X_O =  new JButton[Size][Size];
    }
    public void Clear(){
        for (int i=0;i<Fields.getX_OSize();i++)
            for (int j=0;j<Fields.getX_OSize();j++)
            {
              X_O[i][j].setText(" ");  
            }
        brojac = true;
    }
    
    private void generateFields() {
        int width = Frame.getDuzina()-300;
        int height = Frame.getVisina();
        setPreferredSize(new Dimension(width, height));
        setLayout(null);
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                X_O[i][j] = new JButton(" ");
                X_O[i][j].setBounds((width) / (Size) * j + (6),
                        (height) / (Size) * i + (6),
                        width / (Size) - (6),
                        (height) / (Size) - (6));
                X_O[i][j].setVisible(true);
                X_O[i][j].setEnabled(true);
                X_O[i][j].setFocusable(false);
                X_O[i][j].addActionListener(this);
                X_O[i][j].setName("" + i + " " + j);
                X_O[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                add(X_O[i][j]);
            }
        }}
    private boolean isFinished(int i, int j, boolean finished){
        //
        return false;
    }
    @Override public void actionPerformed(ActionEvent e) {
        int i, j;
        int substringIndex = e.toString().indexOf(" on ");
        String subString = e.toString().substring(substringIndex + 4);
        i = Integer.parseInt(subString.substring(0, subString.indexOf(" ")));
        j = Integer.parseInt(subString.substring(subString.indexOf(" ")+1));
        X_O[i][j].setText("" + ((brojac)?("X"):("O")));
        brojac = !brojac;
        isFinished(i, j, brojac);
    }
}