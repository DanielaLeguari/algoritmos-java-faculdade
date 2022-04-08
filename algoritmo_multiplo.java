import javax.swing.JOptionPane;

public class algoritmo_multiplo {
    public static void main(String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (num % 3 == 0) {
            JOptionPane.showMessageDialog(null, "É multiplo de 3.");
        } else if (num % 7 == 0) {
            JOptionPane.showMessageDialog(null, "É multiplo de 7.");
        } else {
            JOptionPane.showMessageDialog(null, "Esse número não é multiplo nem de 3 nem de 7.");
        }
    }

}
