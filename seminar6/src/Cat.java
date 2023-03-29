import java.lang.Object;
import java.util.Objects;

public class Cat {
    private Float weight;
    private int height;
    private int age;
    private String name;
    private String owner;
    private String sex;

    public int getAge() {
        return age;

    }

    public String getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public Float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setConstr(int age, Float weight, String owner, String name, int height, String sex) {
        this.age = age;
        this.weight = weight;
        this.owner = owner;
        this.name = name;
        this.height = height;
        this.sex = sex;

    }

    @Override
    public String toString() {

        return "\n Владелец: " + owner + " Кот: " + name + " пол: " + sex + " вес: " + weight + " высота: " + height
                + " Возраст: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cat cat =(Cat) o;
     
        return Objects.equals(name, cat.name) && Objects.equals(owner, cat.owner) && Objects.equals(sex, cat.sex)
                && Objects.equals(age, cat.age) && Objects.equals(weight, cat.weight)
                 && Objects.equals(height, cat.height);

    }
    @Override
    public int hashCode() {
        return Objects.hash(name,owner,sex,age,weight,height);
    }
}
