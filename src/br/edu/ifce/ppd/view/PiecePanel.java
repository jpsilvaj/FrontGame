package br.edu.ifce.ppd.view;

import java.awt.GridLayout;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.ifce.ppd.util.Constants;

public class PiecePanel extends JPanel{

	private JLabel spy,
				   scout,
				   miner,
				   sergeant,
				   lieutenant,
				   captain,
				   major,
				   colonel,
				   general,
				   marshall,
				   bomb,
				   flag;
	
	public PiecePanel(){
		initPiecePanel();
	}
	private void initPiecePanel(){

		this.setLayout(new GridLayout(3,4));
		ImageIcon spyIcon = new ImageIcon(getClass().getResource("/spy.png"));
		spy = new JLabel("Spy",spyIcon,JLabel.CENTER);
		spy.setVerticalTextPosition(JLabel.BOTTOM);
		spy.setHorizontalTextPosition(JLabel.CENTER);

		ImageIcon scoutIcon = new ImageIcon(getClass().getResource("/scout.png"));
		scout = new JLabel("Scout",scoutIcon,JLabel.CENTER);
		scout.setVerticalTextPosition(JLabel.BOTTOM);
		scout.setHorizontalTextPosition(JLabel.CENTER);
		
		ImageIcon minerIcon = new ImageIcon(getClass().getResource("/miner.png"));
		miner = new JLabel("Miner",minerIcon,JLabel.CENTER);
		miner.setVerticalTextPosition(JLabel.BOTTOM);
		miner.setHorizontalTextPosition(JLabel.CENTER);
		
		ImageIcon sergeantIcon = new ImageIcon(getClass().getResource("/sergeant.png"));
		sergeant = new JLabel("Sergeant",sergeantIcon,JLabel.CENTER);
		sergeant.setVerticalTextPosition(JLabel.BOTTOM);
		sergeant.setHorizontalTextPosition(JLabel.CENTER);
		
		ImageIcon lieutenantIcon = new ImageIcon(getClass().getResource("/lieutenant.png"));
		lieutenant = new JLabel("Lieutenant",lieutenantIcon,JLabel.CENTER);
		lieutenant.setVerticalTextPosition(JLabel.BOTTOM);
		lieutenant.setHorizontalTextPosition(JLabel.CENTER);
		
		ImageIcon captainIcon = new ImageIcon(getClass().getResource("/captain.png"));
		captain = new JLabel("Captain",captainIcon,JLabel.CENTER);
		captain.setVerticalTextPosition(JLabel.BOTTOM);
		captain.setHorizontalTextPosition(JLabel.CENTER);
		
		ImageIcon majorIcon = new ImageIcon(getClass().getResource("/major.png"));
		major = new JLabel("Major",majorIcon,JLabel.CENTER);
		major.setVerticalTextPosition(JLabel.BOTTOM);
		major.setHorizontalTextPosition(JLabel.CENTER);

		ImageIcon colonelIcon = new ImageIcon(getClass().getResource("/colonel.png"));
		colonel = new JLabel("Colonel",colonelIcon,JLabel.CENTER);
		colonel.setVerticalTextPosition(JLabel.BOTTOM);
		colonel.setHorizontalTextPosition(JLabel.CENTER);		
		
		ImageIcon generalIcon = new ImageIcon(getClass().getResource("/general.png"));
		general = new JLabel("General",generalIcon,JLabel.CENTER);
		general.setVerticalTextPosition(JLabel.BOTTOM);
		general.setHorizontalTextPosition(JLabel.CENTER);		
		
		ImageIcon marshallIcon = new ImageIcon(getClass().getResource("/marshall.png"));
		marshall = new JLabel("Marshall",marshallIcon,JLabel.CENTER);
		marshall.setVerticalTextPosition(JLabel.BOTTOM);
		marshall.setHorizontalTextPosition(JLabel.CENTER);		

		ImageIcon bombIcon = new ImageIcon(getClass().getResource("/bomb.png"));
		bomb = new JLabel("Bomb",bombIcon,JLabel.CENTER);
		bomb.setVerticalTextPosition(JLabel.BOTTOM);
		bomb.setHorizontalTextPosition(JLabel.CENTER);		
		
		ImageIcon flagIcon = new ImageIcon(getClass().getResource("/flag.png"));
		flag = new JLabel("Flag",flagIcon,JLabel.CENTER);
		flag.setVerticalTextPosition(JLabel.BOTTOM);
		flag.setHorizontalTextPosition(JLabel.CENTER);		
		
		this.add(spy);
		this.add(scout);
		this.add(miner);
		this.add(sergeant);
		this.add(lieutenant);
		this.add(captain);
		this.add(major);
		this.add(colonel);
		this.add(general);
		this.add(marshall);
		this.add(bomb);
		this.add(flag);
	}
	
}
