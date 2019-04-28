package design;

import java.awt.*;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



import game.arena.WinterArena;
import game.competition.Competition;
import game.competition.SkiCompetition;
import game.competition.SnowboardCompetition;
import game.competition.WinterCompetition;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;
import game.enums.SnowSurface;
import game.enums.WeatherCondition;

import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *the main frame  of the race containing all the parts of the main page of the race
 * include race and arena setters and start and show buuton
 * 
 */
public class mainFrame extends JFrame {
	

	private JPanel contentPane;
	private JTextField arenaLengthTxt;
	private JTextField maxCompititorsTxt;
	private JTextField nameTxt;
	private JTextField ageTxt;
	private JTextField maxSpeedTxt;
	private JTextField accelerTxt;
	private String[] snowS= {"Powder","Crud","Ice"},weather={"Sunny","Cloudy","Stormy"},comp= {"Ski","Snowborder","Winter"},disc= {"Slalom","Giant_Slalom","DowHill","FreeStyle"};
	String[] league={"Junior","Adult","Senior"},gender= {"Female","Male"};
	private WinterArena arena=null;
	ImageIcon img;
	boolean build=false,createComp=false,addComp=false;
	private Competition competition;
	private JTable info;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Compitition");
		setSize(1000, 700);
		setResizable(true);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Determine the new location of the window
		int w = this.getSize().width;
		int h = this.getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;

		// Move the window
		this.setLocation(x, y);

