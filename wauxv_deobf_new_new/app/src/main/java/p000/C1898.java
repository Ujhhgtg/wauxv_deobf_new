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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1898 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6293;

    public /* synthetic */ C1898(int i) {
        this.f6293 = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        EnumC2019 enumC2019;
        Object c2643;
        boolean zIsAssignableFrom;
        int i = this.f6293;
        int i2 = 3;
        Object obj2 = null;
        int i3 = 1;
        int i4 = 12;
        int i5 = 4;
        int i6 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1023) obj).f3740 = new C1898(i3);
                return c3554;
            case 1:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.luckymoney.model");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.LuckyMoneyUtil", "exception:%s");
                c1335.f4794 = c2012;
                return c3554;
            case 2:
                ((C1023) obj).f3739 = new C1898(i2);
                return c3554;
            case 3:
                ((C1334) obj).m3153(new C1898(i5));
                return c3554;
            case 4:
                ((C0700) obj).m2220("MicroMsg.MMAlert");
                return c3554;
            case 5:
                ((C1023) obj).f3739 = new C1898(7);
                return c3554;
            case 6:
                ((C1023) obj).f3740 = new C1898(8);
                return c3554;
            case 7:
                ((C1334) obj).m3153(new C1898(9));
                return c3554;
            case 8:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                C1905.f6300.getClass();
                c2012M4773.m4014(AbstractC0972.m2608(C1903.f6298));
                Class<Class> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Class.class));
                c2012M4773.m4017(clsM4232 != null ? clsM4232 : Class.class);
                c1336.f4794 = c2012M4773;
                return c3554;
            case 9:
                String[] strArr2 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                return c3554;
            case 10:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C1898(11);
                c1023.f3740 = new C1898(i4);
                return c3554;
            case 11:
                ((C1334) obj).m3153(new C1898(14));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1335) obj).m3155(new C1898(13));
                return c3554;
            case 13:
                C2012 c2013 = (C2012) obj;
                Class clsM4390 = C2444.f7796.m4390();
                Class<Integer> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2013.m4017(clsM4390, clsM4233 != null ? clsM4233 : Integer.class);
                C2015 c2015 = new C2015();
                C2012 c2014 = new C2012();
                c2014.m4020("notifyDataSetChanged");
                c2015.m4042(c2014);
                c2013.f6669 = c2015;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr3 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.MMPreferenceAdapter", "ignore notifyDataSetChanged(%s %s), had:%s");
                return c3554;
            case 15:
                ((C1023) obj).f3740 = new C1898(17);
                return c3554;
            case 16:
                C1574 c1574 = (C1574) obj;
                int i7 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772(c1574);
                String[] strArr4 = AbstractC1471.f5234;
                c1300M4772.f4724 = "com.tencent.mm.ui.MMFragmentActivity";
                Activity activity = (Activity) ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3127();
                C1300 c1300M4773 = AbstractC2844.m4772(c1574);
                c1300M4773.f6475 = "mViewPager";
                ViewGroup viewGroup = (ViewGroup) ((C1316) AbstractC0739.m2290(c1300M4773.m3117())).m3127();
                C1300 c1300M4774 = AbstractC2844.m4772(c1574);
                c1300M4774.f6475 = "mTabsAdapter";
                Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M4774.m3117())).m3126();
                for (InterfaceC1602 interfaceC1602 : C1912.f6307) {
                    try {
                        interfaceC1602.mo1799(activity, viewGroup, objM3126);
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("doOnCreate ");
                        sb.append(interfaceC1602 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1602).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1337);
                String[] strArr5 = AbstractC1471.f5234;
                c2012M4774.m4019("com.tencent.mm.ui.MainTabUI");
                c2012M4774.m4021("MicroMsg.LauncherUI.MainTabUI", "doOnCreate");
                c1337.f4794 = c2012M4774;
                return c3554;
            case Opcodes.LDC /* 18 */:
                C2899 c2899 = C2899.f9270;
                C1740 c1740 = C1740.f5874;
                C0703 c0703 = (C0703) obj;
                C0703.m2222(c0703, "key", C2899.f9271);
                C0703.m2222(c0703, "value", C1740.f5875);
                return c3554;
            case 19:
                ((C1023) obj).f3740 = new C1898(20);
                return c3554;
            case 20:
                ((C1335) obj).m3155(new C1898(22));
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1574 c1575 = (C1574) obj;
                Member member = ((C1571) c1575.f5468.f6344).f5461.method;
                if (member == null) {
                    throw new IllegalStateException("Current hooked Member is null");
                }
                Method method = member instanceof Method ? (Method) member : null;
                if (method == null) {
                    throw new IllegalStateException("Current hooked Member is not a Method");
                }
                C2348 c2348 = method.getParameterCount() == 16 ? new C2348(3, 4) : new C2348(2, 3);
                int iIntValue = ((Number) c2348.f7567).intValue();
                int iIntValue2 = ((Number) c2348.f7568).intValue();
                try {
                    c2641 = c1575.m3447()[iIntValue];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Integer num = (Integer) c2641;
                int iIntValue3 = num != null ? num.intValue() : 0;
                try {
                    c2642 = c1575.m3447()[iIntValue2];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                Integer num2 = (Integer) c2642;
                int iIntValue4 = num2 != null ? num2.intValue() : 0;
                C1227 c1227 = EnumC2019.f6712;
                c1227.getClass();
                C0067 c0067 = new C0067(c1227, 0);
                while (c0067.hasNext()) {
                    Object next = c0067.next();
                    EnumC2019 enumC20110 = (EnumC2019) next;
                    if (enumC20110.f6713 == iIntValue3 && enumC20110.f6714 == iIntValue4) {
                        obj2 = next;
                        enumC2019 = (EnumC2019) obj2;
                        if (enumC2019 != EnumC2019.f6709 || enumC2019 == EnumC2019.f6710) {
                            int i8 = 6;
                            C0383 c0383 = new C0383(iIntValue, i8, c1575);
                            EnumC2019 enumC20111 = EnumC2019.f6708;
                            c0383.m1714(Integer.valueOf(enumC20111.f6713));
                            new C0383(iIntValue2, i8, c1575).m1714(Integer.valueOf(enumC20111.f6714));
                        }
                        return c3554;
                    }
                }
                enumC2019 = (EnumC2019) obj2;
                if (enumC2019 != EnumC2019.f6709) {
                    int i9 = 6;
                    C0383 c0384 = new C0383(iIntValue, i9, c1575);
                    EnumC2019 enumC20112 = EnumC2019.f6708;
                    c0384.m1714(Integer.valueOf(enumC20112.f6713));
                    new C0383(iIntValue2, i9, c1575).m1714(Integer.valueOf(enumC20112.f6714));
                } else {
                    int i10 = 6;
                    C0383 c0385 = new C0383(iIntValue, i10, c1575);
                    EnumC2019 enumC20113 = EnumC2019.f6708;
                    c0385.m1714(Integer.valueOf(enumC20113.f6713));
                    new C0383(iIntValue2, i10, c1575).m1714(Integer.valueOf(enumC20113.f6714));
                }
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr6 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.QBarStringHandler", "key_offline_scan_show_tips");
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C1574 c1576 = (C1574) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1576.getClass();
                try {
                    c2643 = c1576.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                ContextMenu contextMenu = (ContextMenu) (c2643 instanceof C2641 ? null : c2643);
                C2933 c2933 = new C2933(new C1287(contextMenu, i5));
                int i11 = AbstractC1768.f5906;
                C1300 c1300M4775 = AbstractC2844.m4772(c1576);
                c1300M4775.f4725 = new C1898(24);
                C1300 c1300M3558 = AbstractC2727.m4713((View.OnClickListener) ((C1316) AbstractC0739.m2290(c1300M4775.m3117())).m3127()).m3558();
                c1300M3558.f6475 = "d";
                C2004 c2004M3560 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126()).m3560();
                c2004M3560.f6648 = AbstractC2574.m4549(List.class);
                List list = (List) ((C2013) AbstractC1095.m2793(c2004M3560)).m4026(new Object[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new MsgInfoBean(it.next()));
                }
                for (InterfaceC1603 interfaceC1603 : C2063.f6912) {
                    try {
                        for (C2060 c2060 : interfaceC1603.mo3503(arrayList2)) {
                            C2013 c2013M4024 = ((C2013) c2933.getValue()).m4024();
                            c2013M4024.m3542(contextMenu);
                            c2013M4024.m4025(Integer.valueOf(c2060.f6906), c2060.f6907);
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC1603 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1603).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C0702 c0702M4549 = AbstractC2574.m4549(View.OnClickListener.class);
                ConcurrentHashMap concurrentHashMap = AbstractC0705.f2692;
                zIsAssignableFrom = c0702M4549.mo2209().isAssignableFrom((Class) obj);
                break;
            case Opcodes.ALOAD /* 25 */:
                C0702 c0702M45410 = AbstractC2574.m4549(View.OnClickListener.class);
                ConcurrentHashMap concurrentHashMap2 = AbstractC0705.f2692;
                zIsAssignableFrom = c0702M45410.mo2209().isAssignableFrom((Class) obj);
                break;
            case 26:
                C1318 c1318 = (C1318) obj;
                C2059 c2059 = new C2059(i3);
                c1318.getClass();
                C1304 c1304 = new C1304();
                c2059.invoke(c1304);
                List arrayList4 = c1318.f4762;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c1318.f4762 = arrayList4;
                arrayList4.add(c1304);
                return c3554;
            case 27:
                C2015 c2016 = (C2015) obj;
                c2016.getClass();
                C2012 c2017 = new C2012();
                c2017.m4020("onMMMenuItemSelected");
                c2016.m4042(c2017);
                return c3554;
            case 28:
                C1318 c1319 = (C1318) obj;
                C2059 c20510 = new C2059(i6);
                c1319.getClass();
                C1304 c1305 = new C1304();
                c20510.invoke(c1305);
                List arrayList5 = c1319.f4762;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                c1319.f4762 = arrayList5;
                arrayList5.add(c1305);
                return c3554;
            default:
                C2015 c2018 = (C2015) obj;
                c2018.getClass();
                C2012 c2019 = new C2012();
                c2019.m4020("onCreateMMMenu");
                c2018.m4042(c2019);
                return c3554;
        }
        return Boolean.valueOf(zIsAssignableFrom);
    }
}
