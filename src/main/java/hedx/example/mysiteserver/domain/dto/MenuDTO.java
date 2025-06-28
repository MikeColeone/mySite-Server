package hedx.example.mysiteserver.domain.dto;

import hedx.example.mysiteserver.domain.BaseData;
import lombok.Data;

import java.util.List;


@Data
public class MenuDTO implements BaseData {
    private Long id;
    private Long parentId;
    private String title;
    private List<Long> roleId;
    private Integer orderNum;
    private String icon;
    private Integer routerType;
    private String component;
    private String redirect;
    private String path;
    private String url;
    private String target;
    private Integer affix;
    private Integer keepAlive;
    private Integer hideInMenu;
    private Integer isDisable;
}
