package p000;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲈᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1338 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4803;

    public /* synthetic */ C1338(int i) {
        this.f4803 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        C1904 c1904M4123;
        int i = this.f4803;
        int i2 = 24;
        int i3 = 21;
        int i4 = 2;
        int i5 = 4;
        int i6 = 10;
        int i7 = 12;
        int i8 = 3;
        Object obj2 = null;
        int i9 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1333 c1333 = (C1333) obj;
                c1333.m3053("com.tencent.mm.plugin.finder.feed");
                c1333.m3052(new C1338(5));
                return c3497;
            case 1:
                C1333 c1334 = (C1333) obj;
                c1334.m3053("com.tencent.mm.plugin.finder.feed");
                c1334.m3052(new C1338(i5));
                return c3497;
            case 2:
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
                ContextMenu contextMenu = (ContextMenu) (c2585 instanceof C2585 ? null : c2585);
                int i10 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(contextMenu).m3490();
                c1299M3490.f4725 = AbstractC2519.m4527(Context.class);
                AbstractC2207.m4098((Context) ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3024());
                C2873 c2873 = new C2873(new C1286(contextMenu, i8));
                for (Object obj3 : C1342.f4811) {
                    try {
                        for (C1339 c1339 : ((C3611) obj3).m5218()) {
                            C1982 c1982M3830 = ((C1982) c2873.getValue()).m3830();
                            c1982M3830.m3378(contextMenu);
                            c1982M3830.m3831(Integer.valueOf(c1339.f4804), c1339.f4805, Integer.valueOf(c1339.f4806));
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = AbstractC1574.f5469;
                        sb.append("onCreateMenuItems ");
                        sb.append(obj3 instanceof AbstractC2867 ? ((AbstractC2867) obj3).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return c3497;
            case 3:
                C1563 c1564 = (C1563) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                MenuItem menuItem = (MenuItem) (c2586 instanceof C2585 ? null : c2586);
                int i11 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738(c1564);
                c1299M4738.f4725 = MagicFactory.get(-55533927135924L, strArr2);
                C1299 c1299M3491 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M4738.m3014())).m3023()).m3490();
                c1299M3491.f4725 = MagicFactory.get(-55748675500724L, strArr2);
                Object objM3023 = ((C1315) AbstractC2784.m4741(c1299M3491)).m3023();
                C1973 c1973M3492 = AbstractC0968.m2484(objM3023).m3492();
                c1973M3492.f6370 = MagicFactory.get(-55954833930932L, strArr2);
                int iIntValue = ((Number) ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3832(new Object[0])).intValue();
                C1973 c1973M3493 = AbstractC0968.m2484(objM3023).m3492();
                c1973M3493.f6370 = MagicFactory.get(-56010668505780L, strArr2);
                List list = (List) ((C1982) AbstractC0744.m2191(c1973M3493.m3799())).m3832(new Object[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
                for (Object obj4 : list) {
                    int i12 = AbstractC1745.f5844;
                    C1973 c1973M3494 = AbstractC0968.m2484(obj4).m3492();
                    c1973M3494.f6370 = MagicFactory.get(-56066503080628L, strArr2);
                    arrayList2.add((JSONObject) ((C1982) AbstractC2784.m4742(c1973M3494)).m3832(new Object[0]));
                }
                for (Object obj5 : C1342.f4811) {
                    try {
                        for (C1339 c13310 : ((C3611) obj5).m5218()) {
                            if (menuItem.getItemId() == c13310.f4804) {
                                c13310.f4807.mo1196(Integer.valueOf(iIntValue), arrayList2);
                            }
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(MagicFactory.get(-56096567851700L, strArr2));
                        sb2.append(obj5 instanceof AbstractC2867 ? ((AbstractC2867) obj5).mo1128() : MagicFactory.get(-56178172230324L, strArr2));
                        AbstractC1194.m2792(sb2, MagicFactory.get(-56216826935988L, strArr2), e2, 12);
                    }
                }
                return c3497;
            case 4:
                C1981 c1981 = (C1981) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1981.m3826(MagicFactory.get(-56251186674356L, strArr3));
                c1981.m3827(MagicFactory.get(-56315611183796L, strArr3));
                return c3497;
            case 5:
                C1981 c1982 = (C1981) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1982.m3826(MagicFactory.get(-56521769614004L, strArr4));
                c1982.m3827(MagicFactory.get(-56611963927220L, strArr4));
                return c3497;
            case 6:
                String[] strArr5 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_float_action_button, null, false);
                int i13 = R.id.moduleDialogEdtFloatActionButtonFabDarkColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtFloatActionButtonFabDarkColor);
                if (textInputEditText != null) {
                    i13 = R.id.moduleDialogEdtFloatActionButtonFabLightColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtFloatActionButtonFabLightColor);
                    if (textInputEditText2 != null) {
                        i13 = R.id.moduleDialogEdtFloatActionButtonIconDarkColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtFloatActionButtonIconDarkColor);
                        if (textInputEditText3 != null) {
                            i13 = R.id.moduleDialogEdtFloatActionButtonIconLightColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtFloatActionButtonIconLightColor);
                            if (textInputEditText4 != null) {
                                i13 = R.id.moduleDialogInputFloatActionButtonFabDarkColor;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputFloatActionButtonFabDarkColor)) != null) {
                                    i13 = R.id.moduleDialogInputFloatActionButtonFabLightColor;
                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputFloatActionButtonFabLightColor)) != null) {
                                        i13 = R.id.moduleDialogInputFloatActionButtonIconDarkColor;
                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputFloatActionButtonIconDarkColor)) != null) {
                                            i13 = R.id.moduleDialogInputFloatActionButtonIconLightColor;
                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputFloatActionButtonIconLightColor)) != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                C2020 c2020 = new C2020(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4);
                                                textInputEditText2.setText(C1359.f4859.m2542());
                                                textInputEditText4.setText(C1361.f4861.m2542());
                                                textInputEditText.setText(C1358.f4858.m2542());
                                                textInputEditText3.setText(C1360.f4860.m2542());
                                                C2007 c2007 = new C2007();
                                                C1362.f4862.getClass();
                                                c2007.f6678 = C1362.f4867;
                                                c2007.f6680 = linearLayout;
                                                c2007.m3870(MagicFactory.get(-615971324689076L, strArr5), new C0106(i3, c2020));
                                                c2007.m3869(MagicFactory.get(-615984209590964L, strArr5), new C1354(i9));
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
                throw new NullPointerException(MagicFactory.get(-665256074410676L, strArr5).concat(viewM4676.getResources().getResourceName(i13)));
            case 7:
                ((C1020) obj).f3733 = new C1338(9);
                return c3497;
            case 8:
                ((C1020) obj).f3733 = new C1338(i6);
                return c3497;
            case 9:
                ((C1333) obj).m3052(new C1338(11));
                return c3497;
            case 10:
                C1333 c1335 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1335);
                C1394.f5015.getClass();
                c1981M4739.m3820(AbstractC1574.m3315(C1392.f5013).getDeclaringClass());
                String[] strArr6 = AbstractC1574.f5469;
                c1981M4739.m3827(MagicFactory.get(-361812339980980L, strArr6), MagicFactory.get(-361932599065268L, strArr6));
                c1335.f4794 = c1981M4739;
                return c3497;
            case 11:
                String[] strArr7 = AbstractC1574.f5469;
                ((C1981) obj).m3827(MagicFactory.get(-361550346975924L, strArr7), MagicFactory.get(-361670606060212L, strArr7));
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                String[] strArr8 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_format_msg_time, null, false);
                int i14 = R.id.moduleDialogEdtFormatMsgTimeTimeFormat;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtFormatMsgTimeTimeFormat);
                if (textInputEditText5 != null) {
                    i14 = R.id.moduleDialogInputFormatMsgTimeTimeFormat;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputFormatMsgTimeTimeFormat)) != null) {
                        i14 = R.id.moduleDialogRbFormatMsgTimeModeDefault;
                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC3681.m5325(viewM4677, R.id.moduleDialogRbFormatMsgTimeModeDefault);
                        if (materialRadioButton != null) {
                            i14 = R.id.moduleDialogRbFormatMsgTimeModeGone;
                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC3681.m5325(viewM4677, R.id.moduleDialogRbFormatMsgTimeModeGone);
                            if (materialRadioButton2 != null) {
                                i14 = R.id.moduleDialogRbFormatMsgTimeModeVisible;
                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC3681.m5325(viewM4677, R.id.moduleDialogRbFormatMsgTimeModeVisible);
                                if (materialRadioButton3 != null) {
                                    i14 = R.id.moduleDialogRgFormatMsgTimeMode;
                                    if (((RadioGroup) AbstractC3681.m5325(viewM4677, R.id.moduleDialogRgFormatMsgTimeMode)) != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) viewM4677;
                                        C2103 c2103 = new C2103(linearLayout2, (TextView) textInputEditText5, materialRadioButton, materialRadioButton2, (View) materialRadioButton3);
                                        int iM2538 = C1399.f5055.m2538();
                                        if (iM2538 == EnumC1398.f5050.f5054) {
                                            materialRadioButton2.setChecked(true);
                                        } else if (iM2538 == EnumC1398.f5051.f5054) {
                                            materialRadioButton.setChecked(true);
                                        } else if (iM2538 == EnumC1398.f5052.f5054) {
                                            materialRadioButton3.setChecked(true);
                                        }
                                        textInputEditText5.setText(C1400.f5056.m2542());
                                        C2007 c2008 = new C2007();
                                        C1401.f5057.getClass();
                                        c2008.f6678 = C1401.f5059;
                                        c2008.f6680 = linearLayout2;
                                        c2008.m3870(MagicFactory.get(-528263797537460L, strArr8), new C0106(22, c2103));
                                        c2008.m3869(MagicFactory.get(-528276682439348L, strArr8), new C1354(1));
                                        C2007.m3866(c2008, null, 3);
                                        c2008.m3868().m3791();
                                        return c3497;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-665393513364148L, strArr8).concat(viewM4677.getResources().getResourceName(i14)));
            case 13:
                return AbstractC2784.m4749("'", (String) obj, '\'');
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC2784.m4749("'", (String) obj, '\'');
            case 15:
                String[] strArr9 = AbstractC1574.f5469;
                View viewM4678 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_group_owner_title, null, false);
                int i15 = R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor1;
                TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor1);
                if (textInputEditText6 != null) {
                    i15 = R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor2;
                    TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor2);
                    if (textInputEditText7 != null) {
                        i15 = R.id.moduleDialogEdtGroupOwnerTitleAdminTextColor;
                        TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleAdminTextColor);
                        if (textInputEditText8 != null) {
                            i15 = R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor1;
                            TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor1);
                            if (textInputEditText9 != null) {
                                i15 = R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor2;
                                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor2);
                                if (textInputEditText10 != null) {
                                    i15 = R.id.moduleDialogEdtGroupOwnerTitleCustomTextColor;
                                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleCustomTextColor);
                                    if (textInputEditText11 != null) {
                                        i15 = R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor1;
                                        TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor1);
                                        if (textInputEditText12 != null) {
                                            i15 = R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor2;
                                            TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor2);
                                            if (textInputEditText13 != null) {
                                                i15 = R.id.moduleDialogEdtGroupOwnerTitleNormalTextColor;
                                                TextInputEditText textInputEditText14 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleNormalTextColor);
                                                if (textInputEditText14 != null) {
                                                    TextInputEditText textInputEditText15 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor1);
                                                    if (textInputEditText15 != null) {
                                                        TextInputEditText textInputEditText16 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor2);
                                                        if (textInputEditText16 != null) {
                                                            TextInputEditText textInputEditText17 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtGroupOwnerTitleOwnerTextColor);
                                                            if (textInputEditText17 != null) {
                                                                int i16 = R.id.moduleDialogInputGroupOwnerTitleAdminBgColor1;
                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleAdminBgColor1)) != null) {
                                                                    i16 = R.id.moduleDialogInputGroupOwnerTitleAdminBgColor2;
                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleAdminBgColor2)) != null) {
                                                                        i16 = R.id.moduleDialogInputGroupOwnerTitleCustomBgColor1;
                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleCustomBgColor1)) != null) {
                                                                            i16 = R.id.moduleDialogInputGroupOwnerTitleCustomBgColor2;
                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleCustomBgColor2)) != null) {
                                                                                i16 = R.id.moduleDialogInputGroupOwnerTitleCustomTextColor;
                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleCustomTextColor)) != null) {
                                                                                    i16 = R.id.moduleDialogInputGroupOwnerTitleNormalBgColor1;
                                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleNormalBgColor1)) != null) {
                                                                                        i16 = R.id.moduleDialogInputGroupOwnerTitleNormalBgColor2;
                                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleNormalBgColor2)) != null) {
                                                                                            i16 = R.id.moduleDialogInputGroupOwnerTitleNormalTextColor;
                                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleNormalTextColor)) != null) {
                                                                                                i16 = R.id.moduleDialogInputGroupOwnerTitleOwnerAdminTextColor;
                                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleOwnerAdminTextColor)) != null) {
                                                                                                    i16 = R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor1;
                                                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor1)) != null) {
                                                                                                        i16 = R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor2;
                                                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor2)) != null) {
                                                                                                            i16 = R.id.moduleDialogInputGroupOwnerTitleOwnerTextColor;
                                                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputGroupOwnerTitleOwnerTextColor)) != null) {
                                                                                                                C2021 c2021 = new C2021();
                                                                                                                c2021.f6762 = textInputEditText6;
                                                                                                                c2021.f6763 = textInputEditText7;
                                                                                                                c2021.f6764 = textInputEditText8;
                                                                                                                c2021.f6765 = textInputEditText9;
                                                                                                                c2021.f6766 = textInputEditText10;
                                                                                                                c2021.f6767 = textInputEditText11;
                                                                                                                c2021.f6768 = textInputEditText12;
                                                                                                                c2021.f6769 = textInputEditText13;
                                                                                                                c2021.f6770 = textInputEditText14;
                                                                                                                c2021.f6771 = textInputEditText15;
                                                                                                                c2021.f6772 = textInputEditText16;
                                                                                                                c2021.f6773 = textInputEditText17;
                                                                                                                textInputEditText15.setText(C1497.f5292.m2542());
                                                                                                                textInputEditText16.setText(C1498.f5293.m2542());
                                                                                                                textInputEditText17.setText(C1499.f5294.m2542());
                                                                                                                textInputEditText6.setText(C1488.f5283.m2542());
                                                                                                                textInputEditText7.setText(C1489.f5284.m2542());
                                                                                                                textInputEditText8.setText(C1490.f5285.m2542());
                                                                                                                textInputEditText9.setText(C1491.f5286.m2542());
                                                                                                                textInputEditText10.setText(C1492.f5287.m2542());
                                                                                                                textInputEditText11.setText(C1493.f5288.m2542());
                                                                                                                textInputEditText12.setText(C1494.f5289.m2542());
                                                                                                                textInputEditText13.setText(C1495.f5290.m2542());
                                                                                                                textInputEditText14.setText(C1496.f5291.m2542());
                                                                                                                C2007 c2009 = new C2007();
                                                                                                                C1500.f5295.getClass();
                                                                                                                c2009.f6678 = C1500.f5297;
                                                                                                                c2009.f6680 = (LinearLayout) viewM4678;
                                                                                                                c2009.m3870(MagicFactory.get(-548003467229876L, strArr9), new C0106(23, c2021));
                                                                                                                c2009.m3869(MagicFactory.get(-548016352131764L, strArr9), new C1354(8));
                                                                                                                String str = MagicFactory.get(-548037826968244L, strArr9);
                                                                                                                C1354 c1354 = new C1354(9);
                                                                                                                c2009.f6684 = str;
                                                                                                                c2009.f6685 = c1354;
                                                                                                                c2009.f6686 = true;
                                                                                                                c2009.m3868().m3791();
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
                                                                i15 = i16;
                                                            } else {
                                                                i15 = R.id.moduleDialogEdtGroupOwnerTitleOwnerTextColor;
                                                            }
                                                        } else {
                                                            i15 = R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor2;
                                                        }
                                                    } else {
                                                        i15 = R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor1;
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
                throw new NullPointerException(MagicFactory.get(-665530952317620L, strArr9).concat(viewM4678.getResources().getResourceName(i15)));
            case 16:
                String[] strArr10 = AbstractC1574.f5469;
                View viewM4679 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_handle_group_member, null, false);
                int i17 = R.id.moduleDialogEdtHandleGroupMemberTipColor;
                TextInputEditText textInputEditText18 = (TextInputEditText) AbstractC3681.m5325(viewM4679, R.id.moduleDialogEdtHandleGroupMemberTipColor);
                if (textInputEditText18 != null) {
                    i17 = R.id.moduleDialogEdtHandleGroupMemberTipLeft;
                    TextInputEditText textInputEditText19 = (TextInputEditText) AbstractC3681.m5325(viewM4679, R.id.moduleDialogEdtHandleGroupMemberTipLeft);
                    if (textInputEditText19 != null) {
                        i17 = R.id.moduleDialogInputHandleGroupMemberTipColor;
                        if (((TextInputLayout) AbstractC3681.m5325(viewM4679, R.id.moduleDialogInputHandleGroupMemberTipColor)) != null) {
                            i17 = R.id.moduleDialogInputHandleGroupMemberTipLeft;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4679, R.id.moduleDialogInputHandleGroupMemberTipLeft)) != null) {
                                LinearLayout linearLayout3 = (LinearLayout) viewM4679;
                                C2018 c2018 = new C2018(linearLayout3, textInputEditText18, textInputEditText19);
                                textInputEditText18.setText(C1511.f5332.m2542());
                                textInputEditText19.setText(C1512.f5333.m2542());
                                C2007 c20010 = new C2007();
                                C1513.f5334.getClass();
                                c20010.f6678 = C1513.f5336;
                                c20010.f6680 = linearLayout3;
                                c20010.m3870(MagicFactory.get(-550889685252788L, strArr10), new C0106(i2, c2018));
                                c20010.m3869(MagicFactory.get(-550902570154676L, strArr10), new C1354(i6));
                                C2007.m3866(c20010, null, 3);
                                c20010.m3868().m3791();
                                return c3497;
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-665668391271092L, strArr10).concat(viewM4679.getResources().getResourceName(i17)));
            case Opcodes.SIPUSH /* 17 */:
                ((C1020) obj).f3733 = new C1338(19);
                return c3497;
            case Opcodes.LDC /* 18 */:
                C1563 c1565 = (C1563) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1565.getClass();
                try {
                    c2587 = c1565.m3267()[0];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                View view = (View) c2587;
                try {
                    c2588 = c1565.m3267()[1];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                if (c2588 instanceof C2585) {
                    c2588 = null;
                }
                int i18 = AbstractC1745.f5844;
                C1299 c1299M3492 = AbstractC0968.m2484(c2588).m3490();
                c1299M3492.f4725 = AbstractC2519.m4527(String.class);
                boolean z = false;
                for (Object obj6 : c1299M3492.m3014()) {
                    String str2 = (String) ((C1315) obj6).m3024();
                    if (str2 != null && str2.startsWith(MagicFactory.get(-550915455056564L, strArr11))) {
                        if (z) {
                            throw new IllegalArgumentException(MagicFactory.get(-550958404729524L, strArr11));
                        }
                        obj2 = obj6;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException(MagicFactory.get(-551181743028916L, strArr11));
                }
                String str3 = (String) ((C1315) obj2).m3024();
                if (str3.startsWith(MagicFactory.get(-551417966230196L, strArr11)) && (c1904M4123 = AbstractC2209.m4123(Pattern.compile(MagicFactory.get(-551624124660404L, strArr11)).matcher(str3), 0, str3)) != null) {
                    String str4 = (String) ((C1903) c1904M4123.m3699()).get(2);
                    Context context = view.getContext();
                    Intent intent = new Intent();
                    intent.setClassName(context, MagicFactory.get(-100867306945204L, strArr11));
                    intent.putExtra(MagicFactory.get(-101069170408116L, strArr11), str4);
                    context.startActivity(intent);
                    c1565.m3271();
                }
                return c3497;
            case 19:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1336);
                String[] strArr12 = AbstractC1574.f5469;
                c1981M47310.m3825(MagicFactory.get(-551692844137140L, strArr12));
                c1981M47310.m3827(MagicFactory.get(-551989196880564L, strArr12), MagicFactory.get(-552105160997556L, strArr12));
                c1336.f4794 = c1981M47310;
                return c3497;
            case 20:
                C0707 c0707M4527 = AbstractC2519.m4527(ContextMenu.class);
                ConcurrentHashMap concurrentHashMap = AbstractC0710.f2698;
                return Boolean.valueOf(c0707M4527.mo2114().isAssignableFrom((Class) obj));
            case Opcodes.ILOAD /* 21 */:
                String[] strArr13 = AbstractC1574.f5469;
                ((C1981) obj).m3827(MagicFactory.get(-528908042631860L, strArr13), MagicFactory.get(-528998236945076L, strArr13));
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr14 = AbstractC1574.f5469;
                View viewM46710 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_hide_chat_item_menu, null, false);
                int i19 = R.id.moduleDialogEdtHideChatItemMenuSet;
                TextInputEditText textInputEditText20 = (TextInputEditText) AbstractC3681.m5325(viewM46710, R.id.moduleDialogEdtHideChatItemMenuSet);
                if (textInputEditText20 != null) {
                    i19 = R.id.moduleDialogInputHideChatItemMenuSet;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM46710, R.id.moduleDialogInputHideChatItemMenuSet)) != null) {
                        LinearLayout linearLayout4 = (LinearLayout) viewM46710;
                        C2012 c2012 = new C2012(linearLayout4, textInputEditText20);
                        textInputEditText20.setText(AbstractC0744.m2196(C1536.f5377.m2541(), MagicFactory.get(-528873682893492L, strArr14), null, null, null, 62));
                        C2007 c20011 = new C2007();
                        C1537.f5378.getClass();
                        c20011.f6678 = C1537.f5381;
                        c20011.f6680 = linearLayout4;
                        c20011.m3870(MagicFactory.get(-528882272828084L, strArr14), new C0106(25, c2012));
                        c20011.m3869(MagicFactory.get(-528895157729972L, strArr14), new C1354(i7));
                        c20011.m3868().m3791();
                        return c3497;
                    }
                }
                throw new NullPointerException(MagicFactory.get(-665805830224564L, strArr14).concat(viewM46710.getResources().getResourceName(i19)));
            case Opcodes.FLOAD /* 23 */:
                ((C1020) obj).f3733 = new C1338(i2);
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                ((C1333) obj).m3052(new C1338(i3));
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                int i20 = AbstractC1745.f5844;
                C1299 c1299M4739 = AbstractC2784.m4738((C1563) obj);
                c1299M4739.f4726 = new C1338(20);
                C1299 c1299M3493 = AbstractC0968.m2484((ContextMenu) ((C1315) AbstractC0744.m2191(c1299M4739.m3014())).m3024()).m3490();
                c1299M3493.f4725 = AbstractC2519.m4527(List.class);
                ArrayList arrayList4 = (ArrayList) ((C1315) AbstractC0744.m2191(c1299M3493.m3014())).m3024();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : arrayList4) {
                    if (AbstractC0744.m2190(C1536.f5377.m2541(), ((MenuItem) obj7).getTitle())) {
                        arrayList5.add(obj7);
                    }
                }
                arrayList4.removeAll(AbstractC0744.m2209(arrayList5));
                return c3497;
            case 26:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C1338(29);
                c1020.f3733 = new C1538(i9);
                return c3497;
            case 27:
                C1981 c1983 = (C1981) obj;
                Class<View> cls = View.class;
                Class<View> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (clsM2183 == null) {
                    clsM2183 = cls;
                }
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1983, clsM2183, Integer.class);
                Class cls2 = clsM4740 != null ? clsM4740 : Integer.class;
                Class<View> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                cls = clsM2184 != null ? clsM2184 : View.class;
                Class<ViewGroup> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(ViewGroup.class));
                c1983.m3823(cls2, cls, clsM2185 != null ? clsM2185 : ViewGroup.class);
                return c3497;
            case 28:
                C1020 c1021 = (C1020) obj;
                c1021.f3732 = new C1538(i4);
                c1021.f3733 = new C1538(i8);
                return c3497;
            default:
                C1332 c1332 = (C1332) obj;
                String[] strArr15 = AbstractC1574.f5469;
                c1332.m3051(MagicFactory.get(-530213712689844L, strArr15));
                C0705 c0705 = new C0705(4);
                c0705.m2127(MagicFactory.get(-529732676352692L, strArr15), MagicFactory.get(-529895885109940L, strArr15));
                c1332.f4791 = c0705;
                return c3497;
        }
    }
}
