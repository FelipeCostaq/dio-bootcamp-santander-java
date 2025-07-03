import java.util.Random;

public class AccountBank {
    Random rdn = new Random();


    float especialCheck = 0.0f;
    float balance = 0.0f;
    float boletoCheck = 0.0f;

    public AccountBank(String name, float initialBalance) {
        if(initialBalance <= 500) {
            especialCheck = 50;
        }
        else {
            especialCheck = initialBalance / 2;
        }

        balance = initialBalance;
        boletoCheck = rdn.nextFloat((1000 - 100) + 1) + 100;
    }

    public float getBalance() {
        return balance;
    }

    public float getEspecialCheck() {
        return especialCheck;
    }

    public float deposit(float amount) {
        balance += amount;
        return balance;
    }

    public float withdraw(float amount) {
        balance -= amount;
        return  balance;
    }

    public float getBoletoCheck() {
        return boletoCheck;
    }

    public void payBoleto(float balance){
        this.balance -= boletoCheck;
    }
}
