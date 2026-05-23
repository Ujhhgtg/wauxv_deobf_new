package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3681 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1215 f11561 = new C1215(new C1039(2));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1172 f11562 = new C1172("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1933 f11563 = new C1933(21);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1933 f11564 = new C1933(22);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1933 f11565 = new C1933(23);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1713 m5314(InterfaceC2654 interfaceC2654) {
        String str = "Value of type '" + interfaceC2654.mo1342() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC2654.mo3472() + '\'';
        interfaceC2654.mo1342();
        return new C1713(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final long m5315(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC2203.m4028(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static boolean m5316(C2341[] c2341Arr, C2341[] c2341Arr2) {
        if (c2341Arr == null || c2341Arr2 == null || c2341Arr.length != c2341Arr2.length) {
            return false;
        }
        for (int i = 0; i < c2341Arr.length; i++) {
            C2341 c2341 = c2341Arr[i];
            char c = c2341.f7527;
            C2341 c2342 = c2341Arr2[i];
            if (c != c2342.f7527 || c2341.f7528.length != c2342.f7528.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m5317(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM2787 = AbstractC1194.m2787(i, "radix ", " was not in valid range ");
            sbM2787.append(new C1664(2, 36, 1));
            throw new IllegalArgumentException(sbM2787.toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static int m5318(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static float[] m5319(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C2341[] m5320(String str) {
        int i;
        String strTrim;
        float[] fArrM5319;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrM5319 = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case Opcodes.IALOAD /* 46 */:
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrM5319 = m5319(fArr, i5);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(AbstractC1194.m2785("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new C2341(strTrim.charAt(i2), fArrM5319));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrM5319 = new float[i2];
                } else {
                    fArrM5319 = new float[i2];
                }
                arrayList.add(new C2341(strTrim.charAt(i2), fArrM5319));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C2341(str.charAt(i3), new float[0]));
        }
        return (C2341[]) arrayList.toArray(new C2341[i]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static C2341[] m5321(C2341[] c2341Arr) {
        C2341[] c2341Arr2 = new C2341[c2341Arr.length];
        for (int i = 0; i < c2341Arr.length; i++) {
            c2341Arr2[i] = new C2341(c2341Arr[i]);
        }
        return c2341Arr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final float m5322(Number number, Context context) {
        return number.floatValue() * context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final long m5323(long j) {
        long j2 = (j << 1) + 1;
        C1119.f4179.getClass();
        int i = AbstractC1120.f4184;
        return j2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final boolean m5324(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static View m5325(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static String m5326(Float f) {
        return new DecimalFormat("0.00").format(f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String m5327(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC2841.m4836(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC2841.m4836(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final void m5328(InterfaceC0877 interfaceC0877, Throwable th) {
        if (th instanceof C1071) {
            th = ((C1071) th).f3885;
        }
        try {
            InterfaceC0879 interfaceC0879 = (InterfaceC0879) interfaceC0877.mo942(C1133.f4203);
            if (interfaceC0879 != null) {
                interfaceC0879.mo1193(th);
            } else {
                AbstractC3471.m5078(interfaceC0877, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC2202.m3992(runtimeException, th);
                th = runtimeException;
            }
            AbstractC3471.m5078(interfaceC0877, th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final void m5329(C0146 c0146, String str) {
        c0146.m1169(c0146.f1149 - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static /* synthetic */ void m5330(C0146 c0146) {
        m5329(c0146, "object");
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final boolean m5331(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final boolean m5332(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final CharSequence m5333(int i, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM4753 = AbstractC2784.m4753(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM4753.append(charSequence.subSequence(i2, i3).toString());
                sbM4753.append(str2);
                return sbM4753.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final String m5334(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC2784.m4752(sb, str != null ? AbstractC1194.m2785(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final void m5335(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0179  */
    /* JADX WARN: Code duplicated, block: B:109:0x0194 A[LOOP:7: B:108:0x0192->B:109:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x0232  */
    /* JADX WARN: Code duplicated, block: B:144:0x023c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0240  */
    /* JADX WARN: Code duplicated, block: B:148:0x0244  */
    /* JADX WARN: Code duplicated, block: B:150:0x0248  */
    /* JADX WARN: Code duplicated, block: B:151:0x024a  */
    /* JADX WARN: Code duplicated, block: B:152:0x024d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0250  */
    /* JADX WARN: Code duplicated, block: B:154:0x0253  */
    /* JADX WARN: Code duplicated, block: B:156:0x0257  */
    /* JADX WARN: Code duplicated, block: B:164:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x026e  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x027e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0291  */
    /* JADX WARN: Code duplicated, block: B:206:0x022c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x018d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:89:0x0128  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x0157 A[LOOP:5: B:97:0x0155->B:98:0x0157, LOOP_END] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static long m5336(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        char cCharAt;
        EnumC1122 enumC1122;
        long jM5315;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        double d;
        char cCharAt2;
        char cCharAt3;
        int i15;
        char cCharAt4;
        char cCharAt5;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        char cCharAt6 = str.charAt(0);
        char c = '-';
        char c2 = '+';
        if (cCharAt6 != '+') {
            i2 = cCharAt6 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException("");
        }
        int i16 = i2 + 1;
        if (i16 == str.length()) {
            throw new IllegalArgumentException("");
        }
        boolean z = false;
        EnumC1122 enumC1123 = null;
        long jM2173 = 0;
        long jRound = 0;
        while (i16 < str.length()) {
            char cCharAt7 = str.charAt(i16);
            if (cCharAt7 != 'T') {
                C1860 c1860 = C1860.f6180;
                if (c1860.f6182) {
                    char cCharAt8 = str.charAt(i16);
                    if (cCharAt8 == c2) {
                        i3 = i16 + 1;
                        i4 = 1;
                    } else if (cCharAt8 != c) {
                        i3 = i16;
                        i4 = 1;
                    } else {
                        i3 = i16 + 1;
                        i4 = -1;
                    }
                } else {
                    i3 = i16;
                    i4 = 1;
                }
                while (i3 < str.length() && str.charAt(i3) == '0') {
                    i3++;
                }
                long j2 = 0;
                while (true) {
                    if (i3 < str.length()) {
                        char cCharAt9 = str.charAt(i3);
                        i5 = i16;
                        if ('0' <= cCharAt9 && cCharAt9 < ':') {
                            int i17 = cCharAt9 - '0';
                            i6 = i;
                            long j3 = c1860.f6183;
                            if (j2 > j3 || (j2 == j3 && i17 > c1860.f6184)) {
                                while (i3 < str.length() && '0' <= (cCharAt5 = str.charAt(i3)) && cCharAt5 < ':') {
                                    i3++;
                                }
                                if (i3 != str.length()) {
                                    if (i3 != i5 + ((cCharAt7 == '+' || cCharAt7 == '-') ? 1 : 0)) {
                                        j = c1860.f6181;
                                    }
                                }
                                throw new IllegalArgumentException("");
                            }
                            j2 = (j2 << 3) + (j2 << 1) + ((long) i17);
                            i3++;
                            i = i6;
                            i16 = i5;
                        }
                        if (str.charAt(i3) == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            for (i9 = i8; i9 < iMin; i9++) {
                                cCharAt4 = str.charAt(i9);
                                if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                    for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        i7 = i6;
                                        if (i12 < iMin2) {
                                            cCharAt3 = str.charAt(i12);
                                            i15 = iMin2;
                                            if ('0' > cCharAt3 && cCharAt3 < ':') {
                                                i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                                i12++;
                                                i6 = i7;
                                                iMin2 = i15;
                                            }
                                        }
                                    }
                                    for (i14 = 0; i14 < 9 - (i12 - i9); i14++) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i12;
                                    while (i3 < str.length() && '0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') {
                                        i3++;
                                    }
                                    if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                        throw new IllegalArgumentException("");
                                    }
                                    long j4 = (((long) i10) * ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + ((long) i13);
                                    long j5 = i4;
                                    EnumC1122 enumC1124 = EnumC1122.SECONDS;
                                    double d2 = j4;
                                    switch (enumC1124.ordinal()) {
                                        case 0:
                                            d = 1.0E-15d;
                                            break;
                                        case 1:
                                            d = 1.0E-12d;
                                            break;
                                        case 2:
                                            d = 1.0E-9d;
                                            break;
                                        case 3:
                                            d = 1.0E-6d;
                                            break;
                                        case 4:
                                            d = 6.0E-5d;
                                            break;
                                        case 5:
                                            d = 0.0036d;
                                            break;
                                        case 6:
                                            d = 0.0864d;
                                            break;
                                        default:
                                            throw new IllegalStateException(("Unknown unit: " + enumC1124).toString());
                                    }
                                    double d3 = d2 * d;
                                    if (Double.isNaN(d3)) {
                                        throw new IllegalArgumentException("Cannot round NaN value.");
                                    }
                                    jRound = Math.round(d3) * j5;
                                } else {
                                    i10 = (cCharAt4 - '0') + (i10 << 3) + (i10 << 1);
                                }
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                i7 = i6;
                                if (i12 < iMin2) {
                                    cCharAt3 = str.charAt(i12);
                                    i15 = iMin2;
                                    if ('0' > cCharAt3) {
                                    }
                                }
                                i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                i12++;
                                i6 = i7;
                                iMin2 = i15;
                            }
                            while (i14 < 9 - (i12 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i12;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            throw new IllegalArgumentException("");
                        }
                        i7 = i6;
                        cCharAt = str.charAt(i3);
                        if (cCharAt != 'D') {
                            enumC1122 = EnumC1122.DAYS;
                        } else if (cCharAt != 'H') {
                            enumC1122 = EnumC1122.HOURS;
                        } else if (cCharAt != 'M') {
                            enumC1122 = EnumC1122.MINUTES;
                        } else if (cCharAt != 'S') {
                            enumC1122 = null;
                        } else {
                            enumC1122 = EnumC1122.SECONDS;
                        }
                        if (enumC1122 != null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (enumC1123 == null && enumC1123.compareTo(enumC1122) <= 0) {
                            throw new IllegalArgumentException("Unexpected order of duration components");
                        }
                        if (enumC1122 == EnumC1122.DAYS) {
                            if (!z) {
                                throw new IllegalArgumentException("");
                            }
                            jM2173 = AbstractC0743.m2173(j, enumC1122) * ((long) i4);
                        } else {
                            if (z) {
                                throw new IllegalArgumentException("");
                            }
                            jM5315 = m5315(jM2173, AbstractC0743.m2173(j, enumC1122) * ((long) i4));
                            if (jM5315 != 9223372036854759646L) {
                                throw new IllegalArgumentException("");
                            }
                            jM2173 = jM5315;
                        }
                        EnumC1122 enumC1125 = enumC1122;
                        i16 = i3 + 1;
                        enumC1123 = enumC1125;
                        i = i7;
                        c = '-';
                        c2 = '+';
                    } else {
                        i5 = i16;
                    }
                    i6 = i;
                    if (i3 != str.length()) {
                        if (i3 != i5 + ((cCharAt7 == '+' || cCharAt7 == '-') ? 1 : 0)) {
                            j = j2;
                            if (str.charAt(i3) == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt4 = str.charAt(i9);
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        i7 = i6;
                                        if (i12 < iMin2) {
                                            cCharAt3 = str.charAt(i12);
                                            i15 = iMin2;
                                            if ('0' > cCharAt3) {
                                            }
                                        }
                                        i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                        i12++;
                                        i6 = i7;
                                        iMin2 = i15;
                                    }
                                    while (i14 < 9 - (i12 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i12;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    throw new IllegalArgumentException("");
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    i7 = i6;
                                    if (i12 < iMin2) {
                                        cCharAt3 = str.charAt(i12);
                                        i15 = iMin2;
                                        if ('0' > cCharAt3) {
                                        }
                                    }
                                    i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                    i12++;
                                    i6 = i7;
                                    iMin2 = i15;
                                }
                                while (i14 < 9 - (i12 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i12;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                throw new IllegalArgumentException("");
                            }
                            i7 = i6;
                            cCharAt = str.charAt(i3);
                            if (cCharAt != 'D') {
                                enumC1122 = EnumC1122.DAYS;
                            } else if (cCharAt != 'H') {
                                enumC1122 = EnumC1122.HOURS;
                            } else if (cCharAt != 'M') {
                                enumC1122 = EnumC1122.MINUTES;
                            } else if (cCharAt != 'S') {
                                enumC1122 = null;
                            } else {
                                enumC1122 = EnumC1122.SECONDS;
                            }
                            if (enumC1122 != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC1123 == null) {
                            }
                            if (enumC1122 == EnumC1122.DAYS) {
                                if (!z) {
                                    throw new IllegalArgumentException("");
                                }
                                jM2173 = AbstractC0743.m2173(j, enumC1122) * ((long) i4);
                            } else {
                                if (z) {
                                    throw new IllegalArgumentException("");
                                }
                                jM5315 = m5315(jM2173, AbstractC0743.m2173(j, enumC1122) * ((long) i4));
                                if (jM5315 != 9223372036854759646L) {
                                    throw new IllegalArgumentException("");
                                }
                                jM2173 = jM5315;
                            }
                            EnumC1122 enumC1126 = enumC1122;
                            i16 = i3 + 1;
                            enumC1123 = enumC1126;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                    }
                    throw new IllegalArgumentException("");
                }
            }
            if (z || (i16 = i16 + 1) == str.length()) {
                throw new IllegalArgumentException("");
            }
            z = true;
        }
        int i18 = i;
        long jM2698 = C1119.m2698(m5340(jM2173, EnumC1122.MILLISECONDS), m5340(jRound, EnumC1122.NANOSECONDS));
        if (i18 == 0 || jM2698 == C1119.f4182) {
            return jM2698;
        }
        long j6 = ((-(jM2698 >> 1)) << 1) + ((long) (((int) jM2698) & 1));
        int i19 = AbstractC1120.f4184;
        return j6;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final void m5337(InterfaceC0877 interfaceC0877, Object obj) {
        if (obj == f11562) {
            return;
        }
        if (!(obj instanceof C2922)) {
            AbstractC1194.m2791(interfaceC0877.mo940(null, f11564));
            throw null;
        }
        C2922 c2922 = (C2922) obj;
        InterfaceC2919[] interfaceC2919Arr = c2922.f9379;
        int length = interfaceC2919Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC2919 interfaceC2919 = interfaceC2919Arr[length];
        Object obj2 = c2922.f9378[length];
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m5338(Context context, int i, String str) {
        if (!AbstractC2207.m4087(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Not allowed to show a toast from non-main thread, if you must do this, please set allowBackground to true.");
        }
        Toast.makeText(context, str, 0).show();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static String m5339(long j, String str, ZoneId zoneId, int i) {
        if ((i & 1) != 0) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return DateTimeFormatter.ofPattern(str).withZone(zoneId).format(Instant.ofEpochMilli(j));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final long m5340(long j, EnumC1122 enumC1122) {
        EnumC1122 enumC1123 = EnumC1122.NANOSECONDS;
        TimeUnit timeUnit = enumC1122.f4194;
        TimeUnit timeUnit2 = enumC1122.f4194;
        long jConvert = timeUnit.convert(4611686018426999999L, enumC1123.f4194);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = enumC1123.f4194.convert(j, timeUnit2);
            C0373 c0373 = C1119.f4179;
            long j2 = jConvert2 << 1;
            int i = AbstractC1120.f4184;
            return j2;
        }
        EnumC1122 enumC1124 = EnumC1122.MILLISECONDS;
        if (enumC1122.compareTo(enumC1124) < 0) {
            return m5323(AbstractC2203.m4028(enumC1124.f4194.convert(j, timeUnit2)));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m5323(AbstractC0743.m2173(Math.abs(j), enumC1122) * jSignum);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final Object m5341(InterfaceC0877 interfaceC0877, Object obj) {
        if (obj == null) {
            obj = interfaceC0877.mo940(0, f11563);
        }
        if (obj == 0) {
            return f11562;
        }
        if (obj instanceof Integer) {
            return interfaceC0877.mo940(new C2922(interfaceC0877, ((Number) obj).intValue()), f11565);
        }
        AbstractC1194.m2791(obj);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m5342(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2581(i, 0, this));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public abstract void mo1280(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public abstract void mo1281(Typeface typeface);
}
