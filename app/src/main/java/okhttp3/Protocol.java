package okhttp3;

import java.io.IOException;
import p000.AbstractC0981;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            Protocol protocol = Protocol.HTTP_1_0;
            if (str.equals(Protocol.HTTP_1_0.protocol)) {
                return Protocol.HTTP_1_0;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (str.equals(Protocol.HTTP_1_1.protocol)) {
                return Protocol.HTTP_1_1;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (str.equals(Protocol.H2_PRIOR_KNOWLEDGE.protocol)) {
                return Protocol.H2_PRIOR_KNOWLEDGE;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (str.equals(Protocol.HTTP_2.protocol)) {
                return Protocol.HTTP_2;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (str.equals(Protocol.SPDY_3.protocol)) {
                return Protocol.SPDY_3;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (str.equals(Protocol.QUIC.protocol)) {
                return Protocol.QUIC;
            }
            throw new IOException("Unexpected protocol: ".concat(str));
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
