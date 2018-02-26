package rndm.views;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.basic.BasicArrowButton;

public class View{

	private JFrame frame;
	private Menu menu;
	private Help help;
	private New new_;
	
	public View() {
		
		frame = new JFrame("rndm");
		frame.getContentPane().setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(452,500);
		frame.setVisible(true);
		
		menu = new Menu();
		frame.add(menu.getPanel());
		help = new Help();
		frame.add(help.getPanel());
		new_ = new New();
		frame.add(new_.getPanel());
		
		initialize();
	}
	
	private void initialize() {
		
		menu.setVisible(true);
        help.setVisible(false);
        new_.setVisible(false);
        
        //frame.pack();
	}
	
	//Visibility methods
	public void setMenuInvisible() {
		menu.setVisible(false);
		return;
	}
	
	public void setMenuVisible() {
		menu.setVisible(true);
		return;
	}
	
	public void setHelpInvisible() {
		help.setVisible(false);
		return;
	}
	
	public void setHelpVisible() {
		help.setVisible(true);
		return;
	}
	
	public void setNewInvisible() {
		new_.setVisible(false);
		return;
	}
	
	public void setNewVisible() {
		new_.setVisible(true);
		return;
	}
	
	//Menu
	public JButton getExitButton(){
		return menu.getExitButton();
	}
	
	public JButton getHelpButton(){
		return menu.getHelpButton();
	}
	
	public JButton getNewButton(){
		return menu.getNewButton();
	}
	
	//Help
	public BasicArrowButton getBackArrowHelp() {
		return help.getBackArrow();
	}

	//New
	public BasicArrowButton getBackArrowNew() {
		return new_.getBackArrow();
	}
	
	public int getItemCount(){
		return new_.getItemCount();
	}
	
	public void setItemCount(int newCount){
		new_.setItemCount(newCount);
	}
	
	public JTextField getItemField(){
		return new_.getItemField();
	}

}
