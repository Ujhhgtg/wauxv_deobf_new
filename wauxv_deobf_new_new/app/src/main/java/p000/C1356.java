package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1356 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4859;

    public /* synthetic */ C1356(int i) {
        this.f4859 = i;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        int i = this.f4859;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                return AbstractC2235.m4192(new C1322(19));
            case 1:
                C1365 c1365 = C1365.f4881;
                String[] strArr = AbstractC1471.f5234;
                c1365.m2672("#FFF7F7F7");
                C1367.f4883.m2672("#FF1E1E1E");
                C1364.f4880.m2672("#FF1E1E1E");
                C1366.f4882.m2672("#FFF7F7F7");
                return c3554;
            case 2:
                C1408.f5085.m2672("E HH:mm");
                C1407.f5084.m2669(EnumC1406.f5080.f5083);
                return c3554;
            case 3:
                return new Handler(Looper.getMainLooper());
            case 4:
                return AbstractC2235.m4192(new C1322(29));
            case 5:
                C0702 c0702M4549 = AbstractC2574.m4549(String.class);
                C2899 c2899 = C2899.f9270;
                return new C2572(c0702M4549);
            case 6:
                return new C1499(new int[]{Color.parseColor(C1509.f5325.m2666()), Color.parseColor(C1510.f5326.m2666())}, Color.parseColor(C1511.f5327.m2666()));
            case 7:
                return new C1499(new int[]{Color.parseColor(C1500.f5316.m2666()), Color.parseColor(C1501.f5317.m2666())}, Color.parseColor(C1502.f5318.m2666()));
            case 8:
                return new C1499(new int[]{Color.parseColor(C1506.f5322.m2666()), Color.parseColor(C1507.f5323.m2666())}, Color.parseColor(C1508.f5324.m2666()));
            case 9:
                C1509 c1509 = C1509.f5325;
                String[] strArr2 = AbstractC1471.f5234;
                c1509.m2672("#FFF9E8C8");
                C1510.f5326.m2672("#FFFEF3D6");
                C1511.f5327.m2672("#FFE87A20");
                C1500.f5316.m2672("#FFA3F0E6");
                C1501.f5317.m2672("#FFE0F7F4");
                C1502.f5318.m2672("#FF3AAE9D");
                C1503.f5319.m2672("#FFF2D5F8");
                C1504.f5320.m2672("#FFF9EBFC");
                C1505.f5321.m2672("#FFA64BDB");
                C1506.f5322.m2672("#FFD8D8D8");
                C1507.f5323.m2672("#FFE0E0E0");
                C1508.f5324.m2672("#FF666666");
                return c3554;
            case 10:
                C1509 c15010 = C1509.f5325;
                String[] strArr3 = AbstractC1471.f5234;
                c15010.m2672("#FFFFD56A");
                C1510.f5326.m2672("#FFFFE87A");
                C1511.f5327.m2672("#FFFFFFFF");
                C1500.f5316.m2672("#FF4DD5CC");
                C1501.f5317.m2672("#FF68E8DF");
                C1502.f5318.m2672("#FFFFFFFF");
                C1503.f5319.m2672("#FFD0A3FF");
                C1504.f5320.m2672("#FFEFBFFF");
                C1505.f5321.m2672("#FFFFFFFF");
                C1506.f5322.m2672("#FF95A0B8");
                C1507.f5323.m2672("#FFA8B2C9");
                C1508.f5324.m2672("#FFFFFFFF");
                return c3554;
            case 11:
                C1523 c1523 = C1523.f5363;
                String[] strArr4 = AbstractC1471.f5234;
                c1523.m2672("#28C445");
                C1524.f5364.m2672("退出了此群");
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                int i2 = AbstractC1768.f5906;
                C1681 c1681M4711 = AbstractC2727.m4711(AbstractC2574.m4549(Intent.class));
                c1681M4711.m3561(true);
                C1300 c1300M3558 = c1681M4711.m3558();
                c1300M3558.f6475 = "mExtras";
                return (C1316) AbstractC0739.m2291(c1300M3558.m3117());
            case 13:
                C1548.f5408.m2671(C1549.f5410);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                return C1755.f5890;
            case 15:
                return C1748.f5882;
            case 16:
                return C1745.f5880;
            case Opcodes.SIPUSH /* 17 */:
                return C1752.f5888;
            case Opcodes.LDC /* 18 */:
                return C1729.f5850;
            case 19:
                return AbstractC1883.m3802("KavaRef");
            case 20:
                return Boolean.valueOf(AbstractC0705.m2227(C1770.class.getClassLoader(), "android.os.Build"));
            case Opcodes.ILOAD /* 21 */:
                String[] strArr5 = AbstractC1471.f5234;
                C1868 c1868 = C1868.f6209;
                C2048 c2048 = C1872.f6216;
                C2048 c2049 = null;
                if (c2048 == null) {
                    "binding";
                    c2048 = null;
                }
                c1868.m2668(Float.parseFloat(String.valueOf(c2048.f6858.getText())));
                C1869 c1869 = C1869.f6210;
                C2048 c20410 = C1872.f6216;
                if (c20410 == null) {
                    "binding";
                } else {
                    c2049 = c20410;
                }
                c1869.m2668(Float.parseFloat(String.valueOf(c2049.f6859.getText())));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1868.f6209.m2668(31.135633f);
                C1869.f6210.m2668(121.66625f);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            case Opcodes.ALOAD /* 25 */:
                File file = new File(C2075.f6942, "right_bubble.9.png");
                if (file.exists()) {
                    return BitmapFactory.decodeFile(file.getAbsolutePath());
                }
                C2075.f6941.getClass();
                return (Bitmap) C2075.f6943.getValue();
            case 26:
                File file2 = new File(C2075.f6942, "left_bubble.9.png");
                if (file2.exists()) {
                    return BitmapFactory.decodeFile(file2.getAbsolutePath());
                }
                C2075.f6941.getClass();
                return (Bitmap) C2075.f6943.getValue();
            case 27:
                C2072 c2072 = C2072.f6938;
                String[] strArr6 = AbstractC1471.f5234;
                c2072.m2672("#00000000");
                C2074.f6940.m2672("#00000000");
                C2071.f6937.m2672("#00000000");
                C2073.f6939.m2672("#00000000");
                return c3554;
            case 28:
                C2078 c2078 = C2078.f6952;
                String[] strArr7 = AbstractC1471.f5234;
                c2078.m2672("#FFE4E9FC");
                C2079.f6953.m2672("#11000000");
                C2082.f6956.m2672("#FFD7FAE4");
                C2083.f6957.m2672("#11000000");
                C2076.f6950.m2672("#FF3D3D3D");
                C2077.f6951.m2672("#11000000");
                C2080.f6954.m2672("#FFD7FAE4");
                C2081.f6955.m2672("#11000000");
                return c3554;
            default:
                C2087 c2087 = C2087.f6965;
                String[] strArr8 = AbstractC1471.f5234;
                c2087.m2672("${sendText}喵~");
                C2088.f6966.m2672("HH:mm:ss");
                return c3554;
        }
    }
}
