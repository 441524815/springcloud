package com.zz.enums;

/**
 * Created by caochunpeng on 2020-02-21
 */
public enum YesOrNo {

    NO(0,"否"),
    YES(1,"是"),
    ISMAIN(0,"是主图"),
    NOMAIN(1,"不是主图");

    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }}
