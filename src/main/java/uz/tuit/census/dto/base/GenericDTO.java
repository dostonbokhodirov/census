package uz.tuit.census.dto.base;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class GenericDTO implements BaseDTO {

    @NotBlank
    private Long id;

}
