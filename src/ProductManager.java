public class ProductManager {
    public void add(Product product){
        //ProductValidator productValidator = new ProductValidator();
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi.");
        }
        else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }

        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();


    }
}
