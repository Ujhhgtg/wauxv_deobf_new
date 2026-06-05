package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2874Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9138Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C2874Ujhhgtgfeyxiexzf.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Throwable f9139Ujhhgtgfeyxiexzf;

    public C2874Ujhhgtgfeyxiexzf(Throwable th, boolean z) {
        this.f9139Ujhhgtgfeyxiexzf = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f9139Ujhhgtgfeyxiexzf + ']';
    }
}
