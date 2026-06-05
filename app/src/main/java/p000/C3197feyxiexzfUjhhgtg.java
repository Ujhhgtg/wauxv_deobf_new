package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛴ能不能ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3197feyxiexzfUjhhgtg implements InterfaceC3184feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final File f9880Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C3189feyxiexzfUjhhgtg f9883Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f9882Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(9);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final long f9881Ujhhgtgfeyxiexzf = 262144000;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f9879Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(26);

    public C3197feyxiexzfUjhhgtg(File file) {
        this.f9880Ujhhgtgfeyxiexzf = file;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final synchronized C3189feyxiexzfUjhhgtg m4698Ujhhgtgfeyxiexzf() {
        try {
            if (this.f9883Ujhhgtgfeyxiexzf == null) {
                this.f9883Ujhhgtgfeyxiexzf = C3189feyxiexzfUjhhgtg.m4686feyxiexzfUjhhgtg(this.f9880Ujhhgtgfeyxiexzf, this.f9881Ujhhgtgfeyxiexzf);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9883Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3184feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final File mo3704Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf) {
        String strM3944feyxiexzfUjhhgtg = this.f9879Ujhhgtgfeyxiexzf.m3944feyxiexzfUjhhgtg(interfaceC0156Ujhhgtgfeyxiexzf);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM3944feyxiexzfUjhhgtg + " for for Key: " + interfaceC0156Ujhhgtgfeyxiexzf);
        }
        try {
            C2965Ujhhgtgfeyxiexzf c2965UjhhgtgfeyxiexzfM4689Ujhhgtgfeyxiexzf = m4698Ujhhgtgfeyxiexzf().m4689Ujhhgtgfeyxiexzf(strM3944feyxiexzfUjhhgtg);
            if (c2965UjhhgtgfeyxiexzfM4689Ujhhgtgfeyxiexzf != null) {
                return ((File[]) c2965UjhhgtgfeyxiexzfM4689Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // p000.InterfaceC3184feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo3706Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        C3191feyxiexzfUjhhgtg c3191feyxiexzfUjhhgtg;
        String strM3944feyxiexzfUjhhgtg = this.f9879Ujhhgtgfeyxiexzf.m3944feyxiexzfUjhhgtg(interfaceC0156Ujhhgtgfeyxiexzf);
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f9882Ujhhgtgfeyxiexzf;
        synchronized (c2629Ujhhgtgfeyxiexzf) {
            c3191feyxiexzfUjhhgtg = (C3191feyxiexzfUjhhgtg) ((HashMap) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).get(strM3944feyxiexzfUjhhgtg);
            if (c3191feyxiexzfUjhhgtg == null) {
                C2617Ujhhgtgfeyxiexzf c2617Ujhhgtgfeyxiexzf = (C2617Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
                synchronized (c2617Ujhhgtgfeyxiexzf.f8437Ujhhgtgfeyxiexzf) {
                    c3191feyxiexzfUjhhgtg = (C3191feyxiexzfUjhhgtg) c2617Ujhhgtgfeyxiexzf.f8437Ujhhgtgfeyxiexzf.poll();
                }
                if (c3191feyxiexzfUjhhgtg == null) {
                    c3191feyxiexzfUjhhgtg = new C3191feyxiexzfUjhhgtg();
                }
                ((HashMap) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).put(strM3944feyxiexzfUjhhgtg, c3191feyxiexzfUjhhgtg);
            }
            c3191feyxiexzfUjhhgtg.f9869Ujhhgtgfeyxiexzf++;
        }
        c3191feyxiexzfUjhhgtg.f9868Ujhhgtgfeyxiexzf.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM3944feyxiexzfUjhhgtg + " for for Key: " + interfaceC0156Ujhhgtgfeyxiexzf);
            }
            try {
                C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtgM4698Ujhhgtgfeyxiexzf = m4698Ujhhgtgfeyxiexzf();
                if (c3189feyxiexzfUjhhgtgM4698Ujhhgtgfeyxiexzf.m4689Ujhhgtgfeyxiexzf(strM3944feyxiexzfUjhhgtg) == null) {
                    C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf = c3189feyxiexzfUjhhgtgM4698Ujhhgtgfeyxiexzf.m4688Ujhhgtgfeyxiexzf(strM3944feyxiexzfUjhhgtg);
                    if (c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM3944feyxiexzfUjhhgtg));
                    }
                    try {
                        if (((InterfaceC3330Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).mo2018Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf, c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.m4681Ujhhgtgfeyxiexzf(), (C1471feyxiexzfUjhhgtg) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf)) {
                            C3189feyxiexzfUjhhgtg.m4682Ujhhgtgfeyxiexzf((C3189feyxiexzfUjhhgtg) c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.f9846Ujhhgtgfeyxiexzf, c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf, true);
                            c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.f9843Ujhhgtgfeyxiexzf = true;
                        }
                        if (!c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.f9843Ujhhgtgfeyxiexzf) {
                            try {
                                c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.m4680Ujhhgtgfeyxiexzf();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.f9843Ujhhgtgfeyxiexzf) {
                            try {
                                c3187feyxiexzfUjhhgtgM4688Ujhhgtgfeyxiexzf.m4680Ujhhgtgfeyxiexzf();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.f9882Ujhhgtgfeyxiexzf.m3963feyxiexzfUjhhgtg(strM3944feyxiexzfUjhhgtg);
        } catch (Throwable th2) {
            this.f9882Ujhhgtgfeyxiexzf.m3963feyxiexzfUjhhgtg(strM3944feyxiexzfUjhhgtg);
            throw th2;
        }
    }
}
