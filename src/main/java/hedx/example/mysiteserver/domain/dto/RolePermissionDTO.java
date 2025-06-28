package hedx.example.mysiteserver.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class RolePermissionDTO {
    @NotNull(message = "权限不能为空")
    private List<Long> permissionId;
    @NotNull(message = "选择的角色不能为空")
    private List<Long> roleId;
}
