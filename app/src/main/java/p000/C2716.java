package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᛸᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2716 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8766;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8767;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8768;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8769;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1866 f8771 = new C1866(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0542 f8772 = new C0542(14);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f8773 = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f8766 = configArr;
        f8767 = configArr;
        f8768 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f8769 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f8770 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4722(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM4753 = AbstractC2784.m4753("SizeConfigStrategy{groupedMap=");
        sbM4753.append(this.f8772);
        sbM4753.append(", sortedSizes=(");
        HashMap map = this.f8773;
        for (Map.Entry entry : map.entrySet()) {
            sbM4753.append(entry.getKey());
            sbM4753.append('[');
            sbM4753.append(entry.getValue());
            sbM4753.append("], ");
        }
        if (!map.isEmpty()) {
            sbM4753.replace(sbM4753.length() - 2, sbM4753.length(), "");
        }
        sbM4753.append(")}");
        return sbM4753.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4723(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM4725 = m4725(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM4725.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM4725.remove(num);
                return;
            } else {
                navigableMapM4725.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m4722(AbstractC3522.m5106(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Bitmap m4724(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM5107 = AbstractC3522.m5107(config) * i * i2;
        C1866 c1866 = this.f8771;
        InterfaceC2376 interfaceC2376M3637 = (InterfaceC2376) ((ArrayDeque) c1866.f1760).poll();
        if (interfaceC2376M3637 == null) {
            interfaceC2376M3637 = c1866.m3637();
        }
        C2715 c2715 = (C2715) interfaceC2376M3637;
        c2715.f8764 = iM5107;
        c2715.f8765 = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f8767;
        } else {
            int i3 = AbstractC2714.f8762[config.ordinal()];
            if (i3 == 1) {
                configArr = f8766;
            } else if (i3 == 2) {
                configArr = f8768;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f8770;
            } else {
                configArr = f8769;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) m4725(config2).ceilingKey(Integer.valueOf(iM5107));
            if (num != null && num.intValue() <= iM5107 * 8) {
                if (num.intValue() == iM5107 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                c1866.m1519(c2715);
                int iIntValue = num.intValue();
                InterfaceC2376 interfaceC2376M3638 = (InterfaceC2376) ((ArrayDeque) c1866.f1760).poll();
                if (interfaceC2376M3638 == null) {
                    interfaceC2376M3638 = c1866.m3637();
                }
                c2715 = (C2715) interfaceC2376M3638;
                c2715.f8764 = iIntValue;
                c2715.f8765 = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f8772.m1887(c2715);
        if (bitmap != null) {
            m4723(Integer.valueOf(c2715.f8764), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final NavigableMap m4725(Bitmap.Config config) {
        HashMap map = this.f8773;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4726(Bitmap bitmap) {
        int iM5106 = AbstractC3522.m5106(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C1866 c1866 = this.f8771;
        InterfaceC2376 interfaceC2376M3637 = (InterfaceC2376) ((ArrayDeque) c1866.f1760).poll();
        if (interfaceC2376M3637 == null) {
            interfaceC2376M3637 = c1866.m3637();
        }
        C2715 c2715 = (C2715) interfaceC2376M3637;
        c2715.f8764 = iM5106;
        c2715.f8765 = config;
        this.f8772.m1912(c2715, bitmap);
        NavigableMap navigableMapM4725 = m4725(bitmap.getConfig());
        Integer num = (Integer) navigableMapM4725.get(Integer.valueOf(c2715.f8764));
        navigableMapM4725.put(Integer.valueOf(c2715.f8764), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }
}
