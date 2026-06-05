package p000;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2589feyxiexzfUjhhgtg implements Closeable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2598feyxiexzfUjhhgtg f8378Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f8379Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C1086feyxiexzfUjhhgtg f8380Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public byte[] f8382Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public long f8381Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f8383Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f8384Ujhhgtgfeyxiexzf = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8378Ujhhgtgfeyxiexzf == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f8378Ujhhgtgfeyxiexzf = null;
        this.f8380Ujhhgtgfeyxiexzf = null;
        this.f8381Ujhhgtgfeyxiexzf = -1L;
        this.f8382Ujhhgtgfeyxiexzf = null;
        this.f8383Ujhhgtgfeyxiexzf = -1;
        this.f8384Ujhhgtgfeyxiexzf = -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3845Ujhhgtgfeyxiexzf(long j) {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f8378Ujhhgtgfeyxiexzf;
        if (c2598feyxiexzfUjhhgtg == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f8379Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf.f4165Ujhhgtgfeyxiexzf;
                int i = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                long j4 = i - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                if (j4 > j3) {
                    c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i - ((int) j3);
                    break;
                } else {
                    c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                    AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
                    j3 -= j4;
                }
            }
            this.f8380Ujhhgtgfeyxiexzf = null;
            this.f8381Ujhhgtgfeyxiexzf = j;
            this.f8382Ujhhgtgfeyxiexzf = null;
            this.f8383Ujhhgtgfeyxiexzf = -1;
            this.f8384Ujhhgtgfeyxiexzf = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.m3867feyxiexzfUjhhgtg(i2);
                int iMin = (int) Math.min(j5, 8192 - c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf);
                int i3 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf + iMin;
                c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.f8380Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg;
                    this.f8381Ujhhgtgfeyxiexzf = j2;
                    this.f8382Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                    this.f8383Ujhhgtgfeyxiexzf = i3 - iMin;
                    this.f8384Ujhhgtgfeyxiexzf = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf = j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m3846Ujhhgtgfeyxiexzf(long j) {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f8378Ujhhgtgfeyxiexzf;
        if (c2598feyxiexzfUjhhgtg == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.f8380Ujhhgtgfeyxiexzf = null;
                    this.f8381Ujhhgtgfeyxiexzf = j;
                    this.f8382Ujhhgtgfeyxiexzf = null;
                    this.f8383Ujhhgtgfeyxiexzf = -1;
                    this.f8384Ujhhgtgfeyxiexzf = -1;
                    return -1;
                }
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = this.f8380Ujhhgtgfeyxiexzf;
                long j3 = 0;
                if (c1086feyxiexzfUjhhgtg2 != null) {
                    long j4 = this.f8381Ujhhgtgfeyxiexzf - ((long) (this.f8383Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf));
                    if (j4 > j) {
                        c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg;
                        c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = ((long) (c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf)) + j3;
                        if (j < j5) {
                            break;
                        }
                        c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf;
                        j2 -= (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
                    }
                    c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg;
                    j3 = j2;
                }
                if (this.f8379Ujhhgtgfeyxiexzf && c1086feyxiexzfUjhhgtg2.f4162Ujhhgtgfeyxiexzf) {
                    byte[] bArr = c1086feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf;
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg3 = new C1086feyxiexzfUjhhgtg(Arrays.copyOf(bArr, bArr.length), c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf, false, true);
                    if (c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf == c1086feyxiexzfUjhhgtg2) {
                        c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg3;
                    }
                    c1086feyxiexzfUjhhgtg2.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg3);
                    c1086feyxiexzfUjhhgtg3.f4165Ujhhgtgfeyxiexzf.m2555Ujhhgtgfeyxiexzf();
                    c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg3;
                }
                this.f8380Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg2;
                this.f8381Ujhhgtgfeyxiexzf = j;
                this.f8382Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf;
                int i = c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf + ((int) (j - j3));
                this.f8383Ujhhgtgfeyxiexzf = i;
                int i2 = c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf;
                this.f8384Ujhhgtgfeyxiexzf = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
    }
}
