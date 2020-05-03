package game;

import components.Cards;
import components.CareerCards;
import components.HouseCards;
import components.LifeTile;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    private final List<Cards> careerCards = new ArrayList<>();
    private final List<Cards> careerCollegeDegree = new ArrayList();

    private final List<HouseCards> homes = new ArrayList<>();
    private final List<LifeTile> lifeTiles = new ArrayList<>();

    public GameOfLife() {
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_EXTRA, 36500, 67525, 2920));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_UNDERSTUDY, 96700, 142100, 7730));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_STAGE_ACTOR, 61900, 105700, 4950));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TV_ACTOR, 220000, 425000, 17600));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_ACTOR, 350000, 620000, 28000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_DIRECTOR, 530000, 750000, 42400));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_PRODUCER, 850000, 1050000, 68000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COMIC_BOOK_STORE_CLERK, 20800, 31200, 1664));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ART_STORE_SALESPERSON, 41600, 62400, 3328));

        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_THREE_D_ANIMATOR, 67300, 95200, 5384));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SPECIAL_EFFECTS_ARTIST, 78200, 104300, 6256));

    }
}
