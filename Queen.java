public class Queen extends Chess
{
   private int x;
   private int y;
   private String color;
   private Queen(String color)
   {
       this.color= color;
       Chess.num+=1;
   }
   public String toString()
   {
        return color+"Q     ";
   }
   public Queen creat(String color)
   {
        if(checkNum())
        {
            return new Queen(color);
        }
        else{
            throw new Error("more than 32 ");
        }
   }
}