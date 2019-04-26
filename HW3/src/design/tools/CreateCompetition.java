package design.tools;

import javax.swing.*;
import javax.swing.border.LineBorder;

import design.mainFrame;
import game.entities.IMobileEntity;
import game.enums.WeatherCondition;
import game.enums.SnowSurface;
import utilities.ValidationUtils;

import game.enums.SnowSurface;

import java.awt.*;
import java.awt.event.*;

public class CreateCompetition extends JPanel implements ActionListener {
	private final static String[] competition={"Ski","Snowborder","Winter"};
    private final static String[] discipline= {"SLALOM","GIANT_SLALOM","DOWNHILL","FREESTYLE"};
    private final static String[] league={"JUNIOR","ADULT","SENIOR"};
    private final static String[] gender= {"FEMALE","MALE"};
	private mainFrame frame; 
	private BackGround arenaPhoto;
	
	private JLabel title;
	private JLabel ChooseCompetition_label;
	private JLabel MaxCompetitorsNumber_label;
	final JTextArea MaxCompetitorsNumber_TextArea;
	private JLabel Discipline_label;
	private JLabel League_label;
	private JLabel Gender_label;
	private JComboBox<String> ChooseCompetition_combobox;
	private JComboBox<String> Discipline_combobox;
	private JComboBox<String> League_combobox;
	private JComboBox<String> Gender_combobox;
	private JButton CreateCompetition_button;
	
	
	
	//private static RaceBuilder builder = RaceBuilder.getInstance();
public CreateCompetition(mainFrame frame) {
	// Title -Label
    title = new JLabel("CREATE COMPETITION");
    title.setForeground(Color.BLUE.darker());
    // Choose Competition -Label
     ChooseCompetition_label = new JLabel("Choose Competition");        
    //Choose Competition  -jComboBox
     ChooseCompetition_combobox=new JComboBox(competition);        
    // Max competitors number -Label
     MaxCompetitorsNumber_label = new JLabel("Snow surface");        
    //Max competitors number -JTextArea
     MaxCompetitorsNumber_TextArea=new JTextArea();        
    // Discipline -Label
     Discipline_label = new JLabel("Discipline");      
    //Discipline -jComboBox
     Discipline_combobox=new JComboBox(discipline);        
    // League -Label
     League_label = new JLabel("League");     
    //League -jComboBox
     League_combobox=new JComboBox(league);        
    // Gender -Label
     Gender_label = new JLabel("Gender");        
    //Snow surface -jComboBox
     Gender_combobox=new JComboBox(gender);        
    //Create competition -button
     CreateCompetition_button = new JButton("Create competition");
	/*for (String string : RacingClassesFinder.getInstance().getArenasNamesList()) {
	    cmb.addItem(string);
	}*/
	CreateCompetition_button.addActionListener(this);
	add(title);
    add(ChooseCompetition_label);
    add(ChooseCompetition_combobox);
    add(MaxCompetitorsNumber_label);
    add(MaxCompetitorsNumber_TextArea);
    add(Discipline_label);
    add(Discipline_combobox);
    add(League_label);
    add(League_combobox);
    add(Gender_label);
    add(Gender_combobox);
    add(CreateCompetition_button);
	setLayout(new GridLayout(12, 0));
	setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 30));
}
@Override
public void actionPerformed(ActionEvent arg0) {
	/*try {
		if(frame.getArena()!=null) 
    		if(frame.getArena().getPool()!=null)
    			if(frame.getArena().hasActiveRacers())
    				throw new DialogException("The race is started or finshed, can't builda a new arena.");
		if(Double.parseDouble(length.getText())<100||Double.parseDouble(length.getText())>3000||Integer.parseInt(racersNum.getText())<1||Integer.parseInt(racersNum.getText())>20)
			throw new DialogException("Invalid input values! Please try again.");
		if(arenaPhoto!=null)
			arenaPhoto.setVisible(false);
		try {
		
		arenaPhoto=new Background(ImageIO.read(this.getClass().getResource(RacingClassesFinder.getInstance().getArenasNamesList().get(cmb.getSelectedIndex())+".jpg")),Integer.parseInt(length.getText()),700,frame);
		}catch (IOException exp) {
            exp.printStackTrace();
        }
		try {
			frame.setArena(builder.buildArena((RacingClassesFinder.getInstance().getArenasList().get(cmb.getSelectedIndex())), Double.parseDouble(length.getText()), Integer.parseInt(racersNum.getText()))); 
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
					| IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
		}
		frame.setWidth(Integer.parseInt(length.getText())+235);
		frame.changeSize();
		frame.getContentPane().add(arenaPhoto);
		frame.setArenaBackground(arenaPhoto);
		frame.setVisible(true);
	}catch(DialogException e) {
		JOptionPane.showMessageDialog(frame,e.getMessage());
	}
	
	*/
	
}
/**
 * @return the arenaPhoto
 */
public BackGround getArenaPhoto() {
	return arenaPhoto;
}
/**
 * @param arenaPhoto the arenaPhoto to set
 */
public void setArenaPhoto(BackGround arenaPhoto) {
	this.arenaPhoto = arenaPhoto;
}






}
