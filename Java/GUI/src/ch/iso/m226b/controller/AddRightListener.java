package ch.iso.m226b.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import ch.iso.m226b.resource.FrameConstants;
import ch.iso.m226b.util.ReferenceFinder;
import ch.iso.m226b.view.MyFrame;

public class AddRightListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Component item = (Component) e.getSource();
		MyFrame frame = (MyFrame) ReferenceFinder.findFrame(item);
		
		JList<String> listRight = frame.getMyJListRight();
		DefaultListModel<String> modelRight = (DefaultListModel<String>) listRight.getModel();
		
		String value = JOptionPane.showInputDialog(frame,
				FrameConstants.FRAME_NEW_MESSAGE,
				FrameConstants.FRAME_NEW_TITLE,
				JOptionPane.PLAIN_MESSAGE);
		
		if ((value != null) && (!value.isEmpty())) modelRight.addElement(value);
		

	}

}
