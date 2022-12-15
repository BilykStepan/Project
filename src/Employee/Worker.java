package Employee;

public abstract class Worker extends Person{
    private String position;
    private Double ratePerHour;
    private Integer workingParameter;

    public Worker(String name, int age, String position, Double ratePerHour, Integer workingParameter) {
        super(name, age);
        this.position = position;
        this.ratePerHour = ratePerHour;
        this.workingParameter = workingParameter;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(Double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public Integer getWorkingParameter() {
        return workingParameter;
    }

    public void setWorkingParameter(Integer workingParameter) {
        this.workingParameter = workingParameter;
    }
}
