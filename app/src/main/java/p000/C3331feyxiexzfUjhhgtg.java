package p000;

import java.io.File;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3331feyxiexzfUjhhgtg implements InterfaceC3595feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile Object f10370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f10371Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3331feyxiexzfUjhhgtg(Object obj) {
        this.f10371Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3595feyxiexzfUjhhgtg
    public Object get() {
        if (this.f10370Ujhhgtgfeyxiexzf == null) {
            synchronized (this) {
                try {
                    if (this.f10370Ujhhgtgfeyxiexzf == null) {
                        Object obj = ((InterfaceC3595feyxiexzfUjhhgtg) this.f10371Ujhhgtgfeyxiexzf).get();
                        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(obj, "Argument must not be null");
                        this.f10370Ujhhgtgfeyxiexzf = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f10370Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public InterfaceC3184feyxiexzfUjhhgtg m4818Ujhhgtgfeyxiexzf() {
        if (((InterfaceC3184feyxiexzfUjhhgtg) this.f10370Ujhhgtgfeyxiexzf) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC3184feyxiexzfUjhhgtg) this.f10370Ujhhgtgfeyxiexzf) == null) {
                        File cacheDir = ((C3167feyxiexzfUjhhgtg) ((C0709Ujhhgtgfeyxiexzf) this.f10371Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).f9800Ujhhgtgfeyxiexzf.getCacheDir();
                        C3197feyxiexzfUjhhgtg c3197feyxiexzfUjhhgtg = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c3197feyxiexzfUjhhgtg = new C3197feyxiexzfUjhhgtg(file);
                        }
                        this.f10370Ujhhgtgfeyxiexzf = c3197feyxiexzfUjhhgtg;
                    }
                    if (((InterfaceC3184feyxiexzfUjhhgtg) this.f10370Ujhhgtgfeyxiexzf) == null) {
                        this.f10370Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(20);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC3184feyxiexzfUjhhgtg) this.f10370Ujhhgtgfeyxiexzf;
    }
}
