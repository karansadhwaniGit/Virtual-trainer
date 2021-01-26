/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karan;

import java.util.Calendar;

/**
 *
 * @author karan
 */
public class abc {
    public static void main(String a1[]){
    Calendar c=Calendar.getInstance();
    int a;
    a=c.get(Calendar.DATE);
    
    System.out.println("Day:"+a);
    while(true){
    if(Calendar.MINUTE!=a){
        System.out.println("HI");
        System.out.println("Day:"+a);
    }
    }
    }
}
