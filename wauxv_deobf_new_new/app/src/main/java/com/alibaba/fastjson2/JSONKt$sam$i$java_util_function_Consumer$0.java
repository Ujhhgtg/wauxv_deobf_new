package com.alibaba.fastjson2;

import java.util.function.Consumer;
import p000.InterfaceC1433;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONKt$sam$i$java_util_function_Consumer$0 implements Consumer {
    private final /* synthetic */ InterfaceC1433 function;

    public JSONKt$sam$i$java_util_function_Consumer$0(InterfaceC1433 interfaceC1433) {
        this.function = interfaceC1433;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.function.invoke(obj);
    }
}
