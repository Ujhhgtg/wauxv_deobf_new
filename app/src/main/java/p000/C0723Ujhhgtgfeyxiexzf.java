package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴᛲᛳᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0723Ujhhgtgfeyxiexzf implements InterfaceC0665Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2987Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C0723Ujhhgtgfeyxiexzf.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2988Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0723Ujhhgtgfeyxiexzf.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2989Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0723Ujhhgtgfeyxiexzf.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1288feyxiexzfUjhhgtg f2990Ujhhgtgfeyxiexzf;

    public C0723Ujhhgtgfeyxiexzf(C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtg, Throwable th) {
        this.f2990Ujhhgtgfeyxiexzf = c1288feyxiexzfUjhhgtg;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m2042Ujhhgtgfeyxiexzf());
        sb.append(", completing=");
        sb.append(f2987Ujhhgtgfeyxiexzf.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m2041Ujhhgtgfeyxiexzf());
        sb.append(", exceptions=");
        sb.append(f2989Ujhhgtgfeyxiexzf.get(this));
        sb.append(", list=");
        sb.append(this.f2990Ujhhgtgfeyxiexzf);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2040Ujhhgtgfeyxiexzf(Throwable th) {
        Throwable thM2041Ujhhgtgfeyxiexzf = m2041Ujhhgtgfeyxiexzf();
        if (thM2041Ujhhgtgfeyxiexzf == null) {
            f2988Ujhhgtgfeyxiexzf.set(this, th);
            return;
        }
        if (th == thM2041Ujhhgtgfeyxiexzf) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2989Ujhhgtgfeyxiexzf;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // p000.InterfaceC0665Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo1932Ujhhgtgfeyxiexzf() {
        return m2041Ujhhgtgfeyxiexzf() == null;
    }

    @Override // p000.InterfaceC0665Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final C1288feyxiexzfUjhhgtg mo1933Ujhhgtgfeyxiexzf() {
        return this.f2990Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Throwable m2041Ujhhgtgfeyxiexzf() {
        return (Throwable) f2988Ujhhgtgfeyxiexzf.get(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean m2042Ujhhgtgfeyxiexzf() {
        return m2041Ujhhgtgfeyxiexzf() != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList m2043Ujhhgtgfeyxiexzf(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2989Ujhhgtgfeyxiexzf;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM2041Ujhhgtgfeyxiexzf = m2041Ujhhgtgfeyxiexzf();
        if (thM2041Ujhhgtgfeyxiexzf != null) {
            arrayList.add(0, thM2041Ujhhgtgfeyxiexzf);
        }
        if (th != null && !th.equals(thM2041Ujhhgtgfeyxiexzf)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC3085Ujhhgtgfeyxiexzf.f9543Ujhhgtgfeyxiexzf);
        return arrayList;
    }
}
