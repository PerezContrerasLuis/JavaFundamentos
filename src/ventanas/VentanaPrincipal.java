package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	//definimos elementos
	JButton jbtn_boton;
	JTextField jtxf_texto;
	JLabel jlb_etiqueta;
	
	public VentanaPrincipal() {
		super("Ejemplo de Ventana GUI");
		definirVentana();
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void definirVentana() {
		jbtn_boton = new JButton("Enviar");
		jtxf_texto = new JTextField(20);
		jlb_etiqueta = new JLabel();
		
		this.setLayout(new FlowLayout());
		this.add(jtxf_texto);
		this.add(jbtn_boton);
		this.add(jlb_etiqueta);
		jbtn_boton.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jbtn_boton) {
			jlb_etiqueta.setText(jtxf_texto.getText());
		}
		
	}

}
