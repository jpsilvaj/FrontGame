package br.edu.ifce.ppd.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	JMenuBar menuBar;

	public MenuPanel(){
		configureMenuBar();
	}
	
	private void configureMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		ImageIcon exitIcon = new ImageIcon("exit.png");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem eMenuItem = new JMenuItem("Exit", exitIcon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		JMenu surrender = new JMenu("Surrender");
		ImageIcon surrenderIcon = new ImageIcon("surrender.png");
		file.setMnemonic(KeyEvent.VK_S);
		JMenuItem surrenderMenuItem = new JMenuItem("Surrender", exitIcon);
		surrenderMenuItem.setMnemonic(KeyEvent.VK_S);
		surrenderMenuItem.setToolTipText("Surrender");
		surrenderMenuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//TODO: Surrender action
			}
		});
		
		
		JMenu help = new JMenu("Help");
		file.setMnemonic(KeyEvent.VK_H);
		
		ImageIcon aboutIcon = new ImageIcon("about.png");
		JMenuItem aboutMenuItem = new JMenuItem("About", exitIcon);
		aboutMenuItem.setMnemonic(KeyEvent.VK_A);
		aboutMenuItem.setToolTipText("About application");
		aboutMenuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//TODO: Add text about application
			}
		});
		
		ImageIcon rulesIcon = new ImageIcon("rules.png");
		JMenuItem rulesMenuItem = new JMenuItem("Rules", exitIcon);
		rulesMenuItem.setMnemonic(KeyEvent.VK_R);
		rulesMenuItem.setToolTipText("Game Rules");
		rulesMenuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//TODO: Add action to show game rules
			}
		});
		
		file.add(eMenuItem);
		help.add(aboutMenuItem);
		help.add(rulesMenuItem);
		surrender.add(surrenderMenuItem);
		menuBar.add(file);
		menuBar.add(surrender);
		menuBar.add(help);
		
		this.add(menuBar);
		this.setVisible(true);
	}

}
