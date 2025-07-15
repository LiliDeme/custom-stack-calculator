import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import expressionsInfixes.ConvertisseurInfixeEnSuffixe;
import expressionsInfixes.EvaluateurSuffixe;

import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEqual, btnPlus, btnMinus, btnMultiplicate, btnDivide, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnOpen, btnClose, btnClear, btnDEL;
	private JTextArea textDisplay;
	private ArrayList<JButton> listButtons;
	private boolean isEvaluated;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Calculatrice partie 2 - Liliane Demers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 554);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Information");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Quitter");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblNewLabel = new JLabel("Fait par Liliane Demers");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		mnNewMenu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><body>Fonctionne avec seulement <br>des entiers à un seul chiffre</body></html>");
		mnNewMenu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html><body>**Spécial feature** <br>fonctionne avec le clavier</body></html>");
		lblNewLabel_1_1.setForeground(new Color(64, 0, 128));
		mnNewMenu.add(lblNewLabel_1_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(95, 433, 75, 50);
		contentPane.add(btn0);
		
		btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEqual.setBounds(265, 433, 75, 50);
		contentPane.add(btnEqual);
		
		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPlus.setBounds(265, 372, 75, 50);
		contentPane.add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMinus.setBounds(265, 311, 75, 50);
		contentPane.add(btnMinus);
		
		btnMultiplicate = new JButton("*");
		btnMultiplicate.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMultiplicate.setBounds(265, 250, 75, 50);
		contentPane.add(btnMultiplicate);
		
		btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDivide.setBounds(265, 189, 75, 50);
		contentPane.add(btnDivide);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 372, 75, 50);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(95, 372, 75, 50);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(180, 372, 75, 50);
		contentPane.add(btn3);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 250, 75, 50);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(95, 250, 75, 50);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(180, 250, 75, 50);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 311, 75, 50);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(95, 311, 75, 50);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(180, 311, 75, 50);
		contentPane.add(btn6);
		
		btnOpen = new JButton("(");
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOpen.setBounds(10, 433, 75, 50);
		contentPane.add(btnOpen);
		
		btnClose = new JButton(")");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClose.setBounds(180, 433, 75, 50);
		contentPane.add(btnClose);
		
		btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(10, 189, 75, 50);
		contentPane.add(btnClear);
		
		btnDEL = new JButton("DEL");
		btnDEL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDEL.setBounds(95, 189, 75, 50);
		contentPane.add(btnDEL);
		
		textDisplay = new JTextArea();
		textDisplay.setEditable(false);
		textDisplay.setText("0");
		textDisplay.setFont(new Font("Monospaced", Font.PLAIN, 24));
		textDisplay.setBounds(10, 11, 330, 167);
		contentPane.add(textDisplay);

		listButtons = new ArrayList<>();

		Collections.addAll(listButtons, btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnClear,btnClose,btnDivide,btnEqual,btnMinus,btnMultiplicate,btnOpen,btnPlus,btnDEL);		
		
		listButtons.forEach(button ->{
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // ajoute un actionListener pour chaque bouttons
					buttonPressed(e);
				}
			});
		});
		isEvaluated = true;
		
		contentPane.setFocusable(true);
		contentPane.requestFocusInWindow();
		
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				toucheClavier(e);
			}
		});
	}
	
	private void toucheClavier(KeyEvent e) {
		char keyChar = e.getKeyChar();
		String keyString = String.valueOf(keyChar);// converti de char à String (utilisé pour l'affichage)

		if (keyChar == KeyEvent.VK_ENTER) {// équivalent à "="
			calcul();
		} else if (Character.isDigit(keyChar) || "+-*/()".indexOf(keyChar) != -1) {// dans le String "+-*/()", retourne l'index de la première occurence du caractère "keychar". Si == -1, ça veut dire qu'il ne fait pas parti du String.
			if (isEvaluated) {
				textDisplay.setText("");
			}
			isEvaluated = false;
			textDisplay.append(keyString);
		} else if (keyChar == KeyEvent.VK_BACK_SPACE) {// pour supprimer
			String nouvelAffichage = textDisplay.getText();
			if (nouvelAffichage.length() <= 1) {
				textDisplay.setText("0");
				isEvaluated = true;
			} else {
				nouvelAffichage = nouvelAffichage.substring(0, nouvelAffichage.length() - 1);//pour supprimer à l'écran en diminuant le string.
				textDisplay.setText(nouvelAffichage);
			}
		}
	}
	
	private void buttonPressed(ActionEvent e){
		JButton buttonActive =(JButton) e.getSource();
		String buttonText = buttonActive.getText().toUpperCase();

		if(isEvaluated){ //permet d'écrire à l'écran de la calculatrice par dessus une expression déjà évaluée
			textDisplay.setText(null);
		}		
		isEvaluated = false;
		
		switch (buttonText) {
			case "DEL":
				String nouvelAffichage = textDisplay.getText();
				if (nouvelAffichage.length()<=1) {
					textDisplay.setText("0");
					isEvaluated = true;
				} else{
					nouvelAffichage = nouvelAffichage.substring(0, nouvelAffichage.length()-1);
					textDisplay.setText(nouvelAffichage);
				}
				break;
			case "=": calcul();	break;
			case "C":
				textDisplay.setText("0");
				isEvaluated = true;
				break;
			default: textDisplay.append(buttonText); break;//sert de else
		}
	}

	private void calcul(){
		isEvaluated = true;
		String expressionInfixe = textDisplay.getText();
		String expressionSuffixe = ConvertisseurInfixeEnSuffixe.convertirEnSuffixe(expressionInfixe);
		System.out.println("Expression suffixe : " + expressionSuffixe);
		int resultat = EvaluateurSuffixe.evaluerSuffixe(expressionSuffixe);
		textDisplay.append("\n= " + resultat);
	}
}


