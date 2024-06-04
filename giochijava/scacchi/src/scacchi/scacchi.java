package scacchi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.util.concurrent.*;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Color;

public class scacchi extends JFrame {

	static private JTextField C_7;
	static String Cs_7;
	static private JTextField C_8;
	static String Cs_8;
	static private JTextField C_9;
	static String Cs_9;
	static private JTextField C_4;
	static String Cs_4;
	static private JTextField C_5;
	static String Cs_5;
	static private JTextField C_6;
	static String Cs_6;
	static private JTextField C_1;
	static String Cs_1;
	static private JTextField C_2;
	static String Cs_2;
	static private JTextField C_3;
	static String Cs_3;
	private static JButton X_8;
	private static JButton X_9;
	private static JButton X_4;
	private static JButton X_7;
	private static JButton X_5;
	private static JButton X_6;
	private static JButton X_1;
	private static JButton X_2;
	private static JButton X_3;
	private static JButton btnNewButton_9;
	private static JButton btnNewButton_10;
	private static JButton btnNewButton_11;
	private static JButton btnNewButton_12;
	private static JButton btnNewButton_13;
	private static JButton btnNewButton_14;
	private static JButton btnNewButton_15;
	private static JButton btnNewButton_16;
	private static JButton btnNewButton_17;
	private JButton reset;
	private static JTextField stato;
	
