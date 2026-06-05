package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ要点脸ᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0806feyxiexzfUjhhgtg implements InterfaceC2596feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC1026feyxiexzfUjhhgtg f3194Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2598feyxiexzfUjhhgtg f3195Ujhhgtgfeyxiexzf = new C2598feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f3196Ujhhgtgfeyxiexzf;

    public C0806feyxiexzfUjhhgtg(InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg) {
        this.f3194Ujhhgtgfeyxiexzf = interfaceC1026feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg = this.f3194Ujhhgtgfeyxiexzf;
        if (this.f3196Ujhhgtgfeyxiexzf) {
            return;
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3195Ujhhgtgfeyxiexzf;
        long j = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
        if (j > 0) {
            interfaceC1026feyxiexzfUjhhgtg.write(c2598feyxiexzfUjhhgtg, j);
        }
        th = null;
        try {
            interfaceC1026feyxiexzfUjhhgtg.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f3196Ujhhgtgfeyxiexzf = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg, p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
    public final void flush() {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3195Ujhhgtgfeyxiexzf;
        long j = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
        InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg = this.f3194Ujhhgtgfeyxiexzf;
        if (j > 0) {
            interfaceC1026feyxiexzfUjhhgtg.write(c2598feyxiexzfUjhhgtg, j);
        }
        interfaceC1026feyxiexzfUjhhgtg.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3196Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f3194Ujhhgtgfeyxiexzf.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f3194Ujhhgtgfeyxiexzf + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f3195Ujhhgtgfeyxiexzf.write(byteBuffer);
        mo2148Ujhhgtgfeyxiexzf();
        return iWrite;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final InterfaceC2596feyxiexzfUjhhgtg writeByte(int i) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3869feyxiexzfUjhhgtg(i);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final InterfaceC2596feyxiexzfUjhhgtg writeInt(int i) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3872feyxiexzfUjhhgtg(i);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final InterfaceC2596feyxiexzfUjhhgtg writeShort(int i) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3874feyxiexzfUjhhgtg(i);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2598feyxiexzfUjhhgtg mo2145Ujhhgtgfeyxiexzf() {
        return this.f3195Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2146Ujhhgtgfeyxiexzf() {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3195Ujhhgtgfeyxiexzf;
        long j = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
        if (j > 0) {
            this.f3194Ujhhgtgfeyxiexzf.write(c2598feyxiexzfUjhhgtg, j);
        }
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final long mo2147Ujhhgtgfeyxiexzf(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        long j = 0;
        while (true) {
            long j2 = interfaceC1227feyxiexzfUjhhgtg.read(this.f3195Ujhhgtgfeyxiexzf, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            mo2148Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2148Ujhhgtgfeyxiexzf() {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3195Ujhhgtgfeyxiexzf;
        long j = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
        if (j == 0) {
            j = 0;
        } else {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf.f4165Ujhhgtgfeyxiexzf;
            int i = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            if (i < 8192 && c1086feyxiexzfUjhhgtg.f4163Ujhhgtgfeyxiexzf) {
                j -= (long) (i - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            }
        }
        if (j > 0) {
            this.f3194Ujhhgtgfeyxiexzf.write(c2598feyxiexzfUjhhgtg, j);
        }
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2149Ujhhgtgfeyxiexzf(String str) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3877feyxiexzfUjhhgtg(str);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2150Ujhhgtgfeyxiexzf(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3868feyxiexzfUjhhgtg(c2633Ujhhgtgfeyxiexzf);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2151Ujhhgtgfeyxiexzf(long j) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3871feyxiexzfUjhhgtg(j);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2152feyxiexzfUjhhgtg(int i, int i2, byte[] bArr) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.write(bArr, i, i2);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2153feyxiexzfUjhhgtg(long j) {
        if (this.f3196Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        this.f3195Ujhhgtgfeyxiexzf.m3870feyxiexzfUjhhgtg(j);
        mo2148Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        if (!this.f3196Ujhhgtgfeyxiexzf) {
            this.f3195Ujhhgtgfeyxiexzf.write(c2598feyxiexzfUjhhgtg, j);
            mo2148Ujhhgtgfeyxiexzf();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final InterfaceC2596feyxiexzfUjhhgtg write(byte[] bArr) {
        if (!this.f3196Ujhhgtgfeyxiexzf) {
            this.f3195Ujhhgtgfeyxiexzf.write(bArr, 0, bArr.length);
            mo2148Ujhhgtgfeyxiexzf();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
