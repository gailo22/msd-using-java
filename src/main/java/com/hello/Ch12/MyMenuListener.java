package com.hello.Ch12;

import java.awt.event.*;

public class MyMenuListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Cut")) {
			cutProcedure();
		} else if (command.equals("Copy")) {
			copyProcedure();
		} else if (command.equals("Paste")) {
			pasteProcedure();
		}
	}

	private void pasteProcedure() {
		// TODO Auto-generated method stub

	}

	private void copyProcedure() {
		// TODO Auto-generated method stub

	}

	private void cutProcedure() {
		// TODO Auto-generated method stub

	}

} // MyMenuListener
