package ch.iso.m226b.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import ch.iso.m226b.util.ReferenceFinder;
import ch.iso.m226b.view.MyFrame;

public class LeftToRightListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Component item = (Component) e.getSource();
		MyFrame frame = (MyFrame) ReferenceFinder.findFrame(item);
		
		// long 
		JList <String> listLeft = frame.getMyJListLeft();
		DefaultListModel<String> modelLeft = (DefaultListModel<String>) listLeft.getModel();
		
		
		// long 
		JList <String> listRight = frame.getMyJListRight();
		DefaultListModel<String> modelRight = (DefaultListModel<String>) listRight.getModel();
		
		int i = listLeft.getSelectedIndex();
		if(i > -1) {
			String v = modelLeft.getElementAt(i);
			modelLeft.remove(i);
			modelRight.addElement(v);
		}
				

	}

}
