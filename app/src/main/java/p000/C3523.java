package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3523 extends Exception {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public C1229 mo4643(InterfaceC2225 interfaceC2225, C0550 c0550) {
        return mo4644(null, interfaceC2225, c0550);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C1229 mo4644(String str, InterfaceC2225 interfaceC2225, C0550 c0550) {
        if (((Boolean) RunnableC1668.f5629.get()).booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM4753 = AbstractC2784.m4753(str == null ? "" : str.concat(": "));
        sbM4753.append(getMessage());
        return new C1229(sbM4753.toString(), interfaceC2225, c0550, this);
    }
}
