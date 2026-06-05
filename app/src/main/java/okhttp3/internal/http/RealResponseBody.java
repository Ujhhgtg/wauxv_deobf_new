package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p000.InterfaceC2595feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC2595feyxiexzfUjhhgtg source;

    public RealResponseBody(String str, long j, InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = interfaceC2595feyxiexzfUjhhgtg;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public InterfaceC2595feyxiexzfUjhhgtg source() {
        return this.source;
    }
}
