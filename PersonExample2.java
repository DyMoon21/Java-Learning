public class PersonExample2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "关羽";
        fun(person);
        System.out.println(person.name);
    }
//引用传递
    public static void fun(Person person) {
        person.name = "张飞";
        System.out.println(person.name);
    }
}
