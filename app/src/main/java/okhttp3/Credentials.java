package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        return AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Basic ", new C2633Ujhhgtgfeyxiexzf((str + ':' + str2).getBytes(charset)).mo2576Ujhhgtgfeyxiexzf());
    }
}
