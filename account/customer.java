package account;

public class customer {
    private String customer_name;
    private String customer_address;
    private String customer_phone;
    private String customer_email;

    public customer(String customer_name,String customer_address,String customer_phone, String customer_email){
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
    }

    public String getCustomerName() {
        return customer_name;
    }

    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomerAddress() {
        return customer_address;
    }

    public void setCustomerAddress(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomerPhone() {
        return customer_phone;
    }

    public void setCustomerPhone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomerEmail(){return customer_email;}

    public void setCustomerEmail(String customer_email){this.customer_email = customer_email;}

    @Override
    public String toString(){
        return "Customer name = " + this.getCustomerName() + ", Address = " + this.getCustomerAddress() + ", Phone = " + this.getCustomerPhone() + ", Email = " + this.getCustomerEmail();
    }
}
