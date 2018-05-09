package lab7;

public class studentApp {

    public static void main(String[] args) {
        Studen s = new Studen();
        s.setName ("Mit");
        s.setAge(22);
        s.setGender("Male");
        s.setHeight(180);
        System.out.print(s.toString());
        Studen s2 = new Studen("safe",90,"Famale",190);
        System .out.print(s2.toString());
    }
}
