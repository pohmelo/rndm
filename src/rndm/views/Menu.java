package rndm.views;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel header;
	private JButton newButton;
	private JButton loadButton;
	private JButton editButton;
	private JButton exitButton;
	private JButton helpButton;
	//private JPanel panel;
	
	public Menu() {
		initialize();
	}
	
	private void initialize() {
		header = new JLabel("rndm");
		newButton = new JButton("NEW");
		loadButton = new JButton("LOAD");
		editButton = new JButton("EDIT");
		exitButton = new JButton("Exit");
		helpButton = new JButton("Help");
		
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
		c.gridx = 0;
		c.gridy = 0;  
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(header, c);
		
		newButton.setPreferredSize(new Dimension(140, 30));
		c.insets = new Insets(0,0,4,0);
		c.gridx = 0;
		c.gridy = 2;  
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(newButton, c);
		
		loadButton.setPreferredSize(new Dimension(140, 30));
		c.gridx = 0;
		c.gridy = 3;  
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(loadButton, c);
		
		editButton.setPreferredSize(new Dimension(140, 30));
		c.gridx = 0;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(editButton, c);
		
		exitButton.setPreferredSize(new Dimension(60, 20));
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(20,0,10,4);
		c.gridx = 0;
		c.gridy = 6;  
		c.gridheight = 1;
		c.gridwidth = 2;
		this.add(exitButton, c);
		
		helpButton.setPreferredSize(new Dimension(60, 20));
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(20,4,10,0);
		c.gridx = 3;
		c.gridy = 6;  
		c.gridheight = 1;
		c.gridwidth = 2;
		this.add(helpButton, c);
		 
	}
	
	public JPanel getPanel(){
        return this;
    }
	
	public JButton getExitButton(){
		return exitButton;
	}
	
	public JButton getHelpButton(){
		return helpButton;
	}
	
	public JButton getNewButton(){
		return newButton;
	}

}
