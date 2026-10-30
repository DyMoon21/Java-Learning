public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.age = 30;
        System.out.println(p.name);
        System.out.println(p.age);
        p.speak();
        p.eat();
    }
}
