package pro.sky.oldcourse2.lesson7.exceptions;

public class NoLicenseException extends Exception{

    public NoLicenseException() {
    }

    public NoLicenseException(String message) {
        super(message);
    }
}
