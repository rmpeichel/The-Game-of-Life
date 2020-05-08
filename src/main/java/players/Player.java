package players;

import components.CareerCards;
import components.HouseCards;
import components.LifeTile;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name = "";
    private int money;
    private final List<LifeTile> lifeTiles = new ArrayList<>();
    private int childCount;
    private boolean isMarried;
    private CareerCards careerCard;
    private boolean hasCollegeDegree;
    private boolean isRetired;
    private HouseCards houseCard;
    private String retireeHome;
    private int loans;
    private int salary;
    private boolean missTurn;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int addMoney(int amount) {
        money += amount;
        return money;
    }

    public int substractMoney(int amount) {
        money -= amount;
        while(money < 0) {
            getLoan();
        }
        return money;
    }

    public int getLoan() {
        loans++;
        money += 5000;
        return money;
    }

    public int getNumLifeTiles() {
        return lifeTiles.size();
    }

    public void addLifeTile(LifeTile lifeTile) {
        lifeTiles.add(lifeTile);
    }

    public LifeTile subLifeTile() {
        if(lifeTiles.isEmpty()) {
            return null;
        }
        return lifeTiles.remove(0);
    }

    public int getChildCount() {
        return childCount;
    }

    public CareerCards getCareer() {
        return careerCard;
    }

    public HouseCards getHouse() {
        return houseCard;
    }

    public int getLoans() {
        return loans;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCareer(CareerCards careerCard) {
        this.careerCard = careerCard;
        if(this.careerCard != null) {
            this.salary = careerCard.getbaseSalary();
        }
    }

    public int addPayRaise(int amount) {
        salary += amount;
        if(salary > careerCard.getMaxSalary()) {
            salary = careerCard.getMaxSalary();
        }
        careerCard.taxes();
        return salary;
    }

    public void setHouse(HouseCards houseCard) {
        this.houseCard = houseCard;
    }

    public void setLoans(int loans) {
        this.loans = loans;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public int getSalary() {
        return salary;
    }

    public String getCareerName() {
        if(careerCard == null) {
            return "No Career";
        }
        return careerCard.getDescription();
    }

    public String getHouseName() {
        if(houseCard == null) {
            return "No House";
        }
        return houseCard.getDescription();
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

    public String getRetireeHome() {
        return retireeHome;
    }

    public void setRetireeHome(String retireeHome) {
        this.retireeHome = retireeHome;
    }



}
