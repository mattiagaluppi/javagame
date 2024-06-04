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

public class sconfitta extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public sconfitta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHaiPerso = new JLabel("HAI PERSO!");
		lblHaiPerso.setHorizontalAlignment(SwingConstants.CENTER);
		lblHaiPerso.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblHaiPerso.setBounds(10, 61, 320, 98);
		contentPane.add(lblHaiPerso);
		
		JButton btnNewButton = new JButton("chiudi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(124, 205, 89, 23);
		contentPane.add(btnNewButton);
	}

}
