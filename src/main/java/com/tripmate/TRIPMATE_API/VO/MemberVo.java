package com.tripmate.TRIPMATE_API.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MemberVo {

    private int id;
    private String name;

    public MemberVo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}