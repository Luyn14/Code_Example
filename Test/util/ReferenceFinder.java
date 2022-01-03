package ch.iso.m226b.util;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;

public class ReferenceFinder {

	public static JFrame findFrame(Component c) {
        
		//System.out.println(c.getClass().getName());
		
		if (c instanceof JFrame) {
            return (JFrame) c;
		} else if (c instanceof JPopupMenu) {
	            JPopupMenu pop = (JPopupMenu) c;
	            return findFrame(pop.getInvoker());
        } else {
            Container parent = c.getParent();
            
            // ternärer Operator
            return parent == null ? null : findFrame(parent);
            
            //if (parent == null) {
            //	return null;
            //} else {
            //	return findFrame(parent);
            //}
            
        }
    }
	
}
