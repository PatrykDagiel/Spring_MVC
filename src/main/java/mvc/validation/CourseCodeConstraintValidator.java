package mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefixes = constraintAnnotation.value();
    }
    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;

        if (theCode != null) {
            for (String prefix : coursePrefixes) {
                result = theCode.startsWith(prefix);
                if (result) break;
            }
        } else {
            result = true;
        }
        return result;
    }
}
