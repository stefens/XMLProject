package main.java.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Manager.DBParseXpath;

public class MainWindow extends JFrame {
	

	private JButton bt_majBDD;
	private JButton bt_reqXpath;
	private JButton bt_convertFile;
	private JButton bt_genSchema;
	private JButton bt_xmltotext;
	
	public MainWindow(){
		super();
		
		build();
	}

	private void build() {
		setTitle("Gestionnaire XML");
		setSize(400,250);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPanel());
	}
	public JPanel mainPanel(){
		JPanel mainPan = new JPanel();
		mainPan.setLayout(new FlowLayout());
		mainPan.setBackground(Color.white);
		//////// TESTS 
		JPanel bddPan = new JPanel();
		bddPan.setLayout(new FlowLayout());
		bddPan.setBackground(Color.white);
		
		JPanel xpathPan = new JPanel();
		xpathPan.setLayout(new FlowLayout());
		xpathPan.setBackground(Color.white);
		
		JPanel convertPan = new JPanel();
		convertPan.setLayout(new FlowLayout());
		convertPan.setBackground(Color.white);
		
		JPanel schemaPan = new JPanel();
		schemaPan.setLayout(new FlowLayout());
		schemaPan.setBackground(Color.white);
		
		JPanel xmlToTextPan = new JPanel();
		xmlToTextPan.setLayout(new FlowLayout());
		xmlToTextPan.setBackground(Color.white);
		
		bt_majBDD = new JButton("Action base de données");
		bddPan.add(bt_majBDD);
		bt_reqXpath = new JButton(new DBParseXpathGUI("Opérer requête XPATH"));
		xpathPan.add(bt_reqXpath);
		bt_convertFile = new JButton("Convertion BDD-> XML");
		convertPan.add(bt_convertFile);
		bt_genSchema = new JButton("Générer schéma BDD");
		schemaPan.add(bt_genSchema);
		bt_xmltotext = new JButton("Convertion XML -> Texte");
		xmlToTextPan.add(bt_xmltotext);
		
		mainPan.add(bddPan);
		mainPan.add(xpathPan);
		mainPan.add(convertPan);
		mainPan.add(schemaPan);
		mainPan.add(xmlToTextPan);
		return mainPan;
	}
}
