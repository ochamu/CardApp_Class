public class Game {
  Player p;
  Card c;

  Game() {
    p = new Player();
    c = new Card();
  }

  void start() {
    p.draw(c);
    System.out.println("Playerが引いたカード: " + c.mark + "の" + c.number + "\n");
    judge();
  }

  void judge() {
    if (c.number >= 10) {
      System.out.println("勝ち");
    }else {
      System.out.println("負け");
    }
  }
}


