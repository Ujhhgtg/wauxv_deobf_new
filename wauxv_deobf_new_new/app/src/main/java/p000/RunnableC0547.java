package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0547 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2267 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2268;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2269;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2270;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f2271;

    public RunnableC0547(C0102 c0102, C0548 c0548, MenuItemC1977 menuItemC1977, MenuC1975 menuC1975) {
        this.f2271 = c0102;
        this.f2268 = c0548;
        this.f2269 = menuItemC1977;
        this.f2270 = menuC1975;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2267) {
            case 0:
                ViewOnKeyListenerC0549 viewOnKeyListenerC0549 = (ViewOnKeyListenerC0549) ((C0102) this.f2271).f1117;
                MenuItemC1977 menuItemC1977 = (MenuItemC1977) this.f2269;
                C0548 c0548 = (C0548) this.f2268;
                if (c0548 != null) {
                    viewOnKeyListenerC0549.f2299 = true;
                    c0548.f2273.m3950(false);
                    viewOnKeyListenerC0549.f2299 = false;
                }
                if (menuItemC1977.isEnabled() && menuItemC1977.hasSubMenu()) {
                    ((MenuC1975) this.f2270).m3963(menuItemC1977, null, 4);
                    break;
                }
                break;
            default:
                C3703.m5242((View) this.f2268, (C3707) this.f2269, (C2885) this.f2270);
                ((ValueAnimator) this.f2271).start();
                break;
        }
    }

    public RunnableC0547(View view, C3707 c3707, C2885 c2885, ValueAnimator valueAnimator) {
        this.f2268 = view;
        this.f2269 = c3707;
        this.f2270 = c2885;
        this.f2271 = valueAnimator;
    }
}
