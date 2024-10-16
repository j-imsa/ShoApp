package ir.jimsa.shoapp.ws.service;

import ir.jimsa.shoapp.ws.model.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto create(ProductDto productDto);

    ProductDto read(String publicId);

    List<ProductDto> readAll(int page, int size);

    boolean delete(String publicId);
}
