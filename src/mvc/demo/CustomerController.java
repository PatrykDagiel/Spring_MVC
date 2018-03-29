package mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
//        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", new Customer());
        return  "customer-form";
    }

//    @RequestMapping("/processForm")
//    public String processForm(@ModelAttribute("customer") Customer theCustomer) {
//        System.out.println("the customer is " + theCustomer.getFirstName() + " " + theCustomer.getLastName());
//        return "customer-confirmation";
//    }
}
