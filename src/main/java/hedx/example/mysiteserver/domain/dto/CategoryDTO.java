package hedx.example.mysiteserver.domain.dto;

import hedx.example.mysiteserver.domain.BaseData;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;


@Accessors(chain = true)
@Data
public class CategoryDTO implements BaseData {
    //分类id
    private Long id;
    //分类名
    @NotBlank(message = "分类名称不能为空")
    @Length(max = 20, message = "分类名称长度不能超过20")
    private String categoryName;
}
