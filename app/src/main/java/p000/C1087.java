package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1087 extends AbstractC0054 {

    public final /* synthetic */ int f3907;

    public final AbstractC0428 f3908;

    public C1087(int i) {
        this.f3907 = i;
        switch (i) {
            case 1:
                this.f3908 = new C2917();
                break;
            default:
                this.f3908 = new C1569(1);
                break;
        }
    }

    @Override // p000.AbstractC0054
    public void mo917(CharSequence charSequence) {
        int i = this.f3907;
    }

    @Override // p000.AbstractC0054
    public boolean mo918(AbstractC0428 abstractC0428) {
        switch (this.f3907) {
            case 0:
                return true;
            default:
                return super.mo918(abstractC0428);
        }
    }

    @Override // p000.AbstractC0054
    public final AbstractC0428 mo920() {
        switch (this.f3907) {
            case 0:
                return (C1569) this.f3908;
            default:
                return (C2917) this.f3908;
        }
    }

    @Override // p000.AbstractC0054
    public boolean mo921() {
        switch (this.f3907) {
            case 0:
                return true;
            default:
                return super.mo921();
        }
    }

    @Override // p000.AbstractC0054
    public final C0429 mo923(C1088 c1088) {
        switch (this.f3907) {
            case 0:
                return C0429.m1634(c1088.f3912);
            default:
                return null;
        }
    }

    private final void m2649(CharSequence charSequence) {
    }
}
