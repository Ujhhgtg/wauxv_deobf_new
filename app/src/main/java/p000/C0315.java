package p000;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0315 extends AbstractC3436 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f1561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public ArrayList f1559 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f1560 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public boolean f1562 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f1563 = 0;

    public C0315() {
        m1431(1);
        m1428(new C1264(2));
        m1428(new C0587());
        m1428(new C1264(1));
    }

    @Override // p000.AbstractC3436
    public final void cancel() {
        super.cancel();
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).cancel();
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1409(C3444 c3444) {
        View view = c3444.f10855;
        if (m4955(view)) {
            for (AbstractC3436 abstractC3436 : this.f1559) {
                if (abstractC3436.m4955(view)) {
                    abstractC3436.mo1409(c3444);
                    c3444.f10856.add(abstractC3436);
                }
            }
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo1410(C3444 c3444) {
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).mo1410(c3444);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1411(C3444 c3444) {
        View view = c3444.f10855;
        if (m4955(view)) {
            for (AbstractC3436 abstractC3436 : this.f1559) {
                if (abstractC3436.m4955(view)) {
                    abstractC3436.mo1411(c3444);
                    c3444.f10856.add(abstractC3436);
                }
            }
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC3436 clone() {
        C0315 c0315 = (C0315) super.clone();
        c0315.f1559 = new ArrayList();
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            AbstractC3436 abstractC3436Clone = ((AbstractC3436) this.f1559.get(i)).clone();
            c0315.f1559.add(abstractC3436Clone);
            abstractC3436Clone.f10828 = c0315;
        }
        return c0315;
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1413(ViewGroup viewGroup, C2103 c2103, C2103 c2104, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f10821;
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            AbstractC3436 abstractC3436 = (AbstractC3436) this.f1559.get(i);
            if (j > 0 && (this.f1560 || i == 0)) {
                long j2 = abstractC3436.f10821;
                if (j2 > 0) {
                    abstractC3436.mo1426(j2 + j);
                } else {
                    abstractC3436.mo1426(j);
                }
            }
            abstractC3436.mo1413(viewGroup, c2103, c2104, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean mo1414() {
        for (int i = 0; i < this.f1559.size(); i++) {
            if (((AbstractC3436) this.f1559.get(i)).mo1414()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void mo1415(View view) {
        super.mo1415(view);
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).mo1415(view);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void mo1416() {
        this.f10842 = 0L;
        int i = 0;
        C3441 c3441 = new C3441(this, i);
        while (i < this.f1559.size()) {
            AbstractC3436 abstractC3436 = (AbstractC3436) this.f1559.get(i);
            abstractC3436.m4947(c3441);
            abstractC3436.mo1416();
            long j = abstractC3436.f10842;
            if (this.f1560) {
                this.f10842 = Math.max(this.f10842, j);
            } else {
                long j2 = this.f10842;
                abstractC3436.f10843 = j2;
                this.f10842 = j2 + j;
            }
            i++;
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC3436 mo1417(InterfaceC3435 interfaceC3435) {
        super.mo1417(interfaceC3435);
        return this;
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1418(View view) {
        super.mo1418(view);
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).mo1418(view);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1419() {
        if (this.f1559.isEmpty()) {
            m4957();
            m4951();
            return;
        }
        C3441 c3441 = new C3441();
        c3441.f10852 = this;
        Iterator it = this.f1559.iterator();
        while (it.hasNext()) {
            ((AbstractC3436) it.next()).m4947(c3441);
        }
        this.f1561 = this.f1559.size();
        if (this.f1560) {
            Iterator it2 = this.f1559.iterator();
            while (it2.hasNext()) {
                ((AbstractC3436) it2.next()).mo1419();
            }
            return;
        }
        for (int i = 1; i < this.f1559.size(); i++) {
            ((AbstractC3436) this.f1559.get(i - 1)).m4947(new C3441((AbstractC3436) this.f1559.get(i), 2));
        }
        AbstractC3436 abstractC3436 = (AbstractC3436) this.f1559.get(0);
        if (abstractC3436 != null) {
            abstractC3436.mo1419();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void mo1420(long j, long j2) {
        long j3;
        long j4 = this.f10842;
        long j5 = 0;
        if (this.f10828 != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f10837 = false;
            m4956(this, C2373.f7624, z);
        }
        if (!this.f1560) {
            int size = 1;
            while (true) {
                if (size >= this.f1559.size()) {
                    size = this.f1559.size();
                    break;
                } else if (((AbstractC3436) this.f1559.get(size)).f10843 > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f1559.size()) {
                        AbstractC3436 abstractC3436 = (AbstractC3436) this.f1559.get(i);
                        long j6 = abstractC3436.f10843;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        abstractC3436.mo1420(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    AbstractC3436 abstractC3437 = (AbstractC3436) this.f1559.get(i);
                    long j8 = abstractC3437.f10843;
                    long j9 = j - j8;
                    abstractC3437.mo1420(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f10828 != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f10837 = true;
                }
                m4956(this, C2373.f7625, z);
            }
        }
        for (int i2 = 0; i2 < this.f1559.size(); i2++) {
            ((AbstractC3436) this.f1559.get(i2)).mo1420(j, j2);
        }
        j3 = j5;
        if (this.f10828 != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.f10837 = true;
            }
            m4956(this, C2373.f7625, z);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1422(AbstractC0968 abstractC0968) {
        this.f1563 |= 8;
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).mo1422(abstractC0968);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void mo1424(C2102 c2102) {
        super.mo1424(c2102);
        this.f1563 |= 4;
        if (this.f1559 != null) {
            for (int i = 0; i < this.f1559.size(); i++) {
                ((AbstractC3436) this.f1559.get(i)).mo1424(c2102);
            }
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void mo1425() {
        this.f1563 |= 2;
        int size = this.f1559.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).mo1425();
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void mo1426(long j) {
        this.f10821 = j;
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final String mo1427(String str) {
        String strMo1427 = super.mo1427(str);
        for (int i = 0; i < this.f1559.size(); i++) {
            StringBuilder sbM2788 = AbstractC1194.m2788(strMo1427, "\n");
            sbM2788.append(((AbstractC3436) this.f1559.get(i)).mo1427(str + "  "));
            strMo1427 = sbM2788.toString();
        }
        return strMo1427;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m1428(AbstractC3436 abstractC3436) {
        this.f1559.add(abstractC3436);
        abstractC3436.f10828 = this;
        long j = this.f10822;
        if (j >= 0) {
            abstractC3436.mo1421(j);
        }
        if ((this.f1563 & 1) != 0) {
            abstractC3436.mo1423(this.f10823);
        }
        if ((this.f1563 & 2) != 0) {
            abstractC3436.mo1425();
        }
        if ((this.f1563 & 4) != 0) {
            abstractC3436.mo1424(this.f10841);
        }
        if ((this.f1563 & 8) != 0) {
            abstractC3436.mo1422(null);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1421(long j) {
        ArrayList arrayList;
        this.f10822 = j;
        if (j < 0 || (arrayList = this.f1559) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3436) this.f1559.get(i)).mo1421(j);
        }
    }

    @Override // p000.AbstractC3436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1423(TimeInterpolator timeInterpolator) {
        this.f1563 |= 1;
        ArrayList arrayList = this.f1559;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC3436) this.f1559.get(i)).mo1423(timeInterpolator);
            }
        }
        this.f10823 = timeInterpolator;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m1431(int i) {
        if (i == 0) {
            this.f1560 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(AbstractC1194.m2779(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f1560 = false;
        }
    }
}
