public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.datebaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

        //İnterfaceler
        ICustomerDal iCustomerDal = new MySqlCustomerDal();
        iCustomerDal.add();
        //interface ile polimorfizm
        CustomerManager2 customerManager2 = new CustomerManager2(new OracleCustomerDal());
        customerManager2.add();
        //Çoklu implementasyon
        //Composition inner class ve static
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "mouse";
        product.price = 10;
        manager.add(product);
        //Önerilmeyen kullanım.
        DatabaseHelper.Crud.delete();
    }
}