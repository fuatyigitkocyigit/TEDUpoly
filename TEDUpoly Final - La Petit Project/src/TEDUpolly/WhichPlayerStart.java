package TEDUpolly;

import TEDUpolly.Dice;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author La Petit Project Team
 */
public class WhichPlayerStart extends javax.swing.JFrame {

    /**
     * Creates new form WhichPlayerStart
     */
    DefaultListModel <String> alan= new DefaultListModel();
    ArrayList<String> playerList = new ArrayList<String>();
    public boolean player1Start=false;
    ArrayList <Integer> faceValues= new ArrayList<>();
    
    
    public WhichPlayerStart() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Dice = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        player_name = new javax.swing.JLabel();
        startGame = new javax.swing.JButton();
        whichPlayer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationText = new javax.swing.JTextPane();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    		
        jPanel1.setBackground(new java.awt.Color(0, 42, 165));

        Dice.setText("Dice");
        Dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player:");

        startGame.setText("Start Game");
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(informationText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(Dice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startGame)
                                .addContainerGap(105, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(whichPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(65, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(whichPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(startGame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Dice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void DiceActionPerformed(java.awt.event.ActionEvent evt) {
        //Dice
    	TEDUpolly.Dice newDice= new TEDUpolly.Dice(10,10,10,10);
    	TEDUpolly.Dice newDice2=new Dice(10,10,10,10);
        newDice.ZarAt();//Player1's Dice
        newDice2.ZarAt();//Player2's Dice
        if(faceValues.size() == 0 ){
            int faceValueOf1= newDice.getZarSonucu();
            informationText.setText("The dice that the player "+ Giris.player1+" rolls:"+faceValueOf1);
            faceValues.add(faceValueOf1);

        }
        else {
            int faceValueOf2= newDice2.getZarSonucu();
            informationText.setText("The dice that the player "+Giris.player1 +" rolls:"+faceValues.get(0)+"\n"+"The dice that the player "+Giris.player2+" rolls:"+faceValueOf2);
            alan.addElement("Dice Rolled.");
            if(faceValues.get(0)>faceValueOf2){
                whichPlayer.setText(Giris.player1+" will start.");
                player1Start=true;
                startGame.setEnabled(true);
                Dice.setEnabled(false);
            }else if (faceValues.get(0)<faceValueOf2){
                whichPlayer.setText(Giris.player2+" will start.");

                startGame.setEnabled(true);
                Dice.setEnabled(false);
            }else {
                alan.removeAllElements();
                whichPlayer.setText("The dice rolled evenly. Roll the dice again.");
                faceValues.clear();
            }
        }





    }

    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {
        // Start Game
        if(alan.size()==0){
            JOptionPane.showMessageDialog(null,"Please roll dice first.");
        }else {
            if(player1Start==false){
                playerList.add(Giris.player2);
                playerList.add(Giris.player1);
                Giris.player1=playerList.get(0);
                Giris.player2=playerList.get(1);
                dispose();
                new MainTEDUpolly().setVisible(true);
            }else {  dispose();
                new MainTEDUpolly().setVisible(true);

            }
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WhichPlayerStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhichPlayerStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhichPlayerStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhichPlayerStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new WhichPlayerStart().setVisible(true);
            }
        });
    }

    public static BufferedImage lapetit;
    public static String player1;
    public static String player2;
    // Variables declaration - do not modify
    private javax.swing.JButton Dice;
    private javax.swing.JTextPane informationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel player_name;
    private javax.swing.JButton startGame;
    private javax.swing.JTextField whichPlayer;
    // End of variables declaration
}
