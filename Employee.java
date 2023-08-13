class Employee {
    int eId;
    String eName;
    int eSalary;

    /*
     * public Employee(int id,String name,int salary){
     * eId=id;
     * eName=name;
     * eSalary=salary;
     * }
     */
    /*
     * public Employee(int eId, String eName, int eSalary) {
     * eId = eId;
     * eName = eName;
     * eSalary = eSalary;
     * }
     */
    public Employee(int eId, String eName, int eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public void introduce() {
        System.out.println("ID:" + eId);
        System.out.println("Name:" + eName);
        System.out.println("Salary:" + eSalary);
    }
}

class EmployeeApp {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Deep", 125000);
        e.introduce();
    }
}