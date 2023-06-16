package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
	
	static final int Screen_width = 600;
	static final int Screen_height = 600;
	static final int Unit_size = 25;
	static final int Game_units =(Screen_width*Screen_height)/Unit_size;
	static final int Delay = 75;
	final int x[] = new int[Game_units];
	final int y[] = new int[Game_units];
	int bodyParts = 6;
	int appleEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	
	GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(Screen_width,Screen_height));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new myKeyAdapter());
		
		startGame();
	}
	public void startGame() {
		applegenerator();
		running = true;
		timer = new Timer(Delay, this);
		timer.start();
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		draw(g);
	}
	// to see grid 
	public void draw(Graphics g) {
		if(running) {
			/* grid lines
			for(int i=0;i<Screen_height/Unit_size;i++) {
				// draw line with height
				g.drawLine(i*Unit_size, 0, i*Unit_size,Screen_height);
				// draw line with width
				g.drawLine(0,i*Unit_size,Screen_width,i*Unit_size);
			}
			*/
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, Unit_size, Unit_size);
			
			for(int i=0;i<bodyParts;i++) {
				if(i==0) {
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], Unit_size, Unit_size);
				}
				else {
					g.setColor(new Color(45,180,0));
					g.fillRect(x[i], y[i], Unit_size, Unit_size);
				}
			}
			g.setColor(Color.red);
			g.setFont(new Font("Georgia",Font.BOLD,40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: "+appleEaten, (Screen_height-metrics.stringWidth("Score: "+appleEaten))/2,g.getFont().getSize());
		}
		else {
			gameover(g);
		}
	}
	public void applegenerator() {
		appleX = random.nextInt((int)(Screen_width/Unit_size))*Unit_size;
		appleY = random.nextInt((int)(Screen_height/Unit_size))*Unit_size;
		//System.out.println("X"+appleX);
		//System.out.println("Y"+appleY);
		
	}
	public void move() {
		for(int i=bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
			// set value of i to  i-1
		}
		switch(direction) {
		case 'U':
			y[0]=y[0]-Unit_size;
			break;
		case 'D':
			y[0]=y[0]+Unit_size;
			break;
		case 'L':
			x[0]=x[0]-Unit_size;
			break;
		case 'R':
			x[0]=x[0]+Unit_size;
			break;
		}
	}
	public void checkApple() {
		if((x[0]==appleX)&&(y[0]==appleY)) {
			bodyParts++;
			appleEaten++;
			applegenerator();
		}
	}
	public void checkCollisions() {
		for(int i=bodyParts;i>0;i--) {
			if((x[0]==x[i]) && (y[0]==y[i])) {
				running = false;
			}
		}
		//left border
		if(x[0]<0) {
			running = false;
		}
		//right border
		if(x[0]>Screen_width) {
			running = false;
		}
		//top border
		if(y[0]<0) {
			running = false;
		}
		//bottom border
		if(y[0]>Screen_height) {
			running = false;
		}
		if(!running) {
			timer.stop();
		}
	}
	public void gameover(Graphics g) {
		g.setColor(Color.red);
		g.setFont(new Font("Georgia",Font.BOLD,40));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Score: "+appleEaten, (Screen_height-metrics2.stringWidth("Score: "+appleEaten))/2,g.getFont().getSize());
		
		g.setColor(Color.red);
		g.setFont(new Font("Georgia",Font.BOLD,75));
		FontMetrics metrics = getFontMetrics(g.getFont());
		g.drawString("Game Over", (Screen_height-metrics.stringWidth("Game Over"))/2,Screen_height/2);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
	}
	
	public class myKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction !='R') {
					direction='L';
				}
				break;
			
			case KeyEvent.VK_RIGHT:
			if(direction !='L') {
				direction='R';
			}
			break;
			case KeyEvent.VK_UP:
				if(direction !='D') {
					direction='U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction !='U') {
					direction='D';
				}
				break;
		}
	}

}
