package p000;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1884 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6230;

    public /* synthetic */ C1884(int i) {
        this.f6230 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        int iIntValue;
        C0060 c0060;
        Object obj2;
        Object c2587;
        boolean zIsAssignableFrom;
        Object c2588;
        int i = this.f6230;
        int i2 = 28;
        int i3 = 27;
        int i4 = 14;
        int i5 = 6;
        int i6 = 10;
        Class<View.OnClickListener> cls = View.OnClickListener.class;
        int i7 = 1;
        int i8 = 12;
        int i9 = 0;
        int i10 = 4;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1563 c1563 = (C1563) obj;
                int i11 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738(c1563);
                String[] strArr = AbstractC1574.f5469;
                c1299M4738.f4725 = "com.tencent.mm.ui.MMFragmentActivity";
                Activity activity = (Activity) ((C1315) AbstractC0744.m2191(c1299M4738.m3014())).m3024();
                C1299 c1299M4739 = AbstractC2784.m4738(c1563);
                c1299M4739.f6370 = "mViewPager";
                ViewGroup viewGroup = (ViewGroup) ((C1315) AbstractC0744.m2191(c1299M4739.m3014())).m3024();
                C1299 c1299M47310 = AbstractC2784.m4738(c1563);
                c1299M47310.f6370 = "mTabsAdapter";
                Object objM3023 = ((C1315) AbstractC0744.m2191(c1299M47310.m3014())).m3023();
                for (InterfaceC1590 interfaceC1590 : C1886.f6233) {
                    try {
                        interfaceC1590.mo1691(activity, viewGroup, objM3023);
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        sb.append("doOnCreate ");
                        sb.append(interfaceC1590 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1590).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return c3497;
            case 1:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                String[] strArr2 = AbstractC1574.f5469;
                c1981M4739.m3825(MagicFactory.get(-58677843196596L, strArr2));
                c1981M4739.m3827(MagicFactory.get(-58798102280884L, strArr2), MagicFactory.get(-58926951299764L, strArr2));
                c1333.f4794 = c1981M4739;
                return c3497;
            case 2:
                C2839 c2839 = C2839.f9108;
                C1717 c1717 = C1717.f5811;
                C0708 c0708 = (C0708) obj;
                C0708.m2129(c0708, "key", C2839.f9109);
                C0708.m2129(c0708, "value", C1717.f5812);
                return c3497;
            case 3:
                ((C1020) obj).f3733 = new C1884(i10);
                return c3497;
            case 4:
                ((C1333) obj).m3052(new C1884(i5));
                return c3497;
            case 5:
                C1563 c1564 = (C1563) obj;
                Member member = ((C1559) c1564.f5438.f5658).f5430.method;
                if (member == null) {
                    throw new IllegalStateException("Current hooked Member is null");
                }
                Method method = member instanceof Method ? (Method) member : null;
                if (method == null) {
                    throw new IllegalStateException("Current hooked Member is not a Method");
                }
                C2315 c2315 = method.getParameterCount() == 16 ? new C2315(3, 4) : new C2315(2, 3);
                int iIntValue2 = ((Number) c2315.f7445).intValue();
                int iIntValue3 = ((Number) c2315.f7446).intValue();
                try {
                    c2585 = c1564.m3267()[iIntValue2];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Integer num = (Integer) c2585;
                int iIntValue4 = num != null ? num.intValue() : 0;
                try {
                    c2586 = c1564.m3267()[iIntValue3];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                    while (true) {
                        if (c0060.hasNext()) {
                            Object next = c0060.next();
                            EnumC1988 enumC1988 = (EnumC1988) next;
                            if (enumC1988.f6608 == iIntValue4 && enumC1988.f6609 == iIntValue) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                Integer num2 = (Integer) c2586;
                iIntValue = num2 != null ? num2.intValue() : 0;
                C1225 c1225 = EnumC1988.f6607;
                c1225.getClass();
                c0060 = new C0060(0, c1225);
                EnumC1988 enumC1989 = (EnumC1988) obj2;
                if (enumC1989 == EnumC1988.f6604 || enumC1989 == EnumC1988.f6605) {
                    C0408 c0408 = new C0408(iIntValue2, i5, c1564);
                    EnumC1988 enumC19810 = EnumC1988.f6603;
                    c0408.m1608(Integer.valueOf(enumC19810.f6608));
                    new C0408(iIntValue3, i5, c1564).m1608(Integer.valueOf(enumC19810.f6609));
                }
                return c3497;
            case 6:
                String[] strArr3 = AbstractC1574.f5469;
                ((C1981) obj).m3827(MagicFactory.get(-576410380925620L, strArr3), MagicFactory.get(-576526345042612L, strArr3));
                return c3497;
            case 7:
                C1563 c1565 = (C1563) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1565.getClass();
                try {
                    c2587 = c1565.m3267()[0];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                ContextMenu contextMenu = (ContextMenu) (c2587 instanceof C2585 ? null : c2587);
                C2873 c2873 = new C2873(new C1286(contextMenu, i10));
                int i12 = AbstractC1745.f5844;
                C1299 c1299M47311 = AbstractC2784.m4738(c1565);
                c1299M47311.f4726 = new C1884(8);
                C1299 c1299M3490 = AbstractC0968.m2484((View.OnClickListener) ((C1315) AbstractC0744.m2191(c1299M47311.m3014())).m3024()).m3490();
                c1299M3490.f6370 = MagicFactory.get(-59274843650740L, strArr4);
                C1973 c1973M3492 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3023()).m3492();
                c1973M3492.f6543 = AbstractC2519.m4527(List.class);
                List list = (List) ((C1982) AbstractC1194.m2778(c1973M3492)).m3832(new Object[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new MsgInfoBean(it.next()));
                }
                for (InterfaceC1591 interfaceC1591 : C2030.f6788) {
                    try {
                        for (C2027 c2027 : interfaceC1591.mo3339(arrayList2)) {
                            C1982 c1982M3830 = ((C1982) c2873.getValue()).m3830();
                            c1982M3830.m3378(contextMenu);
                            c1982M3830.m3831(Integer.valueOf(c2027.f6782), c2027.f6783);
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(MagicFactory.get(-59283433585332L, strArr4));
                        sb2.append(interfaceC1591 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1591).mo1128() : MagicFactory.get(-59365037963956L, strArr4));
                        AbstractC1194.m2792(sb2, MagicFactory.get(-59403692669620L, strArr4), e2, 12);
                    }
                }
                return c3497;
            case 8:
                C0707 c0707M4527 = AbstractC2519.m4527(cls);
                ConcurrentHashMap concurrentHashMap = AbstractC0710.f2698;
                zIsAssignableFrom = c0707M4527.mo2114().isAssignableFrom((Class) obj);
                break;
            case 9:
                C0707 c0707M4528 = AbstractC2519.m4527(cls);
                ConcurrentHashMap concurrentHashMap2 = AbstractC0710.f2698;
                zIsAssignableFrom = c0707M4528.mo2114().isAssignableFrom((Class) obj);
                break;
            case 10:
                C1317 c1317 = (C1317) obj;
                C1884 c1884 = new C1884(15);
                c1317.getClass();
                C1303 c1303 = new C1303(4);
                c1884.invoke(c1303);
                List arrayList4 = c1317.f4763;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c1317.f4763 = arrayList4;
                arrayList4.add(c1303);
                return c3497;
            case 11:
                C1984 c1984 = (C1984) obj;
                c1984.getClass();
                C1981 c1981 = new C1981(4);
                c1981.m3826("onMMMenuItemSelected");
                c1984.m3848(c1981);
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                C1317 c1318 = (C1317) obj;
                C1884 c1885 = new C1884(i4);
                c1318.getClass();
                C1303 c1304 = new C1303(4);
                c1885.invoke(c1304);
                List arrayList5 = c1318.f4763;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                c1318.f4763 = arrayList5;
                arrayList5.add(c1304);
                return c3497;
            case 13:
                C1984 c1985 = (C1984) obj;
                c1985.getClass();
                C1981 c1982 = new C1981(4);
                c1982.m3826("onCreateMMMenu");
                c1985.m3848(c1982);
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                C1303 c1305 = (C1303) obj;
                c1305.getClass();
                C0705 c0705 = new C0705(4);
                Class<View.OnClickListener> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                C0705.m2123(c0705, (clsM2183 != null ? clsM2183 : View.OnClickListener.class).getName());
                c1305.f4736 = c0705;
                return c3497;
            case 15:
                C1303 c1306 = (C1303) obj;
                c1306.getClass();
                C0705 c0706 = new C0705(4);
                Class<View.OnClickListener> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                C0705.m2123(c0706, (clsM2184 != null ? clsM2184 : View.OnClickListener.class).getName());
                c1306.f4736 = c0706;
                return c3497;
            case 16:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C1884(20);
                c1020.f3733 = new C1884(21);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1020 c1021 = (C1020) obj;
                c1021.f3732 = new C1884(18);
                c1021.f3733 = new C1884(19);
                return c3497;
            case Opcodes.LDC /* 18 */:
                C1332 c1332 = (C1332) obj;
                c1332.m3051("com.tencent.mm.ui.chatting.component");
                C0705 c0707 = new C0705(4);
                c0707.m2125(new C1884(i6));
                c0707.m2126(new C1884(11));
                c1332.f4791 = c0707;
                return c3497;
            case 19:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                c1981M47310.m3826("onMMMenuItemSelected");
                c1334.f4794 = c1981M47310;
                return c3497;
            case 20:
                C1332 c1335 = (C1332) obj;
                c1335.m3051("com.tencent.mm.ui.chatting.component");
                C0705 c0709 = new C0705(4);
                c0709.m2125(new C1884(i8));
                c0709.m2126(new C1884(13));
                c1335.f4791 = c0709;
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1336);
                c1981M47311.m3826("onCreateMMMenu");
                c1336.f4794 = c1981M47311;
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                C1563 c1566 = (C1563) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1566.getClass();
                try {
                    c2588 = c1566.m3267()[0];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                MenuItem menuItem = (MenuItem) (c2588 instanceof C2585 ? null : c2588);
                int i13 = AbstractC1745.f5844;
                C1299 c1299M47312 = AbstractC2784.m4738(c1566);
                c1299M47312.f4725 = AbstractC2519.m4527(View.class);
                View view = (View) ((C1315) AbstractC0744.m2191(c1299M47312.m3014())).m3024();
                C1299 c1299M47313 = AbstractC2784.m4738(c1566);
                c1299M47313.f4726 = new C1884(9);
                C1299 c1299M3491 = AbstractC0968.m2484((View.OnClickListener) ((C1315) AbstractC0744.m2191(c1299M47313.m3014())).m3024()).m3490();
                c1299M3491.f6370 = MagicFactory.get(-59438052407988L, strArr5);
                C1973 c1973M3493 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3023()).m3492();
                c1973M3493.f6543 = AbstractC2519.m4527(List.class);
                List list2 = (List) ((C1982) AbstractC1194.m2778(c1973M3493)).m3832(new Object[0]);
                ArrayList arrayList6 = new ArrayList(AbstractC0746.m2214(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(new MsgInfoBean(it2.next()));
                }
                for (InterfaceC1591 interfaceC1592 : C2030.f6788) {
                    try {
                        for (C2027 c2028 : interfaceC1592.mo3339(arrayList6)) {
                            if (menuItem.getItemId() == c2028.f6782) {
                                c2028.f6784.mo1196(view.getContext(), arrayList6);
                            }
                        }
                    } catch (Exception e3) {
                        ArrayList arrayList7 = C3678.f11549;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(MagicFactory.get(-59446642342580L, strArr5));
                        sb3.append(interfaceC1592 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1592).mo1128() : MagicFactory.get(-59528246721204L, strArr5));
                        AbstractC1194.m2792(sb3, MagicFactory.get(-59566901426868L, strArr5), e3, 12);
                    }
                }
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr6 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_msg_bg_bubble, null, false);
                int i14 = R.id.moduleDialogEdtMsgBgBubbleLeftBubble;
                if (((TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgBgBubbleLeftBubble)) != null) {
                    i14 = R.id.moduleDialogEdtMsgBgBubbleLeftDarkBubbleColor;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgBgBubbleLeftDarkBubbleColor);
                    if (textInputEditText != null) {
                        i14 = R.id.moduleDialogEdtMsgBgBubbleLeftLightBubbleColor;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgBgBubbleLeftLightBubbleColor);
                        if (textInputEditText2 != null) {
                            i14 = R.id.moduleDialogEdtMsgBgBubbleRightBubble;
                            if (((TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgBgBubbleRightBubble)) != null) {
                                i14 = R.id.moduleDialogEdtMsgBgBubbleRightDarkBubbleColor;
                                TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgBgBubbleRightDarkBubbleColor);
                                if (textInputEditText3 != null) {
                                    i14 = R.id.moduleDialogEdtMsgBgBubbleRightLightBubbleColor;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgBgBubbleRightLightBubbleColor);
                                    if (textInputEditText4 != null) {
                                        i14 = R.id.moduleDialogInputMsgBgBubbleLeftBubble;
                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgBgBubbleLeftBubble)) != null) {
                                            i14 = R.id.moduleDialogInputMsgBgBubbleLeftDarkBubbleColor;
                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgBgBubbleLeftDarkBubbleColor)) != null) {
                                                i14 = R.id.moduleDialogInputMsgBgBubbleLeftLightBubbleColor;
                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgBgBubbleLeftLightBubbleColor)) != null) {
                                                    i14 = R.id.moduleDialogInputMsgBgBubbleRightBubble;
                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgBgBubbleRightBubble)) != null) {
                                                        i14 = R.id.moduleDialogInputMsgBgBubbleRightDarkBubbleColor;
                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgBgBubbleRightDarkBubbleColor)) != null) {
                                                            i14 = R.id.moduleDialogInputMsgBgBubbleRightLightBubbleColor;
                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgBgBubbleRightLightBubbleColor)) != null) {
                                                                LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                                C2020 c2020 = new C2020(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4);
                                                                textInputEditText2.setText(C2038.f6812.m2542());
                                                                textInputEditText4.setText(C2040.f6814.m2542());
                                                                textInputEditText.setText(C2037.f6811.m2542());
                                                                textInputEditText3.setText(C2039.f6813.m2542());
                                                                C2007 c2007 = new C2007();
                                                                C2041.f6815.getClass();
                                                                c2007.f6678 = C2041.f6821;
                                                                c2007.f6680 = linearLayout;
                                                                c2007.m3870(MagicFactory.get(-492744417999540L, strArr6), new C0106(29, c2020));
                                                                c2007.m3869(MagicFactory.get(-492757302901428L, strArr6), new C1354(26));
                                                                C2007.m3866(c2007, null, 3);
                                                                c2007.m3868().m3791();
                                                                return c3497;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-666493024991924L, strArr6).concat(viewM4676.getResources().getResourceName(i14)));
            case Opcodes.DLOAD /* 24 */:
                String[] strArr7 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_msg_bg_color, null, false);
                int i15 = R.id.moduleDialogEdtMsgBgColorLeftDarkBgColor;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorLeftDarkBgColor);
                if (textInputEditText5 != null) {
                    i15 = R.id.moduleDialogEdtMsgBgColorLeftDarkStrokeColor;
                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorLeftDarkStrokeColor);
                    if (textInputEditText6 != null) {
                        i15 = R.id.moduleDialogEdtMsgBgColorLeftLightBgColor;
                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorLeftLightBgColor);
                        if (textInputEditText7 != null) {
                            i15 = R.id.moduleDialogEdtMsgBgColorLeftLightStrokeColor;
                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorLeftLightStrokeColor);
                            if (textInputEditText8 != null) {
                                i15 = R.id.moduleDialogEdtMsgBgColorRightDarkBgColor;
                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorRightDarkBgColor);
                                if (textInputEditText9 != null) {
                                    i15 = R.id.moduleDialogEdtMsgBgColorRightDarkStrokeColor;
                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorRightDarkStrokeColor);
                                    if (textInputEditText10 != null) {
                                        i15 = R.id.moduleDialogEdtMsgBgColorRightLightBgColor;
                                        TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorRightLightBgColor);
                                        if (textInputEditText11 != null) {
                                            i15 = R.id.moduleDialogEdtMsgBgColorRightLightStrokeColor;
                                            TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgBgColorRightLightStrokeColor);
                                            if (textInputEditText12 != null) {
                                                i15 = R.id.moduleDialogInputMsgBgColorLeftDarkBgColor;
                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorLeftDarkBgColor)) != null) {
                                                    i15 = R.id.moduleDialogInputMsgBgColorLeftDarkStrokeColor;
                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorLeftDarkStrokeColor)) != null) {
                                                        i15 = R.id.moduleDialogInputMsgBgColorLeftLightBgColor;
                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorLeftLightBgColor)) != null) {
                                                            i15 = R.id.moduleDialogInputMsgBgColorLeftLightStrokeColor;
                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorLeftLightStrokeColor)) != null) {
                                                                i15 = R.id.moduleDialogInputMsgBgColorRightDarkBgColor;
                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorRightDarkBgColor)) != null) {
                                                                    i15 = R.id.moduleDialogInputMsgBgColorRightDarkStrokeColor;
                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorRightDarkStrokeColor)) != null) {
                                                                        i15 = R.id.moduleDialogInputMsgBgColorRightLightBgColor;
                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorRightLightBgColor)) != null) {
                                                                            i15 = R.id.moduleDialogInputMsgBgColorRightLightStrokeColor;
                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgBgColorRightLightStrokeColor)) != null) {
                                                                                LinearLayout linearLayout2 = (LinearLayout) viewM4677;
                                                                                C2015 c2015 = new C2015(linearLayout2, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12);
                                                                                textInputEditText7.setText(C2045.f6828.m2542());
                                                                                textInputEditText8.setText(C2046.f6829.m2542());
                                                                                textInputEditText11.setText(C2049.f6832.m2542());
                                                                                textInputEditText12.setText(C2050.f6833.m2542());
                                                                                textInputEditText5.setText(C2043.f6826.m2542());
                                                                                textInputEditText6.setText(C2044.f6827.m2542());
                                                                                textInputEditText9.setText(C2047.f6830.m2542());
                                                                                textInputEditText10.setText(C2048.f6831.m2542());
                                                                                C2007 c2008 = new C2007();
                                                                                C2051.f6834.getClass();
                                                                                c2008.f6678 = C2051.f6836;
                                                                                c2008.f6680 = linearLayout2;
                                                                                c2008.m3870(MagicFactory.get(-495299923540660L, strArr7), new C2042(i9, c2015));
                                                                                c2008.m3869(MagicFactory.get(-495312808442548L, strArr7), new C1354(i3));
                                                                                C2007.m3866(c2008, null, 3);
                                                                                c2008.m3868().m3791();
                                                                                return c3497;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-666630463945396L, strArr7).concat(viewM4677.getResources().getResourceName(i15)));
            case Opcodes.ALOAD /* 25 */:
                String[] strArr8 = AbstractC1574.f5469;
                View viewM4678 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_msg_format, null, false);
                int i16 = R.id.moduleDialogEdtMsgFormatTextFormat;
                TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtMsgFormatTextFormat);
                if (textInputEditText13 != null) {
                    i16 = R.id.moduleDialogEdtMsgFormatTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtMsgFormatTextPlaceholders);
                    if (materialTextView != null) {
                        i16 = R.id.moduleDialogEdtMsgFormatTimeFormat;
                        TextInputEditText textInputEditText14 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtMsgFormatTimeFormat);
                        if (textInputEditText14 != null) {
                            i16 = R.id.moduleDialogInputMsgFormatTextFormat;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputMsgFormatTextFormat)) != null) {
                                i16 = R.id.moduleDialogInputMsgFormatTimeFormat;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputMsgFormatTimeFormat)) != null) {
                                    C2022 c2022 = new C2022((LinearLayout) viewM4678, textInputEditText13, materialTextView, textInputEditText14);
                                    textInputEditText13.setText(C2054.f6841.m2542());
                                    textInputEditText14.setText(C2055.f6842.m2542());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MagicFactory.get(-512767555533492L, strArr8));
                                    for (String str : C2056.f6844) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str + ' '));
                                        spannableStringBuilder.setSpan(new C0634(i7, str, c2022), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C2007 c2009 = new C2007();
                                    C2056.f6843.getClass();
                                    c2009.f6678 = C2056.f6846;
                                    c2009.f6680 = c2022.f6774;
                                    c2009.m3870(MagicFactory.get(-512836275010228L, strArr8), new C2042(i7, c2022));
                                    c2009.m3869(MagicFactory.get(-512849159912116L, strArr8), new C1354(i2));
                                    C2007.m3866(c2009, null, 3);
                                    c2009.m3868().m3791();
                                    return c3497;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-666767902898868L, strArr8).concat(viewM4678.getResources().getResourceName(i16)));
            case 26:
                C1020 c1022 = (C1020) obj;
                c1022.f3732 = new C1884(i3);
                c1022.f3733 = new C1884(i2);
                return c3497;
            case 27:
                C1332 c1337 = (C1332) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1337.m3051(MagicFactory.get(-513166987492020L, strArr9));
                C0705 c07010 = new C0705(4);
                c07010.m2127(MagicFactory.get(-512862044814004L, strArr9), MagicFactory.get(-513025253571252L, strArr9));
                c1337.f4791 = c07010;
                return c3497;
            case 28:
                C1333 c1338 = (C1333) obj;
                C1981 c1981M47312 = AbstractC2784.m4739(c1338);
                c1981M47312.m3822(new C1664(12, 14, 1));
                c1338.f4794 = c1981M47312;
                return c3497;
            default:
                ((C1020) obj).f3732 = new C2058(i9);
                return c3497;
        }
        return Boolean.valueOf(zIsAssignableFrom);
    }
}
