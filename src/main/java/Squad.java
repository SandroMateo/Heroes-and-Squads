import java.util.List;
import java.util.ArrayList;

public class Squad {
  private int mSize;
  private String mName;
  private String mPassion;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeroes;

  public Squad(String name, String passion) {
    mSize = 4;
    mName = name;
    mPassion = passion;
    instances.add(this);
    mId = instances.size();
    mHeroes = new ArrayList<Hero>();
  }

  public int getSize(){
    return mSize;
  }

  public String getName(){
    return mName;
  }

  public String getPassion(){
    return mPassion;
  }

  public int getId() {
    return mId;
  }

  public List<Hero> getHeroes() {
    return mHeroes;
  }

  public static void clear() {
    instances.clear();
  }

  public static List<Squad> all() {
    return instances;
  }

  public static Squad find(int id) {
    return instances.get(id - 1);
  }

  public void addHero(Hero hero) {
    mHeroes.add(hero);
  }
}
