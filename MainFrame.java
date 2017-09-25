
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


public class MainFrame extends JFrame
{

	public MainFrame()
	{
		setTitle("MainFrame");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		myButtonPanel = new JPanel();
		
		myWindowButton = new JButton("Open Window");
		myComboBox = new JComboBox();
		myComboBox.setEditable(false);
		myComboBox.addItem("Blue");
		myComboBox.addItem("Red");
		myComboBox.addItem("Green");
		
		myButtonPanel.add(myWindowButton);
		myButtonPanel.add(myComboBox);
		
		ActionListener newListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Color theColor = getColor();
				ThreadClass tClass = new ThreadClass(theColor);
				Thread t = new Thread(tClass);
				t.start();
			}
		};
		
		myWindowButton.addActionListener(newListener);
		
		getContentPane().add(myButtonPanel);
	}
	
	private Color getColor()
	{
		String theChoice = (String)myComboBox.getSelectedItem();
		Color tempColor;
		
		if( theChoice.equals("Red"))
		{
			System.out.println("Red was chosen");
			tempColor = Color.RED;
		}
		else if ( theChoice.equals("Blue"))
		{
			System.out.println("Blue was chosen");
			tempColor = Color.BLUE;
		}
		else
		{
			System.out.println("Green was chosen");
			tempColor = Color.GREEN;
		}
		
		return tempColor;
	}
	
	
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 200;
	
	private JPanel myButtonPanel;
	private JButton myWindowButton;
	private JComboBox myComboBox;
	
}
