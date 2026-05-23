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
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲁᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2316 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7447;

    public /* synthetic */ C2316(int i) {
        this.f7447 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2585;
        Object c2586;
        int i = this.f7447;
        Class<CharSequence> cls = CharSequence.class;
        Class<String> cls2 = String.class;
        int i2 = 4;
        int i3 = 2;
        int i4 = 3;
        int i5 = 1;
        int i6 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                ((C1333) obj).m3052(new C2316(i5));
                return c3497;
            case 1:
                C1981 c1981 = (C1981) obj;
                c1981.m3827("data");
                C2316 c2316 = new C2316(i4);
                C1984 c1984 = new C1984(4);
                c2316.invoke(c1984);
                c1981.f6564 = c1984;
                return c3497;
            case 2:
                C1981 c1982 = (C1981) obj;
                String[] strArr = AbstractC1574.f5469;
                Class clsM3988 = AbstractC2201.m3988("com.tencent.mm.api.IEmojiInfo");
                Class<Integer> cls3 = Integer.class;
                Class<Integer> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                if (clsM2183 == null) {
                    clsM2183 = cls3;
                }
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                cls2 = clsM2184 != null ? clsM2184 : String.class;
                Class<Integer> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                c1982.m3823(clsM3988, clsM2183, cls2, clsM2185 != null ? clsM2185 : Integer.class);
                c1982.m3827("emojiInfo", "sosDocId");
                return c3497;
            case 3:
                ((C1984) obj).m3849(new C2316(i2));
                return c3497;
            case 4:
                ((C1981) obj).m3827("checkScrollToPosition: ");
                return c3497;
            case 5:
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_panel_emoji, null, false);
                int i7 = R.id.moduleDialogBtnPanelEmojiClearGroup;
                MaterialButton materialButton = (MaterialButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogBtnPanelEmojiClearGroup);
                if (materialButton != null) {
                    i7 = R.id.moduleDialogBtnPanelEmojiCopyPath;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogBtnPanelEmojiCopyPath);
                    if (materialButton2 != null) {
                        materialButton2.setOnClickListener(new ViewOnClickListenerC2317(i6));
                        materialButton.setOnClickListener(new ViewOnClickListenerC2317(i5));
                        C2007 c2007 = new C2007();
                        C2321.f7452.getClass();
                        c2007.f6678 = C2321.f7455;
                        c2007.f6680 = (LinearLayout) viewM4676;
                        C2007.m3867(c2007, null, 3);
                        AbstractC2784.m4755(c2007, null, 3);
                        return c3497;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i7)));
            case 6:
                ((C1020) obj).f3733 = new C2193(28);
                return c3497;
            case 7:
                ((C1020) obj).f3733 = new C2193(29);
                return c3497;
            case 8:
                ((C1020) obj).f3732 = new C2316(9);
                return c3497;
            case 9:
                ((C1332) obj).m3050(new C2316(10));
                return c3497;
            case 10:
                String[] strArr2 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.PatMsgExtension", "insert pat msg %d %s %s");
                return c3497;
            case 11:
                String[] strArr3 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_placed_sort_pro, null, false);
                int i8 = R.id.moduleDialogCbPlacedSortProShowBottom;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4677, R.id.moduleDialogCbPlacedSortProShowBottom);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbPlacedSortProShowReset;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4677, R.id.moduleDialogCbPlacedSortProShowReset);
                    if (materialCheckBox2 != null) {
                        i8 = R.id.moduleDialogCbPlacedSortProShowTop;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC3681.m5325(viewM4677, R.id.moduleDialogCbPlacedSortProShowTop);
                        if (materialCheckBox3 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM4677;
                            C2013 c2013 = new C2013(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3);
                            materialCheckBox3.setChecked(C2348.f7540.m2536());
                            materialCheckBox2.setChecked(C2347.f7539.m2536());
                            materialCheckBox.setChecked(C2346.f7538.m2536());
                            C2007 c2008 = new C2007();
                            C2349.f7541.getClass();
                            c2008.f6678 = C2349.f7543;
                            c2008.f6680 = linearLayout;
                            c2008.m3870("保存", new C2042(8, c2013));
                            AbstractC2784.m4755(c2008, null, 3);
                            return c3497;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i8)));
            case Opcodes.FCONST_1 /* 12 */:
                ConversationBean conversationBean = (ConversationBean) obj;
                C0847 c0847 = C0847.f3254;
                ContentValues contentValues = new ContentValues();
                contentValues.put("flag", Long.valueOf(C1133.m2710(conversationBean.getFlag(), C0848.f3260)));
                C0860.m2382(C0860.f3275, c0847.m2380(contentValues), conversationBean.getUsername());
                return c3497;
            case 13:
                ConversationBean conversationBean2 = (ConversationBean) obj;
                C0847 c0848 = C0847.f3254;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("flag", Long.valueOf(C1133.m2710(conversationBean2.getFlag(), C0848.f3258)));
                C0860.m2382(C0860.f3275, c0848.m2380(contentValues2), conversationBean2.getUsername());
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                ConversationBean conversationBean3 = (ConversationBean) obj;
                C0847 c0849 = C0847.f3254;
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("flag", Long.valueOf(conversationBean3.getConversationTime()));
                C0860.m2382(C0860.f3275, c0849.m2380(contentValues3), conversationBean3.getUsername());
                return c3497;
            case 15:
                ConversationBean conversationBean4 = (ConversationBean) obj;
                C0847 c08410 = C0847.f3254;
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("flag", Long.valueOf(C1133.m2710(conversationBean4.getFlag(), C0848.f3259)));
                C0860.m2382(C0860.f3275, c08410.m2380(contentValues4), conversationBean4.getUsername());
                return c3497;
            case 16:
                ConversationBean conversationBean5 = (ConversationBean) obj;
                C0847 c08411 = C0847.f3254;
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put("flag", Long.valueOf(C1133.m2710(conversationBean5.getFlag(), C0848.f3257)));
                C0860.m2382(C0860.f3275, c08411.m2380(contentValues5), conversationBean5.getUsername());
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                ((C1020) obj).f3733 = new C2316(19);
                return c3497;
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
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Integer num = (Integer) c2585;
                int iIntValue = num != null ? num.intValue() : 0;
                int i9 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(c1563.m3268()).m3492();
                String[] strArr4 = AbstractC1574.f5469;
                c1973M3492.f6370 = "getItem";
                ConversationBean conversationBean6 = new ConversationBean(((C1982) AbstractC2784.m4742(c1973M3492)).m3831(Integer.valueOf(iIntValue)));
                Object objM3269 = c1563.m3269();
                View childAt = ((ViewGroup) (objM3269 instanceof ViewGroup ? objM3269 : null)).getChildAt(0);
                long flag = conversationBean6.getFlag();
                if (6917529027641081856L <= flag && flag < 8070450532247928833L) {
                    childAt.setBackgroundColor(Color.parseColor(MagicFactory.get(AbstractC3681.m5331(childAt.getContext()) ? -568284302801588L : -568327252474548L, strArr4)));
                } else if (-6917529027641081856L > flag || flag >= -5764607523034234879L) {
                    childAt.setBackgroundColor(0);
                } else {
                    childAt.setBackgroundColor(Color.parseColor(MagicFactory.get(AbstractC3681.m5331(childAt.getContext()) ? -568370202147508L : -568413151820468L, strArr4)));
                }
                return c3497;
            case 19:
                C1333 c1333 = (C1333) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.ui.conversation");
                C1981 c1983 = new C1981(4);
                c1983.m3827("MicroMsg.ConversationWithCacheAdapter", "handle show tip count, but talker is null");
                c1333.f4794 = c1983;
                return c3497;
            case 20:
                View view = (View) obj;
                View viewM4678 = AbstractC2668.m4676(view, R.layout.module_dialog_plugin, null, false);
                int i10 = R.id.moduleDialogBtnPluginCopyPath;
                MaterialButton materialButton3 = (MaterialButton) AbstractC3681.m5325(viewM4678, R.id.moduleDialogBtnPluginCopyPath);
                if (materialButton3 != null) {
                    i10 = R.id.moduleDialogBtnPluginOpenDemo;
                    MaterialButton materialButton4 = (MaterialButton) AbstractC3681.m5325(viewM4678, R.id.moduleDialogBtnPluginOpenDemo);
                    if (materialButton4 != null) {
                        materialButton3.setOnClickListener(new ViewOnClickListenerC2317(i3));
                        materialButton4.setOnClickListener(new ViewOnClickListenerC1836(view, i5));
                        C2007 c2009 = new C2007();
                        C2361.f7579.getClass();
                        c2009.f6678 = C2361.f7581;
                        c2009.f6680 = (LinearLayout) viewM4678;
                        C2007.m3867(c2009, null, 3);
                        AbstractC2784.m4755(c2009, null, 3);
                        return c3497;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4678.getResources().getResourceName(i10)));
            case Opcodes.ILOAD /* 21 */:
                ((C1020) obj).f3733 = new C2316(27);
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1020) obj).f3733 = new C2316(24);
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                C1020 c1020 = (C1020) obj;
                c1020.f3733 = new C2316(25);
                c1020.f3734 = new C2316(26);
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1334);
                c1981M4739.m3820(C2391.f7652.m4369());
                Class<CharSequence> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1981M4739.m3823(clsM2186 != null ? clsM2186 : CharSequence.class);
                c1981M4739.m3828(0);
                c1334.f4794 = c1981M4739;
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                C1333 c1335 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1335);
                c1981M47310.m3820(C2391.f7652.m4369());
                Class<CharSequence> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1981M47310.m3823(clsM2187 != null ? clsM2187 : CharSequence.class);
                c1335.f4794 = c1981M47310;
                return c3497;
            case 26:
                return Boolean.valueOf(!AbstractC2207.m4087(((C1974) obj).f6546, C2389.f7651.m2594()));
            case 27:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1336);
                c1981M47311.m3820(C2391.f7652.m4369());
                Class<String> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                c1981M47311.m3823(clsM2188 != null ? clsM2188 : String.class);
                c1981M47311.m3827("Preference does not have a key assigned.");
                c1336.f4794 = c1981M47311;
                return c3497;
            case 28:
                ((C1020) obj).f3733 = new C2444(i6);
                return c3497;
            default:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[2];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                KeyEvent keyEvent = (KeyEvent) (c2586 instanceof C2585 ? null : c2586);
                if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0) {
                    int i11 = AbstractC1745.f5844;
                    C1299 c1299M4738 = AbstractC2784.m4738(c1564);
                    c1299M4738.f4726 = new C2444(i3);
                    C1299 c1299M3490 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M4738.m3014())).m3023()).m3490();
                    c1299M3490.f4725 = C0607.f2431.m2028();
                    FrameLayout frameLayout = (FrameLayout) ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3024();
                    C1973 c1973M3493 = AbstractC0968.m2484(frameLayout).m3492();
                    String[] strArr6 = AbstractC1574.f5469;
                    c1973M3493.f6370 = "getLastText";
                    String str = (String) ((C1982) AbstractC0744.m2191(c1973M3493.m3799())).m3832(new Object[0]);
                    C1973 c1973M3494 = AbstractC0968.m2484(frameLayout).m3492();
                    c1973M3494.f6370 = "getLastQuoteMsgId";
                    long jLongValue = ((Number) ((C1982) AbstractC0744.m2191(c1973M3494.m3799())).m3832(new Object[0])).longValue();
                    if (str.length() == 0 && jLongValue != 0) {
                        AbstractC1574.m3315(C0606.f2430).invoke(frameLayout, Boolean.FALSE, Boolean.TRUE);
                    }
                }
                return c3497;
        }
    }
}
