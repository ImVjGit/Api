package com.DemoApi.demo.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException {
    private String ResourceName;
    private String FieldName;
    private Long id;

    public ResourceNotFoundException(String resourceName, String fieldName, Long id) {
        super(String.format("%s not found by %s: %s ",resourceName,fieldName,id));
        ResourceName = resourceName;
        FieldName = fieldName;
        this.id = id;
    }
}
