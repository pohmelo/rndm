package rndm;

import javax.swing.*;

import rndm.models.*;
import rndm.views.*;
import rndm.controllers.*;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Model model = new Model();
				View view = new View();
				Controller controller = new Controller(model, view);
				controller.control();
			}
		});
	}
}
