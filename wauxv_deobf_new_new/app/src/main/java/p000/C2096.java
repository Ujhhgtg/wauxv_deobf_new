package p000;

import android.os.Environment;
import android.os.Process;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᤝᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2096 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6984;

    public /* synthetic */ C2096(int i) {
        this.f6984 = i;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        int i = this.f6984;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C2101 c2101 = C2101.f6989;
                String[] strArr = AbstractC1471.f5234;
                c2101.m2672("#11000000");
                C2102.f6990.m2672("#FFFFFFFF");
                C2097.f6985.m2672("#11FFFFFF");
                C2098.f6986.m2672("#FFFFFFFF");
                C2106.f6994.m2672("${time} | ${type}");
                C2107.f6995.m2672("HH:mm:ss");
                C2100.f6988.m2669(64);
                C2103.f6991.m2669(64);
                C2099.f6987.m2669(10);
                C2104.f6992.m2667(true);
                C2105.f6993.m2667(true);
                return c3554;
            case 1:
                AbstractC2894.m4856(null, 3, "隐藏中");
                C1787.m3673(C2116.f7012, new C2059(29));
                return c3554;
            case 2:
                AbstractC2894.m4856(null, 3, "显示中");
                C1787.m3673(C2116.f7012, new C2059(28));
                return c3554;
            case 3:
                C2126 c2126 = C2126.f7028;
                String[] strArr2 = AbstractC1471.f5234;
                c2126.m2672("#FF000000");
                C2128.f7030.m2672("#FF000000");
                C2125.f7027.m2672("#FFFFFFFF");
                C2127.f7029.m2672("#FF000000");
                return c3554;
            case 4:
                return new C0268(C2247.f7314);
            case 5:
                C2911 c2911 = C2911.f9283;
                InterfaceC2715[] interfaceC2715Arr = new InterfaceC2715[0];
                if (AbstractC2901.m4869("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (c2911.equals(C2911.f9280)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                C0703 c0703 = new C0703("kotlin.Unit");
                return new C2717("kotlin.Unit", c2911, c0703.f2685.size(), AbstractC0280.m1535(interfaceC2715Arr), c0703);
            case 6:
                String[] strArr3 = AbstractC1471.f5234;
                String str = "打开详情";
                String str2 = "";
                String str3 = "确定";
                C1657 c1657 = new C1657();
                AbstractC1469 abstractC1469 = AbstractC1037.f3785;
                c1657.f981 = true;
                c1657.f6606 = str;
                c1657.f6607 = str2;
                c1657.f6608 = str3;
                c1657.f6613 = new C2330();
                c1657.m3985();
                return c3554;
            case 7:
                return AbstractC2235.m4192(new C2262(15));
            case 8:
                return Environment.getExternalStorageDirectory().getAbsolutePath();
            case 9:
                StringBuilder sb = new StringBuilder();
                sb.append((String) AbstractC2381.f7642.getValue());
                sb.append("/Android/media/");
                C1576.f5470.getClass();
                sb.append(C1576.m3457());
                return sb.toString();
            case 10:
                Process.killProcess(Process.myPid());
                return c3554;
            case 11:
                C2510 c2510 = C2510.f7947;
                String[] strArr4 = AbstractC1471.f5234;
                c2510.m2672("[有人回我]");
                C2509.f7946.m2672("#FFE14949");
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C2691 c2691 = C2691.f8684;
                String[] strArr5 = AbstractC1471.f5234;
                c2691.m2672("${time} ${nick}");
                C2692.f8685.m2672("yyyy-MM-dd");
                return c3554;
            case 13:
                C3622 c3622 = new C3622();
                c3622.f11322 = C1191.f4326;
                return c3622;
            case Opcodes.DCONST_0 /* 14 */:
                int i2 = AbstractC1768.f5906;
                C0795 c0795M3555 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.storage.emotion.SmileyPanelConfigInfo")).m3555();
                c0795M3555.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(Integer.TYPE), AbstractC2574.m4549(String.class)}, 2));
                return (C0797) AbstractC0739.m2290(c0795M3555.m2459());
            case 15:
                C2781.f8942.m2672(C2782.f8944);
                return c3554;
            case 16:
                C2798 c2798 = C2798.f8973;
                String[] strArr6 = AbstractC1471.f5234;
                c2798.m2672("${originalText} | ${time} | ${type}");
                C2799.f8974.m2672("HH:mm:ss");
                C2797.f8972.m2667(false);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C2825 c2825 = C2825.f9016;
                String[] strArr7 = AbstractC1471.f5234;
                c2825.m2672("wx8dd6ecd81906fd84");
                C2826.f9017.m2672("网抑云音乐");
                return c3554;
            case Opcodes.LDC /* 18 */:
                return new C0268(C3034.f9686);
            case 19:
                return new C0268(C3410.f10733);
            case 20:
                return new C0268(C3052.f9802);
            case Opcodes.ILOAD /* 21 */:
                return new C0268(C3010.f9620);
            case Opcodes.LLOAD /* 22 */:
                return new C0268(C3320.f10534);
            case Opcodes.FLOAD /* 23 */:
                return new C0268(C3302.f10464);
            case Opcodes.DLOAD /* 24 */:
                return new C0268(C3435.f10800);
            case Opcodes.ALOAD /* 25 */:
                return new C0268(C2899.f9270);
            case 26:
                return new C0268(C3115.f9957);
            case 27:
                return new C0268(C3088.f9895);
            case 28:
                return new C0268(C3127.f9994);
            default:
                return new C0268(C3088.f9895);
        }
    }

    public /* synthetic */ C2096(C1921 c1921) {
        this.f6984 = 5;
    }
}
