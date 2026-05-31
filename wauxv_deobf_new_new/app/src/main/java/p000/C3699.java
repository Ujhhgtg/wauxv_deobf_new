package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3699 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static int f11529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public ArrayList f11530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f11531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f11532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ArrayList f11533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f11534;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f11532;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM4785 = AbstractC2844.m4785(sb, this.f11531, "] <");
        for (C0792 c0792 : this.f11530) {
            StringBuilder sbM2803 = AbstractC1095.m2803(strM4785, " ");
            sbM2803.append(c0792.f3133);
            strM4785 = sbM2803.toString();
        }
        return AbstractC2844.m4782(strM4785, " >");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m5230(ArrayList arrayList) {
        int size = this.f11530.size();
        if (this.f11534 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C3699 c3699 = (C3699) arrayList.get(i);
                if (this.f11534 == c3699.f11531) {
                    m5232(this.f11532, c3699);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m5231(C1814 c1814, int i) {
        int iM3701;
        int iM3702;
        ArrayList arrayList = this.f11530;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0793 c0793 = (C0793) ((C0792) arrayList.get(0)).f3119;
        c1814.m3720();
        c0793.mo1590(c1814, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0792) arrayList.get(i2)).mo1590(c1814, false);
        }
        if (i == 0 && c0793.f3150 > 0) {
            AbstractC2236.m4223(c0793, c1814, arrayList, 0);
        }
        if (i == 1 && c0793.f3151 > 0) {
            AbstractC2236.m4223(c0793, c1814, arrayList, 1);
        }
        try {
            c1814.m3716();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f11533 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0792 c0792 = (C0792) arrayList.get(i3);
            C3610 c3610 = new C3610();
            new WeakReference(c0792);
            C1814.m3701(c0792.f3108);
            C1814.m3701(c0792.f3109);
            C1814.m3701(c0792.f3110);
            C1814.m3701(c0792.f3111);
            C1814.m3701(c0792.f3112);
            this.f11533.add(c3610);
        }
        if (i == 0) {
            iM3701 = C1814.m3701(c0793.f3108);
            iM3702 = C1814.m3701(c0793.f3110);
            c1814.m3720();
        } else {
            iM3701 = C1814.m3701(c0793.f3109);
            iM3702 = C1814.m3701(c0793.f3111);
            c1814.m3720();
        }
        return iM3702 - iM3701;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m5232(int i, C3699 c3699) {
        int i2 = c3699.f11531;
        for (C0792 c0792 : this.f11530) {
            ArrayList arrayList = c3699.f11530;
            if (!arrayList.contains(c0792)) {
                arrayList.add(c0792);
            }
            if (i == 0) {
                c0792.f3139 = i2;
            } else {
                c0792.f3140 = i2;
            }
        }
        this.f11534 = i2;
    }
}
