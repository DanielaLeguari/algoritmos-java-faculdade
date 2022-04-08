import javax.swing.JOptionPane;

public class algoritmo_salario {
    public static void main(String args[]) {
        String nome;
        double salario, salario_reaj;
        nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário:"));
        salario_reaj = (salario + (salario * (8.75 / 100)));
        JOptionPane.showMessageDialog(null, "\nNome do funcionário: " + nome +
                                            "\nSalário R$ " + salario +
                                            "\nSalário Reajustado R$ " + salario_reaj);

    }
}
