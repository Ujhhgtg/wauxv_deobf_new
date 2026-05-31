package com.alibaba.fastjson2.function;

import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FieldBiConsumer<T> implements BiConsumer<T, Object> {
    public final FieldConsumer<T> consumer;
    public final int fieldIndex;

    public FieldBiConsumer(int i, FieldConsumer<T> fieldConsumer) {
        this.fieldIndex = i;
        this.consumer = fieldConsumer;
    }

    @Override // java.util.function.BiConsumer
    public void accept(T t, Object obj) {
        this.consumer.accept(t, this.fieldIndex, obj);
    }
}
