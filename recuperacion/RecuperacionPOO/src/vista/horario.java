
package vista;

import controller.conexion;
import java.lang.String;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controller.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class horario extends JFrame{
 public JPanel panel;
    conexion cc=new conexion();
    java.sql.Connection con=(java.sql.Connection) cc.conexion();
    JTextField txtDia;
    JTextField txtHora;
    JTextField txtMateria;   
    JComboBox<String> cboEstado;
    JTable table;
     
     public horario(){
        this.setSize(1010, 500);
        setTitle("Horario");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ejecucion al cerrar la ventana
        setLocationRelativeTo(null);//para que centre la ventana al abrir
        iniciarComponentes();
     }
     
     public void iniciarComponentes() {// metodo para agregar las cosas al panel
         colocarPanel();
         colocarEtiqueta();
         ColocarCajatexto();
         colpcarComobox();
         tabla();
         colocarBotones();
         
    }
    public void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiqueta(){
        JLabel label = new JLabel("Horario", SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(400, 10, 200, 25);//dimensiones
        label.setForeground(Color.WHITE); 
        label.setBackground(Color.YELLOW);
        label.setOpaque(true);
        
        JLabel label2 = new JLabel("Dia:");
        panel.add(label2);
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(10, 90, 100, 25);
        
        JLabel label3 = new JLabel("Hora:");
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);
        
        
        JLabel label4 = new JLabel("Materia:");
        panel.add(label4);
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(10, 170, 100, 25);
        
        JLabel label5 = new JLabel("Estado:");
        panel.add(label5);
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(10, 210, 100, 25);
         
    }
    
    public void ColocarCajatexto(){
        txtDia= new JTextField();
        txtDia.setBounds(100, 90,250,25);
        panel.add(txtDia);
        txtDia.setText("");
        System.out.println("El texto de la caja es:"+txtDia.getText());
        
        txtHora= new JTextField();
        txtHora.setBounds(100,133,250,25);
        panel.add(txtHora);
        txtHora.setText("");
        System.out.println("El texto de la caja es:"+txtHora.getText());
        
        txtMateria= new JTextField();
        txtMateria.setBounds(100,170,250,25);
        panel.add(txtMateria);
        txtMateria.setText("");
        System.out.println("El texto de la caja es:"+txtMateria.getText());
        
       
    }
    
    public void colpcarComobox(){
        cboEstado = new JComboBox<>();
        cboEstado.setBounds(100,210,250,25);
        panel.add(cboEstado);
        cboEstado.addItem("Activo");
        cboEstado.addItem("Inactivo");
        cboEstado.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(cboEstado);
     }
    
    public void tabla(){
        String[] columNames= {"Codigo","Dia","Hora","Materia","Estado"};
        DefaultTableModel tableModel= new DefaultTableModel(columNames,0);
        
        table= new JTable(tableModel);
        JScrollPane scrollPane= new JScrollPane(table);
        scrollPane.setBounds(400, 80, 600, 250);
        panel.add(scrollPane);
        mostrarDatos();
        
     }
    public void colocarBotones(){
        JButton boton = new JButton("Limpiar");
        boton.setBounds(15, 250, 100, 30);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        
        boton.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 mostrarDatos();
                limpiarDatos();
                }
        });
        
        JButton boton1 = new JButton("Guardar");
        boton1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 insertarDatos();
                 mostrarDatos();
                
                }
        });
        boton1.setBounds(120, 250, 100, 30);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        JButton boton2 = new JButton("Editar");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada == -1) {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro para editar.");
                    return;
                }
                editarRegistroEnTabla(filaSeleccionada);
            }
        });
        boton2.setBounds(235, 250, 80, 30);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');
        
        JButton boton3 = new JButton("Eliminar");
        boton3.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 int filaSeleccionada = table.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
        return;
    }
    eliminarDatos(filaSeleccionada);
                
                }
        });
        boton3.setBounds(60, 300, 100, 30);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('a');
        
        JButton boton4 = new JButton("Salir");
        boton4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
        boton4.setBounds(200, 300, 100, 30);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('a');
        
       
     }
    public void insertarDatos() {
        try {
            String SQL = "INSERT INTO horario(ho_dia,ho_hora, ho_materia,"
                    + "  ho_estado) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, txtDia.getText());
            pst.setString(2, txtHora.getText()); 
            pst.setString(3, txtMateria.getText()); 
            int seleccion2 = cboEstado.getSelectedIndex();
            pst.setString(4, cboEstado.getItemAt(seleccion2));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e);
        }
    }
    
    public void mostrarDatos(){
        String titulos[]={"Codigo","Dia","Hora","Materia","Estado"};
        String registro[]=new String [5];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `horario`";
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("ho_codigo");
            registro [1]=rs.getString("ho_dia");
            registro [2]=rs.getString("ho_hora");
            registro [3]=rs.getString("ho_materia");
            registro [4]=rs.getString("ho_estado");
            
            modelo.addRow(registro);
        }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
    
    private void eliminarDatos(int filaSeleccionada) {
        String codigoEstudiante = table.getValueAt(filaSeleccionada, 0).toString();
        String SQL = "DELETE FROM horario WHERE ho_codigo = ?";
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, codigoEstudiante);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e);
        }
        mostrarDatos();
    }
    
    private void editarRegistroEnTabla(int fila) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setValueAt(txtDia.getText(), fila, 1); 
        model.setValueAt(txtHora.getText(), fila, 2); 
        model.setValueAt(txtMateria.getText(), fila, 3); 
        model.setValueAt(cboEstado.getSelectedItem(), fila, 4);     
    } 
      public void limpiarDatos(){
        txtDia.setText("");
        txtHora.setText("");
        txtMateria.setText("");
        cboEstado.setSelectedItem(null);    
    }
}