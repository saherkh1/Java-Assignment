package design.tools;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import design.mainFrame;


public class BackGround extends JPanel {
	private BufferedImage backPhoto;
	private int width;
	private int height;
	private mainFrame frame;
	int i;
	

	public BackGround(BufferedImage backPhoto, int width, int height, mainFrame frame) {
		super();
		this.backPhoto = backPhoto;
		this.width = width;
		this.height = height;
		this.frame = frame;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (backPhoto!=null) {
			g.drawImage(backPhoto, 0, 0, width+80, height,null);
			
		}
		/*if (racers!=null) {
			i=0;
			for(Racer ra: racers) {
				if(ra.getCurrentLocation()!=null) {
					g.drawImage(ra.getImg().getImage(),(int)ra.getCurrentLocation().getX(), (int)ra.getCurrentLocation().getY(),60, 60,this);
				}
				else
					g.drawImage(ra.getImg().getImage(), 0, i*frame.getArena().getMinYGap()*6,60, 60,this);
				i++;
			}
		}*/
	}
	/*
	 * 
	 * @param racer to add to the background
	 *
	public void addRacer(Racer ra) {
		racers.add(ra);
	}
	/**
	 * @return the backPhoto
	 *
	public BufferedImage getBackPhoto() {
		return backPhoto;
	}
	/**
	 * @param backPhoto the backPhoto to set
	 *
	public void setBackPhoto(BufferedImage backPhoto) {
		this.backPhoto = backPhoto;
	}
	/**
	 * @return the racers
	 *
	public ArrayList<Racer> getRacers() {
		return racers;
	}
	/**
	 * @param racers the racers to set
	 *
	public void setRacers(ArrayList<Racer> racers) {
		this.racers = racers;
	}
	/**
	 * @return the height
	 *
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 *
	public void setHeight(int height) {
		this.height = height;
	}*/
	
}

