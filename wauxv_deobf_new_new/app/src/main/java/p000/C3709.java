package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᤝᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3709 extends AbstractC3715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final WindowInsets.Builder f11572;

    public C3709() {
        this.f11572 = AbstractC3515.m5050();
    }

    @Override // p000.AbstractC3715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C3729 mo5251() {
        m5259();
        C3729 c3729M5305 = C3729.m5305(null, this.f11572.build());
        C1660[] c1660Arr = this.f11574;
        C3725 c3725 = c3729M5305.f11601;
        c3725.mo5279(c1660Arr);
        c3725.mo5278(null);
        c3725.mo5282(this.f11575);
        c3725.mo5283(this.f11576);
        return c3729M5305;
    }

    @Override // p000.AbstractC3715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void mo5254(C1660 c1660) {
        this.f11572.setMandatorySystemGestureInsets(c1660.m3541());
    }

    @Override // p000.AbstractC3715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo5252(C1660 c1660) {
        this.f11572.setStableInsets(c1660.m3541());
    }

    @Override // p000.AbstractC3715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo5255(C1660 c1660) {
        this.f11572.setSystemGestureInsets(c1660.m3541());
    }

    @Override // p000.AbstractC3715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo5253(C1660 c1660) {
        this.f11572.setSystemWindowInsets(c1660.m3541());
    }

    @Override // p000.AbstractC3715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo5256(C1660 c1660) {
        this.f11572.setTappableElementInsets(c1660.m3541());
    }

    public C3709(C3729 c3729) {
        WindowInsets.Builder builderM5050;
        super(c3729);
        WindowInsets windowInsetsM5308 = c3729.m5308();
        if (windowInsetsM5308 != null) {
            builderM5050 = AbstractC3515.m5051(windowInsetsM5308);
        } else {
            builderM5050 = AbstractC3515.m5050();
        }
        this.f11572 = builderM5050;
    }
}
