package p000;

import android.content.ContentValues;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2193 implements InterfaceC1425 {

    public final /* synthetic */ int f7154;

    public /* synthetic */ C2193(int i) {
        this.f7154 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        boolean zIsInterface;
        Object c2586;
        int i = this.f7154;
        Class<String> cls = String.class;
        int i2 = 10;
        Class<Boolean> cls2 = Boolean.class;
        int i3 = 7;
        int i4 = 12;
        int i5 = 2;
        Class<Integer> cls3 = Integer.class;
        int i6 = 4;
        Object obj2 = null;
        int i7 = 0;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.modelimage");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.NetSceneUploadMsgImg", "/cgi-bin/micromsg-bin/uploadmsgimg");
                c1332.f4791 = c0705;
                return unit;
            case 1:
                ((C1333) obj).m3052(new C2193(2));
                return unit;
            case 2:
                C1981 c1981 = (C1981) obj;
                Class<Integer> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class<Integer> cls4 = clsM2183 == null ? Integer.class : clsM2183;
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class<String> cls5 = clsM2184 == null ? String.class : clsM2184;
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class<String> cls6 = clsM2185 == null ? String.class : clsM2185;
                Class<String> clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class<String> cls7 = clsM2186 == null ? String.class : clsM2186;
                Class<Integer> clsM2187 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class<Integer> cls8 = clsM2187 == null ? Integer.class : clsM2187;
                Class<Integer> clsM2188 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class<Integer> cls9 = clsM2188 == null ? Integer.class : clsM2188;
                Class<String> clsM2189 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class<String> cls10 = clsM2189 == null ? String.class : clsM2189;
                Class<String> clsM21810 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class<String> cls11 = clsM21810 == null ? String.class : clsM21810;
                Class<Boolean> clsM21811 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                Class<Boolean> cls12 = clsM21811 == null ? Boolean.class : clsM21811;
                Class<Integer> clsM21812 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                c1981.paramTypes(cls4, cls5, cls6, cls7, cls8, null, cls9, cls10, cls11, cls12, clsM21812 == null ? Integer.class : clsM21812);
                return unit;
            case 3:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C2193(4);
                c1020.thisMethodMatcher = new C2193(5);
                return unit;
            case 4:
                ((C1332) obj).m3050(new C2193(6));
                return unit;
            case 5:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                Class<String> clsM21813 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                cls = clsM21813 != null ? clsM21813 : String.class;
                Class<Integer> clsM21814 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                c1981M4739.paramTypes(cls, clsM21814 != null ? clsM21814 : Integer.class);
                c1333.f4794 = c1981M4739;
                return unit;
            case 6:
                String[] strArr2 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.NetSceneUploadVoice", "/cgi-bin/micromsg-bin/uploadvoice");
                return unit;
            case 7:
                C1020 c1021 = (C1020) obj;
                c1021.declaringClassMatcher = new C2193(10);
                c1021.thisMethodMatcher = new C2193(11);
                return unit;
            case 8:
                ((C1020) obj).thisMethodMatcher = new C2193(9);
                return unit;
            case 9:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                
                c1981M47310.m3820(AbstractC1574.dexToCtor(C2198.f7159).getDeclaringClass());
                c1981M47310.m3827("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK");
                c1334.f4794 = c1981M47310;
                return unit;
            case 10:
                C1332 c1335 = (C1332) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1335.m3051("com.tencent.mm.pluginsdk.model");
                C0705 c0706 = new C0705(4);
                c0706.m2127("MicroMsg.NetSceneVerifyUser.dkverify", "/cgi-bin/micromsg-bin/verifyuser");
                c1335.f4791 = c0706;
                return unit;
            case 11:
                ((C1333) obj).m3052(new C2193(12));
                return unit;
            case 12 /* 12 */:
                ((C1981) obj).m3827("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK");
                return unit;
            case 13:
                ((C1020) obj).thisMethodMatcher = new C2193(14);
                return unit;
            case 14 /* 14 */:
                C1333 c1336 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.booter.notification");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s");
                c1336.f4794 = c1982;
                return unit;
            case 15:
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
                MsgInfoBean msgInfoBean = new MsgInfoBean(c2585);
                for (Object obj3 : C2233.f7231) {
                    try {
                        if (((C0186) obj3).mo3264() && msgInfoBean.isNotifyAll() && C0185.f1242.m2541().contains(msgInfoBean.getTalker())) {
                            c1563.setReturn(null);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr5 = AbstractC1574.f5469;
                        sb.append("onHandleMsg ");
                        sb.append(obj3 instanceof AbstractC2867 ? ((AbstractC2867) obj3).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return unit;
            case 16:
                ((C1020) obj).thisMethodMatcher = new C2193(17);
                return unit;
            case 17 /* 17 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.pluginsdk.ui.chat");
                C1981 c1983 = new C1981(4);
                c1983.m3827("MicroMsg.ChatFooter", "send msg onClick");
                c1337.f4794 = c1983;
                return unit;
            case 18 /* 18 */:
                C1563 c1564 = (C1563) obj;
                String[] strArr7 = AbstractC1574.f5469;
                int i8 = 0;
                C1299 c1299M4738 = AbstractC2784.m4738(c1564);
                c1299M4738.fieldType = C0607.f2431.m2028();
                C1299 c1299M3490 = AbstractC0968.startMethodResolution_((FrameLayout) ((C1315) AbstractC0744.firstInList(c1299M4738.resolve())).m3024()).m3490();
                c1299M3490.f4726 = new C2193(19);
                Object obj4 = null;
                boolean z = false;
                for (Object obj5 : c1299M3490.resolve()) {
                    Object objM3023 = ((C1315) obj5).m3023();
                    if (AbstractC2207.m4087(objM3023 != null ? objM3023.getClass().getSimpleName() : null, "MMFlexEditText")) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj4 = obj5;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                FrameLayout frameLayout = (FrameLayout) ((C1315) obj4).m3024();
                int i9 = 0;
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(frameLayout).m3492();
                c1973M3492.name = "getText";
                String string = ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).invoke(new Object[0]).toString();
                if (string.length() > 0) {
                    ArrayList<C2355> arrayList2 = AbstractC2371.f7619;
                    ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(arrayList2, 10));
                    for (C2355 c2355 : arrayList2) {
                        
                        arrayList3.add(Boolean.valueOf(AbstractC2207.m4087(c2355.m4332("onClickSendBtn", string), Boolean.TRUE)));
                    }
                    if (!arrayList3.isEmpty()) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) it.next()).booleanValue()) {
                                int i10 = 0;
                                MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(frameLayout).m3492();
                                c1973M3493.name = "setText";
                                ((C1982) AbstractC0744.firstInList(c1973M3493.resolve())).m3831("");
                                c1564.setReturn(null);
                            }
                        }
                    }
                }
                return unit;
            case 19:
                zIsInterface = ((Class) obj).isInterface();
                break;
            case 20:
                ((C1020) obj).thisMethodMatcher = new C2193(22);
                return unit;
            case 21 /* 21 */:
                C1563 c1565 = (C1563) obj;
                int i11 = 0;
                MethodResolver c1973M3494 = AbstractC0968.startMethodResolution_(c1565.m3268()).m3492();
                c1973M3494.returnType = AbstractC2519.classToKClass(Integer.TYPE);
                int iIntValue = ((Number) ((C1982) AbstractC2784.m4742(c1973M3494)).invoke(new Object[0])).intValue();
                Object objM3269 = c1565.m3269();
                String[] strArr8 = AbstractC1574.f5469;
                byte[] bArr = (byte[]) objM3269;
                for (Object obj6 : C2294.f7390) {
                    try {
                        ((C0728) obj6).m2157(c1565, iIntValue, bArr);
                    } catch (Exception e2) {
                        ArrayList arrayList4 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onGetBuffer ");
                        sb2.append(obj6 instanceof AbstractC2867 ? ((AbstractC2867) obj6).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb2, " Failed", e2, 12);
                    }
                }
                return unit;
            case 22 /* 22 */:
                C1333 c1338 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1338);
                Class<byte[]> clsM21815 = AbstractC0743.m2183(AbstractC2519.classToKClass(byte[].class));
                c1981M47311.m3824(clsM21815 != null ? clsM21815 : byte[].class);
                String[] strArr9 = AbstractC1574.f5469;
                c1981M47311.m3827("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: ");
                c1338.f4794 = c1981M47311;
                return unit;
            case 23 /* 23 */:
                String[] strArr10 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_open_info, null, false);
                int i12 = R.id.moduleDialogEdtOpenInfoId;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtOpenInfoId);
                if (textInputEditText != null) {
                    i12 = R.id.moduleDialogInputOpenInfoId;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputOpenInfoId)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4676;
                        C2012 c2012 = new C2012(linearLayout, textInputEditText);
                        C2007 c2007 = new C2007();
                        
                        c2007.f6678 = C2298.f7407;
                        c2007.f6680 = linearLayout;
                        c2007.m3870("确定", new C2042(7, c2012));
                        AbstractC2784.m4755(c2007, null, 3);
                        return unit;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i12)));
            case 24 /* 24 */:
                Class cls13 = (Class) obj;
                Class<Boolean> clsM21816 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                zIsInterface = !AbstractC2207.m4087(cls13, clsM21816 != null ? clsM21816 : Boolean.class);
                break;
            case 25 /* 25 */:
                ((C1020) obj).thisMethodMatcher = new C2316(0);
                return unit;
            case 26:
                String[] strArr11 = AbstractC1574.f5469;
                Object objM32610 = ((C1563) obj).m3269();
                if ((objM32610 instanceof List) && (!(objM32610 instanceof InterfaceC1737) || (objM32610 instanceof InterfaceC1738))) {
                    obj2 = objM32610;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("packGrayIconUrl", "https://avatars.githubusercontent.com/u/49312623");
                contentValues.put("packIconUrl", "https://avatars.githubusercontent.com/u/49312623");
                contentValues.put("packName", "面板表情");
                contentValues.put("packStatus", (Integer) 1);
                contentValues.put("productID", "wauxv.panel.emoji");
                contentValues.put("status", (Integer) 7);
                contentValues.put("sync", (Integer) 2);
                Object objM2131 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.storage.emotion.EmojiGroupInfo"), new Object[0]);
                int i13 = 0;
                MethodResolver c1973M3495 = AbstractC0968.startMethodResolution_(objM2131).m3492();
                c1973M3495.name = "convertFrom";
                c1973M3495.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(ContentValues.class), AbstractC2519.classToKClass(Boolean.TYPE)}, 2));
                c1973M3495.superclass();
                ((C1982) AbstractC0744.firstInList(c1973M3495.resolve())).m3831(contentValues, Boolean.TRUE);
                ((List) obj2).add(0, objM2131);
                return unit;
            case 27:
                C1563 c1566 = (C1563) obj;
                String[] strArr12 = AbstractC1574.f5469;
                
                try {
                    c2586 = c1566.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                obj2 = c2586 instanceof C2585 ? null : c2586;
                int i14 = 0;
                C1744 c1744M2484 = AbstractC0968.startMethodResolution_(obj2);
                MethodResolver c1973M3496 = c1744M2484.m3492();
                c1973M3496.m3800(EnumC1999.FINAL);
                c1973M3496.f6544 = new C2193(24);
                C1299 c1299M3491 = AbstractC0968.startMethodResolution_(((C1982) AbstractC2784.m4742(c1973M3496)).m3831(new Object[0])).m3490();
                c1299M3491.fieldType = AbstractC2201.m3988("com.tencent.mm.storage.emotion.EmojiGroupInfo");
                C1299 c1299M3492 = AbstractC0968.startMethodResolution_(((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).m3023()).m3490();
                c1299M3492.name = "field_packName";
                String str = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                MethodResolver c1973M3497 = c1744M2484.m3492();
                c1973M3497.returnType = AbstractC2519.classToKClass(List.class);
                List list = (List) ((C1982) AbstractC2784.m4742(c1973M3497)).invoke(new Object[0]);
                if (AbstractC2207.m4087(str, "面板表情")) {
                    list.addAll(C2321.f7459);
                }
                return unit;
            case 28:
                ((C1333) obj).m3052(new C2316(2));
                return unit;
            default:
                C1333 c1339 = (C1333) obj;
                C1981 c1981M47312 = AbstractC2784.m4739(c1339);
                Class<ArrayList> clsM21817 = AbstractC0743.m2183(AbstractC2519.classToKClass(ArrayList.class));
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1981M47312, clsM21817 != null ? clsM21817 : ArrayList.class, Integer.class);
                c1981M47312.paramTypes(clsM4740 != null ? clsM4740 : Integer.class);
                String[] strArr13 = AbstractC1574.f5469;
                c1981M47312.m3827("MicroMsg.emoji.EmojiGroupInfoStorage", "get Panel EmojiGroupInfo.");
                c1339.f4794 = c1981M47312;
                return unit;
        }
        return Boolean.valueOf(zIsInterface);
    }
}
