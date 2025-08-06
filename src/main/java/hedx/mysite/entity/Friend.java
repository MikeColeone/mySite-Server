package hedx.mysite.entity;


import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Friend {

    /**
     * 友链id
     */
    private Integer id;

    /**
     * 友链名称
     */
    private String name;

    /**
     * 友链颜色
     */
    private String color;

    /**
     * 友链头像
     */
    private String avatar;

    /**
     * 友链地址
     */
    private String url;

    /**
     * 友链介绍
     */
    private String introduction;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}