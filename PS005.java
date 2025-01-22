class PS0055 {
    int id;
    String name;
    double salary;


    public PS0055() { }

    public PS0055(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class PS005 {
     public static void main(String[] args) {

        PS0055 emp1 = new PS0055(1, "Alice", 50000.0);
        PS0055 emp2 = new PS0055(2, "Bob", 60000.0);
        System.out.println(emp1); 
        System.out.println(emp2);
        emp1.setName("Alicia");
        emp1.setSalary(55000.0);
        System.out.println("\nUpdated Employee Details:");
        System.out.println(emp1);
        System.out.println("\nEmployee 2 ID: " + emp2.getId());
        System.out.println("Employee 2 Name: " + emp2.getName());
        System.out.println("Employee 2 Salary: " + emp2.getSalary());
}
}
