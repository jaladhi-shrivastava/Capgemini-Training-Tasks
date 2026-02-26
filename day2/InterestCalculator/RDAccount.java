package InterestCalculator;

public class RDAccount extends Account {
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    public RDAccount(int noOfMonths, double monthlyAmount, int ageOfACHolder) {
        this.noOfMonths = noOfMonths;
        this.monthlyAmount = monthlyAmount;
        this.ageOfACHolder = ageOfACHolder;
        this.amount = monthlyAmount * noOfMonths;
    }

    @Override
    double calculateInterest() throws InvalidValueException {
        if (monthlyAmount <= 0) {
            throw new InvalidValueException("Invalid monthly amount. Please enter correct values.");
        }
        if (ageOfACHolder <= 0) {
            throw new InvalidValueException("Invalid age. Please enter correct values.");
        }
        if (noOfMonths <= 0) {
            throw new InvalidValueException("Invalid age. Please enter correct values.");
        }

        if (ageOfACHolder < 60) {

            if (noOfMonths <= 6) interestRate = 7.50;
            else if (noOfMonths <= 9) interestRate = 7.75;
            else if (noOfMonths <= 12) interestRate = 8.00;
            else if (noOfMonths <= 15) interestRate = 8.25;
            else if (noOfMonths <= 18) interestRate = 8.50;
            else if (noOfMonths <= 21) interestRate = 8.75;
            else interestRate = 8.75;

        } else {

            if (noOfMonths <= 6) interestRate = 8.00;
            else if (noOfMonths <= 9) interestRate = 8.25;
            else if (noOfMonths <= 12) interestRate = 8.50;
            else if (noOfMonths <= 15) interestRate = 8.75;
            else if (noOfMonths <= 18) interestRate = 9.00;
            else if (noOfMonths <= 21) interestRate = 9.25;
            else interestRate = 9.25;
        }

        return (amount * interestRate) / 100;
    }
}