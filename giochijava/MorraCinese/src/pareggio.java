import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pareggio extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public pareggio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHaiVinto = new JLabel("PAREGGIO!");
		lblHaiVinto.setHorizontalAlignment(SwingConstants.CENTER);
		lblHaiVinto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblHaiVinto.setBounds(10, 60, 326, 98);
		contentPane.add(lblHaiVinto);
		
		JButton btnChiudi = new JButton("chiudi");
		btnChiudi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnChiudi.setBounds(128, 207, 89, 23);
		contentPane.add(btnChiudi);
	}

}
