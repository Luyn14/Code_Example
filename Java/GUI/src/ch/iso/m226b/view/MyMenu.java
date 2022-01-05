package ch.iso.m226b.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ch.iso.m226b.controller.DeleteItemsListener;
import ch.iso.m226b.controller.ExitListener;
import ch.iso.m226b.resource.MenuConstants;

public class MyMenu extends JMenuBar {

	private static final long serialVersionUID = 2L;

	public MyMenu() {

		createToolsMenu();
	}

	private void createToolsMenu() {

		final JMenu menuTools = new JMenu(MenuConstants.MENU_TOOLS);
		final JMenuItem itemDel = new JMenuItem(MenuConstants.MENU_TOOLS_DEL);
		final JMenuItem itemExit = new JMenuItem(MenuConstants.MENU_TOOLS_EXIT);
		
		itemExit.addActionListener(new ExitListener());
		itemDel.addActionListener(new DeleteItemsListener());

		menuTools.add(itemDel);
		menuTools.add(itemExit);
		this.add(menuTools);

	}
}
