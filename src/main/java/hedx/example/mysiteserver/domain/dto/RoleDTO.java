package hedx.example.mysiteserver.domain.dto;

import hedx.example.mysiteserver.domain.BaseData;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


@Accessors(chain = true)
@Data
public class RoleDTO implements BaseData {
    //角色id
    private Long id;
    // 角色名称
    @NotNull
    private String roleName;
    //角色字符
    @NotNull
    private String roleKey;
    // 状态（0：正常，1：停用）
    @NotNull
    private Integer status;
    // 顺序
    @NotNull
    private Long orderNum;
    // 备注
    private String remark;
    // 权限菜单id
    private List<Long> menuIds;
}
