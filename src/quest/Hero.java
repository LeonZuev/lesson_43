package quest;

public class Hero {
  private final  String name;
  private int steps = 0;

  public Hero(String name) {
    this.name = name;

  }
  public void  move() {
    ++steps;
  }
  public int getSteps() {
    this.steps = steps;
  }
}
