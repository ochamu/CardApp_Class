public class Player {

  Card draw(Card[] cards) {
    int rnd = (int)(Math.random()*cards.length);
    return cards[rnd];
  }
}
