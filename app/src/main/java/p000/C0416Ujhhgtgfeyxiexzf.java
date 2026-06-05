package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能ᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0416Ujhhgtgfeyxiexzf implements InterfaceC1176feyxiexzfUjhhgtg, InterfaceC0690Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0420Ujhhgtgfeyxiexzf f2241Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C1939Ujhhgtgfeyxiexzf f2242Ujhhgtgfeyxiexzf = new C1939Ujhhgtgfeyxiexzf(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object f2243Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Object f2244Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object f2245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f2246Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0416Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2244Ujhhgtgfeyxiexzf = obj2;
        this.f2245Ujhhgtgfeyxiexzf = obj3;
        this.f2246Ujhhgtgfeyxiexzf = obj4;
        this.f2243Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static int m1698Ujhhgtgfeyxiexzf(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        boolean z = obj instanceof C2680Ujhhgtgfeyxiexzf;
        String str = z ? ((C2680Ujhhgtgfeyxiexzf) obj).f8567Ujhhgtgfeyxiexzf : "placeholder";
        if (z) {
            obj = ((C2680Ujhhgtgfeyxiexzf) obj).f8568Ujhhgtgfeyxiexzf;
        }
        Bundle bundle = new Bundle();
        if (obj != null) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Object[]) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else {
                if (!(obj instanceof Serializable)) {
                    throw new IllegalStateException(("Key-Value type " + obj.getClass().getName() + " is not allowed").toString());
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            c0919feyxiexzfUjhhgtg = Integer.valueOf(iDataSize);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = null;
        }
        Integer num = (Integer) c0919feyxiexzfUjhhgtg;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m1699Ujhhgtgfeyxiexzf(C2679Ujhhgtgfeyxiexzf c2679Ujhhgtgfeyxiexzf, int i, String str) {
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf = c2679Ujhhgtgfeyxiexzf.f8566Ujhhgtgfeyxiexzf;
        String str2 = c2680Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf;
        Object obj = c2680Ujhhgtgfeyxiexzf.f8568Ujhhgtgfeyxiexzf;
        C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(6, "YukiHookDataChannel cannot send this data key of \"" + str2 + "\" type " + (obj != null ? obj.getClass() : null) + ", because it is too large (total " + (i / 1024.0f) + " KB, limit " + (C2277Ujhhgtgfeyxiexzf.f7463Ujhhgtgfeyxiexzf / 1024.0f) + " KB) and cannot be segmented\n" + (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str) ? str.concat("\n") : "") + "If you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final void m1700Ujhhgtgfeyxiexzf(C2679Ujhhgtgfeyxiexzf c2679Ujhhgtgfeyxiexzf, int i, String str) {
        m1699Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, i, "Failed to segment " + str + " type because the size of its first element has exceeded the maximum limit");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C2679Ujhhgtgfeyxiexzf m1701feyxiexzfUjhhgtg(C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf, String str, int i, int i2) {
        return new C2679Ujhhgtgfeyxiexzf(str, i > 0, i, i2, c2680Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m1703feyxiexzfUjhhgtg(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf, String str, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        String name;
        Context context = (Context) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf;
        C2277Ujhhgtgfeyxiexzf c2277Ujhhgtgfeyxiexzf = (C2277Ujhhgtgfeyxiexzf) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
        ConcurrentHashMap concurrentHashMap = c2277Ujhhgtgfeyxiexzf.f7466Ujhhgtgfeyxiexzf;
        String strM1720Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf.m1720Ujhhgtgfeyxiexzf();
        if (C2277Ujhhgtgfeyxiexzf.f7460Ujhhgtgfeyxiexzf) {
            name = "X";
        } else {
            name = context != null ? context.getClass().getName() : "M";
        }
        concurrentHashMap.put(AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(str, strM1720Ujhhgtgfeyxiexzf + "_" + name + "_0"), new C1381feyxiexzfUjhhgtg(context, new C0542Ujhhgtgfeyxiexzf(c2277Ujhhgtgfeyxiexzf, c0416Ujhhgtgfeyxiexzf, str, interfaceC3549feyxiexzfUjhhgtg)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m1704Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf) {
        ((C1476feyxiexzfUjhhgtg) ((C2629Ujhhgtgfeyxiexzf) this.f2243Ujhhgtgfeyxiexzf).f8461Ujhhgtgfeyxiexzf).m2988Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m1705Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf) {
        ((ArrayList) ((C2629Ujhhgtgfeyxiexzf) this.f2243Ujhhgtgfeyxiexzf).f8462Ujhhgtgfeyxiexzf).add(abstractC3068Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo1706Ujhhgtgfeyxiexzf(C1986feyxiexzfUjhhgtg c1986feyxiexzfUjhhgtg) {
        AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf;
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c1986feyxiexzfUjhhgtg.f2787Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf = AbstractC0926feyxiexzfUjhhgtg.m2427Ujhhgtgfeyxiexzf(c1986feyxiexzfUjhhgtg);
        C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg = c1986feyxiexzfUjhhgtg.f2786Ujhhgtgfeyxiexzf;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c1986feyxiexzfUjhhgtg.f9736Ujhhgtgfeyxiexzf;
        int i = c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf;
        int i2 = c0927feyxiexzfUjhhgtg.f3750Ujhhgtgfeyxiexzf;
        if (i != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf);
        }
        m1704Ujhhgtgfeyxiexzf((C2866feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf);
        if (c0927feyxiexzfUjhhgtg.f3755Ujhhgtgfeyxiexzf) {
            m1704Ujhhgtgfeyxiexzf(new C3143Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, c1986feyxiexzfUjhhgtg.f2789Ujhhgtgfeyxiexzf, abstractC3638Ujhhgtgfeyxiexzf));
            return;
        }
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM1721Ujhhgtgfeyxiexzf = m1721Ujhhgtgfeyxiexzf();
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtgM2396Ujhhgtgfeyxiexzf = C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c1986feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtgM1721Ujhhgtgfeyxiexzf);
        boolean z = c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf.f10103Ujhhgtgfeyxiexzf;
        int i3 = c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf.f10099Ujhhgtgfeyxiexzf;
        if ((z || i2 == 43) != (c0961feyxiexzfUjhhgtgM1721Ujhhgtgfeyxiexzf != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c1986feyxiexzfUjhhgtg);
        }
        AbstractC3068Ujhhgtgfeyxiexzf c3143Ujhhgtgfeyxiexzf = (i2 != 41 || i3 == 35) ? new C3143Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtgM2396Ujhhgtgfeyxiexzf, abstractC3638Ujhhgtgfeyxiexzf) : new C1047feyxiexzfUjhhgtg(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtgM2396Ujhhgtgfeyxiexzf);
        C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg = (C1476feyxiexzfUjhhgtg) ((C2629Ujhhgtgfeyxiexzf) this.f2243Ujhhgtgfeyxiexzf).f8461Ujhhgtgfeyxiexzf;
        int size = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size() - 1;
        while (true) {
            abstractC3068Ujhhgtgfeyxiexzf = null;
            if (size < 0) {
                break;
            }
            if (size < c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size() && size >= 0) {
                abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(size);
            }
            if (abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf.f10099Ujhhgtgfeyxiexzf != -1) {
                break;
            } else {
                size--;
            }
        }
        if (i3 == 32 && abstractC3068Ujhhgtgfeyxiexzf != null) {
            C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = abstractC3068Ujhhgtgfeyxiexzf.f9500Ujhhgtgfeyxiexzf;
            int i4 = abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf.f10099Ujhhgtgfeyxiexzf;
            if (i4 == 7 || i4 == 8 || i4 == 9) {
                C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg2 = c3143Ujhhgtgfeyxiexzf.f9500Ujhhgtgfeyxiexzf;
                if (c0960feyxiexzfUjhhgtg2.f10801Ujhhgtgfeyxiexzf.length > 0 && c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length > 1 && ((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg2.m4969Ujhhgtgfeyxiexzf(0)).f3830Ujhhgtgfeyxiexzf == ((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(1)).f3830Ujhhgtgfeyxiexzf) {
                    m1704Ujhhgtgfeyxiexzf(new C1047feyxiexzfUjhhgtg(AbstractC3212feyxiexzfUjhhgtg.f9961Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg.f3827Ujhhgtgfeyxiexzf));
                }
            }
        }
        m1704Ujhhgtgfeyxiexzf(c3143Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m1707Ujhhgtgfeyxiexzf(AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg) {
        if (abstractC1286feyxiexzfUjhhgtg.f4689Ujhhgtgfeyxiexzf != null) {
            m1718Ujhhgtgfeyxiexzf();
            ((C1233feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf).m2725Ujhhgtgfeyxiexzf('\n');
        }
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public void mo1708Ujhhgtgfeyxiexzf(C1430feyxiexzfUjhhgtg c1430feyxiexzfUjhhgtg) {
        AbstractC3068Ujhhgtgfeyxiexzf c1047feyxiexzfUjhhgtg;
        C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg = c1430feyxiexzfUjhhgtg.f2786Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = c1430feyxiexzfUjhhgtg.f2788Ujhhgtgfeyxiexzf;
        int i = c0927feyxiexzfUjhhgtg.f3750Ujhhgtgfeyxiexzf;
        if (i == 54 || i == 56) {
            return;
        }
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c1430feyxiexzfUjhhgtg.f2787Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf = AbstractC0926feyxiexzfUjhhgtg.m2427Ujhhgtgfeyxiexzf(c1430feyxiexzfUjhhgtg);
        int i2 = c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf;
        if (i2 == 1 || i2 == 2) {
            c1047feyxiexzfUjhhgtg = new C1047feyxiexzfUjhhgtg(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c1430feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg));
        } else {
            if (i2 == 3) {
                return;
            }
            if (i2 != 4) {
                if (i2 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c1047feyxiexzfUjhhgtg = new C1047feyxiexzfUjhhgtg(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c1430feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg));
            } else {
                c1047feyxiexzfUjhhgtg = new C1966Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c1430feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg), ((C2866feyxiexzfUjhhgtg[]) ((C0909feyxiexzfUjhhgtg) this.f2246Ujhhgtgfeyxiexzf).f3513Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf)[((C2495feyxiexzfUjhhgtg) this.f2244Ujhhgtgfeyxiexzf).f8154Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(1)]);
            }
        }
        m1704Ujhhgtgfeyxiexzf(c1047feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void mo1709Ujhhgtgfeyxiexzf(C3448Ujhhgtgfeyxiexzf c3448Ujhhgtgfeyxiexzf) {
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c3448Ujhhgtgfeyxiexzf.f2787Ujhhgtgfeyxiexzf;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c3448Ujhhgtgfeyxiexzf.f10732Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c3448Ujhhgtgfeyxiexzf.f10731Ujhhgtgfeyxiexzf;
        if (c3448Ujhhgtgfeyxiexzf.f2786Ujhhgtgfeyxiexzf.f3754Ujhhgtgfeyxiexzf != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg = new C2866feyxiexzfUjhhgtg(c1234feyxiexzfUjhhgtg, false);
        AbstractC3068Ujhhgtgfeyxiexzf c2378Ujhhgtgfeyxiexzf = new C2378Ujhhgtgfeyxiexzf(c1234feyxiexzfUjhhgtg, (C2866feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf, arrayList, abstractC3638Ujhhgtgfeyxiexzf);
        AbstractC3068Ujhhgtgfeyxiexzf c1966Ujhhgtgfeyxiexzf = new C1966Ujhhgtgfeyxiexzf(AbstractC3212feyxiexzfUjhhgtg.f9991feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c3448Ujhhgtgfeyxiexzf, c3448Ujhhgtgfeyxiexzf.f2788Ujhhgtgfeyxiexzf), c2866feyxiexzfUjhhgtg);
        m1704Ujhhgtgfeyxiexzf((C2866feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf);
        m1704Ujhhgtgfeyxiexzf(c1966Ujhhgtgfeyxiexzf);
        m1705Ujhhgtgfeyxiexzf(new C1333feyxiexzfUjhhgtg(c1234feyxiexzfUjhhgtg));
        m1705Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtg);
        m1705Ujhhgtgfeyxiexzf(c2378Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo1710Ujhhgtgfeyxiexzf(C1429feyxiexzfUjhhgtg c1429feyxiexzfUjhhgtg) {
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c1429feyxiexzfUjhhgtg.f2787Ujhhgtgfeyxiexzf;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c1429feyxiexzfUjhhgtg.f9736Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = c1429feyxiexzfUjhhgtg.f2788Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf = AbstractC0926feyxiexzfUjhhgtg.m2427Ujhhgtgfeyxiexzf(c1429feyxiexzfUjhhgtg);
        C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg = c1429feyxiexzfUjhhgtg.f2786Ujhhgtgfeyxiexzf;
        int i = c0927feyxiexzfUjhhgtg.f3750Ujhhgtgfeyxiexzf;
        if (c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (i != 3) {
            m1704Ujhhgtgfeyxiexzf(new C3143Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c1429feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg), abstractC3638Ujhhgtgfeyxiexzf));
            return;
        }
        C0909feyxiexzfUjhhgtg c0909feyxiexzfUjhhgtg = (C0909feyxiexzfUjhhgtg) this.f2246Ujhhgtgfeyxiexzf;
        if (c0909feyxiexzfUjhhgtg.f3519Ujhhgtgfeyxiexzf) {
            return;
        }
        m1704Ujhhgtgfeyxiexzf(new C1047feyxiexzfUjhhgtg(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg.m2446Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg, C0961feyxiexzfUjhhgtg.m2451Ujhhgtgfeyxiexzf((c0909feyxiexzfUjhhgtg.f3516Ujhhgtgfeyxiexzf - c0909feyxiexzfUjhhgtg.f3518Ujhhgtgfeyxiexzf) + ((C3144Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9756Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType(), null))));
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void mo1711Ujhhgtgfeyxiexzf(C0692Ujhhgtgfeyxiexzf c0692Ujhhgtgfeyxiexzf) {
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c0692Ujhhgtgfeyxiexzf.f2787Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf = AbstractC0926feyxiexzfUjhhgtg.m2427Ujhhgtgfeyxiexzf(c0692Ujhhgtgfeyxiexzf);
        C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg = c0692Ujhhgtgfeyxiexzf.f2786Ujhhgtgfeyxiexzf;
        if (c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf);
        }
        if (!c0927feyxiexzfUjhhgtg.f3755Ujhhgtgfeyxiexzf) {
            throw new RuntimeException("Expected call-like operation");
        }
        m1704Ujhhgtgfeyxiexzf((C2866feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf);
        m1704Ujhhgtgfeyxiexzf(new C0514Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, c0692Ujhhgtgfeyxiexzf.f2789Ujhhgtgfeyxiexzf, new AbstractC3638Ujhhgtgfeyxiexzf[]{c0692Ujhhgtgfeyxiexzf.f2831Ujhhgtgfeyxiexzf, c0692Ujhhgtgfeyxiexzf.f2832Ujhhgtgfeyxiexzf}));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C3082Ujhhgtgfeyxiexzf m1712Ujhhgtgfeyxiexzf() {
        CharSequence charSequence = (CharSequence) this.f2245Ujhhgtgfeyxiexzf;
        C3082Ujhhgtgfeyxiexzf c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg = C3082Ujhhgtgfeyxiexzf.m4549feyxiexzfUjhhgtg();
        Context context = (Context) this.f2243Ujhhgtgfeyxiexzf;
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f1001Ujhhgtgfeyxiexzf = (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.96d);
        if (c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9527feyxiexzfUjhhgtg != null) {
            Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg, 0));
        }
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9531feyxiexzfUjhhgtg = AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(context.getColor(R.color.md_theme_surface), 240);
        if (c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9527feyxiexzfUjhhgtg != null) {
            Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg, 0));
        }
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9525feyxiexzfUjhhgtg = new C0308Ujhhgtgfeyxiexzf(charSequence, this);
        if (c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9527feyxiexzfUjhhgtg == null) {
            return c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg;
        }
        Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg, 0));
        return c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public synchronized InterfaceC0285Ujhhgtgfeyxiexzf m1713Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C0419Ujhhgtgfeyxiexzf c0419Ujhhgtgfeyxiexzf : (ArrayList) this.f2243Ujhhgtgfeyxiexzf) {
                if (((HashSet) this.f2245Ujhhgtgfeyxiexzf).contains(c0419Ujhhgtgfeyxiexzf)) {
                    z = true;
                } else if (c0419Ujhhgtgfeyxiexzf.f2252Ujhhgtgfeyxiexzf.isAssignableFrom(cls) && c0419Ujhhgtgfeyxiexzf.f2253Ujhhgtgfeyxiexzf.isAssignableFrom(cls2)) {
                    ((HashSet) this.f2245Ujhhgtgfeyxiexzf).add(c0419Ujhhgtgfeyxiexzf);
                    arrayList.add(c0419Ujhhgtgfeyxiexzf.f2254Ujhhgtgfeyxiexzf.mo1497Ujhhgtgfeyxiexzf(this));
                    ((HashSet) this.f2245Ujhhgtgfeyxiexzf).remove(c0419Ujhhgtgfeyxiexzf);
                }
            }
            if (arrayList.size() > 1) {
                C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = (C0420Ujhhgtgfeyxiexzf) this.f2244Ujhhgtgfeyxiexzf;
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) this.f2246Ujhhgtgfeyxiexzf;
                c0420Ujhhgtgfeyxiexzf.getClass();
                return new C2395Ujhhgtgfeyxiexzf(arrayList, 2, c2366Ujhhgtgfeyxiexzf);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC0285Ujhhgtgfeyxiexzf) arrayList.get(0);
            }
            if (z) {
                return f2242Ujhhgtgfeyxiexzf;
            }
            throw new C0962feyxiexzfUjhhgtg("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f2245Ujhhgtgfeyxiexzf).clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public synchronized ArrayList m1714Ujhhgtgfeyxiexzf(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C0419Ujhhgtgfeyxiexzf c0419Ujhhgtgfeyxiexzf : (ArrayList) this.f2243Ujhhgtgfeyxiexzf) {
                if (!((HashSet) this.f2245Ujhhgtgfeyxiexzf).contains(c0419Ujhhgtgfeyxiexzf) && c0419Ujhhgtgfeyxiexzf.f2252Ujhhgtgfeyxiexzf.isAssignableFrom(cls)) {
                    ((HashSet) this.f2245Ujhhgtgfeyxiexzf).add(c0419Ujhhgtgfeyxiexzf);
                    arrayList.add(c0419Ujhhgtgfeyxiexzf.f2254Ujhhgtgfeyxiexzf.mo1497Ujhhgtgfeyxiexzf(this));
                    ((HashSet) this.f2245Ujhhgtgfeyxiexzf).remove(c0419Ujhhgtgfeyxiexzf);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.f2245Ujhhgtgfeyxiexzf).clear();
            throw th;
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo1715Ujhhgtgfeyxiexzf(C2060Ujhhgtgfeyxiexzf c2060Ujhhgtgfeyxiexzf) {
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c2060Ujhhgtgfeyxiexzf.f2787Ujhhgtgfeyxiexzf;
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = (C0684Ujhhgtgfeyxiexzf) c2060Ujhhgtgfeyxiexzf.f6772Ujhhgtgfeyxiexzf;
        C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg = (C2495feyxiexzfUjhhgtg) this.f2244Ujhhgtgfeyxiexzf;
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf2 = c2495feyxiexzfUjhhgtg.f8154Ujhhgtgfeyxiexzf;
        int i = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
        int i2 = c0684Ujhhgtgfeyxiexzf2.f2814Ujhhgtgfeyxiexzf;
        int i3 = c2495feyxiexzfUjhhgtg.f8155Ujhhgtgfeyxiexzf;
        if (i != i2 - 1 || i3 != c0684Ujhhgtgfeyxiexzf2.m1944Ujhhgtgfeyxiexzf(i)) {
            throw new RuntimeException("shouldn't happen");
        }
        C2866feyxiexzfUjhhgtg[] c2866feyxiexzfUjhhgtgArr = new C2866feyxiexzfUjhhgtg[i];
        for (int i4 = 0; i4 < i; i4++) {
            c2866feyxiexzfUjhhgtgArr[i4] = ((C2866feyxiexzfUjhhgtg[]) ((C0909feyxiexzfUjhhgtg) this.f2246Ujhhgtgfeyxiexzf).f3513Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf)[c0684Ujhhgtgfeyxiexzf2.m1944Ujhhgtgfeyxiexzf(i4)];
        }
        C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg = new C2866feyxiexzfUjhhgtg(c1234feyxiexzfUjhhgtg, false);
        C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg2 = new C2866feyxiexzfUjhhgtg(((C2866feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf).f9499Ujhhgtgfeyxiexzf, true);
        C2058Ujhhgtgfeyxiexzf c2058Ujhhgtgfeyxiexzf = new C2058Ujhhgtgfeyxiexzf(c1234feyxiexzfUjhhgtg, c2866feyxiexzfUjhhgtg2, c0684Ujhhgtgfeyxiexzf, c2866feyxiexzfUjhhgtgArr);
        AbstractC3068Ujhhgtgfeyxiexzf c1966Ujhhgtgfeyxiexzf = new C1966Ujhhgtgfeyxiexzf(c2058Ujhhgtgfeyxiexzf.f6766Ujhhgtgfeyxiexzf ? AbstractC3212feyxiexzfUjhhgtg.f9994feyxiexzfUjhhgtg : AbstractC3212feyxiexzfUjhhgtg.f9995feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c2060Ujhhgtgfeyxiexzf, c2060Ujhhgtgfeyxiexzf.f2788Ujhhgtgfeyxiexzf), c2866feyxiexzfUjhhgtg);
        m1704Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtg2);
        m1704Ujhhgtgfeyxiexzf(c1966Ujhhgtgfeyxiexzf);
        m1705Ujhhgtgfeyxiexzf(new C1333feyxiexzfUjhhgtg(c1234feyxiexzfUjhhgtg));
        m1705Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtg);
        m1705Ujhhgtgfeyxiexzf(c2058Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0690Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void mo1716Ujhhgtgfeyxiexzf(C2060Ujhhgtgfeyxiexzf c2060Ujhhgtgfeyxiexzf) {
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c2060Ujhhgtgfeyxiexzf.f2787Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf = AbstractC0926feyxiexzfUjhhgtg.m2427Ujhhgtgfeyxiexzf(c2060Ujhhgtgfeyxiexzf);
        if (c2060Ujhhgtgfeyxiexzf.f2786Ujhhgtgfeyxiexzf.f3754Ujhhgtgfeyxiexzf != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM1721Ujhhgtgfeyxiexzf = m1721Ujhhgtgfeyxiexzf();
        if (c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf.f10103Ujhhgtgfeyxiexzf == (c0961feyxiexzfUjhhgtgM1721Ujhhgtgfeyxiexzf != null)) {
            m1704Ujhhgtgfeyxiexzf((C2866feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf);
            m1704Ujhhgtgfeyxiexzf(new C1047feyxiexzfUjhhgtg(c3216feyxiexzfUjhhgtgM2427Ujhhgtgfeyxiexzf, c1234feyxiexzfUjhhgtg, C0909feyxiexzfUjhhgtg.m2396Ujhhgtgfeyxiexzf(c2060Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtgM1721Ujhhgtgfeyxiexzf)));
        } else {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c2060Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m1717Ujhhgtgfeyxiexzf(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1044feyxiexzfUjhhgtg) this.f2246Ujhhgtgfeyxiexzf).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m1717Ujhhgtgfeyxiexzf(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m1718Ujhhgtgfeyxiexzf() {
        C1233feyxiexzfUjhhgtg c1233feyxiexzfUjhhgtg = (C1233feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf;
        StringBuilder sb = c1233feyxiexzfUjhhgtg.f4559Ujhhgtgfeyxiexzf;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        c1233feyxiexzfUjhhgtg.m2725Ujhhgtgfeyxiexzf('\n');
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public synchronized ArrayList m1719Ujhhgtgfeyxiexzf(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C0419Ujhhgtgfeyxiexzf c0419Ujhhgtgfeyxiexzf : (ArrayList) this.f2243Ujhhgtgfeyxiexzf) {
            if (!arrayList.contains(c0419Ujhhgtgfeyxiexzf.f2253Ujhhgtgfeyxiexzf) && c0419Ujhhgtgfeyxiexzf.f2252Ujhhgtgfeyxiexzf.isAssignableFrom(cls)) {
                arrayList.add(c0419Ujhhgtgfeyxiexzf.f2253Ujhhgtgfeyxiexzf);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public String m1720Ujhhgtgfeyxiexzf() {
        return AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(((String) this.f2244Ujhhgtgfeyxiexzf).hashCode(), "_");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public C0961feyxiexzfUjhhgtg m1721Ujhhgtgfeyxiexzf() {
        int i = ((C2495feyxiexzfUjhhgtg) this.f2244Ujhhgtgfeyxiexzf).f8155Ujhhgtgfeyxiexzf;
        if (i < 0) {
            return null;
        }
        AbstractC0671Ujhhgtgfeyxiexzf abstractC0671Ujhhgtgfeyxiexzf = (AbstractC0671Ujhhgtgfeyxiexzf) ((C2492feyxiexzfUjhhgtg) ((C0909feyxiexzfUjhhgtg) this.f2246Ujhhgtgfeyxiexzf).f3512Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf).m3775Ujhhgtgfeyxiexzf(i).f8153Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(0);
        if (abstractC0671Ujhhgtgfeyxiexzf.f2786Ujhhgtgfeyxiexzf.f3750Ujhhgtgfeyxiexzf != 56) {
            return null;
        }
        return abstractC0671Ujhhgtgfeyxiexzf.f2788Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int m1722Ujhhgtgfeyxiexzf() {
        return ((C1233feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf).f4559Ujhhgtgfeyxiexzf.length();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m1723Ujhhgtgfeyxiexzf(C2679Ujhhgtgfeyxiexzf c2679Ujhhgtgfeyxiexzf) {
        if (AbstractC3594Ujhhgtgfeyxiexzf.f11192Ujhhgtgfeyxiexzf) {
            String strM4886Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf();
            C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf = c2679Ujhhgtgfeyxiexzf.f8566Ujhhgtgfeyxiexzf;
            String str = c2680Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf;
            int iM1698Ujhhgtgfeyxiexzf = m1698Ujhhgtgfeyxiexzf(c2680Ujhhgtgfeyxiexzf);
            if (iM1698Ujhhgtgfeyxiexzf < 0) {
                ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(6, "YukiHookDataChannel cannot calculate the byte size of the data key of \"" + str + "\" to be sent, so this data cannot be sent\nIf you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
                return;
            }
            if (c2679Ujhhgtgfeyxiexzf.f8563Ujhhgtgfeyxiexzf) {
                m1724Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf);
                return;
            }
            int i = C2277Ujhhgtgfeyxiexzf.f7463Ujhhgtgfeyxiexzf;
            if (iM1698Ujhhgtgfeyxiexzf < i) {
                m1724Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf);
                return;
            }
            Object obj = c2680Ujhhgtgfeyxiexzf.f8568Ujhhgtgfeyxiexzf;
            int i2 = 0;
            if (obj instanceof List) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                    if (m1698Ujhhgtgfeyxiexzf(arrayList3) >= C2277Ujhhgtgfeyxiexzf.f7463Ujhhgtgfeyxiexzf / C2277Ujhhgtgfeyxiexzf.f7464Ujhhgtgfeyxiexzf) {
                        arrayList2.add(arrayList3);
                        arrayList3 = new ArrayList();
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(arrayList3);
                }
                arrayList2.size();
                ArrayList arrayList4 = !arrayList2.isEmpty() ? arrayList2 : null;
                if (arrayList4 == null) {
                    m1700Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, iM1698Ujhhgtgfeyxiexzf, "List");
                    return;
                }
                for (Object obj2 : arrayList4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    m1724Ujhhgtgfeyxiexzf(m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf((List) obj2, str), strM4886Ujhhgtgfeyxiexzf, arrayList2.size(), i2));
                    i2 = i3;
                }
                return;
            }
            if (obj instanceof Map) {
                ArrayList arrayList5 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    if (m1698Ujhhgtgfeyxiexzf(linkedHashMap) >= C2277Ujhhgtgfeyxiexzf.f7463Ujhhgtgfeyxiexzf / C2277Ujhhgtgfeyxiexzf.f7464Ujhhgtgfeyxiexzf) {
                        arrayList5.add(linkedHashMap);
                        linkedHashMap = new LinkedHashMap();
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    arrayList5.add(linkedHashMap);
                }
                arrayList5.size();
                ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : null;
                if (arrayList6 == null) {
                    m1700Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, iM1698Ujhhgtgfeyxiexzf, "Map");
                    return;
                }
                for (Object obj3 : arrayList6) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    m1724Ujhhgtgfeyxiexzf(m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf((Map) obj3, str), strM4886Ujhhgtgfeyxiexzf, arrayList5.size(), i2));
                    i2 = i4;
                }
                return;
            }
            if (obj instanceof Set) {
                ArrayList arrayList7 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = ((Set) obj).iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next());
                    if (m1698Ujhhgtgfeyxiexzf(linkedHashSet) >= C2277Ujhhgtgfeyxiexzf.f7463Ujhhgtgfeyxiexzf / C2277Ujhhgtgfeyxiexzf.f7464Ujhhgtgfeyxiexzf) {
                        arrayList7.add(linkedHashSet);
                        linkedHashSet = new LinkedHashSet();
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    arrayList7.add(linkedHashSet);
                }
                arrayList7.size();
                ArrayList arrayList8 = !arrayList7.isEmpty() ? arrayList7 : null;
                if (arrayList8 == null) {
                    m1700Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, iM1698Ujhhgtgfeyxiexzf, "Set");
                    return;
                }
                for (Object obj4 : arrayList8) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    m1724Ujhhgtgfeyxiexzf(m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf((Set) obj4, str), strM4886Ujhhgtgfeyxiexzf, arrayList7.size(), i2));
                    i2 = i5;
                }
                return;
            }
            if (!(obj instanceof String)) {
                if ((obj instanceof byte[]) || (obj instanceof char[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof Object[])) {
                    m1699Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, iM1698Ujhhgtgfeyxiexzf, "Primitive Array type like String[], int[] ... cannot be segmented, the suggestion is send those data using List type");
                    return;
                } else {
                    m1699Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, iM1698Ujhhgtgfeyxiexzf, "");
                    return;
                }
            }
            String str2 = (String) obj;
            int i6 = i / 2;
            ArrayList arrayList9 = new ArrayList();
            int length = str2.length();
            if (i6 <= 0) {
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i6, "Step must be positive, was: ", "."));
            }
            int iM1882Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1882Ujhhgtgfeyxiexzf(0, length, i6);
            if (iM1882Ujhhgtgfeyxiexzf >= 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + i6;
                    if (i8 <= str2.length()) {
                        arrayList9.add(str2.substring(i7, i8));
                    } else {
                        arrayList9.add(str2.substring(i7, str2.length()));
                    }
                    if (i7 == iM1882Ujhhgtgfeyxiexzf) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            if (arrayList9.size() == 1) {
                m1724Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf);
                return;
            }
            arrayList9.size();
            ArrayList arrayList10 = !arrayList9.isEmpty() ? arrayList9 : null;
            if (arrayList10 == null) {
                m1700Ujhhgtgfeyxiexzf(c2679Ujhhgtgfeyxiexzf, iM1698Ujhhgtgfeyxiexzf, "String");
                return;
            }
            for (Object obj5 : arrayList10) {
                int i9 = i2 + 1;
                if (i2 < 0) {
                    AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                    throw null;
                }
                m1724Ujhhgtgfeyxiexzf(m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf((String) obj5, str), strM4886Ujhhgtgfeyxiexzf, arrayList9.size(), i2));
                i2 = i9;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m1724Ujhhgtgfeyxiexzf(C2679Ujhhgtgfeyxiexzf c2679Ujhhgtgfeyxiexzf) {
        String str = (String) this.f2244Ujhhgtgfeyxiexzf;
        C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf = c2679Ujhhgtgfeyxiexzf.f8566Ujhhgtgfeyxiexzf;
        Context contextM3616Ujhhgtgfeyxiexzf = (Context) this.f2243Ujhhgtgfeyxiexzf;
        if (contextM3616Ujhhgtgfeyxiexzf == null) {
            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
            contextM3616Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3616Ujhhgtgfeyxiexzf();
        }
        if (contextM3616Ujhhgtgfeyxiexzf == null) {
            ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
            C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(6, "Failed to sendBroadcast like \"" + c2680Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf + "\", because got null context in \"" + str + "\"", null);
            return;
        }
        Intent intent = new Intent();
        if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("")) {
            intent.setPackage("");
        }
        boolean z = C2277Ujhhgtgfeyxiexzf.f7460Ujhhgtgfeyxiexzf;
        intent.setAction(z ? C2277Ujhhgtgfeyxiexzf.m3473Ujhhgtgfeyxiexzf(null) : C2277Ujhhgtgfeyxiexzf.m3472Ujhhgtgfeyxiexzf(str));
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "android")) {
            if (z) {
                str = C2283feyxiexzfUjhhgtg.f7485Ujhhgtgfeyxiexzf;
            }
            intent.setPackage(str);
        }
        intent.putExtra(c2680Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf + m1720Ujhhgtgfeyxiexzf(), c2679Ujhhgtgfeyxiexzf);
        contextM3616Ujhhgtgfeyxiexzf.sendBroadcast(intent, null, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m1725feyxiexzfUjhhgtg(AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg, int i) {
        Class<?> cls = abstractC1286feyxiexzfUjhhgtg.getClass();
        C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf = (C0210Ujhhgtgfeyxiexzf) this.f2243Ujhhgtgfeyxiexzf;
        C2521feyxiexzfUjhhgtg c2521feyxiexzfUjhhgtg = (C2521feyxiexzfUjhhgtg) ((C3596feyxiexzfUjhhgtg) c0210Ujhhgtgfeyxiexzf.f1474Ujhhgtgfeyxiexzf).f11193Ujhhgtgfeyxiexzf.get(cls);
        if (c2521feyxiexzfUjhhgtg != null) {
            Object objM3792Ujhhgtgfeyxiexzf = c2521feyxiexzfUjhhgtg.m3792Ujhhgtgfeyxiexzf(c0210Ujhhgtgfeyxiexzf, (C3107Ujhhgtgfeyxiexzf) this.f2244Ujhhgtgfeyxiexzf);
            C1233feyxiexzfUjhhgtg c1233feyxiexzfUjhhgtg = (C1233feyxiexzfUjhhgtg) this.f2245Ujhhgtgfeyxiexzf;
            StringBuilder sb = c1233feyxiexzfUjhhgtg.f4559Ujhhgtgfeyxiexzf;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            C1233feyxiexzfUjhhgtg.m2724Ujhhgtgfeyxiexzf(c1233feyxiexzfUjhhgtg, objM3792Ujhhgtgfeyxiexzf, i, length);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m1726feyxiexzfUjhhgtg(AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg) {
        InterfaceC0205Ujhhgtgfeyxiexzf interfaceC0205Ujhhgtgfeyxiexzf = (InterfaceC0205Ujhhgtgfeyxiexzf) ((Map) this.f2246Ujhhgtgfeyxiexzf).get(abstractC1286feyxiexzfUjhhgtg.getClass());
        if (interfaceC0205Ujhhgtgfeyxiexzf != null) {
            interfaceC0205Ujhhgtgfeyxiexzf.mo1284Ujhhgtgfeyxiexzf(this, abstractC1286feyxiexzfUjhhgtg);
        } else {
            m1727feyxiexzfUjhhgtg(abstractC1286feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public void m1727feyxiexzfUjhhgtg(AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg) {
        AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg.f4686Ujhhgtgfeyxiexzf;
        while (abstractC1286feyxiexzfUjhhgtg2 != null) {
            AbstractC1286feyxiexzfUjhhgtg abstractC1286feyxiexzfUjhhgtg3 = abstractC1286feyxiexzfUjhhgtg2.f4689Ujhhgtgfeyxiexzf;
            abstractC1286feyxiexzfUjhhgtg2.mo1077Ujhhgtgfeyxiexzf(this);
            abstractC1286feyxiexzfUjhhgtg2 = abstractC1286feyxiexzfUjhhgtg3;
        }
    }

    public C0416Ujhhgtgfeyxiexzf(Context context, InterfaceC3556feyxiexzfUjhhgtg interfaceC3556feyxiexzfUjhhgtg) {
        this.f2243Ujhhgtgfeyxiexzf = context;
        this.f2244Ujhhgtgfeyxiexzf = interfaceC3556feyxiexzfUjhhgtg;
    }

    public C0416Ujhhgtgfeyxiexzf(int i) {
        switch (i) {
            case 3:
                this.f2244Ujhhgtgfeyxiexzf = new C1441feyxiexzfUjhhgtg(10);
                this.f2246Ujhhgtgfeyxiexzf = new C1044feyxiexzfUjhhgtg(0);
                this.f2243Ujhhgtgfeyxiexzf = new ArrayList();
                this.f2245Ujhhgtgfeyxiexzf = new HashSet();
                break;
            case 9:
                this.f2243Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
                this.f2244Ujhhgtgfeyxiexzf = new SparseArray();
                this.f2245Ujhhgtgfeyxiexzf = new C0267Ujhhgtgfeyxiexzf();
                this.f2246Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
                break;
            default:
                this.f2243Ujhhgtgfeyxiexzf = new ReentrantReadWriteLock();
                this.f2245Ujhhgtgfeyxiexzf = new HashMap();
                break;
        }
    }

    public C0416Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        this.f2243Ujhhgtgfeyxiexzf = new ArrayList();
        this.f2245Ujhhgtgfeyxiexzf = new HashSet();
        this.f2246Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf;
        this.f2244Ujhhgtgfeyxiexzf = f2241Ujhhgtgfeyxiexzf;
    }

    public C0416Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf, C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf, C1233feyxiexzfUjhhgtg c1233feyxiexzfUjhhgtg, Map map, C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg) {
        this.f2243Ujhhgtgfeyxiexzf = c0210Ujhhgtgfeyxiexzf;
        this.f2244Ujhhgtgfeyxiexzf = c3107Ujhhgtgfeyxiexzf;
        this.f2245Ujhhgtgfeyxiexzf = c1233feyxiexzfUjhhgtg;
        this.f2246Ujhhgtgfeyxiexzf = map;
    }

    public C0416Ujhhgtgfeyxiexzf(Typeface typeface, C0382Ujhhgtgfeyxiexzf c0382Ujhhgtgfeyxiexzf) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f2246Ujhhgtgfeyxiexzf = typeface;
        this.f2243Ujhhgtgfeyxiexzf = c0382Ujhhgtgfeyxiexzf;
        this.f2245Ujhhgtgfeyxiexzf = new C0381Ujhhgtgfeyxiexzf(1024);
        int iM1223Ujhhgtgfeyxiexzf = c0382Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(6);
        if (iM1223Ujhhgtgfeyxiexzf != 0) {
            int i5 = iM1223Ujhhgtgfeyxiexzf + c0382Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf;
            i = ((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f2244Ujhhgtgfeyxiexzf = new char[i * 2];
        int iM1223Ujhhgtgfeyxiexzf2 = c0382Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(6);
        if (iM1223Ujhhgtgfeyxiexzf2 != 0) {
            int i6 = iM1223Ujhhgtgfeyxiexzf2 + c0382Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf;
            i2 = ((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg = new C1776feyxiexzfUjhhgtg(this, i7);
            C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
            int iM1223Ujhhgtgfeyxiexzf3 = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(4);
            Character.toChars(iM1223Ujhhgtgfeyxiexzf3 != 0 ? ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(iM1223Ujhhgtgfeyxiexzf3 + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf) : 0, (char[]) this.f2244Ujhhgtgfeyxiexzf, i7 * 2);
            C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2 = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
            int iM1223Ujhhgtgfeyxiexzf4 = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.m1223Ujhhgtgfeyxiexzf(16);
            if (iM1223Ujhhgtgfeyxiexzf4 != 0) {
                int i8 = iM1223Ujhhgtgfeyxiexzf4 + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1355Ujhhgtgfeyxiexzf;
                i3 = ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1358Ujhhgtgfeyxiexzf).getInt(((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1358Ujhhgtgfeyxiexzf).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC3594Ujhhgtgfeyxiexzf.m5166Ujhhgtgfeyxiexzf("invalid metadata codepoint length", i3 > 0);
            C0381Ujhhgtgfeyxiexzf c0381Ujhhgtgfeyxiexzf = (C0381Ujhhgtgfeyxiexzf) this.f2245Ujhhgtgfeyxiexzf;
            C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3 = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
            int iM1223Ujhhgtgfeyxiexzf5 = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.m1223Ujhhgtgfeyxiexzf(16);
            if (iM1223Ujhhgtgfeyxiexzf5 != 0) {
                int i9 = iM1223Ujhhgtgfeyxiexzf5 + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.f1355Ujhhgtgfeyxiexzf;
                i4 = ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.f1358Ujhhgtgfeyxiexzf).getInt(((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.f1358Ujhhgtgfeyxiexzf).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c0381Ujhhgtgfeyxiexzf.m1625Ujhhgtgfeyxiexzf(c1776feyxiexzfUjhhgtg, 0, i4 - 1);
        }
    }

    public C0416Ujhhgtgfeyxiexzf(C2277Ujhhgtgfeyxiexzf c2277Ujhhgtgfeyxiexzf, Context context, String str) {
        this.f2246Ujhhgtgfeyxiexzf = c2277Ujhhgtgfeyxiexzf;
        this.f2243Ujhhgtgfeyxiexzf = context;
        this.f2244Ujhhgtgfeyxiexzf = str;
        this.f2245Ujhhgtgfeyxiexzf = new ConcurrentHashMap();
    }

    public C0416Ujhhgtgfeyxiexzf(C0909feyxiexzfUjhhgtg c0909feyxiexzfUjhhgtg, C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf) {
        this.f2246Ujhhgtgfeyxiexzf = c0909feyxiexzfUjhhgtg;
        this.f2243Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
    }
}
