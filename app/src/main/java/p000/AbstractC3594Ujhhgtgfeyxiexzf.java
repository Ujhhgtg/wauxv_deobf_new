package p000;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.C0021Ujhhgtgfeyxiexzf;
import bsh.Primitive;
import com.umeng.analytics.pro.bv;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3594Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11184Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("list-item-type");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11185Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("bullet-list-item-level");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11186Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("ordered-list-item-number");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11187Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("heading-level");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11188Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("link-destination");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11189Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("paragraph-is-in-tight-list");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f11190Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("code-block-info");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final boolean[] f11191Ujhhgtgfeyxiexzf = new boolean[3];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static boolean f11192Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final long m5165Ujhhgtgfeyxiexzf(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC1264feyxiexzfUjhhgtg.m2795Ujhhgtgfeyxiexzf(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m5166Ujhhgtgfeyxiexzf(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m5167Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m5168Ujhhgtgfeyxiexzf(C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf, C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf) {
        c3655Ujhhgtgfeyxiexzf.f11579Ujhhgtgfeyxiexzf = -1;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.f11602feyxiexzfUjhhgtg;
        int[] iArr = c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf.f11601feyxiexzfUjhhgtg;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4 = c3655Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf5 = c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg;
        c3655Ujhhgtgfeyxiexzf.f11580Ujhhgtgfeyxiexzf = -1;
        int[] iArr2 = c3656Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c3641Ujhhgtgfeyxiexzf5.f11379Ujhhgtgfeyxiexzf;
            int iM5329Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf() - c3641Ujhhgtgfeyxiexzf4.f11379Ujhhgtgfeyxiexzf;
            c3641Ujhhgtgfeyxiexzf5.f11381Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf5);
            c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf4);
            c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf5.f11381Ujhhgtgfeyxiexzf, i);
            c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf, iM5329Ujhhgtgfeyxiexzf);
            c3655Ujhhgtgfeyxiexzf.f11579Ujhhgtgfeyxiexzf = 2;
            c3655Ujhhgtgfeyxiexzf.f11614feyxiexzfUjhhgtg = i;
            int i2 = iM5329Ujhhgtgfeyxiexzf - i;
            c3655Ujhhgtgfeyxiexzf.f11610feyxiexzfUjhhgtg = i2;
            int i3 = c3655Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg;
            if (i2 < i3) {
                c3655Ujhhgtgfeyxiexzf.f11610feyxiexzfUjhhgtg = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c3641Ujhhgtgfeyxiexzf3.f11379Ujhhgtgfeyxiexzf;
        int iM5326Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf() - c3641Ujhhgtgfeyxiexzf2.f11379Ujhhgtgfeyxiexzf;
        c3641Ujhhgtgfeyxiexzf3.f11381Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf3);
        c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2);
        c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf3.f11381Ujhhgtgfeyxiexzf, i4);
        c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, iM5326Ujhhgtgfeyxiexzf);
        if (c3655Ujhhgtgfeyxiexzf.f11616feyxiexzfUjhhgtg > 0 || c3655Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf == 8) {
            C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf);
            c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf = c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf;
            c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf.f11616feyxiexzfUjhhgtg + i4);
        }
        c3655Ujhhgtgfeyxiexzf.f11580Ujhhgtgfeyxiexzf = 2;
        c3655Ujhhgtgfeyxiexzf.f11615feyxiexzfUjhhgtg = i4;
        int i5 = iM5326Ujhhgtgfeyxiexzf - i4;
        c3655Ujhhgtgfeyxiexzf.f11611feyxiexzfUjhhgtg = i5;
        int i6 = c3655Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf;
        if (i5 < i6) {
            c3655Ujhhgtgfeyxiexzf.f11611feyxiexzfUjhhgtg = i6;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m5169Ujhhgtgfeyxiexzf(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static String m5170Ujhhgtgfeyxiexzf(Class cls) {
        if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(cls)) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0033Ujhhgtgfeyxiexzf.m526Ujhhgtgfeyxiexzf(cls).toString().substring(11));
            sb.append(cls.isInterface() ? " interface" : " class");
            sb.append(" ");
            sb.append(cls.getSimpleName());
            sb.append(cls.isInterface() ? "" : " extends ".concat(m5179Ujhhgtgfeyxiexzf(cls.getSuperclass())));
            sb.append(m5178Ujhhgtgfeyxiexzf(cls));
            sb.append(" {");
            return sb.toString().trim();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Modifier.toString(cls.getModifiers()));
        sb2.append(cls.isInterface() ? "" : " class");
        sb2.append(" ");
        sb2.append(cls.getSimpleName());
        sb2.append(cls.isInterface() ? "" : " extends ".concat(m5179Ujhhgtgfeyxiexzf(cls.getSuperclass())));
        sb2.append(m5178Ujhhgtgfeyxiexzf(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static Bitmap m5171Ujhhgtgfeyxiexzf(InputStream inputStream, BitmapFactory.Options options, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC1791feyxiexzfUjhhgtg.f6031Ujhhgtgfeyxiexzf.get()).booleanValue() : false) && m5181Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf)) {
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("", config == config2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (bitmapDecodeStream == null) {
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        options.inPreferredConfig = config2;
                        return null;
                    }
                    try {
                        Bitmap bitmapM5193feyxiexzfUjhhgtg = m5193feyxiexzfUjhhgtg(bitmapDecodeStream);
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapM5193feyxiexzfUjhhgtg;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapDecodeStream;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final long m5172Ujhhgtgfeyxiexzf(long j) {
        long j2 = (j << 1) + 1;
        C3246feyxiexzfUjhhgtg.f10184Ujhhgtgfeyxiexzf.getClass();
        int i = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
        return j2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final boolean m5173Ujhhgtgfeyxiexzf(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final InterfaceC3739feyxiexzfUjhhgtg m5174Ujhhgtgfeyxiexzf(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC3739feyxiexzfUjhhgtg.mo1763feyxiexzfUjhhgtg(bool, new C2432Ujhhgtgfeyxiexzf(6))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC3739feyxiexzfUjhhgtg2.mo1763feyxiexzfUjhhgtg(bool, new C2432Ujhhgtgfeyxiexzf(6))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC3739feyxiexzfUjhhgtg.mo1764feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg2);
        }
        C2432Ujhhgtgfeyxiexzf c2432Ujhhgtgfeyxiexzf = new C2432Ujhhgtgfeyxiexzf(4);
        C3303feyxiexzfUjhhgtg c3303feyxiexzfUjhhgtg = C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg3 = (InterfaceC3739feyxiexzfUjhhgtg) interfaceC3739feyxiexzfUjhhgtg.mo1763feyxiexzfUjhhgtg(c3303feyxiexzfUjhhgtg, c2432Ujhhgtgfeyxiexzf);
        Object objMo1763feyxiexzfUjhhgtg = interfaceC3739feyxiexzfUjhhgtg2;
        if (zBooleanValue2) {
            objMo1763feyxiexzfUjhhgtg = interfaceC3739feyxiexzfUjhhgtg2.mo1763feyxiexzfUjhhgtg(c3303feyxiexzfUjhhgtg, new C2432Ujhhgtgfeyxiexzf(5));
        }
        return interfaceC3739feyxiexzfUjhhgtg3.mo1764feyxiexzfUjhhgtg((InterfaceC3739feyxiexzfUjhhgtg) objMo1763feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static ArrayList m5175Ujhhgtgfeyxiexzf() throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM5194feyxiexzfUjhhgtg = m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11712Ujhhgtgfeyxiexzf});
        if (cursorM5194feyxiexzfUjhhgtg == null) {
            return arrayList;
        }
        while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
            try {
                FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                String wxid = friendInfoM1315Ujhhgtgfeyxiexzf.getWxid();
                Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6228Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
                MagicFactory.get(4928274324172834186L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(wxid, (String) objM4271feyxiexzfUjhhgtg)) {
                    arrayList.add(friendInfoM1315Ujhhgtgfeyxiexzf);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg, th);
                    throw th2;
                }
            }
        }
        cursorM5194feyxiexzfUjhhgtg.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ArrayList m5176Ujhhgtgfeyxiexzf() throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM5194feyxiexzfUjhhgtg = m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11711Ujhhgtgfeyxiexzf});
        if (cursorM5194feyxiexzfUjhhgtg == null) {
            return arrayList;
        }
        while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
            try {
                GroupInfo groupInfoM1316Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1316Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                if (groupInfoM1316Ujhhgtgfeyxiexzf.getGroupData().getMemberCount() > 0) {
                    arrayList.add(groupInfoM1316Ujhhgtgfeyxiexzf);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg, th);
                    throw th2;
                }
            }
        }
        cursorM5194feyxiexzfUjhhgtg.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static Activity m5177Ujhhgtgfeyxiexzf() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        try {
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = m5191feyxiexzfUjhhgtg(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf(MagicFactory.get(4928225395905398154L, strArr)));
            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928224455307560330L, strArr);
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = m5192feyxiexzfUjhhgtg(((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(new Object[0])).m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928224498257233290L, strArr);
            for (Object obj : ((Map) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).values()) {
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928224584156579210L, strArr);
                if (!((Boolean) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).booleanValue()) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928224691530761610L, strArr);
                    return (Activity) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                }
            }
            return null;
        } catch (Exception e) {
            ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
            C2290feyxiexzfUjhhgtg.m3495Ujhhgtgfeyxiexzf(MagicFactory.get(4928224652876055946L, strArr), e, 12);
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static String m5178Ujhhgtgfeyxiexzf(Class cls) {
        StringBuilder sb = new StringBuilder();
        if (cls.getInterfaces().length > 0) {
            sb.append(cls.isInterface() ? " extends " : " implements ");
            sb.append(String.join(", ", (List) Stream.of((Object[]) cls.getInterfaces()).map(new C1297feyxiexzfUjhhgtg(24)).collect(Collectors.toList())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String m5179Ujhhgtgfeyxiexzf(Class cls) {
        return cls == null ? "Object" : cls.getSimpleName();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m5180Ujhhgtgfeyxiexzf(C2774Ujhhgtgfeyxiexzf c2774Ujhhgtgfeyxiexzf, C2644feyxiexzfUjhhgtg c2644feyxiexzfUjhhgtg) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2774Ujhhgtgfeyxiexzf.f8771Ujhhgtgfeyxiexzf;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c2774Ujhhgtgfeyxiexzf);
            if (obj instanceof C3011Ujhhgtgfeyxiexzf) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c2774Ujhhgtgfeyxiexzf, obj, c2644feyxiexzfUjhhgtg)) {
                    if (atomicReferenceFieldUpdater.get(c2774Ujhhgtgfeyxiexzf) != obj) {
                    }
                }
                return;
            }
            Throwable th = null;
            if (obj instanceof C2644feyxiexzfUjhhgtg) {
                C2774Ujhhgtgfeyxiexzf.m4048Ujhhgtgfeyxiexzf(c2644feyxiexzfUjhhgtg, obj);
                throw null;
            }
            if (obj instanceof C2874Ujhhgtgfeyxiexzf) {
                C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = (C2874Ujhhgtgfeyxiexzf) obj;
                if (!C2874Ujhhgtgfeyxiexzf.f9138Ujhhgtgfeyxiexzf.compareAndSet(c2874Ujhhgtgfeyxiexzf, 0, 1)) {
                    C2774Ujhhgtgfeyxiexzf.m4048Ujhhgtgfeyxiexzf(c2644feyxiexzfUjhhgtg, obj);
                    throw null;
                }
                if (obj instanceof C2775Ujhhgtgfeyxiexzf) {
                    c2774Ujhhgtgfeyxiexzf.m4055Ujhhgtgfeyxiexzf(c2644feyxiexzfUjhhgtg, c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf);
                    return;
                }
                return;
            }
            if (!(obj instanceof C2892feyxiexzfUjhhgtg)) {
                C2892feyxiexzfUjhhgtg c2892feyxiexzfUjhhgtg = new C2892feyxiexzfUjhhgtg(obj, c2644feyxiexzfUjhhgtg, th, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(c2774Ujhhgtgfeyxiexzf, obj, c2892feyxiexzfUjhhgtg)) {
                    if (atomicReferenceFieldUpdater.get(c2774Ujhhgtgfeyxiexzf) != obj) {
                    }
                }
                return;
            }
            C2892feyxiexzfUjhhgtg c2892feyxiexzfUjhhgtg2 = (C2892feyxiexzfUjhhgtg) obj;
            if (c2892feyxiexzfUjhhgtg2.f9165Ujhhgtgfeyxiexzf != null) {
                C2774Ujhhgtgfeyxiexzf.m4048Ujhhgtgfeyxiexzf(c2644feyxiexzfUjhhgtg, obj);
                throw null;
            }
            Throwable th2 = c2892feyxiexzfUjhhgtg2.f9168Ujhhgtgfeyxiexzf;
            if (th2 != null) {
                c2774Ujhhgtgfeyxiexzf.m4055Ujhhgtgfeyxiexzf(c2644feyxiexzfUjhhgtg, th2);
                return;
            }
            C2892feyxiexzfUjhhgtg c2892feyxiexzfUjhhgtgM4276Ujhhgtgfeyxiexzf = C2892feyxiexzfUjhhgtg.m4276Ujhhgtgfeyxiexzf(c2892feyxiexzfUjhhgtg2, c2644feyxiexzfUjhhgtg, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(c2774Ujhhgtgfeyxiexzf, obj, c2892feyxiexzfUjhhgtgM4276Ujhhgtgfeyxiexzf)) {
                if (atomicReferenceFieldUpdater.get(c2774Ujhhgtgfeyxiexzf) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static boolean m5181Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        try {
            boolean zM3607Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3607Ujhhgtgfeyxiexzf();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM3607Ujhhgtgfeyxiexzf;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM3607Ujhhgtgfeyxiexzf);
            return zM3607Ujhhgtgfeyxiexzf;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m5182Ujhhgtgfeyxiexzf(InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg2) {
        C1784feyxiexzfUjhhgtg type = interfaceC1793feyxiexzfUjhhgtg.getType();
        C1784feyxiexzfUjhhgtg type2 = interfaceC1793feyxiexzfUjhhgtg2.getType();
        if (type.equals(type2)) {
            return true;
        }
        int i = type.f6018Ujhhgtgfeyxiexzf;
        int i2 = type2.f6018Ujhhgtgfeyxiexzf;
        if (i == 10) {
            type = C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg;
            i = 9;
        }
        if (i2 == 10) {
            type2 = C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg;
            i2 = 9;
        }
        if (i != 9 || i2 != 9) {
            return type.m3126Ujhhgtgfeyxiexzf() && type2.m3126Ujhhgtgfeyxiexzf();
        }
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5988Ujhhgtgfeyxiexzf;
        if (type == c1784feyxiexzfUjhhgtg) {
            return false;
        }
        if (type2 == c1784feyxiexzfUjhhgtg || type == C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg) {
            return true;
        }
        if (!type.m3123Ujhhgtgfeyxiexzf()) {
            return !type2.m3123Ujhhgtgfeyxiexzf() || type == C1784feyxiexzfUjhhgtg.f5996feyxiexzfUjhhgtg || type == C1784feyxiexzfUjhhgtg.f5991Ujhhgtgfeyxiexzf;
        }
        if (!type2.m3123Ujhhgtgfeyxiexzf()) {
            return false;
        }
        do {
            type = type.m3121Ujhhgtgfeyxiexzf();
            type2 = type2.m3121Ujhhgtgfeyxiexzf();
            if (!type.m3123Ujhhgtgfeyxiexzf()) {
                break;
            }
        } while (type2.m3123Ujhhgtgfeyxiexzf());
        return m5182Ujhhgtgfeyxiexzf(type, type2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static C1326feyxiexzfUjhhgtg m5183Ujhhgtgfeyxiexzf(C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg, C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg2) {
        InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = c1326feyxiexzfUjhhgtg.f4804Ujhhgtgfeyxiexzf;
        if (c1326feyxiexzfUjhhgtg != c1326feyxiexzfUjhhgtg2) {
            int length = interfaceC1793feyxiexzfUjhhgtgArr.length;
            if (c1326feyxiexzfUjhhgtg2.f4804Ujhhgtgfeyxiexzf.length != length) {
                throw new C1045feyxiexzfUjhhgtg("mismatched maxLocals values", null);
            }
            C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg3 = null;
            for (int i = 0; i < length; i++) {
                InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg = interfaceC1793feyxiexzfUjhhgtgArr[i];
                InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf = m5185Ujhhgtgfeyxiexzf(interfaceC1793feyxiexzfUjhhgtg, c1326feyxiexzfUjhhgtg2.f4804Ujhhgtgfeyxiexzf[i]);
                if (interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf != interfaceC1793feyxiexzfUjhhgtg) {
                    if (c1326feyxiexzfUjhhgtg3 == null) {
                        c1326feyxiexzfUjhhgtg3 = new C1326feyxiexzfUjhhgtg(interfaceC1793feyxiexzfUjhhgtgArr.length);
                        System.arraycopy(interfaceC1793feyxiexzfUjhhgtgArr, 0, c1326feyxiexzfUjhhgtg3.f4804Ujhhgtgfeyxiexzf, 0, interfaceC1793feyxiexzfUjhhgtgArr.length);
                    }
                    if (interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf == null) {
                        c1326feyxiexzfUjhhgtg3.m1729Ujhhgtgfeyxiexzf();
                        c1326feyxiexzfUjhhgtg3.f4804Ujhhgtgfeyxiexzf[i] = null;
                    } else {
                        c1326feyxiexzfUjhhgtg3.mo1401Ujhhgtgfeyxiexzf(i, interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf);
                    }
                }
            }
            if (c1326feyxiexzfUjhhgtg3 != null) {
                c1326feyxiexzfUjhhgtg3.f2247Ujhhgtgfeyxiexzf = false;
                return c1326feyxiexzfUjhhgtg3;
            }
        }
        return c1326feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static C3366feyxiexzfUjhhgtg m5184Ujhhgtgfeyxiexzf(C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg, C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg2) {
        if (c3366feyxiexzfUjhhgtg == c3366feyxiexzfUjhhgtg2) {
            return c3366feyxiexzfUjhhgtg;
        }
        int i = c3366feyxiexzfUjhhgtg.f10526Ujhhgtgfeyxiexzf;
        if (c3366feyxiexzfUjhhgtg2.f10526Ujhhgtgfeyxiexzf != i) {
            throw new C1045feyxiexzfUjhhgtg("mismatched stack depths", null);
        }
        C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf = null;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf = c3366feyxiexzfUjhhgtg.m4872Ujhhgtgfeyxiexzf(i2);
            InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf2 = c3366feyxiexzfUjhhgtg2.m4872Ujhhgtgfeyxiexzf(i2);
            InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf = m5185Ujhhgtgfeyxiexzf(interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf, interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf2);
            if (interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf != interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf) {
                if (c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf == null) {
                    c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf = c3366feyxiexzfUjhhgtg.m4871Ujhhgtgfeyxiexzf();
                }
                if (interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf == null) {
                    throw new C1045feyxiexzfUjhhgtg("incompatible: " + interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf + ", " + interfaceC1793feyxiexzfUjhhgtgM4872Ujhhgtgfeyxiexzf2, null);
                }
                try {
                    c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf.m4870Ujhhgtgfeyxiexzf(i2, interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf);
                } catch (C1045feyxiexzfUjhhgtg e) {
                    e.m4861Ujhhgtgfeyxiexzf("...while merging stack[" + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i2) + "]");
                    throw e;
                }
                e.m4861Ujhhgtgfeyxiexzf("...while merging stack[" + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i2) + "]");
                throw e;
            }
        }
        if (c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf == null) {
            return c3366feyxiexzfUjhhgtg;
        }
        c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        return c3366feyxiexzfUjhhgtgM4871Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static InterfaceC1793feyxiexzfUjhhgtg m5185Ujhhgtgfeyxiexzf(InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg2) {
        if (interfaceC1793feyxiexzfUjhhgtg == null || interfaceC1793feyxiexzfUjhhgtg.equals(interfaceC1793feyxiexzfUjhhgtg2)) {
            return interfaceC1793feyxiexzfUjhhgtg;
        }
        if (interfaceC1793feyxiexzfUjhhgtg2 == null) {
            return null;
        }
        C1784feyxiexzfUjhhgtg type = interfaceC1793feyxiexzfUjhhgtg.getType();
        C1784feyxiexzfUjhhgtg type2 = interfaceC1793feyxiexzfUjhhgtg2.getType();
        if (type == type2) {
            return type;
        }
        if (!type.m3127Ujhhgtgfeyxiexzf() || !type2.m3127Ujhhgtgfeyxiexzf()) {
            if (type.m3126Ujhhgtgfeyxiexzf() && type2.m3126Ujhhgtgfeyxiexzf()) {
                return C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf;
            }
            return null;
        }
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5988Ujhhgtgfeyxiexzf;
        if (type == c1784feyxiexzfUjhhgtg) {
            return type2;
        }
        if (type2 == c1784feyxiexzfUjhhgtg) {
            return type;
        }
        if (!type.m3123Ujhhgtgfeyxiexzf() || !type2.m3123Ujhhgtgfeyxiexzf()) {
            return C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg;
        }
        InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf = m5185Ujhhgtgfeyxiexzf(type.m3121Ujhhgtgfeyxiexzf(), type2.m3121Ujhhgtgfeyxiexzf());
        return interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf == null ? C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg : ((C1784feyxiexzfUjhhgtg) interfaceC1793feyxiexzfUjhhgtgM5185Ujhhgtgfeyxiexzf).m3118Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m5186Ujhhgtgfeyxiexzf(C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf) {
        String strSubstring = c0021Ujhhgtgfeyxiexzf.m309Ujhhgtgfeyxiexzf().toString().substring(11);
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(strSubstring, " ");
        sbM4805Ujhhgtgfeyxiexzf.append(m5179Ujhhgtgfeyxiexzf(c0021Ujhhgtgfeyxiexzf.mo314Ujhhgtgfeyxiexzf()));
        sbM4805Ujhhgtgfeyxiexzf.append(" ");
        sbM4805Ujhhgtgfeyxiexzf.append(m5188Ujhhgtgfeyxiexzf(c0021Ujhhgtgfeyxiexzf.m310Ujhhgtgfeyxiexzf(), (String[]) Stream.of((Object[]) c0021Ujhhgtgfeyxiexzf.mo313Ujhhgtgfeyxiexzf()).map(new C1297feyxiexzfUjhhgtg(24)).map(new C1292feyxiexzfUjhhgtg(5, Stream.of((Object[]) c0021Ujhhgtgfeyxiexzf.m312Ujhhgtgfeyxiexzf()).iterator())).toArray(new C2571Ujhhgtgfeyxiexzf(12))));
        sbM4805Ujhhgtgfeyxiexzf.append(strSubstring.contains("abstract") ? ";" : " {}");
        return sbM4805Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m5187Ujhhgtgfeyxiexzf(String str, Class[] clsArr) {
        return m5188Ujhhgtgfeyxiexzf(str, (String[]) Stream.of((Object[]) clsArr).map(new C1297feyxiexzfUjhhgtg(24)).toArray(new C2571Ujhhgtgfeyxiexzf(13)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m5188Ujhhgtgfeyxiexzf(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(strArr[i]);
        }
        sb.append(')');
        return sb.toString();
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static long m5189feyxiexzfUjhhgtg(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        char cCharAt;
        EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg;
        long jM5165Ujhhgtgfeyxiexzf;
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
        EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg2 = null;
        long jM5123Ujhhgtgfeyxiexzf = 0;
        long jRound = 0;
        while (i16 < str.length()) {
            char cCharAt7 = str.charAt(i16);
            if (cCharAt7 != 'T') {
                C0266Ujhhgtgfeyxiexzf c0266Ujhhgtgfeyxiexzf = C0266Ujhhgtgfeyxiexzf.f1651Ujhhgtgfeyxiexzf;
                if (c0266Ujhhgtgfeyxiexzf.f1653Ujhhgtgfeyxiexzf) {
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
                            long j3 = c0266Ujhhgtgfeyxiexzf.f1654Ujhhgtgfeyxiexzf;
                            if (j2 > j3 || (j2 == j3 && i17 > c0266Ujhhgtgfeyxiexzf.f1655Ujhhgtgfeyxiexzf)) {
                                while (i3 < str.length() && '0' <= (cCharAt5 = str.charAt(i3)) && cCharAt5 < ':') {
                                    i3++;
                                }
                                if (i3 != str.length()) {
                                    if (i3 != i5 + ((cCharAt7 == '+' || cCharAt7 == '-') ? 1 : 0)) {
                                        j = c0266Ujhhgtgfeyxiexzf.f1652Ujhhgtgfeyxiexzf;
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
                                    EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg3 = EnumC3244feyxiexzfUjhhgtg.SECONDS;
                                    double d2 = j4;
                                    switch (enumC3244feyxiexzfUjhhgtg3.ordinal()) {
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
                                            throw new IllegalStateException(("Unknown unit: " + enumC3244feyxiexzfUjhhgtg3).toString());
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
                            enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.DAYS;
                        } else if (cCharAt != 'H') {
                            enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.HOURS;
                        } else if (cCharAt != 'M') {
                            enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.MINUTES;
                        } else if (cCharAt != 'S') {
                            enumC3244feyxiexzfUjhhgtg = null;
                        } else {
                            enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.SECONDS;
                        }
                        if (enumC3244feyxiexzfUjhhgtg != null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (enumC3244feyxiexzfUjhhgtg2 == null && enumC3244feyxiexzfUjhhgtg2.compareTo(enumC3244feyxiexzfUjhhgtg) <= 0) {
                            throw new IllegalArgumentException("Unexpected order of duration components");
                        }
                        if (enumC3244feyxiexzfUjhhgtg == EnumC3244feyxiexzfUjhhgtg.DAYS) {
                            if (!z) {
                                throw new IllegalArgumentException("");
                            }
                            jM5123Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5123Ujhhgtgfeyxiexzf(j, enumC3244feyxiexzfUjhhgtg) * ((long) i4);
                        } else {
                            if (z) {
                                throw new IllegalArgumentException("");
                            }
                            jM5165Ujhhgtgfeyxiexzf = m5165Ujhhgtgfeyxiexzf(jM5123Ujhhgtgfeyxiexzf, AbstractC3590Ujhhgtgfeyxiexzf.m5123Ujhhgtgfeyxiexzf(j, enumC3244feyxiexzfUjhhgtg) * ((long) i4));
                            if (jM5165Ujhhgtgfeyxiexzf != 9223372036854759646L) {
                                throw new IllegalArgumentException("");
                            }
                            jM5123Ujhhgtgfeyxiexzf = jM5165Ujhhgtgfeyxiexzf;
                        }
                        EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg4 = enumC3244feyxiexzfUjhhgtg;
                        i16 = i3 + 1;
                        enumC3244feyxiexzfUjhhgtg2 = enumC3244feyxiexzfUjhhgtg4;
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
                                enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.DAYS;
                            } else if (cCharAt != 'H') {
                                enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.HOURS;
                            } else if (cCharAt != 'M') {
                                enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.MINUTES;
                            } else if (cCharAt != 'S') {
                                enumC3244feyxiexzfUjhhgtg = null;
                            } else {
                                enumC3244feyxiexzfUjhhgtg = EnumC3244feyxiexzfUjhhgtg.SECONDS;
                            }
                            if (enumC3244feyxiexzfUjhhgtg != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC3244feyxiexzfUjhhgtg2 == null) {
                            }
                            if (enumC3244feyxiexzfUjhhgtg == EnumC3244feyxiexzfUjhhgtg.DAYS) {
                                if (!z) {
                                    throw new IllegalArgumentException("");
                                }
                                jM5123Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5123Ujhhgtgfeyxiexzf(j, enumC3244feyxiexzfUjhhgtg) * ((long) i4);
                            } else {
                                if (z) {
                                    throw new IllegalArgumentException("");
                                }
                                jM5165Ujhhgtgfeyxiexzf = m5165Ujhhgtgfeyxiexzf(jM5123Ujhhgtgfeyxiexzf, AbstractC3590Ujhhgtgfeyxiexzf.m5123Ujhhgtgfeyxiexzf(j, enumC3244feyxiexzfUjhhgtg) * ((long) i4));
                                if (jM5165Ujhhgtgfeyxiexzf != 9223372036854759646L) {
                                    throw new IllegalArgumentException("");
                                }
                                jM5123Ujhhgtgfeyxiexzf = jM5165Ujhhgtgfeyxiexzf;
                            }
                            EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg5 = enumC3244feyxiexzfUjhhgtg;
                            i16 = i3 + 1;
                            enumC3244feyxiexzfUjhhgtg2 = enumC3244feyxiexzfUjhhgtg5;
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
        long jM4751Ujhhgtgfeyxiexzf = C3246feyxiexzfUjhhgtg.m4751Ujhhgtgfeyxiexzf(m5195feyxiexzfUjhhgtg(jM5123Ujhhgtgfeyxiexzf, EnumC3244feyxiexzfUjhhgtg.MILLISECONDS), m5195feyxiexzfUjhhgtg(jRound, EnumC3244feyxiexzfUjhhgtg.NANOSECONDS));
        if (i18 == 0 || jM4751Ujhhgtgfeyxiexzf == C3246feyxiexzfUjhhgtg.f10187Ujhhgtgfeyxiexzf) {
            return jM4751Ujhhgtgfeyxiexzf;
        }
        long j6 = ((-(jM4751Ujhhgtgfeyxiexzf >> 1)) << 1) + ((long) (((int) jM4751Ujhhgtgfeyxiexzf) & 1));
        int i19 = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
        return j6;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C0709Ujhhgtgfeyxiexzf m5190feyxiexzfUjhhgtg(InterfaceC0144Ujhhgtgfeyxiexzf interfaceC0144Ujhhgtgfeyxiexzf) {
        return new C0709Ujhhgtgfeyxiexzf(C3339feyxiexzfUjhhgtg.m4848Ujhhgtgfeyxiexzf(15, ((InterfaceC2808Ujhhgtgfeyxiexzf) interfaceC0144Ujhhgtgfeyxiexzf).mo2998Ujhhgtgfeyxiexzf(), null));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C0709Ujhhgtgfeyxiexzf m5191feyxiexzfUjhhgtg(Class cls) {
        return new C0709Ujhhgtgfeyxiexzf(C3339feyxiexzfUjhhgtg.m4848Ujhhgtgfeyxiexzf(15, cls, null));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C0709Ujhhgtgfeyxiexzf m5192feyxiexzfUjhhgtg(Object obj) {
        if (obj instanceof InterfaceC0144Ujhhgtgfeyxiexzf) {
            return new C0709Ujhhgtgfeyxiexzf(C3339feyxiexzfUjhhgtg.m4848Ujhhgtgfeyxiexzf(14, ((InterfaceC2808Ujhhgtgfeyxiexzf) ((InterfaceC0144Ujhhgtgfeyxiexzf) obj)).mo2998Ujhhgtgfeyxiexzf(), obj));
        }
        return obj instanceof Class ? new C0709Ujhhgtgfeyxiexzf(C3339feyxiexzfUjhhgtg.m4848Ujhhgtgfeyxiexzf(14, (Class) obj, obj)) : new C0709Ujhhgtgfeyxiexzf(C3339feyxiexzfUjhhgtg.m4848Ujhhgtgfeyxiexzf(14, obj.getClass(), obj));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Bitmap m5193feyxiexzfUjhhgtg(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC3610feyxiexzfUjhhgtg.f11227Ujhhgtgfeyxiexzf;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC3610feyxiexzfUjhhgtg.f11227Ujhhgtgfeyxiexzf);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM3813Ujhhgtgfeyxiexzf = AbstractC2568Ujhhgtgfeyxiexzf.m3813Ujhhgtgfeyxiexzf(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM3813Ujhhgtgfeyxiexzf.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM3813Ujhhgtgfeyxiexzf.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM3813Ujhhgtgfeyxiexzf.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM3813Ujhhgtgfeyxiexzf.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM3813Ujhhgtgfeyxiexzf.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM3813Ujhhgtgfeyxiexzf.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM3813Ujhhgtgfeyxiexzf.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM3813Ujhhgtgfeyxiexzf;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static Cursor m5194feyxiexzfUjhhgtg(EnumC3684feyxiexzfUjhhgtg[] enumC3684feyxiexzfUjhhgtgArr) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (enumC3684feyxiexzfUjhhgtgArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MagicFactory.get(4928226237718988170L, strArr));
        int length = enumC3684feyxiexzfUjhhgtgArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            EnumC3684feyxiexzfUjhhgtg enumC3684feyxiexzfUjhhgtg = enumC3684feyxiexzfUjhhgtgArr[i];
            int i3 = i2 + 1;
            String[] strArr2 = enumC3684feyxiexzfUjhhgtg.f11715Ujhhgtgfeyxiexzf;
            int length2 = strArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = i5 + 1;
                sb.append(strArr2[i4]);
                if (i5 != enumC3684feyxiexzfUjhhgtg.f11715Ujhhgtgfeyxiexzf.length - 1) {
                    sb.append(MagicFactory.get(4928225692258141578L, strArr));
                }
                i4++;
                i5 = i6;
            }
            if (i2 != enumC3684feyxiexzfUjhhgtgArr.length - 1) {
                sb.append(MagicFactory.get(4928225666488337802L, strArr));
            }
            if (i2 == enumC3684feyxiexzfUjhhgtgArr.length - 1) {
                sb.append(MagicFactory.get(4928225782452454794L, strArr));
            }
            i++;
            i2 = i3;
        }
        sb.append(MagicFactory.get(4928225773862520202L, strArr));
        return C3382feyxiexzfUjhhgtg.m4894Ujhhgtgfeyxiexzf(sb.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static final long m5195feyxiexzfUjhhgtg(long j, EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg) {
        EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg2 = EnumC3244feyxiexzfUjhhgtg.NANOSECONDS;
        TimeUnit timeUnit = enumC3244feyxiexzfUjhhgtg.f10169Ujhhgtgfeyxiexzf;
        TimeUnit timeUnit2 = enumC3244feyxiexzfUjhhgtg.f10169Ujhhgtgfeyxiexzf;
        long jConvert = timeUnit.convert(4611686018426999999L, enumC3244feyxiexzfUjhhgtg2.f10169Ujhhgtgfeyxiexzf);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = enumC3244feyxiexzfUjhhgtg2.f10169Ujhhgtgfeyxiexzf.convert(j, timeUnit2);
            C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = C3246feyxiexzfUjhhgtg.f10184Ujhhgtgfeyxiexzf;
            long j2 = jConvert2 << 1;
            int i = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
            return j2;
        }
        EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg3 = EnumC3244feyxiexzfUjhhgtg.MILLISECONDS;
        if (enumC3244feyxiexzfUjhhgtg.compareTo(enumC3244feyxiexzfUjhhgtg3) < 0) {
            return m5172Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2795Ujhhgtgfeyxiexzf(enumC3244feyxiexzfUjhhgtg3.f10169Ujhhgtgfeyxiexzf.convert(j, timeUnit2)));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m5172Ujhhgtgfeyxiexzf(AbstractC3590Ujhhgtgfeyxiexzf.m5123Ujhhgtgfeyxiexzf(Math.abs(j), enumC3244feyxiexzfUjhhgtg) * jSignum);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008 A[PHI: r0
      0x0008: PHI (r0v9 java.lang.Class) = (r0v0 java.lang.Class), (r0v2 java.lang.Class), (r0v3 java.lang.Class), (r0v4 java.lang.Class), (r0v1 java.lang.Class) binds: [B:3:0x0006, B:11:0x0022, B:14:0x002b, B:17:0x0034, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static String m5196feyxiexzfUjhhgtg(Class cls) {
        Class cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            cls = cls2;
        } else {
            cls2 = List.class;
            if (!cls2.isAssignableFrom(cls)) {
                cls2 = Deque.class;
                if (cls2.isAssignableFrom(cls)) {
                    cls = cls2;
                } else {
                    cls2 = Set.class;
                    if (cls2.isAssignableFrom(cls)) {
                        cls = cls2;
                    } else {
                        cls2 = Map.Entry.class;
                        if (cls2.isAssignableFrom(cls)) {
                            cls = cls2;
                        }
                    }
                }
            } else if (Queue.class.isAssignableFrom(cls)) {
                cls = Queue.class;
            } else {
                cls = cls2;
            }
        }
        if (!cls.isArray()) {
            return cls.getName().startsWith("java") ? cls.getSimpleName() : cls.getName();
        }
        return m5196feyxiexzfUjhhgtg(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static String m5197feyxiexzfUjhhgtg(Object obj) {
        if (obj == null || Primitive.NULL == obj) {
            return "null";
        }
        return obj instanceof Primitive ? ((Primitive) obj).getType().getSimpleName() : m5196feyxiexzfUjhhgtg(AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(obj, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [上海高中ᛱ谢子非ᛱ要点脸能不能ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final C1959feyxiexzfUjhhgtg m5198feyxiexzfUjhhgtg(AbstractC3705feyxiexzfUjhhgtg abstractC3705feyxiexzfUjhhgtg, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Object obj) {
        C1959feyxiexzfUjhhgtg c1959feyxiexzfUjhhgtg = null;
        if (abstractC3705feyxiexzfUjhhgtg != 0 && interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(C1960Ujhhgtgfeyxiexzf.f6436Ujhhgtgfeyxiexzf) != null) {
            while (!(abstractC3705feyxiexzfUjhhgtg instanceof C3193feyxiexzfUjhhgtg) && (abstractC3705feyxiexzfUjhhgtg = abstractC3705feyxiexzfUjhhgtg.mo2553Ujhhgtgfeyxiexzf()) != 0) {
                if (abstractC3705feyxiexzfUjhhgtg instanceof C1959feyxiexzfUjhhgtg) {
                    c1959feyxiexzfUjhhgtg = (C1959feyxiexzfUjhhgtg) abstractC3705feyxiexzfUjhhgtg;
                    break;
                }
            }
            if (c1959feyxiexzfUjhhgtg != null) {
                c1959feyxiexzfUjhhgtg.m3297feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, obj);
            }
        }
        return c1959feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static String m5199feyxiexzfUjhhgtg(Object obj) {
        StringBuilder sb = new StringBuilder("" + obj);
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb2 = new StringBuilder("{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                sb2.append(m5199feyxiexzfUjhhgtg(Array.get(obj, i)));
                sb2.append(", ");
            }
            if (sb2.reverse().charAt(0) == ' ') {
                sb2.delete(0, 2);
            }
            StringBuilder sbReverse = sb2.reverse();
            sbReverse.append("}");
            return sbReverse.toString();
        }
        if (obj instanceof Collection) {
            StringBuilder sb3 = new StringBuilder("[");
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                sb3.append(m5199feyxiexzfUjhhgtg(it.next()));
                sb3.append(", ");
            }
            if (sb3.reverse().charAt(0) == ' ') {
                sb3.delete(0, 2);
            }
            StringBuilder sbReverse2 = sb3.reverse();
            sbReverse2.append("]");
            return sbReverse2.toString();
        }
        if (obj instanceof Map) {
            StringBuilder sb4 = new StringBuilder("{");
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                sb4.append(m5199feyxiexzfUjhhgtg(entry.getKey()));
                sb4.append("=");
                sb4.append(m5199feyxiexzfUjhhgtg(entry.getValue()));
                sb4.append(", ");
            }
            if (sb4.reverse().charAt(0) == ' ') {
                sb4.delete(0, 2);
            }
            StringBuilder sbReverse3 = sb4.reverse();
            sbReverse3.append("}");
            return sbReverse3.toString();
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            return m5199feyxiexzfUjhhgtg(entry2.getKey()) + "=" + m5199feyxiexzfUjhhgtg(entry2.getValue());
        }
        if (obj instanceof String) {
            StringBuilder sbInsert = sb.insert(0, "\"");
            sbInsert.append("\"");
            return sbInsert.toString();
        }
        if (Primitive.unwrap(obj) instanceof Character) {
            StringBuilder sbInsert2 = sb.insert(0, "'");
            sbInsert2.append("'");
            return sbInsert2.toString();
        }
        if (Primitive.unwrap(obj) instanceof Number) {
            if (Primitive.unwrap(obj) instanceof Byte) {
                sb.append("o");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Short) {
                sb.append(bv.aB);
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Integer) {
                sb.append("I");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Long) {
                sb.append("L");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigInteger) {
                sb.append("W");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Float) {
                sb.append("f");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Double) {
                sb.append("d");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigDecimal) {
                sb.append("w");
                return sb.toString();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static String m5200feyxiexzfUjhhgtg(C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1853Ujhhgtgfeyxiexzf.m3186Ujhhgtgfeyxiexzf().toString().substring(11));
        sb.append(" ");
        sb.append(m5179Ujhhgtgfeyxiexzf(c1853Ujhhgtgfeyxiexzf.f6221Ujhhgtgfeyxiexzf));
        sb.append(" ");
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, c1853Ujhhgtgfeyxiexzf.f6220Ujhhgtgfeyxiexzf, ";");
    }
}
