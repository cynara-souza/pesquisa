/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cynara.souza
 */
import javax.swing.JOptionPane;
public class JavaApplication1 {
public static void main(String args[])  {
    /**
     * @param args the command line arguments
     */
    int n1, n2, n3, maior=0;
			
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
			n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
			
			
			if (n1>n2){
				if (n1>n3) {
				maior = n1;
				}
				else if (n2>n1){
					if (n2>n3){
					maior = n2;
					}
				}
				else {
				maior = n3;
				}
			}
						
            JOptionPane.showMessageDialog(null, "O maior número entre " + n1 +", " + n2 + " e" +n3+" é: " + maior);
            System.out.println("Maior número: "+maior);
						
            System.exit(0);
            }
    
}
