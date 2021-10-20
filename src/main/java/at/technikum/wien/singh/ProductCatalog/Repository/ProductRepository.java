package at.technikum.wien.singh.ProductCatalog.Repository;

import at.technikum.wien.singh.ProductCatalog.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    /**
     * products Table joins with product_types Table, finds all product with the matching product_type_id
     * and puts them in a collection.
     * @Return Collection of Product.
     */
    Iterable<Product> findByProductTypeId(int id);
}
