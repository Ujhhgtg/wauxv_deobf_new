package p000;

import android.content.ContentValues;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᲁᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2832 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9035;

    public /* synthetic */ C2832(int i) {
        this.f9035 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        String str;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        Object c2647;
        Object c2648;
        Object c2649;
        Object c26410;
        Object c26411;
        Object c26412;
        Object c26413;
        Object c26414;
        Object c26415;
        Object c26416;
        Object c26417;
        Object c26418;
        Object c26419;
        int i = this.f9035;
        int i2 = 4;
        int i3 = 3;
        int i4 = 12;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C2015 c2015 = (C2015) obj;
                c2015.getClass();
                C2012 c2012 = new C2012();
                String[] strArr = AbstractC1471.f5234;
                c2012.m4020("compareContent");
                c2015.m4042(c2012);
                C2012 c2013 = new C2012();
                c2013.m4020("op");
                c2015.m4042(c2013);
                c2015.m4043(new C2832(i6));
                return c3554;
            case 1:
                C2012 c2014 = (C2012) obj;
                C2832 c2832 = new C2832(i5);
                c2014.getClass();
                C2015 c2016 = new C2015();
                c2832.invoke(c2016);
                c2014.f6670 = c2016;
                return c3554;
            case 2:
                C2015 c2017 = (C2015) obj;
                c2017.m4043(new C2832(i3));
                c2017.m4043(new C2832(i2));
                return c3554;
            case 3:
                String[] strArr2 = AbstractC1471.f5234;
                ((C2012) obj).m4021("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return c3554;
            case 4:
                String[] strArr3 = AbstractC1471.f5234;
                ((C2012) obj).m4021("initCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                return c3554;
            case 5:
                ((C1023) obj).f3739 = new C2832(6);
                return c3554;
            case 6:
                ((C1334) obj).m3153(new C2832(7));
                return c3554;
            case 7:
                ((C0700) obj).m2219(new C2832(i7));
                return c3554;
            case 8:
                ((C1023) obj).f3740 = new C2832(14);
                return c3554;
            case 9:
                ((C1023) obj).f3740 = new C2832(i4);
                return c3554;
            case 10:
                ((C1023) obj).f3740 = new C2832(13);
                return c3554;
            case 11:
                ((C1023) obj).f3740 = new C2832(15);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C1335 c1335 = (C1335) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2018 = new C2012();
                c2018.m4021("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1335.f4794 = c2018;
                return c3554;
            case 13:
                C1335 c1336 = (C1335) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2019 = new C2012();
                c2019.m4021("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1336.f4794 = c2019;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1335 c1337 = (C1335) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c20110 = new C2012();
                c20110.m4021("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1337.f4794 = c20110;
                return c3554;
            case 15:
                C1335 c1338 = (C1335) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1338.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c20111 = new C2012();
                c20111.m4021("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1338.f4794 = c20111;
                return c3554;
            case 16:
                ((C1023) obj).f3740 = new C2832(17);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1335 c1339 = (C1335) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1339.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c20112 = new C2012();
                c20112.m4021("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
                c1339.f4794 = c20112;
                return c3554;
            case Opcodes.LDC /* 18 */:
                String[] strArr9 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_sport_step, null, false);
                int i8 = R.id.moduleDialogEdtSportModifyStep;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSportModifyStep);
                if (textInputEditText != null) {
                    i8 = R.id.moduleDialogInputSportModifyStep;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputSportModifyStep)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                        C2041 c2041 = new C2041(linearLayout, textInputEditText, 8);
                        textInputEditText.setText(String.valueOf(C2856.f9084.m2663()));
                        C2037 c2037 = new C2037();
                        C2857.f9085.getClass();
                        c2037.f6779 = C2857.f9087;
                        c2037.f6781 = linearLayout;
                        c2037.m4057("保存", new C2070(c2041, 18));
                        AbstractC2844.m4788(c2037, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i8)));
            case 19:
                ((C1023) obj).f3740 = new C2832(20);
                return c3554;
            case 20:
                C1335 c13310 = (C1335) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c13310.m3156("com.tencent.mm.plugin.sport.model");
                C2012 c20113 = new C2012();
                c20113.m4021("MicroMsg.Sport.DeviceStepManager", "get today step from %s todayStep %d");
                c13310.f4794 = c20113;
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1574) obj).m3452(Long.valueOf(Math.min(C2856.f9084.m2663(), 98800L)));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1023) obj).f3739 = new C2832(23);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1334) obj).m3153(new C2832(24));
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr11 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ");
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1574 c1574 = (C1574) obj;
                String[] strArr12 = AbstractC1471.f5234;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                String str2 = (String) c2641;
                str = str2 != null ? str2 : "";
                try {
                    c2642 = c1574.m3447()[1];
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
                    c2643 = c1574.m3447()[2];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                ContentValues contentValues = (ContentValues) c2643;
                try {
                    c2644 = c1574.m3447()[3];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                for (InterfaceC1614 interfaceC1614 : C2860.f9093) {
                    try {
                        interfaceC1614.mo3505(str, contentValues);
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onDatabaseInsertBefore ");
                        sb.append(interfaceC1614 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1614).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 26:
                C1574 c1575 = (C1574) obj;
                String[] strArr13 = AbstractC1471.f5234;
                c1575.getClass();
                try {
                    c2645 = c1575.m3447()[0];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                if (c2645 instanceof C2641) {
                    c2645 = null;
                }
                String str3 = (String) c2645;
                String str4 = str3 == null ? "" : str3;
                try {
                    c2646 = c1575.m3447()[1];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                if (c2646 instanceof C2641) {
                    c2646 = null;
                }
                ContentValues contentValues2 = (ContentValues) c2646;
                try {
                    c2647 = c1575.m3447()[2];
                    if (c2647 == null) {
                        c2647 = null;
                    }
                } catch (Throwable th7) {
                    c2647 = new C2641(th7);
                }
                if (c2647 instanceof C2641) {
                    c2647 = null;
                }
                String str5 = (String) c2647;
                String str6 = str5 == null ? "" : str5;
                try {
                    c2648 = c1575.m3447()[3];
                    if (c2648 == null) {
                        c2648 = null;
                    }
                } catch (Throwable th8) {
                    c2648 = new C2641(th8);
                }
                if (c2648 instanceof C2641) {
                    c2648 = null;
                }
                String[] strArr14 = (String[]) c2648;
                try {
                    c2649 = c1575.m3447()[4];
                    if (c2649 == null) {
                        c2649 = null;
                    }
                } catch (Throwable th9) {
                    c2649 = new C2641(th9);
                }
                Integer num = (Integer) (c2649 instanceof C2641 ? null : c2649);
                int iIntValue = num != null ? num.intValue() : 0;
                for (InterfaceC1614 interfaceC1615 : C2860.f9093) {
                    try {
                        interfaceC1615.mo1379(c1575, str4, contentValues2, str6, strArr14, iIntValue);
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onDatabaseUpdateBefore ");
                        sb2.append(interfaceC1615 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1615).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case 27:
                C1574 c1576 = (C1574) obj;
                String[] strArr15 = AbstractC1471.f5234;
                c1576.getClass();
                try {
                    Object obj2 = c1576.m3447()[0];
                    break;
                } catch (Throwable unused) {
                }
                try {
                    c26410 = c1576.m3447()[1];
                    if (c26410 == null) {
                        c26410 = null;
                    }
                } catch (Throwable th10) {
                    c26410 = new C2641(th10);
                }
                if (c26410 instanceof C2641) {
                    c26410 = null;
                }
                String str7 = (String) c26410;
                str = str7 != null ? str7 : "";
                try {
                    c26411 = c1576.m3447()[2];
                    if (c26411 == null) {
                        c26411 = null;
                    }
                } catch (Throwable th11) {
                    c26411 = new C2641(th11);
                }
                if (c26411 instanceof C2641) {
                    c26411 = null;
                }
                try {
                    c26412 = c1576.m3447()[3];
                    if (c26412 == null) {
                        c26412 = null;
                    }
                } catch (Throwable th12) {
                    c26412 = new C2641(th12);
                }
                try {
                    Object obj3 = c1576.m3447()[4];
                    break;
                } catch (Throwable unused2) {
                }
                for (InterfaceC1614 interfaceC1616 : C2860.f9093) {
                    try {
                        interfaceC1616.mo2141(c1576, str);
                    } catch (Exception e3) {
                        ArrayList arrayList3 = C3741.f11709;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onDatabaseQueryBefore ");
                        sb3.append(interfaceC1616 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1616).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb3, " Failed", e3, 12);
                    }
                }
                return c3554;
            case 28:
                C1574 c1577 = (C1574) obj;
                String[] strArr16 = AbstractC1471.f5234;
                c1577.getClass();
                try {
                    c26413 = c1577.m3447()[0];
                    if (c26413 == null) {
                        c26413 = null;
                    }
                } catch (Throwable th13) {
                    c26413 = new C2641(th13);
                }
                if (c26413 instanceof C2641) {
                    c26413 = null;
                }
                String str8 = (String) c26413;
                String str9 = str8 == null ? "" : str8;
                try {
                    c26414 = c1577.m3447()[1];
                    if (c26414 == null) {
                        c26414 = null;
                    }
                } catch (Throwable th14) {
                    c26414 = new C2641(th14);
                }
                if (c26414 instanceof C2641) {
                    c26414 = null;
                }
                ContentValues contentValues3 = (ContentValues) c26414;
                try {
                    c26415 = c1577.m3447()[2];
                    if (c26415 == null) {
                        c26415 = null;
                    }
                } catch (Throwable th15) {
                    c26415 = new C2641(th15);
                }
                if (c26415 instanceof C2641) {
                    c26415 = null;
                }
                String str10 = (String) c26415;
                String str11 = str10 == null ? "" : str10;
                try {
                    c26416 = c1577.m3447()[3];
                    if (c26416 == null) {
                        c26416 = null;
                    }
                } catch (Throwable th16) {
                    c26416 = new C2641(th16);
                }
                if (c26416 instanceof C2641) {
                    c26416 = null;
                }
                String[] strArr17 = (String[]) c26416;
                try {
                    c26417 = c1577.m3447()[4];
                    if (c26417 == null) {
                        c26417 = null;
                    }
                } catch (Throwable th17) {
                    c26417 = new C2641(th17);
                }
                Integer num2 = (Integer) (c26417 instanceof C2641 ? null : c26417);
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                for (InterfaceC1614 interfaceC1617 : C2860.f9093) {
                    String[] strArr18 = strArr16;
                    try {
                        interfaceC1617.mo1382(c1577, str9, contentValues3, str11, strArr17, iIntValue2);
                    } catch (Exception e4) {
                        ArrayList arrayList4 = C3741.f11709;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onCompatUpdateBefore ");
                        sb4.append(interfaceC1617 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1617).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb4, " Failed", e4, 12);
                    }
                    strArr16 = strArr18;
                }
                return c3554;
            default:
                C1574 c1578 = (C1574) obj;
                String[] strArr19 = AbstractC1471.f5234;
                c1578.getClass();
                try {
                    c26418 = c1578.m3447()[0];
                    if (c26418 == null) {
                        c26418 = null;
                    }
                } catch (Throwable th18) {
                    c26418 = new C2641(th18);
                }
                if (c26418 instanceof C2641) {
                    c26418 = null;
                }
                String str12 = (String) c26418;
                str = str12 != null ? str12 : "";
                try {
                    c26419 = c1578.m3447()[1];
                    if (c26419 == null) {
                        c26419 = null;
                    }
                } catch (Throwable th19) {
                    c26419 = new C2641(th19);
                }
                try {
                    Object obj4 = c1578.m3447()[2];
                    break;
                } catch (Throwable unused3) {
                }
                for (InterfaceC1614 interfaceC1618 : C2860.f9093) {
                    try {
                        interfaceC1618.mo3506(c1578, str);
                    } catch (Exception e5) {
                        ArrayList arrayList5 = C3741.f11709;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("onCompatQueryBefore ");
                        sb5.append(interfaceC1618 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1618).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb5, " Failed", e5, 12);
                    }
                }
                return c3554;
        }
    }
}
