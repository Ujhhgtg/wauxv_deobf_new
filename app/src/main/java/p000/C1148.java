package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲈᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1148 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4255;

    public /* synthetic */ C1148(int i) {
        this.f4255 = i;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x025e  */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        boolean z;
        boolean z2;
        Object c2587;
        Object c2588;
        int i = this.f4255;
        int i2 = 17;
        int i3 = 12;
        Class<String> cls = String.class;
        int i4 = 5;
        final int i5 = 2;
        int i6 = 4;
        final int iIntValue = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                ((C1020) obj).f3732 = new C1148(1);
                return c3497;
            case 1:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.feature.emoji");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.EmojiFeatureService", "[onAccountInitialized]", "onAccountRelease: ");
                c1332.f4791 = c0705;
                return c3497;
            case 2:
                ((C1020) obj).f3732 = new C1148(3);
                return c3497;
            case 3:
                ((C1332) obj).m3050(new C1148(i6));
                return c3497;
            case 4:
                String[] strArr2 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-97512937487028L, strArr2), MagicFactory.get(-97663261342388L, strArr2));
                return c3497;
            case 5:
                String[] strArr3 = AbstractC1574.f5469;
                C1981 c1981 = (C1981) obj;
                Class<Integer> cls2 = Integer.class;
                Class<Integer> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                if (clsM2183 == null) {
                    clsM2183 = cls2;
                }
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1981, clsM2183, cls2);
                if (clsM4740 == null) {
                    clsM4740 = cls2;
                }
                Class<Integer> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                c1981.m3823(clsM4740, clsM2184 != null ? clsM2184 : Integer.class);
                C1984 c1984 = new C1984(4);
                C1981 c1982 = new C1981(4);
                c1982.m3826(MagicFactory.get(-553934817065652L, strArr3));
                c1984.m3848(c1982);
                C1981 c1983 = new C1981(4);
                c1983.m3826(MagicFactory.get(-554012126476980L, strArr3));
                c1984.m3848(c1983);
                c1981.f6564 = c1984;
                return c3497;
            case 6:
                ((C1020) obj).f3733 = new C1148(10);
                return c3497;
            case 7:
                ((C1020) obj).f3733 = new C1148(11);
                return c3497;
            case 8:
                final C1563 c1563 = (C1563) obj;
                C1160 c1160 = C1160.f4283;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[3];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Class<? super Object> superclass = c2585.getClass().getSuperclass();
                int i7 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2483(superclass).m3490();
                AbstractC0750.m2218(c1299M3490.f6372, (EnumC1999[]) Arrays.copyOf(new EnumC1999[]{EnumC1999.FINAL}, 1));
                c1299M3490.f4725 = AbstractC2519.m4527(Integer.TYPE);
                C1315 c1315 = (C1315) AbstractC0744.m2191(c1299M3490.m3014());
                c1315.m3378(c2585);
                if (((Number) c1315.m3024()).intValue() == 0) {
                    C1299 c1299M3491 = AbstractC0968.m2484(c2585).m3490();
                    String[] strArr4 = AbstractC1574.f5469;
                    c1299M3491.f4725 = MagicFactory.get(-553492435434164L, strArr4);
                    C1973 c1973M3492 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3023()).m3492();
                    c1973M3492.f6370 = MagicFactory.get(-553621284453044L, strArr4);
                    String str = (String) ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3832(new Object[0]);
                    if (AbstractC2207.m4087(str, MagicFactory.get(-553651349224116L, strArr4))) {
                        c1160.getClass();
                        c1563.m3272(null);
                        AlertDialog.Builder builder = new AlertDialog.Builder(AbstractC2203.m4033());
                        builder.setTitle(MagicFactory.get(-553359291447988L, strArr4));
                        RadioGroup radioGroup = new RadioGroup(builder.getContext());
                        radioGroup.setGravity(17);
                        radioGroup.setOrientation(0);
                        C1225 c1225 = EnumC1157.f4278;
                        c1225.getClass();
                        C0060 c0060 = new C0060(0, c1225);
                        while (c0060.hasNext()) {
                            EnumC1157 enumC1157 = (EnumC1157) c0060.next();
                            RadioButton radioButton = new RadioButton(radioGroup.getContext());
                            radioButton.setId(enumC1157.f4279);
                            radioButton.setText(enumC1157.f4280);
                            radioButton.setOnClickListener(new ViewOnClickListenerC0103(6, enumC1157));
                            radioGroup.addView(radioButton);
                        }
                        builder.setView(radioGroup);
                        builder.setPositiveButton(MagicFactory.get(-553380766284468L, strArr4), new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲇᲀᲈ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8) {
                                switch (i5) {
                                    case 0:
                                        c1563.m3266();
                                        break;
                                    case 1:
                                        C1158.f4281.m2545(AbstractC2474.f7908.mo4331(6));
                                        c1563.m3266();
                                        break;
                                    case 2:
                                        c1563.m3266();
                                        break;
                                    default:
                                        C1159.f4282.m2545(AbstractC2474.f7908.mo4331(3));
                                        c1563.m3266();
                                        break;
                                }
                            }
                        });
                        final int i8 = 3;
                        builder.setNeutralButton(MagicFactory.get(-553393651186356L, strArr4), new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲇᲀᲈ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                switch (i8) {
                                    case 0:
                                        c1563.m3266();
                                        break;
                                    case 1:
                                        C1158.f4281.m2545(AbstractC2474.f7908.mo4331(6));
                                        c1563.m3266();
                                        break;
                                    case 2:
                                        c1563.m3266();
                                        break;
                                    default:
                                        C1159.f4282.m2545(AbstractC2474.f7908.mo4331(3));
                                        c1563.m3266();
                                        break;
                                }
                            }
                        });
                        builder.setNegativeButton(MagicFactory.get(-553406536088244L, strArr4), (DialogInterface.OnClickListener) null);
                        builder.show();
                    } else if (AbstractC2207.m4087(str, MagicFactory.get(-553793083144884L, strArr4))) {
                        c1160.getClass();
                        c1563.m3272(null);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(AbstractC2203.m4033());
                        builder2.setTitle(MagicFactory.get(-553419420990132L, strArr4));
                        RadioGroup radioGroup2 = new RadioGroup(builder2.getContext());
                        radioGroup2.setGravity(17);
                        radioGroup2.setOrientation(0);
                        C1225 c1226 = EnumC1154.f4269;
                        c1226.getClass();
                        C0060 c0061 = new C0060(0, c1226);
                        while (c0061.hasNext()) {
                            EnumC1154 enumC1154 = (EnumC1154) c0061.next();
                            RadioButton radioButton2 = new RadioButton(radioGroup2.getContext());
                            radioButton2.setId(enumC1154.f4270);
                            radioButton2.setText(enumC1154.f4271);
                            radioButton2.setOnClickListener(new ViewOnClickListenerC0103(5, enumC1154));
                            radioGroup2.addView(radioButton2);
                        }
                        builder2.setView(radioGroup2);
                        builder2.setPositiveButton(MagicFactory.get(-553440895826612L, strArr4), new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲇᲀᲈ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                switch (iIntValue) {
                                    case 0:
                                        c1563.m3266();
                                        break;
                                    case 1:
                                        C1158.f4281.m2545(AbstractC2474.f7908.mo4331(6));
                                        c1563.m3266();
                                        break;
                                    case 2:
                                        c1563.m3266();
                                        break;
                                    default:
                                        C1159.f4282.m2545(AbstractC2474.f7908.mo4331(3));
                                        c1563.m3266();
                                        break;
                                }
                            }
                        });
                        final int i9 = 1;
                        builder2.setNeutralButton(MagicFactory.get(-553453780728500L, strArr4), new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲇᲀᲈ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                switch (i9) {
                                    case 0:
                                        c1563.m3266();
                                        break;
                                    case 1:
                                        C1158.f4281.m2545(AbstractC2474.f7908.mo4331(6));
                                        c1563.m3266();
                                        break;
                                    case 2:
                                        c1563.m3266();
                                        break;
                                    default:
                                        C1159.f4282.m2545(AbstractC2474.f7908.mo4331(3));
                                        c1563.m3266();
                                        break;
                                }
                            }
                        });
                        builder2.setNegativeButton(MagicFactory.get(-553466665630388L, strArr4), (DialogInterface.OnClickListener) null);
                        builder2.show();
                    }
                }
                return c3497;
            case 9:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[0];
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
                Object objM3269 = c1564.m3269();
                Integer numValueOf = (Integer) (!(objM3269 instanceof Integer) ? null : objM3269);
                if (iIntValue == 2) {
                    numValueOf = Integer.valueOf(C1159.f4282.m2538());
                } else if (iIntValue == 5) {
                    numValueOf = Integer.valueOf(C1158.f4281.m2538());
                }
                c1564.m3272(numValueOf);
                return c3497;
            case 10:
                C1333 c1333 = (C1333) obj;
                c1333.m3053("com.tencent.mm.sdk.platformtools");
                c1333.m3052(new C1148(i4));
                return c3497;
            case 11:
                ((C1333) obj).m3052(new C1148(i3));
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                String[] strArr5 = AbstractC1574.f5469;
                ((C1981) obj).m3827(MagicFactory.get(-554188220136116L, strArr5), MagicFactory.get(-554329954056884L, strArr5));
                return c3497;
            case 13:
                String[] strArr6 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_emoji_game, null, false);
                int i10 = R.id.moduleDialogRbEmojiGameDice1;
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameDice1);
                if (materialRadioButton != null) {
                    i10 = R.id.moduleDialogRbEmojiGameDice2;
                    MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameDice2);
                    if (materialRadioButton2 != null) {
                        i10 = R.id.moduleDialogRbEmojiGameDice3;
                        MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameDice3);
                        if (materialRadioButton3 != null) {
                            i10 = R.id.moduleDialogRbEmojiGameDice4;
                            MaterialRadioButton materialRadioButton4 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameDice4);
                            if (materialRadioButton4 != null) {
                                i10 = R.id.moduleDialogRbEmojiGameDice5;
                                MaterialRadioButton materialRadioButton5 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameDice5);
                                if (materialRadioButton5 != null) {
                                    i10 = R.id.moduleDialogRbEmojiGameDice6;
                                    MaterialRadioButton materialRadioButton6 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameDice6);
                                    if (materialRadioButton6 != null) {
                                        i10 = R.id.moduleDialogRbEmojiGameMorra0;
                                        MaterialRadioButton materialRadioButton7 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameMorra0);
                                        if (materialRadioButton7 != null) {
                                            i10 = R.id.moduleDialogRbEmojiGameMorra1;
                                            MaterialRadioButton materialRadioButton8 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameMorra1);
                                            if (materialRadioButton8 != null) {
                                                i10 = R.id.moduleDialogRbEmojiGameMorra2;
                                                MaterialRadioButton materialRadioButton9 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbEmojiGameMorra2);
                                                if (materialRadioButton9 != null) {
                                                    i10 = R.id.moduleDialogRgEmojiGameDice;
                                                    RadioGroup radioGroup3 = (RadioGroup) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRgEmojiGameDice);
                                                    if (radioGroup3 != null) {
                                                        i10 = R.id.moduleDialogRgEmojiGameMorra;
                                                        RadioGroup radioGroup4 = (RadioGroup) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRgEmojiGameMorra);
                                                        if (radioGroup4 != null) {
                                                            LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                            C2019 c2019 = new C2019(linearLayout, materialRadioButton, materialRadioButton2, materialRadioButton3, materialRadioButton4, materialRadioButton5, materialRadioButton6, materialRadioButton7, materialRadioButton8, materialRadioButton9, radioGroup3, radioGroup4);
                                                            int iM2538 = C1159.f4282.m2538();
                                                            if (iM2538 == EnumC1157.f4274.f4279) {
                                                                z = true;
                                                                materialRadioButton7.setChecked(true);
                                                            } else {
                                                                z = true;
                                                                if (iM2538 == EnumC1157.f4275.f4279) {
                                                                    materialRadioButton8.setChecked(true);
                                                                } else if (iM2538 == EnumC1157.f4276.f4279) {
                                                                    materialRadioButton9.setChecked(true);
                                                                }
                                                            }
                                                            int iM2539 = C1158.f4281.m2538();
                                                            if (iM2539 == EnumC1154.f4262.f4270) {
                                                                materialRadioButton.setChecked(z);
                                                            } else if (iM2539 == EnumC1154.f4263.f4270) {
                                                                materialRadioButton2.setChecked(z);
                                                            } else if (iM2539 == EnumC1154.f4264.f4270) {
                                                                materialRadioButton3.setChecked(z);
                                                            } else if (iM2539 == EnumC1154.f4265.f4270) {
                                                                materialRadioButton4.setChecked(z);
                                                            } else if (iM2539 == EnumC1154.f4266.f4270) {
                                                                materialRadioButton5.setChecked(z);
                                                            } else if (iM2539 == EnumC1154.f4267.f4270) {
                                                                materialRadioButton6.setChecked(z);
                                                            }
                                                            C2007 c2007 = new C2007();
                                                            C1160.f4283.getClass();
                                                            c2007.f6678 = C1160.f4285;
                                                            c2007.f6680 = linearLayout;
                                                            c2007.m3870(MagicFactory.get(-553479550532276L, strArr6), new C0106(20, c2019));
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
                throw new NullPointerException(MagicFactory.get(-665118635457204L, strArr6).concat(viewM4676.getResources().getResourceName(i10)));
            case Opcodes.DCONST_0 /* 14 */:
                ((C1020) obj).f3733 = new C1148(15);
                return c3497;
            case 15:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1334);
                String[] strArr7 = AbstractC1574.f5469;
                C1981.m3818(c1981M4739, MagicFactory.get(-85907935853236L, strArr7));
                c1981M4739.m3827(MagicFactory.get(-86084029512372L, strArr7));
                c1334.f4794 = c1981M4739;
                return c3497;
            case 16:
                ((C1020) obj).f3732 = new C1148(i2);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                ((C1332) obj).m3050(new C1148(18));
                return c3497;
            case Opcodes.LDC /* 18 */:
                String[] strArr8 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-98036923497140L, strArr8), MagicFactory.get(-98174362450612L, strArr8));
                return c3497;
            case 19:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (AbstractC2207.m4087(obj2, clsM2185 != null ? clsM2185 : String.class)) {
                    Object obj3 = list.get(1);
                    C1162.f4289.getClass();
                    if (AbstractC2207.m4087(obj3, AbstractC1574.m3315(C1161.f4288).getDeclaringClass())) {
                        Object obj4 = list.get(2);
                        C2060.f6855.getClass();
                        z2 = AbstractC2207.m4087(obj4, AbstractC1574.m3313(C2059.f6854));
                    }
                }
                return Boolean.valueOf(z2);
            case 20:
                ((C1020) obj).f3732 = new C1148(21);
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                ((C1332) obj).m3050(new C1148(22));
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr9 = AbstractC1574.f5469;
                ((C0705) obj).m2127(MagicFactory.get(-98440650422964L, strArr9), MagicFactory.get(-98560909507252L, strArr9));
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                C2011 c2011M3872 = C2011.m3872(LayoutInflater.from(((View) obj).getContext()));
                c2011M3872.f6708.setText(C1174.f4306.m2542());
                C2007 c2008 = new C2007();
                C1175.f4307.getClass();
                c2008.f6678 = C1175.f4310;
                c2008.f6680 = c2011M3872.f6707;
                String[] strArr10 = AbstractC1574.f5469;
                c2008.m3870(MagicFactory.get(-565664372751028L, strArr10), new C1173(c2011M3872, 0));
                c2008.m3869(MagicFactory.get(-565677257652916L, strArr10), new C0104(26));
                C2007.m3866(c2008, null, 3);
                c2008.m3868().m3791();
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                ((C1020) obj).f3732 = new C1148(25);
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                C1332 c1335 = (C1332) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1335.m3051(MagicFactory.get(-99054830746292L, strArr11));
                C0705 c0706 = new C0705(4);
                c0706.m2127(MagicFactory.get(-98835787414196L, strArr11), MagicFactory.get(-98968931400372L, strArr11));
                c1335.f4791 = c0706;
                return c3497;
            case 26:
                ((C1020) obj).f3733 = new C1148(28);
                return c3497;
            case 27:
                C1563 c1565 = (C1563) obj;
                String[] strArr12 = AbstractC1574.f5469;
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
                String str2 = (String) c2587;
                try {
                    c2588 = c1565.m3267()[1];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                for (Object obj5 : C1260.f4592) {
                    try {
                        if (((C0622) obj5).mo3264() && AbstractC2207.m4087(str2, MagicFactory.get(-624690108299956L, strArr12))) {
                            c1565.m3272(MagicFactory.get(-624784597580468L, strArr12));
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        sb.append(MagicFactory.get(-48975512074932L, strArr12));
                        sb.append(obj5 instanceof AbstractC2867 ? ((AbstractC2867) obj5).mo1128() : MagicFactory.get(-49048526518964L, strArr12));
                        AbstractC1194.m2792(sb, MagicFactory.get(-49087181224628L, strArr12), e, 12);
                    }
                }
                return c3497;
            case 28:
                ((C1333) obj).m3052(new C1148(29));
                return c3497;
            default:
                C1981 c1985 = (C1981) obj;
                Class<String> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (clsM2186 == null) {
                    clsM2186 = cls;
                }
                Class<String> clsM4741 = AbstractC2784.m4740(c1985, clsM2186, cls);
                if (clsM4741 == null) {
                    clsM4741 = cls;
                }
                Class<String> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                cls = clsM2187 != null ? clsM2187 : String.class;
                Class<Boolean> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(Boolean.class));
                c1985.m3823(clsM4741, cls, clsM2188 != null ? clsM2188 : Boolean.class);
                String[] strArr13 = AbstractC1574.f5469;
                c1985.m3827(MagicFactory.get(-49121540962996L, strArr13), MagicFactory.get(-49211735276212L, strArr13));
                return c3497;
        }
    }
}
