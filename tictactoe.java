import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


class option implements ActionListener {
	JFrame jf = new JFrame();
	JButton two = new JButton();
	JButton one = new JButton();

public int opt;

	option(){
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(250,20,800,650);
		jf.setLayout(new GridLayout(2,1));
		jf.setVisible(true);
		jf.add(one);
		jf.add(two);
		one.setFont(new Font("MV Boli",Font.BOLD,100));
		one.setForeground(new Color(25,20,200));
		one.addActionListener(this);
		two.setFont(new Font("MV Boli",Font.BOLD,100));
		two.setForeground(new Color(200,20,25));
		two.addActionListener(this);

		one.setText("Singleplayer");
		two.setText("MultiPlayer");


	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==two){
			xoxcomp x =new xoxcomp();
      opt=2;
		}else if(e.getSource()==one){
			xoxcomp c = new xoxcomp();
      opt=1;
		}
	}
}




class xoxcomp extends option implements ActionListener{

	Random rand = new Random();
	JFrame jf = new JFrame();
	JPanel title = new JPanel();
	JPanel button = new JPanel();
	JLabel text = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean play1 = true;


	xoxcomp(){

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(250,20,800,650);
		//jf.setSize(800,800);
		jf.setLayout(new BorderLayout());
		jf.setVisible(true);

		text.setBackground(new Color(25,25,25));
		text.setForeground(new Color(25,255,0));
		text.setFont(new Font("Ink Free",Font.BOLD,75));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("TIC-TAC-TOE");
		text.setOpaque(true);

		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);

		button.setLayout(new GridLayout(3,3));
		button.setBackground(new Color(225,0,0));

		for(int i=0;i<9;i++){
			buttons[i] = new JButton();
			button.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].addActionListener(this);
		}

		title.add(text);
		jf.add(title,BorderLayout.NORTH);
		jf.add(button);

		turn1();
	}


//int opt;

  

	public void actionPerformed(ActionEvent e){
		for(int i=0;i<9;i++){
			if(e.getSource()==buttons[i]){
				if(play1){
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(225,0,0));
						buttons[i].setText("X");
						play1 = false;
						text.setText("O Turn");
						check();
            if(super.opt==1)
              if(flag==1)
						    comp();
					}			
				}else if(super.opt==2){
						buttons[i].setForeground(new Color(0,0,225));
						buttons[i].setText("O");
						play1 = true;
						text.setText("X Turn");
						check();
				}
	
			}
		}
	}
	public void comp(){
					int i = rand.nextInt(9);
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(0,0,225));
						buttons[i].setText("O");
						play1 = true;
						text.setText("X Turn");
						check();
					}else{
						comp();
					}
				
	}
	public void turn1(){
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		text.setText("X Turn");
	}
