package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.di;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum Gender implements di {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);

    private final int value;

    Gender(int i) {
        this.value = i;
    }

    public static Gender findByValue(int i) {
        if (i == 0) {
            return MALE;
        }
        if (i == 1) {
            return FEMALE;
        }
        if (i != 2) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // com.umeng.analytics.pro.di
    public int getValue() {
        return this.value;
    }
}
