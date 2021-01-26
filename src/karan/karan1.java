/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karan;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static karan.FInalHome.user;

/**
 *
 * @author karan
 */
//USER LOGIN FORM TAKES USERNAME AND PASSWORD 
public class karan1 extends javax.swing.JFrame {
    Connection con=null;
    ResultSet r,r2,r3=null,rs,r1;
    Statement st;
    PreparedStatement pst,pst1,pst2=null;
    public karan1() {
        initComponents();
         
    }
    String b;
    public void a(String s1){
        b=s1;
        System.out.println(s1);
        System.out.println(b);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        txt_user = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel10.setBackground(new java.awt.Color(255, 0, 51));
        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brand-gradients-hex-color-background.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setForeground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(491, 357));
        setName("karan1"); // NOI18N
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(250, 130, 49));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Monospaced", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("LOGIN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 21, 135, 48);

        jLabel5.setBackground(new java.awt.Color(102, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setText("-");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(423, 2, 36, 22);

        jLabel6.setBackground(new java.awt.Color(204, 51, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setText("X");
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(469, 2, 21, 22);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(2, 88, 506, 0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brand-gradients-hex-color-background.png"))); // NOI18N
        jLabel12.setText("jLabel8");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 510, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 90);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel2ComponentAdded(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("USERNAME");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 30, 120, 35);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("PASSWORD");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 90, 120, 40);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(48, 167, 129, 53);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(250, 170, 129, 53);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("CREATE A NEW ACCOUNT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 240, 430, 40);

        txt_pass.setBackground(new java.awt.Color(255, 102, 102));
        txt_pass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passFocusLost(evt);
            }
        });
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        jPanel2.add(txt_pass);
        txt_pass.setBounds(230, 100, 170, 30);

        txt_user.setBackground(new java.awt.Color(255, 102, 102));
        txt_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel2.add(txt_user);
        txt_user.setBounds(230, 40, 170, 30);

        jToggleButton1.setBackground(new java.awt.Color(0, 255, 204));
        jToggleButton1.setForeground(new java.awt.Color(204, 0, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\karan\\Desktop\\advance java\\New folder\\154773211187984683.png")); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setOpaque(true);
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseExited(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(410, 100, 40, 30);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 140, 100, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brand-gradients-hex-color-background.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 510, 300);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 510, 300);

        getAccessibleContext().setAccessibleName("JFrame1");

        setSize(new java.awt.Dimension(505, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_user.setText("");
        txt_pass.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
          dispose();
          new NEWSIGNUP().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setState(karan1.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        // TODO add your handling code here:
        jLabel6.setBackground(Color.RED);
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        // TODO add your handling code here:
        jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(Color.RED);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        Color my=new Color(235,59,90);
        jButton1.setBackground(my);
    }//GEN-LAST:event_jButton1MouseExited

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        char key=evt.getKeyChar();
        if(key == 'x')System.exit(0);
    }//GEN-LAST:event_formKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        Font f=new Font("Monospaced",Font.BOLD,30);
        jLabel3.setFont(f);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        Font F1=new Font("MonoSpaced",Font.BOLD,20);
        jLabel3.setFont(F1);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root","");
            String query="Select username from login1 WHERE username='"+txt_user.getText()+"'" ;
            String query2="Select password from login1 WHERE password='" +txt_pass.getText()+"' " ;
            String query5="Select type from userdata where username='"+txt_user.getText()+"'";
            pst = con.prepareStatement(query);   
            String un=txt_user.getText();
            pst2=con.prepareStatement(query2);
            pst1=con.prepareStatement("select * from login1 where username=?");
            r=pst.executeQuery();
            pst1.setString(1,un);
            r3=pst1.executeQuery();
            r2=pst2.executeQuery();
          if(r.next() && r2.next()){
                ResultSet r4;
                PreparedStatement ch;
                FInalHome f=new FInalHome();
                f.setVisible(true);
                FInalHome.user.setText(txt_user.getText());
                pst=con.prepareStatement(query5);
                r1=pst.executeQuery();
                if(r1.next()){
                   String s1=r1.getString("type");
                   FInalHome.jLabel15.setText(s1);
                }
            try {
             con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root","");
             st = con.createStatement();
            }catch (SQLException ex) {
            Logger.getLogger(FInalHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query3="Select uid from login1 WHERE Fname='"+user.getText()+"'" ;
        try {
        rs = st.executeQuery(query3);
        if(rs.next()){
        int s=rs.getInt(1);
        System.out.println(s);
        FInalHome.user.setText(txt_user.getText());
                try {
                int i12;
                // TODO add your handling code here:
                Calendar c=Calendar.getInstance();
                int a;
                int day=c.get(Calendar.DAY_OF_WEEK);
                System.out.println(day);
                int min=day-1;
                int date=c.get(Calendar.DAY_OF_YEAR);
                String s2,s3;
            switch (day) {
                
                case 1:
                     s2="Select cg from sunday1 where uid='"+s+"'";
                     s3="Select cb from sunday where uid='"+s+"'";
                     rs = st.executeQuery(s2);
                     if(rs.next()){
                             int cb=rs.getInt(1);
                             FInalHome.jLabel4.setText(String.valueOf(cb));
                      } 
                     rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel9.setText(String.valueOf(cg));
            }
                      break;
                case 2:
                    s2="Select cg from monday1 where uid='"+s+"'";
                    s3="Select cb from monday where uid='"+s+"'";
                    rs = st.executeQuery(s2);
                    if(rs.next()){
                    int cb=rs.getInt(1);
                    FInalHome.jLabel4.setText(String.valueOf(cb));
                      } 
                    rs =st.executeQuery(s3);
                    if(rs.next()){
                    int cg=rs.getInt(1);
                    FInalHome.jLabel9.setText(String.valueOf(cg));
            }
                      break;
                     case 3:
                     s2="Select cg from tuesday1 where uid='"+s+"'";
                     s3="Select cb from tuesday where uid='"+s+"'";
                     rs = st.executeQuery(s2);
                     if(rs.next()){
                    int cb=rs.getInt(1);
                    FInalHome.jLabel4.setText(String.valueOf(cb));
                      } 
                     rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel9.setText(String.valueOf(cg));
            }
                      break;
                case 4:
                     s2="Select cg from wednesday1 where uid='"+s+"'";
                     s3="Select cb from wednesday where uid='"+s+"'";
                    rs = st.executeQuery(s2);
                      if(rs.next()){
                   
                     int cb=rs.getInt(1);
                     FInalHome.jLabel4.setText(String.valueOf(cb));
                      } 
                      rs =st.executeQuery(s3);
                      if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel9.setText(String.valueOf(cg));
            }
                      break;
                case 6:
                     s2="Select cg from friday1 where uid='"+s+"'";
                     s3="Select cb from friday where uid='"+s+"'";
                    rs = st.executeQuery(s2);                 
                      if(rs.next()){
                      int cb=rs.getInt(1);
                      FInalHome.jLabel4.setText(String.valueOf(cb));
                      } 
                      rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel9.setText(String.valueOf(cg));
            }
                      break;
                case 7:         
                 s2="Select cg from saturday1 where uid='"+s+"'";
                 s3="Select cb from saturday where uid='"+s+"'";
                 rs = st.executeQuery(s2);
                 if(rs.next()){
                      int cb=rs.getInt(1);
                 FInalHome.jLabel4.setText(String.valueOf(cb));
                      } 
                 rs =st.executeQuery(s3);
                 if(rs.next()){
                 int cg=rs.getInt(1);
                 FInalHome.jLabel9.setText(String.valueOf(cg));
            }
                      break;
                        }
             switch (min) {
                
                case 1:
                    
                     s2="Select cg from sunday1 where uid='"+s+"'";
                     s3="Select cb from sunday where uid='"+s+"'";
                     rs = st.executeQuery(s2);     
                     if(rs.next()){ 
                     int cb=rs.getInt(1);
                     FInalHome.jLabel7.setText(String.valueOf(cb));
                                  } 
                     rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel8.setText(String.valueOf(cg));
            }
                      break;
                case 2:
                     s2="Select cg from mondayday1 where uid='"+s+"'";
                     s3="Select cb from monday where uid='"+s+"'";
                     rs = st.executeQuery(s2);
                     if(rs.next()){
                     int cb=rs.getInt(1);
                     FInalHome.jLabel7.setText(String.valueOf(cb));
                                     } 
                    rs =st.executeQuery(s3);
                    if(rs.next()){
                    int cg=rs.getInt(1);
                    FInalHome.jLabel8.setText(String.valueOf(cg));
            }
                      break;
               
                      case 3:
                     s2="Select cg from tuesday1 where uid='"+s+"'";
                     s3="Select cb from tuesday where uid='"+s+"'";
                     rs = st.executeQuery(s2);       
                     if(rs.next()){
                     int cb=rs.getInt(1);
                     FInalHome.jLabel7.setText(String.valueOf(cb));
                      } 
                     rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel8.setText(String.valueOf(cg));
            }
                      break;

                case 4:
                     s2="Select cg from wednesday1 where uid='"+s+"'";
                     s3="Select cb from wednesday where uid='"+s+"'";
                     rs = st.executeQuery(s2);
                     if(rs.next()){
                     int cb=rs.getInt(1);
                     FInalHome.jLabel7.setText(String.valueOf(cb));
                      } 
                     rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel8.setText(String.valueOf(cg));
            }
                      break;
                case 6:
                     s2="Select cg from friday1 where uid='"+s+"'";
                     s3="Select cb from friday where uid='"+s+"'";
                     rs = st.executeQuery(s2); 
                      if(rs.next()){
                     int cb=rs.getInt(1);
                     FInalHome.jLabel7.setText(String.valueOf(cb));
                      } 
                     rs =st.executeQuery(s3);
                     if(rs.next()){
                     int cg=rs.getInt(1);
                     FInalHome.jLabel8.setText(String.valueOf(cg));
            }
                      break;
                case 7:         
                    s2="Select cg from saturday1 where uid='"+s+"'";
                    s3="Select cb from saturday where uid='"+s+"'";
                    rs = st.executeQuery(s2);
                    if(rs.next()){ 
                    int cb=rs.getInt(1);
                    FInalHome.jLabel7.setText(String.valueOf(cb));
                      } 
                    rs =st.executeQuery(s3);
                    if(rs.next()){
                    int cg=rs.getInt(1);
                    FInalHome.jLabel8.setText(String.valueOf(cg));
            }
                      break;
             }       
        }catch(SQLException e){}
//                FInalHome.jLabel9.setText(String.valueOf(s));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FInalHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                          dispose();
                }
            else{
               JOptionPane.showMessageDialog(null,"LoginUNSuccesful....TRY AGAIN");
                jLabel7.setText("NOT INSERTED");
            }
            r.close();   
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex ){
             JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
             Logger.getLogger(karan1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(karan1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        Color my=new Color(69,170,242);
        jButton2.setBackground(my);
        
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
       jButton2. setBackground(Color.CYAN);
        
    }//GEN-LAST:event_jButton2MouseEntered

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jToggleButton1MouseEntered

    private void jToggleButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_jToggleButton1MouseExited

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        if(jToggleButton1.isSelected()){
            txt_pass.setEchoChar((char)0);
            jToggleButton1.setBackground(Color.RED);
        }
        else
        {
            txt_pass.setEchoChar('*');
             jToggleButton1.setBackground(Color.CYAN);        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jPanel2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2ComponentAdded

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        // TODO add your handling code here:
        txt_user.setEditable(false);
        txt_user.setText(""); 
        txt_user.setEditable(true);
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        // TODO add your handling code here:
        if(txt_user.getText().equalsIgnoreCase(""))
        txt_user.setText("USERNAME");
    }//GEN-LAST:event_txt_userFocusLost

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passFocusLost

    
    
    /**
     * @param args the command line arguments
     *  
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JPasswordField txt_pass;
    public static javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
