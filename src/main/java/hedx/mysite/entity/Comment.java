package hedx.mysite.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    /**
     * 评论id
     */
    private Integer id;

    /**
     * 类型 (1文章 2友链 3说说)
     */
    private Integer commentType;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 父评论id
     */
    private Integer parentId;

    /**
     * 回复评论id
     */
    private Integer replyId;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 评论用户id
     */
    private Integer fromUid;

    /**
     * 回复用户id
     */
    private Integer toUid;

    /**
     * 是否通过 (0否 1是)
     */
    private Integer isCheck;

    /**
     * 评论时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}