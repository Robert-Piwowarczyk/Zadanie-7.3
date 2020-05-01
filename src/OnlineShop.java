class OnlineShop {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "Podwale", "62A", "316");
        Address address1 = new Address("Poznań", "Piastowska", "58B", "112");
        Customer customer = new Customer("Jan", "Kowalski", address, 5000);
        customer.printInfo();
        System.out.println();

        Employee employee = new Employee("Karol", "Woźniak", address, 7000);
        employee.printInfo();
        System.out.println();

        Director director = new Director("Mirosłąw", "Siudeja", address1, 9_000);
        director.setBonus(1200);
        director.printInfo();
    }
}