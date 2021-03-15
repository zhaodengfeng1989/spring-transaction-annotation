package com.zhaodf.beans;

/**
 * 类：Emp
 *
 * @author zhaodf
 * @date 2021/3/5
 */
public class Emp {
    private int empNo;
    private String empName;
    private String salary;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
