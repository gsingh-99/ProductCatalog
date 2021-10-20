package at.technikum.wien.singh.ProductCatalog.Controller;

import at.technikum.wien.singh.ProductCatalog.Model.Product;
import at.technikum.wien.singh.ProductCatalog.Model.ProductType;
import at.technikum.wien.singh.ProductCatalog.Service.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDataAdministration {
    @Autowired
    private ProductDataService service;

    @GetMapping(path = "/listProductTypes")
    public Iterable<ProductType> listProductTypes() {
        return service.getAllProductTypes();
    }

    @GetMapping(path = "/listProductsByTypeId/{productId}")
    public Iterable<Product> listProductsByTypeId(@PathVariable int productId) {
        return service.getAllProductsWithProductTypeId(productId);
    }
}
