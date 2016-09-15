import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  private Hero firstHero;
  private Hero secondHero;

  @Before
  public void initialize() {
    Hero.clear();
    firstHero = new Hero("Rejem", 24, "super smart", "caves");
    secondHero = new Hero("Dronas", 23, "super strong", "plains");
  }

  @Test
  public void Hero_instantiate_true() {
    assertTrue(firstHero instanceof Hero);
  }

  @Test
  public void getName_returnsName_String() {
    assertEquals("Rejem", firstHero.getName());
  }

  @Test
  public void getAge_returnsAge_int() {
    assertEquals(24, firstHero.getAge());
  }

  @Test
  public void getPower_returnsPower_String() {
    assertEquals("super smart", firstHero.getPower());
  }

  @Test
  public void getWeakness_returnsWeakness_String() {
    assertEquals("caves", firstHero.getWeakness());
  }

  @Test
  public void all_returnsHeroList_true() {
    assertTrue(Hero.all().contains(firstHero));
    assertTrue(Hero.all().contains(secondHero));
  }

  @Test
  public void getId_returnsId_int() {
    assertEquals(1, firstHero.getId());
  }

  @Test
  public void find_returnsWantedHero_Hero() {
    assertEquals(secondHero, Hero.find(secondHero.getId()));
  }

  @Test
  public void all_instancesListClearsCorrectly_0(){
    Hero.clear();
    assertEquals(0, Hero.all().size());
  }

}
