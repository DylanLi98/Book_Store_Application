import java.util.Arrays;

public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private int phone;

    public Customer(String firstname, String lastname, String email, int phone){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }
public String getFirstname(){
    return firstname;
}
public String getLastname(){
    return lastname;
}
public String getEmail(){
    return email;
}
public int getPhone(){
    return phone;
}
public void setFirstname(String firstname){
    this.firstname = firstname;
}
public void setLastname(String lasttname){
    this.lastname = lastname;
}
public void setEmail(String email){
    this.email = email;
}
public void setPhone(int phone){
    this.phone = phone;
}

public String print(){
    String customers = "";
    customers = "Firstname; " + getFirstname() + "<br/>Lastname: " + getLastname()
                + "<br/>Email: " + getEmail() + "<br/>Phone: " + getPhone();
    return customers;

}

public String printtxt(){
    String customers = "";
    customers = "Firstname; " + getFirstname() + "\nLastname: " + getLastname()
                + "\nEmail: " + getEmail() + "\nPhone: " + getPhone() + "\n";
    return customers;

}


}
