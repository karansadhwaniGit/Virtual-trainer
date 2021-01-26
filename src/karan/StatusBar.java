/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karan;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author karan
 */
public class StatusBar extends JPanel implements ActionListener{
    Timer t=new Timer(10,this);
    Color c;
    boolean stop=false;
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        setBackground(c);
    }
    public void confirm(){
        Color c=new Color(46,204,113);
        t.start();
        
        
    }
    public void actionPerformed(ActionEvent e){
        repaint();
        
    }
    public static void main(String a[]){
        new StatusBar().setVisible(true);
        
    }
    
    
}
