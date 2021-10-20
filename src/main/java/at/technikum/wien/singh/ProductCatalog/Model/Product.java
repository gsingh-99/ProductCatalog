package at.technikum.wien.singh.ProductCatalog.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "products")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int id;
    @Column(name = "name")
    public String name;
    @OneToOne
    @JoinColumn(name = "id_product_types")
    public ProductType productType;
}
