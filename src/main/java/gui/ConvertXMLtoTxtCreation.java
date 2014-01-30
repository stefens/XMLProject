package main.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import main.java.Manager.ConvertDBtoXML;
import main.java.Manager.ConvertXMLToText;

public class ConvertXMLtoTxtCreation extends JFrame {

	private JLabel label;
	private JFileChooser fileChooser;
	private JButton bt_file;

	public ConvertXMLtoTxtCreation() {
		super();
		build();
	}

	private void build() {
		setTitle("Convertion d'un XML en fichier texte");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(convertXMLtoTxt());
	}

	public JPanel convertXMLtoTxt() {
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout());
		pan.setBackground(Color.white);

		fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"XML file only", "xml");
		fileChooser.setFileFilter(filter);
		bt_file = new JButton(new ConvertXMLToText("Choisir Fichier à Convertir",getFileChooser()));
		pan.add(bt_file);
		return pan;

	}
	public JFileChooser getFileChooser(){
		return fileChooser;
	}


}
