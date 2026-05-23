package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3441 extends AbstractC3437 {

    public final /* synthetic */ int f10851;

    public AbstractC3436 f10852;

    public /* synthetic */ C3441() {
        this.f10851 = 1;
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    public void mo2949(AbstractC3436 abstractC3436) {
        switch (this.f10851) {
            case 1:
                C0315 c0315 = (C0315) this.f10852;
                if (!c0315.f1562) {
                    c0315.m4957();
                    c0315.f1562 = true;
                }
                break;
        }
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    public void mo2012(AbstractC3436 abstractC3436) {
        switch (this.f10851) {
            case 1:
                C0315 c0315 = (C0315) this.f10852;
                int i = c0315.f1561 - 1;
                c0315.f1561 = i;
                if (i == 0) {
                    c0315.f1562 = false;
                    c0315.m4951();
                }
                abstractC3436.mo1417(this);
                break;
            case 2:
                this.f10852.mo1419();
                abstractC3436.mo1417(this);
                break;
        }
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    public void mo2014(AbstractC3436 abstractC3436) {
        switch (this.f10851) {
            case 0:
                C0315 c0315 = (C0315) this.f10852;
                c0315.f1559.remove(abstractC3436);
                if (!c0315.mo1414()) {
                    c0315.m4956(c0315, C2373.f7626, false);
                    c0315.f10837 = true;
                    c0315.m4956(c0315, C2373.f7625, false);
                }
                break;
        }
    }

    public /* synthetic */ C3441(AbstractC3436 abstractC3436, int i) {
        this.f10851 = i;
        this.f10852 = abstractC3436;
    }
}
