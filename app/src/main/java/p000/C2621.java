package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2621 implements InterfaceC1262 {

    public final MessageDigest f8507;

    public final C2812 f8508 = new C2812();

    public C2621(MessageDigest messageDigest) {
        this.f8507 = messageDigest;
    }

    @Override // p000.InterfaceC1262
    public final C2812 mo2496() {
        return this.f8508;
    }
}
