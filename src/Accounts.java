import javax.swing.*;

public class Accounts {
    public static final class Account {

        private float money;
        private String name;

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {

            Account[] accounts = new Account[5];


            accounts[0] = new Account();
            accounts[0].setName("Peter Ivanov");
            accounts[0].setMoney(50000.0f);

            accounts[1] = new Account();
            accounts[1].setName("Peter Fedorov");
            accounts[1].setMoney(55000.0f);

            accounts[2] = new Account();
            accounts[2].setName("Marat Sabirov");
            accounts[2].setMoney(45000.0f);

            accounts[3] = new Account();
            accounts[3].setName("Slava Falin");
            accounts[3].setMoney(70000.0f);

            accounts[4] = new Account();
            accounts[4].setName("Misha Davudoff");
            accounts[4].setMoney(70000.0f);

            for(int i = 0; i < accounts.length; i++) {
                float currentMoney = accounts[i].getMoney();
                currentMoney =  currentMoney * 0.87f;
                accounts[i].setMoney(currentMoney);


            }
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Name: " +accounts[i].getName() + " money: " + accounts[i].getMoney());
            }

            


        }
    }
}
