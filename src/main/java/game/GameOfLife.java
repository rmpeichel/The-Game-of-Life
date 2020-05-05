package game;

import components.Cards;
import components.CareerCards;
import components.HouseCards;
import components.LifeTile;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    private List<CareerCards> careerCard = new ArrayList<>();
    private List<CareerCards> careerCollegeDegree = new ArrayList();

    private List<HouseCards> homes = new ArrayList<>();
    private List<LifeTile> lifeTiles = new ArrayList<>();

    public GameOfLife() {
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_EXTRA, 36500, 67525));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_UNDERSTUDY, 96700, 142100));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_STAGE_ACTOR, 61900, 105700));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TV_ACTOR, 220000, 425000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_ACTOR, 350000, 620000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_DIRECTOR, 530000, 750000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MOVIE_PRODUCER, 850000, 1050000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COMIC_BOOK_STORE_CLERK, 20800, 31200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ART_STORE_SALESPERSON, 41600, 62400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CARTOONIST, 48000, 96000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COMIC_BOOK_ARTIST, 28000, 55000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_DESIGN_INTERN, 27100, 35400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PRODUCTION_ARTIST, 33300, 43700));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_BAGGAGE_HANDLER, 29200, 35400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FLIGHT_ATTENDANT, 32000, 62000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_AIR_TRAFFIC_CONTROLLER, 84000, 146000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_NAIL_CARE_ARTIST, 25600, 34100));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_HAIRSTYLIST, 18600, 29200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COSMETOLOGIST, 22700, 38600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SALON_OWNER, 63500, 94000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MODEL, 52000, 86000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_INTERNATIONAL_MODEL, 210000, 525000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SUPERMODEL, 350000, 680000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TV_PRODUCTION_ASSISTANT, 34500, 48600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PHOTOJOURNALIST, 37500, 52000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TV_CAMERA_OPERATOR, 32000, 48000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_APPRENTICE, 27100, 39600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CONSTRUCTION_WORKER, 47900, 60400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FOREMAN, 56200, 68700));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LANDSCAPER, 25000, 37500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_GENERAL_CONTRACTOR, 66600, 108200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEB_DESIGNER, 42400, 67500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEB_DEVELOPER, 53700, 84200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COMPUTER_REPAIR_SPECIALIST, 51800, 72300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEBSITE_HOST, 61300, 75000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MAILROOM_CLERK, 31200, 45760));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ADMINSTRATIVE_ASSISTANT, 27100, 47900));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MORGUE_ATTENDANT, 36300, 49500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_POLICE_OFFICER, 52600, 74300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MODEL_MAKER_INTERN, 24900, 33100));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_JUNIOR_PRODUCT_DESIGNER, 39700, 52400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TEACHING_ASSISTANT, 35000, 43500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SUBSTITUTE_TEACHER, 17500, 37500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FARMING_FIELD_HAND, 22800, 29100));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ENVIRONMENTAL_POLICE_OFFICER, 31200, 43700));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PARK_RANGER, 26400, 42900));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FARMER, 35100, 72300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CATTLE_RANCHER, 54300, 71500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CANDY_STRIPER, 62500, 84300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_OCCUPATIONAL_THERAPIST, 72800, 106000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_BUSBOY, 16700, 25000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WAITRESS, 35300, 45800));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_HOSTESS, 22900, 31200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LINE_COOK, 27000, 35300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_RESTAURANT_MANAGER, 37500, 68200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_NEWSPAPER_INTERN, 24900, 37400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_AD_OBITUARY_WRITER, 28500, 42000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PRIVATE, 20400, 28000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SERGEANT, 24500, 38200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LIEUTENANT, 40600, 50600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CHIEF_GENERAL, 86000, 102000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_STRAWBERRY_PICKER, 16800, 24600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_NANNY, 21600, 32600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CLOWN, 15500, 22300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEDDING_EVENT_PLANNER, 41900,53600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_INTERNATIONL_TRANSLATOR, 57400, 73200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_TELEVISION_MINISTER, 54300, 68500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SALESCLERK, 19500, 28600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PERSONAL_SHOPPER, 24800, 37600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SALES_MANAGER, 58600, 75300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FASHION_STORE_BUYER, 43500, 62300));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FASHION_MAGAZINE_CRITIC, 92600, 117500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_MUSIC_STORE_CLERK, 20600, 32400));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_VOICE_AND_MUSIC_TEACHER, 44700, 61200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_WEDDING_SINGER, 31200, 46800));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SOLO_ARTIST, 36500, 53200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SUPERSTAR, 165000, 350000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_LAB_ASSISTANT, 37100, 53600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ARTIFACT_RESEARCHER, 61200, 86500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SAFARI_GUIDE, 25400, 39500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_INTERNATIONAL_TREASURE_HUNTER, 175000, 465000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CAR_WASH_ATTENDANT, 20800, 27100));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_CONVENIENCE_STORE_CLERK, 21800, 30200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_ONLINE_AUCTIONEER, 43800, 64000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PIZZA_RESTAURANT_OWNER, 61300, 84200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_REAL_ESTATE_AGENT, 42900, 68200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_FINE_ART_GALLERY_OWNER, 55600, 108200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_AMATEUR_ATHLETE, 18500, 29600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_HIGH_SCHOOL_COACH, 55100, 86500));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PRO_BENCHWARMER, 21000, 36000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PRO_STARTING_ATHLETE, 120500, 263000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COACH, 150000, 300000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_GENERAL_MANAGER, 200000, 400000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SPORTS_SUPERSTAR, 300000, 600000));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_PROOFREADER, 46900, 68200));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_COPYWRITER, 39500, 59600));
        careerCard.add(new CareerCards(Cards.CardType.CAREER, CareerCards.CareerType.TYPE_SUCCESSFUL_NOVELIST, 95200, 192000));

        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_THREE_D_ANIMATOR, 67300, 95200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SPECIAL_EFFECTS_ARTIST, 78200, 104300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ANIMATION_STUDIO_HEAD, 62500, 98400));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_GRAPHIC_DESIGNER, 52500, 76300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INTERIOR_DESIGNER, 38300, 70900));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_AUTOMOTIVE_DESIGNER, 58000, 95000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_LEAD_FASHION_DESIGNER, 65000, 110000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_DESIGN_CONSULTANT, 48500, 68000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NAVIGATOR, 51300, 68400));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_HELICOPTER_PILOT, 74200, 113600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_COMMERCIAL_AIRLINE_PILOT, 106500, 215000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_AIRLINE_EXECUTIVE, 525000, 942000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_RADIO_DJ, 51600, 76200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NATIONAL_TV_DIRECTOR, 58300, 87400));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TELEVISION_PRODUCER, 65000, 99000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NATIONAL_NEWS_ANCHOR, 85900, 118200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PROJECT_MANAGER, 93600, 136100));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_WORLD_RENOWN_ARCHITECT, 160000, 365000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VIDEO_GAME_DESIGNER, 67200, 96500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INTERNET_GURU, 72300, 92500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VIDEO_GAME_PRODUCER, 87600, 112300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MANAGER, 91300, 121500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_DIRECTOR, 96200, 135700));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VICE_PRESIDENT, 125300, 219200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SENIOR_VICE_PRESIDENT, 156600, 294000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_CEO, 250000, 500000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_HOMELAND_SECURITY_AGENT, 62400, 84300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PROSECUTOR, 53500, 76200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ATTORNEY_GENERAL, 72800, 95300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SUPREME_COURT_JUSTICE, 185600, 258600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SENIOR_PRODUCT_DESIGNER, 53400, 76300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PRINCIPAL_PRODUCT_DESIGNER, 106300, 175600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_HEAD_DESIGN_CONSULTANT, 65000, 85000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INVENTOR, 56000, 155000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TEACHER, 38200, 53000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_VICE_PRINCIPAL, 53900, 76500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PRINCIPAL, 83600, 114300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SUPERINTENDENT, 82100, 122300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_COLLEGE_PROFESSOR, 56000, 84000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_EPA_SCIENTIST, 83500, 147000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_THOROUGHBRED_RACEHORSE_BREEDER, 52000, 96000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NURSE, 58400, 88200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_GENERAL_PRACTITIONER, 79500, 135000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_PEDIATRICION, 116000, 246000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SURGEON, 142000, 286000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NEUROSURGEON, 295000, 562000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_EXECUTIVE_CHEF, 51000, 92300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TV_COOKING_SHOW_PERSONALITY, 76200, 96800));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_REPORTER, 44900, 74300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_FEATURE_WRITER, 31200, 52000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MANAGING_EDITOR, 47500, 81600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NEWSPAPER_MAGNATE, 62000, 76000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_NONFICTION_BEST_SELLING_AUTHOR, 250000, 750000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_CAPTAIN, 51800, 62500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MAJOR, 59000, 67500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_COLONEL, 65200, 73600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_FASHION_DESIGNER, 53200, 76300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_FASHION_DESIGN_SUPERSTAR, 75300, 103500));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ARCHEOLOGY_TEACHER_ASSISTANT,41900, 58300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ARCHEOLOGY_PROFESSOR, 64200, 98300));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_ARCHEOLOGIST, 71500, 95600));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_INVESTMENT_BROKER, 57500, 94200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_MAGAZINE_EDITOR, 48600, 81200));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_CREATIVE_DIRECTOR, 85200, 160000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_TV_WRITER, 120000, 160000));
        careerCollegeDegree.add(new CareerCards(Cards.CardType.COLLEGE_DEGREE_REQUIRED, CareerCards.CareerType.TYPE_SCREENWRITER, 85600, 123000));

        for(int i = 0; i < careerCard.size(); i++) {
            careerCard.get(i).taxes();
        }
        for(int j = 0; j < careerCollegeDegree.size(); j++) {
            careerCollegeDegree.get(j).taxes();
        }

        for(int k = 0; k < 32; k++) {
            lifeTiles.add(new LifeTile(5000));
        }
        for(int l = 0; l < 32; l++) {
            lifeTiles.add(new LifeTile(8000));
        }
        for(int m = 0; m < 20; m++) {
            lifeTiles.add(new LifeTile(10000));
        }
        for(int n = 0; n < 14; n++) {
            lifeTiles.add(new LifeTile(12000));
        }
        for(int o = 0; o < 10; o++) {
            lifeTiles.add(new LifeTile(15000));
        }
        for(int p = 0; p < 8; p++) {
            lifeTiles.add(new LifeTile(18000));
        }
        for(int q = 0; q < 4; q++) {
            lifeTiles.add(new LifeTile(20000));
        }
        for(int r = 0; r < 2; r++) {
            lifeTiles.add(new LifeTile(20000));
        }



    }
}
