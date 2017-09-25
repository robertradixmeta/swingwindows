
import java.awt.Color;

public class ThreadClass implements Runnable 
{

	public ThreadClass ( Color c)
	{
		myColor = c;
	}
	
	public void run() 
	{
		// 
		BlankFrame frame = new BlankFrame(myColor);
		frame.setVisible(true);
	}
	
	private Color myColor;

}
