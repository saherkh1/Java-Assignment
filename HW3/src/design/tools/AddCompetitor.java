package design.tools;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;


import javax.swing.*;
import javax.swing.border.LineBorder;

import design.mainFrame;
import game.entities.IMobileEntity;
import game.enums.WeatherCondition;
import game.enums.SnowSurface;
import utilities.ValidationUtils;

public class AddCompetitor extends JPanel implements ActionListener {

		private mainFrame frame;
		private JLabel title;
		private JLabel Name_label;
		private JLabel Age_label;
		private JLabel MaxSpeedr_label;
		private JLabel Acceleration_label;
    	final JTextArea Name_TextArea;
    	final JTextArea MaxSpeed_TextArea;
    	final JTextArea Age_TextArea;
    	final JTextArea Acceleration_TextArea;
    	private JButton AddCompetitor_button;
    	
		/*private Racer racer;
		private Color color;
		int i=0;
		ImageIcon racIcon;
	
		private static RaceBuilder builder = RaceBuilder.getInstance();
	*/
	public AddCompetitor(mainFrame frame) {
		// Title -Label
        title = new JLabel("ADD COMPETITOR");
       title.setForeground(Color.BLUE.darker());
       // Name -Label
        Name_label = new JLabel("Name");
       //Name -JTextArea
        Name_TextArea=new JTextArea();       
       // Age -Label
        Age_label = new JLabel("Age");       
       //Age -JTextArea
        Age_TextArea=new JTextArea();       
       // Max speed -Label
        MaxSpeedr_label = new JLabel("Max speed");       
       //Max speed -JTextArea
        MaxSpeed_TextArea=new JTextArea();       
       // Acceleration -Label
        Acceleration_label = new JLabel("Acceleration");       
       //Acceleration -JTextArea
        Acceleration_TextArea=new JTextArea();       
       //Add competitor -button
        AddCompetitor_button = new JButton("Add competitor");		
		
        this.frame=frame;
		
	/*	for (String string : RacingClassesFinder.getInstance().getRacersNamesList()) {
		    cmb1.addItem(string);
		}		*/
		
		AddCompetitor_button.addActionListener(this);
		add(title);
        add(Name_label);
        add(Name_TextArea);
        add(Age_label);
        add(Age_TextArea);
        add(MaxSpeedr_label);
        add(MaxSpeed_TextArea);
        add(Acceleration_label);
        add(Acceleration_TextArea);
        add(AddCompetitor_button);
		setLayout(new GridLayout(10, 0));
		setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 30));

	}
	@Override
		public void actionPerformed(ActionEvent arg0) {
		
	/*	color=Color.valueOf(cmb2.getItemAt(cmb2.getSelectedIndex()).toString().toUpperCase());
		try {
			if(frame.getArena()!=null) {
        		if(frame.getArena().getPool()!=null)
        			if(frame.getArena().hasActiveRacers())
        				throw new DialogException("The race is started or finshed,build a new arena.");
			}
			else
        		throw new DialogException("Arena not exist!");
			if(text1.getText().isEmpty())
				throw new DialogException("Racer name is empty!");
			if(text2.getText().isEmpty()||text3.getText().isEmpty())
				throw new DialogException("Max speed or acceleration is empty!");
			
			racer=builder.buildRacer((RacingClassesFinder.getInstance().getRacersList().get(cmb1.getSelectedIndex())), text1.getText(), Double.parseDouble(text2.getText()), Double.parseDouble(text3.getText()), color);
			racIcon=new ImageIcon(this.getClass().getResource(RacingClassesFinder.getInstance().getRacersNamesList().get(cmb1.getSelectedIndex())+cmb2.getItemAt(cmb2.getSelectedIndex())+".png"));
			racer.setImg(racIcon);
			racer.setBackImg(frame.getArenaDesign().getArenaPhoto());
			if(frame.getArena()==null)
				throw new DialogException("Please build arena first and add racers!");
			frame.getArena().addRacer(racer);
			if(frame.getArena().getActiveRacers().contains(racer)) {
				racer.getBackImg().addRacer(racer);
				racer.getBackImg().repaint();
				frame.getArenaBackground().repaint();
			}
			if(frame.getArenaDesign().getArenaPhoto().getRacers().size()>=11) {
				frame.setHeight(frame.getHeight()+60);
				racer.getBackImg().setHeight(racer.getBackImg().getHeight()+60);
				frame.changeSize();
			}
		} catch (RacerLimitException e) {
			JOptionPane.showMessageDialog(frame,e.getMessage());
		} catch (RacerTypeException e) {
			JOptionPane.showMessageDialog(frame,e.getMessage());		}
		catch(DialogException e) {
			JOptionPane.showMessageDialog(frame,e.getMessage());
		}
		catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException  | InvocationTargetException e1) {
			e1.printStackTrace();
		}
		catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(frame,"Max speed or acceleration is invalid!");
		}
		
		frame.repaint();*/
	}
	}

