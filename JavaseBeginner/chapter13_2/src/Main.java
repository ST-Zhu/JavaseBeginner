/*第二题：计算不同类型的员工薪资
定义员工类 Employee，员工包含姓名 name、出生月份 birthMonth 两个属性，员工有
获取指定月份工资的方法（getSalary(int month)），如果该月员工生日，公司补助 250 元。
定义有固定工资的员工类 SalariedEmployee，有月薪 monthlySalary 属性。
定义小时工类 HourlyEmployee，包含工作小时数 hours 和每小时的工资 hourlySalary 属
性，如果每月工作超过 160 小时，超过的部分按 1.5 倍工资发放。
定义销售人员类 SalesEmployee，包含月销售额 sales 和提成比例 comm 属性。*/

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary(1);
        SalariedEmployee employee1 = new SalariedEmployee("张三", 1999, 1, 1, 30000);
        HourlyEmployee employee2 = new HourlyEmployee("李四", 1999, 2, 1, 200, 20);
        SalesEmployee employee3 = new SalesEmployee("王五", 1999, 3, 1,8000, 200000, 0.03F);
        System.out.println(employee1.getName() + "在" + salary.getTime() + "月份的工资是" + salary.calculate(employee1) + "元");
        System.out.println(employee2.getName() + "在" + salary.getTime() + "月份的工资是" + salary.calculate(employee2) + "元");
        System.out.println(employee3.getName() + "在" + salary.getTime() + "月份的工资是" + salary.calculate(employee3) + "元");

    }
}

class Salary{
    private int time;

    public Salary() {
    }

    public Salary(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public float calculate(Employee employee){
        if(employee.getMonth() == this.time){
            return (employee.getSalary() + 250);
        }else{
            return employee.getSalary();
        }
    }
}

class Employee{
    private String name;
    private int year;
    private int month;
    private int day;

    public Employee() {
    }

    public Employee(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getSalary(){
            return 0;
    }
}

class SalariedEmployee extends Employee{
    private float monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int year, int month, int day, float monthlySalary) {
        super(name, year, month, day);
        this.monthlySalary = monthlySalary;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public float getSalary(){
        return this.getMonthlySalary();
    }
}

class HourlyEmployee extends Employee{
    private float hours;
    private float hourlySalary;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int year, int month, int day, float hours, float hourlySalary) {
        super(name, year, month, day);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(float hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public float getSalary(){
        float sal;
        if(this.hours > 160){
            sal = (160 * this.hourlySalary) + (this.hours - 160) * (this.hourlySalary * 1.5F);
        }else{
            sal = this.hours * this.hourlySalary;
        }
        return sal;
    }
}

class SalesEmployee extends SalariedEmployee{
    private float sales;
    private float comm;

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int year, int month, int day, float monthlySalary, float sales, float comm) {
        super(name, year, month, day, monthlySalary);
        this.sales = sales;
        this.comm = comm;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public float getComm() {
        return comm;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

    public float getSalary(){
        float sal;
        sal = this.getMonthlySalary() + this.sales * this.comm;
        return sal;
    }
}