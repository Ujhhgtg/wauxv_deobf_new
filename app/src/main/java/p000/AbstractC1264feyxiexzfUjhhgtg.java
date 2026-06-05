package p000;

import android.graphics.Typeface;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.util.ArrayList;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ要点脸ᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1264feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f4629Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f4630Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final byte[] f4631Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, 53, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final byte[] f4632Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, JSONB.Constants.BC_INT32_BYTE_MIN, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final byte[] f4633Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 57, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final byte[] f4634Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 53, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final byte[] f4635Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final byte[] f4636Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final byte[] f4637Ujhhgtgfeyxiexzf = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 50, 0};

    static {
        int i = 1;
        f4629Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("UNDEFINED", i);
        f4630Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("REUSABLE_CLAIMED", i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static float m2793Ujhhgtgfeyxiexzf(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m2794Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i2, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static long m2795Ujhhgtgfeyxiexzf(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final void m2796Ujhhgtgfeyxiexzf(long j, int i, int i2, byte[] bArr, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC0547Ujhhgtgfeyxiexzf.f2537Ujhhgtgfeyxiexzf[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C2803Ujhhgtgfeyxiexzf m2797Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge, C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf) {
        int iM4289Ujhhgtgfeyxiexzf = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(4);
        int i = iM4289Ujhhgtgfeyxiexzf != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        int iM4289Ujhhgtgfeyxiexzf2 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(6);
        int i2 = iM4289Ujhhgtgfeyxiexzf2 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf2 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        int iM4289Ujhhgtgfeyxiexzf3 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(8);
        if (iM4289Ujhhgtgfeyxiexzf3 != 0) {
            c2919Ujhhgtgfeyxiexzf.m4291Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf3 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf);
        }
        int iM4289Ujhhgtgfeyxiexzf4 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(10);
        int i3 = iM4289Ujhhgtgfeyxiexzf4 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf4 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        int iM4289Ujhhgtgfeyxiexzf5 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(12);
        String strM4291Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf5 != 0 ? c2919Ujhhgtgfeyxiexzf.m4291Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf5 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : null;
        if (strM4291Ujhhgtgfeyxiexzf == null) {
            strM4291Ujhhgtgfeyxiexzf = "";
        }
        String str = strM4291Ujhhgtgfeyxiexzf;
        int iM4289Ujhhgtgfeyxiexzf6 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(14);
        int i4 = iM4289Ujhhgtgfeyxiexzf6 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf6 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM4289Ujhhgtgfeyxiexzf7 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(16);
        int iM4293Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf7 != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf7) : 0;
        for (int i5 = 0; i5 < iM4293Ujhhgtgfeyxiexzf; i5++) {
            int iM4289Ujhhgtgfeyxiexzf8 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(16);
            arrayList.add(Integer.valueOf(iM4289Ujhhgtgfeyxiexzf8 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt((i5 * 4) + c2919Ujhhgtgfeyxiexzf.m4292Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM4289Ujhhgtgfeyxiexzf9 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(18);
        int iM4293Ujhhgtgfeyxiexzf2 = iM4289Ujhhgtgfeyxiexzf9 != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf9) : 0;
        for (int i6 = 0; i6 < iM4293Ujhhgtgfeyxiexzf2; i6++) {
            int iM4289Ujhhgtgfeyxiexzf10 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(18);
            arrayList2.add(Integer.valueOf(iM4289Ujhhgtgfeyxiexzf10 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt((i6 * 4) + c2919Ujhhgtgfeyxiexzf.m4292Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM4289Ujhhgtgfeyxiexzf11 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(20);
        int iM4293Ujhhgtgfeyxiexzf3 = iM4289Ujhhgtgfeyxiexzf11 != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf11) : 0;
        for (int i7 = 0; i7 < iM4293Ujhhgtgfeyxiexzf3; i7++) {
            int iM4289Ujhhgtgfeyxiexzf12 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(20);
            arrayList3.add(Integer.valueOf(iM4289Ujhhgtgfeyxiexzf12 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt((i7 * 4) + c2919Ujhhgtgfeyxiexzf.m4292Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf12)) : 0));
        }
        return new C2803Ujhhgtgfeyxiexzf(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m2798Ujhhgtgfeyxiexzf(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m2799Ujhhgtgfeyxiexzf(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m2800Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf, C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg, byte b, String str, int i) {
        HashMap map = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10942Ujhhgtgfeyxiexzf;
        if (b == 1) {
            byte[] bArr = (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            int i2 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i2 + 1;
            map.put(str, new C3687Ujhhgtgfeyxiexzf(i, bArr[i2] == 1));
            return;
        }
        if (b == 2) {
            int iM3539Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf.m3539Ujhhgtgfeyxiexzf();
            if (c2496feyxiexzfUjhhgtg != null) {
                iM3539Ujhhgtgfeyxiexzf ^= c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf;
            }
            map.put(str, new C3690Ujhhgtgfeyxiexzf(i, iM3539Ujhhgtgfeyxiexzf));
            return;
        }
        if (b == 3) {
            int iM3539Ujhhgtgfeyxiexzf2 = c2344Ujhhgtgfeyxiexzf.m3539Ujhhgtgfeyxiexzf();
            if (c2496feyxiexzfUjhhgtg != null) {
                iM3539Ujhhgtgfeyxiexzf2 ^= c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf;
            }
            map.put(str, new C3689Ujhhgtgfeyxiexzf(i, Float.intBitsToFloat(iM3539Ujhhgtgfeyxiexzf2)));
            return;
        }
        if (b != 4) {
            long jM3541Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf.m3541Ujhhgtgfeyxiexzf(c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf);
            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf += 8;
            if (c2496feyxiexzfUjhhgtg != null) {
                jM3541Ujhhgtgfeyxiexzf ^= (long) c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf;
            }
            map.put(str, new C3688Ujhhgtgfeyxiexzf(i, Double.longBitsToDouble(jM3541Ujhhgtgfeyxiexzf)));
            return;
        }
        long jM3541Ujhhgtgfeyxiexzf2 = c2344Ujhhgtgfeyxiexzf.m3541Ujhhgtgfeyxiexzf(c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf);
        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf += 8;
        if (c2496feyxiexzfUjhhgtg != null) {
            jM3541Ujhhgtgfeyxiexzf2 ^= (long) c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf;
        }
        map.put(str, new C3691feyxiexzfUjhhgtg(i, jM3541Ujhhgtgfeyxiexzf2));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static void m2801Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf, C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg, byte b, String str, int i, int i2, byte b2) throws Exception {
        Object objM3776Ujhhgtgfeyxiexzf;
        int length;
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf2;
        byte b3 = b;
        HashMap map = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10942Ujhhgtgfeyxiexzf;
        boolean z = b3 == 9 || b3 == 10 || b3 == 11;
        int iM3539Ujhhgtgfeyxiexzf = z ? c2344Ujhhgtgfeyxiexzf.m3539Ujhhgtgfeyxiexzf() : c2344Ujhhgtgfeyxiexzf.m3542Ujhhgtgfeyxiexzf() & 65535;
        int i3 = z ? 4 : 2;
        boolean z2 = (b2 & JSONB.Constants.BC_INT32_SHORT_MIN) != 0;
        if (z2 && iM3539Ujhhgtgfeyxiexzf != 32) {
            throw new IllegalStateException("name size not match");
        }
        switch (b3) {
            case 9:
                b3 = 6;
                break;
            case 10:
                b3 = 7;
                break;
            case 11:
                b3 = 8;
                break;
        }
        if (b3 == 6) {
            map.put(str, new C3693feyxiexzfUjhhgtg(i2, i + i3, z2 ? c2344Ujhhgtgfeyxiexzf.m3543Ujhhgtgfeyxiexzf(iM3539Ujhhgtgfeyxiexzf) : c2344Ujhhgtgfeyxiexzf.m3544Ujhhgtgfeyxiexzf(c2496feyxiexzfUjhhgtg, iM3539Ujhhgtgfeyxiexzf), iM3539Ujhhgtgfeyxiexzf, z2));
            return;
        }
        if (b3 == 7) {
            if (z2) {
                objM3776Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf.m3543Ujhhgtgfeyxiexzf(iM3539Ujhhgtgfeyxiexzf);
            } else {
                c2344Ujhhgtgfeyxiexzf.getClass();
                byte[] bArr = new byte[iM3539Ujhhgtgfeyxiexzf];
                System.arraycopy((byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf, c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf, bArr, 0, iM3539Ujhhgtgfeyxiexzf);
                c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf += iM3539Ujhhgtgfeyxiexzf;
                objM3776Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg != null ? c2496feyxiexzfUjhhgtg.m3776Ujhhgtgfeyxiexzf(bArr) : bArr;
            }
            map.put(str, new C3685Ujhhgtgfeyxiexzf(i2, i + i3, objM3776Ujhhgtgfeyxiexzf, iM3539Ujhhgtgfeyxiexzf, z2));
            return;
        }
        if (z2) {
            map.put(str, new C3692feyxiexzfUjhhgtg(i2, i + i3, c2344Ujhhgtgfeyxiexzf.m3543Ujhhgtgfeyxiexzf(iM3539Ujhhgtgfeyxiexzf), iM3539Ujhhgtgfeyxiexzf, true));
            return;
        }
        if (c2496feyxiexzfUjhhgtg == null) {
            c2344Ujhhgtgfeyxiexzf2 = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf;
            length = iM3539Ujhhgtgfeyxiexzf;
        } else {
            byte[] bArr2 = new byte[iM3539Ujhhgtgfeyxiexzf];
            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf3 = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf;
            System.arraycopy((byte[]) c2344Ujhhgtgfeyxiexzf3.f7650Ujhhgtgfeyxiexzf, c2344Ujhhgtgfeyxiexzf3.f7648Ujhhgtgfeyxiexzf, bArr2, 0, iM3539Ujhhgtgfeyxiexzf);
            byte[] bArrM3776Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg.m3776Ujhhgtgfeyxiexzf(bArr2);
            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf4 = new C2344Ujhhgtgfeyxiexzf(0, bArrM3776Ujhhgtgfeyxiexzf);
            length = bArrM3776Ujhhgtgfeyxiexzf.length;
            c2344Ujhhgtgfeyxiexzf2 = c2344Ujhhgtgfeyxiexzf4;
        }
        byte[] bArr3 = (byte[]) c2344Ujhhgtgfeyxiexzf2.f7650Ujhhgtgfeyxiexzf;
        int i4 = c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf = i4 + 1;
        int i5 = bArr3[i4] & 255;
        String strM3543Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf2.m3543Ujhhgtgfeyxiexzf(i5);
        C1156feyxiexzfUjhhgtg c1156feyxiexzfUjhhgtg = (C1156feyxiexzfUjhhgtg) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10938Ujhhgtgfeyxiexzf.get(strM3543Ujhhgtgfeyxiexzf);
        int i6 = length - (i5 + 1);
        if (i6 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c1156feyxiexzfUjhhgtg != null) {
            try {
                C3692feyxiexzfUjhhgtg c3692feyxiexzfUjhhgtg = new C3692feyxiexzfUjhhgtg(i2, i + 2, c1156feyxiexzfUjhhgtg.m2648Ujhhgtgfeyxiexzf(c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf, i6, (byte[]) c2344Ujhhgtgfeyxiexzf2.f7650Ujhhgtgfeyxiexzf), iM3539Ujhhgtgfeyxiexzf, false);
                c3692feyxiexzfUjhhgtg.f11722Ujhhgtgfeyxiexzf = c1156feyxiexzfUjhhgtg;
                map.put(str, c3692feyxiexzfUjhhgtg);
            } catch (Exception e) {
                Log.e("FastKV", sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10937Ujhhgtgfeyxiexzf, e);
            }
        } else {
            AbstractC1252feyxiexzfUjhhgtg.m2784Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf, "object with tag: " + strM3543Ujhhgtgfeyxiexzf + " without encoder");
        }
        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i + i3 + iM3539Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m2802Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, boolean z) {
        int iM3539Ujhhgtgfeyxiexzf;
        SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf2 = sharedPreferencesC3515Ujhhgtgfeyxiexzf;
        C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10939Ujhhgtgfeyxiexzf;
        boolean z2 = false;
        if (z && c2496feyxiexzfUjhhgtg == null) {
            AbstractC1252feyxiexzfUjhhgtg.m2784Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf2, "miss cipher");
            return false;
        }
        C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg2 = z ? c2496feyxiexzfUjhhgtg : null;
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10944Ujhhgtgfeyxiexzf;
        String str = sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10937Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = 12;
        while (true) {
            try {
                int i = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                int i2 = sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10940Ujhhgtgfeyxiexzf;
                boolean z3 = true;
                if (i >= i2) {
                    if (i != i2) {
                        Log.e("FastKV", str, new Exception("parse dara failed"));
                        return false;
                    }
                    if (!z && c2496feyxiexzfUjhhgtg != null && i2 != 12) {
                        z2 = true;
                    }
                    sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10948Ujhhgtgfeyxiexzf = z2;
                    return true;
                }
                byte[] bArr = (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
                int i3 = i + 1;
                c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i3;
                byte b = bArr[i];
                byte b2 = (byte) (b & JSONB.Constants.BC_INT32_BYTE_MAX);
                if (b2 < 1 || b2 > 11) {
                    throw new Exception("parse dara failed");
                }
                int i4 = i + 2;
                c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i4;
                int i5 = bArr[i3] & 255;
                if (i5 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b < 0) {
                    c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i4 + i5;
                    if (b2 <= 5) {
                        iM3539Ujhhgtgfeyxiexzf = SharedPreferencesC3515Ujhhgtgfeyxiexzf.f10934feyxiexzfUjhhgtg[b2];
                    } else {
                        if (b2 != 9 && b2 != 10 && b2 != 11) {
                            z3 = false;
                        }
                        iM3539Ujhhgtgfeyxiexzf = z3 ? c2344Ujhhgtgfeyxiexzf.m3539Ujhhgtgfeyxiexzf() : c2344Ujhhgtgfeyxiexzf.m3542Ujhhgtgfeyxiexzf() & 65535;
                    }
                    int i6 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf + iM3539Ujhhgtgfeyxiexzf;
                    c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i6;
                    sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10950Ujhhgtgfeyxiexzf = (i6 - i) + sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10950Ujhhgtgfeyxiexzf;
                    ArrayList arrayList = sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10951Ujhhgtgfeyxiexzf;
                    C1089feyxiexzfUjhhgtg c1089feyxiexzfUjhhgtg = new C1089feyxiexzfUjhhgtg();
                    c1089feyxiexzfUjhhgtg.f4169Ujhhgtgfeyxiexzf = i;
                    c1089feyxiexzfUjhhgtg.f4170Ujhhgtgfeyxiexzf = i6;
                    arrayList.add(c1089feyxiexzfUjhhgtg);
                } else {
                    String strM3544Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf.m3544Ujhhgtgfeyxiexzf(c2496feyxiexzfUjhhgtg2, i5);
                    int i7 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                    if (b2 <= 5) {
                        m2800Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf2, c2344Ujhhgtgfeyxiexzf, c2496feyxiexzfUjhhgtg2, b2, strM3544Ujhhgtgfeyxiexzf, i7);
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf2 = sharedPreferencesC3515Ujhhgtgfeyxiexzf;
                    } else {
                        m2801Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf2, c2344Ujhhgtgfeyxiexzf, c2496feyxiexzfUjhhgtg2, b2, strM3544Ujhhgtgfeyxiexzf, i7, i, b);
                    }
                }
            } catch (Exception e) {
                Log.e("FastKV", str, e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final void m2803Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, Object obj) throws C3198feyxiexzfUjhhgtg {
        if (!(interfaceC3704Ujhhgtgfeyxiexzf instanceof C3194feyxiexzfUjhhgtg)) {
            interfaceC3704Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(obj);
            return;
        }
        C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = (C3194feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf;
        AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg = c3194feyxiexzfUjhhgtg.f9873Ujhhgtgfeyxiexzf;
        AbstractC3705feyxiexzfUjhhgtg abstractC3705feyxiexzfUjhhgtg = c3194feyxiexzfUjhhgtg.f9874Ujhhgtgfeyxiexzf;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = abstractC3705feyxiexzfUjhhgtg.f11746Ujhhgtgfeyxiexzf;
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(obj);
        Object c2874Ujhhgtgfeyxiexzf = thM2409Ujhhgtgfeyxiexzf == null ? obj : new C2874Ujhhgtgfeyxiexzf(thM2409Ujhhgtgfeyxiexzf, false);
        try {
            if (abstractC3740feyxiexzfUjhhgtg.mo1826feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg)) {
                c3194feyxiexzfUjhhgtg.f9875Ujhhgtgfeyxiexzf = c2874Ujhhgtgfeyxiexzf;
                c3194feyxiexzfUjhhgtg.f9878Ujhhgtgfeyxiexzf = 1;
                m2806Ujhhgtgfeyxiexzf(abstractC3740feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg, c3194feyxiexzfUjhhgtg);
                return;
            }
            AbstractC3359feyxiexzfUjhhgtg abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf = AbstractC1990feyxiexzfUjhhgtg.m3343Ujhhgtgfeyxiexzf();
            if (abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.f10506Ujhhgtgfeyxiexzf >= JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) {
                c3194feyxiexzfUjhhgtg.f9875Ujhhgtgfeyxiexzf = c2874Ujhhgtgfeyxiexzf;
                c3194feyxiexzfUjhhgtg.f9878Ujhhgtgfeyxiexzf = 1;
                C2377Ujhhgtgfeyxiexzf c2377Ujhhgtgfeyxiexzf = abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.f10508Ujhhgtgfeyxiexzf;
                if (c2377Ujhhgtgfeyxiexzf == null) {
                    c2377Ujhhgtgfeyxiexzf = new C2377Ujhhgtgfeyxiexzf();
                    abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.f10508Ujhhgtgfeyxiexzf = c2377Ujhhgtgfeyxiexzf;
                }
                c2377Ujhhgtgfeyxiexzf.addLast(c3194feyxiexzfUjhhgtg);
                return;
            }
            abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.m4865feyxiexzfUjhhgtg(true);
            try {
                InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf);
                if (interfaceC0717Ujhhgtgfeyxiexzf == null || interfaceC0717Ujhhgtgfeyxiexzf.mo1758Ujhhgtgfeyxiexzf()) {
                    Object objM2759Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2759Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, c3194feyxiexzfUjhhgtg.f9876Ujhhgtgfeyxiexzf);
                    C1959feyxiexzfUjhhgtg c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg = objM2759Ujhhgtgfeyxiexzf != AbstractC1245feyxiexzfUjhhgtg.f4587Ujhhgtgfeyxiexzf ? AbstractC3594Ujhhgtgfeyxiexzf.m5198feyxiexzfUjhhgtg(abstractC3705feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf) : null;
                    try {
                        abstractC3705feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(obj);
                        if (c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg == null || c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg.m3295feyxiexzfUjhhgtg()) {
                            AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
                        }
                    } catch (Throwable th) {
                        if (c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg == null || c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg.m3295feyxiexzfUjhhgtg()) {
                            AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
                        }
                        throw th;
                    }
                } else {
                    c3194feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(new C0919feyxiexzfUjhhgtg(interfaceC0717Ujhhgtgfeyxiexzf.mo1761Ujhhgtgfeyxiexzf()));
                }
                while (abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.m4866feyxiexzfUjhhgtg()) {
                }
            } catch (Throwable th2) {
                try {
                    c3194feyxiexzfUjhhgtg.m4697Ujhhgtgfeyxiexzf(th2);
                } finally {
                    abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.m4864feyxiexzfUjhhgtg();
                }
            }
        } catch (Throwable th3) {
            throw new C3198feyxiexzfUjhhgtg(th3, abstractC3740feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m2804Ujhhgtgfeyxiexzf(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m2805Ujhhgtgfeyxiexzf(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m2806Ujhhgtgfeyxiexzf(AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Runnable runnable) throws C3198feyxiexzfUjhhgtg {
        try {
            abstractC3740feyxiexzfUjhhgtg.mo1129feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, runnable);
        } catch (Throwable th) {
            throw new C3198feyxiexzfUjhhgtg(th, abstractC3740feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static C0680Ujhhgtgfeyxiexzf m2807Ujhhgtgfeyxiexzf(C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = c0682Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf;
        int i3 = c0682Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf;
        if (c0682Ujhhgtgfeyxiexzf.f2807Ujhhgtgfeyxiexzf <= 0) {
            i = -i;
        }
        return new C0680Ujhhgtgfeyxiexzf(i2, i3, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static String m2808Ujhhgtgfeyxiexzf(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static String m2809Ujhhgtgfeyxiexzf(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m2810Ujhhgtgfeyxiexzf(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m2811Ujhhgtgfeyxiexzf(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m2812Ujhhgtgfeyxiexzf(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0682Ujhhgtgfeyxiexzf m2813feyxiexzfUjhhgtg(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C0682Ujhhgtgfeyxiexzf(i, i2 - 1, 1);
        }
        C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf = C0682Ujhhgtgfeyxiexzf.f2810Ujhhgtgfeyxiexzf;
        return C0682Ujhhgtgfeyxiexzf.f2810Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final void m2814feyxiexzfUjhhgtg(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static AbstractC3150Ujhhgtgfeyxiexzf m2815feyxiexzfUjhhgtg(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        switch (c1784feyxiexzfUjhhgtg.f6018Ujhhgtgfeyxiexzf) {
            case 1:
                return C3133Ujhhgtgfeyxiexzf.f9724Ujhhgtgfeyxiexzf;
            case 2:
                return C3134Ujhhgtgfeyxiexzf.f9726Ujhhgtgfeyxiexzf;
            case 3:
                return C3137Ujhhgtgfeyxiexzf.f9729Ujhhgtgfeyxiexzf;
            case 4:
                return C3138Ujhhgtgfeyxiexzf.f9730Ujhhgtgfeyxiexzf;
            case 5:
                return C3141Ujhhgtgfeyxiexzf.f9733Ujhhgtgfeyxiexzf;
            case 6:
                return C3144Ujhhgtgfeyxiexzf.f9742Ujhhgtgfeyxiexzf;
            case 7:
                return C3151Ujhhgtgfeyxiexzf.f9758Ujhhgtgfeyxiexzf;
            case 8:
                return C3055Ujhhgtgfeyxiexzf.f9449Ujhhgtgfeyxiexzf;
            case 9:
                return C3147Ujhhgtgfeyxiexzf.f9755Ujhhgtgfeyxiexzf;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c1784feyxiexzfUjhhgtg.mo1392Ujhhgtgfeyxiexzf());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public abstract void mo2816Ujhhgtgfeyxiexzf(Throwable th);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public abstract void mo2817Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public abstract void mo2818Ujhhgtgfeyxiexzf(Typeface typeface, boolean z);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public abstract void mo2819Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf);
}
