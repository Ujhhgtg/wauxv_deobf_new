package okhttp3.internal.http1;

import okhttp3.Headers;
import p000.AbstractC0981;
import p000.InterfaceC0508;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = 262144;
    private final InterfaceC0508 source;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(InterfaceC0508 interfaceC0508) {
        this.source = interfaceC0508;
    }

    public final InterfaceC0508 getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() {
        String strMo1773 = this.source.mo1773(this.headerLimit);
        this.headerLimit -= (long) strMo1773.length();
        return strMo1773;
    }
}
