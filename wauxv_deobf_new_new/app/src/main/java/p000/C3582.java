package p000;

import bsh.Node;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3582 extends C3581 {
    public C3582(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    @Override // p000.C3581
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1231 mo4678(String str, Node node, C0527 c0527) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM2803 = AbstractC1095.m2803(str, ": ");
            sbM2803.append(getMessage());
            string = sbM2803.toString();
        }
        return new C2954(string, getCause(), node, c0527, false);
    }
}
