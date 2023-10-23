package BOOK4U;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
public class Marco extends JFrame{

	PanelBase lamina1;
	Dimension screenSize;
	Marco(){
		// donde va a salir y que tama�o va a tener
		
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
                setSize(1920, 1080);
             URL iconURL = getClass().getResource("/Images/Cucologo.png"); // La barra inclinada (/) al principio indica que la ruta es absoluta
            // Establece un nuevo icono
            ImageIcon icon = new ImageIcon(iconURL);
            // Establece el el icono en la ventana 
            setIconImage(icon.getImage());setResizable(false);
             setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se deja de ejecutar el programa al apretar la x de cerrar
		setTitle("BOOK4U");
		lamina1 = new PanelBase();
		add(lamina1);		
		setVisible(true);
                Controlador.con = BD.makeConnection();
		
	}
}
