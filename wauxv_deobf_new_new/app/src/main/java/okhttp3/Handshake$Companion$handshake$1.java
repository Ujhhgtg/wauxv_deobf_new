package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import p000.AbstractC1778;
import p000.InterfaceC1422;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake$Companion$handshake$1 extends AbstractC1778 implements InterfaceC1422 {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$handshake$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // p000.InterfaceC1422
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
