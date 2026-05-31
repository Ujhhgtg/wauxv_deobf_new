package p000;

import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲀᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2059 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6905;

    public /* synthetic */ C2059(int i) {
        this.f6905 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        int i = this.f6905;
        Class<View.OnClickListener> cls = View.OnClickListener.class;
        int i2 = 29;
        int i3 = 14;
        int i4 = 26;
        int i5 = 25;
        int i6 = 27;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1304 c1304 = (C1304) obj;
                c1304.getClass();
                C0700 c0700 = new C0700();
                Class<View.OnClickListener> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                C0700.m2216(c0700, (clsM4232 != null ? clsM4232 : View.OnClickListener.class).getName());
                c1304.f4735 = c0700;
                return c3554;
            case 1:
                C1304 c1305 = (C1304) obj;
                c1305.getClass();
                C0700 c0701 = new C0700();
                Class<View.OnClickListener> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                C0700.m2216(c0701, (clsM4233 != null ? clsM4233 : View.OnClickListener.class).getName());
                c1305.f4735 = c0701;
                return c3554;
            case 2:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2059(6);
                c1023.f3740 = new C2059(7);
                return c3554;
            case 3:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C2059(4);
                c1024.f3740 = new C2059(5);
                return c3554;
            case 4:
                C1334 c1334 = (C1334) obj;
                c1334.m3154("com.tencent.mm.ui.chatting.component");
                C0700 c0702 = new C0700();
                c0702.m2218(new C1898(i4));
                c0702.m2219(new C1898(i6));
                c1334.f4791 = c0702;
                return c3554;
            case 5:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                c2012M4773.m4020("onMMMenuItemSelected");
                c1335.f4794 = c2012M4773;
                return c3554;
            case 6:
                C1334 c1336 = (C1334) obj;
                c1336.m3154("com.tencent.mm.ui.chatting.component");
                C0700 c0703 = new C0700();
                c0703.m2218(new C1898(28));
                c0703.m2219(new C1898(i2));
                c1336.f4791 = c0703;
                return c3554;
            case 7:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1337);
                c2012M4774.m4020("onCreateMMMenu");
                c1337.f4794 = c2012M4774;
                return c3554;
            case 8:
                C1574 c1574 = (C1574) obj;
                String[] strArr = AbstractC1471.f5234;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                MenuItem menuItem = (MenuItem) (c2641 instanceof C2641 ? null : c2641);
                int i7 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772(c1574);
                c1300M4772.f4724 = AbstractC2574.m4549(View.class);
                View view = (View) ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3127();
                C1300 c1300M4773 = AbstractC2844.m4772(c1574);
                c1300M4773.f4725 = new C1898(i5);
                C1300 c1300M3558 = AbstractC2727.m4713((View.OnClickListener) ((C1316) AbstractC0739.m2290(c1300M4773.m3117())).m3127()).m3558();
                c1300M3558.f6475 = "d";
                C2004 c2004M3560 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126()).m3560();
                c2004M3560.f6648 = AbstractC2574.m4549(List.class);
                List list = (List) ((C2013) AbstractC1095.m2793(c2004M3560)).m4026(new Object[0]);
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MsgInfoBean(it.next()));
                }
                for (InterfaceC1603 interfaceC1603 : C2063.f6912) {
                    try {
                        for (C2060 c2060 : interfaceC1603.mo3503(arrayList)) {
                            if (menuItem.getItemId() == c2060.f6906) {
                                c2060.f6908.mo1342(view.getContext(), arrayList);
                            }
                        }
                    } catch (Exception e) {
                        ArrayList arrayList2 = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCreateMenuItems ");
                        sb.append(interfaceC1603 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1603).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 9:
                String[] strArr2 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_msg_bg_bubble, null, false);
                int i8 = R.id.moduleDialogEdtMsgBgBubbleLeftBubble;
                if (((TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgBgBubbleLeftBubble)) != null) {
                    i8 = R.id.moduleDialogEdtMsgBgBubbleLeftDarkBubbleColor;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgBgBubbleLeftDarkBubbleColor);
                    if (textInputEditText != null) {
                        i8 = R.id.moduleDialogEdtMsgBgBubbleLeftLightBubbleColor;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgBgBubbleLeftLightBubbleColor);
                        if (textInputEditText2 != null) {
                            i8 = R.id.moduleDialogEdtMsgBgBubbleRightBubble;
                            if (((TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgBgBubbleRightBubble)) != null) {
                                i8 = R.id.moduleDialogEdtMsgBgBubbleRightDarkBubbleColor;
                                TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgBgBubbleRightDarkBubbleColor);
                                if (textInputEditText3 != null) {
                                    i8 = R.id.moduleDialogEdtMsgBgBubbleRightLightBubbleColor;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgBgBubbleRightLightBubbleColor);
                                    if (textInputEditText4 != null) {
                                        i8 = R.id.moduleDialogInputMsgBgBubbleLeftBubble;
                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgBgBubbleLeftBubble)) != null) {
                                            i8 = R.id.moduleDialogInputMsgBgBubbleLeftDarkBubbleColor;
                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgBgBubbleLeftDarkBubbleColor)) != null) {
                                                i8 = R.id.moduleDialogInputMsgBgBubbleLeftLightBubbleColor;
                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgBgBubbleLeftLightBubbleColor)) != null) {
                                                    i8 = R.id.moduleDialogInputMsgBgBubbleRightBubble;
                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgBgBubbleRightBubble)) != null) {
                                                        i8 = R.id.moduleDialogInputMsgBgBubbleRightDarkBubbleColor;
                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgBgBubbleRightDarkBubbleColor)) != null) {
                                                            i8 = R.id.moduleDialogInputMsgBgBubbleRightLightBubbleColor;
                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgBgBubbleRightLightBubbleColor)) != null) {
                                                                LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                                C2049 c2049 = new C2049(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, 1);
                                                                textInputEditText2.setText(C2072.f6938.m2666());
                                                                textInputEditText4.setText(C2074.f6940.m2666());
                                                                textInputEditText.setText(C2071.f6937.m2666());
                                                                textInputEditText3.setText(C2073.f6939.m2666());
                                                                C2037 c2037 = new C2037();
                                                                C2075.f6941.getClass();
                                                                c2037.f6779 = C2075.f6947;
                                                                c2037.f6781 = linearLayout;
                                                                c2037.m4057("保存", new C2070(c2049, 0));
                                                                c2037.m4056("重置", new C1356(27));
                                                                C2037.m4053(c2037, null, 3);
                                                                c2037.m4055().m3985();
                                                                return c3554;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i8)));
            case 10:
                String[] strArr3 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_msg_bg_color, null, false);
                int i9 = R.id.moduleDialogEdtMsgBgColorLeftDarkBgColor;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorLeftDarkBgColor);
                if (textInputEditText5 != null) {
                    i9 = R.id.moduleDialogEdtMsgBgColorLeftDarkStrokeColor;
                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorLeftDarkStrokeColor);
                    if (textInputEditText6 != null) {
                        i9 = R.id.moduleDialogEdtMsgBgColorLeftLightBgColor;
                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorLeftLightBgColor);
                        if (textInputEditText7 != null) {
                            i9 = R.id.moduleDialogEdtMsgBgColorLeftLightStrokeColor;
                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorLeftLightStrokeColor);
                            if (textInputEditText8 != null) {
                                i9 = R.id.moduleDialogEdtMsgBgColorRightDarkBgColor;
                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorRightDarkBgColor);
                                if (textInputEditText9 != null) {
                                    i9 = R.id.moduleDialogEdtMsgBgColorRightDarkStrokeColor;
                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorRightDarkStrokeColor);
                                    if (textInputEditText10 != null) {
                                        i9 = R.id.moduleDialogEdtMsgBgColorRightLightBgColor;
                                        TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorRightLightBgColor);
                                        if (textInputEditText11 != null) {
                                            i9 = R.id.moduleDialogEdtMsgBgColorRightLightStrokeColor;
                                            TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgBgColorRightLightStrokeColor);
                                            if (textInputEditText12 != null) {
                                                i9 = R.id.moduleDialogInputMsgBgColorLeftDarkBgColor;
                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorLeftDarkBgColor)) != null) {
                                                    i9 = R.id.moduleDialogInputMsgBgColorLeftDarkStrokeColor;
                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorLeftDarkStrokeColor)) != null) {
                                                        i9 = R.id.moduleDialogInputMsgBgColorLeftLightBgColor;
                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorLeftLightBgColor)) != null) {
                                                            i9 = R.id.moduleDialogInputMsgBgColorLeftLightStrokeColor;
                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorLeftLightStrokeColor)) != null) {
                                                                i9 = R.id.moduleDialogInputMsgBgColorRightDarkBgColor;
                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorRightDarkBgColor)) != null) {
                                                                    i9 = R.id.moduleDialogInputMsgBgColorRightDarkStrokeColor;
                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorRightDarkStrokeColor)) != null) {
                                                                        i9 = R.id.moduleDialogInputMsgBgColorRightLightBgColor;
                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorRightLightBgColor)) != null) {
                                                                            i9 = R.id.moduleDialogInputMsgBgColorRightLightStrokeColor;
                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputMsgBgColorRightLightStrokeColor)) != null) {
                                                                                LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                                                                                C2044 c2044 = new C2044(linearLayout2, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12, 1);
                                                                                textInputEditText7.setText(C2078.f6952.m2666());
                                                                                textInputEditText8.setText(C2079.f6953.m2666());
                                                                                textInputEditText11.setText(C2082.f6956.m2666());
                                                                                textInputEditText12.setText(C2083.f6957.m2666());
                                                                                textInputEditText5.setText(C2076.f6950.m2666());
                                                                                textInputEditText6.setText(C2077.f6951.m2666());
                                                                                textInputEditText9.setText(C2080.f6954.m2666());
                                                                                textInputEditText10.setText(C2081.f6955.m2666());
                                                                                C2037 c2038 = new C2037();
                                                                                C2084.f6958.getClass();
                                                                                c2038.f6779 = C2084.f6960;
                                                                                c2038.f6781 = linearLayout2;
                                                                                c2038.m4057("保存", new C2070(c2044, 1));
                                                                                c2038.m4056("重置", new C1356(28));
                                                                                C2037.m4053(c2038, null, 3);
                                                                                c2038.m4055().m3985();
                                                                                return c3554;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i9)));
            case 11:
                String[] strArr4 = AbstractC1471.f5234;
                View viewM4624 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_msg_format, null, false);
                int i10 = R.id.moduleDialogEdtMsgFormatTextFormat;
                TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtMsgFormatTextFormat);
                if (textInputEditText13 != null) {
                    i10 = R.id.moduleDialogEdtMsgFormatTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtMsgFormatTextPlaceholders);
                    if (materialTextView != null) {
                        i10 = R.id.moduleDialogEdtMsgFormatTimeFormat;
                        TextInputEditText textInputEditText14 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtMsgFormatTimeFormat);
                        if (textInputEditText14 != null) {
                            i10 = R.id.moduleDialogInputMsgFormatTextFormat;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputMsgFormatTextFormat)) != null) {
                                i10 = R.id.moduleDialogInputMsgFormatTimeFormat;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputMsgFormatTimeFormat)) != null) {
                                    C2048 c2048 = new C2048((LinearLayout) viewM4624, textInputEditText13, materialTextView, textInputEditText14, 3);
                                    textInputEditText13.setText(C2087.f6965.m2666());
                                    textInputEditText14.setText(C2088.f6966.m2666());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str : C2089.f6968) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str + ' '));
                                        spannableStringBuilder.setSpan(new C0627(c2048, str, 1), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C2037 c2039 = new C2037();
                                    C2089.f6967.getClass();
                                    c2039.f6779 = C2089.f6970;
                                    c2039.f6781 = c2048.f6857;
                                    c2039.m4057("保存", new C2070(c2048, 2));
                                    c2039.m4056("重置", new C1356(29));
                                    C2037.m4053(c2039, null, 3);
                                    c2039.m4055().m3985();
                                    return c3554;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4624.getResources().getResourceName(i10)));
            case Opcodes.FCONST_1 /* 12 */:
                C1023 c1025 = (C1023) obj;
                c1025.f3739 = new C2059(13);
                c1025.f3740 = new C2059(i3);
                return c3554;
            case 13:
                C1334 c1338 = (C1334) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1338.m3154("com.tencent.mm.ui.chatting.component");
                C0700 c0704 = new C0700();
                c0704.m2220("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage begin send txt msg");
                c1338.f4791 = c0704;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c1339);
                c2012M4775.m4016(new C1679(12, 14, 1));
                c1339.f4794 = c2012M4775;
                return c3554;
            case 15:
                ((C1023) obj).f3739 = new C2059(16);
                return c3554;
            case 16:
                C1334 c13310 = (C1334) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c13310.m3154("com.tencent.mm.storage");
                C0700 c0705 = new C0700();
                c0705.m2220("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
                c13310.f4791 = c0705;
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1574 c1575 = (C1574) obj;
                for (InterfaceC1604 interfaceC1604 : C2093.f6980) {
                    try {
                        interfaceC1604.mo2152(c1575.m3448());
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr7 = AbstractC1471.f5234;
                        sb2.append("onConvert ");
                        sb2.append(interfaceC1604 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1604).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1023) obj).f3740 = new C2059(19);
                return c3554;
            case 19:
                C1335 c13311 = (C1335) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c13311.m3156("com.tencent.mm.storage");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.MsgInfoStorage", "protect:c2c msg should not here");
                c13311.f4794 = c2012;
                return c3554;
            case 20:
                C1574 c1576 = (C1574) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1576.getClass();
                try {
                    c2642 = c1576.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(c2642 instanceof C2641 ? null : c2642);
                for (InterfaceC1605 interfaceC1605 : C2095.f6983) {
                    try {
                        interfaceC1605.mo2150(msgInfoBean);
                    } catch (Exception e3) {
                        ArrayList arrayList4 = C3741.f11709;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onInsert ");
                        sb3.append(interfaceC1605 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1605).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb3, " Failed", e3, 12);
                    }
                }
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr10 = AbstractC1471.f5234;
                View viewM4625 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_msg_info, null, false);
                int i11 = R.id.moduleDialogCbMsgInfoTextClickInfo;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4625, R.id.moduleDialogCbMsgInfoTextClickInfo);
                if (materialCheckBox != null) {
                    i11 = R.id.moduleDialogCbMsgInfoTextContentStyle;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4625, R.id.moduleDialogCbMsgInfoTextContentStyle);
                    if (materialCheckBox2 != null) {
                        i11 = R.id.moduleDialogEdtMsgInfoDarkBgColor;
                        TextInputEditText textInputEditText15 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoDarkBgColor);
                        if (textInputEditText15 != null) {
                            i11 = R.id.moduleDialogEdtMsgInfoDarkTextColor;
                            TextInputEditText textInputEditText16 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoDarkTextColor);
                            if (textInputEditText16 != null) {
                                i11 = R.id.moduleDialogEdtMsgInfoFont;
                                TextInputEditText textInputEditText17 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoFont);
                                if (textInputEditText17 != null) {
                                    i11 = R.id.moduleDialogEdtMsgInfoLeftMargin;
                                    TextInputEditText textInputEditText18 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoLeftMargin);
                                    if (textInputEditText18 != null) {
                                        i11 = R.id.moduleDialogEdtMsgInfoLightBgColor;
                                        TextInputEditText textInputEditText19 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoLightBgColor);
                                        if (textInputEditText19 != null) {
                                            i11 = R.id.moduleDialogEdtMsgInfoLightTextColor;
                                            TextInputEditText textInputEditText20 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoLightTextColor);
                                            if (textInputEditText20 != null) {
                                                i11 = R.id.moduleDialogEdtMsgInfoRightMargin;
                                                TextInputEditText textInputEditText21 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoRightMargin);
                                                if (textInputEditText21 != null) {
                                                    i11 = R.id.moduleDialogEdtMsgInfoTextFormat;
                                                    TextInputEditText textInputEditText22 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoTextFormat);
                                                    if (textInputEditText22 != null) {
                                                        i11 = R.id.moduleDialogEdtMsgInfoTextPlaceholders;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoTextPlaceholders);
                                                        if (materialTextView2 != null) {
                                                            i11 = R.id.moduleDialogEdtMsgInfoTimeFormat;
                                                            TextInputEditText textInputEditText23 = (TextInputEditText) AbstractC1272.m3098(viewM4625, R.id.moduleDialogEdtMsgInfoTimeFormat);
                                                            if (textInputEditText23 != null) {
                                                                i11 = R.id.moduleDialogInputMsgInfoDarkBgColor;
                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoDarkBgColor)) != null) {
                                                                    i11 = R.id.moduleDialogInputMsgInfoDarkTextColor;
                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoDarkTextColor)) != null) {
                                                                        i11 = R.id.moduleDialogInputMsgInfoFont;
                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoFont)) != null) {
                                                                            i11 = R.id.moduleDialogInputMsgInfoLeftMargin;
                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoLeftMargin)) != null) {
                                                                                i11 = R.id.moduleDialogInputMsgInfoLightBgColor;
                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoLightBgColor)) != null) {
                                                                                    i11 = R.id.moduleDialogInputMsgInfoLightTextColor;
                                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoLightTextColor)) != null) {
                                                                                        i11 = R.id.moduleDialogInputMsgInfoRightMargin;
                                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoRightMargin)) != null) {
                                                                                            i11 = R.id.moduleDialogInputMsgInfoTextFormat;
                                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoTextFormat)) != null) {
                                                                                                i11 = R.id.moduleDialogInputMsgInfoTimeFormat;
                                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4625, R.id.moduleDialogInputMsgInfoTimeFormat)) != null) {
                                                                                                    C2052 c2052 = new C2052((LinearLayout) viewM4625, materialCheckBox, materialCheckBox2, textInputEditText15, textInputEditText16, textInputEditText17, textInputEditText18, textInputEditText19, textInputEditText20, textInputEditText21, textInputEditText22, materialTextView2, textInputEditText23);
                                                                                                    textInputEditText19.setText(C2101.f6989.m2666());
                                                                                                    textInputEditText20.setText(C2102.f6990.m2666());
                                                                                                    textInputEditText15.setText(C2097.f6985.m2666());
                                                                                                    textInputEditText16.setText(C2098.f6986.m2666());
                                                                                                    textInputEditText22.setText(C2106.f6994.m2666());
                                                                                                    textInputEditText23.setText(C2107.f6995.m2666());
                                                                                                    textInputEditText18.setText(String.valueOf(C2100.f6988.m2662()));
                                                                                                    textInputEditText21.setText(String.valueOf(C2103.f6991.m2662()));
                                                                                                    textInputEditText17.setText(String.valueOf(C2099.f6987.m2662()));
                                                                                                    materialCheckBox.setChecked(C2104.f6992.m2660());
                                                                                                    materialCheckBox2.setChecked(C2105.f6993.m2660());
                                                                                                    materialTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                                                                                    for (String str2 : C2108.f6997) {
                                                                                                        int length2 = spannableStringBuilder2.length();
                                                                                                        spannableStringBuilder2.append((CharSequence) (str2 + ' '));
                                                                                                        spannableStringBuilder2.setSpan(new C0627(c2052, str2, 2), length2, spannableStringBuilder2.length() + (-1), 33);
                                                                                                    }
                                                                                                    materialTextView2.setText(spannableStringBuilder2);
                                                                                                    C2037 c20310 = new C2037();
                                                                                                    C2108.f6996.getClass();
                                                                                                    c20310.f6779 = C2108.f6999;
                                                                                                    c20310.f6781 = c2052.f6882;
                                                                                                    c20310.m4057("保存", new C2070(c2052, 3));
                                                                                                    c20310.m4056("重置", new C2096(0));
                                                                                                    C2037.m4053(c20310, null, 3);
                                                                                                    c20310.m4055().m3985();
                                                                                                    return c3554;
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
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4625.getResources().getResourceName(i11)));
            case Opcodes.LLOAD /* 22 */:
                ((C1023) obj).f3739 = new C2059(i4);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C2059(i6);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1023) obj).f3740 = new C2059(i5);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1335 c13312 = (C1335) obj;
                C2012 c2012M4776 = AbstractC2844.m4773(c13312);
                C2112.f7005.getClass();
                c2012M4776.m4014(AbstractC0972.m2608(C2109.f7002));
                c2012M4776.m4021("MsgInfo processAddMsg insert db error");
                c13312.f4794 = c2012M4776;
                return c3554;
            case 26:
                C1334 c13313 = (C1334) obj;
                String[] strArr11 = AbstractC1471.f5234;
                c13313.m3154("com.tencent.mm.storage");
                C0700 c0706 = new C0700();
                c0706.m2220("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d");
                c13313.f4791 = c0706;
                return c3554;
            case 27:
                C1335 c13314 = (C1335) obj;
                C2012 c2012M4777 = AbstractC2844.m4773(c13314);
                C2112.f7005.getClass();
                c2012M4777.m4014(AbstractC0972.m2608(C2109.f7002));
                c2012M4777.m4016(new C1679(2, 3, 1));
                String[] strArr12 = AbstractC1471.f5234;
                c2012M4777.m4021("notifymessage", "msgId=?", "update");
                c13314.f4794 = c2012M4777;
                return c3554;
            case 28:
                ArrayList arrayList5 = new ArrayList();
                String[] strArr13 = AbstractC1471.f5234;
                Cursor cursorM2863 = C1139.m2863("SELECT username FROM rconversation");
                if (cursorM2863 != null) {
                    while (cursorM2863.moveToNext()) {
                        try {
                            arrayList5.add(cursorM2863.getString(0));
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC3528.m5090(cursorM2863, th3);
                                throw th4;
                            }
                        }
                    }
                    cursorM2863.close();
                }
                C0859 c0859 = C0859.f3282;
                String[] strArr14 = (String[]) arrayList5.toArray(new String[0]);
                String str3 = "";
                c0859.getClass();
                C0859.m2500(str3, strArr14);
                return c3554;
            default:
                ArrayList arrayList6 = new ArrayList();
                String[] strArr15 = AbstractC1471.f5234;
                Cursor cursorM2864 = C1139.m2863("SELECT username FROM rconversation");
                if (cursorM2864 != null) {
                    while (cursorM2864.moveToNext()) {
                        try {
                            arrayList6.add(cursorM2864.getString(0));
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC3528.m5090(cursorM2864, th5);
                                throw th6;
                            }
                        }
                    }
                    cursorM2864.close();
                }
                C0859 c08510 = C0859.f3282;
                String[] strArr16 = (String[]) arrayList6.toArray(new String[0]);
                String str4 = "hidden_conv_parent";
                c08510.getClass();
                C0859.m2500(str4, strArr16);
                return c3554;
        }
    }
}
