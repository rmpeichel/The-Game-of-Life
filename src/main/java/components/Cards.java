package components;

public class Cards {
    String description = "";
    String title = "";

    public enum CardType {
        CAREER, COLLEGE_CAREER
    };
    CardType cardType;

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String toString() {
        return "Card Description: " + getDescription() + "\n" + "Title: " + getTitle() + "\n" + "Type: " + getCardType();
    }
}
