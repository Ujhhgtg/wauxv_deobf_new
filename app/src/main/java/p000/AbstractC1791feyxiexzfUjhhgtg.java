package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴ要点脸ᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1791feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3331feyxiexzfUjhhgtg f6031Ujhhgtgfeyxiexzf = new C3331feyxiexzfUjhhgtg(new C3162feyxiexzfUjhhgtg(2));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object f6032Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3129Ujhhgtgfeyxiexzf(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC0703Ujhhgtgfeyxiexzf.f2885Ujhhgtgfeyxiexzf;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1431feyxiexzfUjhhgtg.f5027Ujhhgtgfeyxiexzf;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m3130Ujhhgtgfeyxiexzf(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static List m3131Ujhhgtgfeyxiexzf(Object obj) {
        if ((obj instanceof InterfaceC0140Ujhhgtgfeyxiexzf) && !(obj instanceof InterfaceC0139Ujhhgtgfeyxiexzf)) {
            m3150feyxiexzfUjhhgtg(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            C3052Ujhhgtgfeyxiexzf.m4527Ujhhgtgfeyxiexzf(e, AbstractC1791feyxiexzfUjhhgtg.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m3132Ujhhgtgfeyxiexzf(int i, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof InterfaceC3587Ujhhgtgfeyxiexzf) {
                if (obj instanceof InterfaceC3588feyxiexzfUjhhgtg) {
                    arity = ((InterfaceC3588feyxiexzfUjhhgtg) obj).getArity();
                } else if (obj instanceof InterfaceC3545feyxiexzfUjhhgtg) {
                    arity = 0;
                } else if (obj instanceof InterfaceC3549feyxiexzfUjhhgtg) {
                    arity = 1;
                } else if (obj instanceof InterfaceC3553feyxiexzfUjhhgtg) {
                    arity = 2;
                } else if (obj instanceof InterfaceC3556feyxiexzfUjhhgtg) {
                    arity = 3;
                } else {
                    arity = obj instanceof C0451Ujhhgtgfeyxiexzf ? 4 : -1;
                }
                if (arity == i) {
                    return;
                }
            }
            m3150feyxiexzfUjhhgtg(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static String m3133Ujhhgtgfeyxiexzf(AbstractC3473Ujhhgtgfeyxiexzf abstractC3473Ujhhgtgfeyxiexzf) {
        int iM3298Ujhhgtgfeyxiexzf = ((C1966Ujhhgtgfeyxiexzf) abstractC3473Ujhhgtgfeyxiexzf).m3298Ujhhgtgfeyxiexzf();
        return iM3298Ujhhgtgfeyxiexzf == ((short) iM3298Ujhhgtgfeyxiexzf) ? AbstractC1264feyxiexzfUjhhgtg.m2804Ujhhgtgfeyxiexzf(iM3298Ujhhgtgfeyxiexzf) : AbstractC1264feyxiexzfUjhhgtg.m2805Ujhhgtgfeyxiexzf(iM3298Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static String m3134Ujhhgtgfeyxiexzf(AbstractC3473Ujhhgtgfeyxiexzf abstractC3473Ujhhgtgfeyxiexzf) {
        int iM4544Ujhhgtgfeyxiexzf = ((C1966Ujhhgtgfeyxiexzf) abstractC3473Ujhhgtgfeyxiexzf).f6447Ujhhgtgfeyxiexzf.m4544Ujhhgtgfeyxiexzf();
        return iM4544Ujhhgtgfeyxiexzf == ((char) iM4544Ujhhgtgfeyxiexzf) ? AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf) : AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static short m3135Ujhhgtgfeyxiexzf(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static short m3136Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final void m3137Ujhhgtgfeyxiexzf(AbstractC3266feyxiexzfUjhhgtg abstractC3266feyxiexzfUjhhgtg, DexKitBridge dexKitBridge, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        Object c0919feyxiexzfUjhhgtg;
        String str;
        C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = new C3265feyxiexzfUjhhgtg(dexKitBridge, abstractC3266feyxiexzfUjhhgtg);
        interfaceC3549feyxiexzfUjhhgtg.invoke(c3265feyxiexzfUjhhgtg);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        try {
            InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg2 = c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf;
            if (interfaceC3549feyxiexzfUjhhgtg2 != null && c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf != null) {
                C2803Ujhhgtgfeyxiexzf c2803Ujhhgtgfeyxiexzf = (C2803Ujhhgtgfeyxiexzf) dexKitBridge.m1048Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg2).m3695Ujhhgtgfeyxiexzf();
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg3 = c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf;
                c2803Ujhhgtgfeyxiexzf.getClass();
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = new C3452feyxiexzfUjhhgtg();
                interfaceC3549feyxiexzfUjhhgtg3.invoke(c3452feyxiexzfUjhhgtg);
                c3452feyxiexzfUjhhgtg.f10738Ujhhgtgfeyxiexzf = Collections.singletonList(c2803Ujhhgtgfeyxiexzf);
                C0388Ujhhgtgfeyxiexzf c0388UjhhgtgfeyxiexzfM1049Ujhhgtgfeyxiexzf = c2803Ujhhgtgfeyxiexzf.f8116Ujhhgtgfeyxiexzf.m1049Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg4 = c3265feyxiexzfUjhhgtg.f10257Ujhhgtgfeyxiexzf;
                str = ((C0385Ujhhgtgfeyxiexzf) (interfaceC3549feyxiexzfUjhhgtg4 != null ? c0388UjhhgtgfeyxiexzfM1049Ujhhgtgfeyxiexzf.m3696Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg4) : c0388UjhhgtgfeyxiexzfM1049Ujhhgtgfeyxiexzf.m3695Ujhhgtgfeyxiexzf())).f2119Ujhhgtgfeyxiexzf;
            } else if (interfaceC3549feyxiexzfUjhhgtg2 != null) {
                str = ((C2803Ujhhgtgfeyxiexzf) dexKitBridge.m1048Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg2).m3695Ujhhgtgfeyxiexzf()).f8910Ujhhgtgfeyxiexzf;
            } else {
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg5 = c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf;
                if (interfaceC3549feyxiexzfUjhhgtg5 == null) {
                    throw new IllegalArgumentException(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf + MagicFactory.get(4928236803338536330L, strArr));
                }
                dexKitBridge.getClass();
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = new C3452feyxiexzfUjhhgtg();
                interfaceC3549feyxiexzfUjhhgtg5.invoke(c3452feyxiexzfUjhhgtg2);
                C0388Ujhhgtgfeyxiexzf c0388UjhhgtgfeyxiexzfM1049Ujhhgtgfeyxiexzf2 = dexKitBridge.m1049Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg6 = c3265feyxiexzfUjhhgtg.f10257Ujhhgtgfeyxiexzf;
                str = ((C0385Ujhhgtgfeyxiexzf) (interfaceC3549feyxiexzfUjhhgtg6 != null ? c0388UjhhgtgfeyxiexzfM1049Ujhhgtgfeyxiexzf2.m3696Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg6) : c0388UjhhgtgfeyxiexzfM1049Ujhhgtgfeyxiexzf2.m3695Ujhhgtgfeyxiexzf())).f2119Ujhhgtgfeyxiexzf;
            }
            String str2 = (String) abstractC3266feyxiexzfUjhhgtg.f10259Ujhhgtgfeyxiexzf.getValue();
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.f4604Ujhhgtgfeyxiexzf;
            if (c2629Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException(MagicFactory.get(4928284769533298058L, strArr).toString());
            }
            c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().putString(str2, str);
            c0919feyxiexzfUjhhgtg = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) != null) {
                ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                String str3 = abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf + MagicFactory.get(4928236932187555210L, strArr);
                C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
                C2290feyxiexzfUjhhgtg.m3495Ujhhgtgfeyxiexzf(str3, null, 12);
            }
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C2425Ujhhgtgfeyxiexzf m3138Ujhhgtgfeyxiexzf(C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf) {
        C2425Ujhhgtgfeyxiexzf c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf;
        C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf;
        C2543feyxiexzfUjhhgtg c2543feyxiexzfUjhhgtg = (C2543feyxiexzfUjhhgtg) c2657Ujhhgtgfeyxiexzf.m3983Ujhhgtgfeyxiexzf("RuntimeVisibleAnnotations");
        C2541feyxiexzfUjhhgtg c2541feyxiexzfUjhhgtg = (C2541feyxiexzfUjhhgtg) c2657Ujhhgtgfeyxiexzf.m3983Ujhhgtgfeyxiexzf("RuntimeInvisibleAnnotations");
        if (c2543feyxiexzfUjhhgtg == null) {
            c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf = c2541feyxiexzfUjhhgtg == null ? C2425Ujhhgtgfeyxiexzf.f7853Ujhhgtgfeyxiexzf : (C2425Ujhhgtgfeyxiexzf) c2541feyxiexzfUjhhgtg.f8113Ujhhgtgfeyxiexzf;
        } else {
            c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf = (C2425Ujhhgtgfeyxiexzf) c2543feyxiexzfUjhhgtg.f8113Ujhhgtgfeyxiexzf;
            if (c2541feyxiexzfUjhhgtg != null) {
                C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf = (C2425Ujhhgtgfeyxiexzf) c2541feyxiexzfUjhhgtg.f8113Ujhhgtgfeyxiexzf;
                C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf2 = new C2425Ujhhgtgfeyxiexzf();
                c2425Ujhhgtgfeyxiexzf2.m3674Ujhhgtgfeyxiexzf(c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf);
                c2425Ujhhgtgfeyxiexzf2.m3674Ujhhgtgfeyxiexzf(c2425Ujhhgtgfeyxiexzf);
                c2425Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
                c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf = c2425Ujhhgtgfeyxiexzf2;
            }
        }
        C2545feyxiexzfUjhhgtg c2545feyxiexzfUjhhgtg = (C2545feyxiexzfUjhhgtg) c2657Ujhhgtgfeyxiexzf.m3983Ujhhgtgfeyxiexzf("Signature");
        C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf2 = null;
        if (c2545feyxiexzfUjhhgtg == null) {
            c2413Ujhhgtgfeyxiexzf = null;
        } else {
            C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = c2545feyxiexzfUjhhgtg.f8265Ujhhgtgfeyxiexzf;
            c2413Ujhhgtgfeyxiexzf = new C2413Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7847Ujhhgtgfeyxiexzf, 3);
            String str = c3056Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf;
            int length = str.length();
            ArrayList arrayList = new ArrayList(20);
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (str.charAt(i) == 'L') {
                    while (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == ';') {
                            i2++;
                            break;
                        }
                        if (cCharAt == '<') {
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (i2 < length && str.charAt(i2) != 'L') {
                        i2++;
                    }
                }
                arrayList.add(str.substring(i, i2));
                i = i2;
            }
            int size = arrayList.size();
            C3754feyxiexzfUjhhgtg c3754feyxiexzfUjhhgtg = new C3754feyxiexzfUjhhgtg(size);
            for (int i3 = 0; i3 < size; i3++) {
                c3754feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i3, new C3056Ujhhgtgfeyxiexzf((String) arrayList.get(i3)));
            }
            c3754feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
            c2413Ujhhgtgfeyxiexzf.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7852Ujhhgtgfeyxiexzf, new C3755Ujhhgtgfeyxiexzf(c3754feyxiexzfUjhhgtg)));
            c2413Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        }
        C2546feyxiexzfUjhhgtg c2546feyxiexzfUjhhgtg = (C2546feyxiexzfUjhhgtg) c2657Ujhhgtgfeyxiexzf.m3983Ujhhgtgfeyxiexzf("SourceDebugExtension");
        if (c2546feyxiexzfUjhhgtg != null) {
            C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = c2546feyxiexzfUjhhgtg.f8266Ujhhgtgfeyxiexzf;
            c2413Ujhhgtgfeyxiexzf2 = new C2413Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7848Ujhhgtgfeyxiexzf, 3);
            c2413Ujhhgtgfeyxiexzf2.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7852Ujhhgtgfeyxiexzf, c3056Ujhhgtgfeyxiexzf2));
            c2413Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
        }
        if (c2413Ujhhgtgfeyxiexzf != null) {
            c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf = C2425Ujhhgtgfeyxiexzf.m3672Ujhhgtgfeyxiexzf(c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf, c2413Ujhhgtgfeyxiexzf);
        }
        return c2413Ujhhgtgfeyxiexzf2 != null ? C2425Ujhhgtgfeyxiexzf.m3672Ujhhgtgfeyxiexzf(c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf, c2413Ujhhgtgfeyxiexzf2) : c2425UjhhgtgfeyxiexzfM3672Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C2425Ujhhgtgfeyxiexzf m3139Ujhhgtgfeyxiexzf(InterfaceC0389Ujhhgtgfeyxiexzf interfaceC0389Ujhhgtgfeyxiexzf) {
        C2425Ujhhgtgfeyxiexzf c2425UjhhgtgfeyxiexzfM3138Ujhhgtgfeyxiexzf = m3138Ujhhgtgfeyxiexzf(interfaceC0389Ujhhgtgfeyxiexzf.getAttributes());
        C2537feyxiexzfUjhhgtg c2537feyxiexzfUjhhgtg = (C2537feyxiexzfUjhhgtg) interfaceC0389Ujhhgtgfeyxiexzf.getAttributes().m3983Ujhhgtgfeyxiexzf("Exceptions");
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = c2537feyxiexzfUjhhgtg == null ? C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf : c2537feyxiexzfUjhhgtg.f8261Ujhhgtgfeyxiexzf;
        if (interfaceC1790feyxiexzfUjhhgtg.size() == 0) {
            return c2425UjhhgtgfeyxiexzfM3138Ujhhgtgfeyxiexzf;
        }
        C3755Ujhhgtgfeyxiexzf c3755UjhhgtgfeyxiexzfM3671Ujhhgtgfeyxiexzf = AbstractC2424Ujhhgtgfeyxiexzf.m3671Ujhhgtgfeyxiexzf(interfaceC1790feyxiexzfUjhhgtg);
        C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf = new C2413Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7849Ujhhgtgfeyxiexzf, 3);
        c2413Ujhhgtgfeyxiexzf.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7852Ujhhgtgfeyxiexzf, c3755UjhhgtgfeyxiexzfM3671Ujhhgtgfeyxiexzf));
        c2413Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        return C2425Ujhhgtgfeyxiexzf.m3672Ujhhgtgfeyxiexzf(c2425UjhhgtgfeyxiexzfM3138Ujhhgtgfeyxiexzf, c2413Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C2427Ujhhgtgfeyxiexzf m3140Ujhhgtgfeyxiexzf(InterfaceC0389Ujhhgtgfeyxiexzf interfaceC0389Ujhhgtgfeyxiexzf) {
        C2657Ujhhgtgfeyxiexzf attributes = interfaceC0389Ujhhgtgfeyxiexzf.getAttributes();
        C2544feyxiexzfUjhhgtg c2544feyxiexzfUjhhgtg = (C2544feyxiexzfUjhhgtg) attributes.m3983Ujhhgtgfeyxiexzf("RuntimeVisibleParameterAnnotations");
        C2542feyxiexzfUjhhgtg c2542feyxiexzfUjhhgtg = (C2542feyxiexzfUjhhgtg) attributes.m3983Ujhhgtgfeyxiexzf("RuntimeInvisibleParameterAnnotations");
        if (c2544feyxiexzfUjhhgtg == null) {
            return c2542feyxiexzfUjhhgtg == null ? C2427Ujhhgtgfeyxiexzf.f7859Ujhhgtgfeyxiexzf : (C2427Ujhhgtgfeyxiexzf) c2542feyxiexzfUjhhgtg.f8113Ujhhgtgfeyxiexzf;
        }
        C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf = (C2427Ujhhgtgfeyxiexzf) c2544feyxiexzfUjhhgtg.f8113Ujhhgtgfeyxiexzf;
        if (c2542feyxiexzfUjhhgtg == null) {
            return c2427Ujhhgtgfeyxiexzf;
        }
        C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf2 = (C2427Ujhhgtgfeyxiexzf) c2542feyxiexzfUjhhgtg.f8113Ujhhgtgfeyxiexzf;
        C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf3 = C2427Ujhhgtgfeyxiexzf.f7859Ujhhgtgfeyxiexzf;
        int length = c2427Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        if (length != c2427Ujhhgtgfeyxiexzf2.f10801Ujhhgtgfeyxiexzf.length) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf4 = new C2427Ujhhgtgfeyxiexzf(length);
        for (int i = 0; i < length; i++) {
            C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf = (C2425Ujhhgtgfeyxiexzf) c2427Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i);
            C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf2 = (C2425Ujhhgtgfeyxiexzf) c2427Ujhhgtgfeyxiexzf2.m4969Ujhhgtgfeyxiexzf(i);
            C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf3 = new C2425Ujhhgtgfeyxiexzf();
            c2425Ujhhgtgfeyxiexzf3.m3674Ujhhgtgfeyxiexzf(c2425Ujhhgtgfeyxiexzf);
            c2425Ujhhgtgfeyxiexzf3.m3674Ujhhgtgfeyxiexzf(c2425Ujhhgtgfeyxiexzf2);
            c2425Ujhhgtgfeyxiexzf3.f2247Ujhhgtgfeyxiexzf = false;
            c2425Ujhhgtgfeyxiexzf3.m1730Ujhhgtgfeyxiexzf();
            c2427Ujhhgtgfeyxiexzf4.m4970Ujhhgtgfeyxiexzf(i, c2425Ujhhgtgfeyxiexzf3);
        }
        c2427Ujhhgtgfeyxiexzf4.f2247Ujhhgtgfeyxiexzf = false;
        return c2427Ujhhgtgfeyxiexzf4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static boolean m3141Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        if (length < 2) {
            return true;
        }
        int iM2455Ujhhgtgfeyxiexzf = ((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(0)).f3830Ujhhgtgfeyxiexzf;
        for (int i = 0; i < length; i++) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i);
            if (c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf != iM2455Ujhhgtgfeyxiexzf) {
                return false;
            }
            iM2455Ujhhgtgfeyxiexzf += c0961feyxiexzfUjhhgtg.m2455Ujhhgtgfeyxiexzf();
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static boolean m3142Ujhhgtgfeyxiexzf(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m3143Ujhhgtgfeyxiexzf(AbstractC3150Ujhhgtgfeyxiexzf abstractC3150Ujhhgtgfeyxiexzf, int i) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jMo4664Ujhhgtgfeyxiexzf = abstractC3150Ujhhgtgfeyxiexzf instanceof AbstractC3149Ujhhgtgfeyxiexzf ? ((AbstractC3149Ujhhgtgfeyxiexzf) abstractC3150Ujhhgtgfeyxiexzf).f9757Ujhhgtgfeyxiexzf : abstractC3150Ujhhgtgfeyxiexzf.mo4664Ujhhgtgfeyxiexzf();
        if (i == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) jMo4664Ujhhgtgfeyxiexzf) & 15, 16)}));
        } else if (i == 8) {
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf((int) jMo4664Ujhhgtgfeyxiexzf));
        } else if (i == 16) {
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf((int) jMo4664Ujhhgtgfeyxiexzf));
        } else if (i == 32) {
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf((int) jMo4664Ujhhgtgfeyxiexzf));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2811Ujhhgtgfeyxiexzf(jMo4664Ujhhgtgfeyxiexzf));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m3144Ujhhgtgfeyxiexzf(AbstractC3150Ujhhgtgfeyxiexzf abstractC3150Ujhhgtgfeyxiexzf) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC3150Ujhhgtgfeyxiexzf instanceof C3147Ujhhgtgfeyxiexzf) {
            sb.append("null");
        } else {
            sb.append(abstractC3150Ujhhgtgfeyxiexzf.mo4533Ujhhgtgfeyxiexzf());
            sb.append(' ');
            sb.append(abstractC3150Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m3145Ujhhgtgfeyxiexzf(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static short m3146feyxiexzfUjhhgtg(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int i2 = abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf.f10099Ujhhgtgfeyxiexzf;
        if ((i2 & 255) == i2) {
            return (short) (i2 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m3147feyxiexzfUjhhgtg(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m3151feyxiexzfUjhhgtg(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m3151feyxiexzfUjhhgtg(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m3151feyxiexzfUjhhgtg(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m3151feyxiexzfUjhhgtg(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static String m3148feyxiexzfUjhhgtg(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).m2457Ujhhgtgfeyxiexzf());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static String m3149feyxiexzfUjhhgtg(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (length != 0) {
            if (length != 1) {
                C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(length - 1);
                if (c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.m2455Ujhhgtgfeyxiexzf() == 2) {
                    c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.m2459Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf + 1);
                }
                sb.append(((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(0)).m2457Ujhhgtgfeyxiexzf());
                sb.append("..");
                sb.append(c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.m2457Ujhhgtgfeyxiexzf());
            } else {
                sb.append(((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(0)).m2457Ujhhgtgfeyxiexzf());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static void m3150feyxiexzfUjhhgtg(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        C3052Ujhhgtgfeyxiexzf.m4527Ujhhgtgfeyxiexzf(classCastException, AbstractC1791feyxiexzfUjhhgtg.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static void m3151feyxiexzfUjhhgtg(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final Class m3152feyxiexzfUjhhgtg(AbstractC3266feyxiexzfUjhhgtg abstractC3266feyxiexzfUjhhgtg) throws NoSuchMethodException {
        Object c0919feyxiexzfUjhhgtg;
        try {
            String strM4781Ujhhgtgfeyxiexzf = AbstractC3273feyxiexzfUjhhgtg.m4781Ujhhgtgfeyxiexzf(abstractC3266feyxiexzfUjhhgtg.m4773Ujhhgtgfeyxiexzf());
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            c0919feyxiexzfUjhhgtg = AbstractC0668Ujhhgtgfeyxiexzf.m1934Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1854Ujhhgtgfeyxiexzf(), strM4781Ujhhgtgfeyxiexzf);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) == null) {
            return (Class) c0919feyxiexzfUjhhgtg;
        }
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928235991589717386L, strArr));
        String string = sb.toString();
        C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
        C2290feyxiexzfUjhhgtg.m3495Ujhhgtgfeyxiexzf(string, null, 12);
        throw new NoSuchMethodException(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf + MagicFactory.get(4928236047424292234L, strArr));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final Constructor m3153feyxiexzfUjhhgtg(AbstractC3266feyxiexzfUjhhgtg abstractC3266feyxiexzfUjhhgtg) throws NoSuchMethodException {
        Object c0919feyxiexzfUjhhgtg;
        try {
            C3270feyxiexzfUjhhgtg c3270feyxiexzfUjhhgtg = new C3270feyxiexzfUjhhgtg(abstractC3266feyxiexzfUjhhgtg.m4773Ujhhgtgfeyxiexzf());
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            c0919feyxiexzfUjhhgtg = c3270feyxiexzfUjhhgtg.m4776Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1854Ujhhgtgfeyxiexzf());
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) == null) {
            return (Constructor) c0919feyxiexzfUjhhgtg;
        }
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928236343777035658L, strArr));
        String string = sb.toString();
        C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
        C2290feyxiexzfUjhhgtg.m3495Ujhhgtgfeyxiexzf(string, null, 12);
        throw new NoSuchMethodException(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf + MagicFactory.get(4928236511280760202L, strArr));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static final Method m3154feyxiexzfUjhhgtg(AbstractC3266feyxiexzfUjhhgtg abstractC3266feyxiexzfUjhhgtg) {
        Object c0919feyxiexzfUjhhgtg;
        try {
            C3270feyxiexzfUjhhgtg c3270feyxiexzfUjhhgtg = new C3270feyxiexzfUjhhgtg(abstractC3266feyxiexzfUjhhgtg.m4773Ujhhgtgfeyxiexzf());
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            c0919feyxiexzfUjhhgtg = c3270feyxiexzfUjhhgtg.m4777Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1854Ujhhgtgfeyxiexzf(), null);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) == null) {
            return (Method) c0919feyxiexzfUjhhgtg;
        }
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928236103258867082L, strArr));
        String string = sb.toString();
        C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
        C2290feyxiexzfUjhhgtg.m3495Ujhhgtgfeyxiexzf(string, null, 12);
        throw new NoSuchMethodException(abstractC3266feyxiexzfUjhhgtg.f10258Ujhhgtgfeyxiexzf + MagicFactory.get(4928236292237428106L, strArr));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final void m3155feyxiexzfUjhhgtg(AbstractC3266feyxiexzfUjhhgtg abstractC3266feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        interfaceC3549feyxiexzfUjhhgtg.invoke(m3154feyxiexzfUjhhgtg(abstractC3266feyxiexzfUjhhgtg));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static C2425Ujhhgtgfeyxiexzf m3156feyxiexzfUjhhgtg(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf, boolean z) {
        C2538feyxiexzfUjhhgtg c2538feyxiexzfUjhhgtg = (C2538feyxiexzfUjhhgtg) c2657Ujhhgtgfeyxiexzf.m3983Ujhhgtgfeyxiexzf("InnerClasses");
        if (c2538feyxiexzfUjhhgtg != null) {
            C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf2 = c2538feyxiexzfUjhhgtg.f8262Ujhhgtgfeyxiexzf;
            int length = c2657Ujhhgtgfeyxiexzf2.f10801Ujhhgtgfeyxiexzf.length;
            ArrayList arrayList = new ArrayList();
            C0658Ujhhgtgfeyxiexzf c0658Ujhhgtgfeyxiexzf = null;
            for (int i = 0; i < length; i++) {
                C0658Ujhhgtgfeyxiexzf c0658Ujhhgtgfeyxiexzf2 = (C0658Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf2.m4969Ujhhgtgfeyxiexzf(i);
                C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf2 = c0658Ujhhgtgfeyxiexzf2.f2768Ujhhgtgfeyxiexzf;
                if (c3057Ujhhgtgfeyxiexzf2.equals(c3057Ujhhgtgfeyxiexzf)) {
                    c0658Ujhhgtgfeyxiexzf = c0658Ujhhgtgfeyxiexzf2;
                } else if (c3057Ujhhgtgfeyxiexzf.equals(c0658Ujhhgtgfeyxiexzf2.f2769Ujhhgtgfeyxiexzf)) {
                    arrayList.add(c3057Ujhhgtgfeyxiexzf2.f9473Ujhhgtgfeyxiexzf);
                }
            }
            int size = arrayList.size();
            if (c0658Ujhhgtgfeyxiexzf != null || size != 0) {
                C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf = new C2425Ujhhgtgfeyxiexzf();
                if (c0658Ujhhgtgfeyxiexzf != null) {
                    AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c0658Ujhhgtgfeyxiexzf.f2770Ujhhgtgfeyxiexzf;
                    int i2 = c0658Ujhhgtgfeyxiexzf.f2771Ujhhgtgfeyxiexzf;
                    C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf = new C2413Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7845Ujhhgtgfeyxiexzf, 3);
                    if (abstractC3638Ujhhgtgfeyxiexzf == null) {
                        abstractC3638Ujhhgtgfeyxiexzf = C3147Ujhhgtgfeyxiexzf.f9755Ujhhgtgfeyxiexzf;
                    }
                    c2413Ujhhgtgfeyxiexzf.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7851Ujhhgtgfeyxiexzf, abstractC3638Ujhhgtgfeyxiexzf));
                    c2413Ujhhgtgfeyxiexzf.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7850Ujhhgtgfeyxiexzf, C3144Ujhhgtgfeyxiexzf.m4660Ujhhgtgfeyxiexzf(i2)));
                    c2413Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
                    c2425Ujhhgtgfeyxiexzf.m3673Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf);
                    if (z) {
                        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf3 = c0658Ujhhgtgfeyxiexzf.f2769Ujhhgtgfeyxiexzf;
                        if (c3057Ujhhgtgfeyxiexzf3 == null) {
                            throw new C2216Ujhhgtgfeyxiexzf("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c3057Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf2 = new C2413Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7843Ujhhgtgfeyxiexzf, 3);
                        c2413Ujhhgtgfeyxiexzf2.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7852Ujhhgtgfeyxiexzf, c3057Ujhhgtgfeyxiexzf3));
                        c2413Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
                        c2425Ujhhgtgfeyxiexzf.m3673Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf2);
                    }
                }
                if (size != 0) {
                    C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = new C1163feyxiexzfUjhhgtg(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        c1163feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i3, (C1784feyxiexzfUjhhgtg) arrayList.get(i3));
                    }
                    c1163feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
                    C3755Ujhhgtgfeyxiexzf c3755UjhhgtgfeyxiexzfM3671Ujhhgtgfeyxiexzf = AbstractC2424Ujhhgtgfeyxiexzf.m3671Ujhhgtgfeyxiexzf(c1163feyxiexzfUjhhgtg);
                    C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf3 = new C2413Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7846Ujhhgtgfeyxiexzf, 3);
                    c2413Ujhhgtgfeyxiexzf3.m3667Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf(AbstractC2424Ujhhgtgfeyxiexzf.f7852Ujhhgtgfeyxiexzf, c3755UjhhgtgfeyxiexzfM3671Ujhhgtgfeyxiexzf));
                    c2413Ujhhgtgfeyxiexzf3.f2247Ujhhgtgfeyxiexzf = false;
                    c2425Ujhhgtgfeyxiexzf.m3673Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf3);
                }
                c2425Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
                return c2425Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m3157feyxiexzfUjhhgtg(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static boolean m3158feyxiexzfUjhhgtg(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static boolean m3159feyxiexzfUjhhgtg(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean mo3160Ujhhgtgfeyxiexzf(C1966Ujhhgtgfeyxiexzf c1966Ujhhgtgfeyxiexzf) {
        return this instanceof C3527Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void m3161Ujhhgtgfeyxiexzf(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0892feyxiexzfUjhhgtg(i, 0, this));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public abstract int mo3162Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public BitSet mo3163Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public abstract String mo3164Ujhhgtgfeyxiexzf(AbstractC3473Ujhhgtgfeyxiexzf abstractC3473Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public abstract String mo3165Ujhhgtgfeyxiexzf(AbstractC3473Ujhhgtgfeyxiexzf abstractC3473Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public abstract boolean mo3166Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public abstract void mo3167feyxiexzfUjhhgtg(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public abstract void mo3168feyxiexzfUjhhgtg(Typeface typeface);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public abstract void mo3169feyxiexzfUjhhgtg(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, AbstractC3473Ujhhgtgfeyxiexzf abstractC3473Ujhhgtgfeyxiexzf);
}
