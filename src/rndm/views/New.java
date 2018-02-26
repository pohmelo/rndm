package rndm.views;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.util.List;
import java.util.ArrayList;

public class New extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private BasicArrowButton backArrow;
	private JLabel header;
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel itemsLabel;
	private JPanel itemsPanel;
	private JTextField itemField;
	private JButton removeButton;
	private JButton saveButton;
	private JButton removeAllButton;
	private JButton rndmButton;
	private int itemCount = 1;
	List<Component> itemFields = new ArrayList<Component>();
	List<Component> removeButtons = new ArrayList<Component>();
	
	public New() {
		initialize();
	}
	
	private void initialize() {
		backArrow = new BasicArrowButton(BasicArrowButton.WEST);
		header = new JLabel("NEW");
		nameLabel = new JLabel("name");
		nameField = new JTextField(24);
		itemsLabel = new JLabel("items");
		itemsPanel = new JPanel();
		itemField = new JTextField(16);
		removeButton = new JButton("remove");
		saveButton = new JButton("Save");
		removeAllButton = new JButton("Remove all");
		rndmButton = new JButton("rndm");
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		header.setFont(new Font("Arial", Font.BOLD, 14));
		c.fill = GridBagConstraints.NONE;
		c.ipadx = 0;
		c.ipady = 0;
		c.weightx = 0.0;
		c.weighty = 0.0;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0,0,15,0);
		c.gridx = 0;
		c.gridy = 0;  
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(header, c);
		
		//backArrow.setMinimumSize(new Dimension(140, 140));
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx = 0;
		c.gridy = 0;  
		c.gridheight = 1;
		c.gridwidth = 1;
		this.add(backArrow, c);
		
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(0,0,4,0);
		c.gridx = 0;
		c.gridy = 2;
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(nameLabel, c);
		
		//nameField.setMinimumSize(new Dimension(50,22));
		c.insets = new Insets(0,0,8,0);
		c.gridx = 0;
		c.gridy = 3;
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(nameField, c);

		c.insets = new Insets(0,0,4,0);
		c.gridx = 0;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(itemsLabel, c);
		
		itemsPanel.setLayout(new GridBagLayout());
		GridBagConstraints c2 = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 5;
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(itemsPanel, c);
		
		c2.anchor = GridBagConstraints.LINE_START;
		c2.gridx = 0;
		c2.gridy = 0;
		c2.gridheight = 1;
		c2.gridwidth = 3;
		itemsPanel.add(itemField, c2);
		
		removeButton.setOpaque(false);
		removeButton.setContentAreaFilled(false);
		removeButton.setBorderPainted(false);
		c2.anchor = GridBagConstraints.LINE_END;
		c2.gridx = 4;
		c2.gridy = 0;
		c2.gridheight = 1;
		c2.gridwidth = 1;
		itemsPanel.add(removeButton, c2);
		c.insets = new Insets(20,0,10,0);
		saveButton.setSize(new Dimension(40, 40));
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx = 0;
		c.gridy = 6;
		c.gridheight = 1;
		c.gridwidth = 1;
		this.add(saveButton, c);
		
		removeAllButton.setSize(new Dimension(40, 40));
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 6;
		c.gridheight = 1;
		c.gridwidth = 5;
		this.add(removeAllButton, c);
		
		rndmButton.setSize(new Dimension(40, 40));
		c.anchor = GridBagConstraints.LINE_END;
		c.gridx = 4;
		c.gridy = 6;
		c.gridheight = 1;
		c.gridwidth = 1;
		this.add(rndmButton, c);		
	}
	
	public JPanel getPanel(){
        return this;
    }
	
	public BasicArrowButton getBackArrow(){
		return this.backArrow;
	}
	
	public int getItemCount(){
		return this.itemCount;
	}
	
	public void setItemCount(int newCount){
		this.itemCount = newCount;
	}
	
	public void newItemField(){
		this.itemFields.add(new JTextField(16));
		this.removeButtons.add(new JTextField(16));
	}
	
	public void removeItem(){
		
	}
	
	public JTextField getItemField(){
		return this.itemField;
	}

}
