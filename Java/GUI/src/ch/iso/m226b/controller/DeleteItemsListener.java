package ch.iso.m226b.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import ch.iso.m226b.util.ReferenceFinder;
import ch.iso.m226b.view.MyFrame;

public class DeleteItemsListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// refferencen hollen
		Component item = (Component) e.getSource();
		MyFrame frame = (MyFrame) ReferenceFinder.findFrame(item);
		
		// long 
		JList <String> list = frame.getMyJListLeft();
		DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
		model.clear();
		
		// short 
		((DefaultListModel<String>) frame.getMyJListRight().getModel()).clear();
		
		
	}

}
