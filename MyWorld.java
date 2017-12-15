import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private TextArea textarea;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        textarea = new TextArea();
        addObject(textarea,300,200);
        Lekstuga lekstuga = new Lekstuga(textarea);
        addObject(lekstuga,100, 100);
    }

    private void test()
    {
        //test
        textarea.println("Print on new lines");
        int i = 0;
        while (i < 5)
        {      
            textarea.println(i);
            ++i;
        }
        textarea.print("Print in same line: ");
        i = 0;
        while (i < 5)
        {      
            textarea.print(i);
            ++i;
        }

    }
}
