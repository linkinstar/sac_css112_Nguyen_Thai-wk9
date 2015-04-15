package guessANum;
import java.util.Scanner;

public class guessgame {


public static void main(String[] args)
{
Scanner input= new Scanner(System.in);
RandomNumber numrandom = new RandomNumber();
int number2;
int played=1 ;
int countoverall = 0; // count overall turns
int winoverall = 0;
int percentoverall;
int countplay=0;
while (played != 0)
{
int numbertoguess = numrandom.GetANumber_between_1_and_10();// method GetANumber_between_1_and_10 in class RandomNumber
int turn=1;
int count=0;
int correctpercent=0;
do
{
System.out.println("Enter your guess number between 1-10: " );
number2=input.nextInt();
if((number2 >=0)&&(number2 <=10))
{
count++;
countoverall ++;
if( numbertoguess == number2)
{
System.out.println("you win!! after " +count+" tries!!");
correctpercent ++;
turn =0;
winoverall++;
}
else if( numbertoguess<number2)
System.out.println("your guess number "+number2+" is too large");
else
System.out.println("your guess number "+ number2+" is too small");
}}
while( turn !=0);
countplay++;
correctpercent = (correctpercent *100)/count;
percentoverall = ( winoverall * 100)/countoverall;
//System.out.printf("Number of games played: %d\n",count);
System.out.printf("Correct percent for each game: %d\n ",correctpercent);
System.out.println("You have played "+countplay+" games.");
System.out.printf("Winning percent overall :%d\n",percentoverall);
System.out.println("do you to play again(1-Yes,0-No):");
played= input.nextInt();
}
}
}
