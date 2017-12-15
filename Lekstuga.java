import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Öva while-slingor
 * 
 * @author Rikard Karlsson 
 * @version 2017-12-15
 */
public class Lekstuga extends Actor
{
    private TextArea textarea;
    public Lekstuga(TextArea myTextArea)
    {
        textarea = myTextArea;
    }
    public void act() 
    {
        int counter = 0;
        while (counter < 5)
        {
            textarea.println(counter);
            counter = counter + 1;
        }
    }    
}
