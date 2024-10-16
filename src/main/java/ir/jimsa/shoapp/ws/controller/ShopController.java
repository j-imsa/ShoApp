package ir.jimsa.shoapp.ws.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import ir.jimsa.shoapp.config.document.annotation.CreateShopRequestDocument;
import ir.jimsa.shoapp.config.document.annotation.PublicIdParameterDocument;
import ir.jimsa.shoapp.config.validation.annotation.ValidPublicId;
import ir.jimsa.shoapp.ws.model.dto.ProductDto;
import ir.jimsa.shoapp.ws.model.dto.ResponseDto;
import ir.jimsa.shoapp.ws.service.ProductService;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static ir.jimsa.shoapp.utility.constant.ProjectConstants.*;

@RestController
@RequestMapping(path = SHOP_PATH, produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
@Tag(name = SHOP_DOCUMENT_NAME, description = SHOP_DOCUMENT_DESCRIPTION)
public class ShopController {

    private final ProductService productService;

    @PostMapping
    @CreateShopRequestDocument(summary = SHOP_DOCUMENT_POST_SUMMERY, description = SHOP_DOCUMENT_POST_DESCRIPTION)
    public ResponseEntity<ResponseDto> addShop(
            @Validated(ProductDto.Create.class) @RequestBody ProductDto productDto
    ) {
        ProductDto createdProductDto = productService.create(productDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ResponseDto.builder()
                                .action(true)
                                .timestamp(LocalDateTime.now())
                                .result(createdProductDto)
                                .build()
                );
    }

    @GetMapping
    public ResponseEntity<ResponseDto> getShops(
            @Positive(message = GENERAL_VALIDATION_PAGE_POSITIVE_INTEGER)
            @RequestParam(defaultValue = GENERAL_PAGE_DEFAULT_VALUE)
            @Parameter(example = GENERAL_DOCUMENT_PAGE_EXAMPLE)
            int page,

            @Positive(message = GENERAL_VALIDATION_SIZE_POSITIVE_INTEGER)
            @RequestParam(defaultValue = GENERAL_SIZE_DEFAULT_VALUE)
            @Parameter(example = GENERAL_DOCUMENT_SIZE_EXAMPLE)
            int size
    ) {
        List<ProductDto> productDtos = productService.readAll(page, size);
        return ResponseEntity
                .ok(
                        ResponseDto.builder()
                                .action(true)
                                .timestamp(LocalDateTime.now())
                                .result(productDtos)
                                .build()
                );
    }

    @GetMapping(SHOP_GET_PATH)
    public ResponseEntity<ResponseDto> getShop(
            @PublicIdParameterDocument @ValidPublicId @PathVariable(GENERAL_PUBLIC_ID_FIELD) String publicId
    ) {
        ProductDto productDto = productService.read(publicId);
        return ResponseEntity
                .ok(
                        ResponseDto.builder()
                                .action(true)
                                .timestamp(LocalDateTime.now())
                                .result(productDto)
                                .build()
                );
    }

    @DeleteMapping(SHOP_DELETE_PATH)
    public ResponseEntity<ResponseDto> removeShop(
            @PublicIdParameterDocument @ValidPublicId @PathVariable(GENERAL_PUBLIC_ID_FIELD) String publicId
    ) {
        boolean result = productService.delete(publicId);
        return ResponseEntity
                .ok(
                        ResponseDto.builder()
                                .action(true)
                                .timestamp(LocalDateTime.now())
                                .result(result)
                                .build()
                );
    }

}
