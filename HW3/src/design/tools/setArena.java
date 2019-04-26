
package design.tools;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import design.mainFrame;


public class setArena extends JPanel implements ActionListener {
		private mainFrame frame;
		private final static String[] surface={"POWDER","CRUD","ICE"};
		private final static String[] weatherCondition={"Sunny","Cloudy","Stormy"};
		private JLabel title;
		private JLabel lenLabel;
		private JLabel SnowSurface_label;
		private JLabel WeatherConditio_label;
		final JTextArea ArenaLength_TextArea;
		private JComboBox<String> SnowSurface_combobox;
		private JComboBox<String> WeatherCondition_combobox;
		private JButton BuildArena_button;
	
	
	
	public setArena(mainFrame frame) {	
		this.frame=frame;
		// Title -Label
        title = new JLabel("BUILD ARENA");
       title.setForeground(Color.BLUE.darker());
       // length -Label
        lenLabel = new JLabel("Arena length");
       //Arena Length -JTextArea
        ArenaLength_TextArea=new JTextArea(); 
       // Snow surface -Label
        SnowSurface_label = new JLabel("Snow surface");
       //Snow surface -jComboBox
        SnowSurface_combobox=new JComboBox<String>(surface);
       // Weather Conditio -Label
        WeatherConditio_label = new JLabel("Weather condition");   
       //Weather Condition -jComboBox
        WeatherCondition_combobox=new JComboBox<String>(weatherCondition);
       
        //Build arena -button
        BuildArena_button = new JButton("Build arena"); 
		BuildArena_button.addActionListener(this);
		
        add(title);
        add(lenLabel);
        add(ArenaLength_TextArea);
        add(SnowSurface_label);
        add(SnowSurface_combobox);
        add(WeatherConditio_label);
        add(WeatherCondition_combobox);
        add(BuildArena_button);
        
		setLayout(new GridLayout(8, 0));
		setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 30));
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	/*	try {
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
//	/**
//	 * @return the arenaPhoto
//	 */
//	public Background getArenaPhoto() {
//		return arenaPhoto;
//	}
//	/**
	// * @param arenaPhoto the arenaPhoto to set
	// */
//public void setArenaPhoto(Background arenaPhoto) {
	//	this.arenaPhoto = arenaPhoto;
	//}
	
	
	
	
	

}
