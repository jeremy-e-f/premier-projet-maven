package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String asciiArt4 = FigletFont.convertOneLine("Hello World!");     
        System.out.println(asciiArt4);    
        /*System.out.println( "Hello World!" );*/
    }
}
