import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {
  private Squad firstSquad;

  @Before
  public void initialize() {
    Squad.clear();
    firstSquad = new Squad("WinDuo","raising awareness about windowWashing");
  }

  @Test
  public void Squad_instantiatesCorrectly_true() {
    assertTrue(firstSquad instanceof Squad);
  }

  @Test
  public void Squad_getSize_int(){
    assertEquals(4, firstSquad.getSize());
  }

  @Test
  public void Squad_getName_String(){
    assertEquals("WinDuo", firstSquad.getName());
  }

  @Test
  public void Squad_getPassion_String(){
    assertEquals("raising awareness about windowWashing", firstSquad.getPassion());
  }

  @Test
  public void Squad_instancesListClearsCorrectly_0(){
    Squad.clear();
    assertEquals(0, Squad.all().size());
  }

  @Test
  public void Squad_allReturnsAll_true() {
    assertTrue(Squad.all().contains(firstSquad));
  }

  @Test
  public void Squad_findReturnsById_Squad() {
    assertEquals(Squad.find(firstSquad.getId()), firstSquad);
  }

}
