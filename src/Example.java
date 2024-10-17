class Employee6{
    int empId;
    String name;
    double salary;

    Employee6(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empId + " " + name + " " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        Employee6 e = (Employee6) obj;
        return this.empId == e.empId;
    }
}

class XZ {
    public static void main(String[] args) {
        Employee6[] employees = new Employee6[5];
        for (int i = 0; i < 5; i++) {
            int empId = i + 1; // assign unique empId
            String name = "Employee " + (i + 1);
            double salary = 10000 + i * 1000;

            Employee6 employee = new Employee6(empId, name, salary);
            employees[i] = employee;
        }

        // Display all employee info
        for (Employee6 employee : employees) {
            System.out.println(employee.toString());
        }

        // Check if empId already exists
        int searchEmpId = 3;
        for (Employee6 employee : employees) {
            if (employee.empId == searchEmpId) {
                System.out.println("empId " + searchEmpId + " already exists");
                break;
            }
        }
    }
}

