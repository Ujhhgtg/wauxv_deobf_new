package p000;

import bsh.Node;
import bsh.RunnableC0008;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3581 extends Exception {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public C1231 mo4677(Node node, C0527 c0527) {
        return mo4678(null, node, c0527);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C1231 mo4678(String str, Node node, C0527 c0527) {
        if (((Boolean) RunnableC0008.f500.get()).booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM4787 = AbstractC2844.m4787(str == null ? "" : str.concat(": "));
        sbM4787.append(getMessage());
        return new C1231(sbM4787.toString(), node, c0527, this);
    }
}
