/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karan;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author karan
 */
//GENERATES DIET ON DATA PROVIDED 
public class DietGenerator extends javax.swing.JFrame  {
        Connection con;
        ResultSet rs,r2;
        PreparedStatement ps,pst;;
        Statement s;
         int i1;
        Random r;
       public DietGenerator() {
       initComponents();
       calb.setText(FInalHome.jLabel4.getText());
       Rectangle r3=jPanel3.getBounds();
       System.out.println(r3);
       baji_main1.setVisible(false);
       baji_main2.setVisible(false);
          jPanel3.setVisible(false);
          jPanel8.setVisible(false);
          jPanel9.setVisible(false);
          String query = "Select uid from login1 WHERE Fname='"+user.getText()+"'";
            try {
                int i12;
               // TODO add your handling code here:
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root","");
                Calendar c=Calendar.getInstance();
                int a;
                int day=c.get(Calendar.DAY_OF_WEEK);
                int date=c.get(Calendar.DAY_OF_YEAR);
                switch (day) {
                 case 1:       
                try{           
                pst = con.prepareStatement(query);
                r2=pst.executeQuery();
                i12=Integer.parseInt(calb.getText());
                if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);
                String query2="insert into sunday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement();
                s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update sunday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();           
            s.executeUpdate(query2);
        }
        break;
    case 2:      
        try{           
            pst = con.prepareStatement(query);
            r2=pst.executeQuery();
            i12=Integer.parseInt(calb.getText());
            if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);               
                String query2="insert into monday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement();              
                s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update monday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();
            s.executeUpdate(query2);
        }
        break;
    case 3:
        try{
            
            pst = con.prepareStatement(query);
            r2=pst.executeQuery();
            i12=Integer.parseInt(calb.getText());
            if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);
                String query2="insert into tuesday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement();
                  s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update tuesday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();
            s.executeUpdate(query2);
        }
    case 4:
        try{
            
            pst = con.prepareStatement(query);
            r2=pst.executeQuery();
            i12=Integer.parseInt(calb.getText());
            if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);
                String query2="insert into wednesday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement();               
                s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update wednesday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();           
            s.executeUpdate(query2);
        }
    case 5:
        try{
            
            pst = con.prepareStatement(query);
            r2=pst.executeQuery();
            i12=Integer.parseInt(calb.getText());
            if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);
                String query2="insert into thursday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement(); 
                s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update thursday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();
            s.executeUpdate(query2);
     }
    case 6:
        try{
            
            pst = con.prepareStatement(query);
            r2=pst.executeQuery();
            i12=Integer.parseInt(calb.getText());
            if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);
                String query2="insert into friday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement();               
                s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update friday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();          
            s.executeUpdate(query2);
        }
    case 7:
        try{          
            pst = con.prepareStatement(query);
            r2=pst.executeQuery();
            i12=Integer.parseInt(calb.getText());
            if(r2.next()){
                a=r2.getInt(1);
                System.out.println(a);               
                String query2="insert into saturday1 values ('"+a+"','"+i12+"','"+date+"')";
                s= con.createStatement();                
                s.executeUpdate(query2);
            }
        }catch(SQLException e){
            a=r2.getInt(1);
            i12=Integer.parseInt(calb.getText());
            String query2="update saturday1 SET cg='"+i12+"' where uid='"+a+"'";
            s= con.createStatement();           
            s.executeUpdate(query2);
        }
    default:
        break;
}
            }catch(Exception e){}
    
    }
    public void conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/LOGIN","root","");
        } catch (ClassNotFoundException | SQLException ex) {
           
        }    
    }
    void k(){
        Calendar c=Calendar.getInstance();
        int a=c.get(Calendar.DAY_OF_YEAR);
    int b=c.get(Calendar.DAY_OF_WEEK);
        if(b==1){
            try {
                ps=con.prepareStatement("insert into sunday "+"values('"+1+"','"+calb.getText()+"','"+"aaa"+"')");
            } catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void breakF(){
            try {
                int high=15;
                int low=1;
                r=new Random();
                int i=r.nextInt(high-low)+low;
                conn();
                ps=con.prepareStatement("Select * from  breakfast_veg where did=?");
                ps.setInt(1, i);
                rs=ps.executeQuery();
                if(rs.next()){
                    System.out.println(rs.getString("name"));
                        BreakFast1.setText(rs.getString("name"));
                        
                }   } catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
    
}
    public void breakFF(){
        try{
            int high=10;
              int low=1;
            r=new Random();
            int i=r.nextInt(high-low)+low;           
            conn();
            ps=con.prepareStatement("Select *from breakfast_vegff where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                BreakFast1.setText(rs.getString("name"));
            }
        }
        catch(Exception e){}
    }
    public void breakNF(){
        int high=16;
        int low=11;
        try{
            r=new Random();         
            int  i=r.nextInt(high-low)+low;     
             conn();
            ps=con.prepareStatement("Select *from breakfast_vegff where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                BreakFast1.setText(rs.getString("name"));
            }
        }
        catch(Exception e){}
    }
    public void launch_dal(){
          try{
            int high=8;
            int low=1;
            r=new Random();            
            int i=r.nextInt(high-low)+low;
            HashSet<Integer> h = new HashSet<>();
             h.add(i);
            conn();
            ps=con.prepareStatement("Select *from launch_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                launch_main2.setText(rs.getString("name"));
            }
             r=new Random();
             i=r.nextInt(high-low)+low;
            
            if(h.add(i)){
              conn();
            ps=con.prepareStatement("Select *from launch_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                dinner_main2.setText(rs.getString("name"));             
                }
            }
          }
          catch(Exception e){}
    }
    public void fatLessbaji(){
        
        try{
            baji_main1.setVisible(true);
            baji_main2.setVisible(true);
            int high=7;
              int low=1;
            r=new Random();
            int i=r.nextInt(high-low)+low;
            conn(); 
            HashSet<Integer> h = new HashSet<>();
             h.add(i);
             ps=con.prepareStatement("Select *from baji_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                baji_main1.setText(rs.getString("name"));
            }  
             r=new Random();
             i=r.nextInt(high-low)+low;
            if(h.add(i)){
              conn();    
            ps=con.prepareStatement("Select *from baji_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                baji_main2.setText(rs.getString("name"));             
         }
            }              
        }       
        catch(Exception e){}
    }
      public void fatFullbaji(){
       try{
            baji_main1.setVisible(true);
            baji_main2.setVisible(true);
            int high=15;
              int low=8;
            r=new Random();
            int i=r.nextInt(high-low)+low;
            conn(); 
            HashSet<Integer> h = new HashSet<>();
             h.add(i);
             ps=con.prepareStatement("Select *from baji_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                baji_main1.setText(rs.getString("name"));
            }  
             r=new Random();
             i=r.nextInt(high-low)+low;           
            if(h.add(i)){
              conn();   
            ps=con.prepareStatement("Select *from baji_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                baji_main2.setText(rs.getString("name"));
              
         }
            }  
        }
        catch(Exception e){}
    }  
      public void launch_DinnerNv(){
          int i;
          try{
    r=new Random();
    int high=16;
     int low=1;
     i=r.nextInt(high-low)+low;
    
     HashSet<Integer> h = new HashSet<>();
            h.add(i);
            conn();
            ps=con.prepareStatement("Select *from non_veg where did=?");
            ps.setInt(1,i);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                launch_main2.setText(rs.getString("name"));
            }
            r=new Random();
            int i1=r.nextInt(high-low)+low;
            if(h.add(i1)){
             conn();
            ps=con.prepareStatement("Select *from non_veg where did=?");
            ps.setInt(1,i1);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                dinner_main2.setText(rs.getString("name"));
         }  
        }
          }                 
        catch(Exception e){}
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        calb = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BreakFast1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PHOTO1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        proteinsA = new javax.swing.JLabel();
        fatsA = new javax.swing.JLabel();
        fibreA = new javax.swing.JLabel();
        caloriesA = new javax.swing.JLabel();
        carbsA = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        baji_main1 = new javax.swing.JLabel();
        launch_main2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        PHOTO2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        proteinsA1 = new javax.swing.JLabel();
        fatsA1 = new javax.swing.JLabel();
        fibreA1 = new javax.swing.JLabel();
        caloriesA1 = new javax.swing.JLabel();
        carbsA1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        baji_main2 = new javax.swing.JLabel();
        dinner_main2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        PHOTO3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        proteinsA2 = new javax.swing.JLabel();
        fatsA2 = new javax.swing.JLabel();
        fibreA2 = new javax.swing.JLabel();
        caloriesA2 = new javax.swing.JLabel();
        carbsA2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\karan\\Downloads\\gradient-blue-red-linear-1920x1080-c2-b22222-00bfff-a-60-f-14.png")); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel6.setText("jLabel6");

        jLabel18.setText("jLabel18");

        jLabel28.setBackground(new java.awt.Color(255, 204, 204));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("CALORIES");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setMaximumSize(new java.awt.Dimension(1165, 625));
        setMinimumSize(new java.awt.Dimension(1165, 625));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1159, 625));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("DIET PLAN GENERATOR");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("CALORIES GAINED:");

        calb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calb.setText("0");

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setText("ADD TO RECORD");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("GENERATE ");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 51));
        jButton6.setText("GENERATE OTHER");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(204, 51, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel14.setText("X");
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel14MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setForeground(new java.awt.Color(0, 102, 102));
        user.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(calb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(512, 512, 512)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 190));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText(" BreakFast");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 230, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 153));
        jLabel8.setText("  YOUR BREAKFAST :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 30));

        BreakFast1.setBackground(new java.awt.Color(204, 204, 255));
        BreakFast1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BreakFast1.setOpaque(true);
        BreakFast1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BreakFast1MouseEntered(evt);
            }
        });
        jPanel2.add(BreakFast1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 175, 30));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        PHOTO1.setBackground(new java.awt.Color(255, 204, 102));
        PHOTO1.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Proteins");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("Carbs");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("Fats");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 255));
        jLabel21.setText("Fibre");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 255, 255));
        jLabel22.setText("CALORIES");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 255, 255));

        proteinsA.setBackground(new java.awt.Color(255, 204, 204));
        proteinsA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proteinsA.setForeground(new java.awt.Color(153, 153, 153));
        proteinsA.setText("0");

        fatsA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fatsA.setForeground(new java.awt.Color(153, 153, 153));
        fatsA.setText("0");

        fibreA.setBackground(new java.awt.Color(153, 153, 153));
        fibreA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fibreA.setForeground(new java.awt.Color(153, 153, 153));
        fibreA.setText("0");

        caloriesA.setBackground(new java.awt.Color(255, 204, 204));
        caloriesA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        caloriesA.setForeground(new java.awt.Color(153, 153, 153));
        caloriesA.setText(".");

        carbsA.setBackground(new java.awt.Color(255, 204, 204));
        carbsA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        carbsA.setForeground(new java.awt.Color(153, 153, 153));
        carbsA.setText("0");

        jLabel24.setBackground(new java.awt.Color(204, 51, 0));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel24.setText("X");
        jLabel24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel24MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel24MouseMoved(evt);
            }
        });
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PHOTO1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(caloriesA, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carbsA, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(proteinsA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fibreA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fatsA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel24)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PHOTO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(jLabel23)
                            .addComponent(fatsA)
                            .addComponent(proteinsA)))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel21)
                    .addComponent(fibreA)
                    .addComponent(carbsA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(caloriesA)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 660, 110));

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("ADD TO CALORIES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1170, 140));

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 153));
        jLabel11.setText("Launch");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 153));
        jLabel12.setText("YOUR LUNCH:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("ADD TO CALORIES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 30));

        baji_main1.setBackground(new java.awt.Color(204, 204, 255));
        baji_main1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        baji_main1.setOpaque(true);
        baji_main1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baji_main1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                baji_main1MouseExited(evt);
            }
        });
        jPanel6.add(baji_main1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 175, 30));

        launch_main2.setBackground(new java.awt.Color(204, 204, 255));
        launch_main2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        launch_main2.setOpaque(true);
        launch_main2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                launch_main2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                launch_main2MouseExited(evt);
            }
        });
        jPanel6.add(launch_main2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 175, 30));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));

        PHOTO2.setBackground(new java.awt.Color(255, 204, 102));
        PHOTO2.setOpaque(true);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 255));
        jLabel25.setText("Proteins");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 255, 255));
        jLabel26.setText("Carbs");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 255, 255));
        jLabel27.setText("Fats");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 255, 255));
        jLabel29.setText("Fibre");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 255, 255));
        jLabel30.setText("CALORIES");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 255));

        proteinsA1.setBackground(new java.awt.Color(255, 204, 204));
        proteinsA1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proteinsA1.setForeground(new java.awt.Color(153, 153, 153));
        proteinsA1.setText("0");

        fatsA1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fatsA1.setForeground(new java.awt.Color(153, 153, 153));
        fatsA1.setText("0");

        fibreA1.setBackground(new java.awt.Color(153, 153, 153));
        fibreA1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fibreA1.setForeground(new java.awt.Color(153, 153, 153));
        fibreA1.setText("0");

        caloriesA1.setBackground(new java.awt.Color(255, 204, 204));
        caloriesA1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        caloriesA1.setForeground(new java.awt.Color(153, 153, 153));
        caloriesA1.setText(".");

        carbsA1.setBackground(new java.awt.Color(255, 204, 204));
        carbsA1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        carbsA1.setForeground(new java.awt.Color(153, 153, 153));
        carbsA1.setText("0");

        jLabel32.setBackground(new java.awt.Color(204, 51, 0));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel32.setText("X");
        jLabel32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel32MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel32MouseMoved(evt);
            }
        });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PHOTO2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(caloriesA1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carbsA1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(proteinsA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fibreA1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fatsA1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel32)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PHOTO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel31)
                            .addComponent(fatsA1)
                            .addComponent(proteinsA1)))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29)
                    .addComponent(fibreA1)
                    .addComponent(carbsA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(caloriesA1)))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 660, 110));

        jLabel33.setText("jLabel14");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1290, 150));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 255, 153));
        jLabel15.setText("Dinner");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 153));
        jLabel16.setText("YOUR DINNER:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("ADD TO CALORIES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 30));

        baji_main2.setBackground(new java.awt.Color(204, 204, 255));
        baji_main2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        baji_main2.setOpaque(true);
        baji_main2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baji_main2MouseEntered(evt);
            }
        });
        jPanel5.add(baji_main2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 175, 30));

        dinner_main2.setBackground(new java.awt.Color(204, 204, 255));
        dinner_main2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dinner_main2.setOpaque(true);
        dinner_main2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dinner_main2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dinner_main2MouseExited(evt);
            }
        });
        jPanel5.add(dinner_main2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 175, 30));

        jPanel9.setBackground(new java.awt.Color(255, 102, 0));

        PHOTO3.setBackground(new java.awt.Color(255, 204, 102));
        PHOTO3.setOpaque(true);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 255, 255));
        jLabel34.setText("Proteins");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 255, 255));
        jLabel35.setText("Carbs");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 255, 255));
        jLabel36.setText("Fats");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 255, 255));
        jLabel37.setText("Fibre");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 255, 255));
        jLabel38.setText("CALORIES");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 255, 255));

        proteinsA2.setBackground(new java.awt.Color(255, 204, 204));
        proteinsA2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proteinsA2.setForeground(new java.awt.Color(153, 153, 153));
        proteinsA2.setText("0");

        fatsA2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fatsA2.setForeground(new java.awt.Color(153, 153, 153));
        fatsA2.setText("0");

        fibreA2.setBackground(new java.awt.Color(153, 153, 153));
        fibreA2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fibreA2.setForeground(new java.awt.Color(153, 153, 153));
        fibreA2.setText("0");

        caloriesA2.setBackground(new java.awt.Color(255, 204, 204));
        caloriesA2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        caloriesA2.setForeground(new java.awt.Color(153, 153, 153));
        caloriesA2.setText(".");

        carbsA2.setBackground(new java.awt.Color(255, 204, 204));
        carbsA2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        carbsA2.setForeground(new java.awt.Color(153, 153, 153));
        carbsA2.setText("0");

        jLabel40.setBackground(new java.awt.Color(204, 51, 0));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel40.setText("X");
        jLabel40.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel40MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel40MouseMoved(evt);
            }
        });
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PHOTO3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(caloriesA2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carbsA2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(proteinsA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fibreA2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fatsA2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel40)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PHOTO3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel36)
                            .addComponent(jLabel39)
                            .addComponent(fatsA2)
                            .addComponent(proteinsA2)))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(fibreA2)
                    .addComponent(carbsA2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(caloriesA2)))
        );

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 660, 110));

        jLabel42.setText("jLabel14");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1190, 150));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jLabel19.setText("jLabel18");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1310, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BreakFast1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreakFast1MouseEntered
        // TODO add your handling code here:
        
        jPanel3.setVisible(true);
        String s=BreakFast1.getText();
        conn();
        try{
            if(choiceDiet.VEGETARIAN.isSelected()) {
                    if(choiceDiet.fatfull.isSelected()){
                         ps=con.prepareStatement("Select * from breakfast_vegff where name=?");
                         ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO1.getWidth(),PHOTO1.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO1.setIcon(img1);
                        proteinsA.setText(rs.getString("proteins"));
                        carbsA.setText(rs.getString("carbs"));
                        fatsA.setText(rs.getString("fats"));
                        fibreA.setText(rs.getString("fiber"));
                        caloriesA.setText(rs.getString("calorie"));
                
                }
                    }
                    else if(choiceDiet.fatless.isSelected()){
                        ps=con.prepareStatement("Select * from breakfast_veg where name=?");
                        ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO1.getWidth(),PHOTO1.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO1.setIcon(img1);
                        proteinsA.setText(rs.getString("proteins"));
                        carbsA.setText(rs.getString("carbs"));
                        fatsA.setText(rs.getString("fats"));
                        fibreA.setText(rs.getString("fiber"));
                        caloriesA.setText(rs.getString("calorie"));
                
                }
                        
                    }
                  }
             if(choiceDiet.NON_VEGETARIAN.isSelected()){
                     ps=con.prepareStatement("Select * from breakfast_vegff  where name=?");
                     ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO1.getWidth(),PHOTO1.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO1.setIcon(img1);
                        proteinsA.setText(rs.getString("proteins"));
                        carbsA.setText(rs.getString("carbs"));
                        fatsA.setText(rs.getString("fats"));
                        fibreA.setText(rs.getString("fiber"));
                        caloriesA.setText(rs.getString("calorie"));
                }
        }
             
        }
                  catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }//GEN-LAST:event_BreakFast1MouseEntered

    private void jLabel24MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseDragged
        // TODO add your handling code here:
        jLabel6.setBackground(Color.RED);
    }//GEN-LAST:event_jLabel24MouseDragged

    private void jLabel24MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseMoved
        // TODO add your handling code here:
        jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel24MouseMoved

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        // TODO add your handling code here:
        jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
        jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel24MouseExited

    private void launch_main2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launch_main2MouseEntered
        // TODO add your handling code here:
        jPanel8.setVisible(true);
        String s=launch_main2.getText();
        conn();
        try{
             if(choiceDiet.VEGETARIAN.isSelected()){
         ps=con.prepareStatement("Select * from  launch_veg where name=?");
            }
            else if(choiceDiet.NON_VEGETARIAN.isSelected()){
         ps=con.prepareStatement("Select * from  non_veg where name=?");
            }
        
                ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO2.getWidth(),PHOTO2.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO2.setIcon(img1);
                        proteinsA1.setText(rs.getString("proteins"));
                        carbsA1.setText(rs.getString("carbs"));
                        fatsA1.setText(rs.getString("fats"));
                        fibreA1.setText(rs.getString("fiber"));
                        caloriesA1.setText(rs.getString("calorie"));
                
                }
        }
                 catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_launch_main2MouseEntered

    private void launch_main2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launch_main2MouseExited
        // TODO add your handling code here:
        //jPanel8.setVisible(false);
    }//GEN-LAST:event_launch_main2MouseExited

    private void baji_main1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baji_main1MouseEntered
        // TODO add your handling code here:
        jPanel8.setVisible(true);
        String s=baji_main1.getText();
        try{
       
                     ps=con.prepareStatement("Select * from baji_veg  where name=?");
                     ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO2.getWidth(),PHOTO2.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO2.setIcon(img1);
                        proteinsA1.setText(rs.getString("proteins"));
                        carbsA1.setText(rs.getString("carbs"));
                        fatsA1.setText(rs.getString("fats"));
                        fibreA1.setText(rs.getString("fiber"));
                        caloriesA1.setText(rs.getString("calorie"));
                
                }
        }
        
        catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_baji_main1MouseEntered

    private void baji_main1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baji_main1MouseExited
        // TODO add your handling code here:
        //jPanel8.setVisible(false);
    }//GEN-LAST:event_baji_main1MouseExited

    private void dinner_main2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinner_main2MouseEntered
        // TODO add your handling code here:
       jPanel9.setVisible(true);
        String s=dinner_main2.getText();
        conn();
        try{
            if(choiceDiet.VEGETARIAN.isSelected()){
         ps=con.prepareStatement("Select * from  launch_veg where name=?");
            }
            else if(choiceDiet.NON_VEGETARIAN.isSelected()){
         ps=con.prepareStatement("Select * from  non_veg where name=?");
            }
                ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO3.getWidth(),PHOTO3.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO3.setIcon(img1);
                        proteinsA2.setText(rs.getString("proteins"));
                        carbsA2.setText(rs.getString("carbs"));
                        fatsA2.setText(rs.getString("fats"));
                        fibreA2.setText(rs.getString("fiber"));
                        caloriesA2.setText(rs.getString("calorie"));
                
                }
        }
    
                 catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_dinner_main2MouseEntered

    private void dinner_main2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinner_main2MouseExited
        // TODO add your handling code here:
       // jPanel9.setVisible(false);
    }//GEN-LAST:event_dinner_main2MouseExited

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        jPanel9.setVisible(false);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel40MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseMoved

    private void jLabel40MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseDragged

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel32MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseMoved

    private void jLabel32MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseDragged

    private void baji_main2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baji_main2MouseEntered
        // TODO add your handling code here:
        jPanel8.setVisible(true);
        String s=baji_main2.getText();
        try{
       
                     ps=con.prepareStatement("Select * from baji_veg  where name=?");
                     ps.setString(1, s);         
                rs=ps.executeQuery();
                if(rs.next()){    
                byte[] img;
                img = rs.getBytes("photo");
           
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        Image myImg=im.getScaledInstance(PHOTO3.getWidth(),PHOTO3.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon img1=new ImageIcon(myImg);
                       PHOTO3.setIcon(img1);
                        proteinsA2.setText(rs.getString("proteins"));
                        carbsA2.setText(rs.getString("carbs"));
                        fatsA2.setText(rs.getString("fats"));
                        fibreA2.setText(rs.getString("fiber"));
                        caloriesA2.setText(rs.getString("calorie"));
                
                }
        }
        
        catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_baji_main2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int click=0;
        click++;
        if(click>0){
            jButton1.setEnabled(false);
        }
         i1=Integer.parseInt(caloriesA1.getText());
       int i=Integer.parseInt(calb.getText());
       i1=i1+i;
       
       calb.setText(Integer.toString(i1));
        FInalHome.jLabel4.setText(Integer.toString(i1));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try {
                // TODO add your handling code here:
                int click=0;
                click++;
                if(click>0){
                    jButton2.setEnabled(false);
                }
                i1=Integer.parseInt(caloriesA.getText());
                int i=Integer.parseInt(calb.getText());
                i1=i1+i;
                
                calb.setText(Integer.toString(i1));
                FInalHome.jLabel4.setText(Integer.toString(i1));
                
                ps=con.prepareStatement("insert into monday");
            } catch (SQLException ex) {
                Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int click=0;
        click++;
        if(click>0){
            jButton3.setEnabled(false);
        }
         i1=Integer.parseInt(caloriesA2.getText());
       int i=Integer.parseInt(calb.getText());
       i1=i1+i;
       
       calb.setText(Integer.toString(i1));
        FInalHome.jLabel4.setText(Integer.toString(i1));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
         //intercept the window close event so that data can be saved to disk at this point
    if (evt.getNewState()==WindowEvent.WINDOW_CLOSED){
        // inventoryInterface.getInventory().saveIndexToFile();
        System.out.println("saving");
        dispose();  //dispose the frame
    }       
    }//GEN-LAST:event_formWindowStateChanged

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        // jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        // jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        //  System.exit(0);
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        // TODO add your handling code here:
        // jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseDragged
        // TODO add your handling code here:
        //  jLabel6.setBackground(Color.RED);
    }//GEN-LAST:event_jLabel14MouseDragged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        calb.setText("0");
        if(choiceDiet.VEGETARIAN.isSelected()) {
            if(choiceDiet.fatfull.isSelected()){
                breakFF();
                launch_dal();
                fatFullbaji();
            }
            else if(choiceDiet.fatless.isSelected()){
                breakF();
                launch_dal();
                fatLessbaji();

            }
        }
        if(choiceDiet.NON_VEGETARIAN.isSelected()){
            launch_DinnerNv();
            breakNF();

        }
        int click=0;

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(choiceDiet.VEGETARIAN.isSelected()) {
            if(choiceDiet.fatfull.isSelected()){
                breakFF();
                launch_dal();
                fatFullbaji();
            }
            else if(choiceDiet.fatless.isSelected()){
                breakF();
                launch_dal();
                fatLessbaji();

            }
        }
        if(choiceDiet.NON_VEGETARIAN.isSelected()){
            launch_DinnerNv();
            breakNF();

        }
        int click=0;
        if(click>0){
            jButton6.setVisible(true);
        }

        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String query="Select uid from login1 WHERE Fname='"+user.getText()+"'" ;
        try {
            //                int i=Integer.parseInt(DietGenerator.calb3.getText());
            int i12;
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            //ResultSet r1;
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root","");
            Calendar c=Calendar.getInstance();
            int a;
            int day=c.get(Calendar.DAY_OF_WEEK);
            int date=c.get(Calendar.DAY_OF_YEAR);
            switch (day) {

                case 1:

                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into sunday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update sunday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    
                }
                break;

                case 2:

                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into monday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update monday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
                }
                break;
                case 3:
                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into tuesday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update tuesday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
                }
                case 4:
                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into wednesday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update wednesday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
                }
                case 5:
                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into thursday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update thursday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
                }
                case 6:
                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into friday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update friday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
                }
                case 7:
                try{

                    pst = con.prepareStatement(query);
                    r2=pst.executeQuery();
                    i12=Integer.parseInt(calb.getText());
                    if(r2.next()){
                        a=r2.getInt(1);
                        System.out.println(a);

                        String query2="insert into saturday1 values ('"+a+"','"+i12+"','"+date+"')";
                        s= con.createStatement();

                        s.executeUpdate(query2);
                    }
                }catch(SQLException e){
                    a=r2.getInt(1);
                    i12=Integer.parseInt(calb.getText());
                    String query2="update saturday1 SET cg='"+i12+"' where uid='"+a+"'";
                    s= con.createStatement();

                    s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(null,"LoginUNSuccesful.....BYE");
                }
                default:
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DietGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Workout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(DietGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DietGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DietGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DietGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DietGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BreakFast1;
    private javax.swing.JLabel PHOTO1;
    private javax.swing.JLabel PHOTO2;
    private javax.swing.JLabel PHOTO3;
    private javax.swing.JLabel baji_main1;
    private javax.swing.JLabel baji_main2;
    private javax.swing.JLabel calb;
    private javax.swing.JLabel caloriesA;
    private javax.swing.JLabel caloriesA1;
    private javax.swing.JLabel caloriesA2;
    private javax.swing.JLabel carbsA;
    private javax.swing.JLabel carbsA1;
    private javax.swing.JLabel carbsA2;
    private javax.swing.JLabel dinner_main2;
    private javax.swing.JLabel fatsA;
    private javax.swing.JLabel fatsA1;
    private javax.swing.JLabel fatsA2;
    private javax.swing.JLabel fibreA;
    private javax.swing.JLabel fibreA1;
    private javax.swing.JLabel fibreA2;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel launch_main2;
    private javax.swing.JLabel proteinsA;
    private javax.swing.JLabel proteinsA1;
    private javax.swing.JLabel proteinsA2;
    public static javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
