package com.alibaba.fastjson2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONPObject {
    private String function;
    private final List<Object> parameters = new ArrayList();

    public JSONPObject() {
    }

    public void addParameter(Object obj) {
        this.parameters.add(obj);
    }

    public String getFunction() {
        return this.function;
    }

    public List<Object> getParameters() {
        return this.parameters;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

    public JSONPObject(String str) {
        this.function = str;
    }
}
