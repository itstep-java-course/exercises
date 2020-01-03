package com.itstep.collections.hashset.likhomanov_homework;

public enum Cars implements Sortable<String> {

    CAR_1("524863", "Volkswagen Caddy", "2015", "White", "Minivan"),
    CAR_2("322486", "Renault Kangoo", "2015", "White", "Minivan"),
    CAR_3("947732", "Hyundai Santa FE", "2007", "Silver", "SUV"),
    CAR_4("843115", "Mazda 6", "2004", "Red", "Sedan"),
    CAR_5("200161", "Volkswagen Passat B8 TDI", "2015", "White", "Sedan"),

    CAR_6("330049", "Volvo V50", "2009", "Black", "Sedan"),
    CAR_7("726881", "Renault Megane", "2014", "Blue", "Coupe"),
    CAR_8("951234", "Ford Focus", "2009", "Black", "Sedan"),
    CAR_9("324557", "BMW X5", "2011", "Gray", "SUV"),
    CAR_10("174433", "BMW 530 AC", "2001", "Black", "Coupe"),

    CAR_11("772001", "Mitsubishi Grandis", "2006", "Gray", "Coupe"),
    CAR_12("541002", "Nissan Juke 1.6 AT", "2019", "Red", "SUV"),
    CAR_13("852134", "INFINITY FX 35", "2007", "Black", "SUV"),
    CAR_14("154423", "MAZDA CX-5", "2019", "Blue", "SUV"),
    CAR_15("384519", "ALFA ROMEO Stelvio", "2019", "White", "SUV"),

    CAR_16("208024", "MITSUBISHI Outlander", "2007", "Gray", "SUV"),
    CAR_17("371106", "FORD Fusion", "2014", "Orange", "Sedan"),
    CAR_18("532288", "ВАЗ 2115", "2011", "Green", "Sedan"),
    CAR_19("911733", "SKODA Fabia", "2006", "Red", "Sedan"),
    CAR_20("109442", "KIA Ceed", "2019", "Blue", "Coupe");

    private final String vin;
    private final String model;
    private final String year;
    private final String colour;
    private final String type;

    Cars(String vin, String model, String year, String colour, String type) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.type = type;
    }

    public String getVin() {
        return "vin: " + vin;
    }

    public String getModel() {
        return "model: " + model;
    }

    public String getYear() {
        return "year: " + year;
    }

    public String getColour() {
        return "colour: " + colour;
    }

    public String getType() {
        return "type: " + type;
    }

    @Override
    public boolean findMatch(String param) {
        return vin.equalsIgnoreCase(param) || model.equalsIgnoreCase(param) ||
                year.equalsIgnoreCase(param) || colour.equalsIgnoreCase(param) ||
                type.equalsIgnoreCase(param);
    }

    @Override
    public String toString() {
        return model + "-" + vin + "-" + colour + "-" + type + "-" + year;
    }
}
