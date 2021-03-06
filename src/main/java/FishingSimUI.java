/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rando
 */

import java.util.Random;
import javax.swing.JOptionPane;
public class FishingSimUI extends javax.swing.JFrame {

    int Counter = 0;

    
    
    
    
 //Registering all river fish and their info
    Fish Trout = new Fish("Rainbow Trout","River","Common");
    Fish Bass = new Fish("Bass","River","Common");
    Fish Catfish= new Fish("Catfish","River","Common");
    Fish Sturgeon = new Fish("Sturgeon","River","Rare");
    Fish Salmon = new Fish("Salmon","River","Rare");
    String[] RiverFish = new String [] {"Rainbow Trout", "Bass", "Catfish"};
    String[] RareRiverFish = new String [] {"Sturgeon", "Salmon"};
    


    
 //Registering all ocean fish and their rarities
    Fish Anchovy = new Fish("Anchovy","Ocean","Common");
    Fish Mackerel = new Fish("Mackerel","Ocean","Common");
    Fish Clownfish = new Fish("Clownfish","Ocean","Common");
    Fish Marlin = new Fish("Blue Marlin","Ocean","Legendary");
    Fish Shark = new Fish("Great White Shark","Ocean","Legendary");
    String[] OceanFish = new String[] {"Anchovy","Mackerel","Clownfish"};
    String[] RareOceanFish = new String[] {"Blue Marlin","Great White Shark"};
    

