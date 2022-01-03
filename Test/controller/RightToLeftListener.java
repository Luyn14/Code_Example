package ch.iso.m226b.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import ch.iso.m226b.util.ReferenceFinder;
import ch.iso.m226b.view.MyFrame;

public class RightToLeftListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		Component item = (Component) e.getSource();
		MyFrame frame = (MyFrame) ReferenceFinder.findFrame(item);

		// long
		JList<String> listRight = frame.getMyJListRight();
		DefaultListModel<String> modelRight = (DefaultListModel<String>) listRight.getModel();

		// long
		JList<String> listLeft = frame.getMyJListLeft();
		DefaultListModel<String> modelLeft = (DefaultListModel<String>) listLeft.getModel();
		
		// multi select mit ctrl + und maus auswählen, damit man mehrere übertragen kann auf andere Seite
		int[] a = listRight.getSelectedIndices();

		if (a.length > 0) {

			for (int i = (a.length - 1); i >= 0; i--) {
				String v = modelRight.getElementAt(i);
				modelRight.remove(i);
				modelLeft.addElement(v);

			}

		}
	}
}
