package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲁᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1354 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4850;

    public /* synthetic */ C1354(int i) {
        this.f4850 = i;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        List list;
        int i = this.f4850;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1359 c1359 = C1359.f4859;
                String[] strArr = AbstractC1574.f5469;
                c1359.m2548("#FFF7F7F7");
                C1361.f4861.m2548("#FF1E1E1E");
                C1358.f4858.m2548("#FF1E1E1E");
                C1360.f4860.m2548("#FFF7F7F7");
                return c3497;
            case 1:
                C1400.f5056.m2548("E HH:mm");
                C1399.f5055.m2545(EnumC1398.f5051.f5054);
                return c3497;
            case 2:
                return new Handler(Looper.getMainLooper());
            case 3:
                File file = new File(C1486.f5276, "groupItemsV2.json");
                if (file.exists()) {
                    C1706 c1706 = C1706.f5798;
                    String strM3043 = AbstractC1328.m3043(file);
                    c1706.getClass();
                    list = (List) c1706.m3468(new C0258(C1484.Companion.serializer()), strM3043);
                } else {
                    C1706 c1707 = C1706.f5798;
                    List list2 = C1486.f5277;
                    c1707.getClass();
                    AbstractC1328.m3044(file, c1707.m3469(new C0258(C1484.Companion.serializer()), list2));
                    list = list2;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((C1484) obj).f5262) {
                        arrayList.add(obj);
                    }
                }
                return AbstractC0744.m2201(arrayList, new C0171(9));
            case 4:
                C0707 c0707M4527 = AbstractC2519.m4527(String.class);
                C2839 c2839 = C2839.f9108;
                return new C2517(c0707M4527);
            case 5:
                return new C1487(new int[]{Color.parseColor(C1497.f5292.m2542()), Color.parseColor(C1498.f5293.m2542())}, Color.parseColor(C1499.f5294.m2542()));
            case 6:
                return new C1487(new int[]{Color.parseColor(C1488.f5283.m2542()), Color.parseColor(C1489.f5284.m2542())}, Color.parseColor(C1490.f5285.m2542()));
            case 7:
                return new C1487(new int[]{Color.parseColor(C1494.f5289.m2542()), Color.parseColor(C1495.f5290.m2542())}, Color.parseColor(C1496.f5291.m2542()));
            case 8:
                C1497 c1497 = C1497.f5292;
                String[] strArr2 = AbstractC1574.f5469;
                c1497.m2548("#FFF9E8C8");
                C1498.f5293.m2548("#FFFEF3D6");
                C1499.f5294.m2548("#FFE87A20");
                C1488.f5283.m2548("#FFA3F0E6");
                C1489.f5284.m2548("#FFE0F7F4");
                C1490.f5285.m2548("#FF3AAE9D");
                C1491.f5286.m2548("#FFF2D5F8");
                C1492.f5287.m2548("#FFF9EBFC");
                C1493.f5288.m2548("#FFA64BDB");
                C1494.f5289.m2548("#FFD8D8D8");
                C1495.f5290.m2548("#FFE0E0E0");
                C1496.f5291.m2548("#FF666666");
                return c3497;
            case 9:
                C1497 c1498 = C1497.f5292;
                String[] strArr3 = AbstractC1574.f5469;
                c1498.m2548("#FFFFD56A");
                C1498.f5293.m2548("#FFFFE87A");
                C1499.f5294.m2548("#FFFFFFFF");
                C1488.f5283.m2548("#FF4DD5CC");
                C1489.f5284.m2548("#FF68E8DF");
                C1490.f5285.m2548("#FFFFFFFF");
                C1491.f5286.m2548("#FFD0A3FF");
                C1492.f5287.m2548("#FFEFBFFF");
                C1493.f5288.m2548("#FFFFFFFF");
                C1494.f5289.m2548("#FF95A0B8");
                C1495.f5290.m2548("#FFA8B2C9");
                C1496.f5291.m2548("#FFFFFFFF");
                return c3497;
            case 10:
                C1511 c1511 = C1511.f5332;
                String[] strArr4 = AbstractC1574.f5469;
                c1511.m2548("#28C445");
                C1512.f5333.m2548("退出了此群");
                return c3497;
            case 11:
                int i2 = AbstractC1745.f5844;
                C1744 c1744M2482 = AbstractC0968.m2482(AbstractC2519.m4527(Intent.class));
                c1744M2482.m3493(true);
                C1299 c1299M3490 = c1744M2482.m3490();
                c1299M3490.f6370 = "mExtras";
                return (C1315) AbstractC0744.m2192(c1299M3490.m3014());
            case Opcodes.FCONST_1 /* 12 */:
                C1536.f5377.m2547(C1537.f5379);
                return c3497;
            case 13:
                return C1731.f5827;
            case Opcodes.DCONST_0 /* 14 */:
                return C1724.f5819;
            case 15:
                return C1721.f5817;
            case 16:
                return C1728.f5825;
            case Opcodes.SIPUSH /* 17 */:
                return C1710.f5807;
            case Opcodes.LDC /* 18 */:
                return AbstractC1857.m3624();
            case 19:
                return Boolean.valueOf(AbstractC0710.m2134(C1747.class.getClassLoader(), "android.os.Build"));
            case 20:
                String[] strArr5 = AbstractC1574.f5469;
                C1842 c1842 = C1842.f6135;
                C2022 c2022 = C1846.f6142;
                C2022 c2023 = null;
                if (c2022 == null) {
                    "binding";
                    c2022 = null;
                }
                c1842.m2544(Float.parseFloat(String.valueOf(c2022.f6775.getText())));
                C1843 c1843 = C1843.f6136;
                C2022 c2024 = C1846.f6142;
                if (c2024 == null) {
                    "binding";
                } else {
                    c2023 = c2024;
                }
                c1843.m2544(Float.parseFloat(String.valueOf(c2023.f6776.getText())));
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C1842.f6135.m2544(31.135633f);
                C1843.f6136.m2544(121.66625f);
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            case Opcodes.DLOAD /* 24 */:
                File file2 = new File(C2041.f6816, "right_bubble.9.png");
                if (file2.exists()) {
                    return BitmapFactory.decodeFile(file2.getAbsolutePath());
                }
                C2041.f6815.getClass();
                return (Bitmap) C2041.f6817.getValue();
            case Opcodes.ALOAD /* 25 */:
                File file3 = new File(C2041.f6816, "left_bubble.9.png");
                if (file3.exists()) {
                    return BitmapFactory.decodeFile(file3.getAbsolutePath());
                }
                C2041.f6815.getClass();
                return (Bitmap) C2041.f6817.getValue();
            case 26:
                C2038 c2038 = C2038.f6812;
                String[] strArr6 = AbstractC1574.f5469;
                c2038.m2548("#00000000");
                C2040.f6814.m2548("#00000000");
                C2037.f6811.m2548("#00000000");
                C2039.f6813.m2548("#00000000");
                return c3497;
            case 27:
                C2045 c2045 = C2045.f6828;
                String[] strArr7 = AbstractC1574.f5469;
                c2045.m2548("#FFE4E9FC");
                C2046.f6829.m2548("#11000000");
                C2049.f6832.m2548("#FFD7FAE4");
                C2050.f6833.m2548("#11000000");
                C2043.f6826.m2548("#FF3D3D3D");
                C2044.f6827.m2548("#11000000");
                C2047.f6830.m2548("#FFD7FAE4");
                C2048.f6831.m2548("#11000000");
                return c3497;
            case 28:
                C2054 c2054 = C2054.f6841;
                String[] strArr8 = AbstractC1574.f5469;
                c2054.m2548("${sendText}喵~");
                C2055.f6842.m2548("HH:mm:ss");
                return c3497;
            default:
                C2066 c2066 = C2066.f6862;
                String[] strArr9 = AbstractC1574.f5469;
                c2066.m2548("#11000000");
                C2067.f6863.m2548("#FFFFFFFF");
                C2062.f6858.m2548("#11FFFFFF");
                C2063.f6859.m2548("#FFFFFFFF");
                C2071.f6867.m2548("${time} | ${type}");
                C2072.f6868.m2548("HH:mm:ss");
                C2065.f6861.m2545(64);
                C2068.f6864.m2545(64);
                C2064.f6860.m2545(10);
                C2069.f6865.m2543(true);
                C2070.f6866.m2543(true);
                return c3497;
        }
    }
}
