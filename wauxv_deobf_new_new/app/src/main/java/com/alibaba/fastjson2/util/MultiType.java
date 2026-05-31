package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSON;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MultiType implements Type {
    private final Type[] types;

    public MultiType(Type... typeArr) {
        this.types = typeArr;
    }

    public Type getType(int i) {
        return this.types[i];
    }

    public int size() {
        return this.types.length;
    }

    public String toString() {
        return JSON.toJSONString(this.types);
    }
}
