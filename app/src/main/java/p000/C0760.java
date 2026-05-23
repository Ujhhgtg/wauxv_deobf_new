package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0760 {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f2860 = AtomicIntegerFieldUpdater.newUpdater(C0760.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    public final Throwable f2861;

    public C0760(Throwable th, boolean z) {
        this.f2861 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2861 + ']';
    }
}
