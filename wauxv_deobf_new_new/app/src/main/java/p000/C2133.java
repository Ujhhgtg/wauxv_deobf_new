package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲁᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2133 implements InterfaceC0958, InterfaceC0957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f7044;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2431 f7045;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7046;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public EnumC2454 f7047;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC0957 f7048;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f7049;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f7050;

    public C2133(ArrayList arrayList, InterfaceC2431 interfaceC2431) {
        this.f7045 = interfaceC2431;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f7044 = arrayList;
        this.f7046 = 0;
    }

    @Override // p000.InterfaceC0958
    public final void cancel() {
        this.f7050 = true;
        Iterator it = this.f7044.iterator();
        while (it.hasNext()) {
            ((InterfaceC0958) it.next()).cancel();
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1537() {
        return ((InterfaceC0958) this.f7044.get(0)).mo1537();
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1949() {
        List list = this.f7049;
        if (list != null) {
            this.f7045.mo1457(list);
        }
        this.f7049 = null;
        Iterator it = this.f7044.iterator();
        while (it.hasNext()) {
            ((InterfaceC0958) it.next()).mo1949();
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1950(EnumC2454 enumC2454, InterfaceC0957 interfaceC0957) {
        this.f7047 = enumC2454;
        this.f7048 = interfaceC0957;
        this.f7049 = (List) this.f7045.mo1458();
        ((InterfaceC0958) this.f7044.get(this.f7046)).mo1950(enumC2454, this);
        if (this.f7050) {
            cancel();
        }
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1976(Exception exc) {
        List list = this.f7049;
        AbstractC2727.m4693(list, "Argument must not be null");
        list.add(exc);
        m4075();
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1951() {
        return ((InterfaceC0958) this.f7044.get(0)).mo1951();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4075() {
        if (this.f7050) {
            return;
        }
        if (this.f7046 < this.f7044.size() - 1) {
            this.f7046++;
            mo1950(this.f7047, this.f7048);
        } else {
            AbstractC2727.m4692(this.f7049);
            this.f7048.mo1976(new C1474("Fetch failed", new ArrayList(this.f7049)));
        }
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1977(Object obj) {
        if (obj != null) {
            this.f7048.mo1977(obj);
        } else {
            m4075();
        }
    }
}
