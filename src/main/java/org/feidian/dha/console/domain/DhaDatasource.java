package org.feidian.dha.console.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xunjiu
 * @date 2022/3/25 20:48
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DhaDatasource implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String datasourceName;
    private String ip;
    private Integer port;
    private String username;
    private String password;
    private String privilege;
}