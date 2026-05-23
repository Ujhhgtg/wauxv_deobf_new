package p000;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲀᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1687 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ArrayList f5742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ArrayList f5743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f5745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f5746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3422() {
        while (this.f5744 > this.f5745) {
            m3426();
        }
        ArrayList arrayList = this.f5743;
        this.f5745 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3423(AbstractC2707 abstractC2707) {
        ArrayList arrayList = this.f5743;
        int i = this.f5744 - this.f5745;
        this.f5745 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                this.f5742.add(abstractC2707);
                this.f5744++;
                this.f5746 = true;
                return;
            } else {
                InterfaceC2225 interfaceC2225M3426 = m3426();
                interfaceC2225M3426.mo1437(abstractC2707);
                abstractC2707.m4709(interfaceC2225M3426, i2);
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3424(AbstractC2707 abstractC2707, int i) {
        ArrayList arrayList = this.f5743;
        this.f5745 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                this.f5742.add(abstractC2707);
                this.f5744++;
                this.f5746 = true;
                return;
            } else {
                InterfaceC2225 interfaceC2225M3426 = m3426();
                interfaceC2225M3426.mo1437(abstractC2707);
                abstractC2707.m4709(interfaceC2225M3426, i2);
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3425(AbstractC2707 abstractC2707) {
        this.f5743.add(Integer.valueOf(this.f5745));
        this.f5745 = this.f5744;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2225 m3426() {
        int i = this.f5744 - 1;
        this.f5744 = i;
        if (i < this.f5745) {
            ArrayList arrayList = this.f5743;
            this.f5745 = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        }
        ArrayList arrayList2 = this.f5742;
        return (InterfaceC2225) arrayList2.remove(arrayList2.size() - 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3427() {
        this.f5742.clear();
        this.f5743.clear();
        this.f5744 = 0;
        this.f5745 = 0;
    }
}
