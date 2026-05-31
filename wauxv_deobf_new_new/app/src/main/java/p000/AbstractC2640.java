package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2640 extends AbstractC0345 implements InterfaceC1445 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f8343;

    public AbstractC2640(int i, InterfaceC0841 interfaceC0841) {
        super(interfaceC0841);
        if (interfaceC0841 != null && interfaceC0841.mo1078() != C1189.f4324) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f8343 = i;
    }

    @Override // p000.InterfaceC1445
    public final int getArity() {
        return this.f8343;
    }

    @Override // p000.AbstractC0345
    public final String toString() {
        if (this.f1722 != null) {
            return super.toString();
        }
        AbstractC2574.f8194.getClass();
        return C2575.m4551(this);
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0876 mo1078() {
        return C1189.f4324;
    }
}
