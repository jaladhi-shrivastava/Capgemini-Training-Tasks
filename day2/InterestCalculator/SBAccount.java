package InterestCalculator;

public class SBAccount extends Account {
    String accountType;

    public SBAccount(double amount,String accountType) {
        this.amount = amount;
        this.accountType = accountType;
    }

    @Override
    double calculateInterest() throws InvalidValueException{
        if(this.accountType.equalsIgnoreCase("Normal")){
            interestRate = 4;
        }
        else if(this.accountType.equalsIgnoreCase("NRI")){
            interestRate = 6;
        }
        else{
            throw new InvalidValueException("Please enter valid account type");
        }


        return (amount*interestRate)/100;
    }
}
