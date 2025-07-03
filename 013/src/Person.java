public record Person(String name, int age) {

    public Person {

    }

    public String getInfo(){
        return "Name:" + name + "Age:" + age;
    }

}
