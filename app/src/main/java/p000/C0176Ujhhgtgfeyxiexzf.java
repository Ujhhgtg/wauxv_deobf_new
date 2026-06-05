package p000;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ能不能ᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0176Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1379Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0176Ujhhgtgfeyxiexzf(int i) {
        this.f1379Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        EnumC0297Ujhhgtgfeyxiexzf enumC0297Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg3;
        boolean zIsAssignableFrom;
        int i = this.f1379Ujhhgtgfeyxiexzf;
        int i2 = 3;
        Object obj2 = null;
        int i3 = 1;
        int i4 = 12;
        int i5 = 4;
        int i6 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.luckymoney.model");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.LuckyMoneyUtil", "exception:%s");
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(i5));
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.MMAlert");
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(8);
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(9));
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                C0181Ujhhgtgfeyxiexzf.f1386Ujhhgtgfeyxiexzf.getClass();
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1654Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0186Ujhhgtgfeyxiexzf.f1391Ujhhgtgfeyxiexzf));
                Class<Class> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Class.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Class.class);
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(11);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(14));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(13));
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = (C0394Ujhhgtgfeyxiexzf) obj;
                Class clsM2261feyxiexzfUjhhgtg = C0854feyxiexzfUjhhgtg.f3346Ujhhgtgfeyxiexzf.m2261feyxiexzfUjhhgtg();
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.class));
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(clsM2261feyxiexzfUjhhgtg, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Integer.class);
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = new C0300Ujhhgtgfeyxiexzf();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1660feyxiexzfUjhhgtg("notifyDataSetChanged");
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3);
                c0394Ujhhgtgfeyxiexzf2.f2140Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.MMPreferenceAdapter", "ignore notifyDataSetChanged(%s %s), had:%s");
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(17);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = "com.tencent.mm.ui.MMFragmentActivity";
                Activity activity = (Activity) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "mViewPager";
                ViewGroup viewGroup = (ViewGroup) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "mTabsAdapter";
                Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                for (InterfaceC0611Ujhhgtgfeyxiexzf interfaceC0611Ujhhgtgfeyxiexzf : C0163Ujhhgtgfeyxiexzf.f1348Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0611Ujhhgtgfeyxiexzf.mo1873Ujhhgtgfeyxiexzf(activity, viewGroup, objM4938Ujhhgtgfeyxiexzf);
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        sb.append("doOnCreate ");
                        sb.append(interfaceC0611Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0611Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, " Failed", e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1659feyxiexzfUjhhgtg("com.tencent.mm.ui.MainTabUI");
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("MicroMsg.LauncherUI.MainTabUI", "doOnCreate");
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
                C0117Ujhhgtgfeyxiexzf c0117Ujhhgtgfeyxiexzf = C0117Ujhhgtgfeyxiexzf.f1265Ujhhgtgfeyxiexzf;
                C2840feyxiexzfUjhhgtg c2840feyxiexzfUjhhgtg = (C2840feyxiexzfUjhhgtg) obj;
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "key", C1157feyxiexzfUjhhgtg.f4353Ujhhgtgfeyxiexzf);
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "value", C0117Ujhhgtgfeyxiexzf.f1266Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(20);
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(22));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                Member member = ((C0573Ujhhgtgfeyxiexzf) c0578Ujhhgtgfeyxiexzf2.f2598Ujhhgtgfeyxiexzf.f1470Ujhhgtgfeyxiexzf).f2590Ujhhgtgfeyxiexzf.method;
                if (member == null) {
                    throw new IllegalStateException("Current hooked Member is null");
                }
                Method method = member instanceof Method ? (Method) member : null;
                if (method == null) {
                    throw new IllegalStateException("Current hooked Member is not a Method");
                }
                C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = method.getParameterCount() == 16 ? new C1381feyxiexzfUjhhgtg(3, 4) : new C1381feyxiexzfUjhhgtg(2, 3);
                int iIntValue = ((Number) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf).intValue();
                int iIntValue2 = ((Number) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).intValue();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[iIntValue];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Integer num = (Integer) c0919feyxiexzfUjhhgtg;
                int iIntValue3 = num != null ? num.intValue() : 0;
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[iIntValue2];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                Integer num2 = (Integer) c0919feyxiexzfUjhhgtg2;
                int iIntValue4 = num2 != null ? num2.intValue() : 0;
                C3369feyxiexzfUjhhgtg c3369feyxiexzfUjhhgtg = EnumC0297Ujhhgtgfeyxiexzf.f1754Ujhhgtgfeyxiexzf;
                c3369feyxiexzfUjhhgtg.getClass();
                C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = new C2930Ujhhgtgfeyxiexzf(0, c3369feyxiexzfUjhhgtg);
                while (c2930Ujhhgtgfeyxiexzf.hasNext()) {
                    Object next = c2930Ujhhgtgfeyxiexzf.next();
                    EnumC0297Ujhhgtgfeyxiexzf enumC0297Ujhhgtgfeyxiexzf2 = (EnumC0297Ujhhgtgfeyxiexzf) next;
                    if (enumC0297Ujhhgtgfeyxiexzf2.f1755Ujhhgtgfeyxiexzf == iIntValue3 && enumC0297Ujhhgtgfeyxiexzf2.f1756Ujhhgtgfeyxiexzf == iIntValue4) {
                        obj2 = next;
                        enumC0297Ujhhgtgfeyxiexzf = (EnumC0297Ujhhgtgfeyxiexzf) obj2;
                        if (enumC0297Ujhhgtgfeyxiexzf != EnumC0297Ujhhgtgfeyxiexzf.f1751Ujhhgtgfeyxiexzf || enumC0297Ujhhgtgfeyxiexzf == EnumC0297Ujhhgtgfeyxiexzf.f1752Ujhhgtgfeyxiexzf) {
                            int i8 = 6;
                            C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = new C2501feyxiexzfUjhhgtg(iIntValue, i8, c0578Ujhhgtgfeyxiexzf2);
                            EnumC0297Ujhhgtgfeyxiexzf enumC0297Ujhhgtgfeyxiexzf3 = EnumC0297Ujhhgtgfeyxiexzf.f1750Ujhhgtgfeyxiexzf;
                            c2501feyxiexzfUjhhgtg.m3786Ujhhgtgfeyxiexzf(Integer.valueOf(enumC0297Ujhhgtgfeyxiexzf3.f1755Ujhhgtgfeyxiexzf));
                            new C2501feyxiexzfUjhhgtg(iIntValue2, i8, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(Integer.valueOf(enumC0297Ujhhgtgfeyxiexzf3.f1756Ujhhgtgfeyxiexzf));
                        }
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                enumC0297Ujhhgtgfeyxiexzf = (EnumC0297Ujhhgtgfeyxiexzf) obj2;
                if (enumC0297Ujhhgtgfeyxiexzf != EnumC0297Ujhhgtgfeyxiexzf.f1751Ujhhgtgfeyxiexzf) {
                    int i9 = 6;
                    C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg2 = new C2501feyxiexzfUjhhgtg(iIntValue, i9, c0578Ujhhgtgfeyxiexzf2);
                    EnumC0297Ujhhgtgfeyxiexzf enumC0297Ujhhgtgfeyxiexzf4 = EnumC0297Ujhhgtgfeyxiexzf.f1750Ujhhgtgfeyxiexzf;
                    c2501feyxiexzfUjhhgtg2.m3786Ujhhgtgfeyxiexzf(Integer.valueOf(enumC0297Ujhhgtgfeyxiexzf4.f1755Ujhhgtgfeyxiexzf));
                    new C2501feyxiexzfUjhhgtg(iIntValue2, i9, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(Integer.valueOf(enumC0297Ujhhgtgfeyxiexzf4.f1756Ujhhgtgfeyxiexzf));
                } else {
                    int i10 = 6;
                    C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg3 = new C2501feyxiexzfUjhhgtg(iIntValue, i10, c0578Ujhhgtgfeyxiexzf2);
                    EnumC0297Ujhhgtgfeyxiexzf enumC0297Ujhhgtgfeyxiexzf5 = EnumC0297Ujhhgtgfeyxiexzf.f1750Ujhhgtgfeyxiexzf;
                    c2501feyxiexzfUjhhgtg3.m3786Ujhhgtgfeyxiexzf(Integer.valueOf(enumC0297Ujhhgtgfeyxiexzf5.f1755Ujhhgtgfeyxiexzf));
                    new C2501feyxiexzfUjhhgtg(iIntValue2, i10, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(Integer.valueOf(enumC0297Ujhhgtgfeyxiexzf5.f1756Ujhhgtgfeyxiexzf));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.QBarStringHandler", "key_offline_scan_show_tips");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                ContextMenu contextMenu = (ContextMenu) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = new C2065feyxiexzfUjhhgtg(new C3404Ujhhgtgfeyxiexzf(contextMenu, i5));
                int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf3);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4.f10725Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(24);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((View.OnClickListener) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "d";
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(List.class);
                List list = (List) ((C0393Ujhhgtgfeyxiexzf) AbstractC3317feyxiexzfUjhhgtg.m4794Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new MsgInfoBean(it.next()));
                }
                for (InterfaceC0612Ujhhgtgfeyxiexzf interfaceC0612Ujhhgtgfeyxiexzf : C0348Ujhhgtgfeyxiexzf.f1990Ujhhgtgfeyxiexzf) {
                    try {
                        for (C0313Ujhhgtgfeyxiexzf c0313Ujhhgtgfeyxiexzf : interfaceC0612Ujhhgtgfeyxiexzf.mo1538Ujhhgtgfeyxiexzf(arrayList2)) {
                            C0393Ujhhgtgfeyxiexzf c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf = ((C0393Ujhhgtgfeyxiexzf) c2065feyxiexzfUjhhgtg.getValue()).m1648Ujhhgtgfeyxiexzf();
                            c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf.m1940Ujhhgtgfeyxiexzf(contextMenu);
                            c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(Integer.valueOf(c0313Ujhhgtgfeyxiexzf.f1866Ujhhgtgfeyxiexzf), c0313Ujhhgtgfeyxiexzf.f1867Ujhhgtgfeyxiexzf);
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC0612Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0612Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, " Failed", e2, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(View.OnClickListener.class);
                ConcurrentHashMap concurrentHashMap = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                zIsAssignableFrom = c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.mo2998Ujhhgtgfeyxiexzf().isAssignableFrom((Class) obj);
                break;
            case Opcodes.ALOAD /* 25 */:
                C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf2 = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(View.OnClickListener.class);
                ConcurrentHashMap concurrentHashMap2 = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                zIsAssignableFrom = c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf2.mo2998Ujhhgtgfeyxiexzf().isAssignableFrom((Class) obj);
                break;
            case 26:
                C3433feyxiexzfUjhhgtg c3433feyxiexzfUjhhgtg = (C3433feyxiexzfUjhhgtg) obj;
                C0317Ujhhgtgfeyxiexzf c0317Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(i3);
                c3433feyxiexzfUjhhgtg.getClass();
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg = new C3426feyxiexzfUjhhgtg();
                c0317Ujhhgtgfeyxiexzf.invoke(c3426feyxiexzfUjhhgtg);
                List arrayList4 = c3433feyxiexzfUjhhgtg.f10699Ujhhgtgfeyxiexzf;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c3433feyxiexzfUjhhgtg.f10699Ujhhgtgfeyxiexzf = arrayList4;
                arrayList4.add(c3426feyxiexzfUjhhgtg);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf2 = (C0300Ujhhgtgfeyxiexzf) obj;
                c0300Ujhhgtgfeyxiexzf2.getClass();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1660feyxiexzfUjhhgtg("onMMMenuItemSelected");
                c0300Ujhhgtgfeyxiexzf2.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf4);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C3433feyxiexzfUjhhgtg c3433feyxiexzfUjhhgtg2 = (C3433feyxiexzfUjhhgtg) obj;
                C0317Ujhhgtgfeyxiexzf c0317Ujhhgtgfeyxiexzf2 = new C0317Ujhhgtgfeyxiexzf(i6);
                c3433feyxiexzfUjhhgtg2.getClass();
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg2 = new C3426feyxiexzfUjhhgtg();
                c0317Ujhhgtgfeyxiexzf2.invoke(c3426feyxiexzfUjhhgtg2);
                List arrayList5 = c3433feyxiexzfUjhhgtg2.f10699Ujhhgtgfeyxiexzf;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                c3433feyxiexzfUjhhgtg2.f10699Ujhhgtgfeyxiexzf = arrayList5;
                arrayList5.add(c3426feyxiexzfUjhhgtg2);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf3 = (C0300Ujhhgtgfeyxiexzf) obj;
                c0300Ujhhgtgfeyxiexzf3.getClass();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf5.m1660feyxiexzfUjhhgtg("onCreateMMMenu");
                c0300Ujhhgtgfeyxiexzf3.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf5);
                return c1943Ujhhgtgfeyxiexzf;
        }
        return Boolean.valueOf(zIsAssignableFrom);
    }
}
