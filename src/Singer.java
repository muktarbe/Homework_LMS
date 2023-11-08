public class Singer extends Person {
    private String band_name;

    public Singer(String name, String designation,String band_name) {
        super(name, designation);
        this.band_name = band_name;
    }

    public String getBand_name() {
        return band_name;
    }

    public void setBand_name(String band_name) {
        this.band_name = band_name;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(" пениие!");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" вакал!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" плоф!");
    }

    public void singing(){
        System.out.println("Народные песнии!");
    }
    public void playGuitar(){
    System.out.println("Я умею играть на гитаре!");
    }

    @Override
    public String toString() {
        return "Singer " +
                "band name = " + band_name + super.toString();
    }
}
