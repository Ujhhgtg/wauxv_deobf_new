package p000;

import android.content.Context;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.hook.HookEntry;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᲇᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1559 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5438;

    public /* synthetic */ C1559(int i) {
        this.f5438 = i;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0573  */
    /* JADX WARN: Code duplicated, block: B:150:0x057a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object objM3448;
        int i;
        C3554 c3554;
        char c;
        String strMo1274;
        Object c2641;
        boolean zM3322;
        String strM1484;
        int i2 = this.f5438;
        int i3 = 5;
        char c2 = '\f';
        Class<Boolean> cls = Boolean.class;
        int iIntValue = 0;
        int i4 = 1;
        C3554 c3555 = C3554.UNIT;
        switch (i2) {
            case 0:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.setting.ui.setting");
                C2012 c2012 = new C2012();
                c2012.m4020("onCreateAfter");
                if (AbstractC0972.m2596(EnumC3737.f11685) || AbstractC0972.m2597(EnumC3734.f11649)) {
                    c2012.m4021("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onCreateAfter bitmap == null, try fetchQRCode");
                }
                c1335.f4794 = c2012;
                return c3555;
            case 1:
                ((C1023) obj).f3740 = new C1559(4);
                return c3555;
            case 2:
                ((C1023) obj).f3740 = new C1559(i3);
                return c3555;
            case 3:
                C1574 c1574 = (C1574) obj;
                String[] strArr2 = AbstractC1471.f5234;
                if (AbstractC0972.m2596(EnumC3737.f11693)) {
                    int i5 = AbstractC1768.f5906;
                    C1300 c1300M4772 = AbstractC2844.m4772(c1574);
                    c1300M4772.f4724 = AbstractC0972.m2610(C1565.f5450).getDeclaringClass();
                    objM3448 = ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3126();
                } else {
                    objM3448 = c1574.m3448();
                }
                int i6 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(objM3448).m3558();
                c1300M3558.f4724 = AbstractC2574.m4549(Context.class);
                AbstractC2902.m4896((Context) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127());
                C2004 c2004M3560 = AbstractC2727.m4713(objM3448).m3560();
                c2004M3560.f6648 = AbstractC2574.m4549(BaseAdapter.class);
                BaseAdapter baseAdapter = (BaseAdapter) ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4026(new Object[0]);
                C1300 c1300M3559 = AbstractC2727.m4713(objM3448).m3558();
                c1300M3559.f4724 = AbstractC2574.m4549(SparseArray.class);
                SparseArray sparseArray = (SparseArray) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127();
                Object obj2 = sparseArray.get(sparseArray.size() - 1);
                C1300 c1300M35510 = AbstractC2727.m4713(obj2).m3558();
                c1300M35510.f4725 = new C1559(8);
                Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3126();
                for (InterfaceC1600 interfaceC1600 : C1566.f5452) {
                    try {
                        for (C1563 c1563 : interfaceC1600.mo2236()) {
                            C0702 c0702M4549 = AbstractC2574.m4549(objM3126.getClass());
                            i = iIntValue;
                            try {
                                c3554 = c3555;
                                try {
                                    Object[] objArr = {Integer.valueOf(c1563.f5445), c1563.f5446, "", Integer.valueOf(c1563.f5447), Integer.valueOf(i)};
                                    ConcurrentHashMap concurrentHashMap = AbstractC0705.f2692;
                                    try {
                                        sparseArray.put(sparseArray.size(), AbstractC0705.m2224(AbstractC2574.m4549(obj2.getClass()).mo2209(), Arrays.copyOf(new Object[]{AbstractC0705.m2224(c0702M4549.mo2209(), Arrays.copyOf(objArr, 5))}, 1)));
                                        baseAdapter.notifyDataSetChanged();
                                        iIntValue = i;
                                        c3555 = c3554;
                                        c2 = '\f';
                                    } catch (Exception e) {
                                        e = e;
                                        ArrayList arrayList = C3741.f11709;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("onCreateMenuItems ");
                                        if (interfaceC1600 instanceof AbstractC2927) {
                                            strMo1274 = ((AbstractC2927) interfaceC1600).mo1274();
                                        } else {
                                            strMo1274 = "LoadHook";
                                        }
                                        sb.append(strMo1274);
                                        c = '\f';
                                        AbstractC1095.m2808(sb, " Failed", e, 12);
                                        c2 = c;
                                        iIntValue = i;
                                        c3555 = c3554;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                c3554 = c3555;
                                ArrayList arrayList2 = C3741.f11709;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("onCreateMenuItems ");
                                if (interfaceC1600 instanceof AbstractC2927) {
                                    strMo1274 = ((AbstractC2927) interfaceC1600).mo1274();
                                } else {
                                    strMo1274 = "LoadHook";
                                }
                                sb2.append(strMo1274);
                                c = '\f';
                                AbstractC1095.m2808(sb2, " Failed", e, 12);
                                c2 = c;
                                iIntValue = i;
                                c3555 = c3554;
                            }
                        }
                        i = iIntValue;
                        c3554 = c3555;
                        c = c2;
                    } catch (Exception e4) {
                        e = e4;
                        i = iIntValue;
                    }
                    c2 = c;
                    iIntValue = i;
                    c3555 = c3554;
                }
                return c3555;
            case 4:
                C1335 c1336 = (C1335) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.ui");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.PlusSubMenuHelper", "processOnItemClick");
                c1336.f4794 = c2013;
                return c3555;
            case 5:
                C1335 c1337 = (C1335) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.ui");
                C2012 c2014 = new C2012();
                c2014.m4021("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
                c1337.f4794 = c2014;
                return c3555;
            case 6:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2641 = c1575.m3447()[2];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Integer num = (Integer) (c2641 instanceof C2641 ? null : c2641);
                iIntValue = num != null ? num.intValue() : 0;
                int i7 = AbstractC1768.f5906;
                C1300 c1300M4773 = AbstractC2844.m4772(c1575);
                c1300M4773.f4724 = AbstractC2574.m4549(SparseArray.class);
                C1300 c1300M35511 = AbstractC2727.m4713(((SparseArray) ((C1316) AbstractC0739.m2290(c1300M4773.m3117())).m3127()).get(iIntValue)).m3558();
                c1300M35511.f4725 = new C1559(7);
                C1300 c1300M35512 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M35511.m3117())).m3126()).m3558();
                c1300M35512.f4724 = AbstractC2574.m4549(Integer.TYPE);
                Iterator it = c1300M35512.m3117().iterator();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((C1316) it.next()).m3127();
                    for (InterfaceC1600 interfaceC1601 : C1566.f5452) {
                        try {
                            for (C1563 c1564 : interfaceC1601.mo2236()) {
                                int i8 = c1564.f5445;
                                if (num2 != null && num2.intValue() == i8) {
                                    c1564.f5448.invoke();
                                }
                            }
                        } catch (Exception e5) {
                            ArrayList arrayList3 = C3741.f11709;
                            StringBuilder sb3 = new StringBuilder();
                            String[] strArr5 = AbstractC1471.f5234;
                            sb3.append("onCreateMenuItems ");
                            sb3.append(interfaceC1601 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1601).mo1274() : "LoadHook");
                            AbstractC1095.m2808(sb3, " Failed", e5, 12);
                        }
                    }
                }
                return c3555;
            case 7:
                Class cls2 = (Class) obj;
                Class<Boolean> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                zM3322 = AbstractC1469.m3322(cls2, clsM4232 != null ? clsM4232 : Boolean.class);
                break;
            case 8:
                Class cls3 = (Class) obj;
                Class<Boolean> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                zM3322 = AbstractC1469.m3322(cls3, clsM4233 != null ? clsM4233 : Boolean.class);
                break;
            case 9:
                C2342 c2342 = (C2342) obj;
                HookEntry.f1034.getClass();
                String[] strArr6 = AbstractC1471.f5234;
                byte[] bytes = "WAuxiliary".getBytes(AbstractC0580.UTF_8);
                "getBytes(...)";
                boolean zEquals = Arrays.equals(bytes, new byte[]{87, 65, 117, JSONB.Constants.BC_STR_ASCII_FIX_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 108, JSONB.Constants.BC_STR_ASCII_FIX_32, 97, 114, JSONB.Constants.BC_STR_ASCII});
                boolean z = System.currentTimeMillis() - AbstractC3754.f11756 > 31104000000L;
                if ((zEquals && !z) || new Random().nextFloat() >= 0.25f) {
                    String str = "com.tencent.mm";
                    C3695 c3695 = C3695.f11521;
                    C2343 c2343 = c2342.f7559;
                    if ((c2343 != null ? c2343.f7560 : 0) != 1) {
                        if (c2343 != null) {
                            strM1484 = c2343.f7561;
                        } else {
                            C0261.f1489.getClass();
                            strM1484 = C0261.m1484();
                        }
                        if (strM1484.equals(str) || AbstractC2901.m4869(str)) {
                            c2342.m4304(c3695);
                        }
                    }
                }
                return c3555;
            case 10:
                ((C1023) obj).f3739 = new C1559(15);
                return c3555;
            case 11:
                ((C1023) obj).f3739 = new C1559(13);
                return c3555;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3739 = new C1559(14);
                return c3555;
            case 13:
                ((C1334) obj).m3153(new C1559(16));
                return c3555;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1334) obj).m3153(new C1559(17));
                return c3555;
            case 15:
                ((C1334) obj).m3153(new C1559(18));
                return c3555;
            case 16:
                String[] strArr7 = AbstractC1471.f5234;
                ((C0700) obj).m2220("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)");
                return c3555;
            case Opcodes.SIPUSH /* 17 */:
                C0700 c0700 = (C0700) obj;
                c0700.getClass();
                C1318 c1318 = new C1318();
                c1318.m3144(AbstractC0972.m2608(C1623.f5515));
                c1318.m3144(AbstractC0972.m2608(C1621.f5513));
                c0700.f2680 = c1318;
                return c3555;
            case Opcodes.LDC /* 18 */:
                String[] strArr8 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s");
                return c3555;
            case 19:
                ((C1023) obj).f3739 = new C1559(20);
                return c3555;
            case 20:
                C1334 c1334 = (C1334) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.modelavatar");
                C0700 c0701 = new C0700();
                c0701.m2220("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s");
                c1334.f4791 = c0701;
                return c3555;
            case Opcodes.ILOAD /* 21 */:
                ((C1023) obj).f3739 = new C1559(22);
                return c3555;
            case Opcodes.LLOAD /* 22 */:
                ((C1334) obj).m3153(new C1559(23));
                return c3555;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr10 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s");
                return c3555;
            case Opcodes.DLOAD /* 24 */:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C1559(25);
                c1023.f3740 = new C1559(26);
                return c3555;
            case Opcodes.ALOAD /* 25 */:
                ((C1334) obj).m3153(new C1559(27));
                return c3555;
            case 26:
                ((C1335) obj).m3155(new C1559(28));
                return c3555;
            case 27:
                String[] strArr11 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ImgUpload.MsgImgFeatureService", "taskListener", "params");
                return c3555;
            case 28:
                C2012 c2015 = (C2012) obj;
                c2015.m4015(1);
                c2015.m4021("params");
                return c3555;
            default:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C1633(iIntValue);
                c1024.f3740 = new C1633(i4);
                return c3555;
        }
        return Boolean.valueOf(!zM3322);
    }
}
