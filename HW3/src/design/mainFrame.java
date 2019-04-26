package design;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import design.tools.*;

/**
 *the main frame  of the race containing all the parts of the main page of the race
 * include race and arena setters and start and show buuton
 * 
 */
public class mainFrame extends JFrame {
	
	private setArena arenaDesign;
	private AddCompetitor competitorDesign;
	private Buttons actionDesign;
	private CreateCompetition competitionDesign;
	private JPanel pane;//controle panel
	private BackGround arenaBackground;
	//private Arena arena;
	private int width;
	private int height;
	
	public mainFrame() {
		super("Race");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		arenaDesign=new setArena(this);
		competitorDesign=new AddCompetitor(this);
		actionDesign=new Buttons(this);
		competitionDesign=new CreateCompetition(this);
		width=1230;
		height=700;
		pane=new JPanel();
		
		//arenaDesign.setSize(100, 184);
		pane.add(arenaDesign);
		pane.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//competitorDesign.setSize(100, 230);
		pane.add(competitorDesign);
		pane.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//competitionDesign.setSize(100, 207);
		pane.add(competitionDesign);
		pane.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//actionDesign.setSize(100, 69);
		pane.add(actionDesign);
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		pane.setSize(100, 700);
		add(pane,BorderLayout.EAST);
		setSize(width,height);
		setVisible(true);
		
	}
	/**
	 * change the size of the main frame
	 */
	public void changeSize() {
		setSize(width,height);
	}

	

}
