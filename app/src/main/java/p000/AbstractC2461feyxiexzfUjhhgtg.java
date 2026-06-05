package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2461feyxiexzfUjhhgtg extends AbstractC1937feyxiexzfUjhhgtg {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m3693Ujhhgtgfeyxiexzf(), ((AbstractC2461feyxiexzfUjhhgtg) obj).m3693Ujhhgtgfeyxiexzf());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m3693Ujhhgtgfeyxiexzf()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final byte[] m3693Ujhhgtgfeyxiexzf() {
        C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf = new C3470Ujhhgtgfeyxiexzf();
        mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf);
        int i = c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf;
        int iCapacity = c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf.capacity() - c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf;
        if (!c3470Ujhhgtgfeyxiexzf.f10788Ujhhgtgfeyxiexzf) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf.position(i);
        c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf.get(bArr);
        return bArr;
    }
}