		contentPane = new JPanel();
		contentPane.setSize(1000, 700);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(SystemColor.textHighlight));
		panel.setBounds(801, 0, 191, 159);
		contentPane.add(panel);
		JLabel buildArenaLabel = new JLabel("<html><u>BUILD ARENA</u></html>");

		buildArenaLabel.setForeground(SystemColor.textHighlight);
		buildArenaLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		buildArenaLabel.setBounds(11, 4, 124, 16);
		panel.add(buildArenaLabel);

		JLabel arenaLengthLabel = new JLabel("Arena length");
		arenaLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		arenaLengthLabel.setBounds(11, 18, 100, 16);
		panel.add(arenaLengthLabel);

		arenaLengthTxt = new JTextField();
		arenaLengthTxt.setBounds(11, 34, 160, 22);
		panel.add(arenaLengthTxt);
		arenaLengthTxt.setColumns(10);

		JLabel snowSurface = new JLabel("Snow surface");
		snowSurface.setFont(new Font("Tahoma", Font.BOLD, 10));
		snowSurface.setBounds(11, 55, 114, 16);
		panel.add(snowSurface);

		JComboBox SnowCombo = new JComboBox(snowS);
		SnowCombo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		SnowCombo.setBounds(11, 69, 160, 22);
		panel.add(SnowCombo);

		JLabel weatherCondition = new JLabel("Weather condition");
		weatherCondition.setFont(new Font("Tahoma", Font.BOLD, 10));
		weatherCondition.setBounds(11, 88, 143, 16);
		panel.add(weatherCondition);

		JComboBox weatherCombo = new JComboBox(weather);
		weatherCombo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		weatherCombo.setBounds(11, 102, 160, 22);
		panel.add(weatherCombo);

		JButton buildArenaButton = new JButton("Build arena");
		buildArenaButton.setFont(new Font("Tahoma", Font.BOLD, 10));

		buildArenaButton.setBounds(11, 130, 160, 22);
		panel.add(buildArenaButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight));
		panel_1.setBounds(801, 156, 181, 235);
		panel_1.setLayout(null);
		contentPane.add(panel_1);

		JLabel createCompLabel = new JLabel("<html><u>CREATE COMPITION</u></html>");
		createCompLabel.setForeground(SystemColor.textHighlight);
		createCompLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		createCompLabel.setBounds(11, 7, 158, 16);
		panel_1.add(createCompLabel);

		JLabel chooseCompLabel = new JLabel("Choose compition");
		chooseCompLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		chooseCompLabel.setBounds(11, 20, 125, 16);
		panel_1.add(chooseCompLabel);

		JComboBox compitCombo = new JComboBox(comp);
		compitCombo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		compitCombo.setBounds(11, 35, 160, 22);
		panel_1.add(compitCombo);

		JLabel maxCompititorsLabel = new JLabel("Max competitors number");
		maxCompititorsLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCompititorsLabel.setBounds(11, 55, 162, 16);
		panel_1.add(maxCompititorsLabel);

		maxCompititorsTxt = new JTextField();
		maxCompititorsTxt.setBounds(11, 69, 160, 22);
		panel_1.add(maxCompititorsTxt);
		maxCompititorsTxt.setColumns(10);

		JLabel dicLabel = new JLabel("Discipline");
		dicLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		dicLabel.setBounds(11, 91, 56, 16);
		panel_1.add(dicLabel);

		JComboBox dicCombo = new JComboBox(disc);
		dicCombo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dicCombo.setBounds(11, 106, 160, 22);
		panel_1.add(dicCombo);

		JLabel leagueLabel = new JLabel("League");
		leagueLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		leagueLabel.setBounds(11, 129, 56, 16);
		panel_1.add(leagueLabel);

		JComboBox leagueCombo = new JComboBox(league);
		leagueCombo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		leagueCombo.setBounds(11, 143, 160, 22);
		panel_1.add(leagueCombo);

		JLabel genderLabel = new JLabel("Gender");
		genderLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		genderLabel.setBounds(11, 166, 56, 16);
		panel_1.add(genderLabel);

		JComboBox genderCombo = new JComboBox(gender);
		genderCombo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		genderCombo.setBounds(11, 181, 160, 22);
		panel_1.add(genderCombo);

		JButton createCompButt = new JButton("Create competition");
		createCompButt.setFont(new Font("Tahoma", Font.BOLD, 10));
		createCompButt.setBounds(11, 207, 160, 22);
		panel_1.add(createCompButt);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(SystemColor.textHighlight));
		panel_2.setBounds(801, 386, 181, 210);
		panel_2.setLayout(null);
		contentPane.add(panel_2);

		JLabel addCompLabel = new JLabel("<html><u>ADD COMPETITOR</u></html>");
		addCompLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		addCompLabel.setForeground(SystemColor.textHighlight);
		addCompLabel.setBounds(11, 5, 120, 16);
		panel_2.add(addCompLabel);

		JLabel nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		nameLabel.setBounds(11, 20, 56, 16);
		panel_2.add(nameLabel);

		nameTxt = new JTextField();
		nameTxt.setBounds(11, 37, 160, 22);
		panel_2.add(nameTxt);
		nameTxt.setColumns(10);

		JLabel ageLable = new JLabel("Age");
		ageLable.setFont(new Font("Tahoma", Font.BOLD, 10));
		ageLable.setBounds(11, 59, 56, 16);
		panel_2.add(ageLable);

		ageTxt = new JTextField();
		ageTxt.setBounds(11, 76, 160, 22);
		panel_2.add(ageTxt);
		ageTxt.setColumns(10);

		JLabel maxSpeedLabel = new JLabel("Max speed");
		maxSpeedLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxSpeedLabel.setBounds(11, 101, 85, 16);
		panel_2.add(maxSpeedLabel);

		maxSpeedTxt = new JTextField();
		maxSpeedTxt.setBounds(11, 118, 160, 22);
		panel_2.add(maxSpeedTxt);
		maxSpeedTxt.setColumns(10);

		JLabel accelerLabel = new JLabel("Acceleration");
		accelerLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		accelerLabel.setBounds(11, 139, 116, 16);
		panel_2.add(accelerLabel);

		accelerTxt = new JTextField();
		accelerTxt.setBounds(11, 156, 160, 22);
		panel_2.add(accelerTxt);
		accelerTxt.setColumns(10);

		JButton addCompititorButt = new JButton("Add competitor");
		addCompititorButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addCompititorButt.setFont(new Font("Tahoma", Font.BOLD, 10));
		addCompititorButt.setBounds(11, 181, 160, 22);
		panel_2.add(addCompititorButt);


		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(SystemColor.textHighlight));
		panel_3.setBounds(801, 592, 181, 61);
		panel_3.setLayout(null);
		contentPane.add(panel_3);

		JButton showButt = new JButton("Show info");
		showButt.setFont(new Font("Tahoma", Font.BOLD, 10));
		showButt.setBounds(11, 31, 160, 22);
		panel_3.add(showButt);

		JButton startButt = new JButton("Start competition");
		startButt.setFont(new Font("Tahoma", Font.BOLD, 10));
		startButt.setBounds(11, 5, 160, 22);
		panel_3.add(startButt);


		/***************************Build arena**********************************/

		buildArenaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if( arenaLengthTxt.getText()==null || arenaLengthTxt.getText()=="") {
					JOptionPane.showMessageDialog(null, "Invalid input values: Please try again.");
					return;
				}
				else {

					double length = Double.parseDouble(arenaLengthTxt.getText());
					if(length>900 || length<700) {
						JOptionPane.showMessageDialog(null, "Invalid input values: Please try again.");
						return;
					}

					SnowSurface surface;
					if(((String)SnowCombo.getSelectedItem()).equals("Powder"))
						surface=SnowSurface.POWDER;
					else if(((String)SnowCombo.getSelectedItem()).equals("Crud"))
						surface=SnowSurface.CRUD;
					else
						surface=SnowSurface.ICE;

					WeatherCondition condition;
					String imgName;

					if(((String)weatherCombo.getSelectedItem()).equals("Sunny")) 
						condition=WeatherCondition.SUNNY;

					else if(((String)weatherCombo.getSelectedItem()).equals("Cloudy")) 
						condition=WeatherCondition.CLOUDY;

					else 
						condition=WeatherCondition.STORMY;

					arena = new WinterArena(length, surface, condition);
					contentPane.setSize(1000, (int)length);
					setSize(1000, (int)length);

					imgName=(String)weatherCombo.getSelectedItem();
					img=new ImageIcon(imgName+".jpg");
					Image newImage = img.getImage().getScaledInstance(802, (int)length, Image.SCALE_DEFAULT);
					ImageIcon icon = new ImageIcon(newImage);
					JLabel arenaImage = new JLabel(icon);
					arenaImage.setBounds(0, 0, 802, (int)length);
					panel_3.setBounds(801, 592, 181, (int)length-592);
					JOptionPane.showMessageDialog(null, "icons\\"+imgName+".jpg");
					contentPane.add(arenaImage);
					
					build=true;

				}
			}
		});

		/***************************Create competition**********************************/

		createCompButt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(build==false) {
					JOptionPane.showMessageDialog(null, "Please build arena, create competition and add competitors");
					return;
				}

				int maxCompetitors = Integer.parseInt(maxCompititorsTxt.getText());
				if(maxCompetitors<20 || maxCompetitors<1) {
					JOptionPane.showMessageDialog(null, "Invalid number of compititors.it should be btween 1 and 20");
					return;		
				}
				
				Discipline d;
				if(((String)dicCombo.getSelectedItem()).equals("DowHill"))
					d =Discipline.DOWNHILL;
				else if(((String)dicCombo.getSelectedItem()).equals("FreeStyle"))
					d =Discipline.FREESTYLE;
				else if(((String)dicCombo.getSelectedItem()).equals("Giant_Slalom"))
					d =Discipline.GIANT_SLALOM;
				else
					d =Discipline.SLALOM;


				League l ;
				if(((String)leagueCombo.getSelectedItem()).equals("Adult"))
					l =League.ADULT;
				else if(((String)leagueCombo.getSelectedItem()).equals("Junior"))
					l =League.JUNIOR;
				else 
					l =League.SENIOR;
				
				
				
				Gender g;
				if(((String)genderCombo.getSelectedItem()).equals("Female"))
					g=Gender.FEMALE;
				else
					g=Gender.MALE;
				
				
				
				if(((String)compitCombo.getSelectedItem()).equals("Ski")) {
					competition = new SkiCompetition(arena, maxCompetitors, d, l, g);
				}
				else if(((String)compitCombo.getSelectedItem()).equals("Snowborder")) {
					competition = new SnowboardCompetition(arena, maxCompetitors, d, l, g);
				}
				else
					competition = new WinterCompetition(arena, maxCompetitors, d, l, g);


			}
		});


		/***************************add competitor**********************************/

		addCompititorButt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(build==false || createComp==false) {
					JOptionPane.showMessageDialog(null, "Please build arena, create competition and add competitors");
					return;
				}
			}
		});
		

		/***************************start competition**********************************/

		startButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(build==false || createComp==false || addComp==false) {
					JOptionPane.showMessageDialog(null, "Please build arena, create competition and add competitors");
					return;
				}
			}
		});
		
		/***************************show info**********************************/

		showButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(build==false || createComp==false || addComp==false) {
					JOptionPane.showMessageDialog(null, "Please build arena, create competition and add competitors");
					return;
				}
		        String[] columnNames = { "Name", "Spees", "Max speed","Location","Finished" }; 
				info= new JTable(null, columnNames);
				
				
				
			}
		});

	}
}
