package br.ufrpe.questao01;

public class Inventory {
    private Product product;
    private int currentAmount;
    private int minimumAmount;

    public Inventory() {
        this.product = new Product();
        this.currentAmount = 0;
        this.minimumAmount = 0;
    }

    public Inventory(Product product, int currentAmount, int minimumAmount) {
        this.product = product;
        this.currentAmount = currentAmount;
        this.minimumAmount = minimumAmount;
    }

    public void changeminimumAmount(int newminimumAmount) {
        if(newminimumAmount < 0) {
            this.minimumAmount = 0;
        } else {
            this.minimumAmount = newminimumAmount;
        }
    }

    public void replanishOne() {
        this.currentAmount += 1;
    }

    public void dropOne() {
        if(this.minimumAmount < currentAmount) {
            this.currentAmount -= 1;
        } else {
            System.out.println("Minimum quantity achieved. Product not dropped.");
        }
    }

    public void replanishMultiple(int amountToReplanish) {
        if(amountToReplanish > 0){
            int counter = 0;
            while(counter < amountToReplanish) {
                replanishOne();
                counter ++;
            }
        } else {
            System.out.println("Cannot replanish less then one product.");
        }
    }

    public void dropMultiple(int amountToDrop) {
        if(amountToDrop > 0){
            int counter = 0;
            while(counter < amountToDrop && this.minimumAmount < this.currentAmount) {
                dropOne();
                counter ++;
            }
            if(counter < amountToDrop) {
                String output = String.format("Cannot drop products bellow the inventory's minimum amount. Dropped %d products.", counter);
                System.out.println(output);
            }
        } else {
            System.out.println("Cannot drop less then one product.");
        }
    }

    public void report() {
        String output = String.format("%s\nCurrent Amount: %s\nMinimum amount: %s\n", product, currentAmount, minimumAmount);
        System.out.println(output);
    }
}
