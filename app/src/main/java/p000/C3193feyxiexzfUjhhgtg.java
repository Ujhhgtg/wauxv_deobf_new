package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3193feyxiexzfUjhhgtg extends C1076feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9871Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C3193feyxiexzfUjhhgtg.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.C1076feyxiexzfUjhhgtg, p000.C0731Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo2048Ujhhgtgfeyxiexzf(Object obj) throws C3198feyxiexzfUjhhgtg {
        mo2049Ujhhgtgfeyxiexzf(obj);
    }

    @Override // p000.C1076feyxiexzfUjhhgtg, p000.C0731Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo2049Ujhhgtgfeyxiexzf(Object obj) throws C3198feyxiexzfUjhhgtg {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f9871Ujhhgtgfeyxiexzf;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC1264feyxiexzfUjhhgtg.m2803Ujhhgtgfeyxiexzf(AbstractC2855feyxiexzfUjhhgtg.m4215feyxiexzfUjhhgtg(this.f4148Ujhhgtgfeyxiexzf), C3052Ujhhgtgfeyxiexzf.m4523Ujhhgtgfeyxiexzf(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
