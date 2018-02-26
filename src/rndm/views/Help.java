package rndm.views;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.basic.BasicArrowButton;

public class Help extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private BasicArrowButton backArrow;
	private JLabel header;
	private JLabel helpLabel;
	
	
	public Help() {
		initialize();
	}
	
	private void initialize() {
		backArrow = new BasicArrowButton(BasicArrowButton.WEST);
		header = new JLabel("HELP");
		helpLabel = new JLabel("<html>Tähän<br>tulee<br>helppi!</html>");
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		header.setFont(new Font("Arial", Font.BOLD, 14));
		c.fill = GridBagConstraints.NONE;
		c.ipadx = 0;
		c.ipady = 0;
		c.weightx = 0.0;
		c.weighty = 0.0;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0,0,14,0);
		c.gridx = 2;
		c.gridy = 0;  
		c.gridheight = 1;
		c.gridwidth = 3;
		this.add(header, c);
		
		//backArrow.setPreferredSize(new Dimension(140, 30));
		c.gridx = 0;
		c.gridy = 0;  
		c.gridheight = 1;
		c.gridwidth = 1;
		this.add(backArrow, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridheight = 5;
		c.gridwidth = 5;
		this.add(helpLabel, c);
		 
	}
	
	public JPanel getPanel(){
        return this;
    }
	
	public BasicArrowButton getBackArrow(){
		return backArrow;
	}

}
