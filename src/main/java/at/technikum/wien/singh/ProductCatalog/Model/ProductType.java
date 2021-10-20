package at.technikum.wien.singh.ProductCatalog.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "product_types")
@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String productTypeName;
}
