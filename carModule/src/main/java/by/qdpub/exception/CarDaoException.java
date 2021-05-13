package by.qdpub.exception;

import java.sql.SQLException;
import java.util.ArrayList;

public class CarDaoException extends SQLException {

    private ArrayList<String> StringArray;

    public CarDaoException(String reason) {
        super(reason);
    }

    public CarDaoException(ArrayList<String> StringArray) {
        this.StringArray = StringArray;
    }

    public CarDaoException() {
    }

    public ArrayList<String> getStringArray() {
        return StringArray;
    }

    public void setStringArray(ArrayList<String> stringArray) {
        StringArray = stringArray;
    }
}
