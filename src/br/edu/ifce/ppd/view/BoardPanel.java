package br.edu.ifce.ppd.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.ifce.ppd.util.BoardLocation;
import br.edu.ifce.ppd.util.Constants;
import br.edu.ifce.ppd.util.SquareBoardSize;

public class BoardPanel extends JPanel{

	final int i = SquareBoardSize.DIMENSION;
	private BoardLocation[][] board = new BoardLocation[i][i];	
	private JLabel spyBlue,
				   scoutBlue,
				   minerBlue,
				   sergeantBlue,
				   lieutenantBlue,
				   captainBlue,
				   majorBlue,
				   colonelBlue,
				   marshalBlue,
			       bombBlue,
				   flagBlue;
	
	private JLabel  spyRed,
					scoutRed,
					minerRed,
					sergeantRed,
					lieutenantRed,
					captainRed,
					majorRed,
					colonelRed,
					marshalRed,
					bombRed,
					flagRed;
	public JLabel mainPanel;
	
	public BoardPanel(){
		ImageIcon backgroundImage = new ImageIcon(Constants.URL_IMAGES+"classicmap.jpeg");
		mainPanel = new JLabel(backgroundImage){
			@Override
			public Dimension getPreferredSize() {
	            Dimension size = super.getPreferredSize();
	            Dimension lmPrefSize = getLayout().preferredLayoutSize(this);
	            size.width = Math.max(size.width, lmPrefSize.width);
	            size.height = Math.max(size.height, lmPrefSize.height);
	            return size;
			}
		};
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTHWEST;
		mainPanel.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
		mainPanel.setOpaque(false);
		initBoardPanel(gc);
		
		//initBluePieces();
		//initRedPieces();
		
	}

	public BoardLocation getBoardLocation(int row, int column) {
		return board[row][column];
	}

	public void setBoardLocation(int row, int column, BoardLocation boardLocation) {
		board[row][column] = boardLocation;
		
	}
	
	private void initBoardPanel(GridBagConstraints gbc){
		
		for (int i = 0; i< 10; i++){
			if(i == 4 || i == 5){
				for(int j = 0, count = 0; j < 10 && count<40; j++){
					mainPanel.add(new JLabel( new ImageIcon("C:\\sandbox\\FrontGame\\rsc\\empty.png")),gbc);	
					gbc.gridx++;
				}
				gbc.gridy++;
				gbc.gridx=0;
			}
			else{
				for(int j = 0, count = 0; j < 10 && count<40; j++){
					mainPanel.add(new JLabel( new ImageIcon("C:\\sandbox\\FrontGame\\rsc\\empty.png")),gbc);	
					gbc.gridx++;
				}
				gbc.gridy++;
				gbc.gridx=0;
			}
		}
		this.add(mainPanel);
		
	}
		
}
