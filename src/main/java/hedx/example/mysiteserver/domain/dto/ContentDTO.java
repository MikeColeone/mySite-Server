package hedx.example.mysiteserver.domain.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ContentDTO {

    // 类型限制
    @Pattern(regexp = "(gpt-3.5-turbo-0613|gpt-3.5-turbo-16k-0613|gpt-4|gpt-4-0613)")
    private String type;

    @Length(max = 1314)
    private String content;
}
