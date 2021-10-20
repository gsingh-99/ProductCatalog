package at.technikum.wien.singh.ProductCatalog.Service;

import at.technikum.wien.singh.ProductCatalog.Model.Product;
import at.technikum.wien.singh.ProductCatalog.Model.ProductType;
import at.technikum.wien.singh.ProductCatalog.Repository.ProductRepository;
import at.technikum.wien.singh.ProductCatalog.Repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductDataService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductTypeRepository productTypeRepository;

    /**
     * Put all Elements of product_types Table in a collection.
     * @return collection of ProductType.
     */
    public Iterable<ProductType> getAllProductTypes(){
        return productTypeRepository.findAll();
    }
    /**
     * Put all elements from product Table in a collection with a given product_type_id.
     * @return collection of Product.
     */
    public Iterable<Product> getAllProductsWithProductTypeId(int id){
        return productRepository.findByProductTypeId(id);
    }
}
