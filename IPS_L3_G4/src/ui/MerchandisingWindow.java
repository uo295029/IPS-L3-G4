package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MerchandisingWindow extends JFrame {
	public MerchandisingWindow() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MerchandisingWindow.class.getResource("/img/iconoBalon.png")));
		getContentPane().setLayout(null);
		getContentPane().add(getCbArticles());
		getContentPane().add(getLblArticles());
		getContentPane().add(getBtnAdd());
		getContentPane().add(getBtnRemove());
		getContentPane().add(getSpUnits());
		getContentPane().add(getLblUnits());
		getContentPane().add(getScpOrder());
		getContentPane().add(getLblPrice());
		getContentPane().add(getTxfPrice());
	}
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox cbArticles;
	private JLabel lblArticles;
	private JButton btnAdd;
	private JButton btnRemove;
	private JSpinner spUnits;
	private JLabel lblUnits;
	private JScrollPane scpOrder;
	private JTextArea txaOrder;
	private JLabel lblOrder;
	private JLabel lblPrice;
	private JTextField txfPrice;
	
	private JComboBox getCbArticles() {
		if (cbArticles == null) {
			cbArticles = new JComboBox();
			cbArticles.setBounds(33, 142, 308, 22);
		}
		return cbArticles;
	}
	private JLabel getLblArticles() {
		if (lblArticles == null) {
			lblArticles = new JLabel("Art\u00EDculos:");
			lblArticles.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblArticles.setBounds(33, 115, 116, 16);
		}
		return lblArticles;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("A\u00F1adir");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAdd.setBounds(495, 142, 89, 23);
		}
		return btnAdd;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("Eliminar");
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnRemove.setBounds(603, 142, 89, 23);
		}
		return btnRemove;
	}
	private JSpinner getSpUnits() {
		if (spUnits == null) {
			spUnits = new JSpinner();
			spUnits.setBounds(424, 143, 61, 20);
		}
		return spUnits;
	}
	private JLabel getLblUnits() {
		if (lblUnits == null) {
			lblUnits = new JLabel("Unidades:");
			lblUnits.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblUnits.setBounds(424, 117, 61, 14);
		}
		return lblUnits;
	}
	private JScrollPane getScpOrder() {
		if (scpOrder == null) {
			scpOrder = new JScrollPane();
			scpOrder.setBounds(424, 188, 280, 124);
			scpOrder.setViewportView(getTxaOrder());
			scpOrder.setColumnHeaderView(getLblOrder());
		}
		return scpOrder;
	}
	private JTextArea getTxaOrder() {
		if (txaOrder == null) {
			txaOrder = new JTextArea();
		}
		return txaOrder;
	}
	private JLabel getLblOrder() {
		if (lblOrder == null) {
			lblOrder = new JLabel("Pedido:");
			lblOrder.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblOrder;
	}
	private JLabel getLblPrice() {
		if (lblPrice == null) {
			lblPrice = new JLabel("Precio:");
			lblPrice.setBounds(424, 323, 101, 16);
		}
		return lblPrice;
	}
	private JTextField getTxfPrice() {
		if (txfPrice == null) {
			txfPrice = new JTextField();
			txfPrice.setBounds(476, 321, 86, 20);
			txfPrice.setColumns(10);
		}
		return txfPrice;
	}
}
