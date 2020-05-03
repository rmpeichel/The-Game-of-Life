package components;

public class HouseCards extends Cards {

    public static final String BUNGALOW = "BUNGALOW";
    public static final String CASTLE = "CASTLE";
    public static final String COTTAGE = "COTTAGE";
    public static final String APARTMENT = "APARTMENT";
    public static final String TOWNHOUSE = "TOWNHOUSE";
    public static final String RANCH_STYLE_HOUSE = "RANCH-STYLE HOUSE";
    public static final String TREEHOUSE = "TREEHOUSE";
    public static final String IGLOO = "IGLOO";
    public static final String HUT = "HUT";
    public static final String LOG_CABIN = "LOG CABIN";
    public static final String TERRACED_HOUSE = "TERRACED HOUSE";
    public static final String MOBILE_HOME = "MOBILE HOME";
    public static final String TENT = "TENT";
    public static final String HOUSEBOAT = "HOUSEBOAT";
    public static final String YURT = "YURT";
    public static final String DUPLEX = "DUPLEX";
    public static final String CONDOMINIUM = "CONDOMINIUM";
    public static final String MANSION = "MANSION";
    public static final String PALACE = "PALACE";
    public static final String FARMHOUSE = "FARMHOUSE";
    public static final String SPLIT_LEVEL_HOME = "SPLIT-LEVEL HOME";
    public static final String RV = "RV";
    public static final String HOUSE = "HOUSE";
    public static final String CHALET = "CHALET";
    public static final String CAVE = "CAVE";
    public static final String MANOR_HOUSE = "MANOR HOUSE";
    public static final String HOTEL = "HOTEL";
    public static final String DORMITORY = "DORMITORY";
    public static final String SHACK = "SHACK";

    public enum HouseType {
        TYPE_BUNGALOW, TYPE_CASTLE, TYPE_COTTAGE, TYPE_APARTMENT, TYPE_TOWNHOUSE, TYPE_RANCH_STYLE_HOUSE, TYPE_TREEHOUSE, TYPE_IGLOO, TYPE_HUT, TYPE_LOG_CABIN,
        TYPE_TERRACED_HOUSE, TYPE_MOBILE_HOME, TYPE_TENT, TYPE_HOUSEBOAT, TYPE_YURT, TYPE_DUPLEX, TYPE_CONDOMINIUM, TYPE_MANSION, TYPE_PALACE, TYPE_FARMHOUSE,
        TYPE_SPLIT_LEVEL_HOME, TYPE_RV, TYPE_HOUSE, TYPE_CHALET, TYPE_CAVE, TYPE_MANOR_HOUSE, TYPE_HOTEL, TYPE_DORMITORY, TYPE_SHACK
    };

    private int value;
    private int sellPrice;
    private HouseType houseType;

    public HouseCards(CardType cardType, HouseType houseType, int value, int sellPrice) {

        this.cardType = cardType;
        this.houseType = houseType;
        this.value = value;
        this.sellPrice = sellPrice;

        switch(houseType) {
            case TYPE_BUNGALOW:
                title = BUNGALOW;
                break;
            case TYPE_CASTLE:
                title = CASTLE;
                break;
            case TYPE_COTTAGE:
                title = COTTAGE;
                break;
            case TYPE_APARTMENT:
                title = APARTMENT;
                break;
            case TYPE_TOWNHOUSE:
                title = TOWNHOUSE;
                break;
            case TYPE_RANCH_STYLE_HOUSE:
                title = RANCH_STYLE_HOUSE;
                break;
            case TYPE_TREEHOUSE:
                title = TREEHOUSE;
                break;
            case TYPE_IGLOO:
                title = IGLOO;
                break;
            case TYPE_HUT:
                title = HUT;
                break;
            case TYPE_LOG_CABIN:
                title = LOG_CABIN;
                break;
            case TYPE_TERRACED_HOUSE:
                title = TERRACED_HOUSE;
                break;
            case TYPE_MOBILE_HOME:
                title = MOBILE_HOME;
                break;
            case TYPE_TENT:
                title = TENT;
                break;
            case TYPE_HOUSEBOAT:
                title = HOUSEBOAT;
                break;
            case TYPE_YURT:
                title = YURT;
                break;
            case TYPE_DUPLEX:
                title = DUPLEX;
                break;
            case TYPE_CONDOMINIUM:
                title = CONDOMINIUM;
                break;
            case TYPE_MANSION:
                title = MANSION;
                break;
            case TYPE_PALACE:
                title = PALACE;
                break;
            case TYPE_FARMHOUSE:
                title = FARMHOUSE;
                break;
            case TYPE_SPLIT_LEVEL_HOME:
                title = SPLIT_LEVEL_HOME;
                break;
            case TYPE_RV:
                title = RV;
                break;
            case TYPE_HOUSE:
                title = HOUSE;
                break;
            case TYPE_CHALET:
                title = CHALET;
                break;
            case TYPE_CAVE:
                title = CAVE;
                break;
            case TYPE_MANOR_HOUSE:
                title = MANOR_HOUSE;
                break;
            case TYPE_HOTEL:
                title = HOTEL;
                break;
            case TYPE_DORMITORY:
                title = DORMITORY;
                break;
            case TYPE_SHACK:
                title = SHACK;
                break;
        }
        description = title;
    }

    public int getValue() {
        return value;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public HouseType getHouseType() {
        return houseType;
    }
 }
