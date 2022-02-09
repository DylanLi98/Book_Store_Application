import java.util.*;

public class Custtester {
    private static List<Customer> Customers = new ArrayList<Customer>();

    public static void addcustomer(){
        Customer customer1 = new Customer("Duo","Li","duoli@uab.edu",12345678);
        Customer customer2 = new Customer("Hee","Sheee","sfsd@uab.edu",56758923);
        Customer customer3 = new Customer("Deko","Boost","rvvsvs@uab.edu",2424235);
    
        Customers.add(customer1);
        Customers.add(customer2);
        Customers.add(customer3);
    }

    public static String printAll() {
        String customerlist = "<html>Show customer lists:<br/>";
        addcustomer();
        for(Customer customer : Customers) {
            customerlist = customerlist.concat(customer.print());
            customerlist = customerlist.concat("<br/><br/>");
        }
        customerlist = customerlist.concat("</html>");
        return customerlist;
    }

    public static String printTXT() {
        String customerlist = "Show customer lists; \n";
        addcustomer();
        for(Customer customer : Customers) {
            customerlist = customerlist.concat(customer.printtxt());
        }
        return customerlist;
    }



    public static String Search(String firstname){
        String customerlist = "<html>Show customer information:<br/>";
        addcustomer();
        for (Customer customer : Customers){
            if (customer.getFirstname().equals(firstname)){
                customerlist = customerlist.concat(customer.print());
            }
        }
        customerlist = customerlist.concat("<html/>");
        if (customerlist.equals("<html>Show customer information:<br/><html/>")){
            return"-1";
        }
        else
            return customerlist;


    }
}
