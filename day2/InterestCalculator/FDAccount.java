package InterestCalculator;

public class FDAccount extends Account {

    int noOfDays;
    int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() throws InvalidValueException{

        if (amount <= 0) {
            throw new InvalidValueException("Invalid amount. Please enter correct values.");
        }

        if (noOfDays < 7 || noOfDays > 365) {
            throw new InvalidValueException("Invalid Number of days. Please enter correct values.");
        }

        if (ageOfACHolder <= 0) {
            throw new InvalidValueException("Invalid age. Please enter correct values.");
        }

        if (amount < 10000000) {

            boolean isSenior = ageOfACHolder >= 60;

            if (noOfDays <= 14)
                interestRate = isSenior ? 5.00 : 4.50;

            else if (noOfDays <= 29)
                interestRate = isSenior ? 5.25 : 4.75;

            else if (noOfDays <= 45)
                interestRate = isSenior ? 6.00 : 5.50;

            else if (noOfDays <= 60)
                interestRate = isSenior ? 7.50 : 7.00;

            else if (noOfDays <= 184)
                interestRate = isSenior ? 8.00 : 7.50;

            else // 185 days to 1 year
                interestRate = isSenior ? 8.50 : 8.00;
        }


        else {

            if (noOfDays <= 14)
                interestRate = 6.50;

            else if (noOfDays <= 29)
                interestRate = 6.75;

            else if (noOfDays <= 45)
                interestRate = 6.75;

            else if (noOfDays <= 60)
                interestRate = 8.00;

            else if (noOfDays <= 184)
                interestRate = 8.50;

            else // 185 days to 1 year
                interestRate = 10.00;
        }

        return (amount * interestRate) / 100;
    }
}