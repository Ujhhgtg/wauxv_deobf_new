package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import p000.AbstractC0056Ujhhgtgfeyxiexzf;
import p000.InterfaceC3545feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake$Companion$get$1 extends AbstractC0056Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
