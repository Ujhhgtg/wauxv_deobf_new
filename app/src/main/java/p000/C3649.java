package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᤞᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3649 extends AbstractC3655 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final WindowInsets.Builder f11423;

    public C3649() {
        this.f11423 = AbstractC3459.m5025();
    }

    @Override // p000.AbstractC3655
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C3669 mo5245() {
        m5253();
        C3669 c3669M5299 = C3669.m5299(null, this.f11423.build());
        C1646[] c1646Arr = this.f11425;
        C3665 c3665 = c3669M5299.f11452;
        c3665.mo5273(c1646Arr);
        c3665.mo5272(null);
        c3665.mo5276(this.f11426);
        c3665.mo5277(this.f11427);
        return c3669M5299;
    }

    @Override // p000.AbstractC3655
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void mo5248(C1646 c1646) {
        this.f11423.setMandatorySystemGestureInsets(c1646.m3377());
    }

    @Override // p000.AbstractC3655
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo5246(C1646 c1646) {
        this.f11423.setStableInsets(c1646.m3377());
    }

    @Override // p000.AbstractC3655
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo5249(C1646 c1646) {
        this.f11423.setSystemGestureInsets(c1646.m3377());
    }

    @Override // p000.AbstractC3655
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo5247(C1646 c1646) {
        this.f11423.setSystemWindowInsets(c1646.m3377());
    }

    @Override // p000.AbstractC3655
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo5250(C1646 c1646) {
        this.f11423.setTappableElementInsets(c1646.m3377());
    }

    public C3649(C3669 c3669) {
        WindowInsets.Builder builderM5025;
        super(c3669);
        WindowInsets windowInsetsM5302 = c3669.m5302();
        if (windowInsetsM5302 != null) {
            builderM5025 = AbstractC3459.m5026(windowInsetsM5302);
        } else {
            builderM5025 = AbstractC3459.m5025();
        }
        this.f11423 = builderM5025;
    }
}
