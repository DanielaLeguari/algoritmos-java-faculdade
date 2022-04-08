import javax.swing.JOptionPane;

class algoritmo_soma_valores {
    public static void main(String args[]) {
        float n1, n2, n3, n4, soma;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 1:"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 2:"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 3:"));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para número 4:"));
        soma = n1 + n2 + n3 + n4;
        JOptionPane.showMessageDialog(null, "\n A soma dos números é: " +soma);
    }
}
