package br.edu.ifce.ppd.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StatusPanel extends JPanel{

	JTextArea yourStatus;
	JTextArea adversaryStatus;
	
	public StatusPanel(){
		initStatusPanel();
	}
	
	private void initStatusPanel(){
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		JLabel yourStatusLabel = new JLabel("Seu status",JLabel.LEFT);
		yourStatusLabel.setHorizontalTextPosition(JLabel.LEFT);
		yourStatusLabel.setVerticalAlignment(JLabel.TOP);
		yourStatus = new JTextArea(12,12);
		yourStatus.setEditable(false);
		yourStatus.setLineWrap(true);
		yourStatus.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
		
		JLabel adversaryStatusLabel = new JLabel("Status do adversário");
		adversaryStatusLabel.setHorizontalAlignment(JLabel.LEFT);
		adversaryStatusLabel.setVerticalAlignment(JLabel.TOP);
		adversaryStatus = new JTextArea(12,12);
		adversaryStatus.setEditable(false);
		adversaryStatus.setLineWrap(true);
		adversaryStatus.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
		
		this.add(yourStatusLabel);
		this.add(yourStatus);
		this.add(adversaryStatusLabel);
		this.add(adversaryStatus);
		
	}
	
	private void countOfPiecesByPlayer(){
		//TODO: Count of quantity of pieces
	}
	
}
