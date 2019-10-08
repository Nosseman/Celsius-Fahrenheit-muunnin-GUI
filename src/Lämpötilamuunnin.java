import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Lämpötilamuunnin implements ActionListener {

	// Tehdään komponentit
	JFrame ikkuna = new JFrame();
	JLabel celsius = new JLabel(" Celsius");
	JTextField syöte = new JTextField();
	JButton muunna = new JButton("Muunna");
	JLabel fahrenheit = new JLabel(" Fahrenheit: ");

	public Lämpötilamuunnin() {
		
		//Asetetaan ikkunalle arvot
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.setSize(350, 100);
		ikkuna.setLocationRelativeTo(null);

		// Asetetaan komponentit ikkunaan
		ikkuna.getContentPane().setLayout(new GridLayout(2, 2));
		ikkuna.getContentPane().add(celsius);
		ikkuna.getContentPane().add(syöte);
		ikkuna.getContentPane().add(muunna);
		ikkuna.getContentPane().add(fahrenheit);
		ikkuna.setVisible(true);

		// Liitetään muunna-nappulaan kuuntelija
		muunna.addActionListener(this);
	}

		//Luodaan kuuntelija ja muunnoslaskun kaava
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == muunna) {

			double cel = Double.parseDouble(syöte.getText());
			double far = cel * 1.8 + 32.0;
			fahrenheit.setText(" Fahrenheit: " + far);
		}
	}

	public static void main(String[] args) {

		new Lämpötilamuunnin();

	}

}
