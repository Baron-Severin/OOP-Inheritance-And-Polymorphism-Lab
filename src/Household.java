public abstract class Household {

  int money;
  int income;
  Pet pet;

  public void gainIncome() {
    int netIncome = this.payTaxes(this.income);
    this.money += netIncome;
    System.out.println("Gained: " + netIncome);
    System.out.println("Total: " + this.money);
  }

	public int payTaxes(int income) {
    return (int) (income * .8);
  }

  public void getPet() {
    if (Math.random() > .5) {
      this.pet = new Dog();
    } else {
      this.pet = new Cat();
    }
  }

  public void careForPet() {
    this.pet.feedPet();
    this.pet.groomPet();
    this.pet.playWithPet();
  }

}
