package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONBKt {
    public static final byte[] toJSONB(boolean z) {
        return JSONB.toBytes(z);
    }

    public static final byte[] toJSONB(int i) {
        return JSONB.toBytes(i);
    }

    public static final byte[] toJSONB(long j) {
        return JSONB.toBytes(j);
    }

    public static final byte[] toJSONB(Object obj) {
        return JSONB.toBytes(obj);
    }

    public static final byte[] toJSONB(Object obj, SymbolTable symbolTable) {
        return JSONB.toBytes(obj, symbolTable);
    }

    public static final byte[] toJSONB(Object obj, SymbolTable symbolTable, JSONWriter.Feature... featureArr) {
        return JSONB.toBytes(obj, symbolTable, (JSONWriter.Feature[]) Arrays.copyOf(featureArr, featureArr.length));
    }
}
