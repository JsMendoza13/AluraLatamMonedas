import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Object[] options = {"Convertir Monedas", "Salir"};
        int escoger = JOptionPane.showOptionDialog(null, "Bienvenido", "conversor de divisas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,
        options,options[0]);

        if (escoger ==1){
            JOptionPane.showMessageDialog(null,"Adios, vuelva pronto.");
            System.exit(0);
        }
        if (escoger ==0) {
            DecimalFormat formatearDivisas = new DecimalFormat("#.##");
        }

    }
}