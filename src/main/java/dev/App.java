package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	// récupération du titre depuis le fichier de propriété.
        String titre = ResourceBundle.getBundle("application").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);
	
	// affichage de l'environnement
        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environnement : " + environnement);

    	/*String asciiArt4 = FigletFont.convertOneLine("Hello World!");     
        System.out.println(asciiArt4);    
        /*System.out.println( "Hello World!" );*/
    }
}
