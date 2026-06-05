package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3471Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10795Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3471Ujhhgtgfeyxiexzf(int i) {
        this.f10795Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        Bitmap bitmapM4203feyxiexzfUjhhgtg;
        Bitmap bitmapM4203feyxiexzfUjhhgtg2;
        int i = this.f10795Ujhhgtgfeyxiexzf;
        int i2 = 1;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3482Ujhhgtgfeyxiexzf c3482Ujhhgtgfeyxiexzf = C3482Ujhhgtgfeyxiexzf.f10817Ujhhgtgfeyxiexzf;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3482Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFF7F7F7");
                C3484feyxiexzfUjhhgtg.f10819Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF1E1E1E");
                C3486feyxiexzfUjhhgtg.f10826Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF1E1E1E");
                C3481Ujhhgtgfeyxiexzf.f10816Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFF7F7F7");
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3526Ujhhgtgfeyxiexzf.f11017Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("E HH:mm");
                C3523Ujhhgtgfeyxiexzf.f11006Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(EnumC3524Ujhhgtgfeyxiexzf.f11008Ujhhgtgfeyxiexzf.f11011Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                return new Handler(Looper.getMainLooper());
            case 3:
                return AbstractC3612feyxiexzfUjhhgtg.m5231Ujhhgtgfeyxiexzf(new C3528Ujhhgtgfeyxiexzf(i2));
            case 4:
                C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class);
                C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
                return new C0977feyxiexzfUjhhgtg(c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf);
            case 5:
                return new C0630Ujhhgtgfeyxiexzf(new int[]{Color.parseColor(C0640Ujhhgtgfeyxiexzf.f2690Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()), Color.parseColor(C0641Ujhhgtgfeyxiexzf.f2691Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf())}, Color.parseColor(C0642Ujhhgtgfeyxiexzf.f2692Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            case 6:
                return new C0630Ujhhgtgfeyxiexzf(new int[]{Color.parseColor(C0631Ujhhgtgfeyxiexzf.f2681Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()), Color.parseColor(C0632Ujhhgtgfeyxiexzf.f2682Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf())}, Color.parseColor(C0633Ujhhgtgfeyxiexzf.f2683Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            case 7:
                return new C0630Ujhhgtgfeyxiexzf(new int[]{Color.parseColor(C0637Ujhhgtgfeyxiexzf.f2687Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()), Color.parseColor(C0638Ujhhgtgfeyxiexzf.f2688Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf())}, Color.parseColor(C0639Ujhhgtgfeyxiexzf.f2689Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            case 8:
                C0640Ujhhgtgfeyxiexzf c0640Ujhhgtgfeyxiexzf = C0640Ujhhgtgfeyxiexzf.f2690Ujhhgtgfeyxiexzf;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0640Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFF9E8C8");
                C0641Ujhhgtgfeyxiexzf.f2691Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFEF3D6");
                C0642Ujhhgtgfeyxiexzf.f2692Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFE87A20");
                C0631Ujhhgtgfeyxiexzf.f2681Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFA3F0E6");
                C0632Ujhhgtgfeyxiexzf.f2682Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFE0F7F4");
                C0633Ujhhgtgfeyxiexzf.f2683Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF3AAE9D");
                C0634Ujhhgtgfeyxiexzf.f2684Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFF2D5F8");
                C0635Ujhhgtgfeyxiexzf.f2685Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFF9EBFC");
                C0636Ujhhgtgfeyxiexzf.f2686Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFA64BDB");
                C0637Ujhhgtgfeyxiexzf.f2687Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFD8D8D8");
                C0638Ujhhgtgfeyxiexzf.f2688Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFE0E0E0");
                C0639Ujhhgtgfeyxiexzf.f2689Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF666666");
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C0640Ujhhgtgfeyxiexzf c0640Ujhhgtgfeyxiexzf2 = C0640Ujhhgtgfeyxiexzf.f2690Ujhhgtgfeyxiexzf;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0640Ujhhgtgfeyxiexzf2.m4629Ujhhgtgfeyxiexzf("#FFFFD56A");
                C0641Ujhhgtgfeyxiexzf.f2691Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFE87A");
                C0642Ujhhgtgfeyxiexzf.f2692Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                C0631Ujhhgtgfeyxiexzf.f2681Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF4DD5CC");
                C0632Ujhhgtgfeyxiexzf.f2682Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF68E8DF");
                C0633Ujhhgtgfeyxiexzf.f2683Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                C0634Ujhhgtgfeyxiexzf.f2684Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFD0A3FF");
                C0635Ujhhgtgfeyxiexzf.f2685Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFEFBFFF");
                C0636Ujhhgtgfeyxiexzf.f2686Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                C0637Ujhhgtgfeyxiexzf.f2687Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF95A0B8");
                C0638Ujhhgtgfeyxiexzf.f2688Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFA8B2C9");
                C0639Ujhhgtgfeyxiexzf.f2689Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFFFFFFF");
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C0525Ujhhgtgfeyxiexzf c0525Ujhhgtgfeyxiexzf = C0525Ujhhgtgfeyxiexzf.f2482Ujhhgtgfeyxiexzf;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0525Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#28C445");
                C0533Ujhhgtgfeyxiexzf.f2501Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("退出了此群");
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Intent.class));
                c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "mExtras";
                return (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf());
            case Opcodes.FCONST_1 /* 12 */:
                C0557Ujhhgtgfeyxiexzf.f2558Ujhhgtgfeyxiexzf.m4628Ujhhgtgfeyxiexzf(C0558Ujhhgtgfeyxiexzf.f2560Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                int i4 = ImmLeaksCleaner.f0Ujhhgtgfeyxiexzf;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new C0661Ujhhgtgfeyxiexzf();
                } catch (NoSuchFieldException unused) {
                    return C0661Ujhhgtgfeyxiexzf.f2774Ujhhgtgfeyxiexzf;
                }
            case Opcodes.DCONST_0 /* 14 */:
                return C0159Ujhhgtgfeyxiexzf.f1331Ujhhgtgfeyxiexzf;
            case 15:
                return C0132Ujhhgtgfeyxiexzf.f1281Ujhhgtgfeyxiexzf;
            case 16:
                return C0124Ujhhgtgfeyxiexzf.f1272Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                return C0129Ujhhgtgfeyxiexzf.f1276Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                return C0133Ujhhgtgfeyxiexzf.f1283Ujhhgtgfeyxiexzf;
            case 19:
                return AbstractC0261Ujhhgtgfeyxiexzf.m1437Ujhhgtgfeyxiexzf("KavaRef");
            case 20:
                return Boolean.valueOf(AbstractC2842feyxiexzfUjhhgtg.m4171Ujhhgtgfeyxiexzf(C0147Ujhhgtgfeyxiexzf.class.getClassLoader(), "android.os.Build"));
            case Opcodes.ILOAD /* 21 */:
                C0248Ujhhgtgfeyxiexzf.f1579Ujhhgtgfeyxiexzf.m4625Ujhhgtgfeyxiexzf(31.135633f);
                C0247Ujhhgtgfeyxiexzf.f1578Ujhhgtgfeyxiexzf.m4625Ujhhgtgfeyxiexzf(121.66625f);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0248Ujhhgtgfeyxiexzf c0248Ujhhgtgfeyxiexzf = C0248Ujhhgtgfeyxiexzf.f1579Ujhhgtgfeyxiexzf;
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf2 = null;
                if (c0328Ujhhgtgfeyxiexzf == null) {
                    "binding";
                    c0328Ujhhgtgfeyxiexzf = null;
                }
                c0248Ujhhgtgfeyxiexzf.m4625Ujhhgtgfeyxiexzf(Float.parseFloat(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf.f1933Ujhhgtgfeyxiexzf)));
                C0247Ujhhgtgfeyxiexzf c0247Ujhhgtgfeyxiexzf = C0247Ujhhgtgfeyxiexzf.f1578Ujhhgtgfeyxiexzf;
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf3 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                if (c0328Ujhhgtgfeyxiexzf3 == null) {
                    "binding";
                } else {
                    c0328Ujhhgtgfeyxiexzf2 = c0328Ujhhgtgfeyxiexzf3;
                }
                c0247Ujhhgtgfeyxiexzf.m4625Ujhhgtgfeyxiexzf(Float.parseFloat(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf2.f1934Ujhhgtgfeyxiexzf)));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            case Opcodes.ALOAD /* 25 */:
                C0333Ujhhgtgfeyxiexzf c0333Ujhhgtgfeyxiexzf = C0333Ujhhgtgfeyxiexzf.f1951Ujhhgtgfeyxiexzf;
                File file = new File(C0333Ujhhgtgfeyxiexzf.f1952Ujhhgtgfeyxiexzf, "right_bubble.9.png");
                if (file.exists() && (bitmapM4203feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4203feyxiexzfUjhhgtg(file)) != null) {
                    return bitmapM4203feyxiexzfUjhhgtg;
                }
                c0333Ujhhgtgfeyxiexzf.getClass();
                return (Bitmap) C0333Ujhhgtgfeyxiexzf.f1953Ujhhgtgfeyxiexzf.getValue();
            case 26:
                C0333Ujhhgtgfeyxiexzf c0333Ujhhgtgfeyxiexzf2 = C0333Ujhhgtgfeyxiexzf.f1951Ujhhgtgfeyxiexzf;
                File file2 = new File(C0333Ujhhgtgfeyxiexzf.f1952Ujhhgtgfeyxiexzf, "left_bubble.9.png");
                if (file2.exists() && (bitmapM4203feyxiexzfUjhhgtg2 = AbstractC2855feyxiexzfUjhhgtg.m4203feyxiexzfUjhhgtg(file2)) != null) {
                    return bitmapM4203feyxiexzfUjhhgtg2;
                }
                c0333Ujhhgtgfeyxiexzf2.getClass();
                return (Bitmap) C0333Ujhhgtgfeyxiexzf.f1953Ujhhgtgfeyxiexzf.getValue();
            case 27:
                C0352Ujhhgtgfeyxiexzf c0352Ujhhgtgfeyxiexzf = C0352Ujhhgtgfeyxiexzf.f1995Ujhhgtgfeyxiexzf;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0352Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#00000000");
                C0334Ujhhgtgfeyxiexzf.f1960Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#00000000");
                C0349Ujhhgtgfeyxiexzf.f1991Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#00000000");
                C0351Ujhhgtgfeyxiexzf.f1994Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#00000000");
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C0331Ujhhgtgfeyxiexzf c0331Ujhhgtgfeyxiexzf = C0331Ujhhgtgfeyxiexzf.f1949Ujhhgtgfeyxiexzf;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0331Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFE4E9FC");
                C0332Ujhhgtgfeyxiexzf.f1950Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#11000000");
                C0342Ujhhgtgfeyxiexzf.f1972Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFD7FAE4");
                C0341Ujhhgtgfeyxiexzf.f1971Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#11000000");
                C0336Ujhhgtgfeyxiexzf.f1962Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FF3D3D3D");
                C0335Ujhhgtgfeyxiexzf.f1961Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#11000000");
                C0340Ujhhgtgfeyxiexzf.f1970Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#FFD7FAE4");
                C0339Ujhhgtgfeyxiexzf.f1969Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("#11000000");
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C0494Ujhhgtgfeyxiexzf c0494Ujhhgtgfeyxiexzf = C0494Ujhhgtgfeyxiexzf.f2413Ujhhgtgfeyxiexzf;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0494Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("${sendText}喵~");
                C0495Ujhhgtgfeyxiexzf.f2414Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf("HH:mm:ss");
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
