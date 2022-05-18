package Vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploVentana extends JFrame {

	private JPanel contentPane;
	private Button btnFacil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploVentana frame = new EjemploVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	/*public EjemploVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Button btnComprarMisil = new Button("Comprar Misil");
		btnComprarMisil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnComprarMisil, BorderLayout.CENTER);
	}*/
	
	public void actionPerformed(ActionEvent action) {
		System.out.print("entra aqui");
		if(action.getSource()==btnFacil) {
			System.out.println("se ha comprado un misil");
		}
	}
	
	public EjemploVentana() {
		initialize();
	}
	private void initialize() {
		getContentPane().add(getBtnFacil());
	}
	private Button getBtnFacil() {
		if (btnFacil == null) {
			btnFacil = new Button("FACIL");
			btnFacil.setBounds(87, 201, 70, 22);
			//btnFacil.addActionListener(this);
		}
		return btnFacil;
	}

}
