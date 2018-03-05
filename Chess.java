
/**
 * 在这里给出对类 Chess 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Chess
{  
    private String color;
    protected static int num=0;
    Chess(){
        
        
    }
    public void add(){
        if(num<32){
            this.num++;
        }
        else{
            throw new Error("more than 32 chess");
        }
    }
    public String toString(){
        return "       ";
    }
}