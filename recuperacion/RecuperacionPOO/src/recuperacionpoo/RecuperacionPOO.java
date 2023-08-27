
package recuperacionpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import vista.Estudiante;
import vista.Profesor;
import vista.horario;

public class RecuperacionPOO extends JFrame {

public RecuperacionPOO(){
     setTitle("Menú Principal");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu estudianteMenu = new JMenu("Estudiantes");
        JMenu profesorMenu = new JMenu("Profesores");
        JMenu horarioMenu = new JMenu("Horarios");

        JMenuItem estudianteItem = new JMenuItem("Estudiantes");
        estudianteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiante estudianteFrame = new Estudiante();
                estudianteFrame.setVisible(true);
            }
        });

        JMenuItem profesorItem = new JMenuItem("Profesores");
        profesorItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Profesor profesorFrame = new Profesor();
                profesorFrame.setVisible(true);
            }
        });

        JMenuItem horarioItem = new JMenuItem("Horarios");
        horarioItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                horario horarioFrame = new horario();
                horarioFrame.setVisible(true);
            }
        });

        estudianteMenu.add(estudianteItem);
        profesorMenu.add(profesorItem);
        horarioMenu.add(horarioItem);

        menuBar.add(estudianteMenu);
        menuBar.add(profesorMenu);
        menuBar.add(horarioMenu);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                RecuperacionPOO re = new RecuperacionPOO();
                re.setVisible(true);
            }
        });
    }
}




