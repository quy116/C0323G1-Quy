package ss8_clean_code;

public class EmloyeeDetails {
    private String name;
    private String age;
    private String awards;
    private String ctc;
    private String experience;

    public EmloyeeDetails() {
    }

    public EmloyeeDetails(String name, String age, String awards, String ctc, String experience) {
        this.name = name;
        this.age = age;
        this.awards = awards;
        this.ctc = ctc;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getCtc() {
        return ctc;
    }

    public void setCtc(String ctc) {
        this.ctc = ctc;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "EmloyeeDetails{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", awards='" + awards + '\'' +
                ", ctc='" + ctc + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
