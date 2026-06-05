package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0696Ujhhgtgfeyxiexzf extends AbstractC0722Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2851Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C0696Ujhhgtgfeyxiexzf.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0726Ujhhgtgfeyxiexzf f2852Ujhhgtgfeyxiexzf;

    public C0696Ujhhgtgfeyxiexzf(C0726Ujhhgtgfeyxiexzf c0726Ujhhgtgfeyxiexzf) {
        this.f2852Ujhhgtgfeyxiexzf = c0726Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0722Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo1974Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.AbstractC0722Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo1975Ujhhgtgfeyxiexzf(Throwable th) {
        if (f2851Ujhhgtgfeyxiexzf.compareAndSet(this, 0, 1)) {
            this.f2852Ujhhgtgfeyxiexzf.invoke(th);
        }
    }
}
