package singleton;

public class DatabaseConfig {
    //поля для хранения конфигурации базы данных
    private final String url;
    private final String username;
    private final String password;

    //единственный экземпляр класса
    private static DatabaseConfig instance;

    //Приватный конструктор для предотвращения создания объектов извне
    private DatabaseConfig() {
        //устанавливаем конфигурацию базы данных (можно загрузить из файла)
        this.url = "jdbc:mysql://localhost:3306/database";
        this.username = "root";
        this.password = "";
    }

    //Публичный метод для получения единственного экземпляра
    public static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
