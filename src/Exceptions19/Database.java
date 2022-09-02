package Exceptions19;

public class Database implements AutoCloseable{
    private String connectionString;

    public Database(String connectionString) throws Exception {
        if( connectionString == null) {
            throw  new Exception("Cannot connect to db");
        }

        this.connectionString = connectionString;
        System.out.println("connect to " + connectionString);
    }

    public void getData() throws Exception{
        System.out.println("Getting data from " + connectionString);

        if (connectionString.length() < 3) {
            System.out.println("can not get data from " + connectionString);
        }
    }

    public void close() {
        System.out.println("Closing db connection...");

        if (connectionString.length() < 5) {
            System.out.println("can not get data from " + connectionString);
        }

        System.out.println("Connection closed");
    }
}
