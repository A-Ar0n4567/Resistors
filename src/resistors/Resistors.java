/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors;

import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author aamir7110
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input;
        
        String codes[];
        
        //Color, Code
        String colorCodes[][] = new String[10][10];
        
        colorCodes[0][0] = "black";
        colorCodes[0][1] = "0";
        colorCodes[1][0] = "Brown";
        colorCodes[1][1] = "1";
        colorCodes[2][0] = "Red";
        colorCodes[2][1] = "2";
        colorCodes[3][0] = "Orange";
        colorCodes[3][1] = "3";
        colorCodes[4][0] = "Yellow";
        colorCodes[4][1] = "4";
        colorCodes[5][0] = "Green";
        colorCodes[5][1] = "5";
        colorCodes[6][0] = "Blue";
        colorCodes[6][1] = "6";
        colorCodes[7][0] = "Violet";
        colorCodes[7][1] = "7";
        colorCodes[8][0] = "Grey";
        colorCodes[8][1] = "8";
        colorCodes[9][0] = "White";
        colorCodes[9][1] = "9";
        
        input = JOptionPane.showInputDialog("Enter the color code of your resistor separated only by spaces");
        
        codes = input.split(" ");
        
        for( int i = 0; i < codes.length; i++){
            System.out.println(codes[i]);
            
            for( int k = 0; k < 10; k++){
                if(codes[k].equals(colorCodes[k][0])){
                 
                    System.out.println("The code is "+colorCodes[k][1]);
                }else{
                    System.out.println("oof dog");
                }
            }
        }
    }
    
}
