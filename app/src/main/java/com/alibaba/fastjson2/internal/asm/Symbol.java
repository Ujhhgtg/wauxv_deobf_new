package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class Symbol {
    final long data;
    final int hashCode;
    final int index;
    int info;
    final String name;
    Symbol next;
    final String owner;
    final int tag;
    final String value;

    public Symbol(int i, int i2, String str, String str2, String str3, long j, int i3) {
        this.index = i;
        this.tag = i2;
        this.owner = str;
        this.name = str2;
        this.value = str3;
        this.data = j;
        this.hashCode = i3;
    }

    public int getArgumentsAndReturnSizes() {
        if (this.info == 0) {
            this.info = Type.getArgumentsAndReturnSizes(this.value);
        }
        return this.info;
    }
}
