public class AbstractClassDemo {
    public static String showEmployee(Employee employeeObject) {
        return ("Name : " + employeeObject.getName() + "\n" + 
                "Hire Date : " + employeeObject.getHireDate() + "\n" + 
                "Pay : " + employeeObject.getPay() + "\n" +  
                "=============================");
    }
    public static void main(String[] args) {
        SalariedEmployee joe  = new SalariedEmployee("Joe", new Date("January", 1, 2015), 100000);
        HourlyEmployee sam = new HourlyEmployee("Sam", new Date("February", 1, 2016), 50.50, 40);

        System.out.println(showEmployee(joe));
        System.out.println(showEmployee(sam));

        if (joe.samePay(sam)) 
            System.out.println("They have the same pay.");
        else
            System.out.println("They don't have the same pay.");
    }
}