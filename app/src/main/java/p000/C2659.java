package p000;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᲈᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2659 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8573;

    public /* synthetic */ C2659(int i) {
        this.f8573 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2585;
        Object obj2;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        int i = this.f8573;
        Class<Activity> cls = Activity.class;
        int i2 = 13;
        int i3 = 8;
        int i4 = 3;
        int i5 = 6;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C2659(i8);
                c1020.f3733 = new C2659(i6);
                return c3497;
            case 1:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.storage");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.ServerConfigInfoStorage", "writeConfigToLocalFile, path: %s, info:%s");
                c1332.f4791 = c0705;
                return c3497;
            case 2:
                ((C1333) obj).m3052(new C2659(i4));
                return c3497;
            case 3:
                C1981 c1981 = (C1981) obj;
                String[] strArr2 = AbstractC1574.f5469;
                C1981.m3817(c1981, MagicFactory.get(-388900698716852L, strArr2));
                C1981.m3817(c1981, MagicFactory.get(-388947943357108L, strArr2));
                C1981.m3817(c1981, MagicFactory.get(-389003777931956L, strArr2));
                C1981.m3817(c1981, MagicFactory.get(-389029547735732L, strArr2));
                C1981.m3817(c1981, MagicFactory.get(-389098267212468L, strArr2));
                C1981.m3817(c1981, MagicFactory.get(-389184166558388L, strArr2));
                return c3497;
            case 4:
                ((C1020) obj).f3733 = new C2659(5);
                return c3497;
            case 5:
                ((C1333) obj).m3052(new C2659(i5));
                return c3497;
            case 6:
                ((C1981) obj).m3827("calling getService(...)");
                return c3497;
            case 7:
                ((C1020) obj).f3733 = new C2659(i3);
                return c3497;
            case 8:
                C1333 c1333 = (C1333) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1333.m3053(MagicFactory.get(-579451217771188L, strArr3));
                C1981 c1982 = new C1981(4);
                c1982.m3827(MagicFactory.get(-579257944242868L, strArr3));
                c1333.f4794 = c1982;
                return c3497;
            case 9:
                ((C1563) obj).m3271();
                return c3497;
            case 10:
                Object objM3268 = ((C1563) obj).m3268();
                Activity activity = (Activity) (objM3268 instanceof Activity ? objM3268 : null);
                if (activity == null) {
                    Class<Activity> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2183 != null ? clsM2183 : Activity.class).getName()).toString());
                }
                int i9 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(activity).m3492();
                String[] strArr4 = AbstractC1574.f5469;
                c1973M3492.f6370 = MagicFactory.get(-642050366110388L, strArr4);
                BaseAdapter baseAdapter = (BaseAdapter) ((C1982) AbstractC2784.m4742(c1973M3492)).m3832(new Object[0]);
                String stringExtra = activity.getIntent().getStringExtra(MagicFactory.get(-642136265456308L, strArr4));
                if (stringExtra == null) {
                    stringExtra = MagicFactory.get(-642179215129268L, strArr4);
                }
                AbstractC1574.m3288(baseAdapter, AbstractC1574.m3299(activity, MagicFactory.get(-642192100031156L, strArr4), MagicFactory.get(-642320949050036L, strArr4) + stringExtra), 1);
                return c3497;
            case 11:
                C1563 c1563 = (C1563) obj;
                Object objM3269 = c1563.m3268();
                if (!(objM3269 instanceof Activity)) {
                    objM3269 = null;
                }
                Activity activity2 = (Activity) objM3269;
                if (activity2 == null) {
                    Class<Activity> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2184 != null ? clsM2184 : Activity.class).getName()).toString());
                }
                try {
                    c2585 = c1563.m3267()[1];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                obj2 = c2585 instanceof C2585 ? null : c2585;
                int i10 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(obj2).m3490();
                c1299M3490.f4725 = AbstractC2519.m4527(String.class);
                c1299M3490.m3732();
                Iterator it = c1299M3490.m3014().iterator();
                while (it.hasNext()) {
                    String str = (String) ((C1315) it.next()).m3024();
                    if (str != null) {
                        String[] strArr5 = AbstractC1574.f5469;
                        if (str.equals(MagicFactory.get(-642342423886516L, strArr5))) {
                            String stringExtra2 = activity2.getIntent().getStringExtra(MagicFactory.get(-642471272905396L, strArr5));
                            if (stringExtra2 == null) {
                                stringExtra2 = MagicFactory.get(-642514222578356L, strArr5);
                            }
                            AbstractC2834.m4818(activity2, stringExtra2);
                            AbstractC2834.m4823(activity2, 2, MagicFactory.get(-642527107480244L, strArr5));
                            c1563.m3271();
                        }
                    }
                }
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1020) obj).f3733 = new C2659(i2);
                return c3497;
            case 13:
                ((C1333) obj).m3052(new C2659(15));
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                Object objM32610 = ((C1563) obj).m3269();
                if (!(objM32610 instanceof List) || ((objM32610 instanceof InterfaceC1737) && !(objM32610 instanceof InterfaceC1738))) {
                    objM32610 = null;
                }
                List list = (List) objM32610;
                C2873 c2873 = new C2873(new C2083(12));
                List list2 = C2700.f8710;
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list2, 10));
                for (Object obj3 : list2) {
                    int i11 = i7 + 1;
                    if (i7 < 0) {
                        AbstractC0745.m2213();
                        throw null;
                    }
                    Constructor constructor = ((C0798) c2873.getValue()).f3157;
                    Object[] objArr = {Integer.valueOf(list.size() + i7), ((C2698) obj3).f8704};
                    Constructor constructor2 = constructor != null ? constructor : null;
                    if (constructor2 != null && !constructor2.isAccessible()) {
                        constructor2.setAccessible(true);
                    }
                    arrayList.add(constructor.newInstance(Arrays.copyOf(objArr, 2)));
                    i7 = i11;
                }
                list.addAll(arrayList);
                return c3497;
            case 15:
                String[] strArr6 = AbstractC1574.f5469;
                ((C1981) obj).m3827(MagicFactory.get(-524729039452852L, strArr6), MagicFactory.get(-524832118667956L, strArr6));
                return c3497;
            case 16:
                ((C1020) obj).f3733 = new C2659(18);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[1];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                String str2 = (String) c2586;
                try {
                    c2587 = c1564.m3267()[3];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                int iIntValue = ((Number) c2587).intValue();
                try {
                    c2588 = c1564.m3267()[4];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                if (c2588 instanceof C2585) {
                    c2588 = null;
                }
                int iIntValue2 = ((Number) c2588).intValue();
                try {
                    c2589 = c1564.m3267()[6];
                    if (c2589 == null) {
                        c2589 = null;
                    }
                } catch (Throwable th5) {
                    c2589 = new C2585(th5);
                }
                obj2 = c2589 instanceof C2585 ? null : c2589;
                int i12 = AbstractC1745.f5844;
                C1299 c1299M3491 = AbstractC0968.m2484(obj2).m3490();
                String[] strArr7 = AbstractC1574.f5469;
                c1299M3491.f6370 = MagicFactory.get(-526893702970036L, strArr7);
                C1315 c1315 = (C1315) AbstractC0744.m2191(c1299M3491.m3014());
                if (iIntValue == 4 && iIntValue2 == -2005 && ((String) c1315.m3024()).startsWith(MagicFactory.get(-526902292904628L, strArr7))) {
                    new C0408(3, 6, c1564).m1608(0);
                    new C0408(4, 6, c1564).m1608(0);
                    c1315.m3025(str2);
                }
                return c3497;
            case Opcodes.LDC /* 18 */:
                C1333 c1334 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1334.m3053(MagicFactory.get(-527452048718516L, strArr8));
                C1981 c1983 = new C1981(4);
                c1983.m3827(MagicFactory.get(-527013962054324L, strArr8), MagicFactory.get(-527121336236724L, strArr8));
                c1334.f4794 = c1983;
                return c3497;
            case 19:
                C2011 c2011M3872 = C2011.m3872(LayoutInflater.from(((View) obj).getContext()));
                c2011M3872.f6708.setText(C2721.f8780.m2542());
                C2007 c2007 = new C2007();
                C2722.f8781.getClass();
                c2007.f6678 = C2722.f8784;
                c2007.f6680 = c2011M3872.f6707;
                String[] strArr9 = AbstractC1574.f5469;
                c2007.m3870(MagicFactory.get(-590167161174708L, strArr9), new C1173(c2011M3872, 2));
                c2007.m3869(MagicFactory.get(-590180046076596L, strArr9), new C2083(i2));
                C2007.m3866(c2007, null, 3);
                c2007.m3868().m3791();
                return c3497;
            case 20:
                final C1563 c1565 = (C1563) obj;
                Object objM32611 = c1565.m3268();
                ViewGroup viewGroup = (ViewGroup) (objM32611 instanceof ViewGroup ? objM32611 : null);
                if (viewGroup == null) {
                    Class<ViewGroup> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(ViewGroup.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2185 != null ? clsM2185 : ViewGroup.class).getName()).toString());
                }
                viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᤞᛸᲈᲁ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        Object c25811;
                        C2722 c2722 = C2722.f8781;
                        C1563 c1566 = c1565;
                        c1566.getClass();
                        try {
                            c25811 = c1566.m3267()[0];
                            if (c25811 == null) {
                                c25811 = null;
                            }
                        } catch (Throwable th6) {
                            c25811 = new C2585(th6);
                        }
                        if (c25811 instanceof C2585) {
                            c25811 = null;
                        }
                        int i13 = AbstractC1745.f5844;
                        C1299 c1299M3492 = AbstractC0968.m2484(c25811).m3490();
                        String[] strArr10 = AbstractC1574.f5469;
                        c1299M3492.f6370 = MagicFactory.get(-590192930978484L, strArr10);
                        String str3 = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                        C1299 c1299M3493 = AbstractC0968.m2484(c25811).m3490();
                        c1299M3493.f6370 = MagicFactory.get(-590257355487924L, strArr10);
                        int iIntValue3 = ((Number) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024()).intValue();
                        C1299 c1299M3494 = AbstractC0968.m2484(c25811).m3490();
                        c1299M3494.f6370 = MagicFactory.get(-590304600128180L, strArr10);
                        String str4 = (String) ((C1315) AbstractC2784.m4741(c1299M3494)).m3024();
                        C1299 c1299M3495 = AbstractC0968.m2484(c25811).m3490();
                        c1299M3495.f6370 = MagicFactory.get(-590369024637620L, strArr10);
                        String str5 = (String) ((C1315) AbstractC2784.m4741(c1299M3495)).m3024();
                        C1299 c1299M3496 = AbstractC0968.m2484(c25811).m3490();
                        c1299M3496.f6370 = MagicFactory.get(-590442039081652L, strArr10);
                        String str6 = (String) ((C1315) AbstractC2784.m4741(c1299M3496)).m3024();
                        if (iIntValue3 == 1 || iIntValue3 == 2 || iIntValue3 == 3) {
                            if (str4 != null) {
                                StringBuilder sbM4753 = AbstractC2784.m4753(str3);
                                sbM4753.append(MagicFactory.get(-590515053525684L, strArr10));
                                String string = sbM4753.toString();
                                c2722.getClass();
                                C1002 c1002 = AbstractC1075.f3893;
                                AbstractC0968.m2486(ExecutorC0990.f3609, new C2142(str4, string, (InterfaceC0842) null));
                            }
                            if (str5 != null) {
                                StringBuilder sbM4754 = AbstractC2784.m4753(str3);
                                sbM4754.append(MagicFactory.get(-590575183067828L, strArr10));
                                String string2 = sbM4754.toString();
                                c2722.getClass();
                                C1002 c1003 = AbstractC1075.f3893;
                                AbstractC0968.m2486(ExecutorC0990.f3609, new C2142(str5, string2, (InterfaceC0842) null));
                            }
                            if (str6 != null) {
                                StringBuilder sbM4755 = AbstractC2784.m4753(str3);
                                sbM4755.append(MagicFactory.get(-590643902544564L, strArr10));
                                String string3 = sbM4755.toString();
                                c2722.getClass();
                                C1002 c1004 = AbstractC1075.f3893;
                                AbstractC0968.m2486(ExecutorC0990.f3609, new C2142(str6, string3, (InterfaceC0842) null));
                            }
                            AbstractC2834.m4823(null, 3, MagicFactory.get(-590712622021300L, strArr10));
                        } else {
                            AbstractC2834.m4823(null, 3, MagicFactory.get(-590734096857780L, strArr10) + iIntValue3);
                        }
                        return true;
                    }
                });
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                ((C1020) obj).f3732 = new C2659(22);
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                C1332 c1335 = (C1332) obj;
                String[] strArr10 = AbstractC1574.f5469;
                c1335.m3051(MagicFactory.get(-364750097611444L, strArr10));
                C0705 c0706 = new C0705(4);
                c0706.m2127(MagicFactory.get(-364595478788788L, strArr10), MagicFactory.get(-364668493232820L, strArr10));
                c1335.f4791 = c0706;
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                ((C1020) obj).f3733 = new C2659(24);
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                C1333 c1336 = (C1333) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1336.m3053(MagicFactory.get(-369831043922612L, strArr11));
                C1981 c1984 = new C1981(4);
                c1984.m3821(4);
                c1984.m3827(MagicFactory.get(-369560460982964L, strArr11), MagicFactory.get(-369624885492404L, strArr11));
                c1336.f4794 = c1984;
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr12 = AbstractC1574.f5469;
                ((C1981) obj).m3827(MagicFactory.get(-599027678706356L, strArr12), MagicFactory.get(-599092103215796L, strArr12));
                return c3497;
            case 26:
                ((C1333) obj).m3052(new C2734(i8));
                return c3497;
            case 27:
                ((C1333) obj).m3052(new C2734(i7));
                return c3497;
            case 28:
                C1563 c1566 = (C1563) obj;
                int i13 = AbstractC1745.f5844;
                C1744 c1744M2484 = AbstractC0968.m2484(c1566.m3268());
                try {
                    c25810 = c1566.m3267()[0];
                    if (c25810 == null) {
                        c25810 = null;
                    }
                } catch (Throwable th6) {
                    c25810 = new C2585(th6);
                }
                C1299 c1299M3492 = AbstractC0968.m2484(c25810 instanceof C2585 ? null : c25810).m3490();
                String[] strArr13 = AbstractC1574.f5469;
                c1299M3492.f4725 = MagicFactory.get(-598619656813236L, strArr13);
                Object objM3023 = ((C1315) AbstractC2784.m4741(c1299M3492)).m3023();
                C1973 c1973M3493 = c1744M2484.m3492();
                c1973M3493.f6370 = MagicFactory.get(-598800045439668L, strArr13);
                TextView textView = (TextView) ((C1982) AbstractC2784.m4742(c1973M3493)).m3832(new Object[0]);
                C2741.f8814.getClass();
                textView.setText(AbstractC2849.m4857(C2741.m4730(objM3023), MagicFactory.get(-598881649818292L, strArr13), textView.getText().toString()));
                C1973 c1973M3494 = c1744M2484.m3492();
                c1973M3494.f6370 = MagicFactory.get(-598950369295028L, strArr13);
                View view = (View) ((C1982) AbstractC2784.m4742(c1973M3494)).m3832(new Object[0]);
                if (view != null && (view instanceof ImageView)) {
                    ((ImageView) view).setVisibility(C2738.f8811.m2536() ? 8 : 0);
                }
                return c3497;
            default:
                ((C1333) obj).m3052(new C2659(25));
                return c3497;
        }
    }
}
