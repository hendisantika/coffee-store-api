package com.bestseller.coffee.dto.response.topping;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeletedToppingDto {
    private String message;
}
