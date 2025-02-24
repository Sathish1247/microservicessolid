package com.s;

public class Invoice {
    Employee employee;  
    int quantity;
    double discountRate;
    double taxRate;
    double total;

    public Invoice(Employee employee, int quantity, double discountRate, double taxRate) {
        this.employee = employee;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double salaryAfterDiscount = (employee.salary - employee.salary * discountRate) * this.quantity;
        double salaryWithTaxes = salaryAfterDiscount * (1 + taxRate);
        return salaryWithTaxes;
    }


    public void printInvoice() {
        System.out.println(quantity + "x " + employee.name + " (" + employee.position + ") " + employee.salary);
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }

}
