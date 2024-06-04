import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MorraCinese extends JFrame {
	vittoria vittoria= new vittoria();
	sconfitta sconfitta= new sconfitta();
	pareggio pareggio=new pareggio();
	Start start=new Start();
	static boolean Bcarta=false, Bforbice=false, Bsasso=false, Ecarta=false, Eforbice=false, Esasso=false;
	
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MorraCinese() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("morracineseicona.jpg"));
		setTitle("Morra Cinese");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel pannelloreset = new JPanel();
		pannelloreset.setBounds(264, 22, 598, 647);
		contentPane.add(pannelloreset);
		pannelloreset.setLayout(null);
		
		
		
		JLabel carta = new JLabel("");
		carta.setIcon(new ImageIcon("cartagrande.jpg"));
		carta.setBounds(384, 296, 110, 158);
		contentPane.add(carta);
		
		JLabel forbice = new JLabel("");
		forbice.setIcon(new ImageIcon("forbicegrande.jpg"));
		forbice.setBounds(384, 279, 110, 175);
		contentPane.add(forbice);
		
		JLabel sasso = new JLabel("");
		sasso.setIcon(new ImageIcon("sassogrande.jpg"));
		sasso.setBounds(384, 296, 110, 158);
		contentPane.add(sasso);
		
		JLabel carta_1 = new JLabel("");
		carta_1.setIcon(new ImageIcon("carta2grande.jpg"));
		carta_1.setBounds(377, 91, 117, 158);
		contentPane.add(carta_1);
		
		JLabel forbice_1 = new JLabel("");
		forbice_1.setIcon(new ImageIcon("forbice2grande.jpg"));
		forbice_1.setBounds(384, 77, 110, 175);
		contentPane.add(forbice_1);
		
		JLabel sasso_1 = new JLabel("");
		sasso_1.setIcon(new ImageIcon("sasso2grande.jpg"));
		sasso_1.setBounds(362, 81, 141, 158);
		contentPane.add(sasso_1);
		
		
		JButton bottonecarta = new JButton("");
		bottonecarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bcarta=true;
				Bforbice=false;
				Bsasso=false;
				carta.setVisible(true);
				carta.setEnabled(false);
				
				sasso.setVisible(false);
				forbice.setVisible(false);
			}
		});
		bottonecarta.setIcon(new ImageIcon("carta.jpg"));
		bottonecarta.setBounds(300, 480, 86, 90);
		contentPane.add(bottonecarta);
		
		JButton bottoneforbice = new JButton("");
		bottoneforbice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bcarta=false;
				Bforbice=true;
				Bsasso=false;
				forbice.setVisible(true);
				forbice.setEnabled(false);
				
				sasso.setVisible(false);
				carta.setVisible(false);
			}
		});
		bottoneforbice.setIcon(new ImageIcon("forbice.jpg"));
		bottoneforbice.setBounds(396, 480, 86, 90);
		contentPane.add(bottoneforbice);
		
		JButton bottonesasso = new JButton("");
		bottonesasso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bcarta=false;
				Bforbice=false;
				Bsasso=true;
				sasso.setVisible(true);
				sasso.setEnabled(false);
				
				carta.setVisible(false);
				forbice.setVisible(false);
			}
		});
		bottonesasso.setIcon(new ImageIcon("sasso.jpg"));
		bottonesasso.setBounds(492, 480, 86, 90);
		contentPane.add(bottonesasso);
		
		JButton nuovapartita = new JButton("Nuova Partita");
		nuovapartita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start();
			}
			void start() {
				nuovapartita.setEnabled(false);
				pannelloreset.setVisible(false);
				
				carta.setVisible(false);
				forbice.setVisible(false);
				sasso.setVisible(false);
				
				carta_1.setVisible(false);
				forbice_1.setVisible(false);
				sasso_1.setVisible(false);
				
				Bsasso=false;
				Bcarta=false;
				Bforbice=false;
				
				Esasso=false;
				Ecarta=false;
				Eforbice=false;
				
				vittoria.setVisible(false);
				sconfitta.setVisible(false);
				pareggio.setVisible(false);
				
				bottonecarta.setEnabled(true);
				bottoneforbice.setEnabled(true);
				bottonesasso.setEnabled(true);
				
				
			}
		});
		nuovapartita.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		nuovapartita.setBounds(10, 261, 244, 62);
		contentPane.add(nuovapartita);
		
		JButton conferma = new JButton("conferma");
		conferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generazione();
				if(Bcarta==true) {
					carta.setEnabled(true);
					if(Esasso==true)
						vittoria();
					if(Eforbice==true)
						sconfitta();
					if(Ecarta==true)
						pareggio();
				}
				if(Bforbice==true) {
					forbice.setEnabled(true);
					if(Esasso==true)
						sconfitta();
					if(Eforbice==true)
						pareggio();
					if(Ecarta==true)
						vittoria();
				}
				if(Bsasso==true) {
					sasso.setEnabled(true);
					if(Esasso==true)
						pareggio();
					if(Eforbice==true)
						vittoria();
					if(Ecarta==true)
						sconfitta();
				}
				nuovapartita.setEnabled(true);
				bottonecarta.setEnabled(false);
				bottoneforbice.setEnabled(false);
				bottonesasso.setEnabled(false);
			}
			void generazione(){
				 // crea oggetto Random
		        Random random = new Random();
		        // genera numero casuale tra 0 e 2
		        int number = random.nextInt(3);
		        switch (number) {
		        	case 0: 
		        		Esasso=true;
		        		sasso_1.setVisible(true);
		        		break;
		        	case 1: 
		        		Eforbice=true;
		        		forbice_1.setVisible(true);
		        		break;
		        	case 2: 
		        		Ecarta=true;
		        		carta_1.setVisible(true);
		        		break;
		        	default: System.out.println("Errore");
		        }
			}
			void vittoria() {
				vittoria.setVisible(true);
			}
			void sconfitta() {
				sconfitta.setVisible(true);
			}
			void pareggio() {
				pareggio.setVisible(true);
			}
		});
		conferma.setBounds(396, 587, 89, 23);
		contentPane.add(conferma);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setIcon(new ImageIcon("homeicon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				start.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(10, 11, 101, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
