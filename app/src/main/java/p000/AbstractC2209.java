package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2209 {

    public static final C1172 f7183 = new C1172("REMOVED_TASK", 1);

    public static final C1172 f7184 = new C1172("CLOSED_EMPTY", 1);

    public static final C2102 f7185 = new C2102(14);

    public static final C1904 m4123(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C1904(matcher, charSequence);
        }
        return null;
    }

    public static void m4124(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void m4125(File file) {
        try {
            if (file.exists()) {
                m4126(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static void m4126(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m4126(file2);
            }
        }
        file.delete();
    }

    public static final void m4127(AbstractC0057 abstractC0057, Throwable th) {
        if (th instanceof C1071) {
            th = ((C1071) th).f3885;
        }
        abstractC0057.mo933(new C2585(th));
        throw th;
    }

    public static final AbstractC2867[] m4128() {
        return new AbstractC2867[]{C0206.f1290, C0208.f1296, C0209.f1302, C0210.f1307, C0121.f1070, C0463.f2038, C0465.f2052, C0473.f2064, C0636.f2474, C0932.f3421, C0935.f3428, C2041.f6815, C2051.f6834, C2096.f6907, C2603.f8467, C0188.f1249, C0194.f1259, C0197.f1266, C0306.f1528, C0312.f1549, C0314.f1554, C0319.f1567, C0664.f2541, C1052.f3824, C1054.f3829, C1058.f3836, C1060.f3842, C2056.f6843, C2073.f6869, C2082.f6884, C2321.f7452, C2446.f7775, C2455.f7796, C2459.f7804, C2700.f8706, C2719.f8775, C1401.f5057, C1537.f5378, C1541.f5387, C1542.f5392, C1545.f5398, C1547.f5404, C1549.f5409, C2361.f7579, C0186.f1243, C0946.f3459, C1323.f4772, C3446.f10858, C0603.f2421, C0604.f2425, C2112.f6958, C2113.f6962, C0183.f1237, C2213.f7188, C1500.f5295, C1513.f5334, C1160.f4283, C1846.f6140, C3621.f11319, C2797.f8923, C2532.f8073, C2534.f8078, C2535.f8082, C2542.f8095, C1175.f4307, C2057.f6849, C2091.f6899, C3616.f11309, C3626.f11328, C2349.f7541, C2451.f7789, C0723.f2734, C2084.f6889, C2298.f7405, C2448.f7781, C2031.f6789, C2032.f6793, C2034.f6800, RunnableC0304.f1522, C0310.f1535, C0728.f2755, C1048.f3817, C1989.f6610, C2105.f6940, C2632.f8521, C2691.f8682, C2882.f9230, C2512.f8030, C2513.f8034, C2514.f8038, C0198.f1271, C0200.f1277, C0202.f1282, C2722.f8781, C2727.f8791, C2732.f8799, C2733.f8803, C2741.f8814, C2755.f8841, C2768.f8857, C2772.f8869, C0663.f2533, C1362.f4862, C0622.f2452, C2695.f8691, C2696.f8695, C2697.f8699, C3611.f11291, C3613.f11298, C1469.f5239, C1471.f5242, C2109.f6949, C3617.f11313, C0670.f2551, C2307.f7427, C0649.f2499, C0181.f1231, C1016.f3715, C0755.f2846};
    }

    public static byte[] m4129(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        m4141(file, bArr, i);
        return bArr;
    }

    public static int m4130(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM4109 = AbstractC2207.m4109(context, i);
        if (typedValueM4109 != null) {
            int i3 = typedValueM4109.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueM4109.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int m4131(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM4111 = AbstractC2207.m4111(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM4111.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueM4111.data;
    }

    public static C2604 m4132(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(AbstractC1194.m2779(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C2604(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static void m4133(C1982 c1982, AbstractC0567 abstractC0567) {
        Method method;
        if (c1982 == null || (method = c1982.f6566) == null) {
            return;
        }
        m4134(method, abstractC0567);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    public static C3687 m4134(Member member, AbstractC0567 abstractC0567) {
        Object c2585;
        boolean zBooleanValue;
        Object c2586;
        int i;
        int[] iArr = AbstractC0743.f2838;
        C3682 c3682 = null;
        if (member != null) {
            boolean zBooleanValue2 = false;
            int i2 = iArr[0];
            if (AbstractC1555.f5422[AbstractC2784.m4759(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2585 = Boolean.TRUE;
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                boolean z = c2585 instanceof C2585;
                Object obj = c2585;
                if (z) {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i2 = 2;
            }
            int iM4759 = AbstractC2784.m4759(i2);
            if (iM4759 != 0) {
                if (iM4759 != 1) {
                    throw new C0761();
                }
                throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
            }
            int i3 = iArr[0];
            if (AbstractC1555.f5422[AbstractC2784.m4759(i3)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2586 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                Boolean bool2 = (Boolean) (c2586 instanceof C2585 ? null : c2586);
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
            }
            if (!zBooleanValue2) {
                i3 = 2;
            }
            int iM47510 = AbstractC2784.m4759(i3);
            if (iM47510 != 0) {
                if (iM47510 != 1) {
                    throw new C0761();
                }
                throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
            }
            int iM47511 = AbstractC2784.m4759(abstractC0567.mo1334());
            if (iM47511 == 0) {
                i = 50;
            } else if (iM47511 == 1) {
                i = -10000;
            } else {
                if (iM47511 != 2) {
                    throw new C0761();
                }
                i = 10000;
            }
            XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(member, new C1561(abstractC0567, i));
            c3682 = new C3682(new C1558(unhookHookMethod, 0), new C1558(unhookHookMethod, 1));
        }
        return new C3687(c3682);
    }

    public static InterfaceC0842 m4135(InterfaceC0842 interfaceC0842) {
        AbstractC0843 abstractC0843 = interfaceC0842 instanceof AbstractC0843 ? (AbstractC0843) interfaceC0842 : null;
        if (abstractC0843 == null || (interfaceC0842 = abstractC0843.f3250) != null) {
            return interfaceC0842;
        }
        AbstractC0878 abstractC0878 = (AbstractC0878) abstractC0843.f3249.mo942(C1133.f4202);
        InterfaceC0842 c1072 = abstractC0878 != null ? new C1072(abstractC0878, abstractC0843) : abstractC0843;
        abstractC0843.f3250 = c1072;
        return c1072;
    }

    public static boolean m4136(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    public static int m4137(int i, int i2, float f) {
        return AbstractC0752.m2224(AbstractC0752.m2226(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static boolean m4138(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static void m4139(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        byte[] bArrM4129 = m4129(file);
        try {
            int length = bArrM4129.length;
            File file3 = new File(file2.getParent(), file2.getName() + ".tmp");
            if (m4138(file3)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    randomAccessFile.setLength(length);
                    randomAccessFile.write(bArrM4129, 0, length);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (!file3.renameTo(file2) && (!file2.exists() || file2.delete())) {
                        file3.renameTo(file2);
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                new Exception("create file failed");
            }
        } catch (Exception e) {
            new Exception("save bytes failed", e);
        }
        m4125(file);
    }

    public static InterfaceC0877 m4140(InterfaceC0877 interfaceC0877, InterfaceC0877 interfaceC0878) {
        return interfaceC0878 == C1187.f4327 ? interfaceC0877 : (InterfaceC0877) interfaceC0878.mo940(interfaceC0877, new C0184(3));
    }

    public static void m4141(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = randomAccessFile.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                } else {
                    i2 += i3;
                }
            } finally {
                m4124(randomAccessFile);
            }
        }
    }

    public abstract void mo1936(int i);

    public abstract void mo1937(Typeface typeface, boolean z);
}
