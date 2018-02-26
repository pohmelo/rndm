package rndm.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;

import rndm.models.*;
import rndm.views.*;

public class Controller {
	
	private Model model;
	private View view;
	private ActionListener aLExit;
	private ActionListener aLHelp;
	private ActionListener aLNew;
	private ActionListener aLBackHelp;
	private ActionListener aLBackNew;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;	    
	}
	
	public void control(){
		//Menu
		aLExit = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
            	  System.exit(0);         	  
              }
        };                
        view.getExitButton().addActionListener(aLExit);
        
        aLHelp = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {                  
            	view.setMenuInvisible();
            	view.setHelpVisible();
            }
        };                
        view.getHelpButton().addActionListener(aLHelp);
        
        aLNew = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {                  
            	view.setMenuInvisible();
            	view.setNewVisible();
            }
        };                
        view.getNewButton().addActionListener(aLNew);
        
        //Help
        aLBackHelp = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) { 
            	view.setHelpInvisible();
            	view.setMenuVisible();
            }
        };                
        view.getBackArrowHelp().addActionListener(aLBackHelp);
        
        //New
        aLBackNew = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) { 
            	view.setNewInvisible();
            	view.setMenuVisible();
            }
        };                
        view.getBackArrowNew().addActionListener(aLBackNew);
        
        
      
    }

}
