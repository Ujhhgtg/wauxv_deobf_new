package p000;

import android.util.Log;
import android.view.View;
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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲁᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0853 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3268;

    public /* synthetic */ C0853(int i) {
        this.f3268 = i;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x04d5  */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        boolean z;
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        int i = this.f3268;
        int i2 = 6;
        int i3 = 15;
        int i4 = 9;
        Object obj2 = null;
        int iIntValue = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                ((C1020) obj).f3733 = new C0853(1);
                return c3497;
            case 1:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                String[] strArr = AbstractC1574.f5469;
                C1981.m3818(c1981M4739, "com.tencent.mm.ui.conversation.ConversationListView");
                c1981M4739.m3827("[checkEmptyFooter] isRealFull:");
                c1333.f4794 = c1981M4739;
                return c3497;
            case 2:
                ((C1020) obj).f3732 = new C0853(i4);
                return c3497;
            case 3:
                ((C1020) obj).f3733 = new C0853(7);
                return c3497;
            case 4:
                ((C1020) obj).f3733 = new C0853(8);
                return c3497;
            case 5:
                ((C1020) obj).f3733 = new C0853(i2);
                return c3497;
            case 6:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                C0860.f3275.getClass();
                c1981M47310.m3820(AbstractC1574.m3313(C0856.f3271));
                String[] strArr2 = AbstractC1574.f5469;
                c1981M47310.m3827(MagicFactory.get(-385825502132916L, strArr2), MagicFactory.get(-385950056184500L, strArr2));
                c1334.f4794 = c1981M47310;
                return c3497;
            case 7:
                C1333 c1335 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1335);
                C0860.f3275.getClass();
                c1981M47311.m3820(AbstractC1574.m3313(C0856.f3271));
                c1981M47311.m3827("updateUnreadByTalker %s");
                c1335.f4794 = c1981M47311;
                return c3497;
            case 8:
                ((C1333) obj).m3052(new C0853(10));
                return c3497;
            case 9:
                C1332 c1332 = (C1332) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1332.m3051(MagicFactory.get(-385310106057396L, strArr3));
                C0705 c0705 = new C0705(4);
                c0705.m2127(MagicFactory.get(-385164077169332L, strArr3));
                c1332.f4791 = c0705;
                return c3497;
            case 10:
                C1981 c1981 = (C1981) obj;
                C0860.f3275.getClass();
                c1981.m3820(AbstractC1574.m3313(C0856.f3271));
                c1981.m3822(new C1664(2, 4, 1));
                String[] strArr4 = AbstractC1574.f5469;
                c1981.m3829(MagicFactory.get(-385511969520308L, strArr4), MagicFactory.get(-385546329258676L, strArr4), MagicFactory.get(-385606458800820L, strArr4), MagicFactory.get(-385632228604596L, strArr4), MagicFactory.get(-385675178277556L, strArr4));
                String str = MagicFactory.get(-385696653114036L, strArr4);
                List arrayList = c1981.f6562;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c1981.f6562 = arrayList;
                arrayList.add(new C2837(str, 5, false));
                String str2 = MagicFactory.get(-385765372590772L, strArr4);
                List arrayList2 = c1981.f6562;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                c1981.f6562 = arrayList2;
                arrayList2.add(new C2837(str2, 5, false));
                return c3497;
            case 11:
                ((C1020) obj).f3732 = new C0853(12);
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1332) obj).m3050(new C0853(13));
                return c3497;
            case 13:
                String[] strArr5 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-96336116447924L, strArr5), MagicFactory.get(-96426310761140L, strArr5));
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1020) obj).f3733 = new C0853(i3);
                return c3497;
            case 15:
                C1333 c1336 = (C1333) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1336.m3053(MagicFactory.get(-84907208473268L, strArr6));
                C1981 c1982 = new C1981(4);
                c1982.m3827(MagicFactory.get(-84756884617908L, strArr6));
                c1336.f4794 = c1982;
                return c3497;
            case 16:
                String[] strArr7 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_custom_balance, null, false);
                int i5 = R.id.moduleDialogEdtCustomBalanceMax1;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceMax1);
                if (textInputEditText != null) {
                    i5 = R.id.moduleDialogEdtCustomBalanceMax2;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceMax2);
                    if (textInputEditText2 != null) {
                        i5 = R.id.moduleDialogEdtCustomBalanceMax3;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceMax3);
                        if (textInputEditText3 != null) {
                            i5 = R.id.moduleDialogEdtCustomBalanceMin1;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceMin1);
                            if (textInputEditText4 != null) {
                                i5 = R.id.moduleDialogEdtCustomBalanceMin2;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceMin2);
                                if (textInputEditText5 != null) {
                                    i5 = R.id.moduleDialogEdtCustomBalanceMin3;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceMin3);
                                    if (textInputEditText6 != null) {
                                        i5 = R.id.moduleDialogEdtCustomBalanceValue1;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceValue1);
                                        if (textInputEditText7 != null) {
                                            i5 = R.id.moduleDialogEdtCustomBalanceValue2;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceValue2);
                                            if (textInputEditText8 != null) {
                                                i5 = R.id.moduleDialogEdtCustomBalanceValue3;
                                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtCustomBalanceValue3);
                                                if (textInputEditText9 != null) {
                                                    i5 = R.id.moduleDialogInputCustomBalanceMax1;
                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceMax1)) != null) {
                                                        i5 = R.id.moduleDialogInputCustomBalanceMax2;
                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceMax2)) != null) {
                                                            i5 = R.id.moduleDialogInputCustomBalanceMax3;
                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceMax3)) != null) {
                                                                i5 = R.id.moduleDialogInputCustomBalanceMin1;
                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceMin1)) != null) {
                                                                    i5 = R.id.moduleDialogInputCustomBalanceMin2;
                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceMin2)) != null) {
                                                                        i5 = R.id.moduleDialogInputCustomBalanceMin3;
                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceMin3)) != null) {
                                                                            i5 = R.id.moduleDialogInputCustomBalanceValue1;
                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceValue1)) != null) {
                                                                                i5 = R.id.moduleDialogInputCustomBalanceValue2;
                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceValue2)) != null) {
                                                                                    i5 = R.id.moduleDialogInputCustomBalanceValue3;
                                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputCustomBalanceValue3)) != null) {
                                                                                        i5 = R.id.moduleDialogRbCustomBalanceMathAdd;
                                                                                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbCustomBalanceMathAdd);
                                                                                        if (materialRadioButton != null) {
                                                                                            i5 = R.id.moduleDialogRbCustomBalanceMathDefault;
                                                                                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbCustomBalanceMathDefault);
                                                                                            if (materialRadioButton2 != null) {
                                                                                                i5 = R.id.moduleDialogRbCustomBalanceMathSub;
                                                                                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbCustomBalanceMathSub);
                                                                                                if (materialRadioButton3 != null) {
                                                                                                    i5 = R.id.moduleDialogRgCustomBalanceMath;
                                                                                                    RadioGroup radioGroup = (RadioGroup) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRgCustomBalanceMath);
                                                                                                    if (radioGroup != null) {
                                                                                                        LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                                                                        C2017 c2017 = new C2017(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, materialRadioButton, materialRadioButton2, materialRadioButton3, radioGroup);
                                                                                                        int iM2538 = C0922.f3411.m2538();
                                                                                                        if (iM2538 == EnumC0921.f3405.f3410) {
                                                                                                            materialRadioButton3.setChecked(true);
                                                                                                        } else if (iM2538 == EnumC0921.f3406.f3410) {
                                                                                                            materialRadioButton2.setChecked(true);
                                                                                                        } else if (iM2538 == EnumC0921.f3407.f3410) {
                                                                                                            materialRadioButton.setChecked(true);
                                                                                                        }
                                                                                                        textInputEditText4.setText(AbstractC3681.m5326(Float.valueOf(C0926.f3415.m2537())));
                                                                                                        textInputEditText7.setText(AbstractC3681.m5326(Float.valueOf(C0929.f3418.m2537())));
                                                                                                        textInputEditText.setText(AbstractC3681.m5326(Float.valueOf(C0923.f3412.m2537())));
                                                                                                        textInputEditText5.setText(AbstractC3681.m5326(Float.valueOf(C0927.f3416.m2537())));
                                                                                                        textInputEditText8.setText(AbstractC3681.m5326(Float.valueOf(C0930.f3419.m2537())));
                                                                                                        textInputEditText2.setText(AbstractC3681.m5326(Float.valueOf(C0924.f3413.m2537())));
                                                                                                        textInputEditText6.setText(AbstractC3681.m5326(Float.valueOf(C0928.f3417.m2537())));
                                                                                                        textInputEditText9.setText(AbstractC3681.m5326(Float.valueOf(C0931.f3420.m2537())));
                                                                                                        textInputEditText3.setText(AbstractC3681.m5326(Float.valueOf(C0925.f3414.m2537())));
                                                                                                        C2007 c2007 = new C2007();
                                                                                                        C0932.f3421.getClass();
                                                                                                        c2007.f6678 = C0932.f3423;
                                                                                                        c2007.f6680 = linearLayout;
                                                                                                        c2007.m3870(MagicFactory.get(-485352779283124L, strArr7), new C0106(13, c2017));
                                                                                                        AbstractC2784.m4755(c2007, null, 3);
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
                throw new NullPointerException(MagicFactory.get(-664568879643316L, strArr7).concat(viewM4676.getResources().getResourceName(i5)));
            case Opcodes.SIPUSH /* 17 */:
                List list = (List) obj;
                Object obj3 = list.get(0);
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                if (AbstractC2207.m4087(obj3, clsM2183 != null ? clsM2183 : String.class)) {
                    Object obj4 = list.get(1);
                    Class<Boolean> cls = Boolean.class;
                    Class<Boolean> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                    if (clsM2184 == null) {
                        clsM2184 = cls;
                    }
                    if (AbstractC2207.m4087(obj4, clsM2184)) {
                        Object obj5 = list.get(2);
                        Class<Boolean> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                        z = AbstractC2207.m4087(obj5, clsM2185 != null ? clsM2185 : Boolean.class);
                    }
                }
                return Boolean.valueOf(z);
            case Opcodes.LDC /* 18 */:
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
                String str3 = (String) (c2585 instanceof C2585 ? null : c2585);
                float f = Float.parseFloat(str3 != null ? str3 : "");
                C1225 c1225 = EnumC0921.f3409;
                c1225.getClass();
                C0060 c0060 = new C0060(0, c1225);
                while (c0060.hasNext()) {
                    EnumC0921 enumC0921 = (EnumC0921) c0060.next();
                    if (enumC0921.f3410 == C0922.f3411.m2538()) {
                        for (C2315 c2315 : AbstractC0745.m2212(new C2315(new C0731(C0926.f3415.m2537(), C0923.f3412.m2537()), Float.valueOf(C0929.f3418.m2537())), new C2315(new C0731(C0927.f3416.m2537(), C0924.f3413.m2537()), Float.valueOf(C0930.f3419.m2537())), new C2315(new C0731(C0928.f3417.m2537(), C0925.f3414.m2537()), Float.valueOf(C0931.f3420.m2537())))) {
                            InterfaceC0732 interfaceC0732 = (InterfaceC0732) c2315.f7445;
                            float fFloatValue = ((Number) c2315.f7446).floatValue();
                            C0731 c0731 = (C0731) interfaceC0732;
                            c0731.getClass();
                            if (f >= c0731.f2759 && f <= c0731.f2760) {
                                int iOrdinal = enumC0921.ordinal();
                                if (iOrdinal == 0) {
                                    fFloatValue = f - fFloatValue;
                                } else if (iOrdinal == 2) {
                                    fFloatValue += f;
                                }
                                new C0408(0, 6, c1563).m1608(AbstractC3681.m5326(Float.valueOf(fFloatValue)));
                                return c3497;
                            }
                        }
                        return c3497;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                String[] strArr8 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_custom_contact_count, null, false);
                int i6 = R.id.moduleDialogEdtCustomFriendCount;
                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtCustomFriendCount);
                if (textInputEditText10 != null) {
                    i6 = R.id.moduleDialogEdtCustomGroupCount;
                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtCustomGroupCount);
                    if (textInputEditText11 != null) {
                        i6 = R.id.moduleDialogEdtMsgInfoTextPlaceholders;
                        if (((MaterialTextView) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtMsgInfoTextPlaceholders)) != null) {
                            i6 = R.id.moduleDialogInputCustomFriendCount;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputCustomFriendCount)) != null) {
                                i6 = R.id.moduleDialogInputCustomGroupCount;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputCustomGroupCount)) != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewM4677;
                                    C2018 c2018 = new C2018(linearLayout2, textInputEditText10, textInputEditText11);
                                    textInputEditText10.setText(String.valueOf(C0933.f3426.m2538()));
                                    textInputEditText11.setText(String.valueOf(C0934.f3427.m2538()));
                                    C2007 c2008 = new C2007();
                                    C0935.f3428.getClass();
                                    c2008.f6678 = C0935.f3430;
                                    c2008.f6680 = linearLayout2;
                                    c2008.m3870(MagicFactory.get(-486366391564980L, strArr8), new C0106(14, c2018));
                                    AbstractC2784.m4755(c2008, null, 3);
                                    return c3497;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(-664706318596788L, strArr8).concat(viewM4677.getResources().getResourceName(i6)));
            case 20:
                C1563 c1564 = (C1563) obj;
                String[] strArr9 = AbstractC1574.f5469;
                int i7 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738(c1564);
                c1299M4738.f4725 = AbstractC2519.m4527(Integer.TYPE);
                for (Object obj6 : c1299M4738.m3014()) {
                    int iIntValue2 = ((Number) ((C1315) obj6).m3024()).intValue();
                    if (1 <= iIntValue2 && iIntValue2 < 3) {
                        if (iIntValue != 0) {
                            throw new IllegalArgumentException(MagicFactory.get(-486379276466868L, strArr9));
                        }
                        obj2 = obj6;
                        iIntValue = 1;
                    }
                }
                if (iIntValue == 0) {
                    throw new NoSuchElementException(MagicFactory.get(-486602614766260L, strArr9));
                }
                int iM2539 = (((Number) ((C1315) obj2).m3024()).intValue() == 1 ? C0933.f3426 : C0934.f3427).m2538();
                if (iM2539 != 0) {
                    int i8 = AbstractC1745.f5844;
                    C1973 c1973M3492 = AbstractC0968.m2484(c1564.m3268()).m3492();
                    c1973M3492.f6370 = MagicFactory.get(-486838837967540L, strArr9);
                    ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3831(Integer.valueOf(iM2539));
                }
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr10 = AbstractC1574.f5469;
                View viewM4678 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_custom_unread_count, null, false);
                int i9 = R.id.moduleDialogEdtCustomUnReadCount;
                TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC3681.m5325(viewM4678, R.id.moduleDialogEdtCustomUnReadCount);
                if (textInputEditText12 != null) {
                    i9 = R.id.moduleDialogInputCustomUnReadCount;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM4678, R.id.moduleDialogInputCustomUnReadCount)) != null) {
                        LinearLayout linearLayout3 = (LinearLayout) viewM4678;
                        C2012 c2012 = new C2012(linearLayout3, textInputEditText12);
                        textInputEditText12.setText(String.valueOf(C0945.f3458.m2538()));
                        C2007 c2009 = new C2007();
                        C0946.f3459.getClass();
                        c2009.f6678 = C0946.f3461;
                        c2009.f6680 = linearLayout3;
                        c2009.m3870(MagicFactory.get(-535397738216116L, strArr10), new C0106(i3, c2012));
                        AbstractC2784.m4755(c2009, null, 3);
                        return c3497;
                    }
                }
                throw new NullPointerException(MagicFactory.get(-664843757550260L, strArr10).concat(viewM4678.getResources().getResourceName(i9)));
            case Opcodes.LLOAD /* 22 */:
                C0511.f2180.getClass();
                return Boolean.valueOf(((AbstractC2867) obj).mo2591());
            case Opcodes.FLOAD /* 23 */:
                String strMo1129 = ((AbstractC2867) obj).mo1129();
                C2361.f7579.getClass();
                return Boolean.valueOf(!AbstractC2207.m4087(strMo1129, C2361.f7580));
            case Opcodes.DLOAD /* 24 */:
                return ((AbstractC2867) obj).mo1129();
            case Opcodes.ALOAD /* 25 */:
                return ((AbstractC2867) obj).mo1128();
            case 26:
                C1563 c1565 = (C1563) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1565.getClass();
                try {
                    c2586 = c1565.m3267()[1];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                Integer num = (Integer) c2586;
                iIntValue = num != null ? num.intValue() : 0;
                try {
                    c2587 = c1565.m3267()[2];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                String str4 = (String) c2587;
                String str5 = str4 == null ? "" : str4;
                try {
                    c2588 = c1565.m3267()[9];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                String str6 = (String) (c2588 instanceof C2585 ? null : c2588);
                String str7 = str6 != null ? str6 : "";
                if (iIntValue == 0) {
                    String str8 = MagicFactory.get(-659208760457908L, strArr11);
                    StringBuilder sbM4753 = AbstractC2784.m4753(str5);
                    sbM4753.append(MagicFactory.get(-659256005098164L, strArr11));
                    sbM4753.append(str7);
                    Log.v(str8, sbM4753.toString());
                } else if (iIntValue == 1) {
                    String str9 = MagicFactory.get(-659268890000052L, strArr11);
                    StringBuilder sbM4754 = AbstractC2784.m4753(str5);
                    sbM4754.append(MagicFactory.get(-659316134640308L, strArr11));
                    sbM4754.append(str7);
                    Log.d(str9, sbM4754.toString());
                } else if (iIntValue == 2) {
                    String str10 = MagicFactory.get(-659329019542196L, strArr11);
                    StringBuilder sbM4755 = AbstractC2784.m4753(str5);
                    sbM4755.append(MagicFactory.get(-659376264182452L, strArr11));
                    sbM4755.append(str7);
                    Log.i(str10, sbM4755.toString());
                } else if (iIntValue == 3) {
                    String str11 = MagicFactory.get(-659389149084340L, strArr11);
                    StringBuilder sbM4756 = AbstractC2784.m4753(str5);
                    sbM4756.append(MagicFactory.get(-659436393724596L, strArr11));
                    sbM4756.append(str7);
                    Log.w(str11, sbM4756.toString());
                } else if (iIntValue == 4) {
                    String str12 = MagicFactory.get(-659449278626484L, strArr11);
                    StringBuilder sbM4757 = AbstractC2784.m4753(str5);
                    sbM4757.append(MagicFactory.get(-659496523266740L, strArr11));
                    sbM4757.append(str7);
                    Log.e(str12, sbM4757.toString());
                } else if (iIntValue == 5) {
                    String str13 = MagicFactory.get(-659509408168628L, strArr11);
                    StringBuilder sbM4758 = AbstractC2784.m4753(str5);
                    sbM4758.append(MagicFactory.get(-659556652808884L, strArr11));
                    sbM4758.append(str7);
                    Log.wtf(str13, sbM4758.toString());
                }
                return c3497;
            case 27:
                return AbstractC1028.m2604((String) obj);
            case 28:
                return AbstractC1028.m2603((Class) obj);
            default:
                return AbstractC1028.m2603((Class) obj);
        }
    }
}
