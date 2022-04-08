import javax.swing.JOptionPane;

public class algoritmo_exame {
    public static void main(String args[]) {
        float prova1, prova2, prova3, media, media_final, exame_final;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 1: "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 2: "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 3: "));
        media = (prova1 + prova2 + prova3) / 3;
        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "APROVADO:");
        } else if (media < 7.0) {
            exame_final = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do exame: "));
            media_final = (media + exame_final) / 2;
            if (media_final >= 5.0) {
                JOptionPane.showMessageDialog(null, "APROVADO.");
            } else {
                JOptionPane.showMessageDialog(null, "REPROVADO.");
            }
        }

    }
}
