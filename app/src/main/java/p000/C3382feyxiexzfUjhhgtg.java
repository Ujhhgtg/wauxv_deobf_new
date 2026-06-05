package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3382feyxiexzfUjhhgtg implements InterfaceC3738Ujhhgtgfeyxiexzf, InterfaceC0288Ujhhgtgfeyxiexzf, InterfaceC0891feyxiexzfUjhhgtg, InterfaceC0372Ujhhgtgfeyxiexzf, InterfaceC0052Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ C3382feyxiexzfUjhhgtg f10556Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ C3382feyxiexzfUjhhgtg f10557Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10558Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10559Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10560Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ C3382feyxiexzfUjhhgtg f10561Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10562Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10563Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10564Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final /* synthetic */ C3382feyxiexzfUjhhgtg f10565Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ C3382feyxiexzfUjhhgtg f10566Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10567Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10568Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10569Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10570Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10571Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f10572Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0210Ujhhgtgfeyxiexzf m4885Ujhhgtgfeyxiexzf(XC_MethodHook.MethodHookParam methodHookParam) {
        return new C0210Ujhhgtgfeyxiexzf(new C0573Ujhhgtgfeyxiexzf(methodHookParam, 0), new C0573Ujhhgtgfeyxiexzf(methodHookParam, 1), new C0573Ujhhgtgfeyxiexzf(methodHookParam, 2), new C0581Ujhhgtgfeyxiexzf(methodHookParam, 0), new C0581Ujhhgtgfeyxiexzf(methodHookParam, 1));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static String m4886Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            C0805feyxiexzfUjhhgtg c0805feyxiexzfUjhhgtg = AbstractC0804feyxiexzfUjhhgtg.f3192Ujhhgtgfeyxiexzf;
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(AbstractC0804feyxiexzfUjhhgtg.f3193Ujhhgtgfeyxiexzf.m4298Ujhhgtgfeyxiexzf(62)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m4887Ujhhgtgfeyxiexzf(byte[] bArr, BigInteger bigInteger) {
        if (bArr.length == 0 || bArr.length < 131072) {
            return;
        }
        C0808feyxiexzfUjhhgtg c0808feyxiexzfUjhhgtg = new C0808feyxiexzfUjhhgtg(bigInteger);
        int i = 0;
        C0680Ujhhgtgfeyxiexzf c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2807Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(0, 131072), 8);
        int i2 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf;
        int i3 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf;
        int i4 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf.f2807Ujhhgtgfeyxiexzf;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return;
        }
        while (true) {
            int i5 = c0808feyxiexzfUjhhgtg.f3203Ujhhgtgfeyxiexzf;
            BigInteger bigInteger2 = c0808feyxiexzfUjhhgtg.f3200Ujhhgtgfeyxiexzf[i5];
            int i6 = 255;
            if (i5 == 0) {
                c0808feyxiexzfUjhhgtg.m2156Ujhhgtgfeyxiexzf();
                c0808feyxiexzfUjhhgtg.f3203Ujhhgtgfeyxiexzf = 255;
            } else {
                c0808feyxiexzfUjhhgtg.f3203Ujhhgtgfeyxiexzf = i5 - 1;
            }
            byte[] bArr2 = new byte[8];
            int i7 = i;
            while (i7 < 8) {
                BigInteger bigIntegerShiftRight = bigInteger2.shiftRight(i7 * 8);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                MagicFactory.get(4928831875352364426L, strArr);
                BigInteger bigIntegerValueOf = BigInteger.valueOf(i6);
                MagicFactory.get(4928835242606724490L, strArr);
                bArr2[7 - i7] = bigIntegerShiftRight.and(bigIntegerValueOf).byteValue();
                i7++;
                i4 = i4;
                i6 = 255;
            }
            int i8 = i4;
            for (int i9 = 0; i9 < 8; i9++) {
                int i10 = i2 + i9;
                if (i10 >= 131072) {
                    return;
                }
                bArr[i10] = (byte) (bArr[i10] ^ bArr2[i9]);
            }
            if (i2 == i3) {
                return;
            }
            i2 += i8;
            i4 = i8;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m4888Ujhhgtgfeyxiexzf(String str, String str2, BigInteger bigInteger) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            try {
                byte[] bArr = new byte[33554432];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    } else {
                        m4887Ujhhgtgfeyxiexzf(bArr, bigInteger);
                        fileOutputStream.write(bArr, 0, i);
                    }
                    try {
                        throw th;
                    } catch (Throwable th) {
                        AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(fileInputStream, th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static Object m4889Ujhhgtgfeyxiexzf(String str, String str2, byte[] bArr, Object obj) throws IllegalAccessException {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf(MagicFactory.get(4928211630535214474L, strArr)), new Object[0]);
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf);
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928267916081628554L, strArr);
        ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(str);
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928267890311824778L, strArr);
        ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(str2);
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928267976211170698L, strArr);
        ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(bArr);
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928267933261497738L, strArr);
        ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(obj);
        return objM4168Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Object m4890Ujhhgtgfeyxiexzf(String str, String str2, Object obj, int i) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if ((i & 1) != 0) {
            str = MagicFactory.get(4928268019160843658L, strArr);
        }
        if ((i & 2) != 0) {
            str2 = MagicFactory.get(4928268014865876362L, strArr);
        }
        return m4889Ujhhgtgfeyxiexzf(str, str2, null, obj);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static long m4891Ujhhgtgfeyxiexzf(long j, AbstractC3611Ujhhgtgfeyxiexzf abstractC3611Ujhhgtgfeyxiexzf) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C3710Ujhhgtgfeyxiexzf.f11757Ujhhgtgfeyxiexzf)) {
            return m4892Ujhhgtgfeyxiexzf(j, jCurrentTimeMillis) | 6917529027641081856L;
        }
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C3710Ujhhgtgfeyxiexzf.f11755Ujhhgtgfeyxiexzf)) {
            return m4892Ujhhgtgfeyxiexzf(j, jCurrentTimeMillis) & (-6917529027641081857L);
        }
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C3710Ujhhgtgfeyxiexzf.f11753Ujhhgtgfeyxiexzf)) {
            return m4892Ujhhgtgfeyxiexzf(j, jCurrentTimeMillis) & 6917529027641081856L;
        }
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C3710Ujhhgtgfeyxiexzf.f11756Ujhhgtgfeyxiexzf)) {
            return m4892Ujhhgtgfeyxiexzf(j, jCurrentTimeMillis) | (-6917529027641081856L);
        }
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C3710Ujhhgtgfeyxiexzf.f11754Ujhhgtgfeyxiexzf)) {
            return m4892Ujhhgtgfeyxiexzf(j, jCurrentTimeMillis) & 6917529027641081855L;
        }
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C3710Ujhhgtgfeyxiexzf.f11752Ujhhgtgfeyxiexzf)) {
            return m4892Ujhhgtgfeyxiexzf(j, jCurrentTimeMillis) & (-6917529027641081856L);
        }
        throw new C2870Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static long m4892Ujhhgtgfeyxiexzf(long j, long j2) {
        return (j & (-72057594037927936L)) | (j2 & 72057594037927935L);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static C0245Ujhhgtgfeyxiexzf m4893Ujhhgtgfeyxiexzf(C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf, C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg, int i, boolean z) {
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2;
        int i2 = i * 10;
        if (c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf != i2) {
            m4899feyxiexzfUjhhgtg(i2 + 2);
            throw null;
        }
        C2628feyxiexzfUjhhgtg c2628feyxiexzfUjhhgtg = new C2628feyxiexzfUjhhgtg(new C2609Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf));
        C0245Ujhhgtgfeyxiexzf c0245Ujhhgtgfeyxiexzf = new C0245Ujhhgtgfeyxiexzf(i);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                int unsignedShort = c2628feyxiexzfUjhhgtg.readUnsignedShort();
                int unsignedShort2 = c2628feyxiexzfUjhhgtg.readUnsignedShort();
                int unsignedShort3 = c2628feyxiexzfUjhhgtg.readUnsignedShort();
                int unsignedShort4 = c2628feyxiexzfUjhhgtg.readUnsignedShort();
                int unsignedShort5 = c2628feyxiexzfUjhhgtg.readUnsignedShort();
                C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf3 = (C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(unsignedShort3);
                C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf4 = (C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(unsignedShort4);
                if (z) {
                    c3056Ujhhgtgfeyxiexzf2 = null;
                    c3056Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf4;
                } else {
                    c3056Ujhhgtgfeyxiexzf = null;
                    c3056Ujhhgtgfeyxiexzf2 = c3056Ujhhgtgfeyxiexzf4;
                }
                c0245Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(i3, new C0237Ujhhgtgfeyxiexzf(unsignedShort, unsignedShort2, c3056Ujhhgtgfeyxiexzf3, c3056Ujhhgtgfeyxiexzf2, c3056Ujhhgtgfeyxiexzf, unsignedShort5));
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        c0245Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        return c0245Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Cursor m4894Ujhhgtgfeyxiexzf(String str) {
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf.getClass();
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1136feyxiexzfUjhhgtg.m2603feyxiexzfUjhhgtg()).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928205819444462986L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
        return (Cursor) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object[].class)}, 2, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(str, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static C2541feyxiexzfUjhhgtg m4895Ujhhgtgfeyxiexzf(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, int i2) {
        if (i2 >= 2) {
            return new C2541feyxiexzfUjhhgtg("RuntimeInvisibleAnnotations", new C2629Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i, i2).m3952feyxiexzfUjhhgtg(2), i2);
        }
        m4900feyxiexzfUjhhgtg();
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static C2543feyxiexzfUjhhgtg m4896Ujhhgtgfeyxiexzf(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, int i2) {
        if (i2 >= 2) {
            return new C2543feyxiexzfUjhhgtg("RuntimeVisibleAnnotations", new C2629Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i, i2).m3952feyxiexzfUjhhgtg(1), i2);
        }
        m4900feyxiexzfUjhhgtg();
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ArrayList m4897Ujhhgtgfeyxiexzf(Bitmap bitmap, boolean z, boolean z2) {
        int pixel;
        int width = z ? bitmap.getWidth() : bitmap.getHeight();
        ArrayList arrayList = new ArrayList();
        int i = width - 1;
        int i2 = -1;
        for (int i3 = 1; i3 < i; i3++) {
            if (z && z2) {
                pixel = bitmap.getPixel(i3, bitmap.getHeight() - 1);
            } else if (z) {
                pixel = bitmap.getPixel(i3, 0);
            } else {
                pixel = z2 ? bitmap.getPixel(bitmap.getWidth() - 1, i3) : bitmap.getPixel(0, i3);
            }
            int iAlpha = Color.alpha(pixel);
            int iRed = Color.red(pixel);
            int iGreen = Color.green(pixel);
            int iBlue = Color.blue(pixel);
            if (iAlpha == 255 && iRed == 0 && iGreen == 0 && iBlue == 0) {
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
            } else if (i2 != -1) {
                arrayList.add(new C1256feyxiexzfUjhhgtg(i2, i3 - 1));
                i2 = -1;
            }
        }
        if (i2 != -1) {
            arrayList.add(new C1256feyxiexzfUjhhgtg(i2, width - 2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static C2545feyxiexzfUjhhgtg m4898Ujhhgtgfeyxiexzf(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, int i2) {
        if (i2 != 2) {
            m4899feyxiexzfUjhhgtg(2);
            throw null;
        }
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
        c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
        return new C2545feyxiexzfUjhhgtg((C3056Ujhhgtgfeyxiexzf) c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m4899feyxiexzfUjhhgtg(int i) {
        throw new C1404feyxiexzfUjhhgtg("bad attribute length; expected length ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i)), null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4900feyxiexzfUjhhgtg() {
        throw new C1404feyxiexzfUjhhgtg("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m4901feyxiexzfUjhhgtg(String str, List list, String str2, String str3) throws IllegalAccessException, InvocationTargetException {
        Object objM3291feyxiexzfUjhhgtg = C1952feyxiexzfUjhhgtg.m3291feyxiexzfUjhhgtg(C1952feyxiexzfUjhhgtg.f6428Ujhhgtgfeyxiexzf, EnumC2265feyxiexzfUjhhgtg.f7391Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf);
        C1952feyxiexzfUjhhgtg.m3292feyxiexzfUjhhgtg(objM3291feyxiexzfUjhhgtg, str);
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            C1196feyxiexzfUjhhgtg.f4492Ujhhgtgfeyxiexzf.getClass();
            arrayList.add(AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C1197feyxiexzfUjhhgtg.f4493Ujhhgtgfeyxiexzf).newInstance(str4, 2));
        }
        AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1953feyxiexzfUjhhgtg.f6429Ujhhgtgfeyxiexzf).invoke(objM3291feyxiexzfUjhhgtg, arrayList);
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                C1952feyxiexzfUjhhgtg.f6428Ujhhgtgfeyxiexzf.getClass();
                C1952feyxiexzfUjhhgtg.m3294feyxiexzfUjhhgtg(objM3291feyxiexzfUjhhgtg, str2);
            }
        }
        if (str3 != null) {
            if (str3.length() == 0) {
                str3 = null;
            }
            if (str3 != null) {
                C1952feyxiexzfUjhhgtg.f6428Ujhhgtgfeyxiexzf.getClass();
                C1952feyxiexzfUjhhgtg.m3293feyxiexzfUjhhgtg(objM3291feyxiexzfUjhhgtg, str3);
            }
        }
        C1952feyxiexzfUjhhgtg.f6428Ujhhgtgfeyxiexzf.getClass();
        C1952feyxiexzfUjhhgtg.m3290feyxiexzfUjhhgtg(objM3291feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC0052Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo755Ujhhgtgfeyxiexzf(InterfaceC0049Ujhhgtgfeyxiexzf interfaceC0049Ujhhgtgfeyxiexzf) {
        interfaceC0049Ujhhgtgfeyxiexzf.mo1054Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public boolean mo2856Ujhhgtgfeyxiexzf() {
        return this instanceof C0209Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public void mo1288Ujhhgtgfeyxiexzf(float f, float f2, float f3, C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg) {
        c1007feyxiexzfUjhhgtg.m2505Ujhhgtgfeyxiexzf(f, 0.0f);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public AbstractC2482feyxiexzfUjhhgtg m4902Ujhhgtgfeyxiexzf(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, int i2) {
        C1404feyxiexzfUjhhgtg c1404feyxiexzfUjhhgtg;
        String str;
        if (c3159feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = null;
        try {
            C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
            c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
            C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
            int iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i2);
            int iM3901Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2 + 2);
            C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = (C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf);
            try {
                return m4903Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i, c3056Ujhhgtgfeyxiexzf2.f9450Ujhhgtgfeyxiexzf, i2 + 6, iM3901Ujhhgtgfeyxiexzf);
            } catch (C1404feyxiexzfUjhhgtg e) {
                c1404feyxiexzfUjhhgtg = e;
                c3056Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf2;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c3056Ujhhgtgfeyxiexzf != null) {
                    str = c3056Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2));
                c1404feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf(sb.toString());
                throw c1404feyxiexzfUjhhgtg;
            }
        } catch (C1404feyxiexzfUjhhgtg e2) {
            c1404feyxiexzfUjhhgtg = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r18v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能ᛳᛲ要点脸, 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱ] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AbstractC2482feyxiexzfUjhhgtg m4903Ujhhgtgfeyxiexzf(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, String str, int i2, int i3) {
        InterfaceC1790feyxiexzfUjhhgtg c2344Ujhhgtgfeyxiexzf;
        boolean z = false;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = null;
        if (i == 0) {
            int i4 = 4;
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                int iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9782Ujhhgtgfeyxiexzf;
                C2659feyxiexzfUjhhgtg c2659feyxiexzfUjhhgtg = new C2659feyxiexzfUjhhgtg(iM3906Ujhhgtgfeyxiexzf);
                int i7 = 0;
                while (i7 < iM3906Ujhhgtgfeyxiexzf) {
                    int i8 = i4;
                    if (i6 < i8) {
                        throw new C1404feyxiexzfUjhhgtg("truncated attribute", null);
                    }
                    int iM3906Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i5);
                    int iM3906Ujhhgtgfeyxiexzf3 = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i5 + 2);
                    i5 += i8;
                    i6 -= 4;
                    if (i6 < iM3906Ujhhgtgfeyxiexzf3 * 2) {
                        throw new C1404feyxiexzfUjhhgtg("truncated attribute", null);
                    }
                    ?? c2657Ujhhgtgfeyxiexzf = new C2657Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf3);
                    for (?? r14 = z; r14 < iM3906Ujhhgtgfeyxiexzf3; r14++) {
                        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf = c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i5));
                        if (!(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3057Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3144Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3151Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3141Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3138Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3153Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3156Ujhhgtgfeyxiexzf)) {
                            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf.getClass(), "bad type for bootstrap argument: "));
                        }
                        c2657Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(r14, abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf);
                        i5 += 2;
                        i6 -= 2;
                        z = false;
                    }
                    c2657Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = z;
                    c2659feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i7, new C2658Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf, (C3153Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf2), c2657Ujhhgtgfeyxiexzf));
                    i7++;
                    z = false;
                    i4 = 4;
                }
                c2659feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = z;
                if (i6 == 0) {
                    return new C2403Ujhhgtgfeyxiexzf(c2659feyxiexzfUjhhgtg);
                }
                m4899feyxiexzfUjhhgtg(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C2535feyxiexzfUjhhgtg("Deprecated", 0);
                }
                m4899feyxiexzfUjhhgtg(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m4899feyxiexzfUjhhgtg(4);
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf2 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg2 = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
                C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf2 = (C3057Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg2.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf2.m3906Ujhhgtgfeyxiexzf(i2));
                int iM3906Ujhhgtgfeyxiexzf4 = c2610Ujhhgtgfeyxiexzf2.m3906Ujhhgtgfeyxiexzf(i2 + 2);
                return new C2536feyxiexzfUjhhgtg(c3057Ujhhgtgfeyxiexzf2, (C3155Ujhhgtgfeyxiexzf) (iM3906Ujhhgtgfeyxiexzf4 == 0 ? null : c1132feyxiexzfUjhhgtg2.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf4)));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf3 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg3 = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
                int iM3906Ujhhgtgfeyxiexzf5 = c2610Ujhhgtgfeyxiexzf3.m3906Ujhhgtgfeyxiexzf(i2);
                int i9 = i2 + 2;
                int i10 = iM3906Ujhhgtgfeyxiexzf5 * 8;
                if (i3 - 2 != i10) {
                    m4899feyxiexzfUjhhgtg(i10 + 2);
                    throw null;
                }
                C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf2 = new C2657Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf5);
                for (int i11 = 0; i11 < iM3906Ujhhgtgfeyxiexzf5; i11++) {
                    int iM3906Ujhhgtgfeyxiexzf6 = c2610Ujhhgtgfeyxiexzf3.m3906Ujhhgtgfeyxiexzf(i9);
                    int iM3906Ujhhgtgfeyxiexzf7 = c2610Ujhhgtgfeyxiexzf3.m3906Ujhhgtgfeyxiexzf(i9 + 2);
                    int iM3906Ujhhgtgfeyxiexzf8 = c2610Ujhhgtgfeyxiexzf3.m3906Ujhhgtgfeyxiexzf(i9 + 4);
                    c2657Ujhhgtgfeyxiexzf2.m4970Ujhhgtgfeyxiexzf(i11, new C0658Ujhhgtgfeyxiexzf((C3057Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg3.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf6), (C3057Ujhhgtgfeyxiexzf) (iM3906Ujhhgtgfeyxiexzf7 == 0 ? null : c1132feyxiexzfUjhhgtg3.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf7)), (C3056Ujhhgtgfeyxiexzf) (iM3906Ujhhgtgfeyxiexzf8 == 0 ? null : c1132feyxiexzfUjhhgtg3.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf8)), c2610Ujhhgtgfeyxiexzf3.m3906Ujhhgtgfeyxiexzf(i9 + 6)));
                    i9 += 8;
                }
                c2657Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
                return new C2538feyxiexzfUjhhgtg(c2657Ujhhgtgfeyxiexzf2);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m4895Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m4896Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C2535feyxiexzfUjhhgtg("Synthetic", 1);
                }
                m4899feyxiexzfUjhhgtg(0);
                throw null;
            }
            if (str == "Signature") {
                return m4898Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C2546feyxiexzfUjhhgtg(new C3056Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf.m3914Ujhhgtgfeyxiexzf(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 != 2) {
                    m4899feyxiexzfUjhhgtg(2);
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf4 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                return new C2547feyxiexzfUjhhgtg((C3056Ujhhgtgfeyxiexzf) c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf4.m3906Ujhhgtgfeyxiexzf(i2)));
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 != 2) {
                    m4899feyxiexzfUjhhgtg(2);
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf5 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                return new C2534feyxiexzfUjhhgtg((AbstractC1774Ujhhgtgfeyxiexzf) c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf5.m3906Ujhhgtgfeyxiexzf(i2)));
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C2535feyxiexzfUjhhgtg("Deprecated", 0);
                }
                m4899feyxiexzfUjhhgtg(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m4895Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m4896Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "Signature") {
                return m4898Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C2535feyxiexzfUjhhgtg("Synthetic", 1);
                }
                m4899feyxiexzfUjhhgtg(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
                try {
                    AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM3960feyxiexzfUjhhgtg = c2629Ujhhgtgfeyxiexzf.m3960feyxiexzfUjhhgtg();
                    if (((C2628feyxiexzfUjhhgtg) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).available() == 0) {
                        return new C2404Ujhhgtgfeyxiexzf(i3, abstractC3638UjhhgtgfeyxiexzfM3960feyxiexzfUjhhgtg);
                    }
                    throw new C1404feyxiexzfUjhhgtg("extra data in attribute", null);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf6 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg4 = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
                int iM3906Ujhhgtgfeyxiexzf9 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i2);
                int iM3906Ujhhgtgfeyxiexzf10 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i2 + 2);
                int iM3901Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf6.m3901Ujhhgtgfeyxiexzf(i2 + 4);
                int i12 = i2 + 8;
                int i13 = i3 - 8;
                if (i13 < iM3901Ujhhgtgfeyxiexzf + 4) {
                    throw new C1404feyxiexzfUjhhgtg("truncated attribute", null);
                }
                int i14 = i12 + iM3901Ujhhgtgfeyxiexzf;
                int i15 = i13 - iM3901Ujhhgtgfeyxiexzf;
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf2 = new C2629Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf6.m3914Ujhhgtgfeyxiexzf(i12, i14), c1132feyxiexzfUjhhgtg4);
                int iM3906Ujhhgtgfeyxiexzf11 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i14);
                C2650feyxiexzfUjhhgtg c2650feyxiexzfUjhhgtg = iM3906Ujhhgtgfeyxiexzf11 == 0 ? C2650feyxiexzfUjhhgtg.f8507Ujhhgtgfeyxiexzf : new C2650feyxiexzfUjhhgtg(iM3906Ujhhgtgfeyxiexzf11);
                int i16 = i14 + 2;
                int i17 = i15 - 2;
                if (i17 < (iM3906Ujhhgtgfeyxiexzf11 * 8) + 2) {
                    throw new C1404feyxiexzfUjhhgtg("truncated attribute", null);
                }
                int i18 = 0;
                while (i18 < iM3906Ujhhgtgfeyxiexzf11) {
                    int iM3906Ujhhgtgfeyxiexzf12 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i16);
                    int iM3906Ujhhgtgfeyxiexzf13 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i16 + 2);
                    int iM3906Ujhhgtgfeyxiexzf14 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i16 + 4);
                    AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
                    int iM3906Ujhhgtgfeyxiexzf15 = c2610Ujhhgtgfeyxiexzf6.m3906Ujhhgtgfeyxiexzf(i16 + 6);
                    AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf2 = iM3906Ujhhgtgfeyxiexzf15 == 0 ? abstractC3638Ujhhgtgfeyxiexzf2 : c1132feyxiexzfUjhhgtg4.m2601Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf15);
                    c2650feyxiexzfUjhhgtg.getClass();
                    c2650feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i18, new C2649feyxiexzfUjhhgtg(iM3906Ujhhgtgfeyxiexzf12, iM3906Ujhhgtgfeyxiexzf13, iM3906Ujhhgtgfeyxiexzf14, (C3057Ujhhgtgfeyxiexzf) abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf2));
                    i16 += 8;
                    i17 -= 8;
                    i18++;
                    abstractC3638Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf2;
                }
                ?? r18 = abstractC3638Ujhhgtgfeyxiexzf;
                c2650feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
                C2548feyxiexzfUjhhgtg c2548feyxiexzfUjhhgtg = new C2548feyxiexzfUjhhgtg(c3159feyxiexzfUjhhgtg, 3, i16, this);
                c2548feyxiexzfUjhhgtg.m3799Ujhhgtgfeyxiexzf();
                C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf3 = (C2657Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8273Ujhhgtgfeyxiexzf;
                c2657Ujhhgtgfeyxiexzf3.f2247Ujhhgtgfeyxiexzf = false;
                c2548feyxiexzfUjhhgtg.m3799Ujhhgtgfeyxiexzf();
                int i19 = c2548feyxiexzfUjhhgtg.f8270Ujhhgtgfeyxiexzf - i16;
                if (i19 == i17) {
                    return new C2533feyxiexzfUjhhgtg(iM3906Ujhhgtgfeyxiexzf9, iM3906Ujhhgtgfeyxiexzf10, c2629Ujhhgtgfeyxiexzf2, c2650feyxiexzfUjhhgtg, c2657Ujhhgtgfeyxiexzf3);
                }
                m4899feyxiexzfUjhhgtg((i16 - i2) + i19);
                throw r18;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C2535feyxiexzfUjhhgtg("Deprecated", 0);
                }
                m4899feyxiexzfUjhhgtg(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                int iM3906Ujhhgtgfeyxiexzf16 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i2);
                int i20 = i2 + 2;
                int i21 = iM3906Ujhhgtgfeyxiexzf16 * 2;
                if (i3 - 2 != i21) {
                    m4899feyxiexzfUjhhgtg(i21 + 2);
                    throw null;
                }
                if (iM3906Ujhhgtgfeyxiexzf16 == 0) {
                    c2344Ujhhgtgfeyxiexzf = C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf;
                } else {
                    C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg5 = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
                    if (c1132feyxiexzfUjhhgtg5 == null) {
                        throw new IllegalStateException("pool not yet initialized");
                    }
                    c2344Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf, i20, iM3906Ujhhgtgfeyxiexzf16, c1132feyxiexzfUjhhgtg5);
                }
                return new C2537feyxiexzfUjhhgtg(c2344Ujhhgtgfeyxiexzf);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m4895Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m4896Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C2542feyxiexzfUjhhgtg("RuntimeInvisibleParameterAnnotations", new C2629Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3).m3958feyxiexzfUjhhgtg(2), i3);
                }
                m4900feyxiexzfUjhhgtg();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C2544feyxiexzfUjhhgtg("RuntimeVisibleParameterAnnotations", new C2629Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3).m3958feyxiexzfUjhhgtg(1), i3);
                }
                m4900feyxiexzfUjhhgtg();
                throw null;
            }
            if (str == "Signature") {
                return m4898Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C2535feyxiexzfUjhhgtg("Synthetic", 1);
                }
                m4899feyxiexzfUjhhgtg(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf7 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                int iM3906Ujhhgtgfeyxiexzf17 = c2610Ujhhgtgfeyxiexzf7.m3906Ujhhgtgfeyxiexzf(i2);
                int i22 = i2 + 2;
                int i23 = iM3906Ujhhgtgfeyxiexzf17 * 4;
                if (i3 - 2 != i23) {
                    m4899feyxiexzfUjhhgtg(i23 + 2);
                    throw null;
                }
                C0089Ujhhgtgfeyxiexzf c0089Ujhhgtgfeyxiexzf = new C0089Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf17);
                for (int i24 = 0; i24 < iM3906Ujhhgtgfeyxiexzf17; i24++) {
                    c0089Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(i24, new C0081Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf7.m3906Ujhhgtgfeyxiexzf(i22), c2610Ujhhgtgfeyxiexzf7.m3906Ujhhgtgfeyxiexzf(i22 + 2)));
                    i22 += 4;
                }
                c0089Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
                return new C2539feyxiexzfUjhhgtg(c0089Ujhhgtgfeyxiexzf);
            }
            if (str == "LocalVariableTable") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf8 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                int iM3906Ujhhgtgfeyxiexzf18 = c2610Ujhhgtgfeyxiexzf8.m3906Ujhhgtgfeyxiexzf(i2);
                C2610Ujhhgtgfeyxiexzf c2610UjhhgtgfeyxiexzfM3914Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf8.m3914Ujhhgtgfeyxiexzf(i2 + 2, i2 + i3);
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                return new C2540feyxiexzfUjhhgtg("LocalVariableTable", m4893Ujhhgtgfeyxiexzf(c2610UjhhgtgfeyxiexzfM3914Ujhhgtgfeyxiexzf, c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf, iM3906Ujhhgtgfeyxiexzf18, false));
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 < 2) {
                    m4900feyxiexzfUjhhgtg();
                    throw null;
                }
                C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf9 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
                int iM3906Ujhhgtgfeyxiexzf19 = c2610Ujhhgtgfeyxiexzf9.m3906Ujhhgtgfeyxiexzf(i2);
                C2610Ujhhgtgfeyxiexzf c2610UjhhgtgfeyxiexzfM3914Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf9.m3914Ujhhgtgfeyxiexzf(i2 + 2, i2 + i3);
                c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
                return new C2540feyxiexzfUjhhgtg("LocalVariableTypeTable", m4893Ujhhgtgfeyxiexzf(c2610UjhhgtgfeyxiexzfM3914Ujhhgtgfeyxiexzf2, c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf, iM3906Ujhhgtgfeyxiexzf19, true));
            }
        }
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf10 = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
        c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
        return new C0807feyxiexzfUjhhgtg(str, c2610Ujhhgtgfeyxiexzf10, i2, i3);
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        return C1939Ujhhgtgfeyxiexzf.f6413Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0372Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public boolean mo1600Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        return false;
    }

    @Override // p000.InterfaceC0052Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo754Ujhhgtgfeyxiexzf(InterfaceC0049Ujhhgtgfeyxiexzf interfaceC0049Ujhhgtgfeyxiexzf) {
    }

    @Override // p000.InterfaceC0372Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo1599Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, boolean z) {
    }

    @Override // p000.InterfaceC0891feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public InterfaceC0901feyxiexzfUjhhgtg mo2369Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return interfaceC0901feyxiexzfUjhhgtg;
    }
}
