package br.edu.ifce.ppd.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class ChatPanel extends JPanel implements ActionListener{
	
	JScrollPane historyMessageScrolledPane;
	JTextArea historyMessage;
	JPanel sendMessagePanel;
	JTextArea textBox;
	
	public ChatPanel(){
		this.configureChat();
	}

	private void configureChat(){
		historyMessage = new JTextArea(5,30);
		historyMessage.setEditable(false);
		historyMessage.setLineWrap(true);
		historyMessage.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
		
		historyMessageScrolledPane = new JScrollPane(historyMessage);
		historyMessageScrolledPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		textBox = new JTextArea(1, 25);
		textBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
		textBox.getDocument().putProperty("filterNewlines", true);
		textBox.setEditable(true);
		
		JButton send = new JButton("Send");
		send.addActionListener(this);
		
		sendMessagePanel = new JPanel();
		sendMessagePanel.setLayout(new FlowLayout());
		sendMessagePanel.add(textBox);
		sendMessagePanel.add(send);
	
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.add(historyMessageScrolledPane);
		this.add(sendMessagePanel);
		this.setVisible(true);
		this.setMaximumSize(new Dimension(20,20));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO: Implement action
		
	}
}
