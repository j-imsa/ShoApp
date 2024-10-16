package ir.jimsa.shoapp.ws.model.entity;


import ir.jimsa.shoapp.config.validation.annotation.ValidPublicId;
import jakarta.persistence.*;
import lombok.*;

import static ir.jimsa.shoapp.utility.constant.ProjectConstants.PRODUCT_DATABASE_JOIN_ID;
import static ir.jimsa.shoapp.utility.constant.ProjectConstants.PRODUCT_DATABASE_TABLE_NAME;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = PRODUCT_DATABASE_TABLE_NAME)
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = PRODUCT_DATABASE_JOIN_ID)
    private Long id;

    @Version
    private Long version;

    @Column(nullable = false, unique = true)
    @ValidPublicId
    private String publicId;

    @Column(nullable = false)
    private String name;
}
