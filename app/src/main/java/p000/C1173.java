package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1173 implements InterfaceC1414 {

    public final /* synthetic */ int f4304;

    public final /* synthetic */ C2011 f4305;

    public /* synthetic */ C1173(C2011 c2011, int i) {
        this.f4304 = i;
        this.f4305 = c2011;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f4304) {
            case 0:
                C1174.f4306.m2548(String.valueOf(this.f4305.f6708.getText()));
                break;
            case 1:
                C1322.f4771.m2548(String.valueOf(this.f4305.f6708.getText()));
                break;
            case 2:
                C2721.f8780.m2548(String.valueOf(this.f4305.f6708.getText()));
                break;
            case 3:
                C3607.f11267.m2548(String.valueOf(this.f4305.f6708.getText()));
                break;
            case 4:
                C3612.f11297.m2548(String.valueOf(this.f4305.f6708.getText()));
                break;
            default:
                C3625.f11327.m2548(String.valueOf(this.f4305.f6708.getText()));
                break;
        }
        return Unit.INSTANCE;
    }
}
