package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class TicketSellerWindow extends JFrame {

  private static final long serialVersionUID = 1L;
  char[] TRIBUNAS = {'A', 'B', 'C', 'D', 'E', 'F'};
  private JLabel IntroduceDateText;
  private JPanel matchesFound;
  private JLabel seatSelector;
  private JLabel tribuneSelector;
  private JLabel sectionSelector;
  private JLabel numberOfSeatsSelector;
  private JSpinner numberOfSeatsSpinner;
  private JSpinner spinner;
  private JButton seacrchMatchesButton;
  private JComboBox tribuneComboBox;
  private JComboBox cectionComboBox;
  private JPanel seatsPanel;

  public TicketSellerWindow() {
    setIconImage(
        Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/img/iconoBalon.png")));
    setBounds(100, 100, 607, 416);
    setLocationRelativeTo(null);
    setResizable(false);
    setTitle("Gestor de entidad deportiva : Vendedor entradas");
    getContentPane().setLayout(null);
    getContentPane().add(getIntroduceDateText());
    getContentPane().add(getMatchesFound());
    getContentPane().add(getSeatSelector());
    getContentPane().add(getTribuneSelector());
    getContentPane().add(getSectionSelector());
    getContentPane().add(getNumberOfSeatsSelector());
    getContentPane().add(getNumberOfSeatsSpinner());
    getContentPane().add(getSpinner());
    getContentPane().add(getSeacrchMatchesButton());
    getContentPane().add(getTribuneComboBox());
    getContentPane().add(getCectionComboBox());
    getContentPane().add(getSeatsPanel());
  }

  private JLabel getIntroduceDateText() {
    if (IntroduceDateText == null) {
      IntroduceDateText = new JLabel("Introduzca la fecha del partido:");
      IntroduceDateText.setFont(new Font("Tahoma", Font.PLAIN, 12));
      IntroduceDateText.setBounds(25, 10, 175, 30);
    }
    return IntroduceDateText;
  }

  private JPanel getMatchesFound() {
    if (matchesFound == null) {
      matchesFound = new JPanel();
      matchesFound.setBorder(new TitledBorder(null, "Partidos disponibles", TitledBorder.LEADING,
          TitledBorder.TOP, null, null));
      matchesFound.setBounds(338, 10, 233, 167);
      matchesFound.setLayout(new GridLayout(6, 2, 0, 0));
    }
    return matchesFound;
  }

  private JLabel getSeatSelector() {
    if (seatSelector == null) {
      seatSelector = new JLabel("Selecci\u00F3n de asientos:\r\n");
      seatSelector.setFont(new Font("Tahoma", Font.PLAIN, 12));
      seatSelector.setBounds(25, 82, 175, 30);
    }
    return seatSelector;
  }

  private JLabel getTribuneSelector() {
    if (tribuneSelector == null) {
      tribuneSelector = new JLabel("Tribuna:");
      tribuneSelector.setFont(new Font("Tahoma", Font.PLAIN, 12));
      tribuneSelector.setBounds(25, 122, 52, 30);
    }
    return tribuneSelector;
  }

  private JLabel getSectionSelector() {
    if (sectionSelector == null) {
      sectionSelector = new JLabel("Secci\u00F3n:");
      sectionSelector.setFont(new Font("Tahoma", Font.PLAIN, 12));
      sectionSelector.setBounds(154, 122, 52, 30);
    }
    return sectionSelector;
  }

  private JLabel getNumberOfSeatsSelector() {
    if (numberOfSeatsSelector == null) {
      numberOfSeatsSelector = new JLabel("N\u00FAmero de asientos:");
      numberOfSeatsSelector.setFont(new Font("Tahoma", Font.PLAIN, 12));
      numberOfSeatsSelector.setBounds(25, 162, 129, 30);
    }
    return numberOfSeatsSelector;
  }

  private JSpinner getNumberOfSeatsSpinner() {
    if (numberOfSeatsSpinner == null) {
      numberOfSeatsSpinner = new JSpinner();
      numberOfSeatsSpinner.setEnabled(false);
      numberOfSeatsSpinner.setModel(new SpinnerNumberModel(1, 1, 15, 1));
      numberOfSeatsSpinner.setBounds(164, 169, 30, 20);
    }
    return numberOfSeatsSpinner;
  }

  private JSpinner getSpinner() {
    if (spinner == null) {
      spinner = new JSpinner();
      spinner.setModel(
          new SpinnerDateModel(new Date(1725141600000L), null, null, Calendar.DAY_OF_YEAR));
      spinner.setBounds(65, 42, 82, 30);
    }
    return spinner;
  }

  private JButton getSeacrchMatchesButton() {
    if (seacrchMatchesButton == null) {
      seacrchMatchesButton = new JButton("Buscar");
      seacrchMatchesButton.setBackground(Color.CYAN);
      seacrchMatchesButton.setBounds(175, 46, 85, 20);
    }
    return seacrchMatchesButton;
  }

  private JComboBox getTribuneComboBox() {
    if (tribuneComboBox == null) {
      tribuneComboBox = new JComboBox();
      tribuneComboBox.setEnabled(false);
      tribuneComboBox.setBounds(81, 122, 40, 27);
    }
    return tribuneComboBox;
  }

  private JComboBox getCectionComboBox() {
    if (cectionComboBox == null) {
      cectionComboBox = new JComboBox();
      cectionComboBox.setEnabled(false);
      cectionComboBox.setBounds(213, 122, 40, 27);
    }
    return cectionComboBox;
  }

  private JPanel getSeatsPanel() {
    if (seatsPanel == null) {
      seatsPanel = new JPanel();
      seatsPanel.setBounds(25, 202, 546, 167);
      seatsPanel.setLayout(new GridLayout(10, 15, 0, 0));
    }
    return seatsPanel;
  }
}
