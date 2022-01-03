package ch.iso.m226b.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import ch.iso.m226b.util.ReferenceFinder;

public class ExitListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Component item = (Component) e.getSource();
		JFrame frame = ReferenceFinder.findFrame(item);
		
		frame.setVisible(false);
		frame.dispose();
		
		System.exit(0);
	}

}
