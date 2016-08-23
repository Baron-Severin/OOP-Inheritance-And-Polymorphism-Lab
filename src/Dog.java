/**
 * Created by erikrudie on 8/23/16.
 */
public class Dog implements Pet {


  @Override
  public void feedPet() {
    System.out.println("You feed your dog.  He loves you");
  }

  @Override
  public void groomPet() {
    System.out.println("You groom your dog.  He loves you");

  }

  @Override
  public void playWithPet() {
    System.out.println("You play with your dog.  He loves you");

  }
}
