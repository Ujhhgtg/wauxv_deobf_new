package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱ能不能ᛳᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3540Ujhhgtgfeyxiexzf implements InterfaceC1227feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f11059Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2595feyxiexzfUjhhgtg f11060Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3539Ujhhgtgfeyxiexzf f11061Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0806feyxiexzfUjhhgtg f11062Ujhhgtgfeyxiexzf;

    public C3540Ujhhgtgfeyxiexzf(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, C3539Ujhhgtgfeyxiexzf c3539Ujhhgtgfeyxiexzf, C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg) {
        this.f11060Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg;
        this.f11061Ujhhgtgfeyxiexzf = c3539Ujhhgtgfeyxiexzf;
        this.f11062Ujhhgtgfeyxiexzf = c0806feyxiexzfUjhhgtg;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f11059Ujhhgtgfeyxiexzf && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.f11059Ujhhgtgfeyxiexzf = true;
            this.f11061Ujhhgtgfeyxiexzf.abort();
        }
        this.f11060Ujhhgtgfeyxiexzf.close();
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        try {
            long j2 = this.f11060Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, j);
            C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg = this.f11062Ujhhgtgfeyxiexzf;
            if (j2 == -1) {
                if (!this.f11059Ujhhgtgfeyxiexzf) {
                    this.f11059Ujhhgtgfeyxiexzf = true;
                    c0806feyxiexzfUjhhgtg.close();
                }
                return -1L;
            }
            c2598feyxiexzfUjhhgtg.m3858Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf - j2, c0806feyxiexzfUjhhgtg.f3195Ujhhgtgfeyxiexzf, j2);
            c0806feyxiexzfUjhhgtg.mo2148Ujhhgtgfeyxiexzf();
            return j2;
        } catch (IOException e) {
            if (this.f11059Ujhhgtgfeyxiexzf) {
                throw e;
            }
            this.f11059Ujhhgtgfeyxiexzf = true;
            this.f11061Ujhhgtgfeyxiexzf.abort();
            throw e;
        }
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f11060Ujhhgtgfeyxiexzf.timeout();
    }
}
