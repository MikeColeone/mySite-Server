package hedx.mysite.entity;


import lombok.Data;

import java.time.LocalDateTime;


@Data
public class VisitLog {
    /**
     * id
     */
    private Integer id;

    /**
     * 访问页面
     */
    private String page;

    /**
     * 访问ip
     */
    private String ipAddress;

    /**
     * 访问地址
     */
    private String ipSource;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 访问时间
     */
    private LocalDateTime createTime;

}