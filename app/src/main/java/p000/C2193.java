package p000;

import android.content.ContentValues;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᤝᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2193 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
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
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.modelimage");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.NetSceneUploadMsgImg", "/cgi-bin/micromsg-bin/uploadmsgimg");
                c1332.f4791 = c0705;
                return c3497;
            case 1:
                ((C1333) obj).m3052(new C2193(i5));
                return c3497;
            case 2:
                C1981 c1981 = (C1981) obj;
                Class<Integer> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                Class<Integer> cls4 = clsM2183 == null ? cls3 : clsM2183;
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                Class<String> cls5 = clsM2184 == null ? cls : clsM2184;
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                Class<String> cls6 = clsM2185 == null ? cls : clsM2185;
                Class<String> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                Class<String> cls7 = clsM2186 == null ? cls : clsM2186;
                Class<Integer> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                Class<Integer> cls8 = clsM2187 == null ? cls3 : clsM2187;
                Class<Integer> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                Class<Integer> cls9 = clsM2188 == null ? cls3 : clsM2188;
                Class<String> clsM2189 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                Class<String> cls10 = clsM2189 == null ? cls : clsM2189;
                Class<String> clsM21810 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                Class<String> cls11 = clsM21810 == null ? cls : clsM21810;
                Class<Boolean> clsM21811 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                Class<Boolean> cls12 = clsM21811 == null ? cls2 : clsM21811;
                Class<Integer> clsM21812 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                c1981.m3823(cls4, cls5, cls6, cls7, cls8, null, cls9, cls10, cls11, cls12, clsM21812 == null ? cls3 : clsM21812);
                return c3497;
            case 3:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C2193(i6);
                c1020.f3733 = new C2193(5);
                return c3497;
            case 4:
                ((C1332) obj).m3050(new C2193(6));
                return c3497;
            case 5:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                Class<String> clsM21813 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                cls = clsM21813 != null ? clsM21813 : String.class;
                Class<Integer> clsM21814 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                c1981M4739.m3823(cls, clsM21814 != null ? clsM21814 : Integer.class);
                c1333.f4794 = c1981M4739;
                return c3497;
            case 6:
                String[] strArr2 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-131962870168244L, strArr2), MagicFactory.get(-132087424219828L, strArr2));
                return c3497;
            case 7:
                C1020 c1021 = (C1020) obj;
                c1021.f3732 = new C2193(i2);
                c1021.f3733 = new C2193(11);
                return c3497;
            case 8:
                ((C1020) obj).f3733 = new C2193(9);
                return c3497;
            case 9:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                C2200.f7161.getClass();
                c1981M47310.m3820(AbstractC1574.m3314(C2198.f7159).getDeclaringClass());
                c1981M47310.m3827("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK");
                c1334.f4794 = c1981M47310;
                return c3497;
            case 10:
                C1332 c1335 = (C1332) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1335.m3051(MagicFactory.get(-133496173492916L, strArr3));
                C0705 c0706 = new C0705(4);
                c0706.m2127(MagicFactory.get(-132890583104180L, strArr3), MagicFactory.get(-133049496894132L, strArr3));
                c1335.f4791 = c0706;
                return c3497;
            case 11:
                ((C1333) obj).m3052(new C2193(i4));
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1981) obj).m3827("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK");
                return c3497;
            case 13:
                ((C1020) obj).f3733 = new C2193(14);
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                C1333 c1336 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1336.m3053(MagicFactory.get(-61649960565428L, strArr4));
                C1981 c1982 = new C1981(4);
                c1982.m3827(MagicFactory.get(-61280593377972L, strArr4), MagicFactory.get(-61383672593076L, strArr4));
                c1336.f4794 = c1982;
                return c3497;
            case 15:
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
                MsgInfoBean msgInfoBean = new MsgInfoBean(c2585);
                for (Object obj3 : C2233.f7231) {
                    try {
                        if (((C0186) obj3).mo3264() && msgInfoBean.isNotifyAll() && C0185.f1242.m2541().contains(msgInfoBean.getTalker())) {
                            c1563.m3272(null);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr5 = AbstractC1574.f5469;
                        sb.append(MagicFactory.get(-61151744359092L, strArr5));
                        sb.append(obj3 instanceof AbstractC2867 ? ((AbstractC2867) obj3).mo1128() : MagicFactory.get(-61207578933940L, strArr5));
                        AbstractC1194.m2792(sb, MagicFactory.get(-61246233639604L, strArr5), e, 12);
                    }
                }
                return c3497;
            case 16:
                ((C1020) obj).f3733 = new C2193(17);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1337.m3053(MagicFactory.get(-395124106328756L, strArr6));
                C1981 c1983 = new C1981(4);
                c1983.m3827(MagicFactory.get(-394965192538804L, strArr6), MagicFactory.get(-395051091884724L, strArr6));
                c1337.f4794 = c1983;
                return c3497;
            case Opcodes.LDC /* 18 */:
                C1563 c1564 = (C1563) obj;
                String[] strArr7 = AbstractC1574.f5469;
                int i8 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738(c1564);
                c1299M4738.f4725 = C0607.f2431.m2028();
                C1299 c1299M3490 = AbstractC0968.m2484((FrameLayout) ((C1315) AbstractC0744.m2191(c1299M4738.m3014())).m3024()).m3490();
                c1299M3490.f4726 = new C2193(19);
                Object obj4 = null;
                boolean z = false;
                for (Object obj5 : c1299M3490.m3014()) {
                    Object objM3023 = ((C1315) obj5).m3023();
                    if (AbstractC2207.m4087(objM3023 != null ? objM3023.getClass().getSimpleName() : null, MagicFactory.get(-394368192084660L, strArr7))) {
                        if (z) {
                            throw new IllegalArgumentException(MagicFactory.get(-394432616594100L, strArr7));
                        }
                        obj4 = obj5;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException(MagicFactory.get(-394655954893492L, strArr7));
                }
                FrameLayout frameLayout = (FrameLayout) ((C1315) obj4).m3024();
                int i9 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(frameLayout).m3492();
                c1973M3492.f6370 = MagicFactory.get(-394892178094772L, strArr7);
                String string = ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3832(new Object[0]).toString();
                if (string.length() > 0) {
                    ArrayList<C2355> arrayList2 = AbstractC2371.f7619;
                    ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(arrayList2, 10));
                    for (C2355 c2355 : arrayList2) {
                        c2355.getClass();
                        arrayList3.add(Boolean.valueOf(AbstractC2207.m4087(c2355.m4332(MagicFactory.get(-455111914551988L, strArr7), string), Boolean.TRUE)));
                    }
                    if (!arrayList3.isEmpty()) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) it.next()).booleanValue()) {
                                int i10 = AbstractC1745.f5844;
                                C1973 c1973M3493 = AbstractC0968.m2484(frameLayout).m3492();
                                c1973M3493.f6370 = MagicFactory.get(-394926537833140L, strArr7);
                                ((C1982) AbstractC0744.m2191(c1973M3493.m3799())).m3831(MagicFactory.get(-394960897571508L, strArr7));
                                c1564.m3272(null);
                            }
                        }
                    }
                }
                return c3497;
            case 19:
                zIsInterface = ((Class) obj).isInterface();
                break;
            case 20:
                ((C1020) obj).f3733 = new C2193(22);
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C1563 c1565 = (C1563) obj;
                int i11 = AbstractC1745.f5844;
                C1973 c1973M3494 = AbstractC0968.m2484(c1565.m3268()).m3492();
                c1973M3494.f6543 = AbstractC2519.m4527(Integer.TYPE);
                int iIntValue = ((Number) ((C1982) AbstractC2784.m4742(c1973M3494)).m3832(new Object[0])).intValue();
                Object objM3269 = c1565.m3269();
                String[] strArr8 = AbstractC1574.f5469;
                MagicFactory.get(-61920543505076L, strArr8);
                byte[] bArr = (byte[]) objM3269;
                for (Object obj6 : C2294.f7390) {
                    try {
                        ((C0728) obj6).m2157(c1565, iIntValue, bArr);
                    } catch (Exception e2) {
                        ArrayList arrayList4 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(MagicFactory.get(-62152471739060L, strArr8));
                        sb2.append(obj6 instanceof AbstractC2867 ? ((AbstractC2867) obj6).mo1128() : MagicFactory.get(-62208306313908L, strArr8));
                        AbstractC1194.m2792(sb2, MagicFactory.get(-62246961019572L, strArr8), e2, 12);
                    }
                }
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                C1333 c1338 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1338);
                Class<byte[]> clsM21815 = AbstractC0743.m2183(AbstractC2519.m4527(byte[].class));
                c1981M47311.m3824(clsM21815 != null ? clsM21815 : byte[].class);
                String[] strArr9 = AbstractC1574.f5469;
                c1981M47311.m3827(MagicFactory.get(-62281320757940L, strArr9), MagicFactory.get(-62388694940340L, strArr9));
                c1338.f4794 = c1981M47311;
                return c3497;
            case Opcodes.FLOAD /* 23 */:
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
                        C2298.f7405.getClass();
                        c2007.f6678 = C2298.f7407;
                        c2007.f6680 = linearLayout;
                        c2007.m3870(MagicFactory.get(-571806175984308L, strArr10), new C2042(i3, c2012));
                        AbstractC2784.m4755(c2007, null, 3);
                        return c3497;
                    }
                }
                throw new NullPointerException(MagicFactory.get(-667180219759284L, strArr10).concat(viewM4676.getResources().getResourceName(i12)));
            case Opcodes.DLOAD /* 24 */:
                Class cls13 = (Class) obj;
                Class<Boolean> clsM21816 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                zIsInterface = !AbstractC2207.m4087(cls13, clsM21816 != null ? clsM21816 : Boolean.class);
                break;
            case Opcodes.ALOAD /* 25 */:
                ((C1020) obj).f3733 = new C2316(i7);
                return c3497;
            case 26:
                String[] strArr11 = AbstractC1574.f5469;
                Object objM32610 = ((C1563) obj).m3269();
                if ((objM32610 instanceof List) && (!(objM32610 instanceof InterfaceC1737) || (objM32610 instanceof InterfaceC1738))) {
                    obj2 = objM32610;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(MagicFactory.get(-518531401644724L, strArr11), MagicFactory.get(-518600121121460L, strArr11));
                contentValues.put(MagicFactory.get(-518810574518964L, strArr11), MagicFactory.get(-518862114126516L, strArr11));
                contentValues.put(MagicFactory.get(-519072567524020L, strArr11), MagicFactory.get(-519111222229684L, strArr11));
                contentValues.put(MagicFactory.get(-519132697066164L, strArr11), (Integer) 1);
                contentValues.put(MagicFactory.get(-519179941706420L, strArr11), MagicFactory.get(-519222891379380L, strArr11));
                contentValues.put(MagicFactory.get(-519300200790708L, strArr11), (Integer) 7);
                contentValues.put(MagicFactory.get(-519330265561780L, strArr11), (Integer) 2);
                Object objM2131 = AbstractC0710.m2131(AbstractC2201.m3988(MagicFactory.get(-85525683763892L, strArr11)), new Object[0]);
                int i13 = AbstractC1745.f5844;
                C1973 c1973M3495 = AbstractC0968.m2484(objM2131).m3492();
                c1973M3495.f6370 = MagicFactory.get(-85723252259508L, strArr11);
                c1973M3495.m2888(Arrays.copyOf(new Object[]{AbstractC2519.m4527(ContentValues.class), AbstractC2519.m4527(Boolean.TYPE)}, 2));
                c1973M3495.m3732();
                ((C1982) AbstractC0744.m2191(c1973M3495.m3799())).m3831(contentValues, Boolean.TRUE);
                ((List) obj2).add(0, objM2131);
                return c3497;
            case 27:
                C1563 c1566 = (C1563) obj;
                String[] strArr12 = AbstractC1574.f5469;
                c1566.getClass();
                try {
                    c2586 = c1566.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                obj2 = c2586 instanceof C2585 ? null : c2586;
                int i14 = AbstractC1745.f5844;
                C1744 c1744M2484 = AbstractC0968.m2484(obj2);
                C1973 c1973M3496 = c1744M2484.m3492();
                c1973M3496.m3800(EnumC1999.FINAL);
                c1973M3496.f6544 = new C2193(24);
                C1299 c1299M3491 = AbstractC0968.m2484(((C1982) AbstractC2784.m4742(c1973M3496)).m3831(new Object[0])).m3490();
                c1299M3491.f4725 = AbstractC2201.m3988(MagicFactory.get(-85525683763892L, strArr12));
                C1299 c1299M3492 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3023()).m3490();
                c1299M3492.f6370 = MagicFactory.get(-519351740398260L, strArr12);
                String str = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                C1973 c1973M3497 = c1744M2484.m3492();
                c1973M3497.f6543 = AbstractC2519.m4527(List.class);
                List list = (List) ((C1982) AbstractC2784.m4742(c1973M3497)).m3832(new Object[0]);
                if (AbstractC2207.m4087(str, MagicFactory.get(-519416164907700L, strArr12))) {
                    list.addAll(C2321.f7459);
                }
                return c3497;
            case 28:
                ((C1333) obj).m3052(new C2316(i5));
                return c3497;
            default:
                C1333 c1339 = (C1333) obj;
                C1981 c1981M47312 = AbstractC2784.m4739(c1339);
                Class<ArrayList> clsM21817 = AbstractC0743.m2183(AbstractC2519.m4527(ArrayList.class));
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1981M47312, clsM21817 != null ? clsM21817 : ArrayList.class, cls3);
                c1981M47312.m3823(clsM4740 != null ? clsM4740 : Integer.class);
                String[] strArr13 = AbstractC1574.f5469;
                c1981M47312.m3827(MagicFactory.get(-519648093141684L, strArr13), MagicFactory.get(-519807006931636L, strArr13));
                c1339.f4794 = c1981M47312;
                return c3497;
        }
        return Boolean.valueOf(zIsInterface);
    }
}
