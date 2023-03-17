import quest.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("=== quest ===");

    System.out.println("name");
    String name = br.readLine();
    Hero mainHero = new Hero(name);

    Room mainRoom = new Room("Главный зал");
    /*
     будет класс Game() - основной класс, еотороый сможет

    запускаться
    завершаться
    хранить карту с комнатами
    хранитьь персоонажей
    уметь спрашивать команды в своём основном игровом цикле

     */

  }
}
