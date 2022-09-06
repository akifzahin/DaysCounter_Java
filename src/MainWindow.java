import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class MainWindow extends JFrame {

	
	private JPanel contentPane;
	private JTextField textFieldDiet;
	private JTextField textFieldNoFap;
	private JTextField textFieldCoding;
	private JTextField textFieldGym;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("100 Days Counter");
		setBounds(1500, 100, 332, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Icon icon1 = new ImageIcon("images\\plus.PNG");
		Icon icon2 = new ImageIcon("images\\minus.PNG");
		Icon icon3 = new ImageIcon("images\\searching.PNG");
		Icon icon4 = new ImageIcon("images\\user.PNG");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(8, 10, 300, 433);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("100 Days Counter");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 10, 162, 52);
		lblNewLabel.setBorder(new LineBorder(new Color(204, 0, 204), 3));
		panel.add(lblNewLabel);
		
		textFieldDiet = new JTextField();
		textFieldDiet.setBounds(8, 103, 114, 19);
		panel.add(textFieldDiet);
		textFieldDiet.setColumns(10);
		
		textFieldNoFap = new JTextField();
		textFieldNoFap.setColumns(10);
		textFieldNoFap.setBounds(95, 225, 114, 19);
		panel.add(textFieldNoFap);
		
		textFieldCoding = new JTextField();
		textFieldCoding.setColumns(10);
		textFieldCoding.setBounds(95, 343, 114, 19);
		panel.add(textFieldCoding);
		
		
		
		JButton btnNewButton = new JButton(icon1);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(8, 131, 53, 21);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton(icon2);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(69, 131, 53, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(icon1);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(95, 254, 53, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(icon2);
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(156, 254, 53, 21);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(icon1);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(95, 372, 53, 21);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton(icon2);
		btnNewButton_4_1.setBackground(new Color(255, 255, 255));
		btnNewButton_4_1.setBounds(156, 372, 53, 21);
		panel.add(btnNewButton_4_1);
		
		JLabel lblNewLabel_1 = new JLabel("Diet");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1.setBounds(50, 72, 43, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NoFap");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(110, 185, 86, 19);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Coding");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(95, 305, 114, 28);
		panel.add(lblNewLabel_1_2);
		
		textFieldGym = new JTextField();
		textFieldGym.setColumns(10);
		textFieldGym.setBounds(166, 103, 114, 19);
		panel.add(textFieldGym);
		
		JButton btnNewButton_2_1 = new JButton(icon1);
		btnNewButton_2_1.setBackground(new Color(255, 255, 255));
		btnNewButton_2_1.setBounds(166, 131, 53, 21);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton(icon2);
		btnNewButton_2_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2_2.setBounds(227, 131, 53, 21);
		panel.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gym");
		lblNewLabel_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(205, 72, 43, 21);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton_2_1_1 = new JButton(icon3);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = JOptionPane.showInputDialog("Enter counter name: ");
				String path = "src\\counters\\"+inputName+".ser";
				File file = new File(path);
				
				if(file.exists())
				{
						
					MainCounter counter = deserializeCounter(file);
					textFieldDiet.setText(""+counter.getDiet());
					
					
							
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Counter not found!");
				}
			}
		});
		btnNewButton_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1.setBounds(239, 24, 53, 28);
		panel.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton(icon4);
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1.setBounds(8, 24, 53, 28);
		panel.add(btnNewButton_2_1_1_1);
		
		
	}

	public static void serialize(MainCounter counter)
	{
		String name = counter.getName();
		try
		{
			String path = "src\\counters\\"+name+".ser";
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objOutputStream.writeObject(counter);
			objOutputStream.close();
			fileOutputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();
		}
	}
	

	public static MainCounter deserializeCounter(File file)
	{	
		MainCounter counter = null;
		try
		{
			
			String path = "src\\counters\\"+file.getName();
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
			
			counter = (MainCounter) objInputStream.readObject();
			
			objInputStream.close();
			fileInputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();

		}
		catch(ClassNotFoundException E)
		{
			
			E.printStackTrace();

		}
		
		return counter;
		
	}
	



}
