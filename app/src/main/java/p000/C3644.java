package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᲀᛸᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3644 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC0592 f11407;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public List f11408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ArrayList f11409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final HashMap f11410;

    public C3644(AbstractC0592 abstractC0592) {
        super(abstractC0592.f2399);
        this.f11410 = new HashMap();
        this.f11407 = abstractC0592;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m5239(windowInsetsAnimation);
        this.f11407.mo2019();
        this.f11410.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m5239(windowInsetsAnimation);
        this.f11407.mo2020();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f11409;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f11409 = arrayList2;
            this.f11408 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1043 = AbstractC0084.m1043(list.get(size));
            C3647 c3647M5239 = m5239(windowInsetsAnimationM1043);
            c3647M5239.f11416.mo5243(windowInsetsAnimationM1043.getFraction());
            this.f11409.add(c3647M5239);
        }
        return this.f11407.mo2021(C3669.m5299(null, windowInsets), this.f11408).m5302();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m5239(windowInsetsAnimation);
        C2825 c2825Mo2022 = this.f11407.mo2022(new C2825(bounds));
        
        AbstractC0084.m1046();
        return AbstractC0084.m1041(((C1646) c2825Mo2022.f9072).m3377(), ((C1646) c2825Mo2022.f9073).m3377());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3647 m5239(WindowInsetsAnimation windowInsetsAnimation) {
        C3647 c3647 = (C3647) this.f11410.get(windowInsetsAnimation);
        if (c3647 != null) {
            return c3647;
        }
        C3647 c3648 = new C3647(0, null, 0L);
        c3648.f11416 = new C3645(windowInsetsAnimation);
        this.f11410.put(windowInsetsAnimation, c3648);
        return c3648;
    }
}
