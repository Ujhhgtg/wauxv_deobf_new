package p000;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import okhttp3.Call;
import okhttp3.internal.http2.Http2Connection;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0479 f3528 = new C0479();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f3529 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f3530 = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final int[] f3531 = {3, 6};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final int[] f3532 = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m2588(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m2589(InterfaceC0874 interfaceC0874) {
        if (interfaceC0874 == null) {
            return;
        }
        Iterator it = AbstractC2174.f7207.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else {
                C2241 c2241 = (C2241) call.request().tag(C2241.class);
                Object obj = c2241 != null ? c2241.f7306 : null;
                if (interfaceC0874.equals(obj != null ? obj : null)) {
                    call.cancel();
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final void m2590(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final void m2591(Throwable th) {
        String str;
        String string;
        if (AbstractC2174.f7205) {
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                string = stringWriter.toString();
            } else {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                StackTraceElement stackTraceElement = 1 < stackTrace.length ? stackTrace[1] : null;
                if (stackTraceElement != null) {
                    str = " (" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                string = th + str;
            }
            Log.d(AbstractC2174.f7206, string);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final void m2592(AbstractC1024 abstractC1024, DexKitBridge dexKitBridge, InterfaceC1433 interfaceC1433) {
        Object c2641;
        String str;
        C1023 c1023 = new C1023(dexKitBridge, abstractC1024);
        interfaceC1433.invoke(c1023);
        String[] strArr = AbstractC1471.f5234;
        try {
            InterfaceC1433 interfaceC1434 = c1023.f3739;
            if (interfaceC1434 != null && c1023.f3740 != null) {
                C0694 c0694 = (C0694) dexKitBridge.m1047(interfaceC1434).m1598();
                InterfaceC1433 interfaceC1435 = c1023.f3740;
                c0694.getClass();
                C1335 c1335 = new C1335();
                interfaceC1435.invoke(c1335);
                c1335.f4793 = Collections.singletonList(c0694);
                C2006 c2006M1048 = c0694.f1723.m1048(c1335);
                InterfaceC1433 interfaceC1436 = c1023.f3741;
                str = ((C2005) (interfaceC1436 != null ? c2006M1048.m1599(interfaceC1436) : c2006M1048.m1598())).f6651;
            } else if (interfaceC1434 != null) {
                str = ((C0694) dexKitBridge.m1047(interfaceC1434).m1598()).f2650;
            } else {
                InterfaceC1433 interfaceC1437 = c1023.f3740;
                if (interfaceC1437 == null) {
                    throw new IllegalArgumentException(abstractC1024.f3742 + " FindDexClassMethod Config Failed");
                }
                dexKitBridge.getClass();
                C1335 c1336 = new C1335();
                interfaceC1437.invoke(c1336);
                C2006 c2006M1049 = dexKitBridge.m1048(c1336);
                InterfaceC1433 interfaceC1438 = c1023.f3741;
                str = ((C2005) (interfaceC1438 != null ? c2006M1049.m1599(interfaceC1438) : c2006M1049.m1598())).f6651;
            }
            String str2 = (String) abstractC1024.f3743.getValue();
            C0519 c0519 = AbstractC0738.f2837;
            if (c0519 == null) {
                throw new IllegalArgumentException("DexDescConfig must be init".toString());
            }
            c0519.m1985().putString(str2, str);
            c2641 = C3554.UNIT;
            if (C2642.m4616(c2641) != null) {
                ArrayList arrayList = C3741.f11709;
                String str3 = abstractC1024.f3742 + " FindDexClassMethod Failed";
                C0488.f2136.getClass();
                C3741.m5315(str3, null, 12);
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final void m2593(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final String m2594(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C2438 m2595(C0246 c0246) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C2438(AbstractC1081.m2770(c0246));
        }
        TextPaint textPaint = new TextPaint(c0246.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0246.getBreakStrategy();
        int hyphenationFrequency = c0246.getHyphenationFrequency();
        if (c0246.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c0246.getInputType() & 15) != 3) {
            boolean z = c0246.getLayoutDirection() == 1;
            switch (c0246.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC1081.m2764(DecimalFormatSymbols.getInstance(c0246.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C2438(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final boolean m2596(EnumC3737 enumC3737) {
        C1576.f5470.getClass();
        return C1576.m3458() >= enumC3737.f11695 && !C1576.m3460();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean m2597(EnumC3734 enumC3734) {
        C1576.f5470.getClass();
        return C1576.m3458() >= enumC3734.f11662 && C1576.m3460();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static String m2598(int i) {
        switch (i) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case Opcodes.FCONST_1 /* 12 */:
                return "if-gt";
            case 13:
                return "switch";
            case Opcodes.DCONST_0 /* 14 */:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case Opcodes.SIPUSH /* 17 */:
                return "div";
            case Opcodes.LDC /* 18 */:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case Opcodes.ILOAD /* 21 */:
                return "or";
            case Opcodes.LLOAD /* 22 */:
                return "xor";
            case Opcodes.FLOAD /* 23 */:
                return "shl";
            case Opcodes.DLOAD /* 24 */:
                return "shr";
            case Opcodes.ALOAD /* 25 */:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case 45:
                return "get-field";
            case Opcodes.IALOAD /* 46 */:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case Opcodes.AALOAD /* 50 */:
                return "invoke-virtual";
            case Opcodes.BALOAD /* 51 */:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case Opcodes.SALOAD /* 53 */:
                return "invoke-interface";
            case Opcodes.ISTORE /* 54 */:
            default:
                return "unknown-".concat(AbstractC2902.m4905(i));
            case Opcodes.LSTORE /* 55 */:
                return "move-result";
            case Opcodes.FSTORE /* 56 */:
                return "move-result-pseudo";
            case Opcodes.DSTORE /* 57 */:
                return "fill-array-data";
            case Opcodes.ASTORE /* 58 */:
                return "invoke-polymorphic";
            case 59:
                return "invoke-custom";
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C1669 m2599(String str, String str2, int i, InterfaceC1433 interfaceC1433) {
        char cCharAt = str.charAt(i);
        if (((Boolean) interfaceC1433.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m2600(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1669 m2600(String str, String str2) {
        StringBuilder sbM2803 = AbstractC1095.m2803(str2, " when parsing an Instant from \"");
        sbM2803.append(m2612(64, str));
        sbM2803.append('\"');
        return new C1669(sbM2803.toString(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final int m2601(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final int m2602(C2710 c2710, int i) {
        int i2;
        int[] iArr = c2710.f8717;
        int i3 = i + 1;
        int length = c2710.f8716.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m2603(TextView textView, int i) {
        C1787.m3663(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC1081.m2771(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static void m2604(TextView textView, int i) {
        C1787.m3663(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m2605(TextView textView, int i) {
        C1787.m3663(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final Class m2606(String str) {
        C1576.f5470.getClass();
        return AbstractC0705.m2223(C1576.m3455(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final String m2607(InterfaceC0841 interfaceC0841) {
        Object c2641;
        if (interfaceC0841 instanceof C1077) {
            return ((C1077) interfaceC0841).toString();
        }
        try {
            c2641 = interfaceC0841 + '@' + m2594(interfaceC0841);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) != null) {
            c2641 = interfaceC0841.getClass().getName() + '@' + m2594(interfaceC0841);
        }
        return (String) c2641;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final Class m2608(AbstractC1024 abstractC1024) throws NoSuchMethodException {
        Object c2641;
        try {
            String strM2726 = AbstractC1031.m2726(abstractC1024.m2718());
            C1576.f5470.getClass();
            c2641 = AbstractC1665.m3543(C1576.m3455(), strM2726);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) == null) {
            return (Class) c2641;
        }
        ArrayList arrayList = C3741.f11709;
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC1024.f3742);
        String[] strArr = AbstractC1471.f5234;
        sb.append(" toDexClass Failed");
        String string = sb.toString();
        C0488.f2136.getClass();
        C3741.m5315(string, null, 12);
        throw new NoSuchMethodException(abstractC1024.f3742 + " toDexClass Failed");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final Constructor m2609(AbstractC1024 abstractC1024) throws NoSuchMethodException {
        Object c2641;
        try {
            C1028 c1028 = new C1028(abstractC1024.m2718());
            C1576.f5470.getClass();
            c2641 = c1028.m2721(C1576.m3455());
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) == null) {
            return (Constructor) c2641;
        }
        ArrayList arrayList = C3741.f11709;
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC1024.f3742);
        String[] strArr = AbstractC1471.f5234;
        sb.append(" toDexConstructor Failed");
        String string = sb.toString();
        C0488.f2136.getClass();
        C3741.m5315(string, null, 12);
        throw new NoSuchMethodException(abstractC1024.f3742 + " toDexConstructor Failed");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Method m2610(AbstractC1024 abstractC1024) throws NoSuchMethodException {
        Object c2641;
        try {
            C1028 c1028 = new C1028(abstractC1024.m2718());
            C1576.f5470.getClass();
            c2641 = c1028.m2722(C1576.m3455(), null);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) == null) {
            return (Method) c2641;
        }
        ArrayList arrayList = C3741.f11709;
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC1024.f3742);
        String[] strArr = AbstractC1471.f5234;
        sb.append(" toDexMethod Failed");
        String string = sb.toString();
        C0488.f2136.getClass();
        C3741.m5315(string, null, 12);
        throw new NoSuchMethodException(abstractC1024.f3742 + " toDexMethod Failed");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final void m2611(AbstractC1024 abstractC1024, InterfaceC1433 interfaceC1433) {
        interfaceC1433.invoke(m2610(abstractC1024));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final String m2612(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static ActionMode.Callback m2613(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC2972) || callback == null) ? callback : new ActionModeCallbackC2972(callback, textView);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract int mo1106(C1353 c1353);
}
