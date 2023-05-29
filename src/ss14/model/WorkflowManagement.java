package ss14.model;

import java.io.Serializable;

public class WorkflowManagement implements Serializable {
    private String code;
    private String name;
    private String day;
    private Double money;
    private String comment;

    public WorkflowManagement() {
    }

    public WorkflowManagement(String code, String name, String day, Double money, String comment) {
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
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
    public String getToInfoCsv(){
        return this.code + "," + this.name + "," + this.day + "," +this.money + ","+ this.comment;
    }

}
