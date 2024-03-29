/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.ip;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Main extends javax.swing.JFrame {

 
    /**
     * Creates new form Main
     */
    public  Main() {
       
         initComponents();
   
        
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtChat = new javax.swing.JButton();
        BtServidor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BtChat.setText("Chat");
        BtChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtChatActionPerformed(evt);
            }
        });

        BtServidor.setText("Servidor");
        BtServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtServidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(BtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(BtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtServidorActionPerformed
    
        LigarServidor();
     
    }//GEN-LAST:event_BtServidorActionPerformed

    private void BtChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtChatActionPerformed
        
       LigarChat();
    }//GEN-LAST:event_BtChatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
       new Main().setVisible(true);
      
       
    }
      
public void LigarServidor(){
  new Thread() {
      @Override
      public void run(){
           Servidor sv = new Servidor();
      sv.CriarObjeto();
                        }
                }.start();
   }
public void LigarChat(){
  new Thread() {
      @Override
      public void run(){
         try {
            Cliente cl = new Cliente ();
            cl.setVisible(true);
            cl.conectar();
            cl.escutar();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
                        }
                }.start();
   }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtChat;
    private javax.swing.JButton BtServidor;
    // End of variables declaration//GEN-END:variables
}
