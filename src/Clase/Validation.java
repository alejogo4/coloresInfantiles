/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import javax.swing.JOptionPane;

public class Validation {
    int cont;
    
    public void Onlytext(char letter, java.awt.event.KeyEvent evt){
   
    if(Character.isDigit(letter)){
    evt.consume();
    JOptionPane.showMessageDialog(null,"Only text!!","Error",JOptionPane.ERROR_MESSAGE);
    
    }
}
    
    public void Onlynumber(char num, java.awt.event.KeyEvent evt){
    if(Character.isLetter(num)){
    evt.consume();
    JOptionPane.showMessageDialog(null,"Only numbers!!","Error",JOptionPane.ERROR_MESSAGE);
    
    }
}
    public void validar1(char data, java.awt.event.KeyEvent evt, int cant){

      if(cant<10){
      Onlynumber(data,evt);
      }
      else{
      evt.consume();
      }
}
    public void validar2(char data, java.awt.event.KeyEvent evt, int cant){

      if(cant<2){
      Onlynumber(data,evt);
      }
      else{
      evt.consume();
      }
}
}
