public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();//malloc
        p1.name = "John";
        p2.name = "Sheldon";
        p1.age = 30;
        p1 = p2;
        p2.name = "Jack";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
