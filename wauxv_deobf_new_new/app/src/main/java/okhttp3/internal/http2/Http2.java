package okhttp3.internal.http2;

import com.umeng.analytics.pro.bc;
import okhttp3.internal.Util;
import p000.AbstractC0580;
import p000.AbstractC2844;
import p000.AbstractC2909;
import p000.C0516;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final C0516 CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        C0516 c0516 = new C0516("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(AbstractC0580.UTF_8));
        c0516.f2203 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        CONNECTION_PREFACE = c0516;
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[bc.e];
        for (int i = 0; i < 256; i++) {
            strArr[i] = Util.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC2844.m4786(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = FLAGS;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC2844.m4786(sb, strArr3[i4], "|PADDED");
        }
        int length = FLAGS.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i7] == null) {
                strArr4[i7] = BINARY[i7];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i, int i2) {
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : BINARY[i2];
            }
            if (i != 7 && i != 8) {
                String[] strArr = FLAGS;
                String str = i2 < strArr.length ? strArr[i2] : BINARY[i2];
                if (i != 5 || (i2 & 4) == 0) {
                    return (i != 0 || (i2 & 32) == 0) ? str : AbstractC2909.m4918(str, "PRIORITY", "COMPRESSED");
                }
                return AbstractC2909.m4918(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return BINARY[i2];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        return i < strArr.length ? strArr[i] : Util.format("0x%02x", Integer.valueOf(i));
    }

    public final String frameLog(boolean z, int i, int i2, int i3, int i4) {
        return Util.format("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp(i3), formatFlags(i3, i4));
    }
}
