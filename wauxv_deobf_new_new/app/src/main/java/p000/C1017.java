package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᤞᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1017 implements InterfaceC1015 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC3700 f3711;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3713;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC3700 f3708 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3709 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f3710 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3712 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3715 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1045 f3716 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f3717 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f3718 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ArrayList f3719 = new ArrayList();

    public C1017(AbstractC3700 abstractC3700) {
        this.f3711 = abstractC3700;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3711.f11536.f3133);
        sb.append(":");
        switch (this.f3712) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f3717 ? Integer.valueOf(this.f3714) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3719.size());
        sb.append(":d=");
        sb.append(this.f3718.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2100(InterfaceC1015 interfaceC1015) {
        ArrayList<C1017> arrayList = this.f3719;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1017) it.next()).f3717) {
                return;
            }
        }
        this.f3710 = true;
        AbstractC3700 abstractC3700 = this.f3708;
        if (abstractC3700 != null) {
            abstractC3700.mo2100(this);
        }
        if (this.f3709) {
            this.f3711.mo2100(this);
            return;
        }
        C1017 c1017 = null;
        int i = 0;
        for (C1017 c1018 : arrayList) {
            if (!(c1018 instanceof C1045)) {
                i++;
                c1017 = c1018;
            }
        }
        if (c1017 != null && i == 1 && c1017.f3717) {
            C1045 c1045 = this.f3716;
            if (c1045 != null) {
                if (!c1045.f3717) {
                    return;
                } else {
                    this.f3713 = this.f3715 * c1045.f3714;
                }
            }
            mo2712(c1017.f3714 + this.f3713);
        }
        AbstractC3700 abstractC3701 = this.f3708;
        if (abstractC3701 != null) {
            abstractC3701.mo2100(this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2710(AbstractC3700 abstractC3700) {
        this.f3718.add(abstractC3700);
        if (this.f3717) {
            abstractC3700.mo2100(abstractC3700);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2711() {
        this.f3719.clear();
        this.f3718.clear();
        this.f3717 = false;
        this.f3714 = 0;
        this.f3710 = false;
        this.f3709 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo2712(int i) {
        if (this.f3717) {
            return;
        }
        this.f3717 = true;
        this.f3714 = i;
        for (InterfaceC1015 interfaceC1015 : this.f3718) {
            interfaceC1015.mo2100(interfaceC1015);
        }
    }
}
