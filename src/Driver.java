import java.util.ArrayList;
import java.util.List;

public class Driver {

  public static void main(String[] args) {
		//Create households and add to list or array
		
		//iterate through list or array and perform required actions

    List<Household> households = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      if (Math.random() > .5) {
        int income = (int) (Math.random() * 10000);
        households.add(new RichHouse(income));
      } else {
        int income = (int) (Math.random() * 1200);
        households.add(new PoorHouse(income));
      }
    }

    for (int i = 0; i < 5; i++) {
      doStuff(households);
    }

	}

  public static void doStuff(List<Household> households) {
    for (Household house : households) {
      house.gainIncome();
      house.careForPet();
    }
  }

}
