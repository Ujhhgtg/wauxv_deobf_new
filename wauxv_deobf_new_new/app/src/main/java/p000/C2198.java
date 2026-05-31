package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᤝᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2198 implements InterfaceC1444 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1433 f7249;

    public /* synthetic */ C2198(InterfaceC1433 interfaceC1433, int i) {
        this.f7248 = i;
        this.f7249 = interfaceC1433;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4141(Integer num, Integer num2, String str, Object obj) {
        switch (this.f7248) {
            case 0:
                C2421 c2421 = (C2421) this.f7249;
                C2480 c2480 = C2480.f7862;
                c2480.getClass();
                c2421.invoke(((C1714) c2480.m4408(C1714.Companion.serializer(), (byte[]) obj)).f5802);
                break;
            default:
                C2421 c2422 = (C2421) this.f7249;
                C2480 c2481 = C2480.f7862;
                c2481.getClass();
                Iterator it = ((C2250) c2481.m4408(C2250.Companion.serializer(), (byte[]) obj)).f7326.iterator();
                while (it.hasNext()) {
                    c2422.invoke(((C2249) it.next()).f7322);
                }
                break;
        }
    }
}
