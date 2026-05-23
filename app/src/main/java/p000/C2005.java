package p000;

import com.kongzue.dialogx.interfaces.AbstractC0027;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2005 implements InterfaceC0377 {

    public final /* synthetic */ int f6676;

    public final /* synthetic */ C2007 f6677;

    public /* synthetic */ C2005(C2007 c2007, int i) {
        this.f6676 = i;
        this.f6677 = c2007;
    }

    public final void m3865(AbstractC0027 abstractC0027) {
        switch (this.f6676) {
            case 0:
                InterfaceC1414 interfaceC1414 = this.f6677.f6682;
                if (interfaceC1414 != null) {
                    interfaceC1414.invoke();
                }
                break;
            case 1:
                InterfaceC1414 interfaceC1415 = this.f6677.f6685;
                if (interfaceC1415 != null) {
                    interfaceC1415.invoke();
                }
                break;
            default:
                InterfaceC1414 interfaceC1416 = this.f6677.f6688;
                if (interfaceC1416 != null) {
                    interfaceC1416.invoke();
                }
                break;
        }
    }
}
