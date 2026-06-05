package okhttp3.internal.http1;

import okhttp3.Headers;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.InterfaceC2595feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = 262144;
    private final InterfaceC2595feyxiexzfUjhhgtg source;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) {
        this.source = interfaceC2595feyxiexzfUjhhgtg;
    }

    public final InterfaceC2595feyxiexzfUjhhgtg getSource() {
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
        String strMo2112Ujhhgtgfeyxiexzf = this.source.mo2112Ujhhgtgfeyxiexzf(this.headerLimit);
        this.headerLimit -= (long) strMo2112Ujhhgtgfeyxiexzf.length();
        return strMo2112Ujhhgtgfeyxiexzf;
    }
}
