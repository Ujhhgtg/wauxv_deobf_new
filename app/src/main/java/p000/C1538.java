package p000;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1538 implements InterfaceC1425 {

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
        Unit unit = Unit.INSTANCE;
        switch (i2) {
            case 0:
                ((C1333) obj).m3052(new C1338(27));
                return unit;
            case 1:
                Object objM3269 = ((C1563) obj).m3269();
                AbstractC3580.m5198((ViewGroup) (objM3269 instanceof ViewGroup ? objM3269 : null), new int[]{0, 1, 1}).setVisibility(8);
                return unit;
            case 2:
                ((C1332) obj).m3050(new C1538(5));
                return unit;
            case 3:
                ((C1333) obj).m3052(new C1538(6));
                return unit;
            case 4:
                Object objM32610 = ((C1563) obj).m3269();
                AbstractC3580.m5198((ViewGroup) (objM32610 instanceof ViewGroup ? objM32610 : null), new int[]{0, 1, 1}).setVisibility(8);
                return unit;
            case 5:
                String[] strArr = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ConversationAdapter.MvvmConversationAdapter", "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d");
                return unit;
            case 6:
                C1981 c1981 = (C1981) obj;
                Class<View> cls2 = View.class;
                Class<View> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(View.class));
                if (clsM2183 == null) {
                    clsM2183 = View.class;
                }
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1981, clsM2183, Integer.class);
                Class cls3 = clsM4740 != null ? clsM4740 : Integer.class;
                Class<View> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(View.class));
                cls2 = clsM2184 != null ? clsM2184 : View.class;
                Class<ViewGroup> clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(ViewGroup.class));
                c1981.paramTypes(cls3, cls2, clsM2185 != null ? clsM2185 : ViewGroup.class);
                return unit;
            case 7:
                C1563 c1563 = (C1563) obj;
                
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
                        List listM2212 = AbstractC0745.listOf("微信号", "微信 ID", "Weixin ID", "WeChat ID");
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
                return unit;
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
                        
                        c2007.f6678 = C1545.f5400;
                        c2007.f6680 = linearLayout;
                        c2007.m3870("保存", new C0106(26, c2016));
                        AbstractC2784.m4755(c2007, null, 3);
                        return unit;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i7)));
            case 9:
                ((C1020) obj).thisMethodMatcher = new C1538(11);
                return unit;
            case 10:
                C1563 c1564 = (C1563) obj;
                
                new C0408(0, 6, c1564).m1608(8);
                return unit;
            case 11:
                C1333 c1333 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.ui.conversation.banner");
                C1981 c1982 = new C1981(4);
                c1982.m3827("com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility");
                c1333.f4794 = c1982;
                return unit;
            case 12 /* 12 */:
                ((C1020) obj).thisMethodMatcher = new C1538(14);
                return unit;
            case 13:
                int i8 = 0;
                C1299 c1299M4738 = AbstractC2784.m4738((C1563) obj);
                c1299M4738.fieldType = AbstractC2519.classToKClass(TextView.class);
                Iterator it2 = c1299M4738.resolve().iterator();
                while (it2.hasNext()) {
                    TextView textView2 = (TextView) ((C1315) it2.next()).m3024();
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                }
                return unit;
            case 14 /* 14 */:
                C1333 c1334 = (C1333) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.setting.ui.setting");
                C1981 c1983 = new C1981(4);
                c1983.m3826("onCreateAfter");
                if (AbstractC3471.m5079(WeChatVersions.f11538) || AbstractC3471.m5080(WeChatVersionsPlay.f11500)) {
                    c1983.m3827("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onCreateAfter bitmap == null, try fetchQRCode");
                }
                c1334.f4794 = c1983;
                return unit;
            case 15:
                ((C1020) obj).thisMethodMatcher = new C1538(18);
                return unit;
            case 16:
                ((C1020) obj).thisMethodMatcher = new C1538(19);
                return unit;
            case 17 /* 17 */:
                C1563 c1565 = (C1563) obj;
                String[] strArr6 = AbstractC1574.f5469;
                if (AbstractC3471.m5079(WeChatVersions.f11546)) {
                    int i9 = 0;
                    C1299 c1299M4739 = AbstractC2784.m4738(c1565);
                    c1299M4739.fieldType = AbstractC1574.dexToMethod(C1553.f5419).getDeclaringClass();
                    objM3268 = ((C1315) AbstractC0744.firstInList(c1299M4739.resolve())).m3023();
                } else {
                    objM3268 = c1565.m3268();
                }
                int i10 = 0;
                C1299 c1299M3490 = AbstractC0968.startMethodResolution_(objM3268).m3490();
                c1299M3490.fieldType = AbstractC2519.classToKClass(Context.class);
                AbstractC2207.m4098((Context) ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3024());
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(objM3268).m3492();
                c1973M3492.returnType = AbstractC2519.classToKClass(BaseAdapter.class);
                BaseAdapter baseAdapter = (BaseAdapter) ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).invoke(new Object[0]);
                C1299 c1299M3491 = AbstractC0968.startMethodResolution_(objM3268).m3490();
                c1299M3491.fieldType = AbstractC2519.classToKClass(SparseArray.class);
                SparseArray sparseArray = (SparseArray) ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).m3024();
                Object obj2 = sparseArray.get(sparseArray.size() - 1);
                C1299 c1299M3492 = AbstractC0968.startMethodResolution_(obj2).m3490();
                c1299M3492.f4726 = new C1538(22);
                Object objM3023 = ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).m3023();
                for (InterfaceC1588 interfaceC1588 : C1554.f5421) {
                    try {
                        for (C1551 c1551 : interfaceC1588.mo2144()) {
                            C0707 c0707M4527 = AbstractC2519.classToKClass(objM3023.getClass());
                            i = 0;
                            try {
                                Object[] objArr = {Integer.valueOf(c1551.f5414), c1551.f5415, "", Integer.valueOf(c1551.f5416), Integer.valueOf(0)};
                                ConcurrentHashMap concurrentHashMap = AbstractC0710.f2698;
                                sparseArray.put(sparseArray.size(), AbstractC0710.m2131(AbstractC2519.classToKClass(obj2.getClass()).mo2114(), Arrays.copyOf(new Object[]{AbstractC0710.m2131(c0707M4527.mo2114(), Arrays.copyOf(objArr, 5))}, 1)));
                                baseAdapter.notifyDataSetChanged();
                                iIntValue = 0;
                                c2 = '\f';
                            } catch (Exception e) {
                                e = e;
                                ArrayList arrayList2 = C3678.f11549;
                                StringBuilder sb = new StringBuilder();
                                sb.append("onCreateMenuItems ");
                                sb.append(interfaceC1588 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1588).mo1128() : "LoadHook");
                                c = '\f';
                                AbstractC1194.m2792(sb, " Failed", e, 12);
                                c2 = 12;
                                iIntValue = 0;
                            }
                        }
                        i = 0;
                        c = c2;
                    } catch (Exception e2) {
                        e = e2;
                        i = 0;
                    }
                    c2 = c;
                    iIntValue = 0;
                }
                return unit;
            case 18 /* 18 */:
                C1333 c1335 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.ui");
                C1981 c1984 = new C1981(4);
                c1984.m3827("MicroMsg.PlusSubMenuHelper", "processOnItemClick");
                c1335.f4794 = c1984;
                return unit;
            case 19:
                C1333 c1336 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.ui");
                C1981 c1985 = new C1981(4);
                c1985.m3827("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
                c1336.f4794 = c1985;
                return unit;
            case 20:
                C1563 c1566 = (C1563) obj;
                
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
                int i11 = 0;
                C1299 c1299M47310 = AbstractC2784.m4738(c1566);
                c1299M47310.fieldType = AbstractC2519.classToKClass(SparseArray.class);
                C1299 c1299M3493 = AbstractC0968.startMethodResolution_(((SparseArray) ((C1315) AbstractC0744.firstInList(c1299M47310.resolve())).m3024()).get(iIntValue)).m3490();
                c1299M3493.f4726 = new C1538(21);
                C1299 c1299M3494 = AbstractC0968.startMethodResolution_(((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).m3023()).m3490();
                c1299M3494.fieldType = AbstractC2519.classToKClass(Integer.TYPE);
                Iterator it3 = c1299M3494.resolve().iterator();
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
                            sb2.append("onCreateMenuItems ");
                            sb2.append(interfaceC1589 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1589).mo1128() : "LoadHook");
                            AbstractC1194.m2792(sb2, " Failed", e3, 12);
                        }
                    }
                }
                return unit;
            case 21 /* 21 */:
                Class cls4 = (Class) obj;
                Class<Boolean> clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                zM4087 = AbstractC2207.m4087(cls4, clsM2186 != null ? clsM2186 : Boolean.class);
                break;
            case 22 /* 22 */:
                Class cls5 = (Class) obj;
                Class<Boolean> clsM2187 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                zM4087 = AbstractC2207.m4087(cls5, clsM2187 != null ? clsM2187 : Boolean.class);
                break;
            case 23 /* 23 */:
                C2309 c2309 = (C2309) obj;
                
                String[] strArr10 = AbstractC1574.f5469;
                byte[] bytes = "WAuxiliary".getBytes(AbstractC0599.f2413);
                "getBytes(...)";
                boolean zEquals = Arrays.equals(bytes, new byte[]{87, 65, 117, 120, 105, 108, 105, 97, 114, 121});
                boolean z = System.currentTimeMillis() - AbstractC3691.f11599 > 31104000000L;
                if ((zEquals && !z) || new Random().nextFloat() >= 0.25f) {
                    String str = "com.tencent.mm";
                    C3635 c3635 = C3635.f11372;
                    C2310 c2310 = c2309.f7437;
                    if ((c2310 != null ? c2310.f7438 : 0) != 1) {
                        if (c2310 != null) {
                            strM1338 = c2310.f7439;
                        } else {
                            
                            strM1338 = C0251.m1338();
                        }
                        if (strM1338.equals("com.tencent.mm") || AbstractC2841.m4836("com.tencent.mm")) {
                            c2309.m4175(c3635);
                        }
                    }
                }
                return unit;
            case 24 /* 24 */:
                ((C1020) obj).declaringClassMatcher = new C1538(29);
                return unit;
            case 25 /* 25 */:
                ((C1020) obj).declaringClassMatcher = new C1538(27);
                return unit;
            case 26:
                ((C1020) obj).declaringClassMatcher = new C1538(28);
                return unit;
            case 27:
                ((C1332) obj).m3050(new C1608(0));
                return unit;
            case 28:
                ((C1332) obj).m3050(new C1608(1));
                return unit;
            default:
                ((C1332) obj).m3050(new C1608(2));
                return unit;
        }
        return Boolean.valueOf(!zM4087);
    }
}
