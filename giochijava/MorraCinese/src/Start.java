import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// RPS OPTIONS
		
		
		JButton btnNewButton = new JButton("GIOCA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MorraCinese gioco = new MorraCinese();
				gioco.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(267, 20, 157, 74);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("MORRA CINESE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(10, 28, 258, 48);
		contentPane.add(lblNewLabel);
		
		// CLOSE APPLICATION
		
		JButton btnNewButton_1 = new JButton("chiudi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(174, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		// TRIS OPTIONS
		
		JLabel lblTris = new JLabel("TRIS");
		lblTris.setHorizontalAlignment(SwingConstants.CENTER);
		lblTris.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblTris.setBounds(10, 149, 258, 48);
		contentPane.add(lblTris);
		
		JButton btnNewButton_2 = new JButton("GIOCA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tris tris=new Tris();
				tris.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(267, 141, 157, 74);
		contentPane.add(btnNewButton_2);
	}
}
