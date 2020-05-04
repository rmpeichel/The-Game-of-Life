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
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CARTOONIST, 48000, 96000, 3840));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COMIC_BOOK_ARTIST, 28000, 55000, 2240));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_DESIGN_INTERN, 27100, 35400, 2168));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PRODUCTION_ARTIST, 33300, 43700, 2664));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_BAGGAGE_HANDLER, 29200, 35400, 2236));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FLIGHT_ATTENDANT, 32000, 62000, 2560));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_AIR_TRAFFIC_CONTROLLER, 84000, 146000, 6720));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_NAIL_CARE_ARTIST, 25600, 34100, 2048));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_HAIRSTYLIST, 18600, 29200, 1488));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COSMETOLOGIST, 22700, 38600, 1816));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SALON_OWNER, 63500, 94000, 5080));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MODEL, 52000, 86000, 4160));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_INTERNATIONAL_MODEL, 210000, 525000, 16800));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SUPERMODEL, 350000, 680000, 28000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TV_PRODUCTION_ASSISTANT, 34500, 48600, 2760));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PHOTOJOURNALIST, 37500, 52000, 3000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TV_CAMERA_OPERATOR, 32000, 48000, 2560));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_APPRENTICE, 27100, 39600, 2168));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CONSTRUCTION_WORKER, 47900, 60400, 3832));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FOREMAN, 56200, 68700, 4496));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LANDSCAPER, 25000, 37500, 2000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_GENERAL_CONTRACTOR, 66600, 108200, 5328));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEB_DESIGNER, 42400, 67500, 3392));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEB_DEVELOPER, 53700, 84200, 4296));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COMPUTER_REPAIR_SPECIALIST, 51800, 72300, 4144));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEBSITE_HOST, 61300, 75000, 4904));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MAILROOM_CLERK, 31200, 45760,2496));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ADMINSTRATIVE_ASSISTANT, 27100, 47900, 2168));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MORGUE_ATTENDANT, 36300, 49500, 2904));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_POLICE_OFFICER, 52600, 74300, 4208));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MODEL_MAKER_INTERN, 24900, 33100, 1992));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_JUNIOR_PRODUCT_DESIGNER, 39700, 52400, 3176));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TEACHING_ASSISTANT, 35000, 43500, 2800));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SUBSTITUTE_TEACHER, 17500, 37500, 1400));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FARMING_FIELD_HAND, 22800, 29100, 1824));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ENVIRONMENTAL_POLICE_OFFICER, 31200, 43700, 2496));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PARK_RANGER, 26400, 42900, 2112));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FARMER, 35100, 72300, 2808));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CATTLE_RANCHER, 54300, 71500, 4344));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CANDY_STRIPER, 62500, 84300, 5000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_OCCUPATIONAL_THERAPIST, 72800, 106000, 5824));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_BUSBOY, 16700, 25000, 1336));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WAITRESS, 35300, 45800, 2824));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_HOSTESS, 22900, 31200, 1832));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LINE_COOK, 27000, 35300, 2160));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_RESTAURANT_MANAGER, 37500, 68200, 3000));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_NEWSPAPER_INTERN, 24900, 37400, 1992));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_AD_OBITUARY_WRITER, 28500, 42000, 2280));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PRIVATE, 20400, 28000, 1632));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SERGEANT, 24500, 38200, 1960));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LIEUTENANT, 40600, 50600, 3248));
        careerCards.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CHIEF_GENERAL, 86000, 102000, 6880));

        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_THREE_D_ANIMATOR, 67300, 95200, 5384));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SPECIAL_EFFECTS_ARTIST, 78200, 104300, 6256));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ANIMATION_STUDIO_HEAD, 62500, 98400, 5000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_GRAPHIC_DESIGNER, 52500, 76300, 4200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INTERIOR_DESIGNER, 38300, 70900, 3064));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_AUTOMOTIVE_DESIGNER, 58000, 95000, 4640));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_LEAD_FASHION_DESIGNER, 65000, 110000, 5200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_DESIGN_CONSULTANT, 48500, 68000, 3840));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NAVIGATOR, 51300, 68400, 4104));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_HELICOPTER_PILOT, 74200, 113600, 5936));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_COMMERCIAL_AIRLINE_PILOT, 106500, 215000, 8520));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_AIRLINE_EXECUTIVE, 525000, 942000, 42000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_RADIO_DJ, 51600, 76200, 4128));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NATIONAL_TV_DIRECTOR, 58300, 87400, 4304));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TELEVISION_PRODUCER, 65000, 99000, 5200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NATIONAL_NEWS_ANCHOR, 85900, 118200, 6872));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PROJECT_MANAGER, 93600, 136100, 7488));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_WORLD_RENOWN_ARCHITECT, 160000, 365000, 12800));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VIDEO_GAME_DESIGNER, 67200, 96500, 5376));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INTERNET_GURU, 72300, 92500, 5784));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VIDEO_GAME_PRODUCER, 87600, 112300, 7008));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MANAGER, 91300, 121500, 7304));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_DIRECTOR, 96200, 135700, 7696));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VICE_PRESIDENT, 125300, 219200, 10024));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SENIOR_VICE_PRESIDENT, 156600, 294000, 12528));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_CEO, 250000, 500000, 20000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_HOMELAND_SECURITY_AGENT, 62400, 84300, 4992));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PROSECUTOR, 53500, 76200, 4280));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ATTORNEY_GENERAL, 72800, 95300, 5824));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SUPREME_COURT_JUSTICE, 185600, 258600, 14848));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SENIOR_PRODUCT_DESIGNER, 53400, 76300, 4272));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PRINCIPAL_PRODUCT_DESIGNER, 106300, 175600, 8504));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_HEAD_DESIGN_CONSULTANT, 65000, 85000, 5200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INVENTOR, 56000, 155000, 4480));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TEACHER, 38200, 53000, 3056));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VICE_PRINCIPAL, 53900, 76500, 4312));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PRINCIPAL, 83600, 114300, 6688));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SUPERINTENDENT, 82100, 122300, 6568));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_COLLEGE_PROFESSOR, 56000, 84000, 4480));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_EPA_SCIENTIST, 83500, 147000, 6680));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_THOROUGHBRED_RACEHORSE_BREEDER, 52000, 96000, 4160));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NURSE, 58400, 88200, 4672));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_GENERAL_PRACTITIONER, 79500, 135000, 6360));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PEDIATRICION, 116000, 246000, 9280));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SURGEON, 142000, 286000, 11200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NEUROSURGEON, 295000, 562000, 23600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_EXECUTIVE_CHEF, 51000, 92300, 4080));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TV_COOKING_SHOW_PERSONALITY, 76200, 96800, 6096));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_REPORTER, 44900, 74300, 3592));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_FEATURE_WRITER, 31200, 52000, 2496));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MANAGING_EDITOR, 47500, 81600, 3800));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NEWSPAPER_MAGNATE, 62000, 76000, 4960));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NONFICTION_BEST_SELLING_AUTHOR, 250000, 750000, 20000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_CAPTAIN, 51800, 62500, 4144));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MAJOR, 59000, 67500, 4720));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_COLONEL, 65200, 73600, 5216));





    }
}
