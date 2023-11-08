public class Programmer extends Person{
    private String company_name;

    public Programmer(String name, String designation,String company_name) {
        super(name, designation);
        this.company_name = company_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(" програмиста!");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" програмирование!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" торт!");
    }

    public void coding(){
        System.out.println("System.out.println(Hello java!);");
    }

    @Override
    public String toString() {
        return "Programmer " +
                "company name = " + company_name + super.toString();
    }
}
