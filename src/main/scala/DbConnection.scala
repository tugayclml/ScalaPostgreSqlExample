import java.sql.DriverManager
import java.sql.Connection

object PostgreSqlScala extends App{

    // JDBC CONNECTION
    val driver = "org.postgresql.Driver"
    val url = "jdbc:postgresql://localhost:5432/homework"
    val username = "postgres"
    val password = "postgres"


    //CONNECTION ESTABLISHMENT TO THE DATABASE

    Class.forName(driver);
    val connection = DriverManager.getConnection(url, username, password)

    //CREATING THE STATEMENT FOR RUNNING THE QUERY

    val statement = connection.createStatement()

    var createAccountTable = "CREATE TABLE IF NOT EXISTS accounts " +
    "(user_id serial PRIMARY KEY, username VARCHAR ( 50 ) UNIQUE NOT NULL," +
    "password VARCHAR ( 50 ) NOT NULL, email VARCHAR ( 255 ) UNIQUE NOT NULL);"

    val resultTable = statement.execute(createAccountTable)

    val sql1 = "INSERT INTO accounts (username, password, email)" +
    " VALUES ('test', '123456', 'test@test.com');"

    val sql2 = "INSERT INTO accounts (username, password, email)" +
    " VALUES ('test2', '123456', 'test2@test.com');"

    statement.execute(sql1)
    statement.execute(sql2)

    val resultSet = statement.executeQuery("SELECT * FROM accounts;")
    while (resultSet.next()) {
        println(resultSet.getString("username"))
    }

  connection.close

}