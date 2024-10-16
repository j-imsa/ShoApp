package ir.jimsa.shoapp.ws.service.impl;

import ir.jimsa.shoapp.config.exception.AppServiceException;
import ir.jimsa.shoapp.config.log.EvaluateExecuteTimeout;
import ir.jimsa.shoapp.utility.mapper.ProductMapper;
import ir.jimsa.shoapp.ws.model.dto.ProductDto;
import ir.jimsa.shoapp.ws.model.entity.Product;
import ir.jimsa.shoapp.ws.repository.ProductRepository;
import ir.jimsa.shoapp.ws.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static ir.jimsa.shoapp.utility.constant.ProjectConstants.*;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    @EvaluateExecuteTimeout
    @Transactional
    @Override
    public ProductDto create(ProductDto productDto) {
        if (productRepository.findByName(productDto.getName()).isPresent()) {
            throw new AppServiceException(EXCEPTION_NAME_MESSAGE, HttpStatus.BAD_REQUEST);
        }

        Product product = ProductMapper.mapToEntity(productDto);
        return ProductMapper.mapToDto(productRepository.save(product));
    }

    @Override
    public ProductDto read(String publicId) {
        Optional<Product> optionalProduct = productRepository.findByPublicId(publicId);
        if (optionalProduct.isEmpty()) {
            throw new AppServiceException(EXCEPTION_NOT_FOUND_RESOURCE_MESSAGE, HttpStatus.NOT_FOUND);
        }
        return ProductMapper.mapToDto(optionalProduct.get());
    }

    @Override
    public List<ProductDto> readAll(int page, int size) {

        Pageable pageable = PageRequest.of(page - 1, size, Sort.by(Sort.Direction.ASC, PRODUCT_NAME_FIELD));
        Page<Product> productPage = productRepository.findAll(pageable);

        return productPage
                .get()
                .map(ProductMapper::mapToDto)
                .toList();
    }

    @Transactional
    @Override
    public boolean delete(String publicId) {
        Optional<Product> optionalProduct = productRepository.findByPublicId(publicId);
        if (optionalProduct.isEmpty()) {
            throw new AppServiceException(EXCEPTION_NOT_FOUND_RESOURCE_MESSAGE, HttpStatus.NOT_FOUND);
        }
        productRepository.delete(optionalProduct.get());
        return true;
    }
}
