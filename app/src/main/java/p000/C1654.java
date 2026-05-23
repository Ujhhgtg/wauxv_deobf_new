package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1654 implements InterfaceC1656 {

    public final String f5599;

    public String f5600;

    public C1654(String str) {
        this.f5599 = str;
        this.f5600 = "";
    }

    @Override // p000.InterfaceC1656
    public C1652 toInstant() {
        throw new C1653(this.f5599 + " when parsing an Instant from \"" + AbstractC1270.m2999(64, this.f5600) + '\"');
    }

    public C1654(String str, String str2) {
        this.f5599 = str;
        this.f5600 = str2;
    }
}
