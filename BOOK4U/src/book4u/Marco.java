package book4u;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class Marco extends JFrame{

	PanelBase lamina1;
	Dimension screenSize;
	Marco(){
		// donde va a salir y que tama�o va a tener
		
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize);
                setBounds(0, 0, 1750, 930);
                //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Logo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se deja de ejecutar el programa al apretar la x de cerrar
		setTitle("Renuncios");
		lamina1 = new PanelBase();
		add(lamina1);		
		setVisible(true);
		
	}
}
