
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args){
       int opcion=0;
       int opcion1=0;
       String num1="";
       String num2="";
       double suma= 0;
       double resta=0;
       double multiplicacion=0;
       double division=0;
       double potencia=1;
       double raiz= Math.sqrt(0);
       //double resta=Double.parseDouble(num1)-Double.parseDouble(num2);
       // double potencia=num1+num2;
      // double raiz=num1+num2;
               
       do{ 
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n "
                    + "1.Realizar una operacion\n "
                    + "2.salir"));

        } while (opcion != 1 && opcion != 2) ;
       
       

        switch (opcion) {
            case 1:
            opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una operación:\n "
                    + "1.Suma\n "
                    + "2.Resta\n "
               + "3.Multiplicación\n "
               + "4.División\n "
               + "5.Potencia\n "
               + "6.Raiz\n "
               + "7.Salir"));
            
            case 2:
                break;
           } 
        
            switch (opcion1){     
                case 1:
           num1=JOptionPane.showInputDialog("Ingrese el primer numero"); 
           num2=JOptionPane.showInputDialog("Ingrese el segundo numero");
           suma=Double.parseDouble(num1)+Double.parseDouble(num2);
           JOptionPane.showMessageDialog(null,"La suma es=" + suma);
           break;
              
                 
                case 2:
           num1=JOptionPane.showInputDialog("Ingrese el primer numero"); 
           num2=JOptionPane.showInputDialog("Ingrese el segundo numero");
           resta=Double.parseDouble(num1)- Double.parseDouble(num2);
           JOptionPane.showMessageDialog(null,"La resta es=" + resta);
           break;
       
       
                case 3:
           num1=JOptionPane.showInputDialog("Ingrese el primer numero"); 
           num2=JOptionPane.showInputDialog("Ingrese el segundo numero");
           multiplicacion=Double.parseDouble(num1)* Double.parseDouble(num2);
           JOptionPane.showMessageDialog(null,"La multiplicacion es=" + multiplicacion);
           break;
           
                case 4:
           num1=JOptionPane.showInputDialog("Ingrese el primer numero"); 
           num2=JOptionPane.showInputDialog("Ingrese el segundo numero");
           division=Double.parseDouble(num1)/ Double.parseDouble(num2);
           JOptionPane.showMessageDialog(null,"La división es=" + division);
           break;
    
                case 5:
                   
           num1=JOptionPane.showInputDialog("Ingrese el primer numero"); 
           num2=JOptionPane.showInputDialog("Ingrese el segundo numero");
           for (double i=1;i<=Double.parseDouble(num2);i++)
           {potencia=potencia*Double.parseDouble(num1);}
           JOptionPane.showMessageDialog(null,"La potencia es=" + potencia);
           break;
    
           case 6:
                   
           num1=JOptionPane.showInputDialog("Ingrese el numero"); 
           raiz=Math.sqrt(Double.parseDouble(num1));
           JOptionPane.showMessageDialog(null,"La raiz es=" + raiz);
           break;
           
           case 7:
           
           break;
    }  
}
}

       
 

        
    
           


     
