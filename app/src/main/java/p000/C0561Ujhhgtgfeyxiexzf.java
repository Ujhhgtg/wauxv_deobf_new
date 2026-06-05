package p000;

import android.content.Context;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.hook.HookEntry;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛲᛴᛳᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0561Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2571Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0561Ujhhgtgfeyxiexzf(int i) {
        this.f2571Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0542  */
    /* JADX WARN: Code duplicated, block: B:146:0x0549  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object objM1849Ujhhgtgfeyxiexzf;
        int i;
        SparseArray sparseArray;
        char c;
        String strMo1479feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg;
        boolean zM4512Ujhhgtgfeyxiexzf;
        String strM3617Ujhhgtgfeyxiexzf;
        int i2 = this.f2571Ujhhgtgfeyxiexzf;
        char c2 = '\f';
        int i3 = 2;
        Class<Boolean> cls = Boolean.class;
        int i4 = 10;
        int iIntValue = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i2) {
            case 0:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                int i5 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(TextView.class);
                Iterator it = c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf().iterator();
                while (it.hasNext()) {
                    TextView textView = (TextView) ((C3438feyxiexzfUjhhgtg) it.next()).m4939Ujhhgtgfeyxiexzf();
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.setting.ui.setting");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1660feyxiexzfUjhhgtg("onCreateAfter");
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7379Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7355Ujhhgtgfeyxiexzf)) {
                    c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onCreateAfter bitmap == null, try fetchQRCode");
                }
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(6);
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7387Ujhhgtgfeyxiexzf)) {
                    int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                    c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0594Ujhhgtgfeyxiexzf.f2637Ujhhgtgfeyxiexzf).getDeclaringClass();
                    objM1849Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                } else {
                    objM1849Ujhhgtgfeyxiexzf = c0578Ujhhgtgfeyxiexzf.m1849Ujhhgtgfeyxiexzf();
                }
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1849Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class);
                AbstractC3590Ujhhgtgfeyxiexzf.m5133Ujhhgtgfeyxiexzf((Context) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf());
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1849Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(BaseAdapter.class);
                BaseAdapter baseAdapter = (BaseAdapter) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1849Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(SparseArray.class);
                SparseArray sparseArray2 = (SparseArray) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                Object obj2 = sparseArray2.get(sparseArray2.size() - 1);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f10725Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(i4);
                Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                for (InterfaceC0604Ujhhgtgfeyxiexzf interfaceC0604Ujhhgtgfeyxiexzf : C0575Ujhhgtgfeyxiexzf.f2594Ujhhgtgfeyxiexzf) {
                    try {
                        for (C0592Ujhhgtgfeyxiexzf c0592Ujhhgtgfeyxiexzf : interfaceC0604Ujhhgtgfeyxiexzf.mo1792Ujhhgtgfeyxiexzf()) {
                            C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(objM4938Ujhhgtgfeyxiexzf.getClass());
                            i = iIntValue;
                            try {
                                SparseArray sparseArray3 = sparseArray2;
                                try {
                                    Object[] objArr = {Integer.valueOf(c0592Ujhhgtgfeyxiexzf.f2632Ujhhgtgfeyxiexzf), c0592Ujhhgtgfeyxiexzf.f2633Ujhhgtgfeyxiexzf, "", Integer.valueOf(c0592Ujhhgtgfeyxiexzf.f2634Ujhhgtgfeyxiexzf), Integer.valueOf(i)};
                                    ConcurrentHashMap concurrentHashMap = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                                    sparseArray = sparseArray3;
                                    try {
                                        sparseArray.put(sparseArray3.size(), AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(obj2.getClass()).mo2998Ujhhgtgfeyxiexzf(), Arrays.copyOf(new Object[]{AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.mo2998Ujhhgtgfeyxiexzf(), Arrays.copyOf(objArr, 5))}, 1)));
                                        baseAdapter.notifyDataSetChanged();
                                        sparseArray2 = sparseArray;
                                        iIntValue = i;
                                        c2 = '\f';
                                    } catch (Exception e) {
                                        e = e;
                                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("onCreateMenuItems ");
                                        if (interfaceC0604Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf) {
                                            strMo1479feyxiexzfUjhhgtg = ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0604Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg();
                                        } else {
                                            strMo1479feyxiexzfUjhhgtg = "LoadHook";
                                        }
                                        sb.append(strMo1479feyxiexzfUjhhgtg);
                                        c = '\f';
                                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, " Failed", e, 12);
                                        sparseArray2 = sparseArray;
                                        c2 = c;
                                        iIntValue = i;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    sparseArray = sparseArray3;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                sparseArray = sparseArray2;
                                ArrayList arrayList2 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("onCreateMenuItems ");
                                if (interfaceC0604Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf) {
                                    strMo1479feyxiexzfUjhhgtg = ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0604Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg();
                                } else {
                                    strMo1479feyxiexzfUjhhgtg = "LoadHook";
                                }
                                sb2.append(strMo1479feyxiexzfUjhhgtg);
                                c = '\f';
                                AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, " Failed", e, 12);
                                sparseArray2 = sparseArray;
                                c2 = c;
                                iIntValue = i;
                            }
                        }
                        i = iIntValue;
                        sparseArray = sparseArray2;
                        c = c2;
                    } catch (Exception e4) {
                        e = e4;
                        i = iIntValue;
                    }
                    sparseArray2 = sparseArray;
                    c2 = c;
                    iIntValue = i;
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("MicroMsg.PlusSubMenuHelper", "processOnItemClick");
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                Integer num = (Integer) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                iIntValue = num != null ? num.intValue() : 0;
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf2);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(SparseArray.class);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((SparseArray) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).get(iIntValue)).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f10725Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(9);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                Iterator it2 = c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.m4942Ujhhgtgfeyxiexzf().iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) ((C3438feyxiexzfUjhhgtg) it2.next()).m4939Ujhhgtgfeyxiexzf();
                    for (InterfaceC0604Ujhhgtgfeyxiexzf interfaceC0604Ujhhgtgfeyxiexzf2 : C0575Ujhhgtgfeyxiexzf.f2594Ujhhgtgfeyxiexzf) {
                        try {
                            for (C0592Ujhhgtgfeyxiexzf c0592Ujhhgtgfeyxiexzf2 : interfaceC0604Ujhhgtgfeyxiexzf2.mo1792Ujhhgtgfeyxiexzf()) {
                                int i9 = c0592Ujhhgtgfeyxiexzf2.f2632Ujhhgtgfeyxiexzf;
                                if (num2 != null && num2.intValue() == i9) {
                                    c0592Ujhhgtgfeyxiexzf2.f2635Ujhhgtgfeyxiexzf.invoke();
                                }
                            }
                        } catch (Exception e5) {
                            ArrayList arrayList3 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                            StringBuilder sb3 = new StringBuilder();
                            String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                            sb3.append("onCreateMenuItems ");
                            sb3.append(interfaceC0604Ujhhgtgfeyxiexzf2 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0604Ujhhgtgfeyxiexzf2).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                            AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb3, " Failed", e5, 12);
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                Class cls2 = (Class) obj;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Boolean.class);
                break;
            case 10:
                Class cls3 = (Class) obj;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls3, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Boolean.class);
                break;
            case 11:
                C1477feyxiexzfUjhhgtg c1477feyxiexzfUjhhgtg = (C1477feyxiexzfUjhhgtg) obj;
                HookEntry.f1048Ujhhgtgfeyxiexzf.getClass();
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                byte[] bytes = "WAuxiliary".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
                "getBytes(...)";
                boolean zEquals = Arrays.equals(bytes, new byte[]{87, 65, 117, JSONB.Constants.BC_STR_ASCII_FIX_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 108, JSONB.Constants.BC_STR_ASCII_FIX_32, 97, 114, JSONB.Constants.BC_STR_ASCII});
                boolean z = System.currentTimeMillis() - AbstractC2280feyxiexzfUjhhgtg.f7474Ujhhgtgfeyxiexzf > 31104000000L;
                if ((zEquals && !z) || new Random().nextFloat() >= 0.25f) {
                    String str = "com.tencent.mm";
                    C2249feyxiexzfUjhhgtg c2249feyxiexzfUjhhgtg = C2249feyxiexzfUjhhgtg.f7327Ujhhgtgfeyxiexzf;
                    C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg = c1477feyxiexzfUjhhgtg.f5128Ujhhgtgfeyxiexzf;
                    if ((c1478feyxiexzfUjhhgtg != null ? c1478feyxiexzfUjhhgtg.f5129Ujhhgtgfeyxiexzf : 0) != 1) {
                        if (c1478feyxiexzfUjhhgtg != null) {
                            strM3617Ujhhgtgfeyxiexzf = c1478feyxiexzfUjhhgtg.f5130Ujhhgtgfeyxiexzf;
                        } else {
                            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                            strM3617Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf();
                        }
                        if (strM3617Ujhhgtgfeyxiexzf.equals(str) || AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
                            c1477feyxiexzfUjhhgtg.m2997feyxiexzfUjhhgtg(c2249feyxiexzfUjhhgtg);
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(17);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(15);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(16);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0561Ujhhgtgfeyxiexzf(18));
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0561Ujhhgtgfeyxiexzf(19));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0561Ujhhgtgfeyxiexzf(20));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)");
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = (C2812Ujhhgtgfeyxiexzf) obj;
                c2812Ujhhgtgfeyxiexzf.getClass();
                C3433feyxiexzfUjhhgtg c3433feyxiexzfUjhhgtg = new C3433feyxiexzfUjhhgtg();
                c3433feyxiexzfUjhhgtg.m4922Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0754Ujhhgtgfeyxiexzf.f3023Ujhhgtgfeyxiexzf));
                c3433feyxiexzfUjhhgtg.m4922Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0752Ujhhgtgfeyxiexzf.f3021Ujhhgtgfeyxiexzf));
                c2812Ujhhgtgfeyxiexzf.f8949Ujhhgtgfeyxiexzf = c3433feyxiexzfUjhhgtg;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(22);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.modelavatar");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf2.m4143Ujhhgtgfeyxiexzf("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(24);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0561Ujhhgtgfeyxiexzf(25));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s");
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(27);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0561Ujhhgtgfeyxiexzf(28);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0561Ujhhgtgfeyxiexzf(29));
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0760Ujhhgtgfeyxiexzf(0));
                return c1943Ujhhgtgfeyxiexzf;
            default:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.ImgUpload.MsgImgFeatureService", "taskListener", "params");
                return c1943Ujhhgtgfeyxiexzf;
        }
        return Boolean.valueOf(!zM4512Ujhhgtgfeyxiexzf);
    }
}
