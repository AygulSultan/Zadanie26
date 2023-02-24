public class Box <T,S> {

    private T name;
    private S age;


    public Box(T name,S age) {
        this.name = name;
        this.age=age;
    }

    public S getAge() {
        return age;
    }

    public void setAge(S age) {
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }


    public static <T > T method (T box){
        return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

