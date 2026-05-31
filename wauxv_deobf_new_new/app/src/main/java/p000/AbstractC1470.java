package p000;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᛸᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1470 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2469 f5225 = new C2469("list-item-type");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2469 f5226 = new C2469("bullet-list-item-level");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2469 f5227 = new C2469("ordered-list-item-number");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2469 f5228 = new C2469("heading-level");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2469 f5229 = new C2469("link-destination");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2469 f5230 = new C2469("paragraph-is-in-tight-list");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2469 f5231 = new C2469("code-block-info");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0253 f5232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static C0253 f5233;

    static {
        Object obj = null;
        f5232 = new C0253(obj, obj, obj, 18);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1008 m3361(InterfaceC0882 interfaceC0882, InterfaceC0876 interfaceC0876, InterfaceC1437 interfaceC1437) {
        boolean z = true;
        InterfaceC0876 interfaceC0876M4165 = AbstractC2234.m4165(interfaceC0882.mo96(), interfaceC0876, true);
        C1006 c1006 = AbstractC1080.f3904;
        if (interfaceC0876M4165 != c1006 && interfaceC0876M4165.mo1086(C1139.f4214) == null) {
            interfaceC0876M4165 = interfaceC0876M4165.mo1085(c1006);
        }
        C1008 c1008 = new C1008(interfaceC0876M4165, z, 0);
        c1008.m1082(1, c1008, interfaceC1437);
        return c1008;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m3362(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM3345 = AbstractC1469.m3345(context, i);
        if (typedValueM3345 != null) {
            int i3 = typedValueM3345.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueM3345.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m3363(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM3347 = AbstractC1469.m3347(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM3347.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueM3347.data;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m3364(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (~i2) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append("|public");
        }
        if ((i5 & 2) != 0) {
            sb.append("|private");
        }
        if ((i5 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i5 & 8) != 0) {
            sb.append("|static");
        }
        if ((i5 & 16) != 0) {
            sb.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i5 & bc.e) != 0) {
            sb.append("|native");
        }
        if ((i5 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i5) != 0) {
            sb.append("|constructor");
        }
        if ((i5 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(AbstractC2902.m4906(i4));
        }
        return sb.substring(1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static InterfaceC0841 m3365(InterfaceC0841 interfaceC0841) {
        AbstractC0842 abstractC0842 = interfaceC0841 instanceof AbstractC0842 ? (AbstractC0842) interfaceC0841 : null;
        if (abstractC0842 == null || (interfaceC0841 = abstractC0842.f3257) != null) {
            return interfaceC0841;
        }
        AbstractC0877 abstractC0877 = (AbstractC0877) abstractC0842.f3256.mo1086(C1139.f4214);
        InterfaceC0841 c1077 = abstractC0877 != null ? new C1077(abstractC0877, abstractC0842) : abstractC0842;
        abstractC0842.f3257 = c1077;
        return c1077;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m3366(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case Opcodes.IALOAD /* 46 */:
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case Opcodes.ASTORE /* 58 */:
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case Opcodes.DUP2 /* 92 */:
                            case ']':
                            case '^':
                            case Opcodes.SWAP /* 95 */:
                            case Opcodes.IADD /* 96 */:
                                return true;
                            default:
                                switch (cCharAt) {
                                    case Opcodes.LSHR /* 123 */:
                                    case Opcodes.IUSHR /* 124 */:
                                    case Opcodes.LUSHR /* 125 */:
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C1008 m3367(InterfaceC0882 interfaceC0882, InterfaceC0876 interfaceC0876, InterfaceC1437 interfaceC1437) {
        boolean z = true;
        InterfaceC0876 interfaceC0876M4165 = AbstractC2234.m4165(interfaceC0882.mo96(), interfaceC0876, true);
        C1006 c1006 = AbstractC1080.f3904;
        if (interfaceC0876M4165 != c1006 && interfaceC0876M4165.mo1086(C1139.f4214) == null) {
            interfaceC0876M4165 = interfaceC0876M4165.mo1085(c1006);
        }
        C1008 c1008 = new C1008(interfaceC0876M4165, z, 1);
        c1008.m1082(1, c1008, interfaceC1437);
        return c1008;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static int m3368(int i, int i2, float f) {
        return AbstractC0747.m2324(AbstractC0747.m2326(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final void m3369(C0535 c0535, InterfaceC0841 interfaceC0841, boolean z) {
        Object obj = C0535.f2241.get(c0535);
        Throwable thMo2037 = c0535.mo2037(obj);
        Object c2641 = thMo2037 != null ? new C2641(thMo2037) : c0535.mo2038(obj);
        if (!z) {
            interfaceC0841.mo1077(c2641);
            return;
        }
        C1077 c1077 = (C1077) interfaceC0841;
        AbstractC0842 abstractC0842 = c1077.f3899;
        Object obj2 = c1077.f3901;
        InterfaceC0876 interfaceC0876 = abstractC0842.f3256;
        Object objM4910 = AbstractC2902.m4910(interfaceC0876, obj2);
        C3550 c3550M4189 = objM4910 != AbstractC2902.f9274 ? AbstractC2234.m4189(abstractC0842, interfaceC0876, objM4910) : null;
        try {
            c1077.f3899.mo1077(c2641);
        } finally {
            if (c3550M4189 == null || c3550M4189.m5104()) {
                AbstractC2902.m4899(interfaceC0876, objM4910);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static int m3370(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static int m3371(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final void m3372(Object obj) throws Throwable {
        if (obj instanceof C2641) {
            throw ((C2641) obj).f8344;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final Class m3373(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m3373(((ParameterizedType) type).getRawType());
        }
        throw new C3508("Cannot cast type " + type + " to java.lang.Class object.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Object m3374(AbstractC0877 abstractC0877, InterfaceC1437 interfaceC1437, AbstractC2922 abstractC2922) throws Throwable {
        InterfaceC0876 interfaceC0876 = abstractC2922.f3256;
        abstractC0877.getClass();
        InterfaceC0876 interfaceC0876Mo1085 = interfaceC0876.mo1085(abstractC0877);
        AbstractC1471.m3385(interfaceC0876Mo1085);
        if (interfaceC0876Mo1085 == interfaceC0876) {
            C2697 c2697 = new C2697(interfaceC0876Mo1085, abstractC2922);
            return C1787.m3678(c2697, c2697, interfaceC1437);
        }
        C1139 c1139 = C1139.f4214;
        if (AbstractC1469.m3322(interfaceC0876Mo1085.mo1086(c1139), interfaceC0876.mo1086(c1139))) {
            C3550 c3550 = new C3550(interfaceC0876Mo1085, abstractC2922);
            InterfaceC0876 interfaceC0877 = c3550.f1055;
            Object objM4910 = AbstractC2902.m4910(interfaceC0877, null);
            try {
                return C1787.m3678(c3550, c3550, interfaceC1437);
            } finally {
                AbstractC2902.m4899(interfaceC0877, objM4910);
            }
        }
        C1078 c1078 = new C1078(interfaceC0876Mo1085, abstractC2922);
        try {
            AbstractC2235.m4212(m3365(((AbstractC0345) interfaceC1437).mo1343(c1078, c1078)), C3554.UNIT);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1078.f3902;
            do {
                int i = atomicIntegerFieldUpdater.get(c1078);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objM3102 = AbstractC1272.m3102(C1723.f5839.get(c1078));
                    if (objM3102 instanceof C0757) {
                        throw ((C0757) objM3102).f2861;
                    }
                    return objM3102;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c1078, 0, 1));
            return EnumC0883.f3332;
        } catch (Throwable th) {
            AbstractC2234.m4164(c1078, th);
            throw null;
        }
    }
}