int flag=1;
	public void check(){


		if((buttons[0]).getText()=="X"&&
			(buttons[1]).getText()=="X"&&
			(buttons[2]).getText()=="X"){
				xwin(0,1,2);
		}else	if((buttons[3]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[5]).getText()=="X"){
				xwin(3,4,5);
		}else	if((buttons[6]).getText()=="X"&&
			(buttons[7]).getText()=="X"&&
			(buttons[8]).getText()=="X"){
				xwin(6,7,8);
		}else	if((buttons[0]).getText()=="X"&&
			(buttons[3]).getText()=="X"&&
			(buttons[6]).getText()=="X"){
				xwin(0,3,6);
		}else	if((buttons[1]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[7]).getText()=="X"){
				xwin(1,4,7);
		}else	if((buttons[2]).getText()=="X"&&
			(buttons[5]).getText()=="X"&&
			(buttons[8]).getText()=="X"){
				xwin(2,5,8);
		}else	if((buttons[0]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[8]).getText()=="X"){
				xwin(0,4,8);
		}else	if((buttons[2]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[6]).getText()=="X"){
				xwin(6,4,2);
		}



		else if((buttons[0]).getText()=="O"&&
			(buttons[1]).getText()=="O"&&
			(buttons[2]).getText()=="O"){
				owin(0,1,2);
		}else	if((buttons[3]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[5]).getText()=="O"){
				owin(3,4,5);
		}else	if((buttons[6]).getText()=="O"&&
			(buttons[7]).getText()=="O"&&
			(buttons[8]).getText()=="O"){
				owin(6,7,8);
		}else	if((buttons[0]).getText()=="O"&&
			(buttons[3]).getText()=="O"&&
			(buttons[6]).getText()=="O"){
				owin(0,3,6);
		}else	if((buttons[1]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[7]).getText()=="O"){
				owin(1,4,7);
		}else	if((buttons[2]).getText()=="O"&&
			(buttons[5]).getText()=="O"&&
			(buttons[8]).getText()=="O"){
				owin(2,5,8);
		}else	if((buttons[0]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[8]).getText()=="O"){
				owin(0,4,8);
		}else	if((buttons[2]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[6]).getText()=="O"){
				owin(6,4,2);
		}

		else if((buttons[0]).getText()!=""||
						(buttons[1]).getText()!=""||
						(buttons[2]).getText()!=""||
						(buttons[3]).getText()!=""||
						(buttons[4]).getText()!=""||
						(buttons[5]).getText()!=""||
						(buttons[6]).getText()!=""||
						(buttons[7]).getText()!=""||
						(buttons[8]).getText()!=""
				){
					draw();
				}

	}

	public void draw(){
		int num=0;
		for(int i=0;i<9;i++){
			if(buttons[i].getText()==""){
				num+=1;
				break;
			}
		}
		if(num==0){
      flag=0;
			for(int i=0;i<9;i++){
			buttons[i].setEnabled(false);
			}

			text.setText("No Winners");
		}
	}



	

	public void xwin(int a,int b,int c){
		buttons[a].setBackground(new Color(0,225,0)); 
		buttons[b].setBackground(new Color(0,225,0)); 
		buttons[c].setBackground(new Color(0,225,0)); 
    flag=0;

		for(int i=0;i<9;i++){
			buttons[i].setEnabled(false);
		}

		text.setText("X Wins");

	}

	public void owin(int a, int b,int c){
		buttons[a].setBackground(new Color(0,225,0)); 
		buttons[b].setBackground(new Color(0,225,0)); 
		buttons[c].setBackground(new Color(0,225,0)); 
    flag=0;
		for(int i=0;i<9;i++){
			buttons[i].setEnabled(false);
		}

		text.setText("O Wins");


	}

}




class xox implements ActionListener {


	JFrame jf = new JFrame();
	JPanel title = new JPanel();
	JPanel button = new JPanel();
	JLabel text = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean play1 = true;


	xox(){

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(250,20,800,650);
		//jf.setSize(800,800);
		jf.setLayout(new BorderLayout());
		jf.setVisible(true);

		text.setBackground(new Color(25,25,25));
		text.setForeground(new Color(25,255,0));
		text.setFont(new Font("Ink Free",Font.BOLD,75));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("TIC-TAC-TOE");
		text.setOpaque(true);

		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);

		button.setLayout(new GridLayout(3,3));
		button.setBackground(new Color(225,0,0));

