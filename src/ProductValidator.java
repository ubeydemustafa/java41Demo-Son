public class ProductValidator {

    public ProductValidator() {
        System.out.println("Yapıcı metod çalıştı.");
    }
    static {
        System.out.println("Static yapıcı metod çalıştı.");

    }



    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }



    public void bisey(){
    }
}
