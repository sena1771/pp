public class employee {
    /*The branch manager's responsibilities include managing resources and staff,
    developing and attaining sales goals,
    delivering customer service, and growing the location's revenues.
     */
      private String name_employee;
      private String branch;

    public employee(String name_employee,String branch) {
        this.name_employee=name_employee;
        this.branch=branch;
    }

//getter setter

    public String getName_employee() {

        return name_employee;
    }

    public void setName_employee(String name_employee) {

        this.name_employee = name_employee;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
