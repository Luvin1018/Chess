public class Pawn extends Chess
{
    private String color;
    private int x;
    private int y;
    private boolean var=true;
    public Pawn(String color,int x)
    {
        this.color=color;
        if(color.equals("W")){
            this.y=1;
        }
        else{
            this.y=6;
        }
        this.x=x;
    }
    public String toString(){
        return color+"P     ";
    }
    public void setPosition(int x,int y){
        if(0<=x && x<=7 && y<=7 && 0<=y){
            if(color.equals("W")){
                if(y-this.y==1){
                    this.x=x;
                    this.y=y;
                    var=false;
                }
                else if(y-this.y==2 && var){
                    this.x=x;
                    this.y=y;
                    var=false;
                }
                else{
                    throw new Error("illegal moving");
                }
            }
            else{
                if(this.y-y==1){
                    this.x=x;
                    this.y=y;
                    var=false;
                }
                else if(this.y-y==2 && var){
                    this.x=x;
                    this.y=y;
                    var=false;
                }
                else{
                    throw new Error("illegal moving");
                }
            }
        }
        else{
            throw new Error("out of table");
        }
    }
    public int kill(int x,int y,String color){
        if(this.color.equals(color)){
            return 1;
        }
        if(color.equals("W")){
                if(y-this.y==1){
                    return 2;
                }
                else if(y-this.y==2 && var){
                    return 2;
                }
                else{
                    return 1;
                }
        }
        else{
                if(this.y-y==1){
                    return 2;
                }
                else if(this.y-y==2 && var){
                    return 2;
                }
                else{
                    return 1;
                }
        }
    }
    public String getColor(){
        return this.color;
    }
}
