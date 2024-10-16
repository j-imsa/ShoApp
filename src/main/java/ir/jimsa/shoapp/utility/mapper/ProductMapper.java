package ir.jimsa.shoapp.utility.mapper;

import ir.jimsa.shoapp.utility.id.PublicIdGenerator;
import ir.jimsa.shoapp.ws.model.dto.ProductDto;
import ir.jimsa.shoapp.ws.model.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductMapper {
    private final PublicIdGenerator publicIdGenerator;

    public Product mapToEntity(ProductDto dto) {
        return Product.builder()
                .publicId(dto.getPublicId())
                .name(dto.getName())
                .build();
    }

    public ProductDto mapToDto(Product entity) {
        return ProductDto.builder()
                .publicId(entity.getPublicId())
                .name(entity.getName())
                .build();
    }

}
