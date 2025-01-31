import java.util.Scanner;
class Account{
    String accountNumber;
    String customerName;
    double balance;
    public Account(String accountNumber,String customerName,double balance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Customer Name:"+customerName);
        System.out.println("Balance :$"+balance);
    }
}
abstract class SavingsGoals{
    public abstract void setSavingGoals();

}
class SavingChallenges extends SavingsGoals{
   String goalName;
   double targetAmount;
   String deadline;
   public SavingChallenges(String goalName,double targetAmount,String deadline){
    this.goalName=goalName;
    this.targetAmount=targetAmount;
    this.deadline=deadline;
   }
   @Override
   public void setSavingGoals(){
    System.out.println("Saving goal set successfully");
    System.out.println("Goal Name"+goalName);
    System.out.println("Target Amount :$"+targetAmount);
    System.out.println("Deadline:"+deadline);
   }
}
abstract class Budget{
    public abstract void checkBudgetStatus();
}
class ExpenseBudget extends Budget{
  String category;
  double budgetLimit;
  double totalExpenses;
  public ExpenseBudget(String category,double budgetLimit,double totalExpenses){
    this.category=category;
    this.budgetLimit=budgetLimit;
    this.totalExpenses=totalExpenses;
  }
  @Override
  public void checkBudgetStatus(){
    if(totalExpenses>budgetLimit){
        System.out.println("You have exceeded the budget for "+category);
    }
    else{
        System.out.println("You are within the budget for"+category+".");
    }
  }

}
public class bank{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("\n--- Piggy Bank Application");
            System.out.println("1. Set Saving Goals");
            System.out.println("2. Check Budget Status");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
             
            String choice= sc.nextLine();
            switch(choice){
                case "1":
                   setSavingGoals();
                   break;
                case "2":
                   checkBudgetStatus();
                   break;
                case "3":
                   System.out.println("Exiting.....");
                   System.exit(0);
                default:
                   System.out.println("Invalid choice.");
            }
        }
        }
        public static void setSavingGoals() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter goal name: ");
            String goalName = sc.nextLine();
            System.out.print("Enter target amount: ");
            double targetAmount = Double.parseDouble(sc.nextLine());
            System.out.print("Enter deadline: ");
            String deadline = sc.nextLine();
    
            // Create a SavingChallenges object and set the saving goals
            SavingsGoals savingGoal = new SavingChallenges(goalName, targetAmount, deadline);
            savingGoal.setSavingGoals();
        }
    
        // Method to check budget status
        public static void checkBudgetStatus() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter category: ");
            String category = sc.nextLine();
            System.out.print("Enter budget limit: ");
            double budgetLimit = Double.parseDouble(sc.nextLine());
            System.out.print("Enter total expenses: ");
            double totalExpenses = Double.parseDouble(sc.nextLine());
    
            // Create an ExpenseBudget object and check the budget status
            Budget budget = new ExpenseBudget(category, budgetLimit, totalExpenses);
            budget.checkBudgetStatus();
        }



}













































































 
