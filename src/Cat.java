/**
 * Created by erikrudie on 8/23/16.
 */
public class Cat implements Pet {

  @Override
  public void feedPet() {
    System.out.println("You feed your cat.  He tolerates you");
  }

  @Override
  public void groomPet() {
    System.out.println("You groom your cat.  He tolerates you");

  }

  @Override
  public void playWithPet() {
    System.out.println("You play with your cat.  He tolerates you");

  }
}
