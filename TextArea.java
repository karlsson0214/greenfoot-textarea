import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Print several lines of text.
 * 
 * @author Rikard Karlsson
 * @version 2017-12-15
 */
public class TextArea extends Actor
{
    private String text = ""; //text to display
    private final String NEW_LINE = "\n";
   
    /**
     * called by the system
     */
    public void act()
    {
        print();
    }
    /**
     * to print to screen
     */
    private void print() 
    {
        getWorld().showText(text, getX(), getY());
    }
    /**
     * Append printed text.
     */
    public void print(String text)
    {
        this.text += text;
        print();
    }
    /**
     * Append printed text.
     */
    public void println(String text)
    {
        this.text += text + NEW_LINE;
        print();
    }
    /**
     * Append printed text.
     */
    public void print(int number)
    {
        text += number;
        print();
    }
    /**
     * Append printed text.
     */
    public void println(int number)
    {
        text += number + NEW_LINE;
        print();
    }
    /**
     * Overrideing setLocation, to remove text before printing in 
     * a new location
     */
    public void setLocation(int x, int y)
    {
        getWorld().showText("", getX(), getY());
        super.setLocation(x, y);
        print();
    }
    

}
