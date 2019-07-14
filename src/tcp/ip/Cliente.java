/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.ip;


import JDBC.DB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ricardo
 */
public class Cliente extends javax.swing.JFrame implements ActionListener {
   
    private JTextField txtIP;
    private JTextField txtPorta;
    private JTextField txtNome;
    private Socket socket;
    private OutputStream ou ;
    private Writer ouw; 
    private BufferedWriter bfw;
    private static final long serialVersionUID = 1L;
    
    public Cliente() throws IOException {
        
       
          JLabel lblMessage = new JLabel("Verificar!");
          
		    txtIP = new JTextField("127.0.0.1");
		    txtPorta = new JTextField("12345");
		    txtNome = new JTextField("Cliente");                
		    Object[] texts = {lblMessage, txtIP, txtPorta, txtNome };  
		    JOptionPane.showMessageDialog(null, texts);              
       
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

        BtCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtBrowser = new javax.swing.JButton();
        btnSend1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(600, 600));
        setMinimumSize(new java.awt.Dimension(480, 488));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(null);

        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtCadastrar);
        BtCadastrar.setBounds(270, 270, 120, 40);

        texto.setEditable(false);
        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 200, 280);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setText("Chat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 60, 20);

        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });
        getContentPane().add(txtMsg);
        txtMsg.setBounds(20, 340, 190, 30);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(20, 390, 73, 30);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setText("Cadastrar ocorrencia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 20, 240, 30);

        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });
        getContentPane().add(txtCEP);
        txtCEP.setBounds(330, 70, 130, 30);
        getContentPane().add(txtEstado);
        txtEstado.setBounds(330, 120, 130, 30);
        getContentPane().add(txtCidade);
        txtCidade.setBounds(330, 170, 130, 30);

        lblEndereco.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEndereco.setText("Endereco");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(230, 230, 80, 17);

        lblEstado.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEstado.setText("Estado:");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(240, 130, 60, 17);

        lblCidade.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCidade.setText("Cidade:");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(240, 180, 60, 17);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(330, 220, 130, 30);

        lblCEP.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCEP.setText("CEP:");
        getContentPane().add(lblCEP);
        lblCEP.setBounds(240, 80, 60, 17);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Saiba onde esta ocorrendo incêndio");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 360, 230, 20);

        BtBrowser.setText("Incêndio");
        BtBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBrowserActionPerformed(evt);
            }
        });
        getContentPane().add(BtBrowser);
        BtBrowser.setBounds(290, 400, 100, 50);

        btnSend1.setText("Enviar");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend1);
        btnSend1.setBounds(150, 390, 73, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
        
    }//GEN-LAST:event_txtMsgActionPerformed

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
      if(txtCEP.getText().equals("") || txtCidade.getText().equals("") || txtEstado.getText().equals("") || txtEndereco.getText().equals("") ){
        JOptionPane.showMessageDialog(null, "Inserir todos os dados para o cadastramento");
      }
      else{
          
        Connection conn= null ;
        
	PreparedStatement st = null;
         try{
              conn = DB.getConnection();
              st = conn.prepareStatement(
                     "INSERT INTO Cadastro "
                     +
                      "(CEP,Endereco,Cidade,Estado)"
                     +
                      "VALUES"
                     + 
                      "(?,?,?,?)"
                      , Statement.RETURN_GENERATED_KEYS);
                st.setString(1,txtCEP.getText());
                st.setString(2,txtEndereco.getText());
                st.setString(3,txtCidade.getText());
              st.setString(4, txtEstado.getText());
              st.executeUpdate(); 
          }
          catch(SQLException e){
              e.printStackTrace();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          }
          finally{
	DB.closeStatement(st);
	DB.closeConnection();
}
      }
    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
          try {
            enviarMensagem(txtMsg.getText());
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSend1ActionPerformed

    private void BtBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBrowserActionPerformed
     LigarNavegador();
    }//GEN-LAST:event_BtBrowserActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    public void conectar() throws IOException  {
          
		  socket = new Socket(txtIP.getText(),Integer.parseInt(txtPorta.getText()));
		  ou = socket.getOutputStream();
		  ouw = new OutputStreamWriter(ou);
		  bfw = new BufferedWriter(ouw);
		  bfw.write(txtNome.getText()+"\r\n");
		  bfw.flush();
		}
    
     public void enviarMensagem(String msg) throws IOException {
          
		    if(msg.equals("Sair")){
		      bfw.write("Desconectado \r\n");
                      
		      texto.append("Desconectado \r\n");
		    }else{
		      bfw.write(msg+"\r\n");
		      texto.append( txtNome.getText() + " diz -> " +         txtMsg.getText()+"\r\n");
		    }
		     bfw.flush();
		     txtMsg.setText("");        
		
                 }
     
       
           public void escutar() throws IOException{
          
		   InputStream in = socket.getInputStream();
		   InputStreamReader inr = new InputStreamReader(in);
		   BufferedReader bfr = new BufferedReader(inr);
		   String msg = "";
		                           
		    while(!"Sair".equalsIgnoreCase(msg))
		                                      
		       if(bfr.ready()){
		         msg = bfr.readLine();
		       if(msg.equals("Sair"))
		         texto.append("Servidor caiu! \r\n");
		        else
		         texto.append(msg+"\r\n");         
		        }
		}
            public void sair() throws IOException{
          
		   enviarMensagem("Sair");
		   bfw.close();
		   ouw.close();
		   ou.close();
		   socket.close();
		  System.exit(0);
	}
                 
            
                         
    

    @Override
    public void actionPerformed(ActionEvent evt) {
       try {
			     if(evt.getActionCommand().equals(BtCadastrar.getActionCommand()))
			        enviarMensagem(txtMsg.getText());
			     else
			        if(evt.getActionCommand().equals(btnSair.getActionCommand()))
			        sair();
			     } catch (IOException e1) {
			          // TODO Auto-generated catch block
			          e1.printStackTrace();
			     }   
    }
    
    public void LigarNavegador(){
  new Thread() {
      @Override
      public void run(){
          Navegador nv = new Navegador ();
          nv.antonio();
                        }
                }.start();
   }
    
    
    
     
     	

               

             

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBrowser;
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSend1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables

    
}