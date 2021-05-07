package com.brave.solid.domain.entity;

import lombok.Data;

import java.util.List;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description
 * @createTime 2020年09月25日 14:01:00
 */
@Data
public class HostIps {
    private List<String> ips;
}