		for(int i=0;i<9;i++){
			buttons[i] = new JButton();
			button.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].addActionListener(this);
		}

		title.add(text);
		jf.add(title,BorderLayout.NORTH);
		jf.add(button);

		turn1();
	}






	public void actionPerformed(ActionEvent e){
		for(int i=0;i<9;i++){
			if(e.getSource()==buttons[i]){
				if(play1){
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(225,0,0));
						buttons[i].setText("X");
						play1 = false;
						text.setText("O Turn");
						check();
					}			
				}else{
						buttons[i].setForeground(new Color(0,0,225));
						buttons[i].setText("O");
						play1 = true;
						text.setText("X Turn");
						check();
				}
			}
		}
	}

	public void turn1(){
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		text.setText("X Turn");
	}

	public void check(){


		if((buttons[0]).getText()=="X"&&
			(buttons[1]).getText()=="X"&&
			(buttons[2]).getText()=="X"){
				xwin(0,1,2);
		}else	if((buttons[3]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[5]).getText()=="X"){
				xwin(3,4,5);
		}else	if((buttons[6]).getText()=="X"&&
			(buttons[7]).getText()=="X"&&
			(buttons[8]).getText()=="X"){
				xwin(6,7,8);
		}else	if((buttons[0]).getText()=="X"&&
			(buttons[3]).getText()=="X"&&
			(buttons[6]).getText()=="X"){
				xwin(0,3,6);
		}else	if((buttons[1]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[7]).getText()=="X"){
				xwin(1,4,7);
		}else	if((buttons[2]).getText()=="X"&&
			(buttons[5]).getText()=="X"&&
			(buttons[8]).getText()=="X"){
				xwin(2,5,8);
		}else	if((buttons[0]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[8]).getText()=="X"){
				xwin(0,4,8);
		}else	if((buttons[2]).getText()=="X"&&
			(buttons[4]).getText()=="X"&&
			(buttons[6]).getText()=="X"){
				xwin(6,4,2);
		}



		else if((buttons[0]).getText()=="O"&&
			(buttons[1]).getText()=="O"&&
			(buttons[2]).getText()=="O"){
				owin(0,1,2);
		}else	if((buttons[3]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[5]).getText()=="O"){
				owin(3,4,5);
		}else	if((buttons[6]).getText()=="O"&&
			(buttons[7]).getText()=="O"&&
			(buttons[8]).getText()=="O"){
				owin(6,7,8);
		}else	if((buttons[0]).getText()=="O"&&
			(buttons[3]).getText()=="O"&&
			(buttons[6]).getText()=="O"){
				owin(0,3,6);
		}else	if((buttons[1]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[7]).getText()=="O"){
				owin(1,4,7);
		}else	if((buttons[2]).getText()=="O"&&
			(buttons[5]).getText()=="O"&&
			(buttons[8]).getText()=="O"){
				owin(2,5,8);
		}else	if((buttons[0]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[8]).getText()=="O"){
				owin(0,4,8);
		}else	if((buttons[2]).getText()=="O"&&
			(buttons[4]).getText()=="O"&&
			(buttons[6]).getText()=="O"){
				owin(6,4,2);
		}

		else if((buttons[0]).getText()!=""||
						(buttons[1]).getText()!=""||
						(buttons[2]).getText()!=""||
						(buttons[3]).getText()!=""||
						(buttons[4]).getText()!=""||
						(buttons[5]).getText()!=""||
						(buttons[6]).getText()!=""||
						(buttons[7]).getText()!=""||
						(buttons[8]).getText()!=""
				){
					draw();
				}

	}

	public void draw(){
		int num=0;
		for(int i=0;i<9;i++){
			if(buttons[i].getText()==""){
				num+=1;
				break;
			}
		}
		if(num==0){
			for(int i=0;i<9;i++){
			buttons[i].setEnabled(false);
			}

			text.setText("No Winners");
		}
	}

	public void xwin(int a,int b,int c){
		buttons[a].setBackground(new Color(0,225,0)); 
		buttons[b].setBackground(new Color(0,225,0)); 
		buttons[c].setBackground(new Color(0,225,0)); 

		for(int i=0;i<9;i++){
			buttons[i].setEnabled(false);
		}

		text.setText("X Wins");

	}

	public void owin(int a, int b,int c){
		buttons[a].setBackground(new Color(0,225,0)); 
		buttons[b].setBackground(new Color(0,225,0)); 
		buttons[c].setBackground(new Color(0,225,0)); 

		for(int i=0;i<9;i++){
			buttons[i].setEnabled(false);
		}

		text.setText("O Wins");


	}

}


//main
public class tictactoe{
	public static void main(String ar[]){
		option o = new option();
    int opt = o.opt;
//		xox x = new xox();

	}
}
