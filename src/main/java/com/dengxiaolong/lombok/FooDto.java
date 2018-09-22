package com.dengxiaolong.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
public class FooDto {
    private int id;
    private String name;
    private String email;
}
