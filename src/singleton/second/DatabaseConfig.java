package singleton.second;

public class DatabaseConfig {
    // Поля для хранения конфигурации базы данных
    private final String url;
    private final String username;
    private final String password;

    // Единственный экземпляр класса
    private static DatabaseConfig instance;

    // Приватный конструктор для предотвращения создания объектов извне
    private DatabaseConfig() {
        // Устанавливаем конфигурацию базы данных (можно загрузить из файла)
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "root";
        this.password = "password";
    }

    // Публичный метод для получения единственного экземпляра
    public static DatabaseConfig getInstance() {
        // Двойная проверка блокировки
        if (instance == null) { // Первоначальная проверка
            synchronized (DatabaseConfig.class) { // Блокировка на уровне класса
                if (instance == null) { // Проверка внутри заблокированного блока
                    instance = new DatabaseConfig();
                }
            }
        }
        return instance;
    }

    // Методы для получения данных конфигурации
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
