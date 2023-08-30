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
            boolean siguePrograma = true;
            while (siguePrograma){
                String [] optiones = {"Pesos Colombianos A Euros",
                        "Pesos Colombianos A Dolar U.S.A",
                        "Pesos Colombianos A Libras Esterlinas £",
                        "Pesos Colombianos A Yen ¥",
                        "Pesos Colombianos A Won ₩"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija su tipo de cambio: ",
                        "Convertir Monedas", JOptionPane.QUESTION_MESSAGE, null, options,optiones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad en Pesos Colombianos: ");

                double pesos = 0;
                try{
                    pesos = Double.parseDouble(input);
                }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor incorrecto ");
                }

                if (cambio.equals("Pesos Colombianos A Euros")){
                    double dolares = pesos / 4098;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: " + formatearDivisas.format(dolares)
                            + " Dolares. ");

                } else if(cambio.equals("Pesos Colombianos A Dolar U.S.A")){
                    double euro = pesos / 4479;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: " + formatearDivisas.format(euro)
                            + " Euros. ");

                }else if(cambio.equals("Pesos Colombianos A Libras Esterlinas £")){
                    double libras = pesos / 5213;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: " + formatearDivisas.format(libras)
                            + " Libras Esterlinas. ");

                }else if(cambio.equals("Pesos Colombianos A Yen ¥")){
                    double yen = pesos / 28;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: " + formatearDivisas.format(yen)
                            + " Yenes. ");

                }else if(cambio.equals("Pesos Colombianos A Won ₩")){
                    double won = pesos / 3010;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: " + formatearDivisas.format(won)
                            + " Wons. ");
                }

            }
        }
    }
}