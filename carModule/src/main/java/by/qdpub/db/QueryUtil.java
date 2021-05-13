package by.qdpub.db;

public class QueryUtil {

    public static String getSearchQuery(String NameOfDatabase, String Table, String IdField, int id) {
        return "SELECT * FROM " + NameOfDatabase + "." + Table + " AS T WHERE T." + IdField + " = " + id + ";";
    }

    public static String getSearchQuery(String NameOfDatabase, String Table) {
        return "SELECT * FROM " + NameOfDatabase + "." + Table + " AS T;";
    }
}
