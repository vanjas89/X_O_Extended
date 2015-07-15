package x.o_extended;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainPanel extends JPanel{

    public MainPanel() {
        String player1 = JOptionPane.showInputDialog("Unesite ime prvog igraca");
        String player2 = JOptionPane.showInputDialog("Unesite ime drugog igraca");
        String size = JOptionPane.showInputDialog("Unesite velicinu X-O-a");
        int sizeInt = Integer.parseInt(size);
        Fields dugme = new Fields(sizeInt);
        dugme.setVisible(true);
        Options opcije = new Options(dugme, player1, player2);
        opcije.setVisible(true);
        opcije.setAlignmentY(TOP_ALIGNMENT);
        add(dugme);
        add(opcije); 
    }
}
