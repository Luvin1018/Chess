public class Rook extends Chess
{
   private int x;
   private int y;
   private String color;
   public Rook(String color)
   {
       this.color= color;
       super.add();
   }
   public String toString()
   {
        return color+"R     ";
   }
}
