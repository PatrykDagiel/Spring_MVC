package mvc.demo;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @Min(value=0, message = "must be greater than or equal zero")
    @Max(value=10, message = "must be greater than or equal to 10")
    private int freePasses;

    @NotNull(message="is required")
    @Size(min=1, message= "is required")
    private String lastName;

    public Customer() {}

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
