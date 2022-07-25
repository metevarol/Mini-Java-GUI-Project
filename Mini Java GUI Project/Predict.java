package com.java.myapp;

import java.awt.*;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

@SuppressWarnings("unchecked")
public class Predict extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Predict frame = new Predict();
				frame.setVisible(true);
			}
		});
	}

	public Predict() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(null);
		setContentPane(new JLabel(new ImageIcon("background.png")));

		JLabel label = new JLabel("Predict Used Car Price");
		JLabel l1 = new JLabel("Name : ");
		JLabel l2 = new JLabel("Location : ");
		JLabel l3 = new JLabel("Year : ");
		JLabel l4 = new JLabel("Kilometers Driven : ");
		JLabel l5 = new JLabel("Fuel Type : ");
		JLabel l6 = new JLabel("Transmission : ");
		JLabel l7 = new JLabel("Owner Type : ");
		JLabel l8 = new JLabel("Mileage : ");
		JLabel l9 = new JLabel("Engine : ");
		JLabel l10 = new JLabel("Seats : ");

		label.setFont(new Font("Serif", Font.PLAIN, 20));

		Dimension size0 = label.getPreferredSize();
		Dimension size1 = l1.getPreferredSize();
		Dimension size2 = l2.getPreferredSize();
		Dimension size3 = l3.getPreferredSize();
		Dimension size4 = l4.getPreferredSize();
		Dimension size5 = l5.getPreferredSize();
		Dimension size6 = l6.getPreferredSize();
		Dimension size7 = l7.getPreferredSize();
		Dimension size8 = l8.getPreferredSize();
		Dimension size9 = l9.getPreferredSize();
		Dimension size10 = l10.getPreferredSize();
     
		
		String[] s1 = { "CNG", "Diesel", "Petrol", "Lpg", "Electric" };
		String[] s2 = { "Manuel", "Automatic"};
		String[] s3 = { "First", "Second", "Third", "Fourth & Above"};

		JTextField comboBox1 = new JTextField(10);
		JTextField comboBox2 = new JTextField(10);
		JTextField comboBox3 = new JTextField(10);
		JTextField comboBox4 = new JTextField(10);
		JComboBox comboBox5 = new JComboBox(s1);
		JComboBox comboBox6 = new JComboBox(s2);
		JComboBox comboBox7 = new JComboBox(s3);
		JTextField comboBox8 = new JTextField(10);
		JTextField comboBox9 = new JTextField(10);
		JTextField comboBox10 = new JTextField(10);

		
		comboBox1.setBounds(150, 56, 107, 20);

		
		comboBox2.setBounds(150, 90, 107, 20);

		
		comboBox3.setBounds(150, 124, 107, 20);

		
		comboBox4.setBounds(150, 158, 107, 20);

		comboBox5.setSelectedIndex(0);
		comboBox5.setBounds(150, 192, 107, 20);

		comboBox6.setSelectedIndex(0);
		comboBox6.setBounds(150, 226, 107, 20);

		comboBox7.setSelectedIndex(0);
		comboBox7.setBounds(150, 260, 107, 20);

	
		comboBox8.setBounds(150, 294, 107, 20);

	
		comboBox9.setBounds(150, 328, 107, 20);

	
		comboBox10.setBounds(150, 362, 107, 20);

		

		label.setBounds(20, 30, size0.width, size0.height);
		l1.setBounds(20, 56, size1.width, size1.height);
		l2.setBounds(20, 90, size2.width, size2.height);
		l3.setBounds(20, 124, size3.width, size3.height);
		l4.setBounds(20, 158, size4.width, size4.height);
		l5.setBounds(20, 192, size5.width, size5.height);
		l6.setBounds(20, 226, size6.width, size6.height);
		l7.setBounds(20, 260, size7.width, size7.height);
		l8.setBounds(20, 294, size8.width, size8.height);
		l9.setBounds(20, 328, size9.width, size9.height);
		l10.setBounds(20, 362, size10.width, size10.height);

		getContentPane().add(label);
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(l3);
		getContentPane().add(l4);
		getContentPane().add(l5);
		getContentPane().add(l6);
		getContentPane().add(l7);
		getContentPane().add(l8);
		getContentPane().add(l9);
		getContentPane().add(l10);
		getContentPane().add(comboBox1);
		getContentPane().add(comboBox2);
		getContentPane().add(comboBox3);
		getContentPane().add(comboBox4);
		getContentPane().add(comboBox5);
		getContentPane().add(comboBox6);
		getContentPane().add(comboBox7);
		getContentPane().add(comboBox8);
		getContentPane().add(comboBox9);
		getContentPane().add(comboBox10);

		JButton btn = new JButton("Predict");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Cost of your used car is : 0.0 ₺");
			}
		});
		
		btn.setBounds(126, 400, 81, 23);
		getContentPane().add(btn);	
		
	}
}