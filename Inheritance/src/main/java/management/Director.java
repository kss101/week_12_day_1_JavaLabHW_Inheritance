package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nin, double salary, String deptName, double budget){
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        double pay = getSalary();
        return (pay/100) * 2;
    }

}
