package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1274 extends C2681 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final HashMap f4650 = new HashMap();

    @Override // p000.C2681
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2678 mo3104(Object obj) {
        return (C2678) this.f4650.get(obj);
    }

    @Override // p000.C2681
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object mo3105(Object obj) {
        Object objMo3105 = super.mo3105(obj);
        this.f4650.remove(obj);
        return objMo3105;
    }
}
