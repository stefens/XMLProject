package main.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Manager.DBParseXpath;

public class DBParseXpathCreation extends JFrame {
	
	private JLabel label;
	private JTextField req;
	private JButton submit;
	private JLabel result;

	public DBParseXpathCreation() {
		super();
		build();
	}

	private void build() {
		setTitle("Saisie XPATH");
		setSize(400,250);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(saisieReqXpath());
	}
	public JPanel saisieReqXpath(){
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout());
		pan.setBackground(Color.white);

		label = new JLabel("Saisir Requete XPath");
		pan.add(label);
		
		req = new JTextField();
		req.setColumns(10);
		pan.add(req);
		submit = new JButton(new DBParseXpath("Chercher",getreq(),getResult()));
		pan.add(submit);
		
		return pan;
		
	}
	
	public JTextField getreq(){
		return req;
	}
	
	public JLabel getResult(){
		return result;
	}
	
}
