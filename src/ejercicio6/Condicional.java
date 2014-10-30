package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {

    private String articulo;
    private double ventas;

    public Condicional() {

    }

    public String articulo() {
        String respuesta = JOptionPane.showInputDialog("Articulo: ");
        return respuesta;
    }

    public double ventas() {
        String respuesta = JOptionPane.showInputDialog("Ventas: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }

    public void comparar(String a, double v) {
        articulo = a;
        ventas = v;
        if (v <= 100) {
            JOptionPane.showMessageDialog(null, a + " es de consumo BAJO.");
        } else if (v > 100 && v <= 500) {
            JOptionPane.showMessageDialog(null, a + " es de consumo MEDIO.");
        } else if (v > 500 && v <= 1000) {
            JOptionPane.showMessageDialog(null, a + " es de consumo ALTO.");
        } else if (v > 1000) {
            JOptionPane.showMessageDialog(null, a + " es de consumo de PRIMERA NECESIDAD");
        }
    }
}
