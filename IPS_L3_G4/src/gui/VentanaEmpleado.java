package gui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;


public class VentanaEmpleado extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pnPersonal;
	private JPanel pnProfesional;
	private JPanel pnDatos;
	private JPanel pnFecha;
	private JLabel lbNombre;
	private JTextField tfNombre;
	private JLabel lbApellido;
	private JTextField tfApellido;
	private JLabel lbDni;
	private JTextField tfDni;
	private JLabel lbTelefono;
	private JTextField textField;

	public VentanaEmpleado() {
		setTitle("Añadir empleado");
		setForeground(Color.BLACK);
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		getContentPane().add(getPnPersonal());
		getContentPane().add(getPnProfesional());
		setMinimumSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
	}

	private JPanel getPnPersonal() {
		if (pnPersonal == null) {
			pnPersonal = new JPanel();
			pnPersonal.setLayout(new GridLayout(2, 0, 0, 0));
			pnPersonal.add(getPnDatos());
			pnPersonal.add(getPnFecha());
		}
		return pnPersonal;
	}
	private JPanel getPnProfesional() {
		if (pnProfesional == null) {
			pnProfesional = new JPanel();
			pnProfesional.setBackground(Color.WHITE);
			pnProfesional.setLayout(new BorderLayout(0, 0));
		}
		return pnProfesional;
	}
	private JPanel getPnDatos() {
		if (pnDatos == null) {
			pnDatos = new JPanel();
			pnDatos.setBorder(new EmptyBorder(2, 5, 2, 2));
			pnDatos.setForeground(Color.BLACK);
			pnDatos.setBackground(Color.WHITE);
			pnDatos.setLayout(new GridLayout(0, 2, 0, 0));
			pnDatos.add(getLbNombre());
			pnDatos.add(getTfNombre());
			pnDatos.add(getLbApellido());
			pnDatos.add(getTfApellido());
			pnDatos.add(getLbDni());
			pnDatos.add(getTfDni());
			pnDatos.add(getLbTelefono());
			pnDatos.add(getTextField());
		}
		return pnDatos;
	}
	private JPanel getPnFecha() {
		if (pnFecha == null) {
			pnFecha = new JPanel();
			pnFecha.setBackground(Color.WHITE);
			pnFecha.setLayout(new BorderLayout(0, 0));
		}
		return pnFecha;
	}
	private JLabel getLbNombre() {
		if (lbNombre == null) {
			lbNombre = new JLabel("Nombre: ");
			lbNombre.setLabelFor(getTfNombre());
			lbNombre.setDisplayedMnemonic('N');
			lbNombre.setForeground(Color.BLACK);
			lbNombre.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		}
		return lbNombre;
	}
	private JTextField getTfNombre() {
		if (tfNombre == null) {
			tfNombre = new JTextField();
			tfNombre.setForeground(Color.BLACK);
			tfNombre.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfNombre.setColumns(10);
		}
		return tfNombre;
	}
	private JLabel getLbApellido() {
		if (lbApellido == null) {
			lbApellido = new JLabel("Apellido: ");
			lbApellido.setLabelFor(getTfApellido());
			lbApellido.setForeground(Color.BLACK);
			lbApellido.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbApellido.setDisplayedMnemonic('A');
		}
		return lbApellido;
	}
	private JTextField getTfApellido() {
		if (tfApellido == null) {
			tfApellido = new JTextField();
			tfApellido.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfApellido.setForeground(Color.BLACK);
			tfApellido.setColumns(10);
		}
		return tfApellido;
	}
	private JLabel getLbDni() {
		if (lbDni == null) {
			lbDni = new JLabel("DNI: ");
			lbDni.setLabelFor(getTfDni());
			lbDni.setDisplayedMnemonic('D');
			lbDni.setForeground(Color.BLACK);
			lbDni.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		}
		return lbDni;
	}
	private JTextField getTfDni() {
		if (tfDni == null) {
			tfDni = new JTextField();
			tfDni.setForeground(Color.BLACK);
			tfDni.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfDni.setColumns(10);
		}
		return tfDni;
	}
	private JLabel getLbTelefono() {
		if (lbTelefono == null) {
			lbTelefono = new JLabel("Tel\u00E9fono: ");
			lbTelefono.setDisplayedMnemonic('T');
			lbTelefono.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbTelefono.setForeground(Color.BLACK);
		}
		return lbTelefono;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setForeground(Color.BLACK);
			textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			textField.setColumns(10);
		}
		return textField;
	}
}
