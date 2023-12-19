import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JEditorPane;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class healthdle extends JFrame {

	private JPanel contentPane;
	JLabel a1;
	JLabel a2;
	JLabel a3;
	JLabel a4;
	JLabel a5;
	JLabel b1;
	JLabel b2;
	JLabel b3;
	JLabel b4;
	JLabel b5;
	JLabel c1;
	JLabel c2;
	JLabel c3;
	JLabel c4;
	JLabel c5;
	JLabel d1;
	JLabel d2;
	JLabel d3;
	JLabel d4;
	JLabel d5;
	JLabel e1;
	JLabel e2;
	JLabel e3;
	JLabel e4;
	JLabel e5;
	JLabel f1;
	JLabel f2;
	JLabel f3;
	JLabel f4;
	JLabel f5;
	JLabel wl;
	JLabel caption;
	
	JButton Q;
	JButton W;
	JButton E;
	JButton R;
	JButton T;
	JButton Y;
	JButton U;
	JButton I;
	JButton O;
	JButton P;
	JButton A;
	JButton S;
	JButton D;
	JButton F;
	JButton G;
	JButton H;
	JButton J;
	JButton K;
	JButton L;
	JButton Z;
	JButton X;
	JButton C;
	JButton V;
	JButton B;
	JButton N;
	JButton M;
	JButton ENTER;
	JButton DEL;
	
	public int count = 0;
	public int limit = 0;
	public static String[] user = new String[5];
	public static String[] letter = new String[5];
	public static String word;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					healthdle frame = new healthdle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		String[] words = {"WALKS", "JUMPS", "PLANK", "DRINK", "SITUP", "LUNGE", "RELAX", "SLEEP"};		// list of words
		word = words[(int) (Math.floor(Math.random()*8))];												// choose random word

		for (int i=0; i<5; i++) {
			letter[i] = word.substring(i,i+1);															// break word apart into letters
		}
	}
	
	public void letter(String x) {
		
		count++;
		
		check();
		
		user[(count-1)%5] = x;
		
		if (count==1) {														// add letter to gui
			a1.setText(x);
		}
		else if (count==2) {
			a2.setText(x);
		}
		else if (count==3) {
			a3.setText(x);
		}
		else if (count==4) {
			a4.setText(x);
		}
		else if (count==5) {
			a5.setText(x);
		}
		else if (count==6) {
			b1.setText(x);
		}
		else if (count==7) {
			b2.setText(x);
		}
		else if (count==8) {
			b3.setText(x);
		}
		else if (count==9) {
			b4.setText(x);
		}
		else if (count==10) {
			b5.setText(x);
		}
		else if (count==11) {
			c1.setText(x);
		}
		else if (count==12) {
			c2.setText(x);
		}
		else if (count==13) {
			c3.setText(x);
		}
		else if (count==14) {
			c4.setText(x);
		}
		else if (count==15) {
			c5.setText(x);
		}
		else if (count==16) {
			d1.setText(x);
		}
		else if (count==17) {
			d2.setText(x);
		}
		else if (count==18) {
			d3.setText(x);
		}
		else if (count==19) {
			d4.setText(x);
		}
		else if (count==20) {
			d5.setText(x);
		}
		else if (count==21) {
			e1.setText(x);
		}
		else if (count==22) {
			e2.setText(x);
		}
		else if (count==23) {
			e3.setText(x);
		}
		else if (count==24) {
			e4.setText(x);
		}
		else if (count==25) {
			e5.setText(x);
		}
		else if (count==26) {
			f1.setText(x);
		}
		else if (count==27) {
			f2.setText(x);
		}
		else if (count==28) {
			f3.setText(x);
		}
		else if (count==29) {
			f4.setText(x);
		}
		else if (count==30) {
			f5.setText(x);
		}
		
		if (count%5==0) {
			Q.setEnabled(false);
			W.setEnabled(false);
			E.setEnabled(false);
			R.setEnabled(false);
			T.setEnabled(false);
			Y.setEnabled(false);
			U.setEnabled(false);
			I.setEnabled(false);
			O.setEnabled(false);
			P.setEnabled(false);
			A.setEnabled(false);
			S.setEnabled(false);
			D.setEnabled(false);
			F.setEnabled(false);
			G.setEnabled(false);
			H.setEnabled(false);
			J.setEnabled(false);
			K.setEnabled(false);
			L.setEnabled(false);
			Z.setEnabled(false);
			X.setEnabled(false);
			C.setEnabled(false);
			V.setEnabled(false);
			B.setEnabled(false);
			N.setEnabled(false);
			M.setEnabled(false);	
		}	
	}
	
	public void del() {
		if (count==1) {									// delete previous letter
			a1.setText("___");
		}
		else if (count==2) {
			a2.setText("___");
		}
		else if (count==3) {
			a3.setText("___");
		}
		else if (count==4) {
			a4.setText("___");
		}
		else if (count==5) {
			a5.setText("___");
		}
		else if (count==6) {
			b1.setText("___");
		}
		else if (count==7) {
			b2.setText("___");
		}
		else if (count==8) {
			b3.setText("___");
		}
		else if (count==9) {
			b4.setText("___");
		}
		else if (count==10) {
			b5.setText("___");
		}
		else if (count==11) {
			c1.setText("___");
		}
		else if (count==12) {
			c2.setText("___");
		}
		else if (count==13) {
			c3.setText("___");
		}
		else if (count==14) {
			c4.setText("___");
		}
		else if (count==15) {
			c5.setText("___");
		}
		else if (count==16) {
			d1.setText("___");
		}
		else if (count==17) {
			d2.setText("___");
		}
		else if (count==18) {
			d3.setText("___");
		}
		else if (count==19) {
			d4.setText("___");
		}
		else if (count==20) {
			d5.setText("___");
		}
		else if (count==21) {
			e1.setText("___");
		}
		else if (count==22) {
			e2.setText("___");
		}
		else if (count==23) {
			e3.setText("___");
		}
		else if (count==24) {
			e4.setText("___");
		}
		else if (count==25) {
			e5.setText("___");
		}
		else if (count==26) {
			f1.setText("___");
		}
		else if (count==27) {
			f2.setText("___");
		}
		else if (count==28) {
			f3.setText("___");
		}
		else if (count==29) {
			f4.setText("___");
		}
		else if (count==30) {
			f5.setText("___");
		}
		
		Q.setEnabled(true);
		W.setEnabled(true);
		E.setEnabled(true);
		R.setEnabled(true);
		T.setEnabled(true);
		Y.setEnabled(true);
		U.setEnabled(true);
		I.setEnabled(true);
		O.setEnabled(true);
		P.setEnabled(true);
		A.setEnabled(true);
		S.setEnabled(true);
		D.setEnabled(true);
		F.setEnabled(true);
		G.setEnabled(true);
		H.setEnabled(true);
		J.setEnabled(true);
		K.setEnabled(true);
		L.setEnabled(true);
		Z.setEnabled(true);
		X.setEnabled(true);
		C.setEnabled(true);
		V.setEnabled(true);
		B.setEnabled(true);
		N.setEnabled(true);
		M.setEnabled(true);	
		
		count--;
		
		check();
	}
	
	public void enter() {
		int[] correct = new int[5];
		int win = 0;
		
		for (int i=0; i<5; i++) {

			if (user[i].equals(letter[i])) {							// checks if letter is right place
				correct[i] = 2;
				win++;
			}
			else {
				for (int j=0; j<5; j++) {
					if (user[i].equals(letter[j])) {					// checks if letter is wrong place but right letter
						correct[i] = 1;
					}
				}
			}
		}
		
		for (int i=0; i<5; i++) {										// change colour of letter
			int place = count - (4 - i);
			String x = "";
			
			if (correct[i]==2) {
				if (place==1) {
					a1.setForeground(Color.green);
					x = a1.getText();
				}
				else if (place==2) {
					a2.setForeground(Color.green);
					x = a2.getText();
				}
				else if (place==3) {
					a3.setForeground(Color.green);
					x = a3.getText();
				}
				else if (place==4) {
					a4.setForeground(Color.green);
					x = a4.getText();
				}
				else if (place==5) {
					a5.setForeground(Color.green);
					x = a5.getText();
				}
				else if (place==6) {
					b1.setForeground(Color.green);
					x = b1.getText();
				}
				else if (place==7) {
					b2.setForeground(Color.green);
					x = b2.getText();
				}
				else if (place==8) {
					b3.setForeground(Color.green);
					x = b3.getText();
				}
				else if (place==9) {
					b4.setForeground(Color.green);
					x = b4.getText();
				}
				else if (place==10) {
					b5.setForeground(Color.green);
					x = b5.getText();
				}
				else if (place==11) {
					c1.setForeground(Color.green);
					x = c1.getText();
				}
				else if (place==12) {
					c2.setForeground(Color.green);
					x = c2.getText();
				}
				else if (place==13) {
					c3.setForeground(Color.green);
					x = c3.getText();
				}
				else if (place==14) {
					c4.setForeground(Color.green);
					x = c4.getText();
				}
				else if (place==15) {
					c5.setForeground(Color.green);
					x = c5.getText();
				}
				else if (place==16) {
					d1.setForeground(Color.green);
					x = d1.getText();
				}
				else if (place==17) {
					d2.setForeground(Color.green);
					x = d2.getText();
				}
				else if (place==18) {
					d3.setForeground(Color.green);
					x = d3.getText();
				}
				else if (place==19) {
					d4.setForeground(Color.green);
					x = d4.getText();
				}
				else if (place==20) {
					d5.setForeground(Color.green);
					x = d5.getText();
				}
				else if (place==21) {
					e1.setForeground(Color.green);
					x = e1.getText();
				}
				else if (place==22) {
					e2.setForeground(Color.green);
					x = e2.getText();
				}
				else if (place==23) {
					e3.setForeground(Color.green);
					x = e3.getText();
				}
				else if (place==24) {
					e4.setForeground(Color.green);
					x = e4.getText();
				}
				else if (place==25) {
					e5.setForeground(Color.green);
					x = e5.getText();
				}
				else if (place==26) {
					f1.setForeground(Color.green);
					x = f1.getText();
				}
				else if (place==27) {
					f2.setForeground(Color.green);
					x = f2.getText();
				}
				else if (place==28) {
					f3.setForeground(Color.green);
					x = f3.getText();
				}
				else if (place==29) {
					f4.setForeground(Color.green);
					x = f4.getText();
				}
				else if (place==30) {
					f5.setForeground(Color.green);
					x = f5.getText();
				}
				
				if (x.equals("Q")) {
					Q.setForeground(Color.green);
				}
				else if (x.equals("W")) {
					W.setForeground(Color.green);
				}
				else if (x.equals("E")) {
					E.setForeground(Color.green);
				}
				else if (x.equals("R")) {
					R.setForeground(Color.green);
				}
				else if (x.equals("T")) {
					T.setForeground(Color.green);
				}
				else if (x.equals("Y")) {
					Y.setForeground(Color.green);
				}
				else if (x.equals("U")) {
					U.setForeground(Color.green);
				}
				else if (x.equals("I")) {
					I.setForeground(Color.green);
				}
				else if (x.equals("O")) {
					O.setForeground(Color.green);
				}
				else if (x.equals("P")) {
					P.setForeground(Color.green);
				}
				else if (x.equals("A")) {
					A.setForeground(Color.green);
				}
				else if (x.equals("S")) {
					S.setForeground(Color.green);
				}
				else if (x.equals("D")) {
					D.setForeground(Color.green);
				}
				else if (x.equals("F")) {
					F.setForeground(Color.green);
				}
				else if (x.equals("G")) {
					G.setForeground(Color.green);
				}
				else if (x.equals("H")) {
					H.setForeground(Color.green);
				}
				else if (x.equals("J")) {
					J.setForeground(Color.green);
				}
				else if (x.equals("K")) {
					K.setForeground(Color.green);
				}
				else if (x.equals("L")) {
					L.setForeground(Color.green);
				}
				else if (x.equals("Z")) {
					Z.setForeground(Color.green);
				}
				else if (x.equals("X")) {
					X.setForeground(Color.green);
				}
				else if (x.equals("C")) {
					C.setForeground(Color.green);
				}
				else if (x.equals("V")) {
					V.setForeground(Color.green);
				}
				else if (x.equals("B")) {
					B.setForeground(Color.green);
				}
				else if (x.equals("N")) {
					N.setForeground(Color.green);
				}
				else if (x.equals("M")) {
					M.setForeground(Color.green);
				}
			
			}
			else if (correct[i]==1) {
				if (place==1) {
					a1.setForeground(Color.yellow);
					x = a1.getText();
				}
				else if (place==2) {
					a2.setForeground(Color.yellow);
					x = a2.getText();
				}
				else if (place==3) {
					a3.setForeground(Color.yellow);
					x = a3.getText();
				}
				else if (place==4) {
					a4.setForeground(Color.yellow);
					x = a4.getText();
				}
				else if (place==5) {
					a5.setForeground(Color.yellow);
					x = a5.getText();
				}
				else if (place==6) {
					b1.setForeground(Color.yellow);
					x = b1.getText();
				}
				else if (place==7) {
					b2.setForeground(Color.yellow);
					x = b2.getText();
				}
				else if (place==8) {
					b3.setForeground(Color.yellow);
					x = b3.getText();
				}
				else if (place==9) {
					b4.setForeground(Color.yellow);
					x = b4.getText();
				}
				else if (place==10) {
					b5.setForeground(Color.yellow);
					x = b5.getText();
				}
				else if (place==11) {
					c1.setForeground(Color.yellow);
					x = c1.getText();
				}
				else if (place==12) {
					c2.setForeground(Color.yellow);
					x = c2.getText();
				}
				else if (place==13) {
					c3.setForeground(Color.yellow);
					x = c3.getText();
				}
				else if (place==14) {
					c4.setForeground(Color.yellow);
					x = c4.getText();
				}
				else if (place==15) {
					c5.setForeground(Color.yellow);
					x = c5.getText();
				}
				else if (place==16) {
					d1.setForeground(Color.yellow);
					x = d1.getText();
				}
				else if (place==17) {
					d2.setForeground(Color.yellow);
					x = d2.getText();
				}
				else if (place==18) {
					d3.setForeground(Color.yellow);
					x = d3.getText();
				}
				else if (place==19) {
					d4.setForeground(Color.yellow);
					x = d4.getText();
				}
				else if (place==20) {
					d5.setForeground(Color.yellow);
					x = d5.getText();
				}
				else if (place==21) {
					e1.setForeground(Color.yellow);
					x = e1.getText();
				}
				else if (place==22) {
					e2.setForeground(Color.yellow);
					x = e2.getText();
				}
				else if (place==23) {
					e3.setForeground(Color.yellow);
					x = e3.getText();
				}
				else if (place==24) {
					e4.setForeground(Color.yellow);
					x = e4.getText();
				}
				else if (place==25) {
					e5.setForeground(Color.yellow);
					x = e5.getText();
				}
				else if (place==26) {
					f1.setForeground(Color.yellow);
					x = f1.getText();
				}
				else if (place==27) {
					f2.setForeground(Color.yellow);
					x = f2.getText();
				}
				else if (place==28) {
					f3.setForeground(Color.yellow);
					x = f3.getText();
				}
				else if (place==29) {
					f4.setForeground(Color.yellow);
					x = f4.getText();
				}
				else if (place==30) {
					f5.setForeground(Color.yellow);
					x = f5.getText();
				}
				
				if (x.equals("Q")) {
					Q.setForeground(Color.yellow);
				}
				else if (x.equals("W")) {
					W.setForeground(Color.yellow);
				}
				else if (x.equals("E")) {
					E.setForeground(Color.yellow);
				}
				else if (x.equals("R")) {
					R.setForeground(Color.yellow);
				}
				else if (x.equals("T")) {
					T.setForeground(Color.yellow);
				}
				else if (x.equals("Y")) {
					Y.setForeground(Color.yellow);
				}
				else if (x.equals("U")) {
					U.setForeground(Color.yellow);
				}
				else if (x.equals("I")) {
					I.setForeground(Color.yellow);
				}
				else if (x.equals("O")) {
					O.setForeground(Color.yellow);
				}
				else if (x.equals("P")) {
					P.setForeground(Color.yellow);
				}
				else if (x.equals("A")) {
					A.setForeground(Color.yellow);
				}
				else if (x.equals("S")) {
					S.setForeground(Color.yellow);
				}
				else if (x.equals("D")) {
					D.setForeground(Color.yellow);
				}
				else if (x.equals("F")) {
					F.setForeground(Color.yellow);
				}
				else if (x.equals("G")) {
					G.setForeground(Color.yellow);
				}
				else if (x.equals("H")) {
					H.setForeground(Color.yellow);
				}
				else if (x.equals("J")) {
					J.setForeground(Color.yellow);
				}
				else if (x.equals("K")) {
					K.setForeground(Color.yellow);
				}
				else if (x.equals("L")) {
					L.setForeground(Color.yellow);
				}
				else if (x.equals("Z")) {
					Z.setForeground(Color.yellow);
				}
				else if (x.equals("X")) {
					X.setForeground(Color.yellow);
				}
				else if (x.equals("C")) {
					C.setForeground(Color.yellow);
				}
				else if (x.equals("V")) {
					V.setForeground(Color.yellow);
				}
				else if (x.equals("B")) {
					B.setForeground(Color.yellow);
				}
				else if (x.equals("N")) {
					N.setForeground(Color.yellow);
				}
				else if (x.equals("M")) {
					M.setForeground(Color.yellow);
				}
			}
			
			else {
				if (place==1) {
					x = a1.getText();
				}
				else if (place==2) {
					x = a2.getText();
				}
				else if (place==3) {
					x = a3.getText();
				}
				else if (place==4) {
					x = a4.getText();
				}
				else if (place==5) {
					x = a5.getText();
				}
				else if (place==6) {
					x = b1.getText();
				}
				else if (place==7) {
					x = b2.getText();
				}
				else if (place==8) {
					x = b3.getText();
				}
				else if (place==9) {
					x = b4.getText();
				}
				else if (place==10) {
					x = b5.getText();
				}
				else if (place==11) {
					x = c1.getText();
				}
				else if (place==12) {
					x = c2.getText();
				}
				else if (place==13) {
					x = c3.getText();
				}
				else if (place==14) {
					x = c4.getText();
				}
				else if (place==15) {
					x = c5.getText();
				}
				else if (place==16) {
					x = d1.getText();
				}
				else if (place==17) {
					x = d2.getText();
				}
				else if (place==18) {
					x = d3.getText();
				}
				else if (place==19) {
					x = d4.getText();
				}
				else if (place==20) {
					x = d5.getText();
				}
				else if (place==21) {
					x = e1.getText();
				}
				else if (place==22) {
					x = e2.getText();
				}
				else if (place==23) {
					x = e3.getText();
				}
				else if (place==24) {
					x = e4.getText();
				}
				else if (place==25) {
					x = e5.getText();
				}
				else if (place==26) {
					x = f1.getText();
				}
				else if (place==27) {
					x = f2.getText();
				}
				else if (place==28) {
					x = f3.getText();
				}
				else if (place==29) {
					x = f4.getText();
				}
				else if (place==30) {
					x = f5.getText();
				}
				
				if (x.equals("Q")) {
					Q.setForeground(Color.white);
				}
				else if (x.equals("W")) {
					W.setForeground(Color.white);
				}
				else if (x.equals("E")) {
					E.setForeground(Color.white);
				}
				else if (x.equals("R")) {
					R.setForeground(Color.white);
				}
				else if (x.equals("T")) {
					T.setForeground(Color.white);
				}
				else if (x.equals("Y")) {
					Y.setForeground(Color.white);
				}
				else if (x.equals("U")) {
					U.setForeground(Color.white);
				}
				else if (x.equals("I")) {
					I.setForeground(Color.white);
				}
				else if (x.equals("O")) {
					O.setForeground(Color.white);
				}
				else if (x.equals("P")) {
					P.setForeground(Color.white);
				}
				else if (x.equals("A")) {
					A.setForeground(Color.white);
				}
				else if (x.equals("S")) {
					S.setForeground(Color.white);
				}
				else if (x.equals("D")) {
					D.setForeground(Color.white);
				}
				else if (x.equals("F")) {
					F.setForeground(Color.white);
				}
				else if (x.equals("G")) {
					G.setForeground(Color.white);
				}
				else if (x.equals("H")) {
					H.setForeground(Color.white);
				}
				else if (x.equals("J")) {
					J.setForeground(Color.white);
				}
				else if (x.equals("K")) {
					K.setForeground(Color.white);
				}
				else if (x.equals("L")) {
					L.setForeground(Color.white);
				}
				else if (x.equals("Z")) {
					Z.setForeground(Color.white);
				}
				else if (x.equals("X")) {
					X.setForeground(Color.white);
				}
				else if (x.equals("C")) {
					C.setForeground(Color.white);
				}
				else if (x.equals("V")) {
					V.setForeground(Color.white);
				}
				else if (x.equals("B")) {
					B.setForeground(Color.white);
				}
				else if (x.equals("N")) {
					N.setForeground(Color.white);
				}
				else if (x.equals("M")) {
					M.setForeground(Color.white);
				}
			}
		}
		
		Q.setEnabled(true);
		W.setEnabled(true);
		E.setEnabled(true);
		R.setEnabled(true);
		T.setEnabled(true);
		Y.setEnabled(true);
		U.setEnabled(true);
		I.setEnabled(true);
		O.setEnabled(true);
		P.setEnabled(true);
		A.setEnabled(true);
		S.setEnabled(true);
		D.setEnabled(true);
		F.setEnabled(true);
		G.setEnabled(true);
		H.setEnabled(true);
		J.setEnabled(true);
		K.setEnabled(true);
		L.setEnabled(true);
		Z.setEnabled(true);
		X.setEnabled(true);
		C.setEnabled(true);
		V.setEnabled(true);
		B.setEnabled(true);
		N.setEnabled(true);
		M.setEnabled(true);	
		ENTER.setEnabled(false);
		DEL.setEnabled(false);
		
		limit = limit + 5;
		
		if (win==5) {								// check if user won or lost
			win();
		}
		else if (count==30) {
			lose();
		}
		
	}

	public void win() {
		Q.setEnabled(false);
		W.setEnabled(false);
		E.setEnabled(false);
		R.setEnabled(false);
		T.setEnabled(false);
		Y.setEnabled(false);
		U.setEnabled(false);
		I.setEnabled(false);
		O.setEnabled(false);
		P.setEnabled(false);
		A.setEnabled(false);
		S.setEnabled(false);
		D.setEnabled(false);
		F.setEnabled(false);
		G.setEnabled(false);
		H.setEnabled(false);
		J.setEnabled(false);
		K.setEnabled(false);
		L.setEnabled(false);
		Z.setEnabled(false);
		X.setEnabled(false);
		C.setEnabled(false);
		V.setEnabled(false);
		B.setEnabled(false);
		N.setEnabled(false);
		M.setEnabled(false);	
		ENTER.setEnabled(false);
		DEL.setEnabled(false);
		
		wl.setText("Congratulations! The word was: " + word);
		
		caption();
	}
	
	public void lose() {
		Q.setEnabled(false);
		W.setEnabled(false);
		E.setEnabled(false);
		R.setEnabled(false);
		T.setEnabled(false);
		Y.setEnabled(false);
		U.setEnabled(false);
		I.setEnabled(false);
		O.setEnabled(false);
		P.setEnabled(false);
		A.setEnabled(false);
		S.setEnabled(false);
		D.setEnabled(false);
		F.setEnabled(false);
		G.setEnabled(false);
		H.setEnabled(false);
		J.setEnabled(false);
		K.setEnabled(false);
		L.setEnabled(false);
		Z.setEnabled(false);
		X.setEnabled(false);
		C.setEnabled(false);
		V.setEnabled(false);
		B.setEnabled(false);
		N.setEnabled(false);
		M.setEnabled(false);	
		ENTER.setEnabled(false);
		DEL.setEnabled(false);
		
		wl.setText("Nice try. The word was: " + word);
		
		caption();
	}
	
	public void check() {
		if (count==limit) {									// enable/disable enter and del buttons
			DEL.setEnabled(false);
		}
		else {
			DEL.setEnabled(true);
		}
		
		if (count==limit) {
			ENTER.setEnabled(false);
		}
		else if (count%5==0) {
			ENTER.setEnabled(true);
		}
		else {
			ENTER.setEnabled(false);
		}
	}
	
	public void caption() {
		if (word.equals("WALKS")) {																			// caption after win/lose
			caption.setText("Take a 10 minute walk before playing again");
		}
		else if(word.equals("JUMPS")) {
			caption.setText("Do 10 jumping jacks before playing again");
		}
		else if(word.equals("PLANK")) {
			caption.setText("Do a 1 minute plank before playing again");
		}
		else if(word.equals("DRINK")) {
			caption.setText("Drink a glass of water before playing again");
		}
		else if(word.equals("SITUP")) {
			caption.setText("Do 10 situps before playing again");
		}
		else if(word.equals("LUNGE")) {
			caption.setText("Do 10 lunges before playing again");
		}
		else if(word.equals("RELAX")) {
			caption.setText("Close your eyes and take 10 deep breaths before playing again");
		}
		else if(word.equals("SLEEP")) {
			caption.setText("Go take a nap before playing again");
		}
	}
	
	public healthdle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 731);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaptionBorder);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Healthdle");
		lblTitle.setForeground(new Color(107, 142, 35));
		lblTitle.setBackground(Color.LIGHT_GRAY);
		lblTitle.setFont(new Font("Georgia", Font.BOLD, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 550, 35);
		contentPane.add(lblTitle);
		
		a1 = new JLabel("___");
		a1.setHorizontalAlignment(SwingConstants.CENTER);
		a1.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		a1.setBounds(103, 69, 46, 50);
		contentPane.add(a1);
		
		a2 = new JLabel("___");
		a2.setHorizontalAlignment(SwingConstants.CENTER);
		a2.setBounds(183, 69, 46, 50);
		contentPane.add(a2);
		
		a3 = new JLabel("___");
		a3.setHorizontalAlignment(SwingConstants.CENTER);
		a3.setBounds(263, 69, 46, 50);
		contentPane.add(a3);
		
		a4 = new JLabel("___");
		a4.setHorizontalAlignment(SwingConstants.CENTER);
		a4.setBounds(343, 69, 46, 50);
		contentPane.add(a4);
		
		a5 = new JLabel("___");
		a5.setHorizontalAlignment(SwingConstants.CENTER);
		a5.setBounds(423, 69, 46, 50);
		contentPane.add(a5);
		
		b1 = new JLabel("___");
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setBounds(103, 130, 46, 50);
		contentPane.add(b1);
		
		b2 = new JLabel("___");
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setBounds(183, 130, 46, 50);
		contentPane.add(b2);
		
		b3 = new JLabel("___");
		b3.setHorizontalAlignment(SwingConstants.CENTER);
		b3.setBounds(263, 130, 46, 50);
		contentPane.add(b3);
		
		b4 = new JLabel("___");
		b4.setHorizontalAlignment(SwingConstants.CENTER);
		b4.setBounds(343, 130, 46, 50);
		contentPane.add(b4);
		
		b5 = new JLabel("___");
		b5.setHorizontalAlignment(SwingConstants.CENTER);
		b5.setBounds(423, 130, 46, 50);
		contentPane.add(b5);
		
		c1 = new JLabel("___");
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setBounds(103, 191, 46, 50);
		contentPane.add(c1);
		
		c2 = new JLabel("___");
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setBounds(183, 191, 46, 50);
		contentPane.add(c2);
		
		c3 = new JLabel("___");
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		c3.setBounds(263, 191, 46, 50);
		contentPane.add(c3);
		
		c4 = new JLabel("___");
		c4.setHorizontalAlignment(SwingConstants.CENTER);
		c4.setBounds(343, 191, 46, 50);
		contentPane.add(c4);
		
		c5 = new JLabel("___");
		c5.setHorizontalAlignment(SwingConstants.CENTER);
		c5.setBounds(423, 191, 46, 50);
		contentPane.add(c5);
		
		d1 = new JLabel("___");
		d1.setHorizontalAlignment(SwingConstants.CENTER);
		d1.setBounds(103, 252, 46, 50);
		contentPane.add(d1);
		
		d2 = new JLabel("___");
		d2.setHorizontalAlignment(SwingConstants.CENTER);
		d2.setBounds(183, 252, 46, 50);
		contentPane.add(d2);
		
		d3 = new JLabel("___");
		d3.setHorizontalAlignment(SwingConstants.CENTER);
		d3.setBounds(263, 252, 46, 50);
		contentPane.add(d3);
		
		d4 = new JLabel("___");
		d4.setHorizontalAlignment(SwingConstants.CENTER);
		d4.setBounds(343, 252, 46, 50);
		contentPane.add(d4);
		
		d5 = new JLabel("___");
		d5.setHorizontalAlignment(SwingConstants.CENTER);
		d5.setBounds(423, 252, 46, 50);
		contentPane.add(d5);
		
		e1 = new JLabel("___");
		e1.setHorizontalAlignment(SwingConstants.CENTER);
		e1.setBounds(103, 313, 46, 50);
		contentPane.add(e1);
		
		e2 = new JLabel("___");
		e2.setHorizontalAlignment(SwingConstants.CENTER);
		e2.setBounds(183, 313, 46, 50);
		contentPane.add(e2);
		
		e3 = new JLabel("___");
		e3.setHorizontalAlignment(SwingConstants.CENTER);
		e3.setBounds(263, 313, 46, 50);
		contentPane.add(e3);
		
		e4 = new JLabel("___");
		e4.setHorizontalAlignment(SwingConstants.CENTER);
		e4.setBounds(343, 313, 46, 50);
		contentPane.add(e4);
		
		e5 = new JLabel("___");
		e5.setHorizontalAlignment(SwingConstants.CENTER);
		e5.setBounds(423, 313, 46, 50);
		contentPane.add(e5);
		
		f1 = new JLabel("___");
		f1.setHorizontalAlignment(SwingConstants.CENTER);
		f1.setBounds(103, 374, 46, 50);
		contentPane.add(f1);
		
		f2 = new JLabel("___");
		f2.setHorizontalAlignment(SwingConstants.CENTER);
		f2.setBounds(183, 374, 46, 50);
		contentPane.add(f2);
		
		f3 = new JLabel("___");
		f3.setHorizontalAlignment(SwingConstants.CENTER);
		f3.setBounds(263, 374, 46, 50);
		contentPane.add(f3);
		
		f4 = new JLabel("___");
		f4.setHorizontalAlignment(SwingConstants.CENTER);
		f4.setBounds(343, 374, 46, 50);
		contentPane.add(f4);
		
		f5 = new JLabel("___");
		f5.setHorizontalAlignment(SwingConstants.CENTER);
		f5.setBounds(423, 374, 46, 50);
		contentPane.add(f5);
		
		Q = new JButton("Q");
		Q.setBackground(new Color(107, 142, 35));
		Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("Q");
			}
		});
		Q.setBounds(10, 459, 46, 35);
		contentPane.add(Q);
		
		W = new JButton("W");
		W.setBackground(new Color(107, 142, 35));
		W.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("W");
			}
		});
		W.setBounds(66, 459, 46, 35);
		contentPane.add(W);
		
		E = new JButton("E");
		E.setBackground(new Color(107, 142, 35));
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("E");
			}
		});
		E.setBounds(122, 459, 46, 35);
		contentPane.add(E);
		
		R = new JButton("R");
		R.setBackground(new Color(107, 142, 35));
		R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("R");
			}
		});
		R.setBounds(178, 459, 46, 35);
		contentPane.add(R);
		
		T = new JButton("T");
		T.setBackground(new Color(107, 142, 35));
		T.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("T");
			}
		});
		T.setBounds(234, 459, 46, 35);
		contentPane.add(T);
		
		Y = new JButton("Y");
		Y.setBackground(new Color(107, 142, 35));
		Y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("Y");
			}
		});
		Y.setBounds(290, 459, 46, 35);
		contentPane.add(Y);
		
		U = new JButton("U");
		U.setBackground(new Color(107, 142, 35));
		U.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("U");
			}
		});
		U.setBounds(346, 459, 46, 35);
		contentPane.add(U);
		
		I = new JButton("I");
		I.setBackground(new Color(107, 142, 35));
		I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("I");
			}
		});
		I.setBounds(402, 459, 46, 35);
		contentPane.add(I);
		
		O = new JButton("O");
		O.setBackground(new Color(107, 142, 35));
		O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("O");
			}
		});
		O.setBounds(458, 459, 46, 35);
		contentPane.add(O);
		
		P = new JButton("P");
		P.setBackground(new Color(107, 142, 35));
		P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("P");
			}
		});
		P.setBounds(514, 459, 46, 35);
		contentPane.add(P);
		
		A = new JButton("A");
		A.setBackground(new Color(107, 142, 35));
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("A");
			}
		});
		A.setBounds(38, 505, 46, 35);
		contentPane.add(A);
		
		S = new JButton("S");
		S.setBackground(new Color(107, 142, 35));
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("S");
			}
		});
		S.setBounds(94, 505, 46, 35);
		contentPane.add(S);
		
		D = new JButton("D");
		D.setBackground(new Color(107, 142, 35));
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("D");
			}
		});
		D.setBounds(150, 505, 46, 35);
		contentPane.add(D);
		
		F = new JButton("F");
		F.setBackground(new Color(107, 142, 35));
		F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("F");
			}
		});
		F.setBounds(206, 505, 46, 35);
		contentPane.add(F);
		
		G = new JButton("G");
		G.setBackground(new Color(107, 142, 35));
		G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("G");
			}
		});
		G.setBounds(262, 505, 46, 35);
		contentPane.add(G);
		
		H = new JButton("H");
		H.setBackground(new Color(107, 142, 35));
		H.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("H");
			}
		});
		H.setBounds(318, 505, 46, 35);
		contentPane.add(H);
		
		J = new JButton("J");
		J.setBackground(new Color(107, 142, 35));
		J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("J");
			}
		});
		J.setBounds(374, 505, 46, 35);
		contentPane.add(J);
		
		K = new JButton("K");
		K.setBackground(new Color(107, 142, 35));
		K.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("K");
			}
		});
		K.setBounds(430, 505, 46, 35);
		contentPane.add(K);
		
		L = new JButton("L");
		L.setBackground(new Color(107, 142, 35));
		L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("L");
			}
		});
		L.setBounds(486, 505, 46, 35);
		contentPane.add(L);
		
		ENTER = new JButton("ENTER");
		ENTER.setBackground(new Color(107, 142, 35));
		ENTER.setEnabled(false);
		ENTER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enter();
			}
		});
		ENTER.setBounds(10, 551, 74, 35);
		contentPane.add(ENTER);
		
		Z = new JButton("Z");
		Z.setBackground(new Color(107, 142, 35));
		Z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("Z");
			}
		});
		Z.setBounds(94, 551, 46, 35);
		contentPane.add(Z);
		
		X = new JButton("X");
		X.setBackground(new Color(107, 142, 35));
		X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("X");
			}
		});
		X.setBounds(150, 551, 46, 35);
		contentPane.add(X);
		
		C = new JButton("C");
		C.setBackground(new Color(107, 142, 35));
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("C");
			}
		});
		C.setBounds(206, 551, 46, 35);
		contentPane.add(C);
		
		V = new JButton("V");
		V.setBackground(new Color(107, 142, 35));
		V.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("V");
			}
		});
		V.setBounds(262, 551, 46, 35);
		contentPane.add(V);
		
		B = new JButton("B");
		B.setBackground(new Color(107, 142, 35));
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("B");
			}
		});
		B.setBounds(318, 551, 46, 35);
		contentPane.add(B);
		
		N = new JButton("N");
		N.setBackground(new Color(107, 142, 35));
		N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("N");
			}
		});
		N.setBounds(374, 551, 46, 35);
		contentPane.add(N);
		
		M = new JButton("M");
		M.setBackground(new Color(107, 142, 35));
		M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letter("M");
			}
		});
		M.setBounds(430, 551, 46, 35);
		contentPane.add(M);
		
		DEL = new JButton("DEL");
		DEL.setBackground(new Color(107, 142, 35));
		DEL.setEnabled(false);
		DEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del();
			}
		});
		DEL.setBounds(486, 551, 74, 35);
		contentPane.add(DEL);
		
		wl = new JLabel("");
		wl.setForeground(new Color(107, 142, 35));
		wl.setFont(new Font("Georgia", Font.BOLD, 20));
		wl.setHorizontalAlignment(SwingConstants.CENTER);
		wl.setBounds(10, 611, 550, 35);
		contentPane.add(wl);
		
		caption = new JLabel("");
		caption.setForeground(new Color(107, 142, 35));
		caption.setFont(new Font("Georgia", Font.PLAIN, 20));
		caption.setHorizontalAlignment(SwingConstants.CENTER);
		caption.setBounds(10, 647, 550, 34);
		contentPane.add(caption);
	}
}
