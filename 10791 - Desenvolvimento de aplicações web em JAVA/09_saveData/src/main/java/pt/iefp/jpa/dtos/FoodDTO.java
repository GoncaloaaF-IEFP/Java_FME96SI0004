package pt.iefp.jpa.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class FoodDTO {
    private long id;
    private String name;
    private double price;
    private String imageURL;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
