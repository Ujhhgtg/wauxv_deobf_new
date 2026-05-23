package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0143 extends WeakReference {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1749 f1138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f1139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC2568 f1140;

    public C0143(InterfaceC1749 interfaceC1749, C1224 c1224, ReferenceQueue referenceQueue) {
        super(c1224, referenceQueue);
        AbstractC1460.m3210(interfaceC1749, "Argument must not be null");
        this.f1138 = interfaceC1749;
        boolean z = c1224.f4432;
        this.f1140 = null;
        this.f1139 = z;
    }
}
