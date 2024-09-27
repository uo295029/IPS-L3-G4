package ui;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Main window where the aplication starts. In this window the user must identificate their job to
 * go to the determinate window that will give him the correct functionality
 * 
 * @author Group 4 L3
 * @version 1.0
 */
public class MainWindow extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private JButton ticketSellerButton;
  private JButton coachButton;
  private JButton instalationManagerButton;
  private JButton storeManagerButton;
  private JButton managerButton;
  private JButton communicationsDirectorButton;

  /**
   * Constructor of the main window
   */
  public MainWindow() {
    setIconImage(
        Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/img/iconoBalon.png")));
    setBounds(100, 100, 607, 416);
    setLocationRelativeTo(null);
    setResizable(false);
    setTitle("Gestor de entidad deportiva : Inicio");
    getContentPane().setLayout(new GridLayout(6, 1, 0, 0));
    getContentPane().add(getTicketSellerButton());
    getContentPane().add(getManagerButton());
    getContentPane().add(getStoreManagerButton());
    getContentPane().add(getInstalationManagerButton());
    getContentPane().add(getCoachButton());
    getContentPane().add(getCommunicationsDirectorButton());
  }

  /**
   * @return The button that sends the user to the ticket seller window
   */
  private JButton getTicketSellerButton() {
    if (ticketSellerButton == null) {
      ticketSellerButton = new JButton("Vendedor de entradas");
      ticketSellerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          openTicketSellerWindow();
        }
      });
    }
    return ticketSellerButton;
  }

  /**
   * Method that change the user from the main window to the ticket seller window
   */
  private void openTicketSellerWindow() {
    this.setVisible(false);
    TicketSellerWindow frame = new TicketSellerWindow();
    frame.setVisible(true);
  }

  /**
   * @return The button that sends the user to the coach window
   */
  private JButton getCoachButton() {
    if (coachButton == null) {
      coachButton = new JButton("Entrenador");
    }
    return coachButton;
  }

  /**
   * @return The button that sends the user to the instalation manager window
   */
  private JButton getInstalationManagerButton() {
    if (instalationManagerButton == null) {
      instalationManagerButton = new JButton("Gestor de instalaciones");
    }
    return instalationManagerButton;
  }

  /**
   * @return The button that sends the user to the store manager window
   */
  private JButton getStoreManagerButton() {
    if (storeManagerButton == null) {
      storeManagerButton = new JButton("Encargado de tienda");
    }
    return storeManagerButton;
  }

  /**
   * @return The button that sends the user to the manager window
   */
  private JButton getManagerButton() {
    if (managerButton == null) {
      managerButton = new JButton("Gerente");
    }
    return managerButton;
  }

  /**
   * @return The button that sends the user to the comunications director window
   */
  private JButton getCommunicationsDirectorButton() {
    if (communicationsDirectorButton == null) {
      communicationsDirectorButton = new JButton("Director de comunicaciones");
    }
    return communicationsDirectorButton;
  }
}
