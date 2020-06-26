import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        TicTacToe game=new TicTacToe();
        System.out.println("Enter the name of Player1:");
        game.setPlayer1(sc.nextLine());
        System.out.println("Enter the name of Player2:");
        game.setPlayer2(sc.nextLine());
    }
}
class TicTacToe
{
    String player1, player2, winner="";
    private Random rand=new Random();
    private int turn=rand.nextInt((2-1)+1)+1;
    private String getPlayer1()
    {
        return player1;
    }
    void setPlayer1(String player1)
    {
        this.player1=player1;
    }
    private String getPlayer2()
    {
        return player2;
    }
    void setPlayer2(String player2)
    {
        this.player2=player2;
        playGame();
    }
    private void playGame()
    {
        Scanner sc=new Scanner(System.in);
        char[] board={' ',' ',' ',' ',' ',' ',' ',' ',' '};
        while(winner.isEmpty())
        {
            if(turn==2)
            {
                System.out.println(getPlayer1()+"'s turn:");
                printBoard(board);
                System.out.println("Choose unoccupied location between 1-9");
                int position=sc.nextInt()-1;
                if(position<=8 && position>=0)
                {
                    if(board[position]==' ')
                    {
                        board[position]='X';
                    }
                    else
                    {
                        System.out.println("Space already occupied.\nTry Again!");
                        continue;
                    }
                }
                else
                {
                    System.out.println("Invalid Number!\nPlease choose a number between 1-9");
                    continue;
                }
                if(isGameOverBoard(board))
                {
                    printBoard(board);
                    printFinalMessage();
                }
                turn--;
            }
            else
            {
                System.out.println(getPlayer2()+"'s turn:");
                printBoard(board);
                System.out.println("Choose unoccupied location between 1-9");
                int position=sc.nextInt()-1;
                if(position<=8 && position>=0)
                {
                    if(board[position]==' ')
                    {
                        board[position]='O';
                    }
                    else
                    {
                        System.out.println("Space already occupied.\nTry Again!");
                        continue;
                    }
                }
                else
                {
                    System.out.println("Invalid Number!\nPlease choose a number between 1-9");
                    continue;
                }
                if(isGameOverBoard(board))
                {
                    printBoard(board);
                    printFinalMessage();
                }
                turn++;
            }
        }
    }
    private void printBoard(char[] board)
    {
        System.out.print("_"+board[0]+"_|_"+board[1]+"_|_"+board[2]+"_\n");
        System.out.print("_"+board[3]+"_|_"+board[4]+"_|_"+board[5]+"_\n");
        System.out.print(" "+board[6]+" | "+board[7]+" | "+board[8]+" \n");
    }
    private boolean isGameOverBoard(char[] board)
    {
        boolean result=false;
        if(board[0]==board[1] && board[1]==board[2])
        {
            if(board[0]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[0]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[3]==board[4] && board[4]==board[5])
        {
            if(board[3]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[3]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[6]==board[7] && board[7]==board[8])
        {
            if(board[6]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[6]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[0]==board[3] && board[3]==board[6])
        {
            if(board[0]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[0]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[1]==board[4] && board[4]==board[7])
        {
            if(board[1]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[1]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[2]==board[5] && board[5]==board[8])
        {
            if(board[2]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[2]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[2]==board[4] && board[4]==board[6])
        {
            if(board[2]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[2]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[0]==board[4] && board[4]==board[8])
        {
            if(board[0]=='X')
            {
                winner=getPlayer1();
                result=true;
            }
            if(board[0]=='O')
            {
                winner=getPlayer2();
                result=true;
            }
        }
        else if(board[0]!=' ' && board[1]!=' ' && board[2]!=' ' && board[3]!=' ' && board[4]!=' ' && board[5]!=' ' && board[6]!=' ' && board[7]!=' ' && board[8]!=' ')
        {
            winner="Draw";
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }
    private void printFinalMessage()
    {
        System.out.println("\n*****GAME OVER*****");
        if(!winner.equals("Draw"))
        {
            System.out.println("The Winner Is "+winner.toUpperCase()+" :)");
        }
        else
        {
            System.out.println("The Game was a Draw! :)");
        }
    }
}
