package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᤞᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0703 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f2684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f2685 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashSet f2686 = new HashSet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f2687 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f2688 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f2689 = new ArrayList();

    public C0703(String str) {
        this.f2684 = str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m2222(C0703 c0703, String str, InterfaceC2715 interfaceC2715) {
        if (!c0703.f2686.add(str)) {
            StringBuilder sbM4625 = AbstractC2647.m4625("Element with name '", str, "' is already registered in ");
            sbM4625.append(c0703.f2684);
            throw new IllegalArgumentException(sbM4625.toString().toString());
        }
        c0703.f2685.add(str);
        c0703.f2687.add(interfaceC2715);
        c0703.f2688.add(C1191.f4326);
        c0703.f2689.add(false);
    }
}
