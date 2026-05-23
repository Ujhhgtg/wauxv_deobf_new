package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONArrayKt {
    public static final /* synthetic */ <T> T into(JSONArray jSONArray) {
        return (T) jSONArray.to(new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONArrayKt$into$$inlined$reference$1
        }.getType());
    }

    public static final /* synthetic */ <T> T to(JSONArray jSONArray) {
        return (T) jSONArray.to((Class) Object.class);
    }

    public static final /* synthetic */ <T> T to(JSONArray jSONArray, int i, JSONReader.Feature... featureArr) {
        return (T) jSONArray.getObject(i, (Class) Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T into(JSONArray jSONArray, int i, JSONReader.Feature... featureArr) {
        return (T) jSONArray.getObject(i, new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONArrayKt$into$$inlined$reference$2
        }.getType(), (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }
}
