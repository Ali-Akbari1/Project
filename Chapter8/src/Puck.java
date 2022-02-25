import java.awt.EventQueue;

import javax.swing.JFrame;

public class Puck extends Disk{
	
	
static boolean standard = true;
static boolean youth = true;
static int weight = 0;

static boolean getWeight() 
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

static void getDivision()
{
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
		if (standard == true)
		{
			System.out.print("Standard");
			
		}
		
		else if (standard == false)
		{
			System.out.print("Youth");
		}
		
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
