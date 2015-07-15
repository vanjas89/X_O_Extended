package x.o_extended;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainPanel extends JPanel{

    public MainPanel() {
        Fields dugme = new Fields();
        dugme.setVisible(true);
        Options opcije = new Options(dugme);
        opcije.setVisible(true);
        opcije.setAlignmentY(TOP_ALIGNMENT);
        add(dugme);
        add(opcije); 
    }
}
