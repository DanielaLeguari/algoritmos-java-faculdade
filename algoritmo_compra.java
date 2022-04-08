import javax.swing.JOptionPane;

public class algoritmo_compra {
    public static void main(String args[]) {
        float valor_venda, valor_unitario;
        int cod_produto, quantidade;
        String nome;

        cod_produto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
        nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        valor_unitario = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor Unitário R$ "));
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        valor_venda = valor_unitario * quantidade;
        JOptionPane.showMessageDialog(null, "\nO código do produto: " + cod_produto +
                                            "\nNome do produto: " + nome +
                                            "\nQuantidade: " + quantidade +
                                            "\nValor Unitário R$ " + valor_unitario +
                                            "\nValor Total R$ " + valor_venda);

    }
}
