/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Condicional par1=new Condicional();
        String articulo=par1.articulo();
        double ventas=par1.ventas();
        par1.comparar(articulo, ventas);
    }
    
}
