package at.technikum.wien.singh.ProductCatalog.Repository;

import at.technikum.wien.singh.ProductCatalog.Model.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {
}
