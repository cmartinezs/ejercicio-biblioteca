package vista;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author HermanG
 */
public class VentanaPokedex extends JFrame {

    public ArrayList<JButton> listaBotones = new ArrayList<JButton>();
    JButton boton = new JButton();

    public VentanaPokedex() {
        super("Pokedex");
        setSize(450, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container contenedor = getContentPane();

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(31, 5, 5, 5));
        jp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 1; i < 152; i++) {
            String a = String.valueOf(i);
            JButton button = new JButton(new ImageIcon(((new ImageIcon("resources/"+ a +".PNG")).
            getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)));
            button.setActionCommand(a);
            listaBotones.add(button);
            jp.add(button);
        }

        JScrollPane scroll = new JScrollPane(jp);
        contenedor.add(scroll);
    }
}
