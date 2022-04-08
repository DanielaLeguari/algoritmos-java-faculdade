import javax.swing.JOptionPane;

public class algoritmo_desconto {
    public static void main(String args[]) {
        double prec_atual, preco_desc;
        prec_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
        preco_desc = (prec_atual - (prec_atual * (10.0 / 100.0)));
        JOptionPane.showMessageDialog(null, "\nO preço sem desconto R$ " + prec_atual +
                                            "\nO preço com desconto R$ " + preco_desc);
    }
}
