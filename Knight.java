public class Knight extends Chess
{
   private int x;
   private int y;
   private String color;
   public Knight(String color)
   {
       this.color= color;
       super.add();
   }
   public String toString()
   {
        return color+"Kn    ";
   }
}
