package quest;

import java.io.BufferedReader;
import java.io.IOException;
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

    commands.add("Вперёд", Command.FORWARD);
    commands.add("Назад", Command.BACK);
    commands.add("Влево", Command.LEFT);
    commands.add("Вправо", Command.RIGHT);
    commands.add("Выход", Command.EXIT);
    commands.add("Справка", Command.HELP);
    // здесь будут комнаты
  }

  public void start() {
    // здесь будет герой
    mainCycle();//запускаем основной игровой цикл

  }

  private Command readCommand(BufferedReader br) throws IOException {
    System.out.println("Введите команду: ");
    String command = br.readLine();
    while (!commands.containsKey(command)) {
      System.out.println();
    }
  }

  public void mainCycle() {
    // основной игровой цикл
    boolean playing = true;
    while (playing) {
      help();
      Command command = readCommand();
      switc (command) {
        case FORWARD -> System.out.println("Вы шагнули вперёд");
        case BACK -> System.out.println("Вы шагнули назад");
        case LEFT -> System.out.println("Вы шагнули влево");
        case RIGHT -> System.out.println("Вы шагнули вправо");
        case EXIT -> {
          System.out.println("До свиданья!");
          System.out.println("Герой по имени %S сделал $d шагов %n".mainHero)

          playing = false;
        }
      }
      }
    }
  }
  public void help() {
    System.out.println("Возможные команды");
    for(int i=0; i < (commands.size();++i) {
      System.out.println();
    }
  }
}
