package p000;

import android.app.Activity;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᤞᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0801 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3171;

    public /* synthetic */ C0801(int i) {
        this.f3171 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        int i = this.f3171;
        Class<Activity> cls = Activity.class;
        int i2 = 3;
        Class<Boolean> cls2 = Boolean.class;
        Class<String> cls3 = String.class;
        int i3 = 2;
        int i4 = 1;
        Object[] objArr = 0;
        int i5 = 12;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1023) obj).f3739 = new C0801(i4);
                return c3554;
            case 1:
                ((C1334) obj).m3153(new C0801(i3));
                return c3554;
            case 2:
                C0700 c0700 = (C0700) obj;
                c0700.getClass();
                C1318 c1318 = new C1318();
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                if (clsM4232 == null) {
                    clsM4232 = cls3;
                }
                c1318.m3144(clsM4232);
                Class<String> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                c1318.m3144(clsM4233 != null ? clsM4233 : String.class);
                c1318.f4763 = new C0083(2);
                c0700.f2680 = c1318;
                c0700.m2219(new C0661(25));
                return c3554;
            case 3:
                C2015 c2015 = (C2015) obj;
                c2015.getClass();
                C2012 c2012 = new C2012();
                C2012.m4013(c2012);
                c2012.m4018(C0810.f3180.m2478());
                C2368 c2368 = new C2368();
                c2368.f7607 = new ArrayList(C1191.f4326);
                c2012.f6666 = c2368;
                c2015.m4042(c2012);
                return c3554;
            case 4:
                ((C1023) obj).f3740 = new C0801(6);
                return c3554;
            case 5:
                ((C1023) obj).f3739 = new C0801(7);
                return c3554;
            case 6:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.storage");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.Label.ContactLabelStorage", "cpan[getLabelIdByStr] label id is %s");
                c1335.f4794 = c2013;
                return c3554;
            case 7:
                ((C1334) obj).m3153(new C0801(8));
                return c3554;
            case 8:
                C0700 c0701 = (C0700) obj;
                c0701.getClass();
                C1318 c1319 = new C1318();
                c1319.m3144(C0810.f3180.m2478());
                c0701.f2680 = c1319;
                c0701.m2219(new C0801(i2));
                return c3554;
            case 9:
                ((C1023) obj).f3740 = new C0801(13);
                return c3554;
            case 10:
                ((C1023) obj).f3740 = new C0801(i5);
                return c3554;
            case 11:
                ((C1023) obj).f3740 = new C0801(14);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                c2012M4773.m4014(C0810.f3180.m2478());
                String[] strArr2 = AbstractC1471.f5234;
                c2012M4773.m4021("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", "select * from ContactLabel where isTemporary = 0  order by createTime ASC ");
                c1336.f4794 = c2012M4773;
                return c3554;
            case 13:
                C1335 c1337 = (C1335) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.storage");
                C2012 c2014 = new C2012();
                c2014.m4021("MicroMsg.Label.ContactLabelStorage", "cpan[getLabelIdByStr] label id is %s");
                c1337.f4794 = c2014;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1338);
                c2012M4774.m4014(C0810.f3180.m2478());
                String[] strArr4 = AbstractC1471.f5234;
                c2012M4774.m4021("MicroMsg.Label.ContactLabelStorage", "getUserNameListById time:%s id:%s count:%s stack:%s");
                c1338.f4794 = c2012M4774;
                return c3554;
            case 15:
                return Boolean.FALSE;
            case 16:
                ((C1023) obj).f3739 = new C0801(19);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                ((C1023) obj).f3740 = new C0801(18);
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1335) obj).m3155(new C0801(20));
                return c3554;
            case 19:
                C1334 c1334 = (C1334) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.storage");
                C0700 c0702 = new C0700();
                c0702.m2220("PRAGMA table_info( contact_ext )");
                c1334.f4791 = c0702;
                return c3554;
            case 20:
                C2012 c2016 = (C2012) obj;
                C0818.f3214.getClass();
                c2016.m4014(AbstractC0972.m2608(C0816.f3212));
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                cls3 = clsM4234 != null ? clsM4234 : String.class;
                Class<Boolean> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2016.m4017(cls3, clsM4235 != null ? clsM4235 : Boolean.class);
                c2016.m4021("[get]username = %s");
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr6 = AbstractC1471.f5234;
                Object objM3448 = ((C1574) obj).m3448();
                Activity activity = (Activity) (objM3448 instanceof Activity ? objM3448 : null);
                if (activity == null) {
                    Class<Activity> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4236 != null ? clsM4236 : Activity.class).getName()).toString());
                }
                int i6 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(activity).m3560();
                c2004M3560.f6475 = "getPreferenceScreen";
                BaseAdapter baseAdapter = (BaseAdapter) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                for (InterfaceC1591 interfaceC1591 : C0820.f3220) {
                    try {
                        for (C0819 c0819 : interfaceC1591.mo3500(activity)) {
                            AbstractC2240.m4239(baseAdapter, c0819.f3216, c0819.f3217);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onAddItems ");
                        sb.append(interfaceC1591 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1591).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1574 c1574 = (C1574) obj;
                Object objM3449 = c1574.m3448();
                if (!(objM3449 instanceof Activity)) {
                    objM3449 = null;
                }
                Activity activity2 = (Activity) objM3449;
                if (activity2 == null) {
                    Class<Activity> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4237 != null ? clsM4237 : Activity.class).getName()).toString());
                }
                try {
                    c2641 = c1574.m3447()[1];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Object obj2 = c2641 instanceof C2641 ? null : c2641;
                int i7 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
                c1300M3558.f4724 = AbstractC2574.m4549(cls3);
                c1300M3558.m3926();
                Iterator it = c1300M3558.m3117().iterator();
                while (it.hasNext()) {
                    String str = (String) ((C1316) it.next()).m3127();
                    if (str != null) {
                        for (InterfaceC1591 interfaceC1592 : C0820.f3220) {
                            try {
                                for (C0819 c08110 : interfaceC1592.mo3500(activity2)) {
                                    if (str.equals(c08110.f3215)) {
                                        c08110.f3218.invoke(activity2);
                                        c1574.m3451();
                                    }
                                }
                            } catch (Exception e2) {
                                ArrayList arrayList2 = C3741.f11709;
                                StringBuilder sb2 = new StringBuilder();
                                String[] strArr7 = AbstractC1471.f5234;
                                sb2.append("onAddItems ");
                                sb2.append(interfaceC1592 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1592).mo1274() : "LoadHook");
                                AbstractC1095.m2808(sb2, " Failed", e2, 12);
                            }
                        }
                    }
                }
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C0801(24);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1335) obj).m3155(new C0801(26));
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                try {
                    c2643 = c1575.m3447()[1];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                CharSequence charSequence = (CharSequence) c2643;
                try {
                    c2644 = c1575.m3447()[2];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                if (c2644 instanceof C2641) {
                    c2644 = null;
                }
                try {
                    c2645 = c1575.m3447()[3];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                if (c2645 instanceof C2641) {
                    c2645 = null;
                }
                try {
                    c2646 = c1575.m3447()[4];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                Boolean bool = (Boolean) (c2646 instanceof C2641 ? null : c2646);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                for (InterfaceC1592 interfaceC1593 : C0839.f3248) {
                    try {
                        ((C0219) interfaceC1593).m1385(c1575, charSequence, zBooleanValue);
                    } catch (Exception e3) {
                        ArrayList arrayList3 = C3741.f11709;
                        StringBuilder sb3 = new StringBuilder();
                        String[] strArr8 = AbstractC1471.f5234;
                        sb3.append("onCreateBottomSheetDialogMenu ");
                        sb3.append(interfaceC1593 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1593).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb3, " Failed", e3, 12);
                    }
                }
                return c3554;
            case 26:
                C2012 c2017 = (C2012) obj;
                Class<MenuItem> clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(MenuItem.class));
                Class cls4 = clsM4238 != null ? clsM4238 : MenuItem.class;
                Class<Integer> cls5 = Integer.class;
                Class<Integer> clsM4774 = AbstractC2844.m4774(c2017, cls4, cls5);
                if (clsM4774 == null) {
                    clsM4774 = cls5;
                }
                Class<CharSequence> clsM4239 = AbstractC2236.m4232(AbstractC2574.m4549(CharSequence.class));
                Class cls6 = clsM4239 != null ? clsM4239 : CharSequence.class;
                Class<Integer> clsM42310 = AbstractC2236.m4232(AbstractC2574.m4549(cls5));
                if (clsM42310 == null) {
                    clsM42310 = cls5;
                }
                Class<Integer> clsM42311 = AbstractC2236.m4232(AbstractC2574.m4549(cls5));
                cls5 = clsM42311 != null ? clsM42311 : Integer.class;
                Class<Boolean> clsM42312 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2017.m4017(clsM4774, cls6, clsM42310, cls5, clsM42312 != null ? clsM42312 : Boolean.class);
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C0801(28);
                return c3554;
            case 28:
                C1335 c1339 = (C1335) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1339.m3156("com.tencent.mm.ui.conversation");
                C2012 c2018 = new C2012();
                c2018.m4021("MicroMsg.ConvDelLogic", "del all notify message");
                c1339.f4794 = c2018;
                return c3554;
            default:
                ((C1023) obj).f3740 = new C0845(objArr == true ? 1 : 0);
                return c3554;
        }
    }
}
