package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᤝᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3705 extends AbstractC3706 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final WindowInsetsAnimation f11560;

    public C3705(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f11560 = windowInsetsAnimation;
    }

    @Override // p000.AbstractC3706
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final long mo5246() {
        return this.f11560.getDurationMillis();
    }

    @Override // p000.AbstractC3706
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float mo5247() {
        return this.f11560.getInterpolatedFraction();
    }

    @Override // p000.AbstractC3706
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo5248() {
        return this.f11560.getTypeMask();
    }

    @Override // p000.AbstractC3706
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo5249(float f) {
        this.f11560.setFraction(f);
    }
}
