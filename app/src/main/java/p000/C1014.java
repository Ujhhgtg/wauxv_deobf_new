package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲁᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1014 implements InterfaceC1012 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC3640 f3704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC3640 f3701 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3702 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f3703 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3705 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3708 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1042 f3709 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f3710 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f3711 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ArrayList f3712 = new ArrayList();

    public C1014(AbstractC3640 abstractC3640) {
        this.f3704 = abstractC3640;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3704.f11387.f3126);
        sb.append(":");
        switch (this.f3705) {
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
        sb.append(this.f3710 ? Integer.valueOf(this.f3707) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3712.size());
        sb.append(":d=");
        sb.append(this.f3711.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2003(InterfaceC1012 interfaceC1012) {
        ArrayList<C1014> arrayList = this.f3712;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1014) it.next()).f3710) {
                return;
            }
        }
        this.f3703 = true;
        AbstractC3640 abstractC3640 = this.f3701;
        if (abstractC3640 != null) {
            abstractC3640.mo2003(this);
        }
        if (this.f3702) {
            this.f3704.mo2003(this);
            return;
        }
        C1014 c1014 = null;
        int i = 0;
        for (C1014 c1015 : arrayList) {
            if (!(c1015 instanceof C1042)) {
                i++;
                c1014 = c1015;
            }
        }
        if (c1014 != null && i == 1 && c1014.f3710) {
            C1042 c1042 = this.f3709;
            if (c1042 != null) {
                if (!c1042.f3710) {
                    return;
                } else {
                    this.f3706 = this.f3708 * c1042.f3707;
                }
            }
            mo2588(c1014.f3707 + this.f3706);
        }
        AbstractC3640 abstractC3641 = this.f3701;
        if (abstractC3641 != null) {
            abstractC3641.mo2003(this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2586(AbstractC3640 abstractC3640) {
        this.f3711.add(abstractC3640);
        if (this.f3710) {
            abstractC3640.mo2003(abstractC3640);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2587() {
        this.f3712.clear();
        this.f3711.clear();
        this.f3710 = false;
        this.f3707 = 0;
        this.f3703 = false;
        this.f3702 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo2588(int i) {
        if (this.f3710) {
            return;
        }
        this.f3710 = true;
        this.f3707 = i;
        for (InterfaceC1012 interfaceC1012 : this.f3711) {
            interfaceC1012.mo2003(interfaceC1012);
        }
    }
}