	static boolean tris;
	static int X, O, s = 0,par;
	private static JTextField O_P;
	private static JTextField X_P;
	static boolean X_V, O_V;
	private static Panel O_cover;
	private static Panel X_cover;
	private static JTextField set;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private static Panel Col_1;
	private static Panel Col_2;
	private static Panel Col_3;
	private static Panel Rig_1;
	private static Panel Rig_2;
	private static Panel Rig_3;
	private static Panel panelD;
	private static Panel panelD_1;
	private static Panel panelD_2;
	private static Panel panelD_3;
	private static Panel panelD_4;
	private static Panel panelD_5;
	private static Panel panelD_6;
	private static Panel panelD_7;
	private static Panel panelD_8;
	private static Panel panelD_9;
	private static Panel panelD_10;
	private static Panel panelD_11;
	private static Panel panelD_12;
	private static Panel panelD_13;
	private static Panel panelD_14;
	private static Panel panelD_15;
	private static Panel panelD_16;
	private static Panel panelD_17;
	private static Panel panelD_18;
	private static Panel panelD_19;
	private static Panel panelD_20;
	private static Panel panelD_21;
	private static Panel panelD_22;
	private static Panel panelD_23;
	private static Panel panelD_24;
	private static Panel panelD_25;
	private static Panel panelD_26;
	private static Panel panelD_27;
	private static Panel panelD_28;
	private static Panel panelD_29;
	private static Panel panelD_30;
	private static Panel panelD_31;
	private static Panel panelD_32;
	private static Panel panelD2;
	private static Panel panelD2_1;
	private static Panel panelD2_2;
	private static Panel panelD2_3;
	private static Panel panelD2_4;
	private static Panel panelD2_5;
	private static Panel panelD2_6;
	private static Panel panelD2_7;
	private static Panel panelD2_8;
	private static Panel panelD2_9;
	private static Panel panelD2_10;
	private static Panel panelD2_11;
	private static Panel panelD2_12;
	private static Panel panelD2_13;
	private static Panel panelD2_14;
	private static Panel panelD2_15;
	private static Panel panelD2_16;
	private static Panel panelD2_17;
	private static Panel panelD2_18;
	private static Panel panelD2_19;
	private static Panel panelD2_20;
	private static Panel panelD2_21;
	private static Panel panelD2_22;
	private static Panel panelD2_23;
	private static Panel panelD2_24;
	private static Panel panelD2_25;
	private static Panel panelD2_26;
	private static Panel panelD2_27;
	private static Panel panelD2_28;
	private static Panel panelD2_29;
	private static Panel panelD2_30;
	private static Panel panelD2_31;
	private static Panel panelD2_32;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scacchi frame = new scacchi();
					frame.setVisible(true);
					frame.setBounds(0, 0, 1200, 560);
					inizio();
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static void inizio() {
		X_V = false;
		turno();
		reset();
		
		X = 0;
		O = 0;
		O_P.setText("" + O);
		X_P.setText("" + X);
		set.setText("SET " + s);
	}
	public scacchi() {
		setResizable(false);
	
		getContentPane().setLayout(null);
		
		panelD2_32 = new Panel();
		panelD2_32.setBackground(Color.RED);
		panelD2_32.setBounds(473, 394, 10, 10);
		getContentPane().add(panelD2_32);
		
		panelD2_1 = new Panel();
		panelD2_1.setBackground(Color.RED);
		panelD2_1.setBounds(702, 150, 10, 10);
		getContentPane().add(panelD2_1);
		
		panelD2_3 = new Panel();
		panelD2_3.setBackground(Color.RED);
		panelD2_3.setBounds(695, 158, 10, 10);
		getContentPane().add(panelD2_3);
		
		panelD2_25 = new Panel();
		panelD2_25.setBackground(Color.RED);
		panelD2_25.setBounds(490, 380, 10, 10);
		getContentPane().add(panelD2_25);
		
		panelD2_11 = new Panel();
		panelD2_11.setBackground(Color.RED);
		panelD2_11.setBounds(620, 238, 10, 10);
		getContentPane().add(panelD2_11);
		
		panelD2_2 = new Panel();
		panelD2_2.setBackground(Color.RED);
		panelD2_2.setBounds(687, 166, 10, 10);
		getContentPane().add(panelD2_2);
		
		panelD2_9 = new Panel();
		panelD2_9.setBackground(Color.RED);
		panelD2_9.setBounds(605, 254, 10, 10);
		getContentPane().add(panelD2_9);
		
		panelD2_26 = new Panel();
		panelD2_26.setBackground(Color.RED);
		panelD2_26.setBounds(497, 372, 10, 10);
		getContentPane().add(panelD2_26);
		
		panelD2_30 = new Panel();
		panelD2_30.setBackground(Color.RED);
		panelD2_30.setBounds(527, 340, 10, 10);
		getContentPane().add(panelD2_30);
		
		panelD2_29 = new Panel();
		panelD2_29.setBackground(Color.RED);
		panelD2_29.setBounds(520, 348, 10, 10);
		getContentPane().add(panelD2_29);
		
		panelD2_4 = new Panel();
		panelD2_4.setBackground(Color.RED);
		panelD2_4.setBounds(657, 198, 10, 10);
		getContentPane().add(panelD2_4);
		
		panelD2_7 = new Panel();
		panelD2_7.setBackground(Color.RED);
		panelD2_7.setBounds(680, 174, 10, 10);
		getContentPane().add(panelD2_7);
		
		panelD2_19 = new Panel();
		panelD2_19.setBackground(Color.RED);
		panelD2_19.setBounds(580, 284, 10, 10);
		getContentPane().add(panelD2_19);
		
		panelD2_21 = new Panel();
		panelD2_21.setBackground(Color.RED);
		panelD2_21.setBounds(550, 316, 10, 10);
		getContentPane().add(panelD2_21);
		
		panelD2_23 = new Panel();
		panelD2_23.setBackground(Color.RED);
		panelD2_23.setBounds(565, 300, 10, 10);
		getContentPane().add(panelD2_23);
		
		panelD2_31 = new Panel();
		panelD2_31.setBackground(Color.RED);
		panelD2_31.setBounds(535, 332, 10, 10);
		getContentPane().add(panelD2_31);
		
		panelD2_10 = new Panel();
		panelD2_10.setBackground(Color.RED);
		panelD2_10.setBounds(612, 246, 10, 10);
		getContentPane().add(panelD2_10);
		
		panelD2 = new Panel();
		panelD2.setBackground(Color.RED);
		panelD2.setBounds(710, 142, 10, 10);
		getContentPane().add(panelD2);
		
		panelD2_22 = new Panel();
		panelD2_22.setBackground(Color.RED);
		panelD2_22.setBounds(557, 308, 10, 10);
		getContentPane().add(panelD2_22);
		
		panelD2_16 = new Panel();
		panelD2_16.setBackground(Color.RED);
		panelD2_16.setBounds(592, 270, 10, 10);
		getContentPane().add(panelD2_16);
		
		panelD2_28 = new Panel();
		panelD2_28.setBackground(Color.RED);
		panelD2_28.setBounds(512, 356, 10, 10);
		getContentPane().add(panelD2_28);
		
		panelD2_12 = new Panel();
		panelD2_12.setBackground(Color.RED);
		panelD2_12.setBounds(627, 230, 10, 10);
		getContentPane().add(panelD2_12);
		
		panelD2_14 = new Panel();
		panelD2_14.setBackground(Color.RED);
		panelD2_14.setBounds(642, 214, 10, 10);
		getContentPane().add(panelD2_14);
		
		panelD2_13 = new Panel();
		panelD2_13.setBackground(Color.RED);
		panelD2_13.setBounds(635, 222, 10, 10);
		getContentPane().add(panelD2_13);
		
		panelD2_15 = new Panel();
		panelD2_15.setBackground(Color.RED);
		panelD2_15.setBounds(650, 206, 10, 10);
		getContentPane().add(panelD2_15);
		
		panelD2_27 = new Panel();
		panelD2_27.setBackground(Color.RED);
		panelD2_27.setBounds(505, 364, 10, 10);
		getContentPane().add(panelD2_27);
		
		panelD2_18 = new Panel();
		panelD2_18.setBackground(Color.RED);
		panelD2_18.setBounds(572, 292, 10, 10);
		getContentPane().add(panelD2_18);
		
		panelD2_5 = new Panel();
		panelD2_5.setBackground(Color.RED);
		panelD2_5.setBounds(665, 190, 10, 10);
		getContentPane().add(panelD2_5);
		
		panelD2_6 = new Panel();
		panelD2_6.setBackground(Color.RED);
		panelD2_6.setBounds(672, 182, 10, 10);
		getContentPane().add(panelD2_6);
		
		panelD2_17 = new Panel();
		panelD2_17.setBackground(Color.RED);
		panelD2_17.setBounds(587, 276, 10, 10);
		getContentPane().add(panelD2_17);
		
		panelD2_20 = new Panel();
		panelD2_20.setBackground(Color.RED);
		panelD2_20.setBounds(542, 324, 10, 10);
		getContentPane().add(panelD2_20);
		
		panelD2_24 = new Panel();
		panelD2_24.setBackground(Color.RED);
		panelD2_24.setBounds(482, 388, 10, 10);
		getContentPane().add(panelD2_24);
		
		panelD2_8 = new Panel();
		panelD2_8.setBackground(Color.RED);
		panelD2_8.setBounds(597, 262, 10, 10);
		getContentPane().add(panelD2_8);
		
		panelD_25 = new Panel();
		panelD_25.setBackground(Color.RED);
		panelD_25.setBounds(706, 384, 10, 10);
		getContentPane().add(panelD_25);
		
		panelD_28 = new Panel();
		panelD_28.setBackground(Color.RED);
		panelD_28.setBounds(690, 368, 10, 10);
		getContentPane().add(panelD_28);
		
		panelD_32 = new Panel();
		panelD_32.setBackground(Color.RED);
		panelD_32.setBounds(457, 144, 10, 10);
		getContentPane().add(panelD_32);
		
		panelD_29 = new Panel();
		panelD_29.setBackground(Color.RED);
		panelD_29.setBounds(674, 353, 10, 10);
		getContentPane().add(panelD_29);
		
		panelD_24 = new Panel();
		panelD_24.setBackground(Color.RED);
		panelD_24.setBounds(714, 392, 10, 10);
		getContentPane().add(panelD_24);
		
		panelD_27 = new Panel();
		panelD_27.setBackground(Color.RED);
		panelD_27.setBounds(682, 361, 10, 10);
		getContentPane().add(panelD_27);
		
		panelD_26 = new Panel();
		panelD_26.setBackground(Color.RED);
		panelD_26.setBounds(698, 376, 10, 10);
		getContentPane().add(panelD_26);
		
		panelD_31 = new Panel();
		panelD_31.setBackground(Color.RED);
		panelD_31.setBounds(464, 152, 10, 10);
		getContentPane().add(panelD_31);
		
		panelD_30 = new Panel();
		panelD_30.setBackground(Color.RED);
		panelD_30.setBounds(471, 160, 10, 10);
		getContentPane().add(panelD_30);
		
		panelD_15 = new Panel();
		panelD_15.setBackground(Color.RED);
		panelD_15.setBounds(650, 330, 10, 10);
		getContentPane().add(panelD_15);
		
		panelD_11 = new Panel();
		panelD_11.setBackground(Color.RED);
		panelD_11.setBounds(552, 237, 10, 10);
		getContentPane().add(panelD_11);
		
		panelD_13 = new Panel();
		panelD_13.setBackground(Color.RED);
		panelD_13.setBounds(658, 338, 10, 10);
		getContentPane().add(panelD_13);
		
		panelD_17 = new Panel();
		panelD_17.setBackground(Color.RED);
		panelD_17.setBounds(626, 307, 10, 10);
		getContentPane().add(panelD_17);
		
		panelD_21 = new Panel();
		panelD_21.setBackground(Color.RED);
		panelD_21.setBounds(593, 276, 10, 10);
		getContentPane().add(panelD_21);
		
		panelD_22 = new Panel();
		panelD_22.setBackground(Color.RED);
		panelD_22.setBounds(585, 268, 10, 10);
		getContentPane().add(panelD_22);
		
		panelD_16 = new Panel();
		panelD_16.setBackground(Color.RED);
		panelD_16.setBounds(634, 315, 10, 10);
		getContentPane().add(panelD_16);
		
		Rig_2 = new Panel();
		Rig_2.setBackground(Color.RED);
		Rig_2.setBounds(453, 271, 285, 10);
		getContentPane().add(Rig_2);
		
		panelD_3 = new Panel();
		panelD_3.setBackground(Color.RED);
		panelD_3.setBounds(495, 183, 10, 10);
		getContentPane().add(panelD_3);
		
		panelD_23 = new Panel();
		panelD_23.setBackground(Color.RED);
		panelD_23.setBounds(577, 260, 10, 10);
		getContentPane().add(panelD_23);
		
		panelD_2 = new Panel();
		panelD_2.setBackground(Color.RED);
		panelD_2.setBounds(503, 191, 10, 10);
		getContentPane().add(panelD_2);
		
		panelD_19 = new Panel();
		panelD_19.setBackground(Color.RED);
		panelD_19.setBounds(610, 291, 10, 10);
		getContentPane().add(panelD_19);
		
		panelD_10 = new Panel();
		panelD_10.setBackground(Color.RED);
		panelD_10.setBounds(544, 229, 10, 10);
		getContentPane().add(panelD_10);
		
		panelD_6 = new Panel();
		panelD_6.setBackground(Color.RED);
		panelD_6.setBounds(512, 198, 10, 10);
		getContentPane().add(panelD_6);
		
		panelD_20 = new Panel();
		panelD_20.setBackground(Color.RED);
		panelD_20.setBounds(601, 284, 10, 10);
		getContentPane().add(panelD_20);
		
		panelD_8 = new Panel();
		panelD_8.setBackground(Color.RED);
		panelD_8.setBounds(568, 253, 10, 10);
		getContentPane().add(panelD_8);
		
		Rig_1 = new Panel();
		Rig_1.setBackground(Color.RED);
		Rig_1.setBounds(453, 173, 285, 10);
		getContentPane().add(Rig_1);
		
		panelD_9 = new Panel();
		panelD_9.setBackground(Color.RED);
		panelD_9.setBounds(560, 245, 10, 10);
		getContentPane().add(panelD_9);
		
		panelD_14 = new Panel();
		panelD_14.setBackground(Color.RED);
		panelD_14.setBounds(642, 322, 10, 10);
		getContentPane().add(panelD_14);
		
		panelD_5 = new Panel();
		panelD_5.setBackground(Color.RED);
		panelD_5.setBounds(528, 214, 10, 10);
		getContentPane().add(panelD_5);
		
		panelD_4 = new Panel();
		panelD_4.setBackground(Color.RED);
		panelD_4.setBounds(536, 222, 10, 10);
		getContentPane().add(panelD_4);
		
		Rig_3 = new Panel();
		Rig_3.setBackground(Color.RED);
		Rig_3.setBounds(453, 358, 285, 10);
		getContentPane().add(Rig_3);
		
		panelD = new Panel();
		panelD.setBackground(Color.RED);
		panelD.setBounds(479, 167, 10, 10);
		getContentPane().add(panelD);
		
		panelD_12 = new Panel();
		panelD_12.setBackground(Color.RED);
		panelD_12.setBounds(666, 346, 10, 10);
		getContentPane().add(panelD_12);
		
		panelD_1 = new Panel();
		panelD_1.setBackground(Color.RED);
		panelD_1.setBounds(487, 175, 10, 10);
		getContentPane().add(panelD_1);
		
		panelD_18 = new Panel();
		panelD_18.setBackground(Color.RED);
		panelD_18.setBounds(618, 299, 10, 10);
		getContentPane().add(panelD_18);
		
		panelD_7 = new Panel();
		panelD_7.setBackground(Color.RED);
		panelD_7.setBounds(520, 206, 10, 10);
		getContentPane().add(panelD_7);
		
		Col_1 = new Panel();
		Col_1.setBackground(Color.RED);
		Col_1.setBounds(494, 135, 10, 281);
		getContentPane().add(Col_1);
		
		Col_2 = new Panel();
		Col_2.setBackground(Color.RED);
		Col_2.setBounds(588, 135, 10, 281);
		getContentPane().add(Col_2);
		
		Col_3 = new Panel();
		Col_3.setBackground(Color.RED);
		Col_3.setBounds(680, 135, 10, 281);
		getContentPane().add(Col_3);
		
		X_cover = new Panel();
		X_cover.setBounds(773, 132, 263, 272);
		getContentPane().add(X_cover);
		
		O_cover = new Panel();
		O_cover.setBounds(120, 135, 304, 281);
		getContentPane().add(O_cover);
		
		C_7 = new JTextField();
		C_7.setEditable(false);
		C_7.setHorizontalAlignment(SwingConstants.CENTER);
		C_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_7.setBounds(463, 329, 70, 70);
		getContentPane().add(C_7);
		C_7.setColumns(10);
		
		C_8 = new JTextField();
		C_8.setEditable(false);
		C_8.setHorizontalAlignment(SwingConstants.CENTER);
		C_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_8.setColumns(10);
		C_8.setBounds(557, 329, 70, 70);
		getContentPane().add(C_8);
		
		C_9 = new JTextField();
		C_9.setEditable(false);
		C_9.setHorizontalAlignment(SwingConstants.CENTER);
		C_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_9.setColumns(10);
		C_9.setBounds(650, 329, 70, 70);
		getContentPane().add(C_9);
		
		C_4 = new JTextField();
		C_4.setEditable(false);
		C_4.setHorizontalAlignment(SwingConstants.CENTER);
		C_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_4.setColumns(10);
		C_4.setBounds(463, 238, 70, 70);
		getContentPane().add(C_4);
		
		C_5 = new JTextField();
		C_5.setEditable(false);
		C_5.setHorizontalAlignment(SwingConstants.CENTER);
		C_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_5.setColumns(10);
		C_5.setBounds(557, 238, 70, 70);
		getContentPane().add(C_5);
		
		C_6 = new JTextField();
		C_6.setEditable(false);
		C_6.setHorizontalAlignment(SwingConstants.CENTER);
		C_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_6.setColumns(10);
		C_6.setBounds(650, 238, 70, 70);
		getContentPane().add(C_6);
		
		C_1 = new JTextField();
		C_1.setEditable(false);
		C_1.setHorizontalAlignment(SwingConstants.CENTER);
		C_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_1.setColumns(10);
		C_1.setBounds(463, 146, 70, 70);
		getContentPane().add(C_1);
		
		C_2 = new JTextField();
		C_2.setEditable(false);
		C_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_2.setHorizontalAlignment(SwingConstants.CENTER);
		C_2.setColumns(10);
		C_2.setBounds(557, 146, 70, 70);
		getContentPane().add(C_2);
		
		C_3 = new JTextField();
		C_3.setEditable(false);
		C_3.setHorizontalAlignment(SwingConstants.CENTER);
		C_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		C_3.setColumns(10);
		C_3.setBounds(650, 146, 70, 70);
		getContentPane().add(C_3);
		
		X_7 = new JButton("X");
		X_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_7.setText("X");
				Cs_7 = "X";	
				verifica();
				X_V = false;
				turno();
				btnNewButton_17.setVisible(false);
				X_7.setVisible(false);
			}
		});
		X_7.setBounds(780, 329, 70, 70);
		getContentPane().add(X_7);
		
		X_8 = new JButton("X");
		X_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_8.setText("X");
				Cs_8 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_12.setVisible(false);
				X_8.setVisible(false);
			}
		});
		X_8.setBounds(866, 329, 70, 70);
		getContentPane().add(X_8);
		
		X_9 = new JButton("X");
		X_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_9.setText("X");
				Cs_9 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_11.setVisible(false);
				X_9.setVisible(false);
			}
		});
		X_9.setBounds(946, 329, 70, 70);
		getContentPane().add(X_9);
		
		X_4 = new JButton("X");
		X_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_4.setText("X");
				Cs_4 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_16.setVisible(false);
				X_4.setVisible(false);
			}
		});
		X_4.setBounds(780, 238, 70, 70);
		getContentPane().add(X_4);
		
		X_5 = new JButton("X");
		X_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_5.setText("X");
				Cs_5 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_13.setVisible(false);
				X_5.setVisible(false);
			}
		});
		X_5.setBounds(866, 238, 70, 70);
		getContentPane().add(X_5);
		
		X_6 = new JButton("X");
		X_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_6.setText("X");
				Cs_6 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_10.setVisible(false);
				X_6.setVisible(false);
			}
		});
		X_6.setBounds(946, 238, 70, 70);
		getContentPane().add(X_6);
		
		X_1 = new JButton("X");
		X_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_1.setText("X");
				Cs_1 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_15.setVisible(false);
				X_1.setVisible(false);
			}
		});
		X_1.setBounds(780, 138, 70, 70);
		getContentPane().add(X_1);
		
		X_2 = new JButton("X");
		X_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_2.setText("X");
				Cs_2 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_14.setVisible(false);
				X_2.setVisible(false);
			}
		});
		X_2.setBounds(866, 146, 70, 70);
		getContentPane().add(X_2);
		
		X_3 = new JButton("X");
		X_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		X_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_3.setText("X");
				Cs_3 = "X";
				verifica();
				X_V = false;
				turno();
				btnNewButton_9.setVisible(false);
				X_3.setVisible(false);
			}
		});
		X_3.setBounds(946, 146, 70, 70);
		getContentPane().add(X_3);
		
		btnNewButton_9 = new JButton("O");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_3.setText("O");
				Cs_3 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_9.setVisible(false);
				X_3.setVisible(false);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_9.setBounds(357, 146, 70, 70);
		getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("O");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_6.setText("O");
				Cs_6 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_10.setVisible(false);
				X_6.setVisible(false);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_10.setBounds(357, 238, 70, 70);
		getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("O");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_9.setText("O");
				Cs_9 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_11.setVisible(false);
				X_9.setVisible(false);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_11.setBounds(357, 329, 70, 70);
		getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("O");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_8.setText("O");
				Cs_8 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_12.setVisible(false);
				X_8.setVisible(false);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_12.setBounds(260, 329, 70, 70);
		getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("O");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_5.setText("O");
				Cs_5 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_13.setVisible(false);
				X_5.setVisible(false);
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_13.setBounds(260, 238, 70, 70);
		getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("O");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_2.setText("O");
				Cs_2 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_14.setVisible(false);
				X_2.setVisible(false);
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_14.setBounds(260, 146, 70, 70);
		getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("O");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_1.setText("O");
				Cs_1 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_15.setVisible(false);
				X_1.setVisible(false);
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_15.setBounds(170, 142, 70, 70);
		getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("O");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_4.setText("O");
				Cs_4 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_16.setVisible(false);
				X_4.setVisible(false);
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_16.setBounds(170, 238, 70, 70);
		getContentPane().add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("O");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_7.setText("O");
				Cs_7 = "O";
				verifica();
				X_V = true;
				turno();
				btnNewButton_17.setVisible(false);
				X_7.setVisible(false);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_17.setBounds(170, 329, 70, 70);
		getContentPane().add(btnNewButton_17);
		
		reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		reset.setBounds(557, 473, 89, 23);
		getContentPane().add(reset);
		
		stato = new JTextField();
		stato.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		stato.setHorizontalAlignment(SwingConstants.CENTER);
		stato.setEditable(false);
		stato.setBounds(535, 47, 124, 50);
		getContentPane().add(stato);
		stato.setColumns(10);
		
		
		O_P = new JTextField();
		O_P.setHorizontalAlignment(SwingConstants.CENTER);
		O_P.setEditable(false);
		O_P.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		O_P.setBounds(475, 47, 50, 50);
		getContentPane().add(O_P);
		O_P.setColumns(10);
		
		X_P = new JTextField();
		X_P.setHorizontalAlignment(SwingConstants.CENTER);
		X_P.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		X_P.setEditable(false);
		X_P.setBounds(669, 47, 50, 50);
		getContentPane().add(X_P);
		X_P.setColumns(10);
		
		set = new JTextField();
		set.setHorizontalAlignment(SwingConstants.CENTER);
		set.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		set.setEditable(false);
		set.setBounds(376, 47, 89, 50);
		getContentPane().add(set);
		set.setColumns(10);
		
		lblNewLabel_1 = new JLabel("O");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(475, 24, 46, 23);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(670, 25, 46, 21);
		getContentPane().add(lblNewLabel_2);
	}
	
	static void verifica() {
		try {	
			System.out.println("");			
			System.out.println(Cs_1 + " " + Cs_2 + " " + Cs_3);
			System.out.println(Cs_4 + " " + Cs_5 + " " + Cs_6);
			System.out.println(Cs_7 + " " + Cs_8 + " " + Cs_9);
			System.out.println("");	
			System.out.println("X: " + X + " O: " + O + " par: " + par + " stato: " + tris);
		
		//riga
		if(Cs_1.equals(Cs_2) && Cs_2.equals(Cs_3)) {
			if(Cs_1.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x riga 1");
				tris = true;
				Rig_1.setVisible(true);
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");	
				O_P.setText("" + O);
				System.out.println("tris 0 riga 1");
				tris = true;
				Rig_1.setVisible(true);
				fin_tur();
			}
		}
		else {
			par++;
		}
		
		
		if(Cs_4.equals(Cs_5) && Cs_5.equals(Cs_6)) {
			if(Cs_4.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x riga 2");
				tris = true;
				Rig_2.setVisible(true);
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");
				O_P.setText("" + O);
				System.out.println("tris o riga 2");
				tris = true;
				Rig_2.setVisible(true);
				fin_tur();
				
			}
		}
		else {
			par++;
		}
		
		if(Cs_7.equals(Cs_8) && Cs_8.equals(Cs_9)) {
			if(Cs_7.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x riga 3");
				tris = true;
				Rig_3.setVisible(true);
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");		
				O_P.setText("" + O);
				System.out.println("tris o riga 3");
				tris = true;
				Rig_3.setVisible(true);
				fin_tur();
			}
		}
		else {
			par++;
		}
		
		//colonna
		if(Cs_1.equals(Cs_4) && Cs_4.equals(Cs_7)) {
			if(Cs_1.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x colonna 1");
				tris = true;
				Col_1.setVisible(true);
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");		
				O_P.setText("" + O);
				System.out.println("tris o colonna 1");
				tris = true;
				Col_1.setVisible(true);
				fin_tur();
			}
		}
		else {
			par++;
		}
		
		if(Cs_2.equals(Cs_5) && Cs_5.equals(Cs_8)) {
			if(Cs_2.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x colonna 2");
				tris = true;
				Col_2.setVisible(true);
				fin_tur();
				
			}
			else {
				O++;
				stato.setText("TRIS: O");		
				O_P.setText("" + O);
				System.out.println("tris o colonna 2");
				tris = true;
				Col_2.setVisible(true);
				fin_tur();
			}
		}
		else {
			
			par++;;
		}
		
		if(Cs_3.equals(Cs_6) && Cs_6.equals(Cs_9)) {
			if(Cs_3.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x colonna 3");
				tris = true;
				Col_3.setVisible(true);
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");	
				O_P.setText("" + O);
				System.out.println("tris o colonna 3");
				tris = true;
				Col_3.setVisible(true);
				fin_tur();
			}
		}
		else {
			par++;
		}
		
		//diagonale
		
		if(Cs_1.equals(Cs_5) && Cs_5.equals(Cs_9)) {
			if(Cs_1.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x diagonale 1");
				tris = true;
				D1true();
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");	
				O_P.setText("" + O);
				System.out.println("tris o diagonale 1");
				tris = true;
				D1true();
				fin_tur();
			}
		}
		else {
			par++;
		}
		
		if(Cs_3.equals(Cs_5) && Cs_5.equals(Cs_7)) {
			if(Cs_3.equals("X")) {
				X++;
				stato.setText("TRIS: X");
				X_P.setText("" + X);
				System.out.println("tris x diagonale 2");
				tris = true;
				D2true();
				fin_tur();
			}
			else {
				O++;
				stato.setText("TRIS: O");	
				O_P.setText("" + O);
				System.out.println("tris o diagonale 2");
				tris = true;
				D2true();
				fin_tur();
				}
			}
		else {
			par++;
		}
		
		if(par == 72 && tris == false) {
			stato.setText("PARI");	
			System.out.println("pari");
			fin_tur();
		}
		
		}
	catch(Exception e) {System.out.println(e);}
	}
	
	static void	reset(){

		C_1.setText(null);
		Cs_1 = C_1.getText() + "a";
		C_2.setText(null);
		Cs_2 = C_2.getText() + "b";
		C_3.setText(null);
		Cs_3 = C_3.getText() + "c";
		C_4.setText(null);
		Cs_4 = C_4.getText() + "d";
		C_5.setText(null);
		Cs_5 = C_5.getText() + "e";
		C_6.setText(null);
		Cs_6 = C_6.getText() + "f";
		C_7.setText(null);
		Cs_7 = C_7.getText() + "g";
		C_8.setText(null);
		Cs_8 = C_8.getText() + "h";
		C_9.setText(null);
		Cs_9 = C_9.getText() + "i";
		
		X_9.setVisible(true);
		X_8.setVisible(true);
		X_7.setVisible(true);
		X_6.setVisible(true);
		X_5.setVisible(true);
		X_4.setVisible(true);
		X_3.setVisible(true);
		X_2.setVisible(true);
		X_1.setVisible(true);
		
		btnNewButton_9.setVisible(true);
		btnNewButton_10.setVisible(true);
		btnNewButton_11.setVisible(true);
		btnNewButton_12.setVisible(true);
		btnNewButton_13.setVisible(true);
		btnNewButton_14.setVisible(true);
		btnNewButton_15.setVisible(true);
		btnNewButton_16.setVisible(true);
		btnNewButton_17.setVisible(true);
		
		stato.setText("TRIS: ");
		s++;
		set.setText("SET " + s);
		grafoff();
		par = 0;
		tris = false;
	}

	static void turno() {
	
		if(X_V == true) {
			O_cover.setVisible(true);
			X_cover.setVisible(false);
		}
		else {
			
			O_cover.setVisible(false);
			X_cover.setVisible(true);
		}
	}

	static void fin_tur() {
		System.out.println("");	
		System.out.println("fine del set " + s + " inizio del prossimo");
		
		X_9.setVisible(false);
		X_8.setVisible(false);
		X_7.setVisible(false);
		X_6.setVisible(false);
		X_5.setVisible(false);
		X_4.setVisible(false);
		X_3.setVisible(false);
		X_2.setVisible(false);
		X_1.setVisible(false);
		
		btnNewButton_9.setVisible(false);
		btnNewButton_10.setVisible(false);
		btnNewButton_11.setVisible(false);
		btnNewButton_12.setVisible(false);
		btnNewButton_13.setVisible(false);
		btnNewButton_14.setVisible(false);
		btnNewButton_15.setVisible(false);
		btnNewButton_16.setVisible(false);
		btnNewButton_17.setVisible(false);
		
		
	}
	
	static void grafoff() {
		Col_1.setVisible(false);
		Col_2.setVisible(false);
		Col_3.setVisible(false);
		Rig_1.setVisible(false);
		Rig_2.setVisible(false);
		Rig_3.setVisible(false);
		
		D1false();
		D2false();
	}
	
	static void D1false() {
		panelD.setVisible(false);
		panelD_1.setVisible(false);
		panelD_2.setVisible(false);
		panelD_3.setVisible(false);
		panelD_4.setVisible(false);
		panelD_5.setVisible(false);
		panelD_6.setVisible(false);
		panelD_7.setVisible(false);
		panelD_8.setVisible(false);
		panelD_9.setVisible(false);
		panelD_10.setVisible(false);
		panelD_11.setVisible(false);
		panelD_12.setVisible(false);
		panelD_13.setVisible(false);
		panelD_14.setVisible(false);
		panelD_15.setVisible(false);
		panelD_16.setVisible(false);
		panelD_17.setVisible(false);
		panelD_18.setVisible(false);
		panelD_19.setVisible(false);
		panelD_20.setVisible(false);
		panelD_21.setVisible(false);
		panelD_22.setVisible(false);
		panelD_23.setVisible(false);
		panelD_24.setVisible(false);
		panelD_25.setVisible(false);
		panelD_26.setVisible(false);
		panelD_27.setVisible(false);
		panelD_28.setVisible(false);
		panelD_29.setVisible(false);
		panelD_30.setVisible(false);
		panelD_31.setVisible(false);
		panelD_32.setVisible(false);
	}
	
	static void D1true() {
		panelD.setVisible(true);
		panelD_1.setVisible(true);
		panelD_2.setVisible(true);
		panelD_3.setVisible(true);
		panelD_4.setVisible(true);
		panelD_5.setVisible(true);
		panelD_6.setVisible(true);
		panelD_7.setVisible(true);
		panelD_8.setVisible(true);
		panelD_9.setVisible(true);
		panelD_10.setVisible(true);
		panelD_11.setVisible(true);
		panelD_12.setVisible(true);
		panelD_13.setVisible(true);
		panelD_14.setVisible(true);
		panelD_15.setVisible(true);
		panelD_16.setVisible(true);
		panelD_17.setVisible(true);
		panelD_18.setVisible(true);
		panelD_19.setVisible(true);
		panelD_20.setVisible(true);
		panelD_21.setVisible(true);
		panelD_22.setVisible(true);
		panelD_23.setVisible(true);
		panelD_24.setVisible(true);
		panelD_25.setVisible(true);
		panelD_26.setVisible(true);
		panelD_27.setVisible(true);
		panelD_28.setVisible(true);
		panelD_29.setVisible(true);
		panelD_30.setVisible(true);
		panelD_31.setVisible(true);
		panelD_32.setVisible(true);
	}
	
	static void D2false() {
		panelD2.setVisible(false);
		panelD2_1.setVisible(false);
		panelD2_2.setVisible(false);
		panelD2_3.setVisible(false);
		panelD2_4.setVisible(false);
		panelD2_5.setVisible(false);
		panelD2_6.setVisible(false);
		panelD2_7.setVisible(false);
		panelD2_8.setVisible(false);
		panelD2_9.setVisible(false);
		panelD2_10.setVisible(false);
		panelD2_11.setVisible(false);
		panelD2_12.setVisible(false);
		panelD2_13.setVisible(false);
		panelD2_14.setVisible(false);
		panelD2_15.setVisible(false);
		panelD2_16.setVisible(false);
		panelD2_17.setVisible(false);
		panelD2_18.setVisible(false);
		panelD2_19.setVisible(false);
		panelD2_20.setVisible(false);
		panelD2_21.setVisible(false);
		panelD2_22.setVisible(false);
		panelD2_23.setVisible(false);
		panelD2_24.setVisible(false);
		panelD2_25.setVisible(false);
		panelD2_26.setVisible(false);
		panelD2_27.setVisible(false);
		panelD2_28.setVisible(false);
		panelD2_29.setVisible(false);
		panelD2_30.setVisible(false);
		panelD2_31.setVisible(false);
		panelD2_32.setVisible(false);
	}
	
	static void D2true() {
		panelD2.setVisible(true);
		panelD2_1.setVisible(true);
		panelD2_2.setVisible(true);
		panelD2_3.setVisible(true);
		panelD2_4.setVisible(true);
		panelD2_5.setVisible(true);
		panelD2_6.setVisible(true);
		panelD2_7.setVisible(true);
		panelD2_8.setVisible(true);
		panelD2_9.setVisible(true);
		panelD2_10.setVisible(true);
		panelD2_11.setVisible(true);
		panelD2_12.setVisible(true);
		panelD2_13.setVisible(true);
		panelD2_14.setVisible(true);
		panelD2_15.setVisible(true);
		panelD2_16.setVisible(true);
		panelD2_17.setVisible(true);
		panelD2_18.setVisible(true);
		panelD2_19.setVisible(true);
		panelD2_20.setVisible(true);
		panelD2_21.setVisible(true);
		panelD2_22.setVisible(true);
		panelD2_23.setVisible(true);
		panelD2_24.setVisible(true);
		panelD2_25.setVisible(true);
		panelD2_26.setVisible(true);
		panelD2_27.setVisible(true);
		panelD2_28.setVisible(true);
		panelD2_29.setVisible(true);
		panelD2_30.setVisible(true);
		panelD2_31.setVisible(true);
		panelD2_32.setVisible(true);
	}
}


