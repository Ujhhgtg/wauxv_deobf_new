package p000;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲁᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0327 extends AbstractC3493 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f1637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public ArrayList f1635 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public boolean f1636 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public boolean f1638 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f1639 = 0;

    public C0327() {
        m1577(1);
        m1574(new C1266(2));
        m1574(new C0568());
        m1574(new C1266(1));
    }

    @Override // p000.AbstractC3493
    public final void cancel() {
        super.cancel();
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).cancel();
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1555(C3501 c3501) {
        View view = c3501.f11015;
        if (m5017(view)) {
            for (AbstractC3493 abstractC3493 : this.f1635) {
                if (abstractC3493.m5017(view)) {
                    abstractC3493.mo1555(c3501);
                    c3501.f11016.add(abstractC3493);
                }
            }
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo1556(C3501 c3501) {
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).mo1556(c3501);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1557(C3501 c3501) {
        View view = c3501.f11015;
        if (m5017(view)) {
            for (AbstractC3493 abstractC3493 : this.f1635) {
                if (abstractC3493.m5017(view)) {
                    abstractC3493.mo1557(c3501);
                    c3501.f11016.add(abstractC3493);
                }
            }
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC3493 clone() {
        C0327 c0327 = (C0327) super.clone();
        c0327.f1635 = new ArrayList();
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            AbstractC3493 abstractC3493Clone = ((AbstractC3493) this.f1635.get(i)).clone();
            c0327.f1635.add(abstractC3493Clone);
            abstractC3493Clone.f10988 = c0327;
        }
        return c0327;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1559(ViewGroup viewGroup, C2136 c2136, C2136 c2137, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f10981;
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            AbstractC3493 abstractC3493 = (AbstractC3493) this.f1635.get(i);
            if (j > 0 && (this.f1636 || i == 0)) {
                long j2 = abstractC3493.f10981;
                if (j2 > 0) {
                    abstractC3493.mo1572(j2 + j);
                } else {
                    abstractC3493.mo1572(j);
                }
            }
            abstractC3493.mo1559(viewGroup, c2136, c2137, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean mo1560() {
        for (int i = 0; i < this.f1635.size(); i++) {
            if (((AbstractC3493) this.f1635.get(i)).mo1560()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void mo1561(View view) {
        super.mo1561(view);
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).mo1561(view);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void mo1562() {
        this.f11002 = 0L;
        int i = 0;
        C3498 c3498 = new C3498(this, i);
        while (i < this.f1635.size()) {
            AbstractC3493 abstractC3493 = (AbstractC3493) this.f1635.get(i);
            abstractC3493.m5009(c3498);
            abstractC3493.mo1562();
            long j = abstractC3493.f11002;
            if (this.f1636) {
                this.f11002 = Math.max(this.f11002, j);
            } else {
                long j2 = this.f11002;
                abstractC3493.f11003 = j2;
                this.f11002 = j2 + j;
            }
            i++;
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC3493 mo1563(InterfaceC3492 interfaceC3492) {
        super.mo1563(interfaceC3492);
        return this;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1564(View view) {
        super.mo1564(view);
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).mo1564(view);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1565() {
        if (this.f1635.isEmpty()) {
            m5019();
            m5013();
            return;
        }
        C3498 c3498 = new C3498();
        c3498.f11012 = this;
        Iterator it = this.f1635.iterator();
        while (it.hasNext()) {
            ((AbstractC3493) it.next()).m5009(c3498);
        }
        this.f1637 = this.f1635.size();
        if (this.f1636) {
            Iterator it2 = this.f1635.iterator();
            while (it2.hasNext()) {
                ((AbstractC3493) it2.next()).mo1565();
            }
            return;
        }
        for (int i = 1; i < this.f1635.size(); i++) {
            ((AbstractC3493) this.f1635.get(i - 1)).m5009(new C3498((AbstractC3493) this.f1635.get(i), 2));
        }
        AbstractC3493 abstractC3493 = (AbstractC3493) this.f1635.get(0);
        if (abstractC3493 != null) {
            abstractC3493.mo1565();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void mo1566(long j, long j2) {
        long j3;
        long j4 = this.f11002;
        long j5 = 0;
        if (this.f10988 != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f10997 = false;
            m5018(this, C2425.f7764, z);
        }
        if (!this.f1636) {
            int size = 1;
            while (true) {
                if (size >= this.f1635.size()) {
                    size = this.f1635.size();
                    break;
                } else if (((AbstractC3493) this.f1635.get(size)).f11003 > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f1635.size()) {
                        AbstractC3493 abstractC3493 = (AbstractC3493) this.f1635.get(i);
                        long j6 = abstractC3493.f11003;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        abstractC3493.mo1566(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    AbstractC3493 abstractC3494 = (AbstractC3493) this.f1635.get(i);
                    long j8 = abstractC3494.f11003;
                    long j9 = j - j8;
                    abstractC3494.mo1566(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f10988 != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f10997 = true;
                }
                m5018(this, C2425.f7765, z);
            }
        }
        for (int i2 = 0; i2 < this.f1635.size(); i2++) {
            ((AbstractC3493) this.f1635.get(i2)).mo1566(j, j2);
        }
        j3 = j5;
        if (this.f10988 != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.f10997 = true;
            }
            m5018(this, C2425.f7765, z);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1568(AbstractC1469 abstractC1469) {
        this.f1639 |= 8;
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).mo1568(abstractC1469);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void mo1570(C2135 c2135) {
        super.mo1570(c2135);
        this.f1639 |= 4;
        if (this.f1635 != null) {
            for (int i = 0; i < this.f1635.size(); i++) {
                ((AbstractC3493) this.f1635.get(i)).mo1570(c2135);
            }
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void mo1571() {
        this.f1639 |= 2;
        int size = this.f1635.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).mo1571();
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void mo1572(long j) {
        this.f10981 = j;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final String mo1573(String str) {
        String strMo1573 = super.mo1573(str);
        for (int i = 0; i < this.f1635.size(); i++) {
            StringBuilder sbM2803 = AbstractC1095.m2803(strMo1573, "\n");
            sbM2803.append(((AbstractC3493) this.f1635.get(i)).mo1573(str + "  "));
            strMo1573 = sbM2803.toString();
        }
        return strMo1573;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m1574(AbstractC3493 abstractC3493) {
        this.f1635.add(abstractC3493);
        abstractC3493.f10988 = this;
        long j = this.f10982;
        if (j >= 0) {
            abstractC3493.mo1567(j);
        }
        if ((this.f1639 & 1) != 0) {
            abstractC3493.mo1569(this.f10983);
        }
        if ((this.f1639 & 2) != 0) {
            abstractC3493.mo1571();
        }
        if ((this.f1639 & 4) != 0) {
            abstractC3493.mo1570(this.f11001);
        }
        if ((this.f1639 & 8) != 0) {
            abstractC3493.mo1568(null);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1567(long j) {
        ArrayList arrayList;
        this.f10982 = j;
        if (j < 0 || (arrayList = this.f1635) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3493) this.f1635.get(i)).mo1567(j);
        }
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1569(TimeInterpolator timeInterpolator) {
        this.f1639 |= 1;
        ArrayList arrayList = this.f1635;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC3493) this.f1635.get(i)).mo1569(timeInterpolator);
            }
        }
        this.f10983 = timeInterpolator;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m1577(int i) {
        if (i == 0) {
            this.f1636 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(AbstractC1095.m2794(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f1636 = false;
        }
    }
}
