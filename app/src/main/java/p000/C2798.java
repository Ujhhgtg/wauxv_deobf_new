package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤞᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2798 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8928;

    public /* synthetic */ C2798(int i) {
        this.f8928 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        String str;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        Object c25812;
        Object c25813;
        Object c25814;
        Object c25815;
        Object c25816;
        Object c25817;
        Object c25818;
        Object c25819;
        Object c25820;
        Object c25821;
        Object c25822;
        Object c25823;
        Object c25824;
        Intent intent;
        Object c25825;
        Object c25826;
        Object c25827;
        int i = this.f8928;
        int i2 = 2;
        int i3 = 4;
        boolean z = true;
        z = true;
        int i4 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                ((C1020) obj).f3732 = new C2798(z ? 1 : 0);
                return c3497;
            case 1:
                ((C1332) obj).m3050(new C2798(i2));
                return c3497;
            case 2:
                String[] strArr = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ");
                return c3497;
            case 3:
                C1563 c1563 = (C1563) obj;
                String[] strArr2 = AbstractC1574.f5469;
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
                String str2 = (String) c2585;
                str = str2 != null ? str2 : "";
                try {
                    c2586 = c1563.m3267()[1];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                try {
                    c2587 = c1563.m3267()[2];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                ContentValues contentValues = (ContentValues) c2587;
                try {
                    c2588 = c1563.m3267()[3];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                for (InterfaceC1601 interfaceC1601 : C2801.f8932) {
                    try {
                        interfaceC1601.mo3341(str, contentValues);
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        sb.append(MagicFactory.get(-66133906422452L, strArr2));
                        sb.append(interfaceC1601 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1601).mo1128() : MagicFactory.get(-66236985637556L, strArr2));
                        AbstractC1194.m2792(sb, MagicFactory.get(-66275640343220L, strArr2), e, 12);
                    }
                }
                return c3497;
            case 4:
                C1563 c1564 = (C1563) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1564.getClass();
                try {
                    c2589 = c1564.m3267()[0];
                    if (c2589 == null) {
                        c2589 = null;
                    }
                } catch (Throwable th5) {
                    c2589 = new C2585(th5);
                }
                if (c2589 instanceof C2585) {
                    c2589 = null;
                }
                String str3 = (String) c2589;
                String str4 = str3 == null ? "" : str3;
                try {
                    c25810 = c1564.m3267()[1];
                    if (c25810 == null) {
                        c25810 = null;
                    }
                } catch (Throwable th6) {
                    c25810 = new C2585(th6);
                }
                if (c25810 instanceof C2585) {
                    c25810 = null;
                }
                ContentValues contentValues2 = (ContentValues) c25810;
                try {
                    c25811 = c1564.m3267()[2];
                    if (c25811 == null) {
                        c25811 = null;
                    }
                } catch (Throwable th7) {
                    c25811 = new C2585(th7);
                }
                if (c25811 instanceof C2585) {
                    c25811 = null;
                }
                String str5 = (String) c25811;
                str = str5 != null ? str5 : "";
                try {
                    c25812 = c1564.m3267()[3];
                    if (c25812 == null) {
                        c25812 = null;
                    }
                } catch (Throwable th8) {
                    c25812 = new C2585(th8);
                }
                if (c25812 instanceof C2585) {
                    c25812 = null;
                }
                String[] strArr4 = (String[]) c25812;
                try {
                    c25813 = c1564.m3267()[4];
                    if (c25813 == null) {
                        c25813 = null;
                    }
                } catch (Throwable th9) {
                    c25813 = new C2585(th9);
                }
                Integer num = (Integer) (c25813 instanceof C2585 ? null : c25813);
                int iIntValue = num != null ? num.intValue() : 0;
                for (InterfaceC1601 interfaceC1602 : C2801.f8932) {
                    String str6 = str;
                    try {
                        interfaceC1602.mo1233(c1564, str4, contentValues2, str6, strArr4, iIntValue);
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(MagicFactory.get(-66310000081588L, strArr3));
                        sb2.append(interfaceC1602 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1602).mo1128() : MagicFactory.get(-66413079296692L, strArr3));
                        AbstractC1194.m2792(sb2, MagicFactory.get(-66451734002356L, strArr3), e2, 12);
                    }
                    str = str6;
                }
                return c3497;
            case 5:
                C1563 c1565 = (C1563) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1565.getClass();
                try {
                    Object obj2 = c1565.m3267()[0];
                    break;
                } catch (Throwable unused) {
                }
                try {
                    c25814 = c1565.m3267()[1];
                    if (c25814 == null) {
                        c25814 = null;
                    }
                } catch (Throwable th10) {
                    c25814 = new C2585(th10);
                }
                if (c25814 instanceof C2585) {
                    c25814 = null;
                }
                String str7 = (String) c25814;
                str = str7 != null ? str7 : "";
                try {
                    c25815 = c1565.m3267()[2];
                    if (c25815 == null) {
                        c25815 = null;
                    }
                } catch (Throwable th11) {
                    c25815 = new C2585(th11);
                }
                if (c25815 instanceof C2585) {
                    c25815 = null;
                }
                try {
                    c25816 = c1565.m3267()[3];
                    if (c25816 == null) {
                        c25816 = null;
                    }
                } catch (Throwable th12) {
                    c25816 = new C2585(th12);
                }
                try {
                    Object obj3 = c1565.m3267()[4];
                    break;
                } catch (Throwable unused2) {
                }
                for (InterfaceC1601 interfaceC1603 : C2801.f8932) {
                    try {
                        interfaceC1603.mo2031(c1565, str);
                    } catch (Exception e3) {
                        ArrayList arrayList3 = C3678.f11549;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(MagicFactory.get(-66486093740724L, strArr5));
                        sb3.append(interfaceC1603 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1603).mo1128() : MagicFactory.get(-66584877988532L, strArr5));
                        AbstractC1194.m2792(sb3, MagicFactory.get(-66623532694196L, strArr5), e3, 12);
                    }
                }
                return c3497;
            case 6:
                C1563 c1566 = (C1563) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1566.getClass();
                try {
                    c25817 = c1566.m3267()[0];
                    if (c25817 == null) {
                        c25817 = null;
                    }
                } catch (Throwable th13) {
                    c25817 = new C2585(th13);
                }
                if (c25817 instanceof C2585) {
                    c25817 = null;
                }
                String str8 = (String) c25817;
                String str9 = str8 == null ? "" : str8;
                try {
                    c25818 = c1566.m3267()[1];
                    if (c25818 == null) {
                        c25818 = null;
                    }
                } catch (Throwable th14) {
                    c25818 = new C2585(th14);
                }
                if (c25818 instanceof C2585) {
                    c25818 = null;
                }
                ContentValues contentValues3 = (ContentValues) c25818;
                try {
                    c25819 = c1566.m3267()[2];
                    if (c25819 == null) {
                        c25819 = null;
                    }
                } catch (Throwable th15) {
                    c25819 = new C2585(th15);
                }
                if (c25819 instanceof C2585) {
                    c25819 = null;
                }
                String str10 = (String) c25819;
                String str11 = str10 == null ? "" : str10;
                try {
                    c25820 = c1566.m3267()[3];
                    if (c25820 == null) {
                        c25820 = null;
                    }
                } catch (Throwable th16) {
                    c25820 = new C2585(th16);
                }
                if (c25820 instanceof C2585) {
                    c25820 = null;
                }
                String[] strArr7 = (String[]) c25820;
                try {
                    c25821 = c1566.m3267()[4];
                    if (c25821 == null) {
                        c25821 = null;
                    }
                } catch (Throwable th17) {
                    c25821 = new C2585(th17);
                }
                Integer num2 = (Integer) (c25821 instanceof C2585 ? null : c25821);
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                for (InterfaceC1601 interfaceC1604 : C2801.f8932) {
                    try {
                        interfaceC1604.mo1236(c1566, str9, contentValues3, str11, strArr7, iIntValue2);
                    } catch (Exception e4) {
                        ArrayList arrayList4 = C3678.f11549;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(MagicFactory.get(-66657892432564L, strArr6));
                        sb4.append(interfaceC1604 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1604).mo1128() : MagicFactory.get(-66752381713076L, strArr6));
                        AbstractC1194.m2792(sb4, MagicFactory.get(-66791036418740L, strArr6), e4, 12);
                    }
                }
                return c3497;
            case 7:
                C1563 c1567 = (C1563) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1567.getClass();
                try {
                    c25822 = c1567.m3267()[0];
                    if (c25822 == null) {
                        c25822 = null;
                    }
                } catch (Throwable th18) {
                    c25822 = new C2585(th18);
                }
                if (c25822 instanceof C2585) {
                    c25822 = null;
                }
                String str12 = (String) c25822;
                str = str12 != null ? str12 : "";
                try {
                    c25823 = c1567.m3267()[1];
                    if (c25823 == null) {
                        c25823 = null;
                    }
                } catch (Throwable th19) {
                    c25823 = new C2585(th19);
                }
                try {
                    Object obj4 = c1567.m3267()[2];
                    break;
                } catch (Throwable unused3) {
                }
                for (InterfaceC1601 interfaceC1605 : C2801.f8932) {
                    try {
                        interfaceC1605.mo3342(c1567, str);
                    } catch (Exception e5) {
                        ArrayList arrayList5 = C3678.f11549;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(MagicFactory.get(-66825396157108L, strArr8));
                        sb5.append(interfaceC1605 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1605).mo1128() : MagicFactory.get(-66915590470324L, strArr8));
                        AbstractC1194.m2792(sb5, MagicFactory.get(-66954245175988L, strArr8), e5, 12);
                    }
                }
                return c3497;
            case 8:
                String str13 = (String) obj;
                String[] strArr9 = AbstractC1574.f5469;
                if (!AbstractC2207.m4087(str13, MagicFactory.get(-66988604914356L, strArr9)) && !AbstractC2207.m4087(str13, MagicFactory.get(-67048734456500L, strArr9))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                C1563 c1568 = (C1563) obj;
                String[] strArr10 = AbstractC1574.f5469;
                if (c1568.m3267()[0] instanceof Intent) {
                    try {
                        c25824 = c1568.m3267()[0];
                        if (c25824 == null) {
                            c25824 = null;
                        }
                    } catch (Throwable th20) {
                        c25824 = new C2585(th20);
                    }
                    intent = (Intent) (c25824 instanceof C2585 ? null : c25824);
                } else {
                    try {
                        c25825 = c1568.m3267()[1];
                        if (c25825 == null) {
                            c25825 = null;
                        }
                    } catch (Throwable th21) {
                        c25825 = new C2585(th21);
                    }
                    intent = (Intent) (c25825 instanceof C2585 ? null : c25825);
                }
                for (InterfaceC1602 interfaceC1606 : C2809.f8999) {
                    try {
                        interfaceC1606.mo1407(c1568, intent);
                    } catch (Exception e6) {
                        ArrayList arrayList6 = C3678.f11549;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(MagicFactory.get(-67147518704308L, strArr10));
                        sb6.append(interfaceC1606 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1606).mo1128() : MagicFactory.get(-67246302952116L, strArr10));
                        AbstractC1194.m2792(sb6, MagicFactory.get(-67284957657780L, strArr10), e6, 12);
                    }
                }
                return c3497;
            case 10:
                ((C1020) obj).f3732 = new C2798(14);
                return c3497;
            case 11:
                ((C1020) obj).f3732 = new C2798(16);
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1020) obj).f3732 = new C2798(15);
                return c3497;
            case 13:
                ((C1020) obj).f3732 = new C2798(17);
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                C1332 c1332 = (C1332) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1332.m3051(MagicFactory.get(-365733645122228L, strArr11));
                C0705 c0705 = new C0705(i3);
                c0705.m2127(MagicFactory.get(-365591911201460L, strArr11));
                c1332.f4791 = c0705;
                return c3497;
            case 15:
                C1332 c1333 = (C1332) obj;
                String[] strArr12 = AbstractC1574.f5469;
                c1333.m3051(MagicFactory.get(-366313465707188L, strArr12));
                C0705 c0706 = new C0705(i3);
                c0706.m2127(MagicFactory.get(-366167436819124L, strArr12));
                c1333.f4791 = c0706;
                return c3497;
            case 16:
                C1332 c1334 = (C1332) obj;
                String[] strArr13 = AbstractC1574.f5469;
                c1334.m3051(MagicFactory.get(-366068652571316L, strArr13));
                C0705 c0707 = new C0705(i3);
                c0707.m2127(MagicFactory.get(-365832429370036L, strArr13), MagicFactory.get(-365935508585140L, strArr13));
                c1334.f4791 = c0707;
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1332 c1335 = (C1332) obj;
                c1335.m3051("com.tencent.mm.plugin.messenger.foundation");
                C0705 c0708 = new C0705(i3);
                C1317 c1317 = new C1317(i3);
                c1317.m3041(AbstractC1574.m3313(C2820.f9066));
                c1317.m3041(AbstractC1574.m3313(C2822.f9068));
                c1317.m3041(AbstractC1574.m3313(C2821.f9067));
                c0708.f2686 = c1317;
                c1335.f4791 = c0708;
                return c3497;
            case Opcodes.LDC /* 18 */:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 19:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 20:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case Opcodes.ILOAD /* 21 */:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C2798(22);
                c1020.f3733 = new C2798(23);
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1332) obj).m3050(new C2798(25));
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1336);
                Class<Object> cls = Object.class;
                Class<Object> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (clsM2183 == null) {
                    clsM2183 = cls;
                }
                Class<String> clsM4740 = AbstractC2784.m4740(c1981M4739, clsM2183, String.class);
                Class cls2 = clsM4740 != null ? clsM4740 : String.class;
                Class<Object> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1981M4739.m3823(cls2, clsM2184 != null ? clsM2184 : Object.class);
                c1336.f4794 = c1981M4739;
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                C1563 c1569 = (C1563) obj;
                String[] strArr14 = AbstractC1574.f5469;
                c1569.getClass();
                try {
                    c25826 = c1569.m3267()[0];
                    if (c25826 == null) {
                        c25826 = null;
                    }
                } catch (Throwable th22) {
                    c25826 = new C2585(th22);
                }
                String str14 = (String) (c25826 instanceof C2585 ? null : c25826);
                try {
                    Object obj5 = c1569.m3267()[1];
                    break;
                } catch (Throwable unused4) {
                }
                for (InterfaceC1603 interfaceC1607 : C2872.f9210) {
                    try {
                        interfaceC1607.mo2064(c1569, str14);
                    } catch (Exception e7) {
                        ArrayList arrayList7 = C3678.f11549;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(MagicFactory.get(-67422396611252L, strArr14));
                        sb7.append(interfaceC1607 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1607).mo1128() : MagicFactory.get(-67495411055284L, strArr14));
                        AbstractC1194.m2792(sb7, MagicFactory.get(-67534065760948L, strArr14), e7, 12);
                    }
                }
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr15 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-67568425499316L, strArr15), MagicFactory.get(-67667209747124L, strArr15));
                return c3497;
            case 26:
                View view = (View) obj;
                String[] strArr16 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676(view, R.layout.module_dialog_system_browser, null, false);
                int i5 = R.id.moduleDialogBtnSystemBrowserAdd;
                MaterialButton materialButton = (MaterialButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogBtnSystemBrowserAdd);
                if (materialButton != null) {
                    i5 = R.id.moduleDialogEdtSystemBrowserHost;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtSystemBrowserHost);
                    if (textInputEditText != null) {
                        i5 = R.id.moduleDialogInputSystemBrowserHost;
                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputSystemBrowserHost)) != null) {
                            i5 = R.id.moduleDialogRbSystemBrowserBlack;
                            MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbSystemBrowserBlack);
                            if (materialRadioButton != null) {
                                i5 = R.id.moduleDialogRbSystemBrowserWhite;
                                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbSystemBrowserWhite);
                                if (materialRadioButton2 != null) {
                                    i5 = R.id.moduleDialogRgSystemBrowserMode;
                                    RadioGroup radioGroup = (RadioGroup) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRgSystemBrowserMode);
                                    if (radioGroup != null) {
                                        i5 = R.id.moduleDialogRvSystemBrowserList;
                                        RecyclerView recyclerView = (RecyclerView) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRvSystemBrowserList);
                                        if (recyclerView != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewM4676;
                                            final C0243 c0243 = new C0243(linearLayout, materialButton, textInputEditText, materialRadioButton, materialRadioButton2, radioGroup, recyclerView);
                                            C2880 c2880 = C2880.f9228;
                                            int iM2538 = c2880.m2538();
                                            EnumC2876 enumC2876 = EnumC2876.f9220;
                                            if (iM2538 == enumC2876.f9223) {
                                                materialRadioButton2.setChecked(true);
                                            } else if (iM2538 == EnumC2876.f9221.f9223) {
                                                materialRadioButton.setChecked(true);
                                            }
                                            int iM2539 = c2880.m2538();
                                            final ArrayList arrayList8 = iM2539 == enumC2876.f9223 ? new ArrayList(C2881.f9229.m2541()) : iM2539 == EnumC2876.f9221.f9223 ? new ArrayList(C2879.f9227.m2541()) : new ArrayList();
                                            final C0718 c0718 = new C0718();
                                            c0718.f2726 = arrayList8;
                                            c0718.f2727 = new C2825(arrayList8, z ? 1 : 0, c0718);
                                            view.getContext();
                                            recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                            recyclerView.setAdapter(c0718);
                                            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲁᲇᤝᛸ
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup2, int i6) {
                                                    C0243 c0244 = c0243;
                                                    int id = ((MaterialRadioButton) c0244.f1406).getId();
                                                    ArrayList arrayList9 = arrayList8;
                                                    if (i6 == id) {
                                                        arrayList9.clear();
                                                        arrayList9.addAll(new ArrayList(C2881.f9229.m2541()));
                                                    } else if (i6 == ((MaterialRadioButton) c0244.f1405).getId()) {
                                                        arrayList9.clear();
                                                        arrayList9.addAll(new ArrayList(C2879.f9227.m2541()));
                                                    }
                                                    c0718.m4441();
                                                }
                                            });
                                            materialButton.setOnClickListener(new View.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲇᛸᤝᲁ
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view2) {
                                                    TextInputEditText textInputEditText2 = (TextInputEditText) c0243.f1404;
                                                    String strValueOf = String.valueOf(textInputEditText2.getText());
                                                    if (AbstractC2841.m4836(strValueOf)) {
                                                        return;
                                                    }
                                                    arrayList8.add(strValueOf);
                                                    c0718.m4441();
                                                    Editable text = textInputEditText2.getText();
                                                    if (text != null) {
                                                        text.clear();
                                                    }
                                                }
                                            });
                                            C2007 c2007 = new C2007();
                                            C2882.f9230.getClass();
                                            c2007.f6678 = C2882.f9234;
                                            c2007.f6680 = linearLayout;
                                            c2007.m3870(MagicFactory.get(-580408995478196L, strArr16), new C0299(c0243, 6, arrayList8));
                                            AbstractC2784.m4755(c2007, null, 3);
                                            return c3497;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-668829487200948L, strArr16).concat(viewM4676.getResources().getResourceName(i5)));
            case 27:
                C1563 c15610 = (C1563) obj;
                c15610.getClass();
                try {
                    c25827 = c15610.m3267()[0];
                    if (c25827 == null) {
                        c25827 = null;
                    }
                } catch (Throwable th23) {
                    c25827 = new C2585(th23);
                }
                String str15 = (String) (c25827 instanceof C2585 ? null : c25827);
                C2893.f9311 = str15 != null ? str15 : "";
                return c3497;
            case 28:
                ((C1020) obj).f3732 = new C3424(i4);
                return c3497;
            default:
                return Boolean.valueOf(((Class) obj).getName().startsWith("com.tencent.mm.ui.chatting.viewitems"));
        }
    }
}
