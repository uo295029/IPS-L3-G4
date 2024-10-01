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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

import model.Employee;
import model.EmployeeModel;

import javax.swing.event.ChangeEvent;
import javax.swing.border.TitledBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;


public class EmployeeGestionWindow extends JFrame {
	/**
	 * 
	 */
	
	private JFrame last;
	
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
	private JPanel pnJob;
	private JPanel pnSave;
	private JButton btCancel;
	private JButton btSave;
	private JLabel lbJob;
	private JLabel lbSport;
	private JPanel pnSport;
	private JRadioButton rbYes;
	private JRadioButton rbNo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lbSalary;
	private JSpinner spSalary;
	private JComboBox<String> cbJob;
	

	public EmployeeGestionWindow(JFrame frame) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});
		this.last = frame;
		setTitle("Añadir empleado");
		setForeground(Color.BLACK);
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		getContentPane().add(getPnPersonal());
		getContentPane().add(getPnProfesional());
		setMinimumSize(new Dimension(450, 350));
		setLocationRelativeTo(null);
	}
	
	private JPanel getPnProfesional() {
		if (pnProfesional == null) {
			pnProfesional = new JPanel();
			pnProfesional.setBackground(Color.WHITE);
			pnProfesional.setLayout(new BorderLayout(0, 0));
			pnProfesional.add(getPnJob(), BorderLayout.CENTER);
			pnProfesional.add(getPnSave(), BorderLayout.SOUTH);
		}
		return pnProfesional;
	}
	
	private JPanel getPnPersonal() {
		if (pnPersonal == null) {
			pnPersonal = new JPanel();
			pnPersonal.setFont(new Font("Trebuchet MS", Font.PLAIN, 7));
			pnPersonal.setForeground(Color.BLACK);
			pnPersonal.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Datos personales", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnPersonal.setBackground(Color.WHITE);
			pnPersonal.setLayout(new GridLayout(7, 2, 0, 0));
			pnPersonal.add(getLbName());
			pnPersonal.add(getTfName());
			pnPersonal.add(getLbSurname());
			pnPersonal.add(getTfSurname());
			pnPersonal.add(getLbDni());
			pnPersonal.add(getTfDni());
			pnPersonal.add(getLbPhone());
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
	
	private JLabel getLbName() {
		if (lbName == null) {
			lbName = new JLabel("Nombre: ");
			lbName.setForeground(Color.BLACK);
			lbName.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbName.setDisplayedMnemonic('N');
		}
		return lbName;
	}
	
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setForeground(Color.BLACK);
			tfName.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfName.setColumns(10);
		}
		return tfName;
	}
	
	private JLabel getLbSurname() {
		if (lbSurname == null) {
			lbSurname = new JLabel("Apellido: ");
			lbSurname.setForeground(Color.BLACK);
			lbSurname.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbSurname.setDisplayedMnemonic('A');
		}
		return lbSurname;
	}
	
	private JTextField getTfSurname() {
		if (tfSurname == null) {
			tfSurname = new JTextField();
			tfSurname.setForeground(Color.BLACK);
			tfSurname.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			tfSurname.setColumns(10);
		}
		return tfSurname;
	}
	
	private JLabel getLbDni() {
		if (lbDni == null) {
			lbDni = new JLabel("DNI: ");
			lbDni.setForeground(Color.BLACK);
			lbDni.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbDni.setDisplayedMnemonic('I');
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
	
	private JLabel getLbPhone() {
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
			lbDay.setDisplayedMnemonic('D');
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
	
	private JPanel getPnJob() {
		if (pnJob == null) {
			pnJob = new JPanel();
			pnJob.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Datos profesionales", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			pnJob.setFont(new Font("Trebuchet MS", Font.PLAIN, 7));
			pnJob.setBackground(Color.WHITE);
			pnJob.setLayout(new GridLayout(0, 2, 0, 0));
			pnJob.add(getLbSport());
			pnJob.add(getPnSport());
			pnJob.add(getLbJob());
			pnJob.add(getCbJob());
			pnJob.add(getLbSalary());
			pnJob.add(getSpSalary());
		}
		return pnJob;
	}
	
	private JPanel getPnSave() {
		if (pnSave == null) {
			pnSave = new JPanel();
			pnSave.setBackground(Color.WHITE);
			pnSave.setLayout(new GridLayout(0, 2, 0, 0));
			pnSave.add(getBtCancel());
			pnSave.add(getBtSave());
		}
		return pnSave;
	}
	
	private JButton getBtCancel() {
		if (btCancel == null) {
			btCancel = new JButton("CANCELAR");
			btCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					exit();
				}
			});
			btCancel.setBackground(Color.RED);
			btCancel.setMnemonic('C');
			btCancel.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			btCancel.setForeground(Color.BLACK);
		}
		return btCancel;
	}
	
	private JButton getBtSave() {
		if (btSave == null) {
			btSave = new JButton("GUARDAR");
			btSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					save();
					exit();
				}
			});
			btSave.setMnemonic('G');
			btSave.setForeground(Color.BLACK);
			btSave.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			btSave.setBackground(Color.GREEN);
		}
		return btSave;
	}
	
	private void exit() {
		last.setVisible(true);
		dispose();
	}
	
	private JLabel getLbJob() {
		if (lbJob == null) {
			lbJob = new JLabel("Empleo: ");
			lbJob.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbJob.setDisplayedMnemonic('E');
			lbJob.setForeground(Color.BLACK);
			lbJob.setBackground(Color.WHITE);
		}
		return lbJob;
	}
	
	private JLabel getLbSport() {
		if (lbSport == null) {
			lbSport = new JLabel("Deportivo: ");
			lbSport.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbSport.setForeground(Color.BLACK);
		}
		return lbSport;
	}
	
	private JPanel getPnSport() {
		if (pnSport == null) {
			pnSport = new JPanel();
			pnSport.setForeground(Color.BLACK);
			pnSport.setBackground(Color.WHITE);
			pnSport.setLayout(new GridLayout(0, 2, 0, 0));
			pnSport.add(getRbYes());
			pnSport.add(getRbNo());
		}
		return pnSport;
	}
	
	private JRadioButton getRbYes() {
		if (rbYes == null) {
			rbYes = new JRadioButton("S\u00ED");
			buttonGroup.add(rbYes);
			rbYes.setBackground(Color.WHITE);
			rbYes.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			rbYes.setForeground(Color.BLACK);
		}
		return rbYes;
	}
	
	private JRadioButton getRbNo() {
		if (rbNo == null) {
			rbNo = new JRadioButton("No");
			buttonGroup.add(rbNo);
			rbNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			rbNo.setBackground(Color.WHITE);
			rbNo.setForeground(Color.BLACK);
		}
		return rbNo;
	}
	
	private JLabel getLbSalary() {
		if (lbSalary == null) {
			lbSalary = new JLabel("Sueldo: ");
			lbSalary.setLabelFor(getSpSalary());
			lbSalary.setDisplayedMnemonic('S');
			lbSalary.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
			lbSalary.setForeground(Color.BLACK);
			lbSalary.setBackground(Color.WHITE);
		}
		return lbSalary;
	}
	
	private JSpinner getSpSalary() {
		if (spSalary == null) {
			spSalary = new JSpinner();
			spSalary.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
			spSalary.setModel(new SpinnerNumberModel(Integer.valueOf(1000), Integer.valueOf(1), null, Integer.valueOf(1)));
		}
		return spSalary;
	}
	
	private void save() {
		Employee e = new Employee(tfName.getSelectedText(), tfSurname.getSelectedText(), tfDni.getSelectedText(), tfPhone.getSelectedText(), (int)spYear.getValue(), (int)spMonth.getValue(), (int)spDay.getValue(), (String)cbJob.getSelectedItem(), (int)spSalary.getValue(), rbYes.isSelected());
		EmployeeModel.addEmployee(e);
	}
	private JComboBox<String> getCbJob() {
		if (cbJob == null) {
			cbJob = new JComboBox<String>();
			cbJob.setForeground(Color.BLACK);
			cbJob.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		}
		return cbJob;
	}
}
