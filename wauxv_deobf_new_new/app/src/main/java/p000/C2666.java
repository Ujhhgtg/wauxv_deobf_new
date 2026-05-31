package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᲈᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2666 extends AbstractC1471 {
    @Override // p000.AbstractC1471
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo2557(C2748 c2748, float f, float f2) {
        c2748.m4737(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C2744 c2744 = new C2744(0.0f, 0.0f, f3, f3);
        c2744.f8834 = 180.0f;
        c2744.f8835 = 90.0f;
        c2748.f8847.add(c2744);
        C2742 c2742 = new C2742(c2744);
        c2748.m4734(180.0f);
        c2748.f8848.add(c2742);
        c2748.f8845 = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c2748.f8843 = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c2748.f8844 = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
