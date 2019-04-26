package design.tools;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import design.mainFrame;


public class Buttons extends JPanel {
		JButton StartCompetition_button;
    	JButton ShowInfo_button;
    	private mainFrame frame;
	
    public Buttons(mainFrame frame) {
    	//Start Competition -button
        StartCompetition_button = new JButton("Start Competition");
       //Show info -button
        ShowInfo_button = new JButton("Show info");
        this.frame=frame;;
		
        /*StartCompetition_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {
            	if(frame.getArena()!=null) {
            		if(frame.getArena().getPool()!=null)
            			if(frame.getArena().hasActiveRacers())
            				throw new DialogException("The race is started or finshed,build a new arena.");
            		if(!frame.getArena().hasActiveRacers())
            			throw new DialogException("There are no racers");
            			
            	}
            	else
            		throw new DialogException("Arena not exist!");
            	frame.getArena().initRace();
            	frame.getArena().startRace();
            	}catch(DialogException c) {
            		JOptionPane.showMessageDialog(frame,c.getMessage());
            	}
            	 
            }
        });
        ShowInfo_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {
            	if(frame.getArena()==null)
            		throw new DialogException("Arena not exist!");
            	JTable table=frame.getArena().showResults();
            	JFrame frameTable=new JFrame("Racers information");
            	frameTable.add(new JScrollPane(table));
            	frameTable.pack();
            	frameTable.setVisible(true);
            	}catch(DialogException c) {
            		JOptionPane.showMessageDialog(frame,c.getMessage());
            	}
            	
            }
        });*/
        add(StartCompetition_button);
        add(ShowInfo_button);
		setLayout(new GridLayout(2,0));
		setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 30));


	}
}