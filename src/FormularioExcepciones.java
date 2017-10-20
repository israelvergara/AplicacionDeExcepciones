import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioExcepciones {
    private JButton button1;
    private JPanel panel1;
    //private JTextField Nombre;
    private JTextField Numero1;
    private JTextField Numero2;

    public FormularioExcepciones() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //System.out.println("Hola "+ Nombre.getText());
                try {

                    int num1 = Integer.parseInt(Numero1.getText());
                    int num2 = Integer.parseInt(Numero2.getText());
                    int resultado = num1 / num2;


                 JOptionPane.showMessageDialog(null, "La Division de "
                        + Numero1.getText() + " y " + Numero2.getText()
                        + " es " + resultado);
                 }
                catch(ArithmeticException ExcepcionAritmetica)
                {
                    JOptionPane.showMessageDialog(null, "No puedes dividir entre cero ");
                }
                catch(NumberFormatException ExcepcionDeFormatoDeNumero)
                {
                    JOptionPane.showMessageDialog(null, "Porfavor solo introduce numeros");
                }
                }
        });
    }

    public static void main(String[] args) {
        FormularioExcepciones formulario = new FormularioExcepciones();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);

    }


}
