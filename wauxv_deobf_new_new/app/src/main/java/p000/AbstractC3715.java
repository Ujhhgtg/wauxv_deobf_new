package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᤞᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3729 f11573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1660[] f11574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Rect[][] f11575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Rect[][] f11576;

    public AbstractC3715() {
        this(new C3729());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m5259() {
        C1660[] c1660Arr = this.f11574;
        if (c1660Arr != null) {
            C1660 c1660Mo5271 = c1660Arr[0];
            C1660 c1660Mo5272 = c1660Arr[1];
            C3729 c3729 = this.f11573;
            if (c1660Mo5272 == null) {
                c1660Mo5272 = c3729.f11601.mo5271(2);
            }
            if (c1660Mo5271 == null) {
                c1660Mo5271 = c3729.f11601.mo5271(1);
            }
            mo5253(C1660.m3538(c1660Mo5271, c1660Mo5272));
            C1660 c1660 = this.f11574[AbstractC2234.m4173(16)];
            if (c1660 != null) {
                mo5255(c1660);
            }
            C1660 c1661 = this.f11574[AbstractC2234.m4173(32)];
            if (c1661 != null) {
                mo5254(c1661);
            }
            C1660 c1662 = this.f11574[AbstractC2234.m4173(64)];
            if (c1662 != null) {
                mo5256(c1662);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract C3729 mo5251();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo5258(C3729 c3729) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo5269 = c3729.f11601.mo5269(i);
            int iM4173 = AbstractC2234.m4173(i);
            this.f11575[iM4173] = (Rect[]) listMo5269.toArray(new Rect[listMo5269.size()]);
            if (i != 8) {
                List<Rect> listMo5270 = c3729.f11601.mo5270(i);
                this.f11576[iM4173] = (Rect[]) listMo5270.toArray(new Rect[listMo5270.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo5257(int i, C1660 c1660) {
        if (this.f11574 == null) {
            this.f11574 = new C1660[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f11574[AbstractC2234.m4173(i2)] = c1660;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract void mo5252(C1660 c1660);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public abstract void mo5253(C1660 c1660);

    public AbstractC3715(C3729 c3729) {
        this.f11575 = new Rect[10][];
        this.f11576 = new Rect[10][];
        this.f11573 = c3729;
        mo5258(c3729);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo5254(C1660 c1660) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo5255(C1660 c1660) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo5256(C1660 c1660) {
    }
}
