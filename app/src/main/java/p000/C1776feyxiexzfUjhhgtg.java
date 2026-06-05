package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1776feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final ThreadLocal f5952Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f5953Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0416Ujhhgtgfeyxiexzf f5954Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile int f5955Ujhhgtgfeyxiexzf = 0;

    public C1776feyxiexzfUjhhgtg(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf, int i) {
        this.f5954Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf;
        this.f5953Ujhhgtgfeyxiexzf = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf = m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(4);
        sb.append(Integer.toHexString(iM1223Ujhhgtgfeyxiexzf != 0 ? ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(iM1223Ujhhgtgfeyxiexzf + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf) : 0));
        sb.append(", codepoints:");
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2 = m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf2 = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.m1223Ujhhgtgfeyxiexzf(16);
        if (iM1223Ujhhgtgfeyxiexzf2 != 0) {
            int i2 = iM1223Ujhhgtgfeyxiexzf2 + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1355Ujhhgtgfeyxiexzf;
            i = ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1358Ujhhgtgfeyxiexzf).getInt(((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1358Ujhhgtgfeyxiexzf).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m3097Ujhhgtgfeyxiexzf(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m3097Ujhhgtgfeyxiexzf(int i) {
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf = m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(16);
        if (iM1223Ujhhgtgfeyxiexzf == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf;
        int i2 = iM1223Ujhhgtgfeyxiexzf + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0379Ujhhgtgfeyxiexzf m3098Ujhhgtgfeyxiexzf() {
        ThreadLocal threadLocal = f5952Ujhhgtgfeyxiexzf;
        C0379Ujhhgtgfeyxiexzf c0379Ujhhgtgfeyxiexzf = (C0379Ujhhgtgfeyxiexzf) threadLocal.get();
        if (c0379Ujhhgtgfeyxiexzf == null) {
            c0379Ujhhgtgfeyxiexzf = new C0379Ujhhgtgfeyxiexzf();
            threadLocal.set(c0379Ujhhgtgfeyxiexzf);
        }
        C0382Ujhhgtgfeyxiexzf c0382Ujhhgtgfeyxiexzf = (C0382Ujhhgtgfeyxiexzf) this.f5954Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf;
        int iM1223Ujhhgtgfeyxiexzf = c0382Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(6);
        if (iM1223Ujhhgtgfeyxiexzf != 0) {
            int i = iM1223Ujhhgtgfeyxiexzf + c0382Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf;
            int i2 = (this.f5953Ujhhgtgfeyxiexzf * 4) + ((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf;
            c0379Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf = byteBuffer;
            if (byteBuffer != null) {
                c0379Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0379Ujhhgtgfeyxiexzf.f1356Ujhhgtgfeyxiexzf = i4;
                c0379Ujhhgtgfeyxiexzf.f1357Ujhhgtgfeyxiexzf = ((ByteBuffer) c0379Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getShort(i4);
                return c0379Ujhhgtgfeyxiexzf;
            }
            c0379Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf = 0;
            c0379Ujhhgtgfeyxiexzf.f1356Ujhhgtgfeyxiexzf = 0;
            c0379Ujhhgtgfeyxiexzf.f1357Ujhhgtgfeyxiexzf = 0;
        }
        return c0379Ujhhgtgfeyxiexzf;
    }
}
