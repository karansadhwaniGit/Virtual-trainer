/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package karan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author karan
 */
//  PROGRESS BAR AND OPENING LOGIN FORM
//CLEARING THE DATABASE OF FULL WEEK ON MONDAY
public class JLabel1 {
    static PreparedStatement ps;
       public static void main(String a[]){
     splashscreen1 j=new splashscreen1();
     j.setVisible(true);
        try{
            int i;
                for (i=0;i<=100;i++){
                j.jProgressBar2.setValue(i);
                  Thread.sleep(40);
                if(i==100){ j.setVisible(false);   
                new karan1().setVisible(true);}
                j.jLabel2.getText();  
                }
                Calendar c=Calendar.getInstance();
                int a1=c.get(Calendar.DAY_OF_WEEK);
                int a2=a1/3;                
                System.out.println(a2);
                karan1.txt_user.setText(Integer.toString(a2));                                            
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                         } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ExpDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/LOGIN","root","");
        Statement s=con.createStatement();
        if(a1==1){
        s.executeUpdate("truncate table monday");
        s.executeUpdate("truncate table monday1");
        s.executeUpdate("truncate table tuesday1");
        s.executeUpdate("truncate table tuesday");
        s.executeUpdate("truncate table wednesday");
        s.executeUpdate("truncate table wednesday1");
        s.executeUpdate("truncate table thursday1");
        s.executeUpdate("truncate table thursday");
        s.executeUpdate("truncate table friday1");
        s.executeUpdate("truncate table friday");
        s.executeUpdate("truncate table saturday");
        s.executeUpdate("truncate table saturay1");
        s.executeUpdate("truncate table sunday");
        s.executeUpdate("truncate table sunday1");
        }          
        }
        
catch(InterruptedException | SQLException e){}
                       }
        }
       