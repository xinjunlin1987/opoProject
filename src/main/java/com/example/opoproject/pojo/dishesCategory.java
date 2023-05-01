package com.example.opoproject.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Component
public class dishesCategory {
    @Value("1")
    private Long dishesCategoryId;
    private String dishesCategoryName;
    private String dishesCategoryDescription;
    private Boolean dishesCategoryStatus;
}
