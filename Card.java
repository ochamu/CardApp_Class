public class Card {
  int number;
  String mark;
  String[] marks = {"♥", "♦", "♣", "♠"};
  void open() {
    number = (int)(Math.random() * 13) + 1;
    mark = marks[(int)(Math.random() * 4)];
  }
}
