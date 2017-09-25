import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class BlankFrame extends JFrame 
{

	public BlankFrame(Color c)
	{
		counter++;
		setTitle("BlankFrame" + counter);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation(SPACING * counter, SPACING * counter);
		getContentPane().setBackground(c);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		
		ActionListener newListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("Exit selected.");
				dispose();
			}
		};
		exitItem.addActionListener(newListener);
		
	}
	
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 200;
	public static final int SPACING = 40;
	private static int counter = 0;
}
