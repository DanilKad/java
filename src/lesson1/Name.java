
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

public class Name {
    public static void main(String[] args) {
        sayHello ("Данил");
    }
    private static void sayHello(String name){
    System.out.println("Привет " + name + "!" );

    }
}
