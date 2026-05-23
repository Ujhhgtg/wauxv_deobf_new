package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2869 {

    public final int f9191;

    public final int f9192;

    public final String f9193;

    public final String f9194;

    public final String f9195;

    public final long f9196;

    public int f9197;

    public final int f9198;

    public C2869 f9199;

    public C2869(int i, int i2, String str, String str2, String str3, long j, int i3) {
        this(i, i2, str, str2, str3, j);
        this.f9198 = i3;
    }

    public C2869(int i, String str, int i2, int i3) {
        this(i, i2, null, null, str, 0L);
        this.f9198 = i3;
    }

    public C2869(int i, int i2, long j, String str) {
        this(i, 129, null, null, str, j);
        this.f9198 = i2;
    }

    public C2869(int i, String str, String str2, int i2) {
        this(i, 12, null, str, str2, 0L);
        this.f9198 = i2;
    }

    public C2869(int i, int i2, long j, int i3) {
        this(i, i2, null, null, null, j);
        this.f9198 = i3;
    }

    public C2869(int i, int i2, String str, String str2, String str3, long j) {
        this.f9191 = i;
        this.f9192 = i2;
        this.f9193 = str;
        this.f9194 = str2;
        this.f9195 = str3;
        this.f9196 = j;
    }
}
