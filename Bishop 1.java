public class Bishop extends Chess
{
   private int x;
   private int y;
   private String color;
   public Bishop(String color)
   {
       this.color= color;
       super.add();
   }
   public String toString()
   {
        return color+"B     ";
   }
}
