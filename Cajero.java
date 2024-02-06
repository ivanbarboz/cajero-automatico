package traFinal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;


public class Cajero extends JFrame {

    private JPanel contentPane;
    private JTextField nombrecliente;
    private JTextField textCantidadDeposito;
    private JTextField textSaldo;
    private JPanel panelRealizarDeposito;
    private JPanel panelRealizarRetiro;
    private JPanel panelConsultarSaldo;
    private Cliente clienteActual;
    private JTextField textFieldRetiro;
    private JLabel lblcantidad;
    private JTextField textCantidadRetiro;
    private Cliente cliente;
    private CajeroAutomatico cajeroAutomatico;
    private List<Cliente> clientes = new ArrayList<>();
   


	public Cajero(Cliente cliente) {
		setResizable(false);
		this.cliente = cliente;
		setTitle("New Perú Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 678);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		inicializarClientes();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 482, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("New Perú Bank");
		lblNewLabel.setBounds(161, 11, 148, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(10, 61, 462, 278);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 128, 255));
		panel_2.setBackground(new Color(0, 128, 192));
		panel_2.setBounds(10, 11, 442, 256);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		 cajeroAutomatico = new CajeroAutomatico(); // Inicialización de CajeroAutomatico
		    setLocationRelativeTo(null);
		
	    
	    setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenid@");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 11, 99, 23);
		panel_2.add(lblNewLabel_1);
		
		nombrecliente = new JTextField(cliente.getNombre());
		nombrecliente.setEnabled(false);
		nombrecliente.setForeground(new Color(0, 128, 255));
		nombrecliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nombrecliente.setBorder(null);
		nombrecliente.setBounds(122, 14, 175, 20);
		panel_2.add(nombrecliente);
		nombrecliente.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Operacion a Realizar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_6.setBackground(new Color(0, 128, 192));
		panel_6.setForeground(new Color(0, 128, 192));
		panel_6.setBounds(300, 50, 128, 183);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btndeposito = new JButton("Deposito");
		btndeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRealizarDeposito.setVisible(true);
		        panelRealizarRetiro.setVisible(false);
		        panelConsultarSaldo.setVisible(false);
		        textFieldRetiro.setText("");
			}
		});
		
		

	    panelRealizarDeposito = new JPanel();
        panelRealizarDeposito.setBackground(new Color(0, 128, 192));
        panelRealizarDeposito.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Realizar Deposito", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
        panelRealizarDeposito.setBounds(18, 50, 274, 183);
        panelRealizarDeposito.setLayout(null);
        panel_2.add(panelRealizarDeposito);
        panelRealizarDeposito.setVisible(false);

        textCantidadDeposito = new JTextField();
        textCantidadDeposito.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textCantidadDeposito.setBounds(79, 87, 114, 20);
        panelRealizarDeposito.add(textCantidadDeposito);
        textCantidadDeposito.setColumns(10);

        // Similar para los otros elementos dentro de los paneles...

     panelRealizarRetiro = new JPanel(); // Crea un nuevo panel para realizar retiro
        panelRealizarRetiro.setBackground(new Color(0, 128, 192));
        panelRealizarRetiro.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Realizar Retiro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
        panelRealizarRetiro.setBounds(18, 50, 274, 183);
        panelRealizarRetiro.setLayout(null);
        panel_2.add(panelRealizarRetiro);
        panelRealizarRetiro.setVisible(false);

        textFieldRetiro = new JTextField();
        textFieldRetiro.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textFieldRetiro.setBounds(79, 87, 114, 20);
        panelRealizarRetiro.add(textFieldRetiro);
        textFieldRetiro.setColumns(10);

        // Similar para los elementos dentro del panel de retiro...

        panelConsultarSaldo = new JPanel();
        panelConsultarSaldo.setBackground(new Color(0, 128, 192));
        panelConsultarSaldo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Consultar Saldo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
        panelConsultarSaldo.setBounds(18, 50, 274, 183);
        panelConsultarSaldo.setLayout(null);
        panel_2.add(panelConsultarSaldo);
        panelConsultarSaldo.setVisible(false);

        textSaldo = new JTextField();
        textSaldo.setForeground(new Color(0, 0, 0));
        textSaldo.setBackground(new Color(192, 192, 192));
        textSaldo.setDisabledTextColor(new Color(0, 0, 0));
        textSaldo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textSaldo.setBounds(79, 87, 114, 20);
        panelConsultarSaldo.add(textSaldo);
        textSaldo.setColumns(10);
        textSaldo.setEnabled(false);
		
		btndeposito.setForeground(new Color(0, 0, 0));
		btndeposito.setBounds(18, 26, 93, 23);
		panel_6.add(btndeposito);
		btndeposito.setBackground(new Color(0, 128, 128));
		btndeposito.setFocusPainted(false);
		btndeposito.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JButton btnretiro = new JButton("Retiro");
		btnretiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRealizarDeposito.setVisible(false);
		        panelRealizarRetiro.setVisible(true);
		        panelConsultarSaldo.setVisible(false);
		        textCantidadDeposito.setText("");
			}
		});
		btnretiro.setForeground(new Color(0, 0, 0));
		btnretiro.setBounds(18, 65, 93, 23);
		panel_6.add(btnretiro);
		btnretiro.setBackground(new Color(0, 128, 128));
		btnretiro.setFocusPainted(false);
		btnretiro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JButton btnconsultar = new JButton("Consultar Saldo");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textSaldo.setText(String.format("%.2f",cliente.consultarSaldo()));
				panelRealizarDeposito.setVisible(false);
		        panelRealizarRetiro.setVisible(false);
		        panelConsultarSaldo.setVisible(true);
			}
		});
		btnconsultar.setForeground(new Color(0, 0, 0));
		btnconsultar.setBounds(18, 104, 93, 23);
		panel_6.add(btnconsultar);
		btnconsultar.setBackground(new Color(0, 128, 128));
		btnconsultar.setFocusPainted(false);
		btnconsultar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt = JOptionPane.showConfirmDialog(
						null, 
						"Salir del Programa",
						"Fin del Programa",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if(opt == JOptionPane.OK_OPTION)
					dispose();
			}
		});
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSalir.setBackground(new Color(64, 128, 128));
		btnSalir.setBounds(18, 143, 93, 23);
		panel_6.add(btnSalir);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Vegas\\Desktop\\ANGELA\\SNT\\2023-2\\JAVA II\\JavaProjects\\Tareas\\src\\traFinal\\icon.jpg"));
		lblNewLabel_2.setBounds(25, 61, 247, 163);
		panel_2.add(lblNewLabel_2);
		
		
		
		JLabel lblRetiro = new JLabel("Ingrese Cantidad a Retirar");
		lblRetiro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRetiro.setBounds(68, 42, 143, 23);
		panelRealizarRetiro.add(lblRetiro);
		
		
		
		lblcantidad = new JLabel("Ingrese la Cantidad a Depositar ");
		lblcantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblcantidad.setBounds(49, 42, 197, 23);
		panelRealizarDeposito.add(lblcantidad);
		
		JLabel lblSaldo = new JLabel("Saldo Disponible");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSaldo.setBounds(78, 42, 115, 23);
		panelConsultarSaldo.add(lblSaldo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 128));
		panel_3.setBounds(0, 377, 482, 262);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setForeground(new Color(0, 0, 0));
		panel_4.setBounds(61, 31, 355, 205);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn1.setFocusPainted(false);
		btn1.setBackground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("1");
			}
		});
		btn1.setBounds(22, 21, 46, 23);
		panel_4.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn2.setFocusPainted(false);
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(90, 21, 46, 23);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("2");
			}
		});
		panel_4.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn3.setFocusPainted(false);
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(156, 21, 46, 23);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("3");
			}
		});
		panel_4.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn4.setFocusPainted(false);
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(22, 65, 46, 23);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("4");
			}
		});
		panel_4.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn5.setFocusPainted(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("5");
			}
			
		});
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(90, 65, 46, 23);
		panel_4.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn6.setFocusPainted(false);
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(156, 65, 46, 23);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("6");
			}
			
		});
		panel_4.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn7.setFocusPainted(false);
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(22, 109, 46, 23);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("7");
			}
			
		});
		panel_4.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn8.setFocusPainted(false);
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(90, 109, 46, 23);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("8");
			}
			
		});
		panel_4.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn9.setFocusPainted(false);
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(156, 109, 46, 23);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("9");
			}
			
		});
		panel_4.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn0.setFocusPainted(false);
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(90, 153, 46, 23);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero("0");
			}
			
		});
		panel_4.add(btn0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_5.setBackground(new Color(128, 128, 128));
		panel_5.setBounds(223, 11, 10, 183);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewPeruBank newPeruBank = new NewPeruBank();
				newPeruBank.setVisible(true);
				dispose();
				
			}
		});
		btncancelar.setBackground(new Color(255, 0, 0));
		btncancelar.setFocusPainted(false);
		btncancelar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btncancelar.setBounds(244, 11, 89, 43);
		panel_4.add(btncancelar);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCantidadDeposito.setText(null);
				textFieldRetiro.setText(null);
			}
		});
		btnborrar.setBackground(new Color(255, 255, 0));
		btnborrar.setFocusPainted(false);
		btnborrar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnborrar.setBounds(244, 77, 89, 43);
		panel_4.add(btnborrar);
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.setBackground(new Color(0, 255, 0));
		btnaceptar.setFocusPainted(false);
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textCantidadDeposito.getText().length() > 0) {
				    double deposito = Double.parseDouble(textCantidadDeposito.getText());
				    cliente.realizarDeposito(deposito);
				    JOptionPane.showMessageDialog(null, "Depósito Realizado con Éxito");
				    textCantidadDeposito.setText("");
				} else if (textFieldRetiro.getText().length() > 0) {
				    double retiro = Double.parseDouble(textFieldRetiro.getText());
				    if (retiro > cliente.consultarSaldo()) {
				        JOptionPane.showMessageDialog(null, "Fondos insuficientes para realizar el retiro.", "Error", JOptionPane.ERROR_MESSAGE);
				        textFieldRetiro.setText("");
				    } else {
				        cliente.realizarRetiro(retiro);
				        JOptionPane.showMessageDialog(null, "Retiro Realizado con Éxito");
				        textFieldRetiro.setText("");
				    }
				} else {
				    JOptionPane.showMessageDialog(null, "Elija una opción");
				}	
		    }

		});
			
		btnaceptar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnaceptar.setBounds(244, 141, 89, 43);
		panel_4.add(btnaceptar);
		setLocationRelativeTo(null);
	}
	
	public void setClienteActual(Cliente cliente) {
	    this.clienteActual = cliente; 
	
	}
	
	private void agregarNumero(String numero) {
	    // Obtén el campo de texto actual
	    JTextField campoActivo = null;
	    if (panelRealizarDeposito.isVisible()) {
	        campoActivo = textCantidadDeposito;
	    } else if (panelRealizarRetiro.isVisible()) {
	        campoActivo = textFieldRetiro;
	    }
 
	    // Si hay un campo de texto activo, agrega el número
	    if (campoActivo != null) {
	        String textoActual = campoActivo.getText();
	        campoActivo.setText(textoActual + numero);
	    }
   }

	private void inicializarClientes() {
		 ArrayList<Cliente> listaClientes = CajeroAutomatico.getClientes();
	}
	
	public double consultarSaldo() {
        return clienteActual.consultarSaldo();
    }
	
	
	public void Cajero() {
		// TODO Auto-generated constructor stub
	}
	public JTextField getTextFieldRetiro() {
		return textFieldRetiro;
	}
	public JLabel getLblcantidad() {
		return lblcantidad;
	}
}
