
package Num9;

import java.awt.ComponentOrientation;
import javax.swing.JFrame;
import java.io.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class NumGUI extends javax.swing.JFrame {
   
    ResourceBundle messageList[];
    File dir;
    
    public NumGUI() {
        initComponents();
        init();        
    }
    
    public NumGUI(ResourceBundle messageList[]) {
        this.messageList = messageList;
        initComponents();
        init();        
    }      
   

    private void init(){
        setVisible(true);
        setTitle("CS530 Assign9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlagOne.setVisible(false);
        flagTwo.setVisible(false);
        flagThree.setVisible(false);
        flagFour.setVisible(false);
        flagFive.setVisible(false);
        
        dir=new File(pathInput.getText());
        messageList = loadResourceFiles(dir);
        
        if (messageList[0]!=null){
            FlagOne.setVisible(true);
            FlagOne.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[0].getString("my.flag"))));
            if (messageList[1]!=null){
                flagTwo.setVisible(true);
                flagTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[1].getString("my.flag"))));
                if (messageList[2]!=null){
                    flagThree.setVisible(true);
                    flagThree.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[2].getString("my.flag"))));
                    if (messageList[3]!=null){
                        flagFour.setVisible(true);
                        flagFour.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[3].getString("my.flag"))));
                        if (messageList[4]!=null){
                            flagFive.setVisible(true);
                            flagFive.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[4].getString("my.flag"))));
                        }
                    }
                }
            }
        }//end FlagOne
        else{
            dir=new File(pathInput.getText());
            messageList = loadResourceFiles(dir);
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
        flagFour = new javax.swing.JLabel();
        flagFive = new javax.swing.JLabel();
        pathInput = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        FlagOne.setName(""); // NOI18N
        FlagOne.setPreferredSize(new java.awt.Dimension(200, 120));
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
        flagThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flagThreeMouseClicked(evt);
            }
        });

        flagFour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flagFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/norwayflag.gif"))); // NOI18N
        flagFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flagFourMouseClicked(evt);
            }
        });

        flagFive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flagFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/Italian-flag.gif"))); // NOI18N
        flagFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flagFiveMouseClicked(evt);
            }
        });

        pathInput.setText("C:\\Users\\Doug\\Documents\\GitHub\\NetBeansProjects\\Assign9\\build\\classes");

        refresh.setText("Refresh");
        refresh.setToolTipText("");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        jLabel1.setText("Path:");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(FlagOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flagTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flagFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flagThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flagFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(monumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(exitButton))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(0, 36, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pathInput, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(greetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refresh)))))
                .addGap(31, 31, 31))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(FlagOne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(flagTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(flagThree, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(flagFour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pathInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(greetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(refresh)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(48, 48, 48)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton)
                    .addComponent(flagFive, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void flagThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagThreeMouseClicked
       greetLabel.setText(messageList[2].getString("my.hello"));
       exitButton.setText(messageList[2].getString("my.exit"));
       monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[2].getString("my.monument"))));      
    }//GEN-LAST:event_flagThreeMouseClicked

    private void flagFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagFourMouseClicked
       greetLabel.setText(messageList[3].getString("my.hello"));
       exitButton.setText(messageList[3].getString("my.exit"));
       monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[3].getString("my.monument"))));    
    }//GEN-LAST:event_flagFourMouseClicked

    private void flagFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flagFiveMouseClicked
       greetLabel.setText(messageList[4].getString("my.hello"));
       exitButton.setText(messageList[4].getString("my.exit"));
       monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(messageList[4].getString("my.monument"))));   
    }//GEN-LAST:event_flagFiveMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        dir=new File(pathInput.getText());
        
        init();
    }//GEN-LAST:event_refreshMouseClicked
    
    public static ResourceBundle[] loadResourceFiles(File dir) {
        FilenameFilter filter = new FilenameFilter() {
        public boolean accept
         (File dir, String name) {          
             return name.endsWith(".properties");
         }
        };
         String[] children = dir.list(filter);
        if (children == null) {
           System.out.println("Either dir does not exist or is not a directory");
          } 
        else {
           for (int i=0; i<children.length; i++) {
              children[i] = children[i].replace(".properties","");
              String filename = children[i];
              System.out.println(filename);
           }
        } 
   
        ResourceBundle messageList[] = new ResourceBundle[5];
        
        if(children!=null)
            for (int i=0; i<children.length;i++)
                messageList[i] = ResourceBundle.getBundle(children[i]);
  
        return messageList;
    }
    
    public static void main(String args[]) throws Exception {
        new NumGUI();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlagOne;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel flagFive;
    private javax.swing.JLabel flagFour;
    private javax.swing.JLabel flagThree;
    private javax.swing.JLabel flagTwo;
    private javax.swing.JLabel greetLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel monumentLabel;
    private javax.swing.JTextField pathInput;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
