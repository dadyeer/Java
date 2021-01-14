public class Main {
    public static void main(String[] args) {
        Employees[] employees = {
                new Employees( "Oleg", "teacher", "123@com"  , 485612 , "123$", 32),
                new Employees( "Vsa", "driver", "rew@com"  , 854755 , "458$", 42),
                new Employees( "Olga", "teacher", "nrt@com"  , 746584 , "857$", 52),
                new Employees( "Kirill", "coach", "vfr@com"  , 911 , "5050$", 62),
                new Employees( "Jena", "manager", "123@com"  , 2567 , "854$", 22),
        };
        for (int i = 0; i < employees.length ; i++){
            if(employees[i].getAge() >30) {
                employees[i].employeeInfo();
            }
        }
    }
}
