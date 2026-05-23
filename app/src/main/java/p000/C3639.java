package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3639 {

    public static int f11380;

    public ArrayList f11381;

    public int f11382;

    public int f11383;

    public ArrayList f11384;

    public int f11385;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f11383;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM4751 = AbstractC2784.m4751(sb, this.f11382, "] <");
        for (C0793 c0793 : this.f11381) {
            StringBuilder sbM2788 = AbstractC1194.m2788(strM4751, " ");
            sbM2788.append(c0793.f3126);
            strM4751 = sbM2788.toString();
        }
        return AbstractC2784.m4748(strM4751, " >");
    }

    public final void m5224(ArrayList arrayList) {
        int size = this.f11381.size();
        if (this.f11385 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C3639 c3639 = (C3639) arrayList.get(i);
                if (this.f11385 == c3639.f11382) {
                    m5226(this.f11383, c3639);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int m5225(C1791 c1791, int i) {
        int iM3529;
        int iM35210;
        ArrayList arrayList = this.f11381;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0794 c0794 = (C0794) ((C0793) arrayList.get(0)).f3112;
        c1791.m3548();
        c0794.mo1485(c1791, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0793) arrayList.get(i2)).mo1485(c1791, false);
        }
        if (i == 0 && c0794.f3143 > 0) {
            AbstractC3471.m5064(c0794, c1791, arrayList, 0);
        }
        if (i == 1 && c0794.f3144 > 0) {
            AbstractC3471.m5064(c0794, c1791, arrayList, 1);
        }
        try {
            c1791.m3544();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f11384 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0793 c0793 = (C0793) arrayList.get(i3);
            C3552 c3552 = new C3552();
            new WeakReference(c0793);
            C1791.m3529(c0793.f3101);
            C1791.m3529(c0793.f3102);
            C1791.m3529(c0793.f3103);
            C1791.m3529(c0793.f3104);
            C1791.m3529(c0793.f3105);
            this.f11384.add(c3552);
        }
        if (i == 0) {
            iM3529 = C1791.m3529(c0794.f3101);
            iM35210 = C1791.m3529(c0794.f3103);
            c1791.m3548();
        } else {
            iM3529 = C1791.m3529(c0794.f3102);
            iM35210 = C1791.m3529(c0794.f3104);
            c1791.m3548();
        }
        return iM35210 - iM3529;
    }

    public final void m5226(int i, C3639 c3639) {
        int i2 = c3639.f11382;
        for (C0793 c0793 : this.f11381) {
            ArrayList arrayList = c3639.f11381;
            if (!arrayList.contains(c0793)) {
                arrayList.add(c0793);
            }
            if (i == 0) {
                c0793.f3132 = i2;
            } else {
                c0793.f3133 = i2;
            }
        }
        this.f11385 = i2;
    }
}
