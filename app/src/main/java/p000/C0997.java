package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲁᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0997 extends AbstractC2487 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static TimeInterpolator f3641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f3642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ArrayList f3643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f3644;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ArrayList f3645;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ArrayList f3646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public ArrayList f3647;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ArrayList f3648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ArrayList f3649;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ArrayList f3650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public ArrayList f3651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public ArrayList f3652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ArrayList f3653;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m2564(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC2508) arrayList.get(size)).f8006.animate().cancel();
        }
    }

    @Override // p000.AbstractC2487
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo2565(AbstractC2508 abstractC2508, AbstractC2508 abstractC2509, C2139 c2139, C2139 c21310) {
        int i;
        int i2;
        int i3 = c2139.f7076;
        int i4 = c2139.f7077;
        if (abstractC2509.m4525()) {
            int i5 = c2139.f7076;
            i2 = c2139.f7077;
            i = i5;
        } else {
            i = c21310.f7076;
            i2 = c21310.f7077;
        }
        if (abstractC2508 == abstractC2509) {
            return m2569(abstractC2508, i3, i4, i, i2);
        }
        View view = abstractC2508.f8006;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2573(abstractC2508);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = abstractC2509.f8006;
        m2573(abstractC2509);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3646;
        C0995 c0995 = new C0995();
        c0995.f3630 = abstractC2508;
        c0995.f3631 = abstractC2509;
        c0995.f3632 = i3;
        c0995.f3633 = i4;
        c0995.f3634 = i;
        c0995.f3635 = i2;
        arrayList.add(c0995);
        return true;
    }

    @Override // p000.AbstractC2487
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo2566(AbstractC2508 abstractC2508) {
        ArrayList arrayList = this.f3647;
        ArrayList arrayList2 = this.f3648;
        ArrayList arrayList3 = this.f3649;
        View view = abstractC2508.f8006;
        view.animate().cancel();
        ArrayList arrayList4 = this.f3645;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0996) arrayList4.get(size)).f3636 == abstractC2508) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4447(abstractC2508);
                arrayList4.remove(size);
            }
        }
        m2571(this.f3646, abstractC2508);
        if (this.f3643.remove(abstractC2508)) {
            view.setAlpha(1.0f);
            m4447(abstractC2508);
        }
        if (this.f3644.remove(abstractC2508)) {
            view.setAlpha(1.0f);
            m4447(abstractC2508);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m2571(arrayList5, abstractC2508);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((C0996) arrayList6.get(size4)).f3636 == abstractC2508) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4447(abstractC2508);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(abstractC2508)) {
                view.setAlpha(1.0f);
                m4447(abstractC2508);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f3652.remove(abstractC2508);
        this.f3650.remove(abstractC2508);
        this.f3653.remove(abstractC2508);
        this.f3651.remove(abstractC2508);
        m2570();
    }

    @Override // p000.AbstractC2487
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2567() {
        ArrayList arrayList = this.f3649;
        ArrayList arrayList2 = this.f3647;
        ArrayList arrayList3 = this.f3648;
        ArrayList arrayList4 = this.f3646;
        ArrayList arrayList5 = this.f3644;
        ArrayList arrayList6 = this.f3643;
        ArrayList arrayList7 = this.f3645;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0996 c0996 = (C0996) arrayList7.get(size);
            View view = c0996.f3636.f8006;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4447(c0996.f3636);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m4447((AbstractC2508) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList5.get(size3);
            abstractC2508.f8006.setAlpha(1.0f);
            m4447(abstractC2508);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0995 c0995 = (C0995) arrayList4.get(size4);
            AbstractC2508 abstractC2509 = c0995.f3630;
            if (abstractC2509 != null) {
                m2572(c0995, abstractC2509);
            }
            AbstractC2508 abstractC25010 = c0995.f3631;
            if (abstractC25010 != null) {
                m2572(c0995, abstractC25010);
            }
        }
        arrayList4.clear();
        if (mo2568()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0996 c0997 = (C0996) arrayList8.get(size6);
                    View view2 = c0997.f3636.f8006;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4447(c0997.f3636);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC2508 abstractC25011 = (AbstractC2508) arrayList9.get(size8);
                    abstractC25011.f8006.setAlpha(1.0f);
                    m4447(abstractC25011);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0995 c0998 = (C0995) arrayList10.get(size10);
                    AbstractC2508 abstractC25012 = c0998.f3630;
                    if (abstractC25012 != null) {
                        m2572(c0998, abstractC25012);
                    }
                    AbstractC2508 abstractC25013 = c0998.f3631;
                    if (abstractC25013 != null) {
                        m2572(c0998, abstractC25013);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m2564(this.f3652);
            m2564(this.f3651);
            m2564(this.f3650);
            m2564(this.f3653);
            ArrayList arrayList11 = this.f7930;
            if (arrayList11.size() > 0) {
                
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p000.AbstractC2487
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean mo2568() {
        return (this.f3644.isEmpty() && this.f3646.isEmpty() && this.f3645.isEmpty() && this.f3643.isEmpty() && this.f3651.isEmpty() && this.f3652.isEmpty() && this.f3650.isEmpty() && this.f3653.isEmpty() && this.f3648.isEmpty() && this.f3647.isEmpty() && this.f3649.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m2569(AbstractC2508 abstractC2508, int i, int i2, int i3, int i4) {
        View view = abstractC2508.f8006;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC2508.f8006.getTranslationY());
        m2573(abstractC2508);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m4447(abstractC2508);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f3645;
        C0996 c0996 = new C0996();
        c0996.f3636 = abstractC2508;
        c0996.f3637 = translationX;
        c0996.f3638 = translationY;
        c0996.f3639 = i3;
        c0996.f3640 = i4;
        arrayList.add(c0996);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2570() {
        if (mo2568()) {
            return;
        }
        ArrayList arrayList = this.f7930;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2571(ArrayList arrayList, AbstractC2508 abstractC2508) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0995 c0995 = (C0995) arrayList.get(size);
            if (m2572(c0995, abstractC2508) && c0995.f3630 == null && c0995.f3631 == null) {
                arrayList.remove(c0995);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m2572(C0995 c0995, AbstractC2508 abstractC2508) {
        if (c0995.f3631 == abstractC2508) {
            c0995.f3631 = null;
        } else {
            if (c0995.f3630 != abstractC2508) {
                return false;
            }
            c0995.f3630 = null;
        }
        View view = abstractC2508.f8006;
        View view2 = abstractC2508.f8006;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m4447(abstractC2508);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2573(AbstractC2508 abstractC2508) {
        if (f3641 == null) {
            f3641 = new ValueAnimator().getInterpolator();
        }
        abstractC2508.f8006.animate().setInterpolator(f3641);
        mo2566(abstractC2508);
    }
}
