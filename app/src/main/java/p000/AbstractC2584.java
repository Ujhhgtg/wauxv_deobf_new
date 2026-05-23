package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲇᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2584 extends AbstractC0370 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f8190;

    public AbstractC2584(int i, InterfaceC0842 interfaceC0842) {
        super(interfaceC0842);
        if (interfaceC0842 != null && interfaceC0842.mo934() != C1187.f4327) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f8190 = i;
    }

    @Override // p000.InterfaceC1437
    public final int getArity() {
        return this.f8190;
    }

    @Override // p000.AbstractC0370
    public final String toString() {
        if (this.f1751 != null) {
            return super.toString();
        }
        AbstractC2519.f8046.getClass();
        return C2520.m4529(this);
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0877 mo934() {
        return C1187.f4327;
    }
}
