package br.ufrpe.questao01;

public class TestInventoryMain {
    public static void main(String[] args) throws Exception {
        Product product01 = new Product("1", "Teclado");
        Product product02 = new Product("2", "Mouse");

        Inventory inventory01 = new Inventory(product01, 20, 15);
        Inventory inventory02 = new Inventory(product02, 30, 10);

        inventory01.dropMultiple(10);
        inventory02.replanishMultiple(19);
        inventory01.report();
        inventory02.report();

        product01.changeName("Teclado virtual");
        inventory01.report();
    }
}
