package com.alibaba.fastjson2;

import java.util.function.Consumer;
import p000.InterfaceC1425;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONKt$sam$i$java_util_function_Consumer$0 implements Consumer {
    private final /* synthetic */ InterfaceC1425 function;

    public JSONKt$sam$i$java_util_function_Consumer$0(InterfaceC1425 interfaceC1425) {
        this.function = interfaceC1425;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.function.invoke(obj);
    }
}
