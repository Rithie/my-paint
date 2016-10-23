/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrushapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Rithie7
 */

public class FramePrincipal extends JFrame{
    
    public FramePrincipal()
    {
      
       this.setSize(400,400);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setTitle("PaintBrush");
       
   
       this.add(new Tela());
     
       this.setVisible(true);
    }
}







    
    

   
    
   

