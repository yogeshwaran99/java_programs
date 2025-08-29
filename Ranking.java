import java.util.Scanner;

enum Rank{
  rank1, rank2, rank3, rank4, rank5;
}

public class Ranking {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the mark from 0 to 100");
    int a = s.nextInt();    
    Rank r;
    switch(a/10){
      case 10 : r = Rank.rank1; break;
      case 9  : r = Rank.rank1; break;
      case 8  : r = Rank.rank2; break;
      case 7  : r = Rank.rank3; break;
      case 6  : r = Rank.rank4; break;
      default : r = Rank.rank5; break;
    }
    System.out.println("Rank : "+r);
    s.close();
  }
}
