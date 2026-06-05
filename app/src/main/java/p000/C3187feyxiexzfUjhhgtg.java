package p000;

import java.io.File;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3187feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f9843Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f9844Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f9845Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f9846Ujhhgtgfeyxiexzf;

    public C3187feyxiexzfUjhhgtg(C3331feyxiexzfUjhhgtg c3331feyxiexzfUjhhgtg, C1029feyxiexzfUjhhgtg c1029feyxiexzfUjhhgtg) {
        this.f9846Ujhhgtgfeyxiexzf = new C1031feyxiexzfUjhhgtg(this);
        this.f9845Ujhhgtgfeyxiexzf = c3331feyxiexzfUjhhgtg;
        this.f9844Ujhhgtgfeyxiexzf = c1029feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m4680Ujhhgtgfeyxiexzf() {
        C3189feyxiexzfUjhhgtg.m4682Ujhhgtgfeyxiexzf((C3189feyxiexzfUjhhgtg) this.f9846Ujhhgtgfeyxiexzf, this, false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public File m4681Ujhhgtgfeyxiexzf() {
        File file;
        synchronized (((C3189feyxiexzfUjhhgtg) this.f9846Ujhhgtgfeyxiexzf)) {
            try {
                C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) this.f9844Ujhhgtgfeyxiexzf;
                if (c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf != this) {
                    throw new IllegalStateException();
                }
                if (!c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf) {
                    ((boolean[]) this.f9845Ujhhgtgfeyxiexzf)[0] = true;
                }
                file = c3190feyxiexzfUjhhgtg.f9864Ujhhgtgfeyxiexzf[0];
                ((C3189feyxiexzfUjhhgtg) this.f9846Ujhhgtgfeyxiexzf).f9847Ujhhgtgfeyxiexzf.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C3187feyxiexzfUjhhgtg(C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg, C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg) {
        this.f9846Ujhhgtgfeyxiexzf = c3189feyxiexzfUjhhgtg;
        this.f9844Ujhhgtgfeyxiexzf = c3190feyxiexzfUjhhgtg;
        this.f9845Ujhhgtgfeyxiexzf = c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf ? null : new boolean[c3189feyxiexzfUjhhgtg.f9853Ujhhgtgfeyxiexzf];
    }
}
