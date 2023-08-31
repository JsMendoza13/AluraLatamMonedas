import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Object[] options = {"Convertir Divisas","Salir"};
        int escoger = JOptionPane.showOptionDialog(null, "Bienvenido a ChangeMoney Js", "ChangeMoney Js",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,
        options,options[0]);

        if (escoger ==1){
            JOptionPane.showMessageDialog(null,"Adiós, vuelva pronto.");
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
                        "Convertir Monedas", JOptionPane.QUESTION_MESSAGE, null, optiones,optiones[0]);


                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad en Pesos Colombianos: ");


                double pesos = 0.00;
                try{
                    pesos = Double.parseDouble(input);
                }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo ","Valor Incorrecto  ", JOptionPane.YES_OPTION);
                }

                if (cambio.equals("Pesos Colombianos A Dolar U.S.A")){
                    double dolares = pesos / 4098.53;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son: " + formatearDivisas.format(dolares)
                            + " Dolares. ");

                } else if(cambio.equals("Pesos Colombianos A Euros")){
                    double euro = pesos / 4480.37;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son: " + formatearDivisas.format(euro)
                            + " Euros. ");

                }else if(cambio.equals("Pesos Colombianos A Libras Esterlinas £")){
                    double libras = pesos / 5211.85;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son: " + formatearDivisas.format(libras)
                            + " Libras Esterlinas. ");

                }else if(cambio.equals("Pesos Colombianos A Yen ¥")){
                    double yen = pesos / 28.06;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son: " + formatearDivisas.format(yen)
                            + " Yenes. ");

                }else if(cambio.equals("Pesos Colombianos A Won ₩")){
                    double won = pesos / 3.10;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son: " + formatearDivisas.format(won)
                            + " Wons. ");
                }

                int confirmar = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?", "Continuar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION){
                    siguePrograma = false;
                    JOptionPane.showMessageDialog(null,"Bye ;)");
                }

            }
        }
    }
}