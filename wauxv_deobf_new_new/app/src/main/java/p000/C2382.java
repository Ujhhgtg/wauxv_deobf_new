package p000;

import android.content.ContentValues;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.data.bean.PayMsgBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᛸᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2382 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7644;

    public /* synthetic */ C2382(int i) {
        this.f7644 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2641;
        Object c2642;
        boolean zStartsWith;
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
        Object c26420;
        Object c26421;
        Object c26422;
        int i = this.f7644;
        Class<CharSequence> cls = CharSequence.class;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1023) obj).f3740 = new C2382(i3);
                return c3554;
            case 1:
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
                Object obj2 = c2641 instanceof C2641 ? null : c2641;
                int i5 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(obj2).m3560();
                c2004M3560.f6475 = "toByteArray";
                byte[] bArr = (byte[]) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                C2480 c2480 = C2480.f7862;
                c2480.getClass();
                C2387 c2387 = (C2387) c2480.m4408(C2387.Companion.serializer(), bArr);
                for (Object obj3 : C2384.f7647) {
                    try {
                        ((C2318) obj3).getClass();
                        PayMsgBean payMsgBean = new PayMsgBean(c2387);
                        Iterator it = AbstractC2419.m4354().iterator();
                        while (it.hasNext()) {
                            C2426 c2426M4355 = AbstractC2419.m4355((C2400) it.next());
                            if (c2426M4355 != null) {
                                c2426M4355.m4360("onRecvPayMsg", payMsgBean);
                            }
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onRecv ");
                        sb.append(obj3 instanceof AbstractC2927 ? ((AbstractC2927) obj3).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 2:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                String[] strArr2 = AbstractC1471.f5234;
                C2012.m4012(c2012M4773, "com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI");
                c2012M4773.m4021("MicroMsg.WalletCollectQrCodeUI", "[onRecv PayerMsg]，newMsg.msgType：%s");
                c1335.f4794 = c2012M4773;
                return c3554;
            case 3:
                String[] strArr3 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_placed_sort_pro, null, false);
                int i6 = R.id.moduleDialogCbPlacedSortProShowBottom;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbPlacedSortProShowBottom);
                if (materialCheckBox != null) {
                    i6 = R.id.moduleDialogCbPlacedSortProShowReset;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbPlacedSortProShowReset);
                    if (materialCheckBox2 != null) {
                        i6 = R.id.moduleDialogCbPlacedSortProShowTop;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbPlacedSortProShowTop);
                        if (materialCheckBox3 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM4622;
                            C2042 c2042 = new C2042(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, 1);
                            materialCheckBox3.setChecked(C2393.f7670.m2660());
                            materialCheckBox2.setChecked(C2392.f7669.m2660());
                            materialCheckBox.setChecked(C2391.f7668.m2660());
                            C2037 c2037 = new C2037();
                            C2394.f7671.getClass();
                            c2037.f6779 = C2394.f7673;
                            c2037.f6781 = linearLayout;
                            c2037.m4057("保存", new C2070(c2042, 9));
                            AbstractC2844.m4788(c2037, null, 3);
                            return c3554;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i6)));
            case 4:
                ConversationBean conversationBean = (ConversationBean) obj;
                C0847 c0847 = C0847.f3262;
                ContentValues contentValues = new ContentValues();
                contentValues.put("flag", Long.valueOf(C1139.m2860(conversationBean.getFlag(), C0848.f3268)));
                C0859.m2499(C0859.f3282, c0847.m2497(contentValues), conversationBean.getUsername());
                return c3554;
            case 5:
                ConversationBean conversationBean2 = (ConversationBean) obj;
                C0847 c0848 = C0847.f3262;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("flag", Long.valueOf(C1139.m2860(conversationBean2.getFlag(), C0848.f3266)));
                C0859.m2499(C0859.f3282, c0848.m2497(contentValues2), conversationBean2.getUsername());
                return c3554;
            case 6:
                ConversationBean conversationBean3 = (ConversationBean) obj;
                C0847 c0849 = C0847.f3262;
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("flag", Long.valueOf(conversationBean3.getConversationTime()));
                C0859.m2499(C0859.f3282, c0849.m2497(contentValues3), conversationBean3.getUsername());
                return c3554;
            case 7:
                ConversationBean conversationBean4 = (ConversationBean) obj;
                C0847 c08410 = C0847.f3262;
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("flag", Long.valueOf(C1139.m2860(conversationBean4.getFlag(), C0848.f3267)));
                C0859.m2499(C0859.f3282, c08410.m2497(contentValues4), conversationBean4.getUsername());
                return c3554;
            case 8:
                ConversationBean conversationBean5 = (ConversationBean) obj;
                C0847 c08411 = C0847.f3262;
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put("flag", Long.valueOf(C1139.m2860(conversationBean5.getFlag(), C0848.f3265)));
                C0859.m2499(C0859.f3282, c08411.m2497(contentValues5), conversationBean5.getUsername());
                return c3554;
            case 9:
                ((C1023) obj).f3740 = new C2382(11);
                return c3554;
            case 10:
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
                Integer num = (Integer) c2642;
                int iIntValue = num != null ? num.intValue() : 0;
                int i7 = AbstractC1768.f5906;
                C2004 c2004M3561 = AbstractC2727.m4713(c1575.m3448()).m3560();
                String[] strArr4 = AbstractC1471.f5234;
                c2004M3561.f6475 = "getItem";
                ConversationBean conversationBean6 = new ConversationBean(((C2013) AbstractC2844.m4776(c2004M3561)).m4025(Integer.valueOf(iIntValue)));
                Object objM3449 = c1575.m3449();
                View childAt = ((ViewGroup) (objM3449 instanceof ViewGroup ? objM3449 : null)).getChildAt(0);
                long flag = conversationBean6.getFlag();
                if (6917529027641081856L <= flag && flag < 8070450532247928833L) {
                    childAt.setBackgroundColor(Color.parseColor(MagicFactory.get(AbstractC2234.m4176(childAt.getContext()) ? -593414156450435L : -593457106123395L, strArr4)));
                } else if (-6917529027641081856L > flag || flag >= -5764607523034234879L) {
                    childAt.setBackgroundColor(0);
                } else {
                    childAt.setBackgroundColor(Color.parseColor(MagicFactory.get(AbstractC2234.m4176(childAt.getContext()) ? -593500055796355L : -593543005469315L, strArr4)));
                }
                return c3554;
            case 11:
                C1335 c1336 = (C1335) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.ui.conversation");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.ConversationWithCacheAdapter", "handle show tip count, but talker is null");
                c1336.f4794 = c2012;
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                View view = (View) obj;
                View viewM4623 = AbstractC2647.m4622(view, R.layout.module_dialog_plugin, null, false);
                int i8 = R.id.moduleDialogBtnPluginCopyPath;
                MaterialButton materialButton = (MaterialButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogBtnPluginCopyPath);
                if (materialButton != null) {
                    i8 = R.id.moduleDialogBtnPluginOpenDemo;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogBtnPluginOpenDemo);
                    if (materialButton2 != null) {
                        materialButton.setOnClickListener(new ViewOnClickListenerC2350(i3));
                        materialButton2.setOnClickListener(new ViewOnClickListenerC1863(view, i2));
                        C2037 c2038 = new C2037();
                        C2406.f7709.getClass();
                        c2038.f6779 = C2406.f7711;
                        c2038.f6781 = (LinearLayout) viewM4623;
                        C2037.m4054(c2038, null, 3);
                        AbstractC2844.m4788(c2038, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i8)));
            case 13:
                ((C1023) obj).f3740 = new C2382(19);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1023) obj).f3740 = new C2382(16);
                return c3554;
            case 15:
                C1023 c1023 = (C1023) obj;
                c1023.f3740 = new C2382(17);
                c1023.f3741 = new C2382(18);
                return c3554;
            case 16:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1337);
                c2012M4774.m4014(C2444.f7796.m4390());
                Class<CharSequence> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                c2012M4774.m4017(clsM4232 != null ? clsM4232 : CharSequence.class);
                c2012M4774.m4022(0);
                c1337.f4794 = c2012M4774;
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c1338);
                c2012M4775.m4014(C2444.f7796.m4390());
                Class<CharSequence> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                c2012M4775.m4017(clsM4233 != null ? clsM4233 : CharSequence.class);
                c1338.f4794 = c2012M4775;
                return c3554;
            case Opcodes.LDC /* 18 */:
                zStartsWith = !AbstractC1469.m3322(((C2005) obj).f6651, C2442.f7795.m2718());
                break;
            case 19:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4776 = AbstractC2844.m4773(c1339);
                c2012M4776.m4014(C2444.f7796.m4390());
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                c2012M4776.m4017(clsM4234 != null ? clsM4234 : String.class);
                c2012M4776.m4021("Preference does not have a key assigned.");
                c1339.f4794 = c2012M4776;
                return c3554;
            case 20:
                ((C1023) obj).f3740 = new C2382(22);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2643 = c1576.m3447()[2];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                KeyEvent keyEvent = (KeyEvent) (c2643 instanceof C2641 ? null : c2643);
                if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0) {
                    int i9 = AbstractC1768.f5906;
                    C1300 c1300M4772 = AbstractC2844.m4772(c1576);
                    c1300M4772.f4725 = new C2382(24);
                    C1300 c1300M3558 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3126()).m3558();
                    c1300M3558.f4724 = C0588.f2397.m2123();
                    FrameLayout frameLayout = (FrameLayout) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127();
                    C2004 c2004M3562 = AbstractC2727.m4713(frameLayout).m3560();
                    String[] strArr6 = AbstractC1471.f5234;
                    c2004M3562.f6475 = "getLastText";
                    String str = (String) ((C2013) AbstractC0739.m2290(c2004M3562.m3993())).m4026(new Object[0]);
                    C2004 c2004M3563 = AbstractC2727.m4713(frameLayout).m3560();
                    c2004M3563.f6475 = "getLastQuoteMsgId";
                    long jLongValue = ((Number) ((C2013) AbstractC0739.m2290(c2004M3563.m3993())).m4026(new Object[0])).longValue();
                    if (str.length() == 0 && jLongValue != 0) {
                        AbstractC0972.m2610(C0587.f2396).invoke(frameLayout, Boolean.FALSE, Boolean.TRUE);
                    }
                }
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1335 c13310 = (C1335) obj;
                c13310.m3156("com.tencent.mm.pluginsdk.ui.chat");
                c13310.m3155(new C2382(23));
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C2012 c2013 = (C2012) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c2013.m4020("onKey");
                c2013.m4021("ChatFooterKtHelper", "supportAutoComplete err");
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.pluginsdk.ui.chat.");
                break;
            case Opcodes.ALOAD /* 25 */:
                C1787.m3673(C2502.f7932, new C2500((ConversationBean) obj, i2));
                return c3554;
            case 26:
                ((C1023) obj).f3740 = new C2504(i4);
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C2382(29);
                return c3554;
            case 28:
                C1574 c1577 = (C1574) obj;
                if (AbstractC0972.m2596(EnumC3737.f11686) || AbstractC0972.m2597(EnumC3734.f11651)) {
                    c1577.getClass();
                    try {
                        c2644 = c1577.m3447()[0];
                        if (c2644 == null) {
                            c2644 = null;
                        }
                    } catch (Throwable th4) {
                        c2644 = new C2641(th4);
                    }
                    Object obj4 = c2644 instanceof C2641 ? null : c2644;
                    try {
                        c2645 = c1577.m3447()[2];
                        if (c2645 == null) {
                            c2645 = null;
                        }
                    } catch (Throwable th5) {
                        c2645 = new C2641(th5);
                    }
                    Object obj5 = c2645 instanceof C2641 ? null : c2645;
                    try {
                        c2646 = c1577.m3447()[3];
                        if (c2646 == null) {
                            c2646 = null;
                        }
                    } catch (Throwable th6) {
                        c2646 = new C2641(th6);
                    }
                    if (c2646 instanceof C2641) {
                        c2646 = null;
                    }
                    View view2 = (View) c2646;
                    try {
                        c2647 = c1577.m3447()[4];
                        if (c2647 == null) {
                            c2647 = null;
                        }
                    } catch (Throwable th7) {
                        c2647 = new C2641(th7);
                    }
                    if (c2647 instanceof C2641) {
                        c2647 = null;
                    }
                    long jLongValue2 = ((Number) c2647).longValue();
                    try {
                        c2648 = c1577.m3447()[5];
                        if (c2648 == null) {
                            c2648 = null;
                        }
                    } catch (Throwable th8) {
                        c2648 = new C2641(th8);
                    }
                    if (c2648 instanceof C2641) {
                        c2648 = null;
                    }
                    String str2 = (String) c2648;
                    try {
                        c2649 = c1577.m3447()[6];
                        if (c2649 == null) {
                            c2649 = null;
                        }
                    } catch (Throwable th9) {
                        c2649 = new C2641(th9);
                    }
                    Object obj6 = c2649 instanceof C2641 ? null : c2649;
                    C2112.f7005.getClass();
                    AbstractC0972.m2610(C2506.f7939).invoke(null, obj4, obj5, C2112.m4066(jLongValue2), view2, Long.valueOf(jLongValue2), str2, obj6);
                    c1577.m3452(null);
                } else if (AbstractC0972.m2596(EnumC3737.f11683) || AbstractC0972.m2597(EnumC3734.f11647)) {
                    c1577.getClass();
                    try {
                        c26410 = c1577.m3447()[0];
                        if (c26410 == null) {
                            c26410 = null;
                        }
                    } catch (Throwable th10) {
                        c26410 = new C2641(th10);
                    }
                    Object obj7 = c26410 instanceof C2641 ? null : c26410;
                    try {
                        c26411 = c1577.m3447()[2];
                        if (c26411 == null) {
                            c26411 = null;
                        }
                    } catch (Throwable th11) {
                        c26411 = new C2641(th11);
                    }
                    Object obj8 = c26411 instanceof C2641 ? null : c26411;
                    try {
                        c26412 = c1577.m3447()[3];
                        if (c26412 == null) {
                            c26412 = null;
                        }
                    } catch (Throwable th12) {
                        c26412 = new C2641(th12);
                    }
                    if (c26412 instanceof C2641) {
                        c26412 = null;
                    }
                    View view3 = (View) c26412;
                    try {
                        c26413 = c1577.m3447()[4];
                        if (c26413 == null) {
                            c26413 = null;
                        }
                    } catch (Throwable th13) {
                        c26413 = new C2641(th13);
                    }
                    if (c26413 instanceof C2641) {
                        c26413 = null;
                    }
                    long jLongValue3 = ((Number) c26413).longValue();
                    try {
                        c26414 = c1577.m3447()[5];
                        if (c26414 == null) {
                            c26414 = null;
                        }
                    } catch (Throwable th14) {
                        c26414 = new C2641(th14);
                    }
                    if (c26414 instanceof C2641) {
                        c26414 = null;
                    }
                    String str3 = (String) c26414;
                    try {
                        c26415 = c1577.m3447()[6];
                        if (c26415 == null) {
                            c26415 = null;
                        }
                    } catch (Throwable th15) {
                        c26415 = new C2641(th15);
                    }
                    Object obj9 = c26415 instanceof C2641 ? null : c26415;
                    try {
                        c26416 = c1577.m3447()[7];
                        if (c26416 == null) {
                            c26416 = null;
                        }
                    } catch (Throwable th16) {
                        c26416 = new C2641(th16);
                    }
                    if (c26416 instanceof C2641) {
                        c26416 = null;
                    }
                    Boolean bool = (Boolean) c26416;
                    bool.getClass();
                    C2112.f7005.getClass();
                    AbstractC0972.m2610(C2506.f7939).invoke(null, obj7, obj8, C2112.m4066(jLongValue3), view3, Long.valueOf(jLongValue3), str3, obj9, bool);
                    c1577.m3452(null);
                } else {
                    c1577.getClass();
                    try {
                        c26417 = c1577.m3447()[0];
                        if (c26417 == null) {
                            c26417 = null;
                        }
                    } catch (Throwable th17) {
                        c26417 = new C2641(th17);
                    }
                    Object obj10 = c26417 instanceof C2641 ? null : c26417;
                    try {
                        c26418 = c1577.m3447()[2];
                        if (c26418 == null) {
                            c26418 = null;
                        }
                    } catch (Throwable th18) {
                        c26418 = new C2641(th18);
                    }
                    Object obj11 = c26418 instanceof C2641 ? null : c26418;
                    try {
                        c26419 = c1577.m3447()[3];
                        if (c26419 == null) {
                            c26419 = null;
                        }
                    } catch (Throwable th19) {
                        c26419 = new C2641(th19);
                    }
                    if (c26419 instanceof C2641) {
                        c26419 = null;
                    }
                    View view4 = (View) c26419;
                    try {
                        c26420 = c1577.m3447()[4];
                        if (c26420 == null) {
                            c26420 = null;
                        }
                    } catch (Throwable th20) {
                        c26420 = new C2641(th20);
                    }
                    if (c26420 instanceof C2641) {
                        c26420 = null;
                    }
                    long jLongValue4 = ((Number) c26420).longValue();
                    try {
                        c26421 = c1577.m3447()[5];
                        if (c26421 == null) {
                            c26421 = null;
                        }
                    } catch (Throwable th21) {
                        c26421 = new C2641(th21);
                    }
                    Object obj12 = c26421 instanceof C2641 ? null : c26421;
                    try {
                        c26422 = c1577.m3447()[6];
                        if (c26422 == null) {
                            c26422 = null;
                        }
                    } catch (Throwable th22) {
                        c26422 = new C2641(th22);
                    }
                    if (c26422 instanceof C2641) {
                        c26422 = null;
                    }
                    Boolean bool2 = (Boolean) c26422;
                    bool2.getClass();
                    C2112.f7005.getClass();
                    AbstractC0972.m2610(C2506.f7939).invoke(null, obj10, obj11, C2112.m4066(jLongValue4), view4, Long.valueOf(jLongValue4), obj12, bool2);
                    c1577.m3452(null);
                }
                return c3554;
            default:
                C1335 c13311 = (C1335) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c13311.m3156("com.tencent.mm.ui.chatting.viewitems");
                C2012 c2014 = new C2012();
                c2014.m4021("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,quotedMsg is null!");
                c13311.f4794 = c2014;
                return c3554;
        }
        return Boolean.valueOf(zStartsWith);
    }
}
