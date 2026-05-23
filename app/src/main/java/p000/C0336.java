package p000;

import bsh.AbstractC0009;
import bsh.C0004;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0336 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f1597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C2000 f1598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f1599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public EnumC0703 f1601;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public Class f1602;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1597;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final synchronized Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        try {
            if (this.f1602 == null) {
                this.f1602 = m1451(c0550, runnableC1668);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1602;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Class m1451(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        int i;
        Class cls;
        C0501 c0501M389;
        int i2 = 0;
        ArrayList<C0501> arrayList = new ArrayList(0);
        if (this.f1600) {
            Class clsM1432 = ((C0326) this.f8721[0]).m1432(c0550);
            try {
                Iterator it = RunnableC1668.f5631.f6229.iterator();
                while (it.hasNext()) {
                    
                }
                if (AbstractC0009.m401(clsM1432)) {
                    if (AbstractC0009.m382(clsM1432).m3864("final")) {
                        throw new C1230("Cannot inherit from final class ".concat(clsM1432.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) AbstractC0009.m384(clsM1432)).filter(new C0335(0)).collect(Collectors.toList()));
                }
                cls = clsM1432;
                i = 1;
            } catch (C3523 e) {
                throw e.mo4643(this, c0550);
            }
        } else {
            i = 0;
            cls = null;
        }
        Class[] clsArr = new Class[this.f1599];
        int i3 = 0;
        while (i3 < this.f1599) {
            int i4 = i + 1;
            C0326 c0326 = (C0326) this.f8721[i];
            Class clsM1433 = c0326.m1432(c0550);
            clsArr[i3] = clsM1433;
            if (!clsM1433.isInterface()) {
                throw new C1230(AbstractC2784.m4752(new StringBuilder("Type: "), c0326.f1577, " is not an interface!"), this, c0550);
            }
            try {
                C1883 c1883 = RunnableC1668.f5631;
                Class cls2 = clsArr[i3];
                Iterator it2 = c1883.f6229.iterator();
                while (it2.hasNext()) {
                    if (!((InterfaceC2645) it2.next()).mo3657(cls2)) {
                        int i5 = 0;
                        throw new C2644("Can't implement this interface: ".concat(cls2.getName()));
                    }
                }
                i3++;
                i = i4;
            } catch (C3523 e2) {
                throw e2.mo4643(this, c0550);
            }
        }
        C0333 c0333 = (C0333) this.f8721[i];
        if (this.f1601 == EnumC0703.f2679) {
            C2000 c2000 = this.f1598;
            int i6 = c2000.f6669;
            c2000.f6669 = 0;
            c2000.m3861(1);
            for (int i7 = 1; i7 <= i6; i7 *= 2) {
                if ((i6 & i7) != 0) {
                    c2000.m3859(i7);
                }
            }
        }
        if (C0004.f472 == null) {
            C0004.f472 = new C0004();
        }
        C0004 c0004 = C0004.f472;
        String str = this.f1597;
        C2000 c2001 = this.f1598;
        EnumC0703 enumC0703 = this.f1601;
        
        Class clsM317 = C0004.m317(str, c2001, clsArr, cls, c0333, enumC0703, c0550, runnableC1668);
        for (C0501 c0501 : arrayList) {
            String strM1748 = c0501.m1748();
            Class[] clsArrMo1751 = c0501.mo1751();
            if (AbstractC0009.m401(clsM317)) {
                c0501M389 = AbstractC0009.m389(AbstractC0009.m394(clsM317), strM1748, clsArrMo1751, true);
                if (c0501M389 == null && !clsM317.isInterface()) {
                    c0501M389 = AbstractC0009.m389(AbstractC0009.m395(AbstractC0009.m390(clsM317)), strM1748, clsArrMo1751, true);
                }
            } else {
                c0501M389 = null;
            }
            if (c0501M389 != null) {
                throw new C1230("Cannot override " + c0501.m1748() + "() in " + AbstractC2202.m4018(cls) + " overridden method is final", null, null);
            }
        }
        return clsM317;
    }
}
