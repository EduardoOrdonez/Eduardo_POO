
package vista;

import controller.conexion;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controller.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class Profesor extends JFrame{
 // heredando del jframe
    
    public JPanel panel;
    conexion cc=new conexion();
    Connection con=(Connection) cc.conexion();
    JTextField txtTitulo;
    JTextField txtAsignatura;
    JTextField txtNombre;
    JTextField txtApellido;   
    JTextField txtMail;
    JTextField txtCedula;
    JComboBox<String> combo1;
    JTable table;
     
     public Profesor(){
        this.setSize(1000, 1000);
        setTitle("Profesores");// nombre de la ventana
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
    public void colocarPanel() {//colocando el panel
        panel = new JPanel();
        panel.setBackground(Color.ORANGE);//color para el panel
        this.getContentPane().add(panel);//agragar el panel
    }
    
    public void colocarEtiqueta(){
        JLabel label = new JLabel("PROFESOR", SwingConstants.CENTER);//objeto para el label
        panel.add(label);// se agrega al panel
        panel.setLayout(null);
        label.setBounds(400, 10, 200, 25);//dimensiones
        label.setForeground(Color.WHITE);//color de la letra 
        label.setBackground(Color.ORANGE);// color del fondo
        label.setOpaque(true);
        
        JLabel label2 = new JLabel("Titulo:");//objeto para el label
        panel.add(label2);// se agrega al panel
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 15));// tipo de letra y tamaño
        label2.setBounds(10, 90, 100, 25);//dimensiones
        
        JLabel label3 = new JLabel("Asignatura:");//objeto para el label
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);
        
        
        JLabel label4 = new JLabel("Nombre:");
        panel.add(label4);
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(10, 170, 100, 25);
        
        JLabel label5 = new JLabel("Apellido:");
        panel.add(label5);
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(10, 210, 100, 25);
        
        JLabel label6 = new JLabel("Mail:");
        panel.add(label6);
        label6.setHorizontalAlignment(SwingConstants.LEFT);
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setBounds(10, 250, 100, 25);
        
        JLabel label7 = new JLabel("Cedula:");
        panel.add(label7);
        label7.setHorizontalAlignment(SwingConstants.LEFT);
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setBounds(10, 290, 100, 25);
        
        JLabel label8 = new JLabel("Estado:");
        panel.add(label8);
        label8.setHorizontalAlignment(SwingConstants.LEFT);
        label8.setFont(new Font("Arial", Font.PLAIN, 15));
        label8.setBounds(10, 330, 100, 25);
    
    }
    
    public void ColocarCajatexto(){
        txtTitulo= new JTextField();//objeto
        txtTitulo.setBounds(100, 90,250,25);// dimensiones
        panel.add(txtTitulo);
        txtTitulo.setText("");//para que este vacio
        System.out.println("El texto de la caja es:"+txtTitulo.getText());//
        
        txtAsignatura= new JTextField();
        txtAsignatura.setBounds(100,133,250,25);
        panel.add(txtAsignatura);
        txtAsignatura.setText("");
        System.out.println("El texto de la caja es:"+txtAsignatura.getText());
        
        txtNombre= new JTextField();//210
        txtNombre.setBounds(100,170,250,25);
        panel.add(txtNombre);
        txtNombre.setText("");
        System.out.println("El texto de la caja es:"+txtNombre.getText());
        
        txtApellido= new JTextField();//290
        txtApellido.setBounds(100,210,250,25);
        panel.add(txtApellido);
        txtApellido.setText("");
        System.out.println("El texto de la caja es:"+txtApellido.getText());
        
        txtMail= new JTextField();//330
        txtMail.setBounds(100,250,250,25);
        panel.add(txtMail);
        txtMail.setText("");
        System.out.println("El texto de la caja es:"+txtMail.getText());
        
        txtCedula= new JTextField();//375
        txtCedula.setBounds(100,290,250,25);
        panel.add(txtCedula);
        txtCedula.setText("");
        System.out.println("El texto de la caja es:"+txtCedula.getText());
    }
    
    public void colpcarComobox(){
       
        
        combo1 = new JComboBox<>();
        combo1.setBounds(100, 330, 150, 25);
        panel.add(combo1);
        combo1.addItem("Activo");
        combo1.addItem("Inactivo");
        combo1.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(combo1);
     }
    
    public void tabla(){
        String[] columNames= {"Codigo","Titulo","Asignatura","Nombre","Apellido","Mail","Cedula","Estado"};
        DefaultTableModel tableModel= new DefaultTableModel(columNames,0);
        
        table= new JTable(tableModel);
        JScrollPane scrollPane= new JScrollPane(table);
        scrollPane.setBounds(400, 80, 600, 250);
        panel.add(scrollPane);
        mostrarDatos();
        
     }
    public void colocarBotones(){//metodo para los botones
        JButton boton = new JButton("Limpiar");//objeto para le boton
        boton.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 mostrarDatos();
                
                }
        });
        boton.setBounds(15, 420, 100, 30);
        panel.add(boton);// para agregar al panel
        boton.setEnabled(true);// para abilkitar con el true
        boton.setMnemonic('a');
        
        JButton boton1 = new JButton("Guardar");//objeto para le boton
        boton1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 insertarDatos();
                 mostrarDatos();
                
                }
        });
        boton1.setBounds(120, 420, 100, 30);//objeto para le boton
        panel.add(boton1);// para agregar al panel
        boton1.setEnabled(true);// para abilkitar con el true
        boton1.setMnemonic('a');
        
        JButton boton2 = new JButton("Editar");//objeto para le boton
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
        boton2.setBounds(235, 420, 80, 30);//objeto para le boton
        panel.add(boton2);// para agregar al panel
        boton2.setEnabled(true);// para abilkitar con el true
        boton2.setMnemonic('a');
        
        JButton boton3 = new JButton("Eliminar");//objeto para le boton
        boton3.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 int filaSeleccionada = table.getSelectedRow();//ACCION QUE ELIMINA EL REGISTRO DE LA TABLA AL DAR CUN CLICK
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
        return;
    }
    eliminarDatos(filaSeleccionada);
                
                }
        });
        boton3.setBounds(330, 420, 100, 30);
        panel.add(boton3);// para agregar al panel
        boton3.setEnabled(true);// para abilkitar con el true
        boton3.setMnemonic('a');
        
        JButton boton4 = new JButton("Salir");//objeto para le boton
        boton4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Cierra la ventana al hacer clic en el botón "Salir"
            dispose();
        }
    });
        boton4.setBounds(445, 420, 100, 30);
        panel.add(boton4);// para agregar al panel
        boton4.setEnabled(true);// para abilkitar con el true
        boton4.setMnemonic('a');
        
       
     }
    public void insertarDatos() {
        try {
            String SQL = "INSERT INTO profesor(pro_titulo, pro_asignatura,pro_nombre, pro_apellido,"
                    + "  pro_mail,pro_celular,pro_estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, txtAsignatura.getText());
            pst.setString(2, txtTitulo.getText()); // Fixed the ordering
            pst.setString(3, txtNombre.getText()); // Fixed the ordering
            pst.setString(4, txtApellido.getText()); // Fixed the ordering
            pst.setString(5, txtMail.getText());
            pst.setString(6, txtCedula.getText());
            int seleccion1 = combo1.getSelectedIndex();
            pst.setString(7, combo1.getItemAt(seleccion1));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e);
        }
    }
    
    public void mostrarDatos(){
        String titulos[]={"Codigo","Titulo","Asignatura","Nombres","Apellidos","Mail","Celular","Estado"};
        String registro[]=new String [8];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `profesor`";// Cambiar a 'estu2' si ese es el nombre correcto de la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("pro_codigo");
            registro [1]=rs.getString("pro_titulo");
            registro [2]=rs.getString("pro_asignatura");
            registro [3]=rs.getString("pro_nombre");
            registro [4]=rs.getString("pro_apellido");
            registro [5]=rs.getString("pro_mail");
            registro [6]=rs.getString("pro_celular");       
            registro [7]=rs.getString("pro_estado");
            
            modelo.addRow(registro);
        }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
    
    private void eliminarDatos(int filaSeleccionada) {
        String codigoEstudiante = table.getValueAt(filaSeleccionada, 0).toString();
        String SQL = "DELETE FROM profesor WHERE pro_codigo = ?";
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
        model.setValueAt(txtTitulo.getText(), fila, 1); 
        model.setValueAt(txtAsignatura.getText(), fila, 2); 
        model.setValueAt(txtNombre.getText(), fila, 3); 
        model.setValueAt(txtApellido.getText(), fila, 4); 
        model.setValueAt(txtMail.getText(), fila, 5);
        model.setValueAt(txtCedula.getText(), fila, 6);
        model.setValueAt(combo1.getSelectedItem(), fila, 7); 
         
    }
    
}
