package com.example.opoproject.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Component
public class dishesCategory {
    private Long dishesCategoryId;
    private String dishesCategoryName;
    private String dishesCategoryDescription;
    private Boolean dishesCategoryStatus;
}
