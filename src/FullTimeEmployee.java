public class FullTimeEmployee implements Employee {
    private final String name;
    private final int employeeID;
    private final int monthlySalary;

    public FullTimeEmployee (String name, int employeeID, int monthlySalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculateSalary() {
        return this.monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full time employee: ");
        System.out.println(this.name);
        System.out.println(this.employeeID);
        System.out.println(this.monthlySalary);
        System.out.println("===========================");
    }
}
