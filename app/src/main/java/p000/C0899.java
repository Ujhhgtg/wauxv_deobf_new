package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲇᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0899 extends AbstractC0911 {
    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return this.f3369.m2428();
    }

    @Override // p000.AbstractC0911, p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2267(AbstractC0777 abstractC0777) {
        int iMo2267 = super.mo2267(abstractC0777);
        return iMo2267 != 0 ? iMo2267 : this.f3369.f3375.compareTo(((C0899) abstractC0777).f3369.f3375);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "field";
    }
}
