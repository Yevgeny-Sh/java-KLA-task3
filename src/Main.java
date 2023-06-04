
public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound();
        }


        Division.divide();

        MySecondBankClass myAccount = new MySecondBankClass("john",1);

        myAccount.deposit(100.0);
        myAccount.withdraw(50.0);
        myAccount.displayAccountInfo();
        myAccount.deposit(-20.0); // Invalid deposit
        myAccount.deposit(0); // Invalid deposit

        myAccount.displayAccountInfo();
        myAccount.withdraw(200.0); // Invalid withdrawal
        myAccount.displayAccountInfo();

        FilesIO.writeFile("outPut.txt","hello \nworld");
        FilesIO.readFile("outPut.txt");
        FilesIO.convertFileToUpperCase("outPut.txt");
    }
}
