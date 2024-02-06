 {
    		package traFinal;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class NewPeruBank extends JFrame {
    /*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JPasswordField password;
    private JTextField textdni;
    private CajeroAutomatico cajeroAutomatico;
    private int intentosFallidos;
    private boolean isDNIFocused = true; // Agregamos un booleano para rastrear el campo activo
    
    public static void main(String[] args) {
    	tryUIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
    	} catch (Throwable e) {
    		e.printStackTrace();
    	}
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewPeruBank frame = new NewPeruBank();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public NewPeruBank() {
    	setResizable(false);
        setTitle("New Perú Bank");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 434, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		        JLabel lblNewLabel = new JLabel("New Perú Bank");
		        lblNewLabel.setBounds(142, 11, 148, 25);
		        panel.add(lblNewLabel);
		        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		        lblNewLabel.setBackground(new Color(0, 128, 128));
		        lblNewLabel.setForeground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(47, 71, 339, 197);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder((Border) new TitledBorder(null, "Accede a tu Cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 128, 192));
		panel_2.setBounds(10, 11, 319, 175);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(62, 50, 37, 23);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(62, 102, 65, 14);
		panel_2.add(lblNewLabel_2);
		
		
		
		password = new JPasswordField();
		password.setBounds(137, 101, 108, 20);
		panel_2.add(password);
		
		textdni = new JTextField();
		textdni.setBounds(136, 53, 108, 20);
		panel_2.add(textdni);
		textdni.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 128));
		panel_3.setBounds(0, 298, 434, 263);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setForeground(new Color(0, 0, 0));
		panel_4.setBounds(40, 30, 355, 205);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
	
		JButton btn1 = new JButton("1");
		btn1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        btn1.setFocusPainted(false);
        btn1.setBackground(new Color(255, 255, 255));
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "1";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });

        password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                isDNIFocused = false;
            }
        });
		btn1.setBounds(21, 24, 46, 23);
		panel_4.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "2";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn2.setFocusPainted(false);
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(89, 24, 46, 23);
		panel_4.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "3";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn3.setFocusPainted(false);
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(155, 24, 46, 23);
		panel_4.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "4";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn4.setFocusPainted(false);
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(21, 68, 46, 23);
		panel_4.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn5.setFocusPainted(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "5";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(89, 68, 46, 23);
		panel_4.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "6";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn6.setFocusPainted(false);
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(155, 68, 46, 23);
		panel_4.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "7";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn7.setFocusPainted(false);
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(21, 112, 46, 23);
		panel_4.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "8";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn8.setFocusPainted(false);
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(89, 112, 46, 23);
		panel_4.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "9";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn9.setFocusPainted(false);
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(155, 112, 46, 23);
		panel_4.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = isDNIFocused ? textdni.getText() : new String(password.getPassword());
                String updatedText = currentText + "0";

                if (isDNIFocused) {
                    textdni.setText(updatedText);
                } else {
                    password.setText(updatedText);
                }
            }
        });

        // Agrega un FocusListener para rastrear el campo activo (dni o password)
        textdni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = true;
            }
        });

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isDNIFocused = false;
            }
        });
		btn0.setFocusPainted(false);
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(89, 156, 46, 23);
		panel_4.add(btn0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder((Border) new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_5.setBackground(new Color(128, 128, 128));
		panel_5.setBounds(220, 11, 10, 183);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btncancelar = new JButton("Cerrar");
		btncancelar.setForeground(new Color(0, 0, 0));
		btncancelar.setBackground(new Color(255, 0, 0));
		btncancelar.setFocusPainted(false);
		btncancelar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt = JOptionPane.showConfirmDialog(
						null, 
						"Cerrar el Programa",
						"Fin del Programa",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if(opt == JOptionPane.OK_OPTION)
					dispose();
				
			}
		});
		btncancelar.setBounds(244, 24, 89, 36);
		panel_4.add(btncancelar);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.setForeground(new Color(0, 0, 0));
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textdni.setText("");
				password.setText("");
			}
		});
		btnborrar.setBackground(new Color(255, 255, 0));
		btnborrar.setFocusPainted(false);
		btnborrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnborrar.setBounds(244, 84, 89, 36);
		panel_4.add(btnborrar);
		
		JButton btnentrar = new JButton("Ingresar");
		btnentrar.setForeground(new Color(0, 0, 0));
		btnentrar.setBackground(new Color(0, 255, 0));
		btnentrar.setFocusPainted(false);
		btnentrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = textdni.getText();
				String pass = new String(password.getPassword());
				Cliente cliente = cajeroAutomatico.buscarClientePorDNI(dni);
				if (cliente != null && cliente.getPassword().equals(pass)) {
					intentosFallidos = 0;
					String nombre = cliente.getNombre();
					abrirCajero(cliente);
				} else {
					intentosFallidos += 1;
					int intentosRestantes = 3 - intentosFallidos;
					if (intentosFallidos >= 3) {
						JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. El programa se cerrará.");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(null, "DNI o contraseña incorrectos. Te Quedan:  " + intentosRestantes +" " + "Intentos");
						textdni.setText("");
						password.setText("");
					}
				}
			}
		});
		btnentrar.setBounds(244, 144, 89, 36);
		panel_4.add(btnentrar);

		cajeroAutomatico = new CajeroAutomatico();
	}

    protected void abrirCajero(Cliente cliente) {
        // Establecer el nombre del cliente en la clase Cajero
        Cajero cajero = new Cajero(cliente);
        
        // Mostrar la interfaz del cajero automático
        cajero.setVisible(true);
        dispose();
    }
	
	
}