package Person;

import java.util.List;

public interface Swimable {

  void swim();

  public static <T extends Swimable> void start(List<T> humans) {
    for (Swimable human : humans) {
      human.swim();
    }
  }

    public static  void starter(List<? extends Swimable> humans) {
    for (Swimable human : humans) {
      human.swim();
    }
  }

}
