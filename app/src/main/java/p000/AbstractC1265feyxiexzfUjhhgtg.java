package p000;

import android.animation.TimeInterpolator;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import de.robv.android.xposed.XposedBridge;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ要点脸ᛴᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1265feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3219feyxiexzfUjhhgtg f4638Ujhhgtgfeyxiexzf = new C3219feyxiexzfUjhhgtg(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0420Ujhhgtgfeyxiexzf f4639Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(14);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m2820Ujhhgtgfeyxiexzf(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final void m2821Ujhhgtgfeyxiexzf(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C2511feyxiexzfUjhhgtg m2822Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC1767feyxiexzfUjhhgtg.f5941Ujhhgtgfeyxiexzf;
                    lock.lock();
                    Bitmap bitmapMo1474Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg.mo1474Ujhhgtgfeyxiexzf(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo1474Ujhhgtgfeyxiexzf);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo1474Ujhhgtgfeyxiexzf;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC2512feyxiexzfUjhhgtg = f4638Ujhhgtgfeyxiexzf;
        }
        return C2511feyxiexzfUjhhgtg.m3790Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, bitmap);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static int m2823Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        boolean zBooleanValue = false;
        int i = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf[0];
        if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c0919feyxiexzfUjhhgtg = Boolean.TRUE;
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
            if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                c0919feyxiexzfUjhhgtg = null;
            }
            Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        if (iM2713feyxiexzfUjhhgtg != 0) {
            if (iM2713feyxiexzfUjhhgtg == 1) {
                return -1;
            }
            throw new C2870Ujhhgtgfeyxiexzf();
        }
        try {
            c0919feyxiexzfUjhhgtg2 = Integer.valueOf(XposedBridge.getXposedVersion());
        } catch (Throwable th2) {
            c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
        }
        Integer num = (Integer) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Drawable m2824Ujhhgtgfeyxiexzf(Context context, int i) {
        return C0883feyxiexzfUjhhgtg.m2355Ujhhgtgfeyxiexzf().m2358Ujhhgtgfeyxiexzf(context, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static Set m2825Ujhhgtgfeyxiexzf() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static float m2826Ujhhgtgfeyxiexzf(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static String m2827Ujhhgtgfeyxiexzf(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        String strM2820Ujhhgtgfeyxiexzf = m2820Ujhhgtgfeyxiexzf(messageDigest.digest());
                        fileInputStream.close();
                        return strM2820Ujhhgtgfeyxiexzf;
                    }
                    messageDigest.update(bArr, 0, i);
                    System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String m2828Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        String str;
        String string;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        boolean zBooleanValue = false;
        int i = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf[0];
        if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c0919feyxiexzfUjhhgtg = Boolean.TRUE;
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
            if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                c0919feyxiexzfUjhhgtg = null;
            }
            Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        Object c0919feyxiexzfUjhhgtg2 = "unknown";
        if (iM2713feyxiexzfUjhhgtg != 0) {
            if (iM2713feyxiexzfUjhhgtg == 1) {
                return "unknown";
            }
            throw new C2870Ujhhgtgfeyxiexzf();
        }
        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
        Application applicationM3616Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3616Ujhhgtgfeyxiexzf();
        if (applicationM3616Ujhhgtgfeyxiexzf != null && (classLoader2 = applicationM3616Ujhhgtgfeyxiexzf.getClassLoader()) != null && AbstractC2842feyxiexzfUjhhgtg.m4171Ujhhgtgfeyxiexzf(classLoader2, "me.weishu.exposed.ExposedBridge")) {
            return "TaiChi";
        }
        Application applicationM3616Ujhhgtgfeyxiexzf2 = C2374Ujhhgtgfeyxiexzf.m3616Ujhhgtgfeyxiexzf();
        if (applicationM3616Ujhhgtgfeyxiexzf2 != null && (classLoader = applicationM3616Ujhhgtgfeyxiexzf2.getClassLoader()) != null && AbstractC2842feyxiexzfUjhhgtg.m4171Ujhhgtgfeyxiexzf(classLoader, "com.bug.load.BugLoad")) {
            return "BugXposed";
        }
        try {
            int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(XposedBridge.class));
            c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "TAG";
            AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1481Ujhhgtgfeyxiexzf, (EnumC0283Ujhhgtgfeyxiexzf[]) Arrays.copyOf(new EnumC0283Ujhhgtgfeyxiexzf[]{EnumC0283Ujhhgtgfeyxiexzf.STATIC}, 1));
            C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf());
            if (c3438feyxiexzfUjhhgtg != null && (str = (String) c3438feyxiexzfUjhhgtg.m4939Ujhhgtgfeyxiexzf()) != null) {
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
                    str = null;
                }
                if (str != null && (string = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(str, "Bridge", ""), "-", "")).toString()) != null) {
                    c0919feyxiexzfUjhhgtg2 = string;
                }
            }
        } catch (Throwable th2) {
            c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
        }
        String str2 = (String) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
        return str2 == null ? "invalid" : str2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C1447feyxiexzfUjhhgtg m2829Ujhhgtgfeyxiexzf(C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C1447feyxiexzfUjhhgtg(AbstractC3223feyxiexzfUjhhgtg.m4727Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf));
        }
        TextPaint textPaint = new TextPaint(c2384Ujhhgtgfeyxiexzf.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c2384Ujhhgtgfeyxiexzf.getBreakStrategy();
        int hyphenationFrequency = c2384Ujhhgtgfeyxiexzf.getHyphenationFrequency();
        if (c2384Ujhhgtgfeyxiexzf.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c2384Ujhhgtgfeyxiexzf.getInputType() & 15) != 3) {
            boolean z = c2384Ujhhgtgfeyxiexzf.getLayoutDirection() == 1;
            switch (c2384Ujhhgtgfeyxiexzf.getTextDirection()) {
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
            byte directionality = Character.getDirectionality(AbstractC3223feyxiexzfUjhhgtg.m4721Ujhhgtgfeyxiexzf(DecimalFormatSymbols.getInstance(c2384Ujhhgtgfeyxiexzf.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C1447feyxiexzfUjhhgtg(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final boolean m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg enumC2264feyxiexzfUjhhgtg) {
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        return C0580Ujhhgtgfeyxiexzf.m1857Ujhhgtgfeyxiexzf() >= enumC2264feyxiexzfUjhhgtg.f7390Ujhhgtgfeyxiexzf && !C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf enumC2263Ujhhgtgfeyxiexzf) {
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        return C0580Ujhhgtgfeyxiexzf.m1857Ujhhgtgfeyxiexzf() >= enumC2263Ujhhgtgfeyxiexzf.f7369Ujhhgtgfeyxiexzf && C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static boolean m2832Ujhhgtgfeyxiexzf(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static int m2833Ujhhgtgfeyxiexzf(Context context, int i, int i2) {
        TypedValue typedValueM4524Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4524Ujhhgtgfeyxiexzf(context, i);
        return (typedValueM4524Ujhhgtgfeyxiexzf == null || typedValueM4524Ujhhgtgfeyxiexzf.type != 16) ? i2 : typedValueM4524Ujhhgtgfeyxiexzf.data;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static TimeInterpolator m2834Ujhhgtgfeyxiexzf(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m2832Ujhhgtgfeyxiexzf(strValueOf, "cubic-bezier") && !m2832Ujhhgtgfeyxiexzf(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m2832Ujhhgtgfeyxiexzf(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(m2826Ujhhgtgfeyxiexzf(strArrSplit, 0), m2826Ujhhgtgfeyxiexzf(strArrSplit, 1), m2826Ujhhgtgfeyxiexzf(strArrSplit, 2), m2826Ujhhgtgfeyxiexzf(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m2832Ujhhgtgfeyxiexzf(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strM2699Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 5, strValueOf);
        Path path = new Path();
        try {
            C1386feyxiexzfUjhhgtg.m2876Ujhhgtgfeyxiexzf(AbstractC2855feyxiexzfUjhhgtg.m4202feyxiexzfUjhhgtg(strM2699Ujhhgtgfeyxiexzf), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(strM2699Ujhhgtgfeyxiexzf), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m2835Ujhhgtgfeyxiexzf(TextView textView, int i) {
        AbstractC3594Ujhhgtgfeyxiexzf.m5167Ujhhgtgfeyxiexzf(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC3223feyxiexzfUjhhgtg.m4728Ujhhgtgfeyxiexzf(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m2836Ujhhgtgfeyxiexzf(TextView textView, int i) {
        AbstractC3594Ujhhgtgfeyxiexzf.m5167Ujhhgtgfeyxiexzf(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m2837Ujhhgtgfeyxiexzf(TextView textView, int i) {
        AbstractC3594Ujhhgtgfeyxiexzf.m5167Ujhhgtgfeyxiexzf(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static String m2838Ujhhgtgfeyxiexzf(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static Class m2839Ujhhgtgfeyxiexzf(String str) {
        Object c0919feyxiexzfUjhhgtg;
        String str2 = "[" + str + "][" + ((Object) null) + "]";
        LinkedHashMap linkedHashMap = AbstractC0954feyxiexzfUjhhgtg.f3822Ujhhgtgfeyxiexzf;
        Class cls = (Class) linkedHashMap.get(str2);
        if (cls != null) {
            return cls;
        }
        try {
            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
            c0919feyxiexzfUjhhgtg = Class.forName(str, false, C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf());
            linkedHashMap.put(str2, c0919feyxiexzfUjhhgtg);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Class cls2 = (Class) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
        if (cls2 != null) {
            return cls2;
        }
        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
        ClassLoader classLoaderM3615Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf();
        String[] strArr = {AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("name:[", str, "]")};
        String str3 = "";
        String strM2703Ujhhgtgfeyxiexzf = "";
        int i = 0;
        while (true) {
            strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, " ");
            if (i == 30) {
                break;
            }
            i++;
        }
        String strM2703Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, " -> ");
        String str4 = strArr[0];
        if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str4)) {
            str3 = "" + strM2703Ujhhgtgfeyxiexzf2 + str4 + "\n";
        }
        throw new NoClassDefFoundError("Can't find this Class in [" + classLoaderM3615Ujhhgtgfeyxiexzf + "]:\n" + ((Object) str3) + "Generated by YukiHookAPI#ReflectionTool");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final Class m2840Ujhhgtgfeyxiexzf(Class cls) {
        boolean zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, C1943Ujhhgtgfeyxiexzf.class);
        Class cls2 = Void.TYPE;
        if (!zM4512Ujhhgtgfeyxiexzf && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Void.class)) {
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls2 == null ? m2839Ujhhgtgfeyxiexzf("void") : cls2)) {
                boolean zM4512Ujhhgtgfeyxiexzf2 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Boolean.class);
                Class cls3 = Boolean.TYPE;
                if (!zM4512Ujhhgtgfeyxiexzf2) {
                    if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls3 == null ? m2839Ujhhgtgfeyxiexzf("boolean") : cls3)) {
                        boolean zM4512Ujhhgtgfeyxiexzf3 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Integer.class);
                        Class cls4 = Integer.TYPE;
                        if (!zM4512Ujhhgtgfeyxiexzf3) {
                            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls4 == null ? m2839Ujhhgtgfeyxiexzf("int") : cls4)) {
                                boolean zM4512Ujhhgtgfeyxiexzf4 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Float.class);
                                Class cls5 = Float.TYPE;
                                if (!zM4512Ujhhgtgfeyxiexzf4) {
                                    if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls5 == null ? m2839Ujhhgtgfeyxiexzf("float") : cls5)) {
                                        boolean zM4512Ujhhgtgfeyxiexzf5 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Double.class);
                                        Class cls6 = Double.TYPE;
                                        if (!zM4512Ujhhgtgfeyxiexzf5) {
                                            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls6 == null ? m2839Ujhhgtgfeyxiexzf("double") : cls6)) {
                                                boolean zM4512Ujhhgtgfeyxiexzf6 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Long.class);
                                                Class cls7 = Long.TYPE;
                                                if (!zM4512Ujhhgtgfeyxiexzf6) {
                                                    if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls7 == null ? m2839Ujhhgtgfeyxiexzf("long") : cls7)) {
                                                        boolean zM4512Ujhhgtgfeyxiexzf7 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Short.class);
                                                        Class cls8 = Short.TYPE;
                                                        if (!zM4512Ujhhgtgfeyxiexzf7) {
                                                            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls8 == null ? m2839Ujhhgtgfeyxiexzf("short") : cls8)) {
                                                                boolean zM4512Ujhhgtgfeyxiexzf8 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Character.class);
                                                                Class cls9 = Character.TYPE;
                                                                if (!zM4512Ujhhgtgfeyxiexzf8) {
                                                                    if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls9 == null ? m2839Ujhhgtgfeyxiexzf("char") : cls9)) {
                                                                        boolean zM4512Ujhhgtgfeyxiexzf9 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, Byte.class);
                                                                        Class cls10 = Byte.TYPE;
                                                                        if (!zM4512Ujhhgtgfeyxiexzf9) {
                                                                            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls, cls10 == null ? m2839Ujhhgtgfeyxiexzf("byte") : cls10)) {
                                                                                return cls;
                                                                            }
                                                                        }
                                                                        return cls10 == null ? m2839Ujhhgtgfeyxiexzf("byte") : cls10;
                                                                    }
                                                                }
                                                                return cls9 == null ? m2839Ujhhgtgfeyxiexzf("char") : cls9;
                                                            }
                                                        }
                                                        return cls8 == null ? m2839Ujhhgtgfeyxiexzf("short") : cls8;
                                                    }
                                                }
                                                return cls7 == null ? m2839Ujhhgtgfeyxiexzf("long") : cls7;
                                            }
                                        }
                                        return cls6 == null ? m2839Ujhhgtgfeyxiexzf("double") : cls6;
                                    }
                                }
                                return cls5 == null ? m2839Ujhhgtgfeyxiexzf("float") : cls5;
                            }
                        }
                        return cls4 == null ? m2839Ujhhgtgfeyxiexzf("int") : cls4;
                    }
                }
                return cls3 == null ? m2839Ujhhgtgfeyxiexzf("boolean") : cls3;
            }
        }
        return cls2 == null ? m2839Ujhhgtgfeyxiexzf("void") : cls2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ActionMode.Callback m2841Ujhhgtgfeyxiexzf(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC1976Ujhhgtgfeyxiexzf) || callback == null) ? callback : new ActionModeCallbackC1976Ujhhgtgfeyxiexzf(callback, textView);
    }
}
