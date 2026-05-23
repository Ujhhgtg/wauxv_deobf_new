package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0570 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2305 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2306;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2307;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f2308;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2309;

    public RunnableC0570(C0094 c0094, C0571 c0571, MenuItemC1946 menuItemC1946, MenuC1944 menuC1944) {
        this.f2309 = c0094;
        this.f2306 = c0571;
        this.f2307 = menuItemC1946;
        this.f2308 = menuC1944;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2305) {
            case 0:
                ViewOnKeyListenerC0572 viewOnKeyListenerC0572 = (ViewOnKeyListenerC0572) ((C0094) this.f2309).f1049;
                MenuItemC1946 menuItemC1946 = (MenuItemC1946) this.f2307;
                C0571 c0571 = (C0571) this.f2306;
                if (c0571 != null) {
                    viewOnKeyListenerC0572.f2337 = true;
                    c0571.f2311.m3756(false);
                    viewOnKeyListenerC0572.f2337 = false;
                }
                if (menuItemC1946.isEnabled() && menuItemC1946.hasSubMenu()) {
                    ((MenuC1944) this.f2308).m3769(menuItemC1946, null, 4);
                    break;
                }
                break;
            default:
                C3643.m5236((View) this.f2306, (C3647) this.f2307, (C2825) this.f2308);
                ((ValueAnimator) this.f2309).start();
                break;
        }
    }

    public RunnableC0570(View view, C3647 c3647, C2825 c2825, ValueAnimator valueAnimator) {
        this.f2306 = view;
        this.f2307 = c3647;
        this.f2308 = c2825;
        this.f2309 = valueAnimator;
    }
}
