package p000;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static String f6409Ujhhgtgfeyxiexzf = "YukiHookAPI";

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int[] f6408Ujhhgtgfeyxiexzf = {1};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Integer[] f6410Ujhhgtgfeyxiexzf = {1000, Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), 1002, 1003};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String m3271Ujhhgtgfeyxiexzf(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        C3254feyxiexzfUjhhgtg c3254feyxiexzfUjhhgtg = new C3254feyxiexzfUjhhgtg(new C2739feyxiexzfUjhhgtg(2, type), C1936Ujhhgtgfeyxiexzf.f6407Ujhhgtgfeyxiexzf);
        StringBuilder sb = new StringBuilder();
        C3576feyxiexzfUjhhgtg c3576feyxiexzfUjhhgtg = new C3576feyxiexzfUjhhgtg(c3254feyxiexzfUjhhgtg);
        if (!c3576feyxiexzfUjhhgtg.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = c3576feyxiexzfUjhhgtg.next();
        while (c3576feyxiexzfUjhhgtg.hasNext()) {
            next = c3576feyxiexzfUjhhgtg.next();
        }
        sb.append(((Class) next).getName());
        sb.append(AbstractC1192feyxiexzfUjhhgtg.m2680feyxiexzfUjhhgtg(AbstractC1119feyxiexzfUjhhgtg.m2589feyxiexzfUjhhgtg(c3254feyxiexzfUjhhgtg), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m3272Ujhhgtgfeyxiexzf(long j, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i8)).mo2578Ujhhgtgfeyxiexzf() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = (C2633Ujhhgtgfeyxiexzf) arrayList.get(i2);
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = (C2633Ujhhgtgfeyxiexzf) arrayList4.get(i3 - 1);
        if (i7 == c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf3 = (C2633Ujhhgtgfeyxiexzf) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c2633Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i7) == c2633Ujhhgtgfeyxiexzf2.mo2581Ujhhgtgfeyxiexzf(i7)) {
            int iMin = Math.min(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2633Ujhhgtgfeyxiexzf2.mo2578Ujhhgtgfeyxiexzf());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i11) == c2633Ujhhgtgfeyxiexzf2.mo2581Ujhhgtgfeyxiexzf(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf / j3) + j + ((long) 2) + ((long) i10) + 1;
            c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(-i10);
            c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i4)).mo2578Ujhhgtgfeyxiexzf()) {
                    throw new IllegalStateException("Check failed.");
                }
                c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = new C2598feyxiexzfUjhhgtg();
                c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(((int) ((c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf / j3) + j4)) * (-1));
                m3272Ujhhgtgfeyxiexzf(j4, c2598feyxiexzfUjhhgtg2, i12, arrayList4, i4, i3, arrayList5);
                c2598feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg2);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i14 - 1)).mo2581Ujhhgtgfeyxiexzf(i7) != ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i14)).mo2581Ujhhgtgfeyxiexzf(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf / j5) + j + ((long) 2) + ((long) (i13 * 2));
        c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(i13);
        c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo2581Ujhhgtgfeyxiexzf = ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i15)).mo2581Ujhhgtgfeyxiexzf(i7);
            if (i15 == i4 || iMo2581Ujhhgtgfeyxiexzf != ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i15 - 1)).mo2581Ujhhgtgfeyxiexzf(i7)) {
                c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(iMo2581Ujhhgtgfeyxiexzf & 255);
            }
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg3 = new C2598feyxiexzfUjhhgtg();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo2581Ujhhgtgfeyxiexzf = ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i16)).mo2581Ujhhgtgfeyxiexzf(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo2581Ujhhgtgfeyxiexzf != ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i18)).mo2581Ujhhgtgfeyxiexzf(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C2633Ujhhgtgfeyxiexzf) arrayList4.get(i16)).mo2578Ujhhgtgfeyxiexzf()) {
                c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                c2598feyxiexzfUjhhgtg.m3872feyxiexzfUjhhgtg(((int) ((c2598feyxiexzfUjhhgtg3.f8401Ujhhgtgfeyxiexzf / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                m3272Ujhhgtgfeyxiexzf(j2, c2598feyxiexzfUjhhgtg3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c2598feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m3273Ujhhgtgfeyxiexzf(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static int m3274Ujhhgtgfeyxiexzf(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static long[] m3275Ujhhgtgfeyxiexzf(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C1375feyxiexzfUjhhgtg m3276Ujhhgtgfeyxiexzf(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
            }
            return new C1375feyxiexzfUjhhgtg(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it2);
            }
            return new C1375feyxiexzfUjhhgtg(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C1375feyxiexzfUjhhgtg c1375feyxiexzfUjhhgtgM3276Ujhhgtgfeyxiexzf = m3276Ujhhgtgfeyxiexzf(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        if (it3.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it3);
        }
        return new C1375feyxiexzfUjhhgtg(cls, c1375feyxiexzfUjhhgtgM3276Ujhhgtgfeyxiexzf, arrayList3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m3277Ujhhgtgfeyxiexzf(View view, InterfaceC2304feyxiexzfUjhhgtg interfaceC2304feyxiexzfUjhhgtg) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg = new C3490feyxiexzfUjhhgtg();
        c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf = paddingStart;
        c3490feyxiexzfUjhhgtg.f10835Ujhhgtgfeyxiexzf = paddingTop;
        c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf = paddingEnd;
        c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf = paddingBottom;
        AbstractC1893Ujhhgtgfeyxiexzf.m3227Ujhhgtgfeyxiexzf(view, new C2073feyxiexzfUjhhgtg(interfaceC2304feyxiexzfUjhhgtg, 4, c3490feyxiexzfUjhhgtg));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2303feyxiexzfUjhhgtg());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static float m3278Ujhhgtgfeyxiexzf(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C0667Ujhhgtgfeyxiexzf m3279Ujhhgtgfeyxiexzf(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? C0667Ujhhgtgfeyxiexzf.f2780Ujhhgtgfeyxiexzf : C0667Ujhhgtgfeyxiexzf.f2779Ujhhgtgfeyxiexzf;
        }
        if (j4 < -31557014167219200L) {
            return C0667Ujhhgtgfeyxiexzf.f2779Ujhhgtgfeyxiexzf;
        }
        if (j4 > 31556889864403199L) {
            return C0667Ujhhgtgfeyxiexzf.f2780Ujhhgtgfeyxiexzf;
        }
        long j5 = j2 % 1000000000;
        return new C0667Ujhhgtgfeyxiexzf(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ViewGroup m3280Ujhhgtgfeyxiexzf(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final Type m3281Ujhhgtgfeyxiexzf(C1775Ujhhgtgfeyxiexzf c1775Ujhhgtgfeyxiexzf) {
        Class clsMo2998Ujhhgtgfeyxiexzf = c1775Ujhhgtgfeyxiexzf.f5950Ujhhgtgfeyxiexzf.mo2998Ujhhgtgfeyxiexzf();
        List list = Collections.EMPTY_LIST;
        if (list.isEmpty()) {
            return clsMo2998Ujhhgtgfeyxiexzf;
        }
        if (!clsMo2998Ujhhgtgfeyxiexzf.isArray()) {
            return m3276Ujhhgtgfeyxiexzf(clsMo2998Ujhhgtgfeyxiexzf, list);
        }
        if (clsMo2998Ujhhgtgfeyxiexzf.getComponentType().isPrimitive()) {
            return clsMo2998Ujhhgtgfeyxiexzf;
        }
        if (AbstractC2856feyxiexzfUjhhgtg.m4247feyxiexzfUjhhgtg(list) != null) {
            throw new ClassCastException();
        }
        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + c1775Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static boolean m3282Ujhhgtgfeyxiexzf(View view) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C1470feyxiexzfUjhhgtg m3283Ujhhgtgfeyxiexzf(C2633Ujhhgtgfeyxiexzf... c2633UjhhgtgfeyxiexzfArr) {
        int i;
        int i2 = 0;
        if (c2633UjhhgtgfeyxiexzfArr.length == 0) {
            return new C1470feyxiexzfUjhhgtg(new C2633Ujhhgtgfeyxiexzf[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C2381Ujhhgtgfeyxiexzf(c2633UjhhgtgfeyxiexzfArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c2633UjhhgtgfeyxiexzfArr.length);
        for (C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf : c2633UjhhgtgfeyxiexzfArr) {
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new C2381Ujhhgtgfeyxiexzf(objArrCopyOf, true));
        int length = c2633UjhhgtgfeyxiexzfArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = c2633UjhhgtgfeyxiexzfArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                int iM3274Ujhhgtgfeyxiexzf = m3274Ujhhgtgfeyxiexzf((Comparable) arrayList.get(i), c2633Ujhhgtgfeyxiexzf2);
                if (iM3274Ujhhgtgfeyxiexzf >= 0) {
                    if (iM3274Ujhhgtgfeyxiexzf <= 0) {
                        break;
                    }
                    i6 = i - 1;
                } else {
                    i7 = i + 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((C2633Ujhhgtgfeyxiexzf) arrayList.get(0)).mo2578Ujhhgtgfeyxiexzf() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf3 = (C2633Ujhhgtgfeyxiexzf) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf4 = (C2633Ujhhgtgfeyxiexzf) arrayList.get(i10);
                c2633Ujhhgtgfeyxiexzf4.getClass();
                if (!c2633Ujhhgtgfeyxiexzf4.mo2582Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf3, c2633Ujhhgtgfeyxiexzf3.mo2578Ujhhgtgfeyxiexzf())) {
                    break;
                }
                if (c2633Ujhhgtgfeyxiexzf4.mo2578Ujhhgtgfeyxiexzf() == c2633Ujhhgtgfeyxiexzf3.mo2578Ujhhgtgfeyxiexzf()) {
                    throw new IllegalArgumentException(("duplicate option: " + c2633Ujhhgtgfeyxiexzf4).toString());
                }
                if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    arrayList3.remove(i10);
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        m3272Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf / ((long) 4))];
        while (!c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf()) {
            iArr[i2] = c2598feyxiexzfUjhhgtg.readInt();
            i2++;
        }
        return new C1470feyxiexzfUjhhgtg((C2633Ujhhgtgfeyxiexzf[]) Arrays.copyOf(c2633UjhhgtgfeyxiexzfArr, c2633UjhhgtgfeyxiexzfArr.length), iArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static PorterDuff.Mode m3284Ujhhgtgfeyxiexzf(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Opcodes.DCONST_0 /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m3285Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        if (obj instanceof C0919feyxiexzfUjhhgtg) {
            throw ((C0919feyxiexzfUjhhgtg) obj).f3736Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final Class m3286Ujhhgtgfeyxiexzf(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m3286Ujhhgtgfeyxiexzf(((ParameterizedType) type).getRawType());
        }
        throw new C1789Ujhhgtgfeyxiexzf("Cannot cast type " + type + " to java.lang.Class object.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public abstract int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf);
}
