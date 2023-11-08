public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Programmer programmer = new Programmer("Залкар","aa","The Globe");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("==========================="+"\n");
        Dancer dancer = new Dancer("Элиза","bb","BTS");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("==========================="+"\n");
        Singer singer = new Singer("Тунук","cc","ll");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
    }
}
