
/**
 * Write a description of class Bishop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bishop extends Chess
{
    //private String color;
    private int x;
    private int y;
    public Bishop(String color)
    {
        this.color=color;
        super.num+=1;
    }
    public String toString(){
        return color+"S     ";
    }
}
