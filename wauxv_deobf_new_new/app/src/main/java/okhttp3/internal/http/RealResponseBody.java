package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p000.InterfaceC0485;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC0485 source;

    public RealResponseBody(String str, long j, InterfaceC0485 interfaceC0485) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = interfaceC0485;
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
    public InterfaceC0485 source() {
        return this.source;
    }
}
