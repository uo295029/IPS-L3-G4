package ui;

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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class EmployeeGestionWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pnProfesional;
	private JPanel pnPersonal;
	private JLabel lbName;
	private JTextField tfName;
	private JLabel lbSurname;
	private JTextField tfSurname;
	private JLabel lbDni;
	private JTextField tfDni;
	private JLabel lbPhone;
	private JTextField tfPhone;
	private JLabel lbDay;
	private JSpinner spDay;
	private JLabel lbMonth;
	private JSpinner spMonth;
	private JLabel lbYear;
	private JSpinner spYear;

	public EmployeeGestionWindow() {
		setTitle("Añadir empleado");
		setForeground(Color.BLACK);
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		getContentPane().add(getPnDatos_1());
		getContentPane().add(getPnProfesional());
		setMinimumSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
	}
	private JPanel getPnProfesional() {
		if (pnProfesional == null) {
			pnProfesional = new JPanel();
			pnProfesional.setBackground(Color.WHITE);
			pnProfesional.setLayout(new BorderLayout(0, 0));
		}
		return pnProfesional;
	}
	private JPanel getPnDatos_1() {
		if (pnPersonal == null) {
			pnPersonal = new JPanel();
			pnPersonal.setForeground(Color.BLACK);
			pnPersonal.setBorder(new EmptyBorder(2, 5, 2, 2));
			pnPersonal.setBackground(Color.WHITE);
			pnPersonal.setLayout(new GridLayout(7, 2, 0, 0));
			pnPersonal.add(getLbNombre_1());
			pnPersonal.add(getTextField_1());
			pnPersonal.add(getLbApellido_1());
			pnPersonal.add(getTextField_1_1());
			pnPersonal.add(getLbDni_1());
			pnPersonal.add(getTfDni());
			pnPersonal.add(getLbTelefono_1());
			pnPersonal.add(getTfPhone());
			pnPersonal.add(getLbDay());
			pnPersonal.add(getSpDay());
			pnPersonal.add(getLbMonth());
			pnPersonal.add(getSpMonth());
			pnPersonal.add(getLbYear());
			pnPersonal.add(getSpYear());
		}
		return pnPersonal;
	}
	private JLabel getLbNombre_1() {
		if (lbName == null) {
			lbName = new JLabel("Nombre: ");
			lbName.setForeground(Color.BLACK);
			lbName.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbName.setDisplayedMnemonic('N');
		}
		return lbName;
	}
	private JTextField getTextField_1() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setForeground(Color.BLACK);
			tfName.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JLabel getLbApellido_1() {
		if (lbSurname == null) {
			lbSurname = new JLabel("Apellido: ");
			lbSurname.setForeground(Color.BLACK);
			lbSurname.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbSurname.setDisplayedMnemonic('A');
		}
		return lbSurname;
	}
	private JTextField getTextField_1_1() {
		if (tfSurname == null) {
			tfSurname = new JTextField();
			tfSurname.setForeground(Color.BLACK);
			tfSurname.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfSurname.setColumns(10);
		}
		return tfSurname;
	}
	private JLabel getLbDni_1() {
		if (lbDni == null) {
			lbDni = new JLabel("DNI: ");
			lbDni.setForeground(Color.BLACK);
			lbDni.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbDni.setDisplayedMnemonic('D');
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
	private JLabel getLbTelefono_1() {
		if (lbPhone == null) {
			lbPhone = new JLabel("Tel\u00E9fono: ");
			lbPhone.setForeground(Color.BLACK);
			lbPhone.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbPhone.setDisplayedMnemonic('T');
		}
		return lbPhone;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setForeground(Color.BLACK);
			tfPhone.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfPhone.setColumns(10);
		}
		return tfPhone;
	}
	private JLabel getLbDay() {
		if (lbDay == null) {
			lbDay = new JLabel("D\u00EDa: ");
			lbDay.setLabelFor(getSpDay());
			lbDay.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbDay.setForeground(Color.BLACK);
			lbDay.setDisplayedMnemonic('I');
		}
		return lbDay;
	}
	private JSpinner getSpDay() {
		if (spDay == null) {
			spDay = new JSpinner();
			spDay.setModel(new SpinnerNumberModel(1, 1, 31, 1));
			spDay.setForeground(Color.BLACK);
			spDay.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		}
		return spDay;
	}
	private JLabel getLbMonth() {
		if (lbMonth == null) {
			lbMonth = new JLabel("Mes: ");
			lbMonth.setLabelFor(getSpMonth());
			lbMonth.setDisplayedMnemonic('M');
			lbMonth.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbMonth.setForeground(Color.BLACK);
		}
		return lbMonth;
	}
	private JSpinner getSpMonth() {
		if (spMonth == null) {
			spMonth = new JSpinner();
			spMonth.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					switch((int) spMonth.getValue()) {
						case 2:
							spDay.setModel(new SpinnerNumberModel(1, 1, 28, 1));
							break;
						case 4: case 6: case 9: case 11:
							spDay.setModel(new SpinnerNumberModel(1, 1, 30, 1));
							break;
						case 1: case 3: case 5: case 7: case 8: case 10: case 12:
							spDay.setModel(new SpinnerNumberModel(1, 1, 31, 1));
							break;
					}
				}
			});
			spMonth.setForeground(Color.BLACK);
			spMonth.setModel(new SpinnerNumberModel(1, 1, 12, 1));
			spMonth.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		}
		return spMonth;
	}
	private JLabel getLbYear() {
		if (lbYear == null) {
			lbYear = new JLabel("A\u00F1o: ");
			lbYear.setLabelFor(getSpYear());
			lbYear.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbYear.setForeground(Color.BLACK);
			lbYear.setDisplayedMnemonic('Ñ');
		}
		return lbYear;
	}
	private JSpinner getSpYear() {
		if (spYear == null) {
			spYear = new JSpinner();
			spYear.setModel(new SpinnerNumberModel(2000, 1900, 2024, 1));
			spYear.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			spYear.setForeground(Color.BLACK);
		}
		return spYear;
	}
}
