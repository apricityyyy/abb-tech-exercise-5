public class PartTimeEmployee implements Employee {
    private final String name;
    private final int employeeID;
    private final int hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(String name, int employeeID, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculateSalary() {
        return this.hoursWorked * this.hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part time employee:");
        System.out.println(this.name);
        System.out.println(this.employeeID);
        System.out.println(calculateSalary());
        System.out.println("===========================");
    }
}
