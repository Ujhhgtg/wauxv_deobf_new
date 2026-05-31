package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063 implements InterfaceC1767 {
    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object mo1068(InterfaceC0978 interfaceC0978) {
        return m1073(interfaceC0978, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public abstract Object mo1069();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public abstract int mo1070(Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public abstract Iterator mo1071(Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public abstract int mo1072(Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object m1073(InterfaceC0978 interfaceC0978, Object obj) {
        Object objMo1075 = obj != null ? mo1075(obj) : mo1069();
        int iMo1070 = mo1070(objMo1075);
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(mo1509());
        interfaceC0764Mo2636.getClass();
        while (true) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(mo1509());
            if (iMo2331 == -1) {
                interfaceC0764Mo2636.mo2329(mo1509());
                return mo1076(objMo1075);
            }
            mo1074(interfaceC0764Mo2636, iMo2331 + iMo1070, objMo1075);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public abstract void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public abstract Object mo1075(Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public abstract Object mo1076(Object obj);
}
