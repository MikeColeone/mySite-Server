package hedx.example.mysiteserver.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ChatGptIsCheckDTO {
    // 会话id
    @NotNull(message = "会话id不能为空")
    private Long id;
    // 是否通过
    @NotNull(message = "是否有效不能为空")
    private Integer isCheck;
}
