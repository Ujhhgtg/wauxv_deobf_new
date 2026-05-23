package p000;

import android.os.Environment;
import android.os.Process;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᲁᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2083 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6888;

    public /* synthetic */ C2083(int i) {
        this.f6888 = i;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        int i = this.f6888;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                AbstractC2834.m4823(null, 3, "隐藏中");
                AbstractC1458.m3166(C2084.f6889, new C2058(13));
                return unit;
            case 1:
                AbstractC2834.m4823(null, 3, "显示中");
                AbstractC1458.m3166(C2084.f6889, new C2058(12));
                return unit;
            case 2:
                C2093 c2093 = C2093.f6904;
                String[] strArr = AbstractC1574.f5469;
                c2093.m2548("#FF000000");
                C2095.f6906.m2548("#FF000000");
                C2092.f6903.m2548("#FFFFFFFF");
                C2094.f6905.m2548("#FF000000");
                return unit;
            case 3:
                return new C0258(C2216.f7194);
            case 4:
                C2851 c2851 = C2851.f9114;
                InterfaceC2654[] interfaceC2654Arr = new InterfaceC2654[0];
                if (AbstractC2841.m4836("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (c2851.equals(C2851.f9111)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                C0708 c0708 = new C0708("kotlin.Unit");
                return new C2656("kotlin.Unit", c2851, c0708.f2691.size(), AbstractC0270.m1389(interfaceC2654Arr), c0708);
            case 5:
                String[] strArr2 = AbstractC1574.f5469;
                String str = "打开详情";
                String str2 = "";
                String str3 = "确定";
                C1643 c1643 = new C1643();
                AbstractC2205 abstractC2205 = AbstractC1034.f3778;
                c1643.f915 = true;
                c1643.f6501 = "打开详情";
                c1643.f6502 = "";
                c1643.f6503 = "确定";
                c1643.f6508 = new C2297();
                c1643.m3791();
                return unit;
            case 6:
                return Environment.getExternalStorageDirectory().getAbsolutePath();
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append((String) AbstractC2342.f7529.getValue());
                sb.append("/Android/media/");
                
                sb.append(C1565.m3277());
                return sb.toString();
            case 8:
                Process.killProcess(Process.myPid());
                return unit;
            case 9:
                C2458 c2458 = C2458.f7803;
                String[] strArr3 = AbstractC1574.f5469;
                c2458.m2548("[有人回我]");
                C2457.f7802.m2548("#FFE14949");
                return unit;
            case 10:
                C2630 c2630 = C2630.f8519;
                String[] strArr4 = AbstractC1574.f5469;
                c2630.m2548("${time} ${nick}");
                C2631.f8520.m2548("yyyy-MM-dd");
                return unit;
            case 11:
                C3563 c3563 = new C3563();
                c3563.f11173 = C1189.f4329;
                return c3563;
            case 12 /* 12 */:
                int i2 = 0;
                C0796 c0796M3486 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.storage.emotion.SmileyPanelConfigInfo")).m3486();
                c0796M3486.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(Integer.TYPE), AbstractC2519.classToKClass(String.class)}, 2));
                return (C0798) AbstractC0744.firstInList(c0796M3486.m2344());
            case 13:
                C2721.f8780.m2548(C2722.f8782);
                return unit;
            case 14 /* 14 */:
                C2739 c2739 = C2739.f8812;
                String[] strArr5 = AbstractC1574.f5469;
                c2739.m2548("${originalText} | ${time} | ${type}");
                C2740.f8813.m2548("HH:mm:ss");
                C2738.f8811.m2543(false);
                return unit;
            case 15:
                C2766 c2766 = C2766.f8855;
                String[] strArr6 = AbstractC1574.f5469;
                c2766.m2548("wx8dd6ecd81906fd84");
                C2767.f8856.m2548("网抑云音乐");
                return unit;
            case 16:
                return new C0258(C2975.f9519);
            case 17 /* 17 */:
                return new C0258(C3351.f10566);
            case 18 /* 18 */:
                return new C0258(C2993.f9635);
            case 19:
                return new C0258(C2951.f9453);
            case 20:
                return new C0258(C3261.f10367);
            case 21 /* 21 */:
                return new C0258(C3243.f10297);
            case 22 /* 22 */:
                return new C0258(C3376.f10633);
            case 23 /* 23 */:
                return new C0258(C2839.f9108);
            case 24 /* 24 */:
                return new C0258(C3056.f9790);
            case 25 /* 25 */:
                return new C0258(C3029.f9728);
            case 26:
                return new C0258(C3068.f9827);
            case 27:
                return new C0258(C3029.f9728);
            case 28:
                return new C0258(C3195.f10213);
            default:
                return new C0258(C3138.f9996);
        }
    }

    public /* synthetic */ C2083(C1895 c1895) {
        this.f6888 = 4;
    }
}
