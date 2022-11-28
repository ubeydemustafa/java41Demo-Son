public class CustomerManager2 {
    private ICustomerDal iCustomerDal;

    public CustomerManager2(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void add(){
        iCustomerDal.add();
    }
}
