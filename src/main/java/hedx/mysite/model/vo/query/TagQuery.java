package hedx.mysite.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标签查询条件
 *
 * @author Mike
 * @date 2023/07/29 17:35
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "标签查询条件")
public class TagQuery extends PageQuery {

    /**
     * 搜索内容
     */
    @ApiModelProperty(value = "搜索内容")
    private String keyword;

}