
package bol9.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Calcular {
    private float num = this.pedirNum();

    public float pedirNum() {

        do {
            String dato = JOptionPane.showInputDialog("Introducir número de Elementos");
            num = Float.parseFloat(dato);
        } while (num <= 0);
        return num;
    }

    public String seriePar() {

        float tabla = 0;
        String serietabla = "";

        for (int i = 0; i < num; i++) {
            tabla= tabla + 2;
            serietabla += " " + tabla;
        }
        return serietabla;
    }

    public String serieImparPar() {

        String serie = "";
        

        for (int i = 1; i < num + 1; i++) {
            if (i % 2 == 0) {
                serie = serie + "+" + i;
            }
            if (i % 2 == 1) {
                serie += "-" + i;
            }
        }
        return serie;
    }

    public String serieFibonacci() {

        float fib1 = 0;
        float fib2 = 1;
        float fib3 = 0;
        String serie = fib1 + "," + fib2;

        for (int i = 2; i < num; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            serie += "," + fib3;

        }
        return serie;
    }

    public void calcularSeries() {
        String serie = ("Serie 1: " + this.seriePar() + "\nSerie 2: " + this.serieImparPar() + "\nSerie 3: " + this.serieFibonacci());
        JOptionPane.showMessageDialog(null, serie);
    }
}