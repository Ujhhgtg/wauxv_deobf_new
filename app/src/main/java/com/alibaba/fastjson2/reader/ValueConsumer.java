package com.alibaba.fastjson2.reader;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ValueConsumer {
    default void accept(Number number) {
    }

    default void accept(String str) {
    }

    default void accept(List list) {
    }

    default void accept(Map map) {
    }

    default void accept(boolean z) {
    }

    default void accept(byte[] bArr, int i, int i2) {
        accept(new String(bArr, i, i2, StandardCharsets.UTF_8));
    }

    default void accept(int i) {
        accept(Integer.valueOf(i));
    }

    default void accept(long j) {
        accept(Long.valueOf(j));
    }

    default void acceptNull() {
    }
}
