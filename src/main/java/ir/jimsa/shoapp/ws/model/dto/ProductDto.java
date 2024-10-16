package ir.jimsa.shoapp.ws.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import ir.jimsa.shoapp.config.validation.annotation.ValidPublicId;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static ir.jimsa.shoapp.utility.constant.ProjectConstants.*;

@Data
@Builder
@Schema(name = PRODUCT_DTO_DOCUMENT_NAME, description = PRODUCT_DTO_DOCUMENT_DESCRIPTION)
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    public interface Create {
    }

    public interface Read {
    }

    @JsonProperty(GENERAL_PUBLIC_ID_FIELD)
    @Null(message = PRODUCT_VALIDATION_PUBLIC_ID_NULL_MESSAGE, groups = {Create.class})
    @ValidPublicId(groups = Read.class)
    @Schema(type = GENERAL_STRING_TYPE, description = PUBLIC_ID_DESCRIPTION, example = PUBLIC_ID_EXAMPLE_1)
    private String publicId;

    private String name;

}
