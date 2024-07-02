package note.recognition.game;

import javax.swing.JFrame;

public class StartForm extends javax.swing.JFrame {

    public StartForm() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    private void DifficultyChossing() {
        DifficultyChoosing df = new DifficultyChoosing();
        df.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kalam", 1, 48)); // NOI18N
        jLabel1.setText("welcume to the notes recognition game");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setFont(new java.awt.Font("Kalam", 0, 36)); // NOI18N
        jButton1.setText("Start the music");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Instructions for the notes recognition game\nWelcome to the note recognition game! In this game you will try to identify the note being played and select it on a piano picture. \nThe game offers three different difficulty levels that will challenge you in different ways.\n\nhow to play:\nInstructions:\n\nWhen you enter the game, you will see these instructions. Click the \"Continue\" button to begin.\nChoosing a difficulty level:\n\nAfter you click on the \"Continue\" button, you will reach the difficulty level selection window. Choose the desired difficulty level:\n\nEasy: the notes will be played from the middle octaves.\nMiddle: The notes will be played from the octaves around middle.\nHard: The notes will be played from the octaves farthest from the middle and black notes.\nMelody and recognition of the note:\n\nAfter choosing the difficulty level, you will reach a window with a \"play\" button.\nPress the \"play\" button to play the note.\nYou have to choose which note it is by clicking on the piano picture shown.\nSelecting the character:\n\nIn the piano picture you will see all the possible notes. Click on the note you think is the note being played.\nResults:\n\nIf you have identified correctly, you will receive a notification about it. If you made a mistake, try again until you recognize the correct character.\nAdditional levels:\n\nAfter each character is identified, you can continue playing or return to the difficulty level selection window and try another level.\ntips:\nListen carefully to the sound being played.\nTry singing or humming the sound being played to help yourself recognize it.\nPractice makes perfect! The more you play, the better your character recognition will improve.\nSuccessfully!");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         setVisible(false);
         DifficultyChossing();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
