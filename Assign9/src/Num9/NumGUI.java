
package Num9;

import java.util.*;
import javax.swing.JFrame;

public class NumGUI extends javax.swing.JFrame {
    
    int i = 0;
    
    ResourceBundle message;
    ResourceBundle messageList[];
    
    public NumGUI(ResourceBundle messageList[], ResourceBundle message) {
        this.messageList = messageList;
        this.message = message;
        initComponents();
        init();        
    }       
   

    private void init(){
        setVisible(true);        
        setTitle("CS530 Assign9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        if (i == 0){
            FlagOne.setVisible(true);
        }
        else {
            FlagOne.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        greetLabel = new javax.swing.JLabel();
        monumentLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        FlagOne = new javax.swing.JLabel();
        flagTwo = new javax.swing.JLabel();
        flagThree = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        greetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetLabel.setText("Default Greeting");

        monumentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/default image.gif"))); // NOI18N

        exitButton.setText("Default Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        FlagOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/usa-flags.gif"))); // NOI18N
        FlagOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlagOneMouseClicked(evt);
            }
        });

        flagTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/germanflag.gif"))); // NOI18N
        flagTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flagTwoMouseClicked(evt);
            }
        });

        flagThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/india-flag.gif"))); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flagTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flagThree, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(FlagOne, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(monumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(greetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(231, 231, 231))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(FlagOne, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(flagTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(flagThree, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(greetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(exitButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void FlagOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlagOneMouseClicked
        greetLabel.setText(messageList[0].getString("my.hello"));
        exitButton.setText(messageList[0].getString("my.exit"));
        monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[0].getString("my.monument"))));
    }//GEN-LAST:event_FlagOneMouseClicked

    private void flagTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagTwoMouseClicked
       greetLabel.setText(messageList[1].getString("my.hello"));
       exitButton.setText(messageList[1].getString("my.exit"));
       monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[1].getString("my.monument"))));       
    }//GEN-LAST:event_flagTwoMouseClicked

    
    public static void main(String args[]) throws Exception {
        ResourceBundle message = null;
        ResourceBundle messageList[] = new ResourceBundle[5];
                
        try {
            messageList[0] = ResourceBundle.getBundle ("resource_en_US");
            messageList[1] = ResourceBundle.getBundle ("resource_de_DE");
            
        }
        catch (MissingResourceException mre) {
            mre.printStackTrace();
            System.err.println("resource not found");            
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new NumGUI(messageList, message);
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlagOne;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel flagThree;
    private javax.swing.JLabel flagTwo;
    private javax.swing.JLabel greetLabel;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel monumentLabel;
    // End of variables declaration//GEN-END:variables
}
