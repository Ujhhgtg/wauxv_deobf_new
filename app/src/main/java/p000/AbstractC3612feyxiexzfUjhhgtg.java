package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.umeng.analytics.pro.bc;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3612feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Object[] f11234Ujhhgtgfeyxiexzf = new Object[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int[] f11235Ujhhgtgfeyxiexzf = {R.attr.theme, me.hd.wauxv.R.attr.theme};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f11236Ujhhgtgfeyxiexzf = {me.hd.wauxv.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static volatile boolean f11237Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0122Ujhhgtgfeyxiexzf m5231Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        C0732Ujhhgtgfeyxiexzf c0732Ujhhgtgfeyxiexzf = AbstractC0728Ujhhgtgfeyxiexzf.f2996Ujhhgtgfeyxiexzf;
        C0134Ujhhgtgfeyxiexzf c0134Ujhhgtgfeyxiexzf = new C0134Ujhhgtgfeyxiexzf();
        C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf = c0732Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1284Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1295Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1285Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1293Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1286Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1294Ujhhgtgfeyxiexzf;
        String str = c0136Ujhhgtgfeyxiexzf.f1296Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1287Ujhhgtgfeyxiexzf = str;
        c0134Ujhhgtgfeyxiexzf.f1288Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1297Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1289Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1299Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1290Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1298Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1291Ujhhgtgfeyxiexzf = c0732Ujhhgtgfeyxiexzf.f2998Ujhhgtgfeyxiexzf;
        c0134Ujhhgtgfeyxiexzf.f1292Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf.f1300Ujhhgtgfeyxiexzf;
        interfaceC3549feyxiexzfUjhhgtg.invoke(c0134Ujhhgtgfeyxiexzf);
        if (c0134Ujhhgtgfeyxiexzf.f1286Ujhhgtgfeyxiexzf) {
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf2 = new C0136Ujhhgtgfeyxiexzf(c0134Ujhhgtgfeyxiexzf.f1285Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1286Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1284Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1287Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1288Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1290Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1289Ujhhgtgfeyxiexzf, c0134Ujhhgtgfeyxiexzf.f1292Ujhhgtgfeyxiexzf);
        C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = c0134Ujhhgtgfeyxiexzf.f1291Ujhhgtgfeyxiexzf;
        C0122Ujhhgtgfeyxiexzf c0122Ujhhgtgfeyxiexzf = new C0122Ujhhgtgfeyxiexzf(c0136Ujhhgtgfeyxiexzf2, c0420Ujhhgtgfeyxiexzf);
        C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0420Ujhhgtgfeyxiexzf, AbstractC1265feyxiexzfUjhhgtg.f4639Ujhhgtgfeyxiexzf);
        return c0122Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C3121Ujhhgtgfeyxiexzf m5232Ujhhgtgfeyxiexzf(InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        boolean z = true;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5174Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf.mo96Ujhhgtgfeyxiexzf(), interfaceC3739feyxiexzfUjhhgtg, true);
        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
        if (interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf != c3126Ujhhgtgfeyxiexzf && interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf) == null) {
            interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf.mo1764feyxiexzfUjhhgtg(c3126Ujhhgtgfeyxiexzf);
        }
        C3121Ujhhgtgfeyxiexzf c3121Ujhhgtgfeyxiexzf = new C3121Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf, z, 0);
        c3121Ujhhgtgfeyxiexzf.m4296feyxiexzfUjhhgtg(1, c3121Ujhhgtgfeyxiexzf, interfaceC3553feyxiexzfUjhhgtg);
        return c3121Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m5233Ujhhgtgfeyxiexzf(View view) {
        C1118feyxiexzfUjhhgtg c1118feyxiexzfUjhhgtg = new C1118feyxiexzfUjhhgtg();
        C2296Ujhhgtgfeyxiexzf c2296Ujhhgtgfeyxiexzf = new C2296Ujhhgtgfeyxiexzf(view, c1118feyxiexzfUjhhgtg);
        c2296Ujhhgtgfeyxiexzf.f7530Ujhhgtgfeyxiexzf = c1118feyxiexzfUjhhgtg;
        c1118feyxiexzfUjhhgtg.f4223Ujhhgtgfeyxiexzf = c2296Ujhhgtgfeyxiexzf;
        while (c1118feyxiexzfUjhhgtg.hasNext()) {
            View view2 = (View) c1118feyxiexzfUjhhgtg.next();
            C1444feyxiexzfUjhhgtg c1444feyxiexzfUjhhgtg = (C1444feyxiexzfUjhhgtg) view2.getTag(me.hd.wauxv.R.id.pooling_container_listener_holder_tag);
            if (c1444feyxiexzfUjhhgtg == null) {
                c1444feyxiexzfUjhhgtg = new C1444feyxiexzfUjhhgtg();
                view2.setTag(me.hd.wauxv.R.id.pooling_container_listener_holder_tag, c1444feyxiexzfUjhhgtg);
            }
            ArrayList arrayList = c1444feyxiexzfUjhhgtg.f5054Ujhhgtgfeyxiexzf;
            int iM4191Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(arrayList);
            if (-1 < iM4191Ujhhgtgfeyxiexzf) {
                arrayList.get(iM4191Ujhhgtgfeyxiexzf).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final float m5234Ujhhgtgfeyxiexzf(Number number, Context context) {
        return number.floatValue() * context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static String m5235Ujhhgtgfeyxiexzf(Float f) {
        return new DecimalFormat("0.00").format(f);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static Drawable m5236Ujhhgtgfeyxiexzf(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f11237Ujhhgtgfeyxiexzf) {
                return m5241Ujhhgtgfeyxiexzf(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f11237Ujhhgtgfeyxiexzf = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static String m5237Ujhhgtgfeyxiexzf() {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("mm");
        String str = "system_config_prefs";
        String str2 = "default_uin";
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        SharedPreferences sharedPreferences = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getSharedPreferences(str, 0);
        C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.class);
        String string = null;
        if (c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.equals(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class))) {
            Object string2 = sharedPreferences.getString(str2, null);
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            numValueOf = (Integer) string2;
        } else if (c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.equals(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE))) {
            numValueOf = Integer.valueOf(sharedPreferences.getInt(str2, 0));
        } else if (c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.equals(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.TYPE))) {
            numValueOf = (Integer) Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
        } else if (c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.equals(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Float.TYPE))) {
            numValueOf = (Integer) Float.valueOf(sharedPreferences.getFloat(str2, 0.0f));
        } else {
            if (!c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.equals(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Long.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            numValueOf = (Integer) Long.valueOf(sharedPreferences.getLong(str2, 0L));
        }
        sb.append(numValueOf.intValue());
        byte[] bytes = sb.toString().getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        "getBytes(...)";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.getDefault());
                "toUpperCase(...)";
                if (upperCase.length() < 2) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(upperCase);
            }
            string = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        "toLowerCase(...)";
        StringBuilder sb2 = new StringBuilder();
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        sb2.append(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getDataDir().getAbsolutePath());
        sb2.append("/MicroMsg/");
        sb2.append(lowerCase);
        sb2.append('/');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String m5238Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
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
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i4));
        }
        return sb.substring(1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean m5239Ujhhgtgfeyxiexzf(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static C3121Ujhhgtgfeyxiexzf m5240Ujhhgtgfeyxiexzf(InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        boolean z = true;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5174Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf.mo96Ujhhgtgfeyxiexzf(), interfaceC3739feyxiexzfUjhhgtg, true);
        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
        if (interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf != c3126Ujhhgtgfeyxiexzf && interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf) == null) {
            interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf.mo1764feyxiexzfUjhhgtg(c3126Ujhhgtgfeyxiexzf);
        }
        C3121Ujhhgtgfeyxiexzf c3121Ujhhgtgfeyxiexzf = new C3121Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf, z, 1);
        c3121Ujhhgtgfeyxiexzf.m4296feyxiexzfUjhhgtg(1, c3121Ujhhgtgfeyxiexzf, interfaceC3553feyxiexzfUjhhgtg);
        return c3121Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Drawable m5241Ujhhgtgfeyxiexzf(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C3703Ujhhgtgfeyxiexzf c3703Ujhhgtgfeyxiexzf = new C3703Ujhhgtgfeyxiexzf(context);
            c3703Ujhhgtgfeyxiexzf.f11742Ujhhgtgfeyxiexzf = theme;
            Configuration configuration = theme.getResources().getConfiguration();
            if (c3703Ujhhgtgfeyxiexzf.f11745Ujhhgtgfeyxiexzf != null) {
                throw new IllegalStateException("getResources() or getAssets() has already been called");
            }
            if (c3703Ujhhgtgfeyxiexzf.f11744Ujhhgtgfeyxiexzf != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            c3703Ujhhgtgfeyxiexzf.f11744Ujhhgtgfeyxiexzf = new Configuration(configuration);
            context = c3703Ujhhgtgfeyxiexzf;
        }
        return AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final void m5242Ujhhgtgfeyxiexzf(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static void m5243Ujhhgtgfeyxiexzf(String str, String str2, Object obj) {
        C2375Ujhhgtgfeyxiexzf.f7730Ujhhgtgfeyxiexzf.getClass();
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C2367Ujhhgtgfeyxiexzf.f7717Ujhhgtgfeyxiexzf).getDeclaringClass()).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1636Ujhhgtgfeyxiexzf(EnumC0283Ujhhgtgfeyxiexzf.STATIC);
        Class cls = Integer.TYPE;
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{"com.tencent.mm.opensdk.modelmsg.WXMediaMessage", AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class)}, 6, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1649Ujhhgtgfeyxiexzf(obj, str2, "", str, 2, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final Object[] m5244Ujhhgtgfeyxiexzf(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f11234Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Object[] m5245Ujhhgtgfeyxiexzf(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m5246Ujhhgtgfeyxiexzf(long j, String str, ZoneId zoneId, int i) {
        if ((i & 1) != 0) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return DateTimeFormatter.ofPattern(str).withZone(zoneId).format(Instant.ofEpochMilli(j));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C1916Ujhhgtgfeyxiexzf m5247Ujhhgtgfeyxiexzf(String str) {
        int i;
        AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C1916Ujhhgtgfeyxiexzf(i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final C1923feyxiexzfUjhhgtg m5248Ujhhgtgfeyxiexzf(String str) {
        AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j3 = j2 * j;
            long j4 = (((long) iDigit) & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j2 = j4;
        }
        return new C1923feyxiexzfUjhhgtg(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final Object m5249Ujhhgtgfeyxiexzf(AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg, AbstractC1181feyxiexzfUjhhgtg abstractC1181feyxiexzfUjhhgtg) throws Throwable {
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = abstractC1181feyxiexzfUjhhgtg.f11746Ujhhgtgfeyxiexzf;
        abstractC3740feyxiexzfUjhhgtg.getClass();
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg = interfaceC3739feyxiexzfUjhhgtg.mo1764feyxiexzfUjhhgtg(abstractC3740feyxiexzfUjhhgtg);
        AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg);
        if (interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg == interfaceC3739feyxiexzfUjhhgtg) {
            C1076feyxiexzfUjhhgtg c1076feyxiexzfUjhhgtg = new C1076feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg, abstractC1181feyxiexzfUjhhgtg);
            return AbstractC3593Ujhhgtgfeyxiexzf.m5164feyxiexzfUjhhgtg(c1076feyxiexzfUjhhgtg, c1076feyxiexzfUjhhgtg, interfaceC3553feyxiexzfUjhhgtg);
        }
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf;
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(c3382feyxiexzfUjhhgtg), interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(c3382feyxiexzfUjhhgtg))) {
            C1959feyxiexzfUjhhgtg c1959feyxiexzfUjhhgtg = new C1959feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg, abstractC1181feyxiexzfUjhhgtg);
            InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg2 = c1959feyxiexzfUjhhgtg.f9214Ujhhgtgfeyxiexzf;
            Object objM2759Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2759Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg2, null);
            try {
                return AbstractC3593Ujhhgtgfeyxiexzf.m5164feyxiexzfUjhhgtg(c1959feyxiexzfUjhhgtg, c1959feyxiexzfUjhhgtg, interfaceC3553feyxiexzfUjhhgtg);
            } finally {
                AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg2, objM2759Ujhhgtgfeyxiexzf);
            }
        }
        C3193feyxiexzfUjhhgtg c3193feyxiexzfUjhhgtg = new C3193feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg, abstractC1181feyxiexzfUjhhgtg);
        try {
            AbstractC1264feyxiexzfUjhhgtg.m2803Ujhhgtgfeyxiexzf(AbstractC2855feyxiexzfUjhhgtg.m4215feyxiexzfUjhhgtg(((AbstractC2483feyxiexzfUjhhgtg) interfaceC3553feyxiexzfUjhhgtg).mo1767Ujhhgtgfeyxiexzf(c3193feyxiexzfUjhhgtg, c3193feyxiexzfUjhhgtg)), C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3193feyxiexzfUjhhgtg.f9871Ujhhgtgfeyxiexzf;
            do {
                int i = atomicIntegerFieldUpdater.get(c3193feyxiexzfUjhhgtg);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objM4573feyxiexzfUjhhgtg = AbstractC3085Ujhhgtgfeyxiexzf.m4573feyxiexzfUjhhgtg(C0731Ujhhgtgfeyxiexzf.f3004Ujhhgtgfeyxiexzf.get(c3193feyxiexzfUjhhgtg));
                    if (objM4573feyxiexzfUjhhgtg instanceof C2874Ujhhgtgfeyxiexzf) {
                        throw ((C2874Ujhhgtgfeyxiexzf) objM4573feyxiexzfUjhhgtg).f9139Ujhhgtgfeyxiexzf;
                    }
                    return objM4573feyxiexzfUjhhgtg;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c3193feyxiexzfUjhhgtg, 0, 1));
            return EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            th = th;
            if (th instanceof C3198feyxiexzfUjhhgtg) {
                th = ((C3198feyxiexzfUjhhgtg) th).f9884Ujhhgtgfeyxiexzf;
            }
            c3193feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(new C0919feyxiexzfUjhhgtg(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static Context m5250Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11236Ujhhgtgfeyxiexzf, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C3703Ujhhgtgfeyxiexzf) && ((C3703Ujhhgtgfeyxiexzf) context).f11741Ujhhgtgfeyxiexzf == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C3703Ujhhgtgfeyxiexzf c3703Ujhhgtgfeyxiexzf = new C3703Ujhhgtgfeyxiexzf(context);
        c3703Ujhhgtgfeyxiexzf.f11741Ujhhgtgfeyxiexzf = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f11235Ujhhgtgfeyxiexzf);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c3703Ujhhgtgfeyxiexzf.getTheme().applyStyle(resourceId2, true);
        }
        return c3703Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public abstract void mo2436Ujhhgtgfeyxiexzf(C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg, float f, float f2);
}
