
package vista;

//Importar paquetes y clases
import controller.conexion;
import java.lang.String;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
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


public class Estudiante extends JFrame{
 public JPanel panel;
    conexion cc=new conexion();
    java.sql.Connection con=(java.sql.Connection) cc.conexion();
    JTextField txtCedula;
    JTextField txtNombre;
    JTextField txtApellido;   
    JTextField txtMail;
    JTextField txtTelefono;
    JTextField txtDireccion;
    JComboBox<String> cboMateria;
    JComboBox<String> cboEstado;
    JTable table;
     
     public Estudiante(){
        this.setSize(1200, 500);
        setTitle("Estudiante");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
     }
     
     public void iniciarComponentes() {
         //llamamos a los todos los metodos creados 
         colocarPanel();
         colocarEtiqueta();
         ColocarCajatexto();
         colpcarComobox();
         tabla();
         colocarBotones();
         
    }
     
     
    public void colocarPanel() {
        //creamos un panel
        panel = new JPanel();
        //le asignamos un color 
        panel.setBackground(Color.PINK);
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiqueta(){
          //instanciamos un objeto JLabel y le asignamos el nombre
        JLabel label = new JLabel("Estudiante", SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(400, 10, 200, 50);
        label.setForeground(Color.BLACK); 
        label.setBackground(Color.PINK);
        label.setOpaque(true);
        /// creamos otro objeto
        JLabel label2 = new JLabel("Cedula:");
        //agregamos la etiqueta al panel 
        panel.add(label2);
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        //ubicacion y cambiar la fuente 
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(10, 90, 100, 25);
        
        JLabel label3 = new JLabel("Nombre:");
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);
        
        
        JLabel label4 = new JLabel("Apellido:");
        panel.add(label4);
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(10, 170, 100, 25);
        
        JLabel label5 = new JLabel("Mail:");
        panel.add(label5);
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(10, 210, 100, 25);
        
        JLabel label6 = new JLabel("Telefono:");
        panel.add(label6);
        label6.setHorizontalAlignment(SwingConstants.LEFT);
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setBounds(10, 250, 100, 25);
        
        JLabel label7 = new JLabel("Direccion:");
        panel.add(label7);
        label7.setHorizontalAlignment(SwingConstants.LEFT);
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setBounds(10, 290, 100, 25);
        
        JLabel label8 = new JLabel("Materia:");
        panel.add(label8);
        label8.setHorizontalAlignment(SwingConstants.LEFT);
        label8.setFont(new Font("Arial", Font.PLAIN, 15));
        label8.setBounds(10, 330, 100, 25);
        
        JLabel label9 = new JLabel("Estado:");
        panel.add(label9);
        label9.setHorizontalAlignment(SwingConstants.LEFT);
        label9.setFont(new Font("Arial", Font.PLAIN, 15));
        label9.setBounds(10, 360, 100, 25);
    
    }
    
    public void ColocarCajatexto(){
        //coloca cajas de texto en la interfaz donde los usuarios pueden ingresar datos. 
        //Cada caja de texto se crea y se agrega al panel
        txtCedula= new JTextField();
        txtCedula.setBounds(100, 90,250,25);
        panel.add(txtCedula);
        txtCedula.setText("");
        System.out.println("El texto de la caja es:"+txtCedula.getText());
        
        txtNombre= new JTextField();
        txtNombre.setBounds(100,133,250,25);
        panel.add(txtNombre);
        txtNombre.setText("");
        System.out.println("El texto de la caja es:"+txtNombre.getText());
        
        txtApellido= new JTextField();
        txtApellido.setBounds(100,170,250,25);
        panel.add(txtApellido);
        txtApellido.setText("");
        System.out.println("El texto de la caja es:"+txtApellido.getText());
        
        txtMail= new JTextField();
        txtMail.setBounds(100,210,250,25);
        panel.add(txtMail);
        txtMail.setText("");
        System.out.println("El texto de la caja es:"+txtMail.getText());
        
        txtTelefono= new JTextField();
        txtTelefono.setBounds(100,250,250,25);
        panel.add(txtTelefono);
        txtTelefono.setText("");
        System.out.println("El texto de la caja es:"+txtTelefono.getText());
        
        txtDireccion= new JTextField();
        txtDireccion.setBounds(100,290,250,25);
        panel.add(txtDireccion);
        txtDireccion.setText("");
        System.out.println("El texto de la caja es:"+txtDireccion.getText());
    }
    
    public void colpcarComobox(){
        //creamos un combo box
        cboMateria = new JComboBox<>();
        //ubicacion
        cboMateria.setBounds(100, 330, 150, 25);
        panel.add(cboMateria);
        ///agregagos los items
        cboMateria.addItem("Computo");
        cboMateria.addItem("Edo");
        cboMateria.addItem("Calculo");
        cboMateria.addItem("Poo");
        cboMateria.addItem("Fisica");
        ///usamos el ActionListener para asiganarle un evento
        cboMateria.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(cboMateria);
        
        cboEstado = new JComboBox<>();
        cboEstado.setBounds(100, 360, 150, 25);
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
        //ponemos los nombres a nuestra columnas 
        String[] columNames= {"Codigo","Cedula","Nombre","Apellido","Mail","Telefono","Direccion","Materia","Estado"};
        DefaultTableModel tableModel= new DefaultTableModel(columNames,0);
        ///creamos la tabla
        table= new JTable(tableModel);
        //ubicacion
        JScrollPane scrollPane= new JScrollPane(table);
        scrollPane.setBounds(400, 80, 600, 250);
        panel.add(scrollPane);
        mostrarDatos();
        
     }
    public void colocarBotones(){
        JButton boton = new JButton("Limpiar");
        ImageIcon imagen= new ImageIcon("limpiar.png");
        boton.setBounds(15, 420, 100, 30);
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
        ImageIcon imagen1= new ImageIcon("guardar.png");
        boton1.setBounds(120, 420, 100, 30);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.addActionListener(new ActionListener(){           
            @Override
             public void actionPerformed(ActionEvent e) {
                 insertarDatos();
                 mostrarDatos();
                 limpiarDatos();
                 
                }
        });
        JButton boton2 = new JButton("Editar");
        ImageIcon imagen2= new ImageIcon("actualizar.png");
        boton2.setBounds(235, 420, 80, 30);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');
        
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
        
        
        JButton boton3 = new JButton("Eliminar");
        ImageIcon imagen3= new ImageIcon("eliminar.png");
        boton3.setBounds(330, 420, 100, 30);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('a');
        
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
        
        JButton boton4 = new JButton("Salir");
        ImageIcon imagen4= new ImageIcon("salir.png");
        boton4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
        boton4.setBounds(445, 420, 100, 30);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('a');
        
       
     }
    public void insertarDatos() {
        try {
            String SQL = "INSERT INTO estudiante(estu_cedula,estu_nombre, estu_apellido,"
                    + "  estu_mail,estu_telefono,estu_direccion,estu_materia,estu_estado) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, txtCedula.getText());
            pst.setString(2, txtNombre.getText()); 
            pst.setString(3, txtApellido.getText()); 
            pst.setString(4, txtMail.getText());
            pst.setString(5, txtTelefono.getText());
            pst.setString(6, txtDireccion.getText());
            int seleccion1 = cboMateria.getSelectedIndex();
            pst.setString(7, cboMateria.getItemAt(seleccion1));
            int seleccion2 = cboEstado.getSelectedIndex();
            pst.setString(8, cboEstado.getItemAt(seleccion2));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e);
        }
    }
    public void limpiarDatos(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtMail.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        cboMateria.setSelectedItem(null);
        cboEstado.setSelectedItem(null);    
    }
    
