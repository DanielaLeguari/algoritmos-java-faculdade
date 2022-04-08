import javax.swing.JOptionPane;

public class algoritmo_compras_parcelas {
    public static void main(String args[]) {
        double compra, valor_parc=0, opcao, num_parc;
        compra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
        opcao = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 para pagamento à vista ou 2 para pagamento à prazo"));
        if (opcao == 1.0){
            compra = (compra - (compra * 0.05));
        } else if (opcao == 2.0){
            num_parc= Double.parseDouble(JOptionPane.showInputDialog("Digite o número de parcelas (3,5 ou 10)"));
            if (num_parc == 3.0){
                valor_parc = compra / 3;
            } else if (num_parc == 5.0){
                compra = compra +(compra * 0.02);
                valor_parc = compra / 5;
            } else if (num_parc == 10.0){
             compra = compra +(compra * 0.08); 
             valor_parc = compra / 10;
            } 
        }
        JOptionPane.showMessageDialog(null, "O valor Total da compra R$"+compra);
        JOptionPane.showMessageDialog(null, "O valor da parcela R$"+valor_parc); 
    }
}
