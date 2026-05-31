package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Scientific {
    public final boolean b;
    public final int count;
    public final int e10;
    public final long output;
    public static final Scientific SCIENTIFIC_NULL = new Scientific(0, true);
    public static final Scientific ZERO = new Scientific(0, 3, 0);
    public static final Scientific NEGATIVE_ZERO = new Scientific(0, 3, 0);
    public static final Scientific DOUBLE_MIN = new Scientific(49, 2, -324);

    public Scientific(long j, int i, int i2) {
        this.output = j;
        this.count = i;
        this.e10 = i2;
        this.b = false;
    }

    public String toString() {
        if (this == SCIENTIFIC_NULL) {
            return "null";
        }
        if (this == ZERO) {
            return "0.0";
        }
        if (this == NEGATIVE_ZERO) {
            return "-0.0";
        }
        if (this.b) {
            return "1e" + this.e10;
        }
        return this.output + "|" + this.e10;
    }

    public Scientific(int i, boolean z) {
        this.e10 = i;
        this.b = z;
        this.output = 0L;
        this.count = 0;
    }
}
