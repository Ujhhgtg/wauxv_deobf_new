package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲᛴ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1034feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final Bitmap.Config[] f4039Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final Bitmap.Config[] f4040Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Bitmap.Config[] f4041Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final Bitmap.Config[] f4042Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final Bitmap.Config[] f4043Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0272Ujhhgtgfeyxiexzf f4044Ujhhgtgfeyxiexzf = new C0272Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f4045Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(15);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashMap f4046Ujhhgtgfeyxiexzf = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f4039Ujhhgtgfeyxiexzf = configArr;
        f4040Ujhhgtgfeyxiexzf = configArr;
        f4041Ujhhgtgfeyxiexzf = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f4042Ujhhgtgfeyxiexzf = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f4043Ujhhgtgfeyxiexzf = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m2526Ujhhgtgfeyxiexzf(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf("SizeConfigStrategy{groupedMap=");
        sbM2707Ujhhgtgfeyxiexzf.append(this.f4045Ujhhgtgfeyxiexzf);
        sbM2707Ujhhgtgfeyxiexzf.append(", sortedSizes=(");
        HashMap map = this.f4046Ujhhgtgfeyxiexzf;
        for (Map.Entry entry : map.entrySet()) {
            sbM2707Ujhhgtgfeyxiexzf.append(entry.getKey());
            sbM2707Ujhhgtgfeyxiexzf.append('[');
            sbM2707Ujhhgtgfeyxiexzf.append(entry.getValue());
            sbM2707Ujhhgtgfeyxiexzf.append("], ");
        }
        if (!map.isEmpty()) {
            sbM2707Ujhhgtgfeyxiexzf.replace(sbM2707Ujhhgtgfeyxiexzf.length() - 2, sbM2707Ujhhgtgfeyxiexzf.length(), "");
        }
        sbM2707Ujhhgtgfeyxiexzf.append(")}");
        return sbM2707Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2527Ujhhgtgfeyxiexzf(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM2529Ujhhgtgfeyxiexzf = m2529Ujhhgtgfeyxiexzf(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM2529Ujhhgtgfeyxiexzf.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM2529Ujhhgtgfeyxiexzf.remove(num);
                return;
            } else {
                navigableMapM2529Ujhhgtgfeyxiexzf.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m2526Ujhhgtgfeyxiexzf(AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Bitmap m2528Ujhhgtgfeyxiexzf(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM3195Ujhhgtgfeyxiexzf = AbstractC1860Ujhhgtgfeyxiexzf.m3195Ujhhgtgfeyxiexzf(config) * i * i2;
        C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf = this.f4044Ujhhgtgfeyxiexzf;
        InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf.f7994Ujhhgtgfeyxiexzf).poll();
        if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf == null) {
            interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = c0272Ujhhgtgfeyxiexzf.m1468Ujhhgtgfeyxiexzf();
        }
        C1035feyxiexzfUjhhgtg c1035feyxiexzfUjhhgtg = (C1035feyxiexzfUjhhgtg) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf;
        c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf = iM3195Ujhhgtgfeyxiexzf;
        c1035feyxiexzfUjhhgtg.f4049Ujhhgtgfeyxiexzf = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f4040Ujhhgtgfeyxiexzf;
        } else {
            int i3 = AbstractC1027feyxiexzfUjhhgtg.f4024Ujhhgtgfeyxiexzf[config.ordinal()];
            if (i3 == 1) {
                configArr = f4039Ujhhgtgfeyxiexzf;
            } else if (i3 == 2) {
                configArr = f4041Ujhhgtgfeyxiexzf;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f4043Ujhhgtgfeyxiexzf;
            } else {
                configArr = f4042Ujhhgtgfeyxiexzf;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) m2529Ujhhgtgfeyxiexzf(config2).ceilingKey(Integer.valueOf(iM3195Ujhhgtgfeyxiexzf));
            if (num != null && num.intValue() <= iM3195Ujhhgtgfeyxiexzf * 8) {
                if (num.intValue() == iM3195Ujhhgtgfeyxiexzf && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                c0272Ujhhgtgfeyxiexzf.m3694Ujhhgtgfeyxiexzf(c1035feyxiexzfUjhhgtg);
                int iIntValue = num.intValue();
                InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2 = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf.f7994Ujhhgtgfeyxiexzf).poll();
                if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2 == null) {
                    interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2 = c0272Ujhhgtgfeyxiexzf.m1468Ujhhgtgfeyxiexzf();
                }
                c1035feyxiexzfUjhhgtg = (C1035feyxiexzfUjhhgtg) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2;
                c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf = iIntValue;
                c1035feyxiexzfUjhhgtg.f4049Ujhhgtgfeyxiexzf = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f4045Ujhhgtgfeyxiexzf.m3937Ujhhgtgfeyxiexzf(c1035feyxiexzfUjhhgtg);
        if (bitmap != null) {
            m2527Ujhhgtgfeyxiexzf(Integer.valueOf(c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final NavigableMap m2529Ujhhgtgfeyxiexzf(Bitmap.Config config) {
        HashMap map = this.f4046Ujhhgtgfeyxiexzf;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m2530Ujhhgtgfeyxiexzf(Bitmap bitmap) {
        int iM3194Ujhhgtgfeyxiexzf = AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf = this.f4044Ujhhgtgfeyxiexzf;
        InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf.f7994Ujhhgtgfeyxiexzf).poll();
        if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf == null) {
            interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = c0272Ujhhgtgfeyxiexzf.m1468Ujhhgtgfeyxiexzf();
        }
        C1035feyxiexzfUjhhgtg c1035feyxiexzfUjhhgtg = (C1035feyxiexzfUjhhgtg) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf;
        c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf = iM3194Ujhhgtgfeyxiexzf;
        c1035feyxiexzfUjhhgtg.f4049Ujhhgtgfeyxiexzf = config;
        this.f4045Ujhhgtgfeyxiexzf.m3962feyxiexzfUjhhgtg(c1035feyxiexzfUjhhgtg, bitmap);
        NavigableMap navigableMapM2529Ujhhgtgfeyxiexzf = m2529Ujhhgtgfeyxiexzf(bitmap.getConfig());
        Integer num = (Integer) navigableMapM2529Ujhhgtgfeyxiexzf.get(Integer.valueOf(c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf));
        navigableMapM2529Ujhhgtgfeyxiexzf.put(Integer.valueOf(c1035feyxiexzfUjhhgtg.f4048Ujhhgtgfeyxiexzf), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }
}
