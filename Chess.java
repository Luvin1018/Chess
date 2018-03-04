public class Chess
{
    private String color="none";
    private int x;
    private int y;
    protected static int num;
    Chess(){
    }
    public String toString(){
        return "       ";
    }
    public void setPosition(int x,int y){
    }
    public boolean die(){
        return false;
    }
    public String getColor(){
        return this.color;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int kill(int x, int y,String color){
        return 0;
    }
    public boolean castling(){
        return false;
    }
    public void move(String dir){
        throw new Error("only King/Rook");
    }
}