    /**
     * Creates new form FishingSimUI
     */
    public FishingSimUI() {
        initComponents();
        
     //Setting Visibility
        BassLabel.setVisible(false);
        TroutLabel.setVisible(false);
        CatfishLabel.setVisible(false);
        SturgeonLabel.setVisible(false);
        SalmonLabel.setVisible(false);
        ClownFishLabel.setVisible(false);
        AnchovyLabel.setVisible(false);
        MackeralLabel.setVisible(false);
        MarlinLabel.setVisible(false);
        SharkLabel.setVisible(false);
        OceanReel.setVisible(false);
        RiverReelButton.setVisible(false);
        FishingBar.setVisible(false);
        OceanButton.setVisible(false);
        RiverButton.setVisible(false);
        BackButton.setVisible(false);
        TitleLabel.setVisible(true);
        StartButton.setVisible(true);
        ExitButton.setVisible(true);
        MuseumButton.setVisible(false);
        TitleLabel.setText("Fishing Simulator");
        ReelBackButton.setVisible(false);
    
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        RiverReelButton = new javax.swing.JButton();
        FishingBar = new javax.swing.JProgressBar();
        RiverButton = new javax.swing.JButton();
        OceanButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        OceanReel = new javax.swing.JButton();
        ReelBackButton = new javax.swing.JButton();
        MuseumButton = new javax.swing.JButton();
        BassLabel = new javax.swing.JLabel();
        TroutLabel = new javax.swing.JLabel();
        CatfishLabel = new javax.swing.JLabel();
        SturgeonLabel = new javax.swing.JLabel();
        SalmonLabel = new javax.swing.JLabel();
        ClownFishLabel = new javax.swing.JLabel();
        AnchovyLabel = new javax.swing.JLabel();
        MackeralLabel = new javax.swing.JLabel();
        MarlinLabel = new javax.swing.JLabel();
        SharkLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        TitleLabel.setText("Fishing Simulator");

        RiverReelButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        RiverReelButton.setText("Reel In");
        RiverReelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiverReelButtonActionPerformed(evt);
            }
        });

        RiverButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        RiverButton.setText("River");
        RiverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiverButtonActionPerformed(evt);
            }
        });

        OceanButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        OceanButton.setText("Ocean");
        OceanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OceanButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        OceanReel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        OceanReel.setText("Reel In");
        OceanReel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OceanReelActionPerformed(evt);
            }
        });

        ReelBackButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        ReelBackButton.setText("Back");
        ReelBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReelBackButtonActionPerformed(evt);
            }
        });

        MuseumButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        MuseumButton.setText("Museum");
        MuseumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuseumButtonActionPerformed(evt);
            }
        });

        BassLabel.setText("?");

        TroutLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TroutLabel.setText("?");

        CatfishLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CatfishLabel.setText("?");

        SturgeonLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SturgeonLabel.setText("?");

        SalmonLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalmonLabel.setText("?");

        ClownFishLabel.setText("?");

        AnchovyLabel.setText("?");

        MackeralLabel.setText("?");

        MarlinLabel.setText("?");

        SharkLabel.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OceanReel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CatfishLabel)
                            .addComponent(TroutLabel)
                            .addComponent(BassLabel)
                            .addComponent(RiverReelButton)
                            .addComponent(SturgeonLabel)
                            .addComponent(SalmonLabel))
                        .addGap(71, 71, 71)
                        .addComponent(FishingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReelBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnchovyLabel)
                            .addComponent(MackeralLabel)
                            .addComponent(MarlinLabel)
                            .addComponent(SharkLabel))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StartButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RiverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OceanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MuseumButton)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ClownFishLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TroutLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(TitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CatfishLabel)
                        .addGap(18, 18, 18)
                        .addComponent(SturgeonLabel)
                        .addGap(18, 18, 18)
                        .addComponent(SalmonLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FishingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OceanReel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RiverReelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RiverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StartButton)
                            .addComponent(MuseumButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OceanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ClownFishLabel)
                        .addGap(7, 7, 7)
                        .addComponent(AnchovyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MackeralLabel)
                        .addGap(13, 13, 13)
                        .addComponent(MarlinLabel)
                        .addGap(18, 18, 18)
                        .addComponent(SharkLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(ReelBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
    OceanButton.setVisible(true);
    RiverButton.setVisible(true);
    BackButton.setVisible(true);
    StartButton.setVisible(false);
    ExitButton.setVisible(false);
    TitleLabel.setVisible(true);
    MuseumButton.setVisible(true);
    TitleLabel.setText("Choose a Location");
    }//GEN-LAST:event_StartButtonActionPerformed

    private void RiverReelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiverReelButtonActionPerformed
    
        
        
        Counter+=1;
        
        FishingBar.setValue(FishingBar.getValue()+25);


        if (Counter>3){
            //chance element in catch
         Random rand = new Random();
         int randomNum = rand.nextInt((99 - 0) + 1) + 1;
         if (randomNum < 80){
            //randomizes common fish
         Random random = new Random();
         int index = random.nextInt(RiverFish.length);
         Counter=0;
         FishingBar.setValue(0); 
         
         JOptionPane.showMessageDialog(this,("Great job you caught a " + RiverFish[index]));
         
            
            
            
            
        //registering when a common fish is caught
         
         if (RiverFish[index]=="Rainbow Trout")
          {
            
            TroutLabel.setText(Trout.getName() + ", Located in the " + Trout.getLocation() + ". This is a " + Trout.getRarity() + " fish");
            
          }
          if (RiverFish[index]=="Bass")
          {
            
            BassLabel.setText(Bass.getName() + ", Located in the " + Bass.getLocation() + ". This is a " + Bass.getRarity() + " fish");
            
          }
          if (RiverFish[index]=="Catfish")
          {
            
            CatfishLabel.setText(Catfish.getName() + ", Located in the " + Catfish.getLocation() + ". This is a " + Catfish.getRarity() + " fish");
            
          }       

    
    } else {
             // randomizes rare fish
          Random random = new Random();
          int index = random.nextInt(RareRiverFish.length);
          Counter=0;
          FishingBar.setValue(0); 
          
          JOptionPane.showMessageDialog(this,("What a catch! You caught a " + RareRiverFish[index]));
            // registers that a rare fish has been caught   
          if (RareRiverFish[index]=="Sturgeon")
          {
            
          SturgeonLabel.setText(Sturgeon.getName() + ", Located in the " + Sturgeon.getLocation() + ". This is a " + Sturgeon.getRarity() + " fish");
          }  
          if (RareRiverFish[index]=="Salmon")
          {
            
          SalmonLabel.setText(Salmon.getName() + ", Located in the " + Salmon.getLocation() + ". This is a " + Salmon.getRarity() + " fish");
          }  
        
         }
        
        
        }
    
    
    
    
     
     
     
         
    }//GEN-LAST:event_RiverReelButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        RiverReelButton.setVisible(false);
        FishingBar.setVisible(false);
        OceanButton.setVisible(false);
        RiverButton.setVisible(false);
        BackButton.setVisible(false);
        TitleLabel.setVisible(true);
        StartButton.setVisible(true);
        ExitButton.setVisible(true);
        MuseumButton.setVisible(false);
        TitleLabel.setText("Fishing Simulator");
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RiverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiverButtonActionPerformed
    OceanButton.setVisible(false);
    RiverButton.setVisible(false);
    BackButton.setVisible(false);
    MuseumButton.setVisible(false);
    FishingBar.setVisible(true);
    TitleLabel.setVisible(false);
    RiverReelButton.setVisible(true);
    ReelBackButton.setVisible(true);
    }//GEN-LAST:event_RiverButtonActionPerformed

    private void OceanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OceanButtonActionPerformed
    OceanButton.setVisible(false);
    RiverButton.setVisible(false);
    BackButton.setVisible(false);
    MuseumButton.setVisible(false);
    FishingBar.setVisible(true);
    TitleLabel.setVisible(false);
    OceanReel.setVisible(true);
    ReelBackButton.setVisible(true);
    }//GEN-LAST:event_OceanButtonActionPerformed

    private void OceanReelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OceanReelActionPerformed
       
    Counter+=1;
    
    FishingBar.setValue(FishingBar.getValue()+25);
    
    if (Counter>3){
        //chance elements in catch
        Random rand = new Random();
        int randomNum = rand.nextInt((99 - 0) + 1) + 1;
        if (randomNum < 95){
            
        //randomizes common fish
        Random random = new Random();
        int index = random.nextInt(OceanFish.length);
        
        JOptionPane.showMessageDialog(this,("Great job you caught a " + OceanFish[index]));
        
    
        Counter=0;
        FishingBar.setValue(0);
        
          
        //registers that common fish has been caught
          if (OceanFish[index]=="Anchovy")
          {
            
            AnchovyLabel.setText(Anchovy.getName() + ", Located in the " + Anchovy.getLocation() + ". This is a " + Anchovy.getRarity() + " fish");
            // add to museum when open JOptionPane.showMessageDialog(this,(Bass.getName()+ ", " + Bass.getLocation()+ ", " + Bass.getRarity()));
          }
          if (OceanFish[index]=="Clownfish")
          {
            
            ClownFishLabel.setText(Clownfish.getName() + ", Located in the " + Clownfish.getLocation() + ". This is a " + Clownfish.getRarity() + " fish");
            
          }
          if (OceanFish[index]=="Mackerel")
          {
            
            MackeralLabel.setText(Mackerel.getName() + ", Located in the " + Mackerel.getLocation() + ". This is a " + Mackerel.getRarity() + " fish");
            // add to museum when open JOptionPane.showMessageDialog(this,(Bass.getName()+ ", " + Bass.getLocation()+ ", " + Bass.getRarity()));
          }       

        }else{
         // randomizes rare fish
          Random random = new Random();
          int index = random.nextInt(RareRiverFish.length);
          Counter=0;
          FishingBar.setValue(0); 
          // registers that a rare fish has been caught
          JOptionPane.showMessageDialog(this,("Woah!!! You lived to see the day you catch a " + RareOceanFish[index]));
        
          if (RareOceanFish[index]=="Blue Marlin")
          {
            
          MarlinLabel.setText(Marlin.getName() + ", Located in the " + Marlin.getLocation() + ". This is a " + Marlin.getRarity() + " fish");
          }  
          if (RareOceanFish[index]=="Great White Shark")
          {
            
          SharkLabel.setText(Shark.getName() + ", Located in the " + Shark.getLocation() + ". This is a " + Shark.getRarity() + " fish");
          }  
        
         
        }
        
    }
    
    }//GEN-LAST:event_OceanReelActionPerformed

    private void ReelBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReelBackButtonActionPerformed
    RiverReelButton.setVisible(false);
    OceanButton.setVisible(true);
    RiverButton.setVisible(true);
    BackButton.setVisible(true);
    MuseumButton.setVisible(true);
    FishingBar.setVisible(false);
    TitleLabel.setVisible(true);
    OceanReel.setVisible(false);
    ReelBackButton.setVisible(false);
    FishingBar.setValue(0);
    Counter=0;
    BassLabel.setVisible(false);
    TroutLabel.setVisible(false);
    CatfishLabel.setVisible(false);
    SturgeonLabel.setVisible(false);
    SalmonLabel.setVisible(false);
    ClownFishLabel.setVisible(false);
    AnchovyLabel.setVisible(false);
    MackeralLabel.setVisible(false);
    MarlinLabel.setVisible(false);
    SharkLabel.setVisible(false);

    }//GEN-LAST:event_ReelBackButtonActionPerformed

    private void MuseumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuseumButtonActionPerformed
    OceanButton.setVisible(false);
    RiverButton.setVisible(false);
    BackButton.setVisible(false);
    MuseumButton.setVisible(false);
    TitleLabel.setVisible(false);
    ReelBackButton.setVisible(true);
    BassLabel.setVisible(true);
    TroutLabel.setVisible(true);
    CatfishLabel.setVisible(true);
    SturgeonLabel.setVisible(true);
    SalmonLabel.setVisible(true);
    ClownFishLabel.setVisible(true);
    AnchovyLabel.setVisible(true);
    MackeralLabel.setVisible(true);
    MarlinLabel.setVisible(true);
    SharkLabel.setVisible(true);
    }//GEN-LAST:event_MuseumButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FishingSimUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FishingSimUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FishingSimUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FishingSimUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FishingSimUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnchovyLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BassLabel;
    private javax.swing.JLabel CatfishLabel;
    private javax.swing.JLabel ClownFishLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JProgressBar FishingBar;
    private javax.swing.JLabel MackeralLabel;
    private javax.swing.JLabel MarlinLabel;
    private javax.swing.JButton MuseumButton;
    private javax.swing.JButton OceanButton;
    private javax.swing.JButton OceanReel;
    private javax.swing.JButton ReelBackButton;
    private javax.swing.JButton RiverButton;
    private javax.swing.JButton RiverReelButton;
    private javax.swing.JLabel SalmonLabel;
    private javax.swing.JLabel SharkLabel;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel SturgeonLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TroutLabel;
    // End of variables declaration//GEN-END:variables
}
