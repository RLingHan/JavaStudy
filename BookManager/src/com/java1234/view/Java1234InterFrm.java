package com.java1234.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Java1234InterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java1234InterFrm frame = new Java1234InterFrm();
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
	public Java1234InterFrm() {
		getContentPane().setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("                          长沙理工大学后端作业");
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		setIconifiable(true);
		setClosable(true);
		setTitle("关于Java学习");
		setBounds(100, 100, 450, 300);

	}

}
