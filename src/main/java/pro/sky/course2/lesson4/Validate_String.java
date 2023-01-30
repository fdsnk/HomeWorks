package pro.sky.course2.lesson4;

public class Validate_String {
    private static final String DEFAULT = "...не указано...";

    public static String validateString(String needsValidate) {
        needsValidate = (needsValidate != null && !needsValidate.isEmpty() && !needsValidate.isBlank() ? needsValidate : DEFAULT);
        return needsValidate;
    }
}
