package de.hfu;

import java.io.*;

/**
 * This is the main app which can run standalone.
 * 
 * @author David Gereon Wolf
 */

public class App
{
	/**
	 * Main: executes on runtime
	 * @param args
	 * @throws IOException
	 */
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Write your text here: ");
      String line = br.readLine();
      System.out.println("You've wrote: " + line.toUpperCase());
    }
}
