package com.Counter.Files;
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
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
import javax.swing.UIManager;

public class MainWindow extends JFrame {

	
	private JPanel contentPane;
	private JTextField textFieldDiet;
	private JTextField textFieldNoFap;
	private JTextField textFieldCoding;
	private JTextField textFieldGym;
	private static String counterName; 
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWindow frame = new MainWindow();
//					frame.setVisible(true);
//					frame.setResizable(false);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Days Counter");
		setBounds(800, 100, 332, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/plus.png"));
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/minus.png"));
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/searching.png")); 
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/user.png")); 
		ImageIcon icon5 = new ImageIcon(this.getClass().getResource("/save.png")); 
		ImageIcon icon6 = new ImageIcon(this.getClass().getResource("/cross-button.png")); 
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(153, 0, 204), 2));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(8, 10, 300, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Days Counter ");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 24, 162, 28);
		lblNewLabel.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		panel.add(lblNewLabel);
		
		textFieldDiet = new JTextField();
		textFieldDiet.setEditable(false);
		textFieldDiet.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textFieldDiet.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDiet.setBounds(8, 103, 114, 19);
		panel.add(textFieldDiet);
		textFieldDiet.setColumns(10);
		
		textFieldNoFap = new JTextField();
		textFieldNoFap.setEditable(false);
		textFieldNoFap.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textFieldNoFap.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNoFap.setColumns(10);
		textFieldNoFap.setBounds(95, 225, 114, 19);
		panel.add(textFieldNoFap);
		
		textFieldCoding = new JTextField();
		textFieldCoding.setEditable(false);
		textFieldCoding.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textFieldCoding.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCoding.setColumns(10);
		textFieldCoding.setBounds(95, 343, 114, 19);
		panel.add(textFieldCoding);
		
		
		
		JButton addDiet = new JButton(icon1);
		addDiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num = Integer.parseInt(textFieldDiet.getText());
				num++;
				textFieldDiet.setText(Integer.toString(num));
				
				if(num==100)
				{
					try {
					    File wavFile = new File("images\\believer.wav");
					    Clip clip = AudioSystem.getClip();
					    clip.open(AudioSystem.getAudioInputStream(wavFile));
					    clip.start();
					   
					} catch (Exception e1) {
					    System.out.println(e1);
					}
				}
				
			}
		});
		addDiet.setBackground(new Color(255, 255, 255));
		addDiet.setBounds(8, 131, 53, 21);
		panel.add(addDiet);
		
		
		JButton deleteDiet = new JButton(icon2);
		deleteDiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldDiet.getText());
				if(num>0)
				{
					num--;
					textFieldDiet.setText(Integer.toString(num));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Days cannot be less than zero!");
				}
			}
		});
		deleteDiet.setBackground(new Color(255, 255, 255));
		deleteDiet.setBounds(69, 131, 53, 21);
		panel.add(deleteDiet);
		
		JButton addNoPMO = new JButton(icon1);
		addNoPMO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldNoFap.getText());
				num++;
				textFieldNoFap.setText(Integer.toString(num));
				if(num==100)
				{
					try {
					    File wavFile = new File("images\\believer.wav");
					    Clip clip = AudioSystem.getClip();
					    clip.open(AudioSystem.getAudioInputStream(wavFile));
					    clip.start();
					   
					} catch (Exception e1) {
					    System.out.println(e1);
					}
				}
			}
		});
		addNoPMO.setBackground(new Color(255, 255, 255));
		addNoPMO.setBounds(95, 254, 53, 21);
		panel.add(addNoPMO);
		
		JButton deleteNoPMO = new JButton(icon2);
		deleteNoPMO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldNoFap.getText());
				if(num>0)
				{
					num--;
					textFieldNoFap.setText(Integer.toString(num));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Days cannot be less than zero!");
				}
			}
		});
		deleteNoPMO.setBackground(new Color(255, 255, 255));
		deleteNoPMO.setBounds(156, 254, 53, 21);
		panel.add(deleteNoPMO);
		
		JButton addCoding = new JButton(icon1);
		addCoding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldCoding.getText());
				num++;
				textFieldCoding.setText(Integer.toString(num));
				if(num==100)
				{
					try {
					    File wavFile = new File("images\\believer.wav");
					    Clip clip = AudioSystem.getClip();
					    clip.open(AudioSystem.getAudioInputStream(wavFile));
					    clip.start();
					   
					} catch (Exception e1) {
					    System.out.println(e1);
					}
				}
			}
		});
		addCoding.setBackground(new Color(255, 255, 255));
		addCoding.setBounds(95, 372, 53, 21);
		panel.add(addCoding);
		
		JButton deleteCoding = new JButton(icon2);
		deleteCoding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldCoding.getText());
				if(num>0)
				{
					num--;
					textFieldCoding.setText(Integer.toString(num));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Days cannot be less than zero!");
				}
			}
		});
		deleteCoding.setBackground(new Color(255, 255, 255));
		deleteCoding.setBounds(156, 372, 53, 21);
		panel.add(deleteCoding);
		
		JLabel lblNewLabel_1 = new JLabel("Diet");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		//lblNewLabel_1.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		lblNewLabel_1.setBounds(50, 72, 43, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NoPMO");
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
		textFieldGym.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textFieldGym.setEditable(false);
		textFieldGym.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGym.setColumns(10);
		textFieldGym.setBounds(178, 103, 114, 19);
		panel.add(textFieldGym);
		
		JButton addGym = new JButton(icon1);
		addGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldGym.getText());
				num++;
				textFieldGym.setText(Integer.toString(num));
				if(num==100)
				{
					try {
					    File wavFile = new File("images\\believer.wav");
					    Clip clip = AudioSystem.getClip();
					    clip.open(AudioSystem.getAudioInputStream(wavFile));
					    clip.start();
					   
					} catch (Exception e1) {
					    System.out.println(e1);
					}
				}
			}
		});
		addGym.setBackground(new Color(255, 255, 255));
		addGym.setBounds(178, 131, 53, 21);
		panel.add(addGym);
		
		JButton deleteGym = new JButton(icon2);
		deleteGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textFieldGym.getText());
				if(num>0)
				{
					num--;
					textFieldGym.setText(Integer.toString(num));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Days cannot be less than zero!");
				}
			}
		});
		deleteGym.setBackground(new Color(255, 255, 255));
		deleteGym.setBounds(239, 131, 53, 21);
		panel.add(deleteGym);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gym");
		lblNewLabel_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		//lblNewLabel_1_3.setBorder(new LineBorder(new Color(204, 0, 204), 2));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(205, 72, 43, 21);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton_2_1_1 = new JButton(icon3);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counterName = JOptionPane.showInputDialog("Enter counter name: ");
				String path = "src\\counters\\"+counterName+".ser";
				File file = new File(path);
				
				if(file.exists())
				{
						
					MainCounter counter = deserializeCounter(file);
					textFieldDiet.setText(""+counter.getDiet());
					textFieldNoFap.setText(""+counter.getNoPMO());
					textFieldGym.setText(""+counter.getGym());
					textFieldCoding.setText(""+counter.getCoding());
							
						
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
				String name = JOptionPane.showInputDialog("Enter counter name: ");
				MainCounter counter = new MainCounter(name);
				serialize(counter);
			}
		});
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1.setBounds(8, 24, 53, 28);
		panel.add(btnNewButton_2_1_1_1);
		
		JButton saveProgress = new JButton(icon5);
		saveProgress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String path = "src\\counters\\"+counterName+".ser";
				File file = new File(path);
				MainCounter counter = deserializeCounter(file);
				
				counter.setDiet(Integer.parseInt(textFieldDiet.getText()));
				counter.setGym(Integer.parseInt(textFieldGym.getText()));
				counter.setNoPMO(Integer.parseInt(textFieldNoFap.getText()));
				counter.setCoding(Integer.parseInt(textFieldCoding.getText()));
				
				serialize(counter);
				JOptionPane.showMessageDialog(null, "Counter saved!");
			}
		});
		saveProgress.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		saveProgress.setBackground(Color.WHITE);
		saveProgress.setBounds(62, 409, 86, 28);
		panel.add(saveProgress);
		
		JButton reset = new JButton(icon6);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldDiet.setText("0");
			textFieldGym.setText("0");
			textFieldCoding.setText("0");
			textFieldNoFap.setText("0");
			
			}
		});
		reset.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		reset.setBackground(Color.WHITE);
		reset.setBounds(156, 409, 86, 28);
		panel.add(reset);
		
		
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
