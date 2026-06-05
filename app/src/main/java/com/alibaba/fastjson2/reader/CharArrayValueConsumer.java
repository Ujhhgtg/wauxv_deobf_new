package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface CharArrayValueConsumer<T> {
    void accept(int i, int i2, char[] cArr, int i3, int i4);

    default void end() {
    }

    default void start() {
    }

    default void afterRow(int i) {
    }

    default void beforeRow(int i) {
    }
}
