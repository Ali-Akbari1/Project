import java.awt.EventQueue;

import javax.swing.JFrame;

public class Puck {
	
	
static boolean standard;
static boolean youth;
static double weight;

public static boolean getWeight() 
{
	if (weight >= 5 && weight<= 5.5) 
	{
		standard = true;
		}
	if (weight >= 4 && weight<= 4.5) 
	{
		standard = false;
		}
	return standard;
	
	}

public static String getDivision()
{
	String div;
	if (standard)
	{
		div = "Puck is Standard";
	}
	else 
	{
		div = "Puck is Youth";
	}
	return div;
	}


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				getWeight();
				getDivision();
				try {
					Puck window = new Puck();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				

			}
		});
	}

	/**
	 * Create the application.
	 */
	public Puck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
