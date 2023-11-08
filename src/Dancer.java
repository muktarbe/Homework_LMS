public class Dancer extends Person{
    private String group_name;
    public Dancer(String name, String designation,String group_name) {
        super(name, designation);
        this.group_name = group_name;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" тансора!");
    }


    @Override
    public void learn() {
        super.learn();
        System.out.println(" тансора!");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println(" шашлык!");
    }

    public void dancing(){
        System.out.println("Вольная танца");
    }

    @Override
    public String toString() {
        return "Dancer " +
                "group name = " + group_name + super.toString();
    }
}