    public void mostrarDatos(){
        String titulos[]={"Codigo","Cedula","Nombres","Apellidos","Mail","Telefono","Direccion","Materia","Estado"};
        String registro[]=new String [9];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `estudiante`";
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("estu_codigo");
            registro [1]=rs.getString("estu_cedula");
            registro [2]=rs.getString("estu_nombre");
            registro [3]=rs.getString("estu_apellido");
            registro [4]=rs.getString("estu_mail");
            registro [5]=rs.getString("estu_telefono");
            registro [6]=rs.getString("estu_direccion");       
            registro [7]=rs.getString("estu_materia");
            registro [8]=rs.getString("estu_estado");
            
            modelo.addRow(registro);
        }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
    
    private void eliminarDatos(int filaSeleccionada) {
        String codigoEstudiante = table.getValueAt(filaSeleccionada, 0).toString();
        String SQL = "DELETE FROM estudiante WHERE estu_codigo = ?";
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
        model.setValueAt(txtCedula.getText(), fila, 1); 
        model.setValueAt(txtNombre.getText(), fila, 2); 
        model.setValueAt(txtApellido.getText(), fila, 3); 
        model.setValueAt(txtMail.getText(), fila, 4);
        model.setValueAt(txtTelefono.getText(), fila, 5);
        model.setValueAt(txtDireccion.getText(), fila, 6);
        model.setValueAt(cboMateria.getSelectedItem(), fila, 7); 
        model.setValueAt(cboEstado.getSelectedItem(), fila, 8); 
         
    }  
}