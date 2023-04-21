package com.tic_tac_toe;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class GameUI extends javax.swing.JFrame {

    public GameUI() {
        initComponents();
        this.setSize(690, 550);
        this.setLocation(300, 100);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GREEN);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        box4 = new javax.swing.JButton();
        box2 = new javax.swing.JButton();
        box7 = new javax.swing.JButton();
        box3 = new javax.swing.JButton();
        box8 = new javax.swing.JButton();
        box5 = new javax.swing.JButton();
        box9 = new javax.swing.JButton();
        box1 = new javax.swing.JButton();
        box6 = new javax.swing.JButton();
        symbolO = new javax.swing.JButton();
        symbolX = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 0), 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        box4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box4.setAlignmentX(56.0F);
        box4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });
        jPanel1.add(box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 99, 94, 81));

        box2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box2.setAlignmentX(56.0F);
        box2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });
        jPanel1.add(box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 12, 94, 81));

        box7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box7.setAlignmentX(56.0F);
        box7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });
        jPanel1.add(box7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, 94, 81));

        box3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box3.setAlignmentX(56.0F);
        box3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });
        jPanel1.add(box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 12, 94, 81));

        box8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box8.setAlignmentX(56.0F);
        box8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });
        jPanel1.add(box8, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 186, 94, 81));

        box5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box5.setAlignmentX(56.0F);
        box5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });
        jPanel1.add(box5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 99, 94, 81));

        box9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box9.setAlignmentX(56.0F);
        box9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });
        jPanel1.add(box9, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 186, 94, 81));

        box1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box1.setAlignmentX(56.0F);
        box1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        jPanel1.add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 94, 81));

        box6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        box6.setAlignmentX(56.0F);
        box6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });
        jPanel1.add(box6, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 99, 94, 81));

        symbolO.setBackground(new java.awt.Color(153, 153, 0));
        symbolO.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        symbolO.setText("o");
        symbolO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolOActionPerformed(evt);
            }
        });

        symbolX.setBackground(new java.awt.Color(153, 153, 0));
        symbolX.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        symbolX.setText("X");
        symbolX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolXActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Select symbol to  start game  ");

        reset.setBackground(new java.awt.Color(204, 255, 51));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(symbolX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(symbolO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symbolX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(symbolO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String symbol="";
private int count=0;
       // GameLogic gameLogic= new GameLogic();
    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box4.setForeground(Color.black);
              if(symbol.equals("X"))
                  box4.setForeground(Color.magenta);
            box4.setText(symbol);
            box4.setEnabled(false);
            symbol=   changePlayer(symbol);
           
            boolean gameOver=  isGameOver(box4);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
            else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box4ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box2.setForeground(Color.black);
              if(symbol.equals("X"))
                  box2.setForeground(Color.magenta);
            box2.setText(symbol);
            box2.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box2);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
               else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box2ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box7.setForeground(Color.black);
              if(symbol.equals("X"))
                  box7.setForeground(Color.magenta);
            box7.setText(symbol);
            box7.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box7);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
                        else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box7ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box3.setForeground(Color.black);
              if(symbol.equals("X"))
                  box3.setForeground(Color.magenta);
            box3.setText(symbol);
            box3.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box3);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
                        else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
          else  count++;
        }
    }//GEN-LAST:event_box3ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
               box8.setForeground(Color.black);
                if(symbol.equals("X"))
                  box8.setForeground(Color.magenta);
            box8.setText(symbol);
            box8.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box8);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
                        else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box8ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box5.setForeground(Color.black);
              if(symbol.equals("X"))
                  box5.setForeground(Color.magenta);
            box5.setText(symbol);
            box5.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box5);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }            else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box5ActionPerformed

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box9.setForeground(Color.black);
              if(symbol.equals("X"))
                  box9.setForeground(Color.magenta);
            box9.setText(symbol);
            box9.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box9);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }            else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
            else count++;
        }
    }//GEN-LAST:event_box9ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box1.setForeground(Color.black);
              if(symbol.equals("X"))
                  box1.setForeground(Color.magenta);
            box1.setText(symbol);
            box1.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box1);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }            else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box1ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        // TODO add your handling code here:
        if(!symbol.equals("")){
             box6.setForeground(Color.black);
             if(symbol.equals("X"))
                  box6.setForeground(Color.magenta);
            box6.setText(symbol);
            box6.setEnabled(false);
            symbol=   changePlayer(symbol);
            boolean gameOver=  isGameOver(box6);
            if(gameOver==true){
                String player=symbol.equals("X")?"O":"X";
                JOptionPane.showMessageDialog(rootPane,"Player "+player+" won!");
                 try {
                     Thread.sleep(2000);count=0;
                     resetAll();
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }            else if(count+1==9){
                JOptionPane.showMessageDialog(rootPane,"Game is Draw  !");
                resetAll();
                count=0;
            }
           else count++;
        }
    }//GEN-LAST:event_box6ActionPerformed

    private void symbolOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbolOActionPerformed
        // TODO add your handling code here:
        symbol="O";
        symbolO.setEnabled(false);
        symbolX.setEnabled(false);
    }//GEN-LAST:event_symbolOActionPerformed

    private void symbolXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbolXActionPerformed
        // TODO add your handling code here:
         symbol="X";
        symbolO.setEnabled(false);
        symbolX.setEnabled(false);
    }//GEN-LAST:event_symbolXActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        box1.setText("");
        box1.setEnabled(true);
        box2.setText("");
        box2.setEnabled(true);
        box3.setText("");
        box3.setEnabled(true);
        box4.setText("");
        box4.setEnabled(true);
        box5.setText("");
        box5.setEnabled(true);
        box6.setText("");
        box6.setEnabled(true);
        box7.setText("");
        box7.setEnabled(true);
        box8.setText("");
        box8.setEnabled(true);
        box9.setText("");
        box9.setEnabled(true);
        symbolO.setEnabled(true);
        symbolX.setEnabled(true);
        symbol="";
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(rootPane, "Are you sure to Exit?",
                "TIC TAC TOE", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

   //Giving alternate chance to players.
 public String changePlayer(String symbol){
         symbol=symbol.equals("X")? "O":"X";
         return symbol;
    }
 //checking for is any player is won
     public boolean isGameOver(JButton box){
         
        String box1Text=box1.getText();
         String box2Text=box2.getText();
          String box3Text=box3.getText();
           String box4Text=box4.getText();
            String box5Text=box5.getText();
             String box6Text=box6.getText();
              String box7Text=box7.getText();
               String box8Text=box8.getText();
                String box9Text=box9.getText();
                boolean isGameOver=false;
        if(box.equals(box1)){
            if(box1Text.equals(box2Text) && box1Text.equals(box3Text) ){
                   box1.setForeground(Color. orange);
                box2.setForeground(Color. orange);
                box3.setForeground(Color. orange);
               return true;
            }
            else if(box1Text.equals(box4Text) && box1Text.equals(box7Text) ){
                 box1.setForeground(Color. orange);
                box4.setForeground(Color. orange);
                box7.setForeground(Color. orange);
                return true;
            }
            else if(box1Text.equals(box5Text) && box1Text.equals(box9Text) ){
                  box1.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box9.setForeground(Color. orange);
               return true;
            }
        }
         if(box.equals(box2)){
            if(box1Text.equals(box2Text) && box1Text.equals(box3Text) ){
                   box1.setForeground(Color. orange);
                box2.setForeground(Color. orange);
                box3.setForeground(Color. orange);
               return true;
            }
            else if(box2Text.equals(box5Text) && box2Text.equals(box8Text) ){
                 box2.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box8.setForeground(Color. orange);
                return true;
            }
           
        }
          if(box.equals(box3)){
            if(box1Text.equals(box2Text) && box1Text.equals(box3Text) ){
                   box1.setForeground(Color. orange);
                box2.setForeground(Color. orange);
                box3.setForeground(Color. orange);
               return true;
            }
            else if(box3Text.equals(box6Text) && box3Text.equals(box9Text) ){
                 box3.setForeground(Color. orange);
                box6.setForeground(Color. orange);
                box9.setForeground(Color. orange);
                return true;
            }
            else if(box3Text.equals(box5Text) && box3Text.equals(box7Text) ){
                  box3.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box7.setForeground(Color. orange);
               return true;
            }
        }
            
            if(box.equals(box4)){
            if(box1Text.equals(box4Text) && box4Text.equals(box7Text) ){
                   box1.setForeground(Color. orange);
                box4.setForeground(Color. orange);
                box7.setForeground(Color. orange);
               return true;
            }
            else if(box4Text.equals(box5Text) && box4Text.equals(box6Text) ){
                 box4.setForeground(Color. orange);
                box6.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                return true;
            }
            
        }
             if(box.equals(box5)){
            if(box5Text.equals(box2Text) && box5Text.equals(box8Text) ){
                   box5.setForeground(Color. orange);
                box8.setForeground(Color. orange);
                box2.setForeground(Color. orange);
               return true;
            }
            else if(box5Text.equals(box4Text) && box5Text.equals(box6Text) ){
                 box5.setForeground(Color. orange);
                box6.setForeground(Color. orange);
                box4.setForeground(Color. orange);
                return true;
            }
            else if(box1Text.equals(box5Text) && box1Text.equals(box9Text) ){
                  box1.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box9.setForeground(Color. orange);
               return true;
            }
             else if(box7Text.equals(box5Text) && box5Text.equals(box3Text) ){
                  box7.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box3.setForeground(Color. orange);
               return true;
            }
        }
             if(box.equals(box6)){
            if(box6Text.equals(box3Text) && box6Text.equals(box9Text) ){
                   box1.setForeground(Color. orange);
                box4.setForeground(Color. orange);
                box7.setForeground(Color. orange);
               return true;
            }
            else if(box6Text.equals(box5Text) && box6Text.equals(box4Text) ){
                 box4.setForeground(Color. orange);
                box6.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                return true;
            }
        }
               if(box.equals(box7)){
            if(box7Text.equals(box8Text) && box7Text.equals(box9Text) ){
                   box7.setForeground(Color. orange);
                box8.setForeground(Color. orange);
                box9.setForeground(Color. orange);
               return true;
            }
            else if(box1Text.equals(box4Text) && box1Text.equals(box7Text) ){
                 box1.setForeground(Color. orange);
                box4.setForeground(Color. orange);
                box7.setForeground(Color. orange);
                return true;
            }
            else if(box7Text.equals(box5Text) && box7Text.equals(box3Text) ){
                  box7.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box3.setForeground(Color. orange);
               return true;
            }
        }
              if(box.equals(box8)){
            if(box8Text.equals(box2Text) && box8Text.equals(box5Text) ){
                   box8.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box2.setForeground(Color. orange);
               return true;
            }
            else if(box8Text.equals(box7Text) && box8Text.equals(box9Text) ){
                 box8.setForeground(Color. orange);
                box7.setForeground(Color. orange);
                box9.setForeground(Color. orange);
                return true;
            }
            
        }
               if(box.equals(box9)){
            if(box7Text.equals(box8Text) && box7Text.equals(box9Text) ){
                   box7.setForeground(Color. orange);
                box8.setForeground(Color. orange);
                box9.setForeground(Color. orange);
               return true;
            }
            else if(box9Text.equals(box5Text) && box9Text.equals(box1Text) ){
                 box1.setForeground(Color. orange);
                box5.setForeground(Color. orange);
                box9.setForeground(Color. orange);
                return true;
            }
            else if(box9Text.equals(box6Text) && box9Text.equals(box3Text) ){
                  box9.setForeground(Color. orange);
                box6.setForeground(Color. orange);
                box3.setForeground(Color. orange);
               return true;
            }
        }
        return isGameOver;
    }
     //Resets game 
    public void resetAll(){
         box1.setText("");
        box1.setEnabled(true);
        box2.setText("");
        box2.setEnabled(true);
        box3.setText("");
        box3.setEnabled(true);
        box4.setText("");
        box4.setEnabled(true);
        box5.setText("");
        box5.setEnabled(true);
        box6.setText("");
        box6.setEnabled(true);
        box7.setText("");
        box7.setEnabled(true);
        box8.setText("");
        box8.setEnabled(true);
        box9.setText("");
        box9.setEnabled(true);
        symbolO.setEnabled(true);
        symbolX.setEnabled(true);
        symbol="";
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
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton box1;
    private javax.swing.JButton box2;
    private javax.swing.JButton box3;
    private javax.swing.JButton box4;
    private javax.swing.JButton box5;
    private javax.swing.JButton box6;
    private javax.swing.JButton box7;
    private javax.swing.JButton box8;
    private javax.swing.JButton box9;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    private javax.swing.JButton symbolO;
    private javax.swing.JButton symbolX;
    // End of variables declaration//GEN-END:variables
}
