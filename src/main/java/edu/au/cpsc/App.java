package edu.au.cpsc;

import com.github.ricksbrown.cowsay.Cowsay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(Cowsay.say( new String[] {"-f", "dragon", "Goodbye World!"} ));
    }
}
