
/**
 * 在这里给出对类 Board 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Board
{
    private Chess[][] table=new Chess[8][8];
    private King wk= new King("W");
    private King bk= new King("B");
    public Board(){       
        for(int i=0;i<8;i++){
            table[1][i]=new Pawn("W",i);
            table[6][i]=new Pawn("B",i);
            for(int j=2;j<6;j++){
                table[j][i]=new Chess();
            }
        }
        table[0][0]=new Rook("W",0);
        table[0][7]=new Rook("W",7);
        table[7][0]=new Rook("B",0);
        table[7][7]=new Rook("B",7);
        table[0][1]=new Knight("W",1);
        table[0][6]=new Knight("W",6);
        table[7][1]=new Knight("B",1);
        table[7][6]=new Knight("B",6);
        table[0][2]=new Bishop("W",2);
        table[0][5]=new Bishop("W",5);
        table[7][2]=new Bishop("B",2);
        table[7][5]=new Bishop("B",5);
        table[0][3]=new Queen("W");
        table[7][3]=new Queen("B");
        table[0][4]=wk;
        table[7][4]=bk;
    }
    public void printOut(){
        for(int i=0;i<8;i++){
            System.out.print((8-i)+"   ");
            for(int j=0;j<8;j++){
                System.out.print(table[7-i][j]);
            }
            System.out.println();
            System.out.println();
        }
        System.out.print("    ");
        for(int i=65;i<73;i++){
            System.out.print((char)i);
            System.out.print("      ");
        }
    }
}
