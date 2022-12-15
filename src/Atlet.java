public class Atlet extends Person {
    public String skill;
    public Integer atletId;

    public Atlet(Integer id, String name, String gender, String address, int age, String skill, Integer atletId) {
        super(id, name, gender, address, age);
        this.skill = skill;
        this.atletId = atletId;
    }
}

