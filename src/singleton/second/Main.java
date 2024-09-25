package singleton.second;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Получаем ЕДИНСТВЕННЫЙ экземпляр конфигурации
        DatabaseConfig config = DatabaseConfig.getInstance();

        //выводим настройки базы данных
        System.out.println("URL: "+ config.getUrl());
        System.out.println("Username: "+ config.getUsername());
        System.out.println("Password: "+ config.getPassword());
    }
}