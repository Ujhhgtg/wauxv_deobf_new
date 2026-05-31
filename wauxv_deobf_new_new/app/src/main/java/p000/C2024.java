package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᛸᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2024 extends C1896 {
    @Override // p000.C1896
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo3829(Object obj, Object obj2) {
        C2025 c2025 = (C2025) obj;
        c2025.getClass();
        ArrayDeque arrayDeque = C2025.f6758;
        synchronized (arrayDeque) {
            arrayDeque.offer(c2025);
        }
    }
}
