package p000;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲈᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0845 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3260;

    public /* synthetic */ C0845(int i) {
        this.f3260 = i;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x02b4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        Object c2643;
        boolean z;
        Object c2644;
        int i = this.f3260;
        int i2 = 6;
        int i3 = 15;
        Object obj2 = null;
        boolean z2 = false;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.storage");
                C2012 c2012 = new C2012();
                c2012.m4021("hidden_conv_parent", "message_fold", "appbrandcustomerservicemsg");
                c1335.f4794 = c2012;
                return c3554;
            case 1:
                ((C1023) obj).f3740 = new C0845(i2);
                return c3554;
            case 2:
                ((C1023) obj).f3740 = new C0845(3);
                return c3554;
            case 3:
                C1335 c1336 = (C1335) obj;
                c1336.m3156("com.tencent.mm.ui.conversation");
                c1336.m3155(new C0845(7));
                return c3554;
            case 4:
                C1574 c1574 = (C1574) obj;
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
                int i4 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772(c1574);
                c1300M4772.f4724 = AbstractC0972.m2610(C0850.f3272).getDeclaringClass();
                C1300 c1300M3558 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3126()).m3558();
                C0847.f3262.getClass();
                c1300M3558.f4724 = AbstractC0972.m2610(C0846.f3261).getDeclaringClass();
                ConversationBean conversationBean = new ConversationBean(((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126());
                for (InterfaceC1593 interfaceC1593 : C0852.f3275) {
                    try {
                        for (C0849 c0849 : interfaceC1593.mo3501(conversationBean)) {
                            if (menuItem.getItemId() == c0849.f3269) {
                                c0849.f3271.invoke(conversationBean);
                            }
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr2 = AbstractC1471.f5234;
                        sb.append("onCreateMenuItems ");
                        sb.append(interfaceC1593 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1593).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 5:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                ContextMenu contextMenu = (ContextMenu) c2642;
                try {
                    c2643 = c1575.m3447()[2];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) (c2643 instanceof C2641 ? null : c2643);
                int i5 = AbstractC1768.f5906;
                C1300 c1300M4773 = AbstractC2844.m4772(c1575);
                C0847.f3262.getClass();
                c1300M4773.f4724 = AbstractC0972.m2610(C0846.f3261).getDeclaringClass();
                ConversationBean conversationBean2 = new ConversationBean(((C1316) AbstractC0739.m2290(c1300M4773.m3117())).m3126());
                for (InterfaceC1593 interfaceC1594 : C0852.f3275) {
                    try {
                        for (C0849 c08410 : interfaceC1594.mo3501(conversationBean2)) {
                            contextMenu.add(adapterContextMenuInfo.position, c08410.f3269, 0, c08410.f3270);
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr3 = AbstractC1471.f5234;
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC1594 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1594).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case 6:
                C1335 c1337 = (C1335) obj;
                c1337.m3156("com.tencent.mm.ui.conversation");
                c1337.m3155(new C0845(8));
                return c3554;
            case 7:
                C2012 c2013 = (C2012) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c2013.m4020("onMMMenuItemSelected");
                c2013.m4021("com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI");
                return c3554;
            case 8:
                C2012 c2014 = (C2012) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c2014.m4020("onCreateContextMenu");
                if (AbstractC0972.m2596(EnumC3737.f11688) || AbstractC0972.m2597(EnumC3734.f11654)) {
                    c2014.m4021("MicroMsg.ConversationLongClickListener", "onCreateContextMenu, contact is null, talker = ");
                } else {
                    c2014.m4021("MicroMsg.ConversationClickListener", "onCreateContextMenu, contact is null, talker = ");
                }
                return c3554;
            case 9:
                ((C1023) obj).f3740 = new C0845(10);
                return c3554;
            case 10:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1338);
                String[] strArr6 = AbstractC1471.f5234;
                C2012.m4012(c2012M4773, "com.tencent.mm.ui.conversation.ConversationListView");
                c2012M4773.m4021("[checkEmptyFooter] isRealFull:");
                c1338.f4794 = c2012M4773;
                return c3554;
            case 11:
                ((C1023) obj).f3739 = new C0845(18);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3740 = new C0845(16);
                return c3554;
            case 13:
                ((C1023) obj).f3740 = new C0845(17);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1023) obj).f3740 = new C0845(i3);
                return c3554;
            case 15:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1339);
                C0859.f3282.getClass();
                c2012M4774.m4014(AbstractC0972.m2608(C0855.f3278));
                String[] strArr7 = AbstractC1471.f5234;
                c2012M4774.m4021("MicroMsg.ConversationStorage", "get null with username:");
                c1339.f4794 = c2012M4774;
                return c3554;
            case 16:
                C1335 c13310 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c13310);
                C0859.f3282.getClass();
                c2012M4775.m4014(AbstractC0972.m2608(C0855.f3278));
                c2012M4775.m4021("updateUnreadByTalker %s");
                c13310.f4794 = c2012M4775;
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                ((C1335) obj).m3155(new C0845(19));
                return c3554;
            case Opcodes.LDC /* 18 */:
                C1334 c1334 = (C1334) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.storage");
                C0700 c0700 = new C0700();
                c0700.m2220("PRAGMA table_info( rconversation)");
                c1334.f4791 = c0700;
                return c3554;
            case 19:
                C2012 c2015 = (C2012) obj;
                C0859.f3282.getClass();
                c2015.m4014(AbstractC0972.m2608(C0855.f3278));
                c2015.m4016(new C1679(2, 4, 1));
                String[] strArr9 = AbstractC1471.f5234;
                c2015.m4023("Update ", "rconversation", " set ", "parentRef", " = '");
                String str = "' where 1 != 1 ";
                List arrayList3 = c2015.f6667;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                c2015.f6667 = arrayList3;
                arrayList3.add(new C2897(str, 5, false));
                String str2 = "rconversation";
                List arrayList4 = c2015.f6667;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c2015.f6667 = arrayList4;
                arrayList4.add(new C2897(str2, 5, false));
                return c3554;
            case 20:
                ((C1023) obj).f3739 = new C0845(21);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1334) obj).m3153(new C0845(22));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr10 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MMKernel.CoreStorage", "CheckData path[%s] blocksize:%s blockcount:%s availcount:%s");
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C0845(24);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1335 c13311 = (C1335) obj;
                String[] strArr11 = AbstractC1471.f5234;
                c13311.m3156("com.tencent.mm.ui");
                C2012 c2016 = new C2012();
                c2016.m4021("newcursor closeCursor,clear events");
                c13311.f4794 = c2016;
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr12 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_custom_balance, null, false);
                int i6 = R.id.moduleDialogEdtCustomBalanceMax1;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceMax1);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogEdtCustomBalanceMax2;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceMax2);
                    if (textInputEditText2 != null) {
                        i6 = R.id.moduleDialogEdtCustomBalanceMax3;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceMax3);
                        if (textInputEditText3 != null) {
                            i6 = R.id.moduleDialogEdtCustomBalanceMin1;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceMin1);
                            if (textInputEditText4 != null) {
                                i6 = R.id.moduleDialogEdtCustomBalanceMin2;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceMin2);
                                if (textInputEditText5 != null) {
                                    i6 = R.id.moduleDialogEdtCustomBalanceMin3;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceMin3);
                                    if (textInputEditText6 != null) {
                                        i6 = R.id.moduleDialogEdtCustomBalanceValue1;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceValue1);
                                        if (textInputEditText7 != null) {
                                            i6 = R.id.moduleDialogEdtCustomBalanceValue2;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceValue2);
                                            if (textInputEditText8 != null) {
                                                i6 = R.id.moduleDialogEdtCustomBalanceValue3;
                                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomBalanceValue3);
                                                if (textInputEditText9 != null) {
                                                    i6 = R.id.moduleDialogInputCustomBalanceMax1;
                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceMax1)) != null) {
                                                        i6 = R.id.moduleDialogInputCustomBalanceMax2;
                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceMax2)) != null) {
                                                            i6 = R.id.moduleDialogInputCustomBalanceMax3;
                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceMax3)) != null) {
                                                                i6 = R.id.moduleDialogInputCustomBalanceMin1;
                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceMin1)) != null) {
                                                                    i6 = R.id.moduleDialogInputCustomBalanceMin2;
                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceMin2)) != null) {
                                                                        i6 = R.id.moduleDialogInputCustomBalanceMin3;
                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceMin3)) != null) {
                                                                            i6 = R.id.moduleDialogInputCustomBalanceValue1;
                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceValue1)) != null) {
                                                                                i6 = R.id.moduleDialogInputCustomBalanceValue2;
                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceValue2)) != null) {
                                                                                    i6 = R.id.moduleDialogInputCustomBalanceValue3;
                                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomBalanceValue3)) != null) {
                                                                                        i6 = R.id.moduleDialogRbCustomBalanceMathAdd;
                                                                                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRbCustomBalanceMathAdd);
                                                                                        if (materialRadioButton != null) {
                                                                                            i6 = R.id.moduleDialogRbCustomBalanceMathDefault;
                                                                                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRbCustomBalanceMathDefault);
                                                                                            if (materialRadioButton2 != null) {
                                                                                                i6 = R.id.moduleDialogRbCustomBalanceMathSub;
                                                                                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRbCustomBalanceMathSub);
                                                                                                if (materialRadioButton3 != null) {
                                                                                                    i6 = R.id.moduleDialogRgCustomBalanceMath;
                                                                                                    RadioGroup radioGroup = (RadioGroup) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRgCustomBalanceMath);
                                                                                                    if (radioGroup != null) {
                                                                                                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                                                                        C2047 c2047 = new C2047(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, materialRadioButton, materialRadioButton2, materialRadioButton3, radioGroup);
                                                                                                        int iM2662 = C0921.f3418.m2662();
                                                                                                        if (iM2662 == EnumC0920.f3412.f3417) {
                                                                                                            materialRadioButton3.setChecked(true);
                                                                                                        } else if (iM2662 == EnumC0920.f3413.f3417) {
                                                                                                            materialRadioButton2.setChecked(true);
                                                                                                        } else if (iM2662 == EnumC0920.f3414.f3417) {
                                                                                                            materialRadioButton.setChecked(true);
                                                                                                        }
                                                                                                        textInputEditText4.setText(AbstractC2234.m4166(Float.valueOf(C0925.f3422.m2661())));
                                                                                                        textInputEditText7.setText(AbstractC2234.m4166(Float.valueOf(C0928.f3425.m2661())));
                                                                                                        textInputEditText.setText(AbstractC2234.m4166(Float.valueOf(C0922.f3419.m2661())));
                                                                                                        textInputEditText5.setText(AbstractC2234.m4166(Float.valueOf(C0926.f3423.m2661())));
                                                                                                        textInputEditText8.setText(AbstractC2234.m4166(Float.valueOf(C0929.f3426.m2661())));
                                                                                                        textInputEditText2.setText(AbstractC2234.m4166(Float.valueOf(C0923.f3420.m2661())));
                                                                                                        textInputEditText6.setText(AbstractC2234.m4166(Float.valueOf(C0927.f3424.m2661())));
                                                                                                        textInputEditText9.setText(AbstractC2234.m4166(Float.valueOf(C0930.f3427.m2661())));
                                                                                                        textInputEditText3.setText(AbstractC2234.m4166(Float.valueOf(C0924.f3421.m2661())));
                                                                                                        C2037 c2037 = new C2037();
                                                                                                        C0931.f3428.getClass();
                                                                                                        c2037.f6779 = C0931.f3430;
                                                                                                        c2037.f6781 = linearLayout;
                                                                                                        c2037.m4057("保存", new C0114(c2047, 14));
                                                                                                        AbstractC2844.m4788(c2037, null, 3);
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
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i6)));
            case 26:
                List list = (List) obj;
                Object obj3 = list.get(0);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (AbstractC1469.m3322(obj3, clsM4232 != null ? clsM4232 : String.class)) {
                    Object obj4 = list.get(1);
                    Class<Boolean> cls = Boolean.class;
                    Class<Boolean> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    if (clsM4233 == null) {
                        clsM4233 = cls;
                    }
                    if (AbstractC1469.m3322(obj4, clsM4233)) {
                        Object obj5 = list.get(2);
                        Class<Boolean> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                        z = AbstractC1469.m3322(obj5, clsM4234 != null ? clsM4234 : Boolean.class);
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2644 = c1576.m3447()[0];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                String str3 = (String) (c2644 instanceof C2641 ? null : c2644);
                if (str3 == null) {
                    str3 = "";
                }
                float f = Float.parseFloat(str3);
                C1227 c1227 = EnumC0920.f3416;
                c1227.getClass();
                C0067 c0067 = new C0067(c1227, 0);
                while (c0067.hasNext()) {
                    EnumC0920 enumC0920 = (EnumC0920) c0067.next();
                    if (enumC0920.f3417 == C0921.f3418.m2662()) {
                        for (C2348 c2348 : AbstractC0740.m2311(new C2348(new C0726(C0925.f3422.m2661(), C0922.f3419.m2661()), Float.valueOf(C0928.f3425.m2661())), new C2348(new C0726(C0926.f3423.m2661(), C0923.f3420.m2661()), Float.valueOf(C0929.f3426.m2661())), new C2348(new C0726(C0927.f3424.m2661(), C0924.f3421.m2661()), Float.valueOf(C0930.f3427.m2661())))) {
                            InterfaceC0727 interfaceC0727 = (InterfaceC0727) c2348.f7567;
                            float fFloatValue = ((Number) c2348.f7568).floatValue();
                            C0726 c0726 = (C0726) interfaceC0727;
                            c0726.getClass();
                            if (f >= c0726.f2753 && f <= c0726.f2754) {
                                int iOrdinal = enumC0920.ordinal();
                                if (iOrdinal == 0) {
                                    fFloatValue = f - fFloatValue;
                                } else if (iOrdinal == 2) {
                                    fFloatValue += f;
                                }
                                new C0383(0, 6, c1576).m1714(AbstractC2234.m4166(Float.valueOf(fFloatValue)));
                                return c3554;
                            }
                        }
                        return c3554;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 28:
                String[] strArr13 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_custom_contact_count, null, false);
                int i7 = R.id.moduleDialogEdtCustomFriendCount;
                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtCustomFriendCount);
                if (textInputEditText10 != null) {
                    i7 = R.id.moduleDialogEdtCustomGroupCount;
                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtCustomGroupCount);
                    if (textInputEditText11 != null) {
                        i7 = R.id.moduleDialogEdtMsgInfoTextPlaceholders;
                        if (((MaterialTextView) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtMsgInfoTextPlaceholders)) != null) {
                            i7 = R.id.moduleDialogInputCustomFriendCount;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputCustomFriendCount)) != null) {
                                i7 = R.id.moduleDialogInputCustomGroupCount;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputCustomGroupCount)) != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                                    C2048 c2048 = new C2048(linearLayout2, textInputEditText10, textInputEditText11, 0);
                                    textInputEditText10.setText(String.valueOf(C0932.f3433.m2662()));
                                    textInputEditText11.setText(String.valueOf(C0933.f3434.m2662()));
                                    C2037 c2038 = new C2037();
                                    C0934.f3435.getClass();
                                    c2038.f6779 = C0934.f3437;
                                    c2038.f6781 = linearLayout2;
                                    c2038.m4057("保存", new C0114(c2048, i3));
                                    AbstractC2844.m4788(c2038, null, 3);
                                    return c3554;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i7)));
            default:
                C1574 c1577 = (C1574) obj;
                String[] strArr14 = AbstractC1471.f5234;
                int i8 = AbstractC1768.f5906;
                C1300 c1300M4774 = AbstractC2844.m4772(c1577);
                c1300M4774.f4724 = AbstractC2574.m4549(Integer.TYPE);
                for (Object obj6 : c1300M4774.m3117()) {
                    int iIntValue = ((Number) ((C1316) obj6).m3127()).intValue();
                    if (1 <= iIntValue && iIntValue < 3) {
                        if (z2) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj2 = obj6;
                        z2 = true;
                    }
                }
                if (!z2) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                int iM2663 = (((Number) ((C1316) obj2).m3127()).intValue() == 1 ? C0932.f3433 : C0933.f3434).m2662();
                if (iM2663 != 0) {
                    int i9 = AbstractC1768.f5906;
                    C2004 c2004M3560 = AbstractC2727.m4713(c1577.m3448()).m3560();
                    c2004M3560.f6475 = "setFixedContactCount";
                    ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(Integer.valueOf(iM2663));
                }
                return c3554;
        }
    }
}
