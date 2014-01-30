package main.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import main.java.Manager.ConvertDBtoXML;
import main.java.Manager.DBParseXpath;

public class ConvertDBtoXMLCreation extends JFrame {
	
	private JLabel label;
	private JFileChooser fileChooser;
	private JButton bt_file;

	public ConvertDBtoXMLCreation() {
		super();
		build();
	}


	private void build() {
		setTitle("Convertion d'une base en XML");
		setSize(700,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(convertDBtoXML());
	}
	public JPanel convertDBtoXML(){
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout());
		pan.setBackground(Color.white);
		
		fileChooser = new JFileChooser();
		 FileNameExtensionFilter filter = new FileNameExtensionFilter("XML file only","xml");
		 fileChooser.setFileFilter(filter);
		bt_file = new JButton(new ConvertDBtoXML("Choisir Fichier à Convertir",getFileChooser()));
		pan.add(bt_file);
		return pan;
		
	}
	
	public JFileChooser getFileChooser(){
		return fileChooser;
	}
	
}
