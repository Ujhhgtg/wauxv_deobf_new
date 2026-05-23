package p000;

import android.content.Intent;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲈᛸᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2058 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6853;

    public /* synthetic */ C2058(int i) {
        this.f6853 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        Object c2585;
        Object c2586;
        Object c2587;
        int i = this.f6853;
        int i2 = 29;
        int i3 = 2;
        int i4 = 3;
        int i5 = 4;
        int i6 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.storage");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
                c1332.f4791 = c0705;
                return c3497;
            case 1:
                C1563 c1563 = (C1563) obj;
                for (InterfaceC1592 interfaceC1592 : C2061.f6857) {
                    try {
                        interfaceC1592.mo2062(c1563.m3268());
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr2 = AbstractC1574.f5469;
                        sb.append("onConvert ");
                        sb.append(interfaceC1592 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1592).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return c3497;
            case 2:
                String[] strArr3 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_msg_info, null, false);
                int i7 = R.id.moduleDialogCbMsgInfoTextClickInfo;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbMsgInfoTextClickInfo);
                if (materialCheckBox != null) {
                    i7 = R.id.moduleDialogCbMsgInfoTextContentStyle;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbMsgInfoTextContentStyle);
                    if (materialCheckBox2 != null) {
                        i7 = R.id.moduleDialogEdtMsgInfoDarkBgColor;
                        TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoDarkBgColor);
                        if (textInputEditText != null) {
                            i7 = R.id.moduleDialogEdtMsgInfoDarkTextColor;
                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoDarkTextColor);
                            if (textInputEditText2 != null) {
                                i7 = R.id.moduleDialogEdtMsgInfoFont;
                                TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoFont);
                                if (textInputEditText3 != null) {
                                    i7 = R.id.moduleDialogEdtMsgInfoLeftMargin;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoLeftMargin);
                                    if (textInputEditText4 != null) {
                                        i7 = R.id.moduleDialogEdtMsgInfoLightBgColor;
                                        TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoLightBgColor);
                                        if (textInputEditText5 != null) {
                                            TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoLightTextColor);
                                            if (textInputEditText6 != null) {
                                                TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoRightMargin);
                                                if (textInputEditText7 != null) {
                                                    TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoTextFormat);
                                                    if (textInputEditText8 != null) {
                                                        MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoTextPlaceholders);
                                                        if (materialTextView != null) {
                                                            TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtMsgInfoTimeFormat);
                                                            if (textInputEditText9 != null) {
                                                                int i8 = R.id.moduleDialogInputMsgInfoDarkBgColor;
                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoDarkBgColor)) != null) {
                                                                    i8 = R.id.moduleDialogInputMsgInfoDarkTextColor;
                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoDarkTextColor)) != null) {
                                                                        i8 = R.id.moduleDialogInputMsgInfoFont;
                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoFont)) != null) {
                                                                            i8 = R.id.moduleDialogInputMsgInfoLeftMargin;
                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoLeftMargin)) != null) {
                                                                                i8 = R.id.moduleDialogInputMsgInfoLightBgColor;
                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoLightBgColor)) != null) {
                                                                                    i8 = R.id.moduleDialogInputMsgInfoLightTextColor;
                                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoLightTextColor)) != null) {
                                                                                        i8 = R.id.moduleDialogInputMsgInfoRightMargin;
                                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoRightMargin)) != null) {
                                                                                            i8 = R.id.moduleDialogInputMsgInfoTextFormat;
                                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoTextFormat)) != null) {
                                                                                                i8 = R.id.moduleDialogInputMsgInfoTimeFormat;
                                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputMsgInfoTimeFormat)) != null) {
                                                                                                    C2021 c2021 = new C2021();
                                                                                                    c2021.f6771 = (LinearLayout) viewM4676;
                                                                                                    c2021.f6772 = materialCheckBox;
                                                                                                    c2021.f6773 = materialCheckBox2;
                                                                                                    c2021.f6762 = textInputEditText;
                                                                                                    c2021.f6763 = textInputEditText2;
                                                                                                    c2021.f6764 = textInputEditText3;
                                                                                                    c2021.f6765 = textInputEditText4;
                                                                                                    c2021.f6766 = textInputEditText5;
                                                                                                    c2021.f6767 = textInputEditText6;
                                                                                                    c2021.f6768 = textInputEditText7;
                                                                                                    c2021.f6769 = textInputEditText8;
                                                                                                    c2021.f6770 = textInputEditText9;
                                                                                                    textInputEditText5.setText(C2066.f6862.m2542());
                                                                                                    textInputEditText6.setText(C2067.f6863.m2542());
                                                                                                    textInputEditText.setText(C2062.f6858.m2542());
                                                                                                    textInputEditText2.setText(C2063.f6859.m2542());
                                                                                                    textInputEditText8.setText(C2071.f6867.m2542());
                                                                                                    textInputEditText9.setText(C2072.f6868.m2542());
                                                                                                    textInputEditText4.setText(String.valueOf(C2065.f6861.m2538()));
                                                                                                    textInputEditText7.setText(String.valueOf(C2068.f6864.m2538()));
                                                                                                    textInputEditText3.setText(String.valueOf(C2064.f6860.m2538()));
                                                                                                    materialCheckBox.setChecked(C2069.f6865.m2536());
                                                                                                    materialCheckBox2.setChecked(C2070.f6866.m2536());
                                                                                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                                                                                    for (String str : C2073.f6870) {
                                                                                                        int length = spannableStringBuilder.length();
                                                                                                        spannableStringBuilder.append((CharSequence) (str + ' '));
                                                                                                        spannableStringBuilder.setSpan(new C0634(2, str, c2021), length, spannableStringBuilder.length() + (-1), 33);
                                                                                                    }
                                                                                                    materialTextView.setText(spannableStringBuilder);
                                                                                                    C2007 c2007 = new C2007();
                                                                                                    C2073.f6869.getClass();
                                                                                                    c2007.f6678 = C2073.f6872;
                                                                                                    c2007.f6680 = (LinearLayout) c2021.f6771;
                                                                                                    c2007.m3870("保存", new C2042(2, c2021));
                                                                                                    c2007.m3869("重置", new C1354(29));
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
                                                                i7 = i8;
                                                            } else {
                                                                i7 = R.id.moduleDialogEdtMsgInfoTimeFormat;
                                                            }
                                                        } else {
                                                            i7 = R.id.moduleDialogEdtMsgInfoTextPlaceholders;
                                                        }
                                                    } else {
                                                        i7 = R.id.moduleDialogEdtMsgInfoTextFormat;
                                                    }
                                                } else {
                                                    i7 = R.id.moduleDialogEdtMsgInfoRightMargin;
                                                }
                                            } else {
                                                i7 = R.id.moduleDialogEdtMsgInfoLightTextColor;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i7)));
            case 3:
                ((C1020) obj).f3733 = new C2058(i5);
                return c3497;
            case 4:
                C1333 c1333 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.storage");
                C1981 c1981 = new C1981(4);
                c1981.m3827("MicroMsg.MsgInfoStorage", "protect:c2c msg should not here");
                c1333.f4794 = c1981;
                return c3497;
            case 5:
                C1563 c1564 = (C1563) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1564.getClass();
                try {
                    c2585 = c1564.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(c2585 instanceof C2585 ? null : c2585);
                for (InterfaceC1593 interfaceC1593 : C2075.f6877) {
                    try {
                        interfaceC1593.mo2039(msgInfoBean);
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onInsert ");
                        sb2.append(interfaceC1593 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1593).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb2, " Failed", e2, 12);
                    }
                }
                return c3497;
            case 6:
                ((C1020) obj).f3732 = new C2058(10);
                return c3497;
            case 7:
                ((C1020) obj).f3733 = new C2058(11);
                return c3497;
            case 8:
                ((C1020) obj).f3733 = new C2058(9);
                return c3497;
            case 9:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1334);
                C2079.f6881.getClass();
                c1981M4739.m3820(AbstractC1574.m3313(C2076.f6878));
                c1981M4739.m3827("MsgInfo processAddMsg insert db error");
                c1334.f4794 = c1981M4739;
                return c3497;
            case 10:
                C1332 c1335 = (C1332) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1335.m3051("com.tencent.mm.storage");
                C0705 c0706 = new C0705(4);
                c0706.m2127("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d");
                c1335.f4791 = c0706;
                return c3497;
            case 11:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1336);
                C2079.f6881.getClass();
                c1981M47310.m3820(AbstractC1574.m3313(C2076.f6878));
                c1981M47310.m3822(new C1664(2, 3, 1));
                String[] strArr7 = AbstractC1574.f5469;
                c1981M47310.m3827("notifymessage", "msgId=?", "update");
                c1336.f4794 = c1981M47310;
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ArrayList arrayList3 = new ArrayList();
                String[] strArr8 = AbstractC1574.f5469;
                Cursor cursorM2715 = C1133.m2715("SELECT username FROM rconversation");
                if (cursorM2715 != null) {
                    while (cursorM2715.moveToNext()) {
                        try {
                            arrayList3.add(cursorM2715.getString(0));
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC1458.m3154(cursorM2715, th2);
                                throw th3;
                            }
                        }
                    }
                    cursorM2715.close();
                }
                C0860 c0860 = C0860.f3275;
                String[] strArr9 = (String[]) arrayList3.toArray(new String[0]);
                String str2 = "";
                c0860.getClass();
                C0860.m2383(str2, strArr9);
                return c3497;
            case 13:
                ArrayList arrayList4 = new ArrayList();
                String[] strArr10 = AbstractC1574.f5469;
                Cursor cursorM2716 = C1133.m2715("SELECT username FROM rconversation");
                if (cursorM2716 != null) {
                    while (cursorM2716.moveToNext()) {
                        try {
                            arrayList4.add(cursorM2716.getString(0));
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                AbstractC1458.m3154(cursorM2716, th4);
                                throw th5;
                            }
                        }
                    }
                    cursorM2716.close();
                }
                C0860 c0861 = C0860.f3275;
                String[] strArr11 = (String[]) arrayList4.toArray(new String[0]);
                String str3 = "hidden_conv_parent";
                c0861.getClass();
                C0860.m2383(str3, strArr11);
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                C1332 c1337 = (C1332) obj;
                String[] strArr12 = AbstractC1574.f5469;
                c1337.m3051("com.tencent.mm.ui.chatting.viewitems");
                C0705 c0707 = new C0705(4);
                c0707.m2127("wx91d27dbf599dff74");
                c1337.f4791 = c0707;
                return c3497;
            case 15:
                C1332 c1338 = (C1332) obj;
                String[] strArr13 = AbstractC1574.f5469;
                c1338.m3051("com.tencent.mm.ui.chatting.viewitems");
                C0705 c0708 = new C0705(4);
                c0708.m2127("MicroMsg.ChattingItemVoice", "[voice interrupt] set continue play visible ");
                c1338.f4791 = c0708;
                return c3497;
            case 16:
                C1332 c1339 = (C1332) obj;
                String[] strArr14 = AbstractC1574.f5469;
                c1339.m3051("com.tencent.mm.ui.chatting.viewitems");
                C0705 c0709 = new C0705(4);
                c0709.m2127("voip_content_voice", "voip_content_video");
                c1339.f4791 = c0709;
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr15 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_msg_tv_color, null, false);
                int i9 = R.id.moduleDialogEdtMsgTvColorLeftDarkTextColor;
                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgTvColorLeftDarkTextColor);
                if (textInputEditText10 != null) {
                    i9 = R.id.moduleDialogEdtMsgTvColorLeftLightTextColor;
                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgTvColorLeftLightTextColor);
                    if (textInputEditText11 != null) {
                        i9 = R.id.moduleDialogEdtMsgTvColorRightDarkTextColor;
                        TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgTvColorRightDarkTextColor);
                        if (textInputEditText12 != null) {
                            i9 = R.id.moduleDialogEdtMsgTvColorRightLightTextColor;
                            TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgTvColorRightLightTextColor);
                            if (textInputEditText13 != null) {
                                i9 = R.id.moduleDialogInputMsgTvColorLeftDarkTextColor;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgTvColorLeftDarkTextColor)) != null) {
                                    i9 = R.id.moduleDialogInputMsgTvColorLeftLightTextColor;
                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgTvColorLeftLightTextColor)) != null) {
                                        i9 = R.id.moduleDialogInputMsgTvColorRightDarkTextColor;
                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgTvColorRightDarkTextColor)) != null) {
                                            i9 = R.id.moduleDialogInputMsgTvColorRightLightTextColor;
                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputMsgTvColorRightLightTextColor)) != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewM4677;
                                                C2020 c2020 = new C2020(linearLayout, textInputEditText10, textInputEditText11, textInputEditText12, textInputEditText13);
                                                textInputEditText11.setText(C2093.f6904.m2542());
                                                textInputEditText13.setText(C2095.f6906.m2542());
                                                textInputEditText10.setText(C2092.f6903.m2542());
                                                textInputEditText12.setText(C2094.f6905.m2542());
                                                C2007 c2008 = new C2007();
                                                C2096.f6907.getClass();
                                                c2008.f6678 = C2096.f6909;
                                                c2008.f6680 = linearLayout;
                                                c2008.m3870("保存", new C2042(i4, c2020));
                                                c2008.m3869("重置", new C2083(i3));
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i9)));
            case Opcodes.LDC /* 18 */:
                ((C1020) obj).f3733 = new C2058(19);
                return c3497;
            case 19:
                ((C1333) obj).m3052(new C2058(21));
                return c3497;
            case 20:
                C1563 c1565 = (C1563) obj;
                c1565.getClass();
                try {
                    c2586 = c1565.m3267()[2];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th6) {
                    c2586 = new C2585(th6);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                String str4 = (String) c2586;
                if (str4 == null) {
                    str4 = "";
                }
                if (str4.equals(".ui.timeline.preload.ui.TmplWebViewMMUI")) {
                    try {
                        c2587 = c1565.m3267()[3];
                        if (c2587 == null) {
                            c2587 = null;
                        }
                    } catch (Throwable th7) {
                        c2587 = new C2585(th7);
                    }
                    Intent intent = (Intent) (c2587 instanceof C2585 ? null : c2587);
                    intent.addFlags(524288);
                    intent.addFlags(134217728);
                }
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr16 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                int i10 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(obj).m3490();
                String[] strArr17 = AbstractC1574.f5469;
                c1299M3490.f6370 = "field_type";
                if (((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).intValue() == 3) {
                    C1299 c1299M3491 = AbstractC0968.m2484(obj).m3490();
                    c1299M3491.f6370 = "field_favProto";
                    C1973 c1973M3492 = AbstractC0968.m2484(((C1315) AbstractC2784.m4741(c1299M3491)).m3023()).m3492();
                    c1973M3492.f6370 = "getData";
                    byte[] bArr = (byte[]) ((C1982) AbstractC2784.m4742(c1973M3492)).m3832(new Object[0]);
                    C2427 c2427 = C2427.f7718;
                    c2427.getClass();
                    C1283 c1283 = ((C1284) c2427.m4387(C1284.Companion.serializer(), bArr)).f4695;
                    String string = c1283.f4693;
                    String str5 = c1283.f4692;
                    if (string == null) {
                        String strM4005 = AbstractC2202.m4005();
                        String strValueOf = String.valueOf(str5.hashCode() & 255);
                        StringBuilder sbM4753 = AbstractC2784.m4753(strM4005);
                        sbM4753.append("/favorite/");
                        sbM4753.append(strValueOf);
                        sbM4753.append('/');
                        sbM4753.append(str5);
                        sbM4753.append('.');
                        sbM4753.append(c1283.f4689);
                        string = sbM4753.toString();
                    }
                    if (new File(string).exists()) {
                        AbstractC1458.m3166(C2112.f6958, new C2110(string, c1283, i6));
                    } else {
                        AbstractC2834.m4823(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                } else {
                    AbstractC2834.m4823(null, 3, "暂不支持的转发类型");
                }
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                int i11 = AbstractC1745.f5844;
                C1299 c1299M3492 = AbstractC0968.m2484(obj).m3490();
                String[] strArr18 = AbstractC1574.f5469;
                c1299M3492.f6370 = "field_type";
                Integer num = (Integer) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                if (num != null && num.intValue() == 3) {
                    C1299 c1299M3493 = AbstractC0968.m2484(obj).m3490();
                    c1299M3493.f6370 = "field_favProto";
                    C1973 c1973M3493 = AbstractC0968.m2484(((C1315) AbstractC2784.m4741(c1299M3493)).m3023()).m3492();
                    c1973M3493.f6370 = "getData";
                    byte[] bArr2 = (byte[]) ((C1982) AbstractC2784.m4742(c1973M3493)).m3832(new Object[0]);
                    C2427 c2428 = C2427.f7718;
                    c2428.getClass();
                    C1283 c1284 = ((C1284) c2428.m4387(C1284.Companion.serializer(), bArr2)).f4695;
                    String string2 = c1284.f4693;
                    String str6 = c1284.f4692;
                    if (string2 == null) {
                        String strM4006 = AbstractC2202.m4005();
                        String strValueOf2 = String.valueOf(str6.hashCode() & 255);
                        StringBuilder sbM4754 = AbstractC2784.m4753(strM4006);
                        sbM4754.append("/favorite/");
                        sbM4754.append(strValueOf2);
                        sbM4754.append('/');
                        sbM4754.append(str6);
                        sbM4754.append('.');
                        sbM4754.append(c1284.f4689);
                        string2 = sbM4754.toString();
                    }
                    if (new File(string2).exists()) {
                        AbstractC1458.m3166(C2113.f6962, new C2110(string2, c1284, i3));
                    } else {
                        AbstractC2834.m4823(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                } else {
                    AbstractC2834.m4823(null, 3, "暂不支持的转发类型");
                }
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C2058(25);
                c1020.f3733 = new C2058(26);
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                ((C1332) obj).m3050(new C2058(27));
                return c3497;
            case 26:
                C1333 c13310 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c13310);
                Class<String> cls = String.class;
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (clsM2183 == null) {
                    clsM2183 = cls;
                }
                Class<List> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(List.class));
                Class cls2 = clsM2184 != null ? clsM2184 : List.class;
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                cls = clsM2185 != null ? clsM2185 : String.class;
                Class<Object> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(Object.class));
                c1981M47311.m3823(clsM2183, cls2, cls, clsM2186 != null ? clsM2186 : Object.class);
                c13310.f4794 = c1981M47311;
                return c3497;
            case 27:
                String[] strArr19 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.NetSceneAddChatRoomMember", "/cgi-bin/micromsg-bin/addchatroommember");
                return c3497;
            case 28:
                C1020 c1021 = (C1020) obj;
                c1021.f3732 = new C2058(i2);
                c1021.f3733 = new C2158(i6);
                return c3497;
            default:
                C1332 c13311 = (C1332) obj;
                String[] strArr20 = AbstractC1574.f5469;
                c13311.m3051("com.tencent.mm.plugin.remittance.model");
                C0705 c07010 = new C0705(4);
                c07010.m2127("MicroMsg.NetSceneBeforeTransfer", "/cgi-bin/mmpay-bin/beforetransfer");
                c13311.f4791 = c07010;
                return c3497;
        }
    }
}
