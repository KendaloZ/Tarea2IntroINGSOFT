import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        double saldo = 0;
        String tipoTransaccion = "9";
        int valor = 0;
        boolean continuar = false;
        do {
            JOptionPane.showMessageDialog(null,
                    "Ingrese 0 para consultar su saldo\n" + "1 para hacer un deposito\n" + "2 para hacer un retiro");
            tipoTransaccion = JOptionPane.showInputDialog("Ingrese el tipo de transaccion:");
            switch (tipoTransaccion) {
                case "0":
                    JOptionPane.showMessageDialog(null,"Su saldo es de:" + valor);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Registrando un retiro");
                    String inpud = JOptionPane.showInputDialog("Ingrese el valor:");
                    valor = Integer.parseInt(inpud);

                    if (valor > saldo) {
                        JOptionPane.showMessageDialog(null, "Transaccion invalida, fondos insuficientes");
                    } else {
                        saldo = saldo - valor;
                    }
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de:" + saldo);
                    break;

                case "1":
                JOptionPane.showMessageDialog(null, "Registrando un deposito");
                    inpud = JOptionPane.showInputDialog("Ingrese el valor:");
                    valor = Integer.parseInt(inpud);
                    saldo = saldo + valor;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de:" + saldo);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de transaccion invalidada");
                    break;
            }

            String inpud = JOptionPane.showInputDialog("Ingrese true si desea continuar, false para finalizar");
            continuar = Boolean.parseBoolean(inpud);
        } while (continuar);

    }
}
