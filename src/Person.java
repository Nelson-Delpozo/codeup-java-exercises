public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + getName());
    }

    public static void main(String[] args) {
        Person person = new Person("Fred");
//        person.setName("Fred");
        person.sayHello();

        Person person1 = new Person("Person1");
//        person1.setName("Person1");
        Person person2 = new Person("Person2");
//        person2.setName("Person1");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("Jojo");
//        person3.setName("Jojo");
        Person person4 = person3;
        System.out.println(person3 == person4);

        Person person5 = new Person("Guy");
//        person5.setName("Guy");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }
}

