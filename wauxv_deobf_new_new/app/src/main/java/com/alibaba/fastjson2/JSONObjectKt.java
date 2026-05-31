package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONObjectKt {
    public static final /* synthetic */ <T> T into(JSONObject jSONObject, JSONReader.Feature... featureArr) {
        return (T) jSONObject.to(new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONObjectKt$into$$inlined$reference$1
        }.getType(), (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T to(JSONObject jSONObject, JSONReader.Feature... featureArr) {
        return (T) jSONObject.to((Class) Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T to(JSONObject jSONObject, String str, JSONReader.Feature... featureArr) {
        return (T) jSONObject.getObject(str, (Class) Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T into(JSONObject jSONObject, String str, JSONReader.Feature... featureArr) {
        return (T) jSONObject.getObject(str, new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONObjectKt$into$$inlined$reference$2
        }.getType(), (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }
}
