class Employee{            // Super class
    int salary = 50000;
}
class Engineer extends Employee{ //sub class
    int benefits = 10000;
}

class Inheritance {
    public static void main(String[] args) {
        Engineer obj = new Engineer();
        System.out.println("Enginer Salary:" + obj.salary + " and benefits:" + obj.benefits);
    }
}
