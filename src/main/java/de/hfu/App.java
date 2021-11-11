package de.hfu;

import java.io.*;
// import java.util.*;


public class App
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Write your text here: ");
      String line = br.readLine();
      System.out.println("You've wrote: " + line.toUpperCase());
    }
}
