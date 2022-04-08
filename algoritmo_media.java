import javax.swing.JOptionPane;

public class algoritmo_media {
    public static void main(String args[]) {
        float n1, n2, n3, media;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 1:"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 2:"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 3:"));
        media = (n1 + n2 + n3) / 3;
        JOptionPane.showMessageDialog(null, "\n A média aritmética é: " + media);

    }

}
