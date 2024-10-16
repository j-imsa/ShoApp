package ir.jimsa.shoapp.ws.service.impl;

import ir.jimsa.shoapp.config.log.EvaluateExecuteTimeout;
import ir.jimsa.shoapp.utility.mapper.ProductMapper;
import ir.jimsa.shoapp.ws.model.dto.ProductDto;
import ir.jimsa.shoapp.ws.repository.ProductRepository;
import ir.jimsa.shoapp.ws.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @EvaluateExecuteTimeout
    @Transactional
    @Override
    public ProductDto create(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto read(String publicId) {
        return null;
    }

    @Override
    public List<ProductDto> readAll(int page, int size) {
        return List.of();
    }

    @Transactional
    @Override
    public boolean delete(String publicId) {
        return false;
    }
}
