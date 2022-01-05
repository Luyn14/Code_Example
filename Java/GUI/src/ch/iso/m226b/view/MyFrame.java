package ch.iso.m226b.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import ch.iso.m226b.controller.AddLeftListener;
import ch.iso.m226b.controller.AddRightListener;
import ch.iso.m226b.controller.LeftToRightListener;
import ch.iso.m226b.controller.ListLoaderLeft;
import ch.iso.m226b.controller.ListLoaderRight;
import ch.iso.m226b.controller.RightToLeftListener;
import ch.iso.m226b.resource.FrameConstants;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private MyMenu myMenuBar;
	
	private JList<String> myJListLeft;
	private JList<String> myJListRight;

	public MyFrame() {
		super(FrameConstants.FRAME_TITLE);

		this.myMenuBar = new MyMenu();
		this.setJMenuBar(this.myMenuBar);

		this.add(createContent());
	}
	
	// erstellen von kontent 
	private Component createContent() {
		final JPanel content = new JPanel(new GridLayout(1, 3, 5, 5));
		content.setBackground(new Color(255, 255, 255));

		content.add(createContentLeft());
		content.add(createContentMiddle());
		content.add(createContentRight());

		return content;
	}

	// Linker komponent
	private Component createContentLeft() {

		final JPanel contentLeft = new JPanel(new BorderLayout(5, 5));
		contentLeft.setBackground(new Color(255, 255, 255));

		final JList<String> listLeft = new JList<String>(new DefaultListModel<String>());
		final DefaultListModel<String> listModelLeft = (DefaultListModel<String>) listLeft.getModel();

		Iterator<String> data = new ListLoaderLeft();
		while (data.hasNext()) {
			listModelLeft.addElement(data.next());
		}

		listLeft.setPreferredSize(new Dimension(200, 200));
		
		setMyJListLeft(listLeft);

		final JScrollPane contentLeftScroller = new JScrollPane(listLeft);
		contentLeftScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentLeftScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		final JButton bAddLeft = new JButton(FrameConstants.FRAME_BUTTON_NEW_LEFT);
		bAddLeft.addActionListener(new AddLeftListener());

		contentLeft.add(contentLeftScroller, BorderLayout.CENTER);
		contentLeft.add(bAddLeft, BorderLayout.SOUTH);

		return contentLeft;
	}

	// mittlerer komponent
	private Component createContentMiddle() {

		final JPanel contentMiddle = new JPanel(new BorderLayout(5, 5));
		contentMiddle.setBackground(new Color(255, 255, 255));
		final JPanel contentMiddleInner = new JPanel(new GridLayout(2, 1, 5, 5));
		contentMiddleInner.setBackground(new Color(255, 255, 255));

		// knopf zu links und zu rechts
		final JButton bLeftToRight = new JButton(FrameConstants.FRAME_BUTTON_TO_RIGHT);
		bLeftToRight.addActionListener(new LeftToRightListener());
		final JButton bRightToLeft = new JButton(FrameConstants.FRAME_BUTTON_TO_LEFT);
		bRightToLeft.addActionListener(new RightToLeftListener());

		contentMiddleInner.add(bLeftToRight);
		contentMiddleInner.add(bRightToLeft);

		contentMiddle.add(contentMiddleInner, BorderLayout.NORTH);

		return contentMiddle;
	}

	// rechter komponent
	private Component createContentRight() {

		final JPanel contentRight = new JPanel(new BorderLayout(5, 5));
		contentRight.setBackground(new Color(255, 255, 255));

		final JList<String> listRight = new JList<String>(new DefaultListModel<String>());
		final DefaultListModel<String> listModelRight = (DefaultListModel<String>) listRight.getModel();

		Iterator<String> data = new ListLoaderRight();
		while (data.hasNext()) {
			listModelRight.addElement(data.next());
		}

		listRight.setPreferredSize(new Dimension(200, 200));
		
		setMyJListRight(listRight);

		final JScrollPane contentRightScroller = new JScrollPane(listRight);
		contentRightScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentRightScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		final JButton bAddRight = new JButton(FrameConstants.FRAME_BUTTON_NEW_RIGHT);
		bAddRight.addActionListener(new AddRightListener());

		contentRight.add(contentRightScroller, BorderLayout.CENTER);
		contentRight.add(bAddRight, BorderLayout.SOUTH);

		return contentRight;
	}

	public JList<String> getMyJListLeft() {
		return myJListLeft;
	}

	public void setMyJListLeft(JList<String> myJListLeft) {
		this.myJListLeft = myJListLeft;
	}

	public JList<String> getMyJListRight() {
		return myJListRight;
	}

	public void setMyJListRight(JList<String> myJListRight) {
		this.myJListRight = myJListRight;
	}

}
