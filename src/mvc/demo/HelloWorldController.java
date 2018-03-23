package mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.*;

@Controller
public class HelloWorldController {
    //need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    //new controller to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String doUpperCaseForStringRequest(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        // convert the data to all caps
        theName = theName.toUpperCase();
        // create proper message
        String result = "This is our request parameter uppercased: " + theName;
        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String versionThreeProcess(@RequestParam("studentName") String theName, Model model) {
        // convert the data to all caps
        theName = theName.toUpperCase() + " version 3";
        // create proper message
        String result = "This is our third version of process form: " + theName;
        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }


}
