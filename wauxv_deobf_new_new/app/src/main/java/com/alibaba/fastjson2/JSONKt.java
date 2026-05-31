package com.alibaba.fastjson2;

import com.alibaba.fastjson2.filter.Filter;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import p000.AbstractC0580;
import p000.InterfaceC1433;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONKt {
    public static final /* synthetic */ <T> T into(String str) {
        return (T) JSON.parseObject(str, new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONKt$into$$inlined$reference$1
        }.getType());
    }

    public static final boolean isJSONArray(String str) {
        return JSON.isValidArray(str);
    }

    public static final boolean isJSONObject(String str) {
        return JSON.isValidObject(str);
    }

    public static final JSONArray parseArray(String str) {
        return JSON.parseArray(str);
    }

    public static final JSONObject parseObject(String str) {
        return JSON.parseObject(str);
    }

    public static /* synthetic */ Object parseObject$default(byte[] bArr, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            charset = AbstractC0580.UTF_8;
        }
        return JSON.parseObject(bArr, i, i2, charset, Object.class);
    }

    public static final /* synthetic */ <T> T to(String str) {
        return (T) JSON.parseObject(str, Object.class);
    }

    public static final byte[] toJSONByteArray(Object obj) {
        return JSON.toJSONBytes(obj);
    }

    public static final String toJSONString(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static final boolean isJSONArray(byte[] bArr) {
        return JSON.isValidArray(bArr);
    }

    public static final boolean isJSONObject(byte[] bArr) {
        return JSON.isValidObject(bArr);
    }

    public static final JSONObject parseObject(byte[] bArr) {
        return JSON.parseObject(bArr);
    }

    public static final byte[] toJSONByteArray(Object obj, Filter[] filterArr) {
        return JSON.toJSONBytes(obj, filterArr, new JSONWriter.Feature[0]);
    }

    public static final String toJSONString(Object obj, Filter[] filterArr) {
        return JSON.toJSONString(obj, filterArr, new JSONWriter.Feature[0]);
    }

    public static final JSONObject parseObject(String str, JSONReader.Feature... featureArr) {
        return JSON.parseObject(str, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T to(byte[] bArr) {
        return (T) JSON.parseObject(bArr, Object.class);
    }

    public static final /* synthetic */ <T> T into(byte[] bArr) {
        return (T) JSON.parseObject(bArr, new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONKt$into$$inlined$reference$2
        }.getType());
    }

    public static final byte[] toJSONByteArray(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONBytes(obj, (JSONWriter.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, (JSONWriter.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        return JSON.parseObject(bArr, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static /* synthetic */ void parseObject$default(Reader reader, char c, InterfaceC1433 interfaceC1433, int i, Object obj) {
        if ((i & 1) != 0) {
            c = '\n';
        }
        JSON.parseObject(reader, c, Object.class, new JSONKt$sam$i$java_util_function_Consumer$0(interfaceC1433));
    }

    public static final /* synthetic */ <T> T to(URL url, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(url, Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final byte[] toJSONByteArray(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        return JSON.toJSONBytes(obj, filterArr, (JSONWriter.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final String toJSONString(Object obj, Filter filter, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, filter, (JSONWriter.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T into(URL url, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(url, new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONKt$into$$inlined$reference$3
        }.getType(), (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final JSONObject parseObject(Reader reader, JSONReader.Feature... featureArr) {
        return JSON.parseObject(reader, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static /* synthetic */ void parseObject$default(InputStream inputStream, Charset charset, char c, JSONReader.Feature[] featureArr, InterfaceC1433 interfaceC1433, int i, Object obj) {
        if ((i & 2) != 0) {
            c = '\n';
        }
        JSON.parseObject(inputStream, charset, c, Object.class, new JSONKt$sam$i$java_util_function_Consumer$0(interfaceC1433), (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T to(InputStream inputStream, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(inputStream, Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final String toJSONString(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, filterArr, (JSONWriter.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final JSONObject parseObject(InputStream inputStream, JSONReader.Feature... featureArr) {
        return JSON.parseObject(inputStream, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T into(InputStream inputStream, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(inputStream, new TypeReference<T>() { // from class: com.alibaba.fastjson2.JSONKt$into$$inlined$reference$4
        }.getType(), (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    /* JADX INFO: renamed from: parseObject, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m581parseObject(String str) {
        return (T) JSON.parseObject(str, Object.class);
    }

    /* JADX INFO: renamed from: parseObject, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m582parseObject(String str, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T parseObject(String str, Filter filter, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, Object.class, filter, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    /* JADX INFO: renamed from: parseObject, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m583parseObject(byte[] bArr) {
        return (T) JSON.parseObject(bArr, Object.class);
    }

    /* JADX INFO: renamed from: parseObject, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m584parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(bArr, Object.class, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T parseObject(byte[] bArr, Filter filter, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(bArr, Object.class, filter, (JSONReader.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }

    public static final /* synthetic */ <T> T parseObject(byte[] bArr, int i, int i2, Charset charset) {
        return (T) JSON.parseObject(bArr, i, i2, charset, Object.class);
    }
}
