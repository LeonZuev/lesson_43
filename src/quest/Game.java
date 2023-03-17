package quest;

import java.util.List;

public class Game {

  private Hero mainHero;
  private List<Room> rooms;
  private Room current;
  private static List<String> commands;
  public Game() {
    rooms.add(new Room("Зал"));
    rooms.add(new Room("Кухня"));
    rooms.add(new Room("Туалет"));
    rooms.add(new Room("Коридор"));
    // здесь будут комнаты
  }

  public void start() {
    // здесь будет герой
    mainCycle();//запускаем основной игровой цикл

  }

  public void mainCycle() {
    // основной игровой цикл
    boolean playing = true;
    while (playing) {
      help();
    }
  }
}
