//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Servcie ser = new Servcie();
        try{
            ser.Check("123", "huihiubnseyucb3", "huihiubnseyucb3");
            System.out.println("Все данные корректны.");
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println("Ошибка входа: " + e.getMessage());
        }
    }
}