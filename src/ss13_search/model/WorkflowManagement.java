package ss13_search.model;

public class WorkflowManagement {
    private String code;
    private String name;
    private String day;
    private String money;
    private String comment;

    public WorkflowManagement() {
    }

    public WorkflowManagement(String code, String name, String day, String money, String comment) {
        this.code = code;
        this.name = name;
        this.day = day;
        this.money = money;
        this.comment = comment;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "workflowManagement{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", money='" + money + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
