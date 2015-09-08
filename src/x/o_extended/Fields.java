package x.o_extended;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fields extends JPanel implements ActionListener {

    private static int Size;
    private JButton[][] X_O;
    private boolean finished;
    boolean PlayerNum = true;
    static final int line = 5;      
    public boolean isFisnished() {
        return finished;
    }
    public static int getX_OSize() {
        return Size;
    }

    public boolean isPlayerNum() {
        return PlayerNum;
    }
    
    public static void setSize(int size) {
        Fields.Size = size;
    }
    

    public Fields(int size) {
        Size = size;
        X_O =  new JButton[Size][Size];
        finished = false;
        generateFields();
    }
    public void Clear(){
        for (int i=0;i<Fields.getX_OSize();i++)
            for (int j=0;j<Fields.getX_OSize();j++)
            {
              X_O[i][j].setText(" ");
              X_O[i][j].setEnabled(true);
            }
        PlayerNum = true;
    }
    
    private void generateFields() {
        int width = Frame.getHight();
        int height = Frame.getWIdth() - 250;
        setPreferredSize(new Dimension(width, height));
        setLayout(null);
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                X_O[i][j] = new JButton(" ");
                X_O[i][j].setBounds(width/ (Size) * j + 6,
                        (height) / (Size) * i + 6,
                        width / (Size) - 6,
                        (height) / (Size) - 6);
                X_O[i][j].setVisible(true);
                X_O[i][j].setEnabled(true);
                X_O[i][j].setFocusable(false);
                X_O[i][j].addActionListener(this);
                X_O[i][j].setName("" + i + " " + j);
                X_O[i][j].setFont(new Font("Arial", Font.PLAIN, 8));
                X_O[i][j].setText(" ");
                add(X_O[i][j]);
            }
        }}
    private boolean isFinished(int i, int j, boolean finished){
        int counter = 1;
        int directionX;
        int directionY;
        
        for(directionY = -1; directionY < 1; directionY++)
        {
            for(directionX = -1; directionX < 1; directionX++)
            {
                counter = 1;
                if(directionX == 0 && directionY == 0)
                    continue;
                counter += directionFuncion(directionX, directionY, i, j, ((finished)? ("X"):("0"))) + 
                           directionFuncion(-directionX, -directionY, i, j, ((finished)? ("X"):("0")));
                
                if(counter == line)
                    return true;
            }
        }
        return false;
    }
    
    private int directionFuncion(int directionX, int directionY, int i, int j, String Char){
        int counter = 0;
        int index1=i, index2=j; 
        while (index1 + directionX >= 0 && index2 + directionY >= 0 
                && index1 + directionX < Size && index2 + directionY < Size 
                && counter < 5) {
            if(X_O[index1 + directionX][index2+directionY].getText().equals(Char)){
                counter++;
            }
            else
            {
                break;
            }
            index1+=directionX;
            index2+=directionY;
        }
                
        return counter;
    }
    @Override public void actionPerformed(ActionEvent e) {
        int i, j;
        int substringIndex = e.toString().indexOf(" on ");
        String subString = e.toString().substring(substringIndex + 4);
        i = Integer.parseInt(subString.substring(0, subString.indexOf(" ")));
        j = Integer.parseInt(subString.substring(subString.indexOf(" ")+1));
        X_O[i][j].setText("" + ((PlayerNum)?("X"):("0")));
        X_O[i][j].setEnabled(false);
        if(isFinished(i, j, PlayerNum))
        {
            JOptionPane.showMessageDialog(null, "POBJEDIO JE " + ((PlayerNum)?(Options.getPlay1()):(Options.getPlay2()))) ;
            Options.Result(PlayerNum);
        }
        else
            PlayerNum = !PlayerNum;
    }
}
