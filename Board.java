public class Board
{
    private Chess[][] table=new Chess[8][8];
    public Board(){       
        for(int i=0;i<8;i++){
            table[1][i]=new Pawn("W");
            table[6][i]=new Pawn("B");
            for(int j=2;j<6;j++){
                table[j][i]=new Chess();
            }
        }
        table[0][0]=new Rook("W");
        table[0][7]=new Rook("W");
        table[7][0]=new Rook("B");
        table[7][7]=new Rook("B");
        table[0][1]=new Knight("W");
        table[0][6]=new Knight("W");
        table[7][1]=new Knight("B");
        table[7][6]=new Knight("B");
        table[0][2]=new Bishop("W");
        table[0][5]=new Bishop("W");
        table[7][2]=new Bishop("B");
        table[7][5]=new Bishop("B");
        table[0][3]=new Queen("W");
        table[7][3]=new Queen("B");
        table[0][4]=new King("W");
        table[7][4]=new King("B");
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
