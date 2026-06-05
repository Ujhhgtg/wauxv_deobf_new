package p000;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0478Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2391Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0478Ujhhgtgfeyxiexzf(int i) {
        this.f2391Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        int i = this.f2391Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0481Ujhhgtgfeyxiexzf c0481Ujhhgtgfeyxiexzf = C0481Ujhhgtgfeyxiexzf.f2395Ujhhgtgfeyxiexzf;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0481Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#11000000");
                C0484Ujhhgtgfeyxiexzf.f2398Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                C0477Ujhhgtgfeyxiexzf.f2390Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#11FFFFFF");
                C0485Ujhhgtgfeyxiexzf.f2399Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                C0488Ujhhgtgfeyxiexzf.f2402Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("${time} | ${type}");
                C0487Ujhhgtgfeyxiexzf.f2401Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("HH:mm:ss");
                C0482Ujhhgtgfeyxiexzf.f2396Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(64);
                C0483Ujhhgtgfeyxiexzf.f2397Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(64);
                C0486Ujhhgtgfeyxiexzf.f2400Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(10);
                C0491Ujhhgtgfeyxiexzf.f2410Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(true);
                C0492Ujhhgtgfeyxiexzf.f2411Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(true);
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "隐藏中");
                AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C0503Ujhhgtgfeyxiexzf.f2430Ujhhgtgfeyxiexzf, new C0317Ujhhgtgfeyxiexzf(29));
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "显示中");
                AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C0503Ujhhgtgfeyxiexzf.f2430Ujhhgtgfeyxiexzf, new C0317Ujhhgtgfeyxiexzf(28));
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0508Ujhhgtgfeyxiexzf c0508Ujhhgtgfeyxiexzf = C0508Ujhhgtgfeyxiexzf.f2441Ujhhgtgfeyxiexzf;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0508Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF000000");
                C0515Ujhhgtgfeyxiexzf.f2459Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF000000");
                C0505Ujhhgtgfeyxiexzf.f2435Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                C0507Ujhhgtgfeyxiexzf.f2440Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF000000");
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                return new C2379Ujhhgtgfeyxiexzf(C1259feyxiexzfUjhhgtg.f4624Ujhhgtgfeyxiexzf);
            case 5:
                return new Handler(Looper.getMainLooper());
            case 6:
                C1189feyxiexzfUjhhgtg c1189feyxiexzfUjhhgtg = C1189feyxiexzfUjhhgtg.f4477Ujhhgtgfeyxiexzf;
                InterfaceC1121feyxiexzfUjhhgtg[] interfaceC1121feyxiexzfUjhhgtgArr = new InterfaceC1121feyxiexzfUjhhgtg[0];
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (c1189feyxiexzfUjhhgtg.equals(C1189feyxiexzfUjhhgtg.f4474Ujhhgtgfeyxiexzf)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                C2840feyxiexzfUjhhgtg c2840feyxiexzfUjhhgtg = new C2840feyxiexzfUjhhgtg("kotlin.Unit");
                return new C1103feyxiexzfUjhhgtg("kotlin.Unit", c1189feyxiexzfUjhhgtg, c2840feyxiexzfUjhhgtg.f9021Ujhhgtgfeyxiexzf.size(), AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtgArr), c2840feyxiexzfUjhhgtg);
            case 7:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String str = "打开详情";
                String str2 = "";
                String str3 = "确定";
                C0685Ujhhgtgfeyxiexzf c0685Ujhhgtgfeyxiexzf = new C0685Ujhhgtgfeyxiexzf();
                AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                c0685Ujhhgtgfeyxiexzf.f995Ujhhgtgfeyxiexzf = true;
                c0685Ujhhgtgfeyxiexzf.f2169feyxiexzfUjhhgtg = str;
                c0685Ujhhgtgfeyxiexzf.f2170feyxiexzfUjhhgtg = str2;
                c0685Ujhhgtgfeyxiexzf.f2171feyxiexzfUjhhgtg = str3;
                c0685Ujhhgtgfeyxiexzf.f2176feyxiexzfUjhhgtg = new C1465feyxiexzfUjhhgtg();
                c0685Ujhhgtgfeyxiexzf.m1681feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                return AbstractC3612feyxiexzfUjhhgtg.m5231Ujhhgtgfeyxiexzf(new C1269feyxiexzfUjhhgtg(15));
            case 9:
                return Environment.getExternalStorageDirectory().getAbsolutePath();
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append((String) AbstractC1389feyxiexzfUjhhgtg.f4886Ujhhgtgfeyxiexzf.getValue());
                sb.append("/Android/media/");
                C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                sb.append(C0580Ujhhgtgfeyxiexzf.m1856Ujhhgtgfeyxiexzf());
                return sb.toString();
            case 11:
                Process.killProcess(Process.myPid());
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                C0766feyxiexzfUjhhgtg c0766feyxiexzfUjhhgtg = C0766feyxiexzfUjhhgtg.f3043Ujhhgtgfeyxiexzf;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0766feyxiexzfUjhhgtg.m4629Ujhhgtgfeyxiexzf("[有人回我]");
                C0767feyxiexzfUjhhgtg.f3044Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFE14949");
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                C1097feyxiexzfUjhhgtg c1097feyxiexzfUjhhgtg = C1097feyxiexzfUjhhgtg.f4179Ujhhgtgfeyxiexzf;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c1097feyxiexzfUjhhgtg.m4629Ujhhgtgfeyxiexzf("${time} ${nick}");
                C1078feyxiexzfUjhhgtg.f4150Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("yyyy-MM-dd");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C1905feyxiexzfUjhhgtg c1905feyxiexzfUjhhgtg = new C1905feyxiexzfUjhhgtg();
                c1905feyxiexzfUjhhgtg.f6365Ujhhgtgfeyxiexzf = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
                return c1905feyxiexzfUjhhgtg;
            case 15:
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3658Ujhhgtgfeyxiexzf c3658UjhhgtgfeyxiexzfM2017Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.storage.emotion.SmileyPanelConfigInfo")).m2017Ujhhgtgfeyxiexzf();
                c3658UjhhgtgfeyxiexzfM2017Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class)}, 2));
                return (C3660Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3658UjhhgtgfeyxiexzfM2017Ujhhgtgfeyxiexzf.m5356Ujhhgtgfeyxiexzf());
            case 16:
                C1033feyxiexzfUjhhgtg.f4038Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(C1066feyxiexzfUjhhgtg.f4128Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C1050feyxiexzfUjhhgtg c1050feyxiexzfUjhhgtg = C1050feyxiexzfUjhhgtg.f4101Ujhhgtgfeyxiexzf;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c1050feyxiexzfUjhhgtg.m4629Ujhhgtgfeyxiexzf("${originalText} | ${time} | ${type}");
                C1051feyxiexzfUjhhgtg.f4102Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("HH:mm:ss");
                C1054feyxiexzfUjhhgtg.f4105Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(false);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C1211feyxiexzfUjhhgtg c1211feyxiexzfUjhhgtg = C1211feyxiexzfUjhhgtg.f4516Ujhhgtgfeyxiexzf;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c1211feyxiexzfUjhhgtg.m4629Ujhhgtgfeyxiexzf("wx8dd6ecd81906fd84");
                C1207feyxiexzfUjhhgtg.f4509Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("网抑云音乐");
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                return new C2379Ujhhgtgfeyxiexzf(C2045feyxiexzfUjhhgtg.f6743Ujhhgtgfeyxiexzf);
            case 20:
                return new C2379Ujhhgtgfeyxiexzf(C1817feyxiexzfUjhhgtg.f6117Ujhhgtgfeyxiexzf);
            case Opcodes.ILOAD /* 21 */:
                return new C2379Ujhhgtgfeyxiexzf(C2185feyxiexzfUjhhgtg.f7116Ujhhgtgfeyxiexzf);
            case Opcodes.LLOAD /* 22 */:
                return new C2379Ujhhgtgfeyxiexzf(C2021feyxiexzfUjhhgtg.f6633Ujhhgtgfeyxiexzf);
            case Opcodes.FLOAD /* 23 */:
                return new C2379Ujhhgtgfeyxiexzf(C1700feyxiexzfUjhhgtg.f5685Ujhhgtgfeyxiexzf);
            case Opcodes.DLOAD /* 24 */:
                return new C2379Ujhhgtgfeyxiexzf(C1682feyxiexzfUjhhgtg.f5649Ujhhgtgfeyxiexzf);
            case Opcodes.ALOAD /* 25 */:
                return new C2379Ujhhgtgfeyxiexzf(C1822Ujhhgtgfeyxiexzf.f6145Ujhhgtgfeyxiexzf);
            case 26:
                return new C2379Ujhhgtgfeyxiexzf(C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf);
            case 27:
                return new C2379Ujhhgtgfeyxiexzf(C2121feyxiexzfUjhhgtg.f6926Ujhhgtgfeyxiexzf);
            case 28:
                return new C2379Ujhhgtgfeyxiexzf(C2099Ujhhgtgfeyxiexzf.f6875Ujhhgtgfeyxiexzf);
            default:
                return new C2379Ujhhgtgfeyxiexzf(C2132Ujhhgtgfeyxiexzf.f6952Ujhhgtgfeyxiexzf);
        }
    }

    public /* synthetic */ C0478Ujhhgtgfeyxiexzf(C0204Ujhhgtgfeyxiexzf c0204Ujhhgtgfeyxiexzf) {
        this.f2391Ujhhgtgfeyxiexzf = 6;
    }
}
