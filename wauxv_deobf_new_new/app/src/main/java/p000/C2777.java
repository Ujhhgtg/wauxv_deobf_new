package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᤝᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2777 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8932;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1892 f8934 = new C1892(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0519 f8935 = new C0519(15);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f8936 = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f8929 = configArr;
        f8930 = configArr;
        f8931 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f8932 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f8933 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4756(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM4787 = AbstractC2844.m4787("SizeConfigStrategy{groupedMap=");
        sbM4787.append(this.f8935);
        sbM4787.append(", sortedSizes=(");
        HashMap map = this.f8936;
        for (Map.Entry entry : map.entrySet()) {
            sbM4787.append(entry.getKey());
            sbM4787.append('[');
            sbM4787.append(entry.getValue());
            sbM4787.append("], ");
        }
        if (!map.isEmpty()) {
            sbM4787.replace(sbM4787.length() - 2, sbM4787.length(), "");
        }
        sbM4787.append(")}");
        return sbM4787.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4757(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM4759 = m4759(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM4759.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM4759.remove(num);
                return;
            } else {
                navigableMapM4759.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m4756(AbstractC3580.m5118(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Bitmap m4758(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM5119 = AbstractC3580.m5119(config) * i * i2;
        C1892 c1892 = this.f8934;
        InterfaceC2429 interfaceC2429M3815 = (InterfaceC2429) ((ArrayDeque) c1892.f1731).poll();
        if (interfaceC2429M3815 == null) {
            interfaceC2429M3815 = c1892.m3815();
        }
        C2776 c2776 = (C2776) interfaceC2429M3815;
        c2776.f8927 = iM5119;
        c2776.f8928 = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f8930;
        } else {
            int i3 = AbstractC2775.f8925[config.ordinal()];
            if (i3 == 1) {
                configArr = f8929;
            } else if (i3 == 2) {
                configArr = f8931;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f8933;
            } else {
                configArr = f8932;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) m4759(config2).ceilingKey(Integer.valueOf(iM5119));
            if (num != null && num.intValue() <= iM5119 * 8) {
                if (num.intValue() == iM5119 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                c1892.m1625(c2776);
                int iIntValue = num.intValue();
                InterfaceC2429 interfaceC2429M3816 = (InterfaceC2429) ((ArrayDeque) c1892.f1731).poll();
                if (interfaceC2429M3816 == null) {
                    interfaceC2429M3816 = c1892.m3815();
                }
                c2776 = (C2776) interfaceC2429M3816;
                c2776.f8927 = iIntValue;
                c2776.f8928 = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f8935.m1981(c2776);
        if (bitmap != null) {
            m4757(Integer.valueOf(c2776.f8927), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final NavigableMap m4759(Bitmap.Config config) {
        HashMap map = this.f8936;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4760(Bitmap bitmap) {
        int iM5118 = AbstractC3580.m5118(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C1892 c1892 = this.f8934;
        InterfaceC2429 interfaceC2429M3815 = (InterfaceC2429) ((ArrayDeque) c1892.f1731).poll();
        if (interfaceC2429M3815 == null) {
            interfaceC2429M3815 = c1892.m3815();
        }
        C2776 c2776 = (C2776) interfaceC2429M3815;
        c2776.f8927 = iM5118;
        c2776.f8928 = config;
        this.f8935.m2006(c2776, bitmap);
        NavigableMap navigableMapM4759 = m4759(bitmap.getConfig());
        Integer num = (Integer) navigableMapM4759.get(Integer.valueOf(c2776.f8927));
        navigableMapM4759.put(Integer.valueOf(c2776.f8927), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }
}
