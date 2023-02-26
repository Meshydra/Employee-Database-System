package objects;

import java.sql.Date;

public class Employee {
	String nic;
	String name;
    String department;
    String designation;
    Date joindate;
    
 // Setters
    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setJoinDate(Date joindate) {
        this.joindate = joindate;
    }

    // Getters
    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public Date getJoinDate() {
        return joindate;
    }
}
