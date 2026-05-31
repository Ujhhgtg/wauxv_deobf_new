package p000;

import androidx.lifecycle.C0000;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᲈᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0937 extends AbstractC1467 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f3444;

    public /* synthetic */ C0937(Object obj, int i) {
        this.f3443 = i;
        this.f3444 = obj;
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void mo2551() {
        int i = this.f3443;
        Object obj = this.f3444;
        EnumC1793 enumC1793 = EnumC1793.f5947;
        switch (i) {
            case 0:
                C0942 c0942 = (C0942) ((C0776) obj).f2881;
                c0942.f982 = false;
                try {
                    C0000 c0000 = new C0936().f3442;
                    if (c0000.f300 != enumC1793) {
                        c0000.m99("setCurrentState");
                        c0000.m101(enumC1793);
                    }
                    break;
                } catch (Exception unused) {
                }
                AbstractC1469 abstractC1469 = AbstractC1037.f3785;
                c0942.m905(enumC1793);
                c0942.f3455 = null;
                break;
            default:
                C1993 c1993 = ((C1992) obj).f6600;
                c1993.f982 = false;
                C0936 c0936 = new C0936();
                C1993 c1994 = c1993.f6603;
                try {
                    C0000 c0001 = c0936.f3442;
                    if (c0001.f300 != enumC1793) {
                        c0001.m99("setCurrentState");
                        c0001.m101(enumC1793);
                    }
                    break;
                } catch (Exception unused2) {
                }
                AbstractC1469 abstractC14610 = AbstractC1037.f3785;
                C1993 c1995 = c1993.f6603;
                c1993.m905(enumC1793);
                c1993.getClass();
                break;
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void mo2552() {
        int i = this.f3443;
        EnumC1793 enumC1793 = EnumC1793.f5949;
        Object obj = this.f3444;
        int i2 = 1;
        switch (i) {
            case 0:
                C0776 c0776 = (C0776) obj;
                C0942 c0942 = (C0942) c0776.f2881;
                c0942.f982 = true;
                c0942.m905(enumC1793);
                try {
                    C0000 c0000 = new C0936().f3442;
                    if (c0000.f300 != enumC1793) {
                        c0000.m99("setCurrentState");
                        c0000.m101(enumC1793);
                    }
                    break;
                } catch (Exception unused) {
                }
                AbstractC1469 abstractC1469 = AbstractC1037.f3785;
                C0441 c0441 = c0942.f978;
                if (c0441 != null) {
                    c0441.m1800(c0942);
                }
                ((MaxRelativeLayout) c0776.f2880).setVisibility(8);
                break;
            default:
                C1992 c1992 = (C1992) obj;
                C1993 c1993 = c1992.f6600;
                c1993.f982 = true;
                c1993.m905(enumC1793);
                C0441 c0442 = c1993.f978;
                if (c0442 != null) {
                    c0442.m1800(c1993);
                }
                c1993.getClass();
                C0936 c0936 = new C0936();
                C1993 c1994 = c1993.f6603;
                try {
                    C0000 c0001 = c0936.f3442;
                    if (c0001.f300 != enumC1793) {
                        c0001.m99("setCurrentState");
                        c0001.m101(enumC1793);
                    }
                    break;
                } catch (Exception unused2) {
                }
                AbstractC1469 abstractC14610 = AbstractC1037.f3785;
                C1993 c1995 = c1993.f6603;
                if (c1993.f6604 == null) {
                    c1993.f6604 = new C0941(c1992, i2);
                }
                c1993.f6604.m2554(c1995);
                c1993.f983.getClass();
                if (c1993.f984) {
                    c1992.f6593.postDelayed(new RunnableC0149(this, 11), 300L);
                }
                break;
        }
    }
}
