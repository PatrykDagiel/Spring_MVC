package mvc.demo;

import mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    @CourseCode(value = {"TOPS", "LUV"}, message = "must start with TOPS or LUV")
    private String courseCode;

    private String firstName;

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters or digit")
    private String postalCode;

    @NotNull(message = "is required")
    @Min(value=0, message = "must be greater than or equal zero")
    @Max(value=10, message = "must be greater than or equal to 10")
    private Integer freePasses;

    @NotNull(message="is required")
    @Size(min=1, message= "is required")
    private String lastName;

    public Customer() {}

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
