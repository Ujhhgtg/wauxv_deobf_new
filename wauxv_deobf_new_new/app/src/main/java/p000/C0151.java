package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0151 extends WeakReference {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1772 f1206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f1207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC2624 f1208;

    public C0151(InterfaceC1772 interfaceC1772, C1226 c1226, ReferenceQueue referenceQueue) {
        super(c1226, referenceQueue);
        AbstractC2727.m4693(interfaceC1772, "Argument must not be null");
        this.f1206 = interfaceC1772;
        boolean z = c1226.f4431;
        this.f1208 = null;
        this.f1207 = z;
    }
}
