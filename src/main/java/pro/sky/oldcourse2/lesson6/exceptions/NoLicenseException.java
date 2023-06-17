package pro.sky.oldcourse2.lesson6.exceptions;

public class NoLicenseException extends Exception{

    public NoLicenseException() {
    }

    public NoLicenseException(String message) {
        super(message);
    }
}
