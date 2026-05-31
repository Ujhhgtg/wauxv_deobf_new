package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᤝᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1544 extends C0792 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public C0792[] f5398 = new C0792[4];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public int f5399 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m3439(int i, C3699 c3699, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f5399; i2++) {
            C0792 c0792 = this.f5398[i2];
            ArrayList arrayList2 = c3699.f11530;
            if (!arrayList2.contains(c0792)) {
                arrayList2.add(c0792);
            }
        }
        for (int i3 = 0; i3 < this.f5399; i3++) {
            AbstractC2727.m4700(this.f5398[i3], i, arrayList, c3699);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public void mo3194() {
    }
}
