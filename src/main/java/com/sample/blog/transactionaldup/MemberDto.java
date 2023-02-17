package com.sample.blog.transactionaldup;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private Long id;
    private String name;
    private String deleteYn = "N";
}
