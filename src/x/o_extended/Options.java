package x.o_extended;

public class Options extends javax.swing.JPanel {
    static Fields naziv;
    static int scorePlayer1 = 0;
    static int scorePlayer2 = 0;
    public Options(final Fields ime) {
        naziv = ime;
        initComponents();
    }
    public static void Result(boolean player){
        if(player)
                scorePlayer1++;
            else
                scorePlayer2++;
            naziv.Clear();
            result.setText(scorePlayer1+":"+scorePlayer2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        player1 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        newGame = new javax.swing.JButton();

        player1.setText("1");

        result.setText("0:0");

        player2.setText("2");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        newGame.setText("Nova Igra");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        naziv.Clear();
    }                                     

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        naziv.Clear();
        result.setText("0:0");
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JButton newGame;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JButton reset;
    private static javax.swing.JLabel result;
    // End of variables declaration                   
}
