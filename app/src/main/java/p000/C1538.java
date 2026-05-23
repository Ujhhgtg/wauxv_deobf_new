package p000;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.HookEntry;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᤝᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1538 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5384;

    public /* synthetic */ C1538(int i) {
        this.f5384 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object objM3268;
        int i;
        char c;
        Object c2586;
        boolean zM4087;
        String strM1338;
        int i2 = this.f5384;
        int i3 = 6;
        char c2 = '\f';
        Class<Boolean> cls = Boolean.class;
        int i4 = 27;
        int i5 = 2;
        int i6 = 1;
        int iIntValue = 0;
        C3497 c3497 = C3497.f10997;
        switch (i2) {
            case 0:
                ((C1333) obj).m3052(new C1338(i4));
                return c3497;
            case 1:
                Object objM3269 = ((C1563) obj).m3269();
                AbstractC3580.m5198((ViewGroup) (objM3269 instanceof ViewGroup ? objM3269 : null), new int[]{0, 1, 1}).setVisibility(8);
                return c3497;
            case 2:
                ((C1332) obj).m3050(new C1538(5));
                return c3497;
            case 3:
                ((C1333) obj).m3052(new C1538(i3));
                return c3497;
            case 4:
                Object objM32610 = ((C1563) obj).m3269();
                AbstractC3580.m5198((ViewGroup) (objM32610 instanceof ViewGroup ? objM32610 : null), new int[]{0, 1, 1}).setVisibility(8);
                return c3497;
            case 5:
                String[] strArr = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ConversationAdapter.MvvmConversationAdapter", "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d");
                return c3497;
            case 6:
                C1981 c1981 = (C1981) obj;
                Class<View> cls2 = View.class;
                Class<View> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                if (clsM2183 == null) {
                    clsM2183 = cls2;
                }
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1981, clsM2183, Integer.class);
                Class cls3 = clsM4740 != null ? clsM4740 : Integer.class;
                Class<View> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                cls2 = clsM2184 != null ? clsM2184 : View.class;
                Class<ViewGroup> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(ViewGroup.class));
                c1981.m3823(cls3, cls2, clsM2185 != null ? clsM2185 : ViewGroup.class);
                return c3497;
            case 7:
                C1563 c1563 = (C1563) obj;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Iterator c0060 = new C0060(7, (ViewGroup) c2585);
                ArrayList arrayList = new ArrayList();
                while (c0060.hasNext()) {
                    View view = (View) c0060.next();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    C0060 c0061 = viewGroup != null ? new C0060(7, viewGroup) : null;
                    if (c0061 == null || !c0061.hasNext()) {
                        while (!c0060.hasNext() && !arrayList.isEmpty()) {
                            c0060 = (Iterator) AbstractC0744.m2197(arrayList);
                            AbstractC0750.m2219(arrayList);
                        }
                    } else {
                        arrayList.add(c0060);
                        c0060 = c0061;
                    }
                    if (view instanceof TextView) {
                        String[] strArr2 = AbstractC1574.f5469;
                        List listM2212 = AbstractC0745.m2212(MagicFactory.get(-531364763925172L, strArr2), MagicFactory.get(-531381943794356L, strArr2), MagicFactory.get(-531407713598132L, strArr2), MagicFactory.get(-531450663271092L, strArr2));
                        if (!listM2212.isEmpty()) {
                            Iterator it = listM2212.iterator();
                            while (it.hasNext()) {
                                TextView textView = (TextView) view;
                                if (AbstractC2841.m4828(textView.getText(), (String) it.next(), true)) {
                                    textView.setVisibility(4);
                                }
                                break;
                            }
                        }
                    }
                }
                return c3497;
            case 8:
                String[] strArr3 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_hide_msg_avatar_iv, null, false);
                int i7 = R.id.moduleDialogCbHideMsgAvatarIvHideLeft;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbHideMsgAvatarIvHideLeft);
                if (materialCheckBox != null) {
                    i7 = R.id.moduleDialogCbHideMsgAvatarIvHideRight;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbHideMsgAvatarIvHideRight);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4676;
                        C2016 c2016 = new C2016(linearLayout, materialCheckBox, materialCheckBox2);
                        materialCheckBox.setChecked(C1543.f5396.m2536());
                        materialCheckBox2.setChecked(C1544.f5397.m2536());
                        C2007 c2007 = new C2007();
                        C1545.f5398.getClass();
                        c2007.f6678 = C1545.f5400;
                        c2007.f6680 = linearLayout;
                        c2007.m3870(MagicFactory.get(-532013303986868L, strArr3), new C0106(26, c2016));
                        AbstractC2784.m4755(c2007, null, 3);
                        return c3497;
                    }
                }
                throw new NullPointerException(MagicFactory.get(-665943269178036L, strArr3).concat(viewM4676.getResources().getResourceName(i7)));
            case 9:
                ((C1020) obj).f3733 = new C1538(11);
                return c3497;
            case 10:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                new C0408(0, 6, c1564).m1608(8);
                return c3497;
            case 11:
                C1333 c1333 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1333.m3053(MagicFactory.get(-532713383656116L, strArr4));
                C1981 c1982 = new C1981(4);
                c1982.m3827(MagicFactory.get(-532412735945396L, strArr4), MagicFactory.get(-532653254113972L, strArr4));
                c1333.f4794 = c1982;
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1020) obj).f3733 = new C1538(14);
                return c3497;
            case 13:
                int i8 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738((C1563) obj);
                c1299M4738.f4725 = AbstractC2519.m4527(TextView.class);
                Iterator it2 = c1299M4738.m3014().iterator();
                while (it2.hasNext()) {
                    TextView textView2 = (TextView) ((C1315) it2.next()).m3024();
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                }
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                C1333 c1334 = (C1333) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1334.m3053(MagicFactory.get(-533731290905268L, strArr5));
                C1981 c1983 = new C1981(4);
                c1983.m3826(MagicFactory.get(-533245959600820L, strArr5));
                if (AbstractC3471.m5079(EnumC3677.f11538) || AbstractC3471.m5080(EnumC3674.f11500)) {
                    c1983.m3827(MagicFactory.get(-533306089142964L, strArr5), MagicFactory.get(-533533722409652L, strArr5));
                }
                c1334.f4794 = c1983;
                return c3497;
            case 15:
                ((C1020) obj).f3733 = new C1538(18);
                return c3497;
            case 16:
                ((C1020) obj).f3733 = new C1538(19);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1563 c1565 = (C1563) obj;
                String[] strArr6 = AbstractC1574.f5469;
                if (AbstractC3471.m5079(EnumC3677.f11546)) {
                    int i9 = AbstractC1745.f5844;
                    C1299 c1299M4739 = AbstractC2784.m4738(c1565);
                    c1299M4739.f4725 = AbstractC1574.m3315(C1553.f5419).getDeclaringClass();
                    objM3268 = ((C1315) AbstractC0744.m2191(c1299M4739.m3014())).m3023();
                } else {
                    objM3268 = c1565.m3268();
                }
                int i10 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(objM3268).m3490();
                c1299M3490.f4725 = AbstractC2519.m4527(Context.class);
                AbstractC2207.m4098((Context) ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3024());
                C1973 c1973M3492 = AbstractC0968.m2484(objM3268).m3492();
                c1973M3492.f6543 = AbstractC2519.m4527(BaseAdapter.class);
                BaseAdapter baseAdapter = (BaseAdapter) ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3832(new Object[0]);
                C1299 c1299M3491 = AbstractC0968.m2484(objM3268).m3490();
                c1299M3491.f4725 = AbstractC2519.m4527(SparseArray.class);
                SparseArray sparseArray = (SparseArray) ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3024();
                Object obj2 = sparseArray.get(sparseArray.size() - 1);
                C1299 c1299M3492 = AbstractC0968.m2484(obj2).m3490();
                c1299M3492.f4726 = new C1538(22);
                Object objM3023 = ((C1315) AbstractC0744.m2191(c1299M3492.m3014())).m3023();
                for (InterfaceC1588 interfaceC1588 : C1554.f5421) {
                    try {
                        for (C1551 c1551 : interfaceC1588.mo2144()) {
                            C0707 c0707M4527 = AbstractC2519.m4527(objM3023.getClass());
                            i = iIntValue;
                            try {
                                Object[] objArr = {Integer.valueOf(c1551.f5414), c1551.f5415, MagicFactory.get(-57342108367540L, strArr6), Integer.valueOf(c1551.f5416), Integer.valueOf(i)};
                                ConcurrentHashMap concurrentHashMap = AbstractC0710.f2698;
                                sparseArray.put(sparseArray.size(), AbstractC0710.m2131(AbstractC2519.m4527(obj2.getClass()).mo2114(), Arrays.copyOf(new Object[]{AbstractC0710.m2131(c0707M4527.mo2114(), Arrays.copyOf(objArr, 5))}, 1)));
                                baseAdapter.notifyDataSetChanged();
                                iIntValue = i;
                                c2 = '\f';
                            } catch (Exception e) {
                                e = e;
                                ArrayList arrayList2 = C3678.f11549;
                                StringBuilder sb = new StringBuilder();
                                sb.append(MagicFactory.get(-57346403334836L, strArr6));
                                sb.append(interfaceC1588 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1588).mo1128() : MagicFactory.get(-57428007713460L, strArr6));
                                c = '\f';
                                AbstractC1194.m2792(sb, MagicFactory.get(-57466662419124L, strArr6), e, 12);
                                c2 = c;
                                iIntValue = i;
                            }
                        }
                        i = iIntValue;
                        c = c2;
                    } catch (Exception e2) {
                        e = e2;
                        i = iIntValue;
                    }
                    c2 = c;
                    iIntValue = i;
                }
                return c3497;
            case Opcodes.LDC /* 18 */:
                C1333 c1335 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1335.m3053(MagicFactory.get(-57698590653108L, strArr7));
                C1981 c1984 = new C1981(4);
                c1984.m3827(MagicFactory.get(-57501022157492L, strArr7), MagicFactory.get(-57616986274484L, strArr7));
                c1335.f4794 = c1984;
                return c3497;
            case 19:
                C1333 c1336 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1336.m3053(MagicFactory.get(-58085137709748L, strArr8));
                C1981 c1985 = new C1981(4);
                c1985.m3827(MagicFactory.get(-57775900064436L, strArr8), MagicFactory.get(-57891864181428L, strArr8));
                c1336.f4794 = c1985;
                return c3497;
            case 20:
                C1563 c1566 = (C1563) obj;
                c1566.getClass();
                try {
                    c2586 = c1566.m3267()[2];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                Integer num = (Integer) (c2586 instanceof C2585 ? null : c2586);
                iIntValue = num != null ? num.intValue() : 0;
                int i11 = AbstractC1745.f5844;
                C1299 c1299M47310 = AbstractC2784.m4738(c1566);
                c1299M47310.f4725 = AbstractC2519.m4527(SparseArray.class);
                C1299 c1299M3493 = AbstractC0968.m2484(((SparseArray) ((C1315) AbstractC0744.m2191(c1299M47310.m3014())).m3024()).get(iIntValue)).m3490();
                c1299M3493.f4726 = new C1538(21);
                C1299 c1299M3494 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M3493.m3014())).m3023()).m3490();
                c1299M3494.f4725 = AbstractC2519.m4527(Integer.TYPE);
                Iterator it3 = c1299M3494.m3014().iterator();
                while (it3.hasNext()) {
                    Integer num2 = (Integer) ((C1315) it3.next()).m3024();
                    for (InterfaceC1588 interfaceC1589 : C1554.f5421) {
                        try {
                            for (C1551 c1552 : interfaceC1589.mo2144()) {
                                int i12 = c1552.f5414;
                                if (num2 != null && num2.intValue() == i12) {
                                    c1552.f5417.invoke();
                                }
                            }
                        } catch (Exception e3) {
                            ArrayList arrayList3 = C3678.f11549;
                            StringBuilder sb2 = new StringBuilder();
                            String[] strArr9 = AbstractC1574.f5469;
                            sb2.append(MagicFactory.get(-57187489544884L, strArr9));
                            sb2.append(interfaceC1589 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1589).mo1128() : MagicFactory.get(-57269093923508L, strArr9));
                            AbstractC1194.m2792(sb2, MagicFactory.get(-57307748629172L, strArr9), e3, 12);
                        }
                    }
                }
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                Class cls4 = (Class) obj;
                Class<Boolean> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                zM4087 = AbstractC2207.m4087(cls4, clsM2186 != null ? clsM2186 : Boolean.class);
                break;
            case Opcodes.LLOAD /* 22 */:
                Class cls5 = (Class) obj;
                Class<Boolean> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                zM4087 = AbstractC2207.m4087(cls5, clsM2187 != null ? clsM2187 : Boolean.class);
                break;
            case Opcodes.FLOAD /* 23 */:
                C2309 c2309 = (C2309) obj;
                HookEntry.f968.getClass();
                String[] strArr10 = AbstractC1574.f5469;
                byte[] bytes = MagicFactory.get(-83549998807732L, strArr10).getBytes(AbstractC0599.f2413);
                MagicFactory.get(-83597243447988L, strArr10);
                boolean zEquals = Arrays.equals(bytes, new byte[]{87, 65, 117, JSONB.Constants.BC_STR_ASCII_FIX_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 108, JSONB.Constants.BC_STR_ASCII_FIX_32, 97, 114, JSONB.Constants.BC_STR_ASCII});
                boolean z = System.currentTimeMillis() - AbstractC3691.f11599 > 31104000000L;
                if ((zEquals && !z) || new Random().nextFloat() >= 0.25f) {
                    String str = MagicFactory.get(-83657372990132L, strArr10);
                    C3635 c3635 = C3635.f11372;
                    C2310 c2310 = c2309.f7437;
                    if ((c2310 != null ? c2310.f7438 : 0) != 1) {
                        if (c2310 != null) {
                            strM1338 = c2310.f7439;
                        } else {
                            C0251.f1415.getClass();
                            strM1338 = C0251.m1338();
                        }
                        if (strM1338.equals(str) || AbstractC2841.m4836(str)) {
                            c2309.m4175(c3635);
                        }
                    }
                }
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                ((C1020) obj).f3732 = new C1538(29);
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                ((C1020) obj).f3732 = new C1538(i4);
                return c3497;
            case 26:
                ((C1020) obj).f3732 = new C1538(28);
                return c3497;
            case 27:
                ((C1332) obj).m3050(new C1608(iIntValue));
                return c3497;
            case 28:
                ((C1332) obj).m3050(new C1608(i6));
                return c3497;
            default:
                ((C1332) obj).m3050(new C1608(i5));
                return c3497;
        }
        return Boolean.valueOf(!zM4087);
    }
}
