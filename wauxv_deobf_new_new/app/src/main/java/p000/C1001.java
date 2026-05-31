package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲀᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1001 extends AbstractC2542 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static TimeInterpolator f3657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f3658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ArrayList f3659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f3660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ArrayList f3661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ArrayList f3662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public ArrayList f3663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ArrayList f3664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ArrayList f3665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ArrayList f3666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public ArrayList f3667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public ArrayList f3668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ArrayList f3669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m2688(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC2563) arrayList.get(size)).f8157.animate().cancel();
        }
    }

    @Override // p000.AbstractC2542
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo2689(AbstractC2563 abstractC2563, AbstractC2563 abstractC2564, C2173 c2173, C2173 c2174) {
        int i;
        int i2;
        int i3 = c2173.f7200;
        int i4 = c2173.f7201;
        if (abstractC2564.m4547()) {
            int i5 = c2173.f7200;
            i2 = c2173.f7201;
            i = i5;
        } else {
            i = c2174.f7200;
            i2 = c2174.f7201;
        }
        if (abstractC2563 == abstractC2564) {
            return m2693(abstractC2563, i3, i4, i, i2);
        }
        View view = abstractC2563.f8157;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2697(abstractC2563);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = abstractC2564.f8157;
        m2697(abstractC2564);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3662;
        C0999 c0999 = new C0999();
        c0999.f3646 = abstractC2563;
        c0999.f3647 = abstractC2564;
        c0999.f3648 = i3;
        c0999.f3649 = i4;
        c0999.f3650 = i;
        c0999.f3651 = i2;
        arrayList.add(c0999);
        return true;
    }

    @Override // p000.AbstractC2542
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo2690(AbstractC2563 abstractC2563) {
        ArrayList arrayList = this.f3663;
        ArrayList arrayList2 = this.f3664;
        ArrayList arrayList3 = this.f3665;
        View view = abstractC2563.f8157;
        view.animate().cancel();
        ArrayList arrayList4 = this.f3661;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1000) arrayList4.get(size)).f3652 == abstractC2563) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4469(abstractC2563);
                arrayList4.remove(size);
            }
        }
        m2695(this.f3662, abstractC2563);
        if (this.f3659.remove(abstractC2563)) {
            view.setAlpha(1.0f);
            m4469(abstractC2563);
        }
        if (this.f3660.remove(abstractC2563)) {
            view.setAlpha(1.0f);
            m4469(abstractC2563);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m2695(arrayList5, abstractC2563);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((C1000) arrayList6.get(size4)).f3652 == abstractC2563) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4469(abstractC2563);
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
            if (arrayList7.remove(abstractC2563)) {
                view.setAlpha(1.0f);
                m4469(abstractC2563);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f3668.remove(abstractC2563);
        this.f3666.remove(abstractC2563);
        this.f3669.remove(abstractC2563);
        this.f3667.remove(abstractC2563);
        m2694();
    }

    @Override // p000.AbstractC2542
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2691() {
        ArrayList arrayList = this.f3665;
        ArrayList arrayList2 = this.f3663;
        ArrayList arrayList3 = this.f3664;
        ArrayList arrayList4 = this.f3662;
        ArrayList arrayList5 = this.f3660;
        ArrayList arrayList6 = this.f3659;
        ArrayList arrayList7 = this.f3661;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1000 c1000 = (C1000) arrayList7.get(size);
            View view = c1000.f3652.f8157;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4469(c1000.f3652);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m4469((AbstractC2563) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC2563 abstractC2563 = (AbstractC2563) arrayList5.get(size3);
            abstractC2563.f8157.setAlpha(1.0f);
            m4469(abstractC2563);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0999 c0999 = (C0999) arrayList4.get(size4);
            AbstractC2563 abstractC2564 = c0999.f3646;
            if (abstractC2564 != null) {
                m2696(c0999, abstractC2564);
            }
            AbstractC2563 abstractC2565 = c0999.f3647;
            if (abstractC2565 != null) {
                m2696(c0999, abstractC2565);
            }
        }
        arrayList4.clear();
        if (mo2692()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C1000 c1001 = (C1000) arrayList8.get(size6);
                    View view2 = c1001.f3652.f8157;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4469(c1001.f3652);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC2563 abstractC2566 = (AbstractC2563) arrayList9.get(size8);
                    abstractC2566.f8157.setAlpha(1.0f);
                    m4469(abstractC2566);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0999 c09910 = (C0999) arrayList10.get(size10);
                    AbstractC2563 abstractC2567 = c09910.f3646;
                    if (abstractC2567 != null) {
                        m2696(c09910, abstractC2567);
                    }
                    AbstractC2563 abstractC2568 = c09910.f3647;
                    if (abstractC2568 != null) {
                        m2696(c09910, abstractC2568);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m2688(this.f3668);
            m2688(this.f3667);
            m2688(this.f3666);
            m2688(this.f3669);
            ArrayList arrayList11 = this.f8081;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p000.AbstractC2542
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean mo2692() {
        return (this.f3660.isEmpty() && this.f3662.isEmpty() && this.f3661.isEmpty() && this.f3659.isEmpty() && this.f3667.isEmpty() && this.f3668.isEmpty() && this.f3666.isEmpty() && this.f3669.isEmpty() && this.f3664.isEmpty() && this.f3663.isEmpty() && this.f3665.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m2693(AbstractC2563 abstractC2563, int i, int i2, int i3, int i4) {
        View view = abstractC2563.f8157;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC2563.f8157.getTranslationY());
        m2697(abstractC2563);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m4469(abstractC2563);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f3661;
        C1000 c1000 = new C1000();
        c1000.f3652 = abstractC2563;
        c1000.f3653 = translationX;
        c1000.f3654 = translationY;
        c1000.f3655 = i3;
        c1000.f3656 = i4;
        arrayList.add(c1000);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2694() {
        if (mo2692()) {
            return;
        }
        ArrayList arrayList = this.f8081;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2695(ArrayList arrayList, AbstractC2563 abstractC2563) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0999 c0999 = (C0999) arrayList.get(size);
            if (m2696(c0999, abstractC2563) && c0999.f3646 == null && c0999.f3647 == null) {
                arrayList.remove(c0999);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m2696(C0999 c0999, AbstractC2563 abstractC2563) {
        if (c0999.f3647 == abstractC2563) {
            c0999.f3647 = null;
        } else {
            if (c0999.f3646 != abstractC2563) {
                return false;
            }
            c0999.f3646 = null;
        }
        View view = abstractC2563.f8157;
        View view2 = abstractC2563.f8157;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m4469(abstractC2563);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2697(AbstractC2563 abstractC2563) {
        if (f3657 == null) {
            f3657 = new ValueAnimator().getInterpolator();
        }
        abstractC2563.f8157.animate().setInterpolator(f3657);
        mo2690(abstractC2563);
    }
}
