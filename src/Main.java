public class Main {
    public static void main(String[] args) {
        FullTimeEmployee[] fullTimeEmployees = new FullTimeEmployee[2];
        fullTimeEmployees[0] = new FullTimeEmployee("Ilhama", 1, 5000);
        fullTimeEmployees[1] = new FullTimeEmployee("Zumrud", 2, 5500);

        PartTimeEmployee[] partTimeEmployees = new PartTimeEmployee[2];
        partTimeEmployees[0] = new PartTimeEmployee("Tom", 1, 20, 80);
        partTimeEmployees[1] = new PartTimeEmployee("Jane", 2, 25, 120);

        for (FullTimeEmployee e : fullTimeEmployees) {
            System.out.println(e.calculateSalary());
            e.displayDetails();
        }

        for (PartTimeEmployee e : partTimeEmployees) {
            System.out.println(e.calculateSalary());
            e.displayDetails();
        }
    }
}