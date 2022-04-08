import javax.swing.JOptionPane;

public class algoritmo_par_impar {
    public static void main(String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if (num % 2 == 0 && num != 0) {
            JOptionPane.showMessageDialog(null, "O numero é par.");
        } else if (num % 2 != 0) {
            JOptionPane.showMessageDialog(null, " O número é ímpar.");
        } else if (num == 0)
            JOptionPane.showMessageDialog(null, " Esse número é zero.");

    }
}
