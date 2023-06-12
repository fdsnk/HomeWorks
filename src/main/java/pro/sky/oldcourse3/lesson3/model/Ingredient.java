package pro.sky.oldcourse3.lesson3.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Ingredient {
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Positive
    private Integer count;
    private String measureUnit;


}
