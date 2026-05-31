package p000;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲁᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1493 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5289;

    public /* synthetic */ C1493(int i) {
        this.f5289 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        C1931 c1931M3093;
        Object c2643;
        int i = this.f5289;
        int i2 = 10;
        int i3 = 13;
        Class<View> cls = View.class;
        Class<Integer> cls2 = Integer.class;
        Class<ViewGroup> cls3 = ViewGroup.class;
        int i4 = 27;
        int i5 = 6;
        int i6 = 7;
        Object obj2 = null;
        int i7 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                return AbstractC2844.m4783("'", (String) obj, '\'');
            case 1:
                String[] strArr = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_group_owner_title, null, false);
                int i8 = R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor1;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor1);
                if (textInputEditText != null) {
                    i8 = R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor2;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor2);
                    if (textInputEditText2 != null) {
                        i8 = R.id.moduleDialogEdtGroupOwnerTitleAdminTextColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleAdminTextColor);
                        if (textInputEditText3 != null) {
                            i8 = R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor1;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor1);
                            if (textInputEditText4 != null) {
                                i8 = R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor2;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor2);
                                if (textInputEditText5 != null) {
                                    i8 = R.id.moduleDialogEdtGroupOwnerTitleCustomTextColor;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleCustomTextColor);
                                    if (textInputEditText6 != null) {
                                        i8 = R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor1;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor1);
                                        if (textInputEditText7 != null) {
                                            i8 = R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor2;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor2);
                                            if (textInputEditText8 != null) {
                                                i8 = R.id.moduleDialogEdtGroupOwnerTitleNormalTextColor;
                                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleNormalTextColor);
                                                if (textInputEditText9 != null) {
                                                    i8 = R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor1;
                                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor1);
                                                    if (textInputEditText10 != null) {
                                                        i8 = R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor2;
                                                        TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor2);
                                                        if (textInputEditText11 != null) {
                                                            i8 = R.id.moduleDialogEdtGroupOwnerTitleOwnerTextColor;
                                                            TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtGroupOwnerTitleOwnerTextColor);
                                                            if (textInputEditText12 != null) {
                                                                i8 = R.id.moduleDialogInputGroupOwnerTitleAdminBgColor1;
                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleAdminBgColor1)) != null) {
                                                                    i8 = R.id.moduleDialogInputGroupOwnerTitleAdminBgColor2;
                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleAdminBgColor2)) != null) {
                                                                        i8 = R.id.moduleDialogInputGroupOwnerTitleCustomBgColor1;
                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleCustomBgColor1)) != null) {
                                                                            i8 = R.id.moduleDialogInputGroupOwnerTitleCustomBgColor2;
                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleCustomBgColor2)) != null) {
                                                                                i8 = R.id.moduleDialogInputGroupOwnerTitleCustomTextColor;
                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleCustomTextColor)) != null) {
                                                                                    i8 = R.id.moduleDialogInputGroupOwnerTitleNormalBgColor1;
                                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleNormalBgColor1)) != null) {
                                                                                        i8 = R.id.moduleDialogInputGroupOwnerTitleNormalBgColor2;
                                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleNormalBgColor2)) != null) {
                                                                                            i8 = R.id.moduleDialogInputGroupOwnerTitleNormalTextColor;
                                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleNormalTextColor)) != null) {
                                                                                                i8 = R.id.moduleDialogInputGroupOwnerTitleOwnerAdminTextColor;
                                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleOwnerAdminTextColor)) != null) {
                                                                                                    i8 = R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor1;
                                                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor1)) != null) {
                                                                                                        i8 = R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor2;
                                                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor2)) != null) {
                                                                                                            i8 = R.id.moduleDialogInputGroupOwnerTitleOwnerTextColor;
                                                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputGroupOwnerTitleOwnerTextColor)) != null) {
                                                                                                                LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                                                                                C2051 c2051 = new C2051(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12);
                                                                                                                textInputEditText10.setText(C1509.f5325.m2666());
                                                                                                                textInputEditText11.setText(C1510.f5326.m2666());
                                                                                                                textInputEditText12.setText(C1511.f5327.m2666());
                                                                                                                textInputEditText.setText(C1500.f5316.m2666());
                                                                                                                textInputEditText2.setText(C1501.f5317.m2666());
                                                                                                                textInputEditText3.setText(C1502.f5318.m2666());
                                                                                                                textInputEditText4.setText(C1503.f5319.m2666());
                                                                                                                textInputEditText5.setText(C1504.f5320.m2666());
                                                                                                                textInputEditText6.setText(C1505.f5321.m2666());
                                                                                                                textInputEditText7.setText(C1506.f5322.m2666());
                                                                                                                textInputEditText8.setText(C1507.f5323.m2666());
                                                                                                                textInputEditText9.setText(C1508.f5324.m2666());
                                                                                                                C2037 c2037 = new C2037();
                                                                                                                C1512.f5328.getClass();
                                                                                                                c2037.f6779 = C1512.f5330;
                                                                                                                c2037.f6781 = linearLayout;
                                                                                                                c2037.m4057("保存", new C0114(c2051, 24));
                                                                                                                c2037.m4056("重置新款", new C1356(9));
                                                                                                                String str = "重置经典";
                                                                                                                C1356 c1356 = new C1356(10);
                                                                                                                c2037.f6785 = str;
                                                                                                                c2037.f6786 = c1356;
                                                                                                                c2037.f6787 = true;
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
            case 2:
                String[] strArr2 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_handle_group_member, null, false);
                int i9 = R.id.moduleDialogEdtHandleGroupMemberTipColor;
                TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtHandleGroupMemberTipColor);
                if (textInputEditText13 != null) {
                    i9 = R.id.moduleDialogEdtHandleGroupMemberTipLeft;
                    TextInputEditText textInputEditText14 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtHandleGroupMemberTipLeft);
                    if (textInputEditText14 != null) {
                        i9 = R.id.moduleDialogInputHandleGroupMemberTipColor;
                        if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputHandleGroupMemberTipColor)) != null) {
                            i9 = R.id.moduleDialogInputHandleGroupMemberTipLeft;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputHandleGroupMemberTipLeft)) != null) {
                                LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                                C2048 c2048 = new C2048(linearLayout2, textInputEditText13, textInputEditText14, 1);
                                textInputEditText13.setText(C1523.f5363.m2666());
                                textInputEditText14.setText(C1524.f5364.m2666());
                                C2037 c2038 = new C2037();
                                C1525.f5365.getClass();
                                c2038.f6779 = C1525.f5367;
                                c2038.f6781 = linearLayout2;
                                c2038.m4057("保存", new C0114(c2048, 25));
                                c2038.m4056("重置", new C1356(11));
                                C2037.m4053(c2038, null, 3);
                                c2038.m4055().m3985();
                                return c3554;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i9)));
            case 3:
                ((C1023) obj).f3740 = new C1493(5);
                return c3554;
            case 4:
                C1574 c1574 = (C1574) obj;
                String[] strArr3 = AbstractC1471.f5234;
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
                View view = (View) c2641;
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
                int i10 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(c2642).m3558();
                c1300M3558.f4724 = AbstractC2574.m4549(String.class);
                boolean z = false;
                for (Object obj3 : c1300M3558.m3117()) {
                    String str2 = (String) ((C1316) obj3).m3127();
                    if (str2 != null && str2.startsWith("weixin://")) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj2 = obj3;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                String str3 = (String) ((C1316) obj2).m3127();
                if (str3.startsWith("weixin://weixinhongbao/wauxv/chatroom_userinfo/") && (c1931M3093 = AbstractC1272.m3093(Pattern.compile("(\\d+)__([^/]+)$").matcher(str3), 0, str3)) != null) {
                    String str4 = (String) ((C1930) c1931M3093.m3883()).get(2);
                    Context context = view.getContext();
                    Intent intent = new Intent();
                    intent.setClassName(context, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                    intent.putExtra("Contact_User", str4);
                    context.startActivity(intent);
                    c1574.m3451();
                }
                return c3554;
            case 5:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                String[] strArr4 = AbstractC1471.f5234;
                c2012M4773.m4019("com.tencent.mm.app.plugin.URISpanHandlerSet$LuckyMoneyUriSpanHandler");
                c2012M4773.m4021("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                c1335.f4794 = c2012M4773;
                return c3554;
            case 6:
                C0702 c0702M4549 = AbstractC2574.m4549(ContextMenu.class);
                ConcurrentHashMap concurrentHashMap = AbstractC0705.f2692;
                return Boolean.valueOf(c0702M4549.mo2209().isAssignableFrom((Class) obj));
            case 7:
                String[] strArr5 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.MMPopupMenu", "is swiping, PASS tryShow");
                return c3554;
            case 8:
                String[] strArr6 = AbstractC1471.f5234;
                View viewM4624 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_hide_chat_item_menu, null, false);
                int i11 = R.id.moduleDialogEdtHideChatItemMenuSet;
                TextInputEditText textInputEditText15 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtHideChatItemMenuSet);
                if (textInputEditText15 != null) {
                    i11 = R.id.moduleDialogInputHideChatItemMenuSet;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputHideChatItemMenuSet)) != null) {
                        LinearLayout linearLayout3 = (LinearLayout) viewM4624;
                        C2041 c2041 = new C2041(linearLayout3, textInputEditText15, 5);
                        textInputEditText15.setText(AbstractC0739.m2295(C1548.f5408.m2665(), ",", null, null, null, 62));
                        C2037 c2039 = new C2037();
                        C1549.f5409.getClass();
                        c2039.f6779 = C1549.f5412;
                        c2039.f6781 = linearLayout3;
                        c2039.m4057("保存", new C0114(c2041, 26));
                        c2039.m4056("重置", new C1356(i3));
                        c2039.m4055().m3985();
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4624.getResources().getResourceName(i11)));
            case 9:
                ((C1023) obj).f3740 = new C1493(i2);
                return c3554;
            case 10:
                ((C1335) obj).m3155(new C1493(i6));
                return c3554;
            case 11:
                int i12 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772((C1574) obj);
                c1300M4772.f4725 = new C1493(i5);
                C1300 c1300M3559 = AbstractC2727.m4713((ContextMenu) ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3127()).m3558();
                c1300M3559.f4724 = AbstractC2574.m4549(List.class);
                ArrayList arrayList = (ArrayList) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (AbstractC0739.m2289(C1548.f5408.m2665(), ((MenuItem) obj4).getTitle())) {
                        arrayList2.add(obj4);
                    }
                }
                arrayList.removeAll(AbstractC0739.m2308(arrayList2));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C1493(15);
                c1023.f3740 = new C1493(16);
                return c3554;
            case 13:
                C2012 c2012 = (C2012) obj;
                Class<View> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4232 == null) {
                    clsM4232 = cls;
                }
                Class<Integer> clsM4774 = AbstractC2844.m4774(c2012, clsM4232, cls2);
                cls2 = clsM4774 != null ? clsM4774 : Integer.class;
                Class<View> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                cls = clsM4233 != null ? clsM4233 : View.class;
                Class<ViewGroup> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                c2012.m4017(cls2, cls, clsM4234 != null ? clsM4234 : ViewGroup.class);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C1493(18);
                c1024.f3740 = new C1493(19);
                return c3554;
            case 15:
                C1334 c1334 = (C1334) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.ui.conversation");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.ConversationWithCacheAdapter", "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d");
                c1334.f4791 = c0700;
                return c3554;
            case 16:
                ((C1335) obj).m3155(new C1493(i3));
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                Object objM3449 = ((C1574) obj).m3449();
                AbstractC3640.m5204((ViewGroup) (objM3449 instanceof ViewGroup ? objM3449 : null), new int[]{0, 1, 1}).setVisibility(8);
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1334) obj).m3153(new C1493(21));
                return c3554;
            case 19:
                ((C1335) obj).m3155(new C1493(22));
                return c3554;
            case 20:
                Object objM34410 = ((C1574) obj).m3449();
                AbstractC3640.m5204((ViewGroup) (objM34410 instanceof ViewGroup ? objM34410 : null), new int[]{0, 1, 1}).setVisibility(8);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr8 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ConversationAdapter.MvvmConversationAdapter", "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d");
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C2012 c2013 = (C2012) obj;
                Class<View> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4235 == null) {
                    clsM4235 = cls;
                }
                Class<Integer> clsM4775 = AbstractC2844.m4774(c2013, clsM4235, cls2);
                cls2 = clsM4775 != null ? clsM4775 : Integer.class;
                Class<View> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                cls = clsM4236 != null ? clsM4236 : View.class;
                Class<ViewGroup> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                c2013.m4017(cls2, cls, clsM4237 != null ? clsM4237 : ViewGroup.class);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2643 = c1575.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                Iterator c0067 = new C0067((ViewGroup) c2643, 7);
                ArrayList arrayList3 = new ArrayList();
                while (c0067.hasNext()) {
                    View view2 = (View) c0067.next();
                    ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    C0067 c0068 = viewGroup != null ? new C0067(viewGroup, 7) : null;
                    if (c0068 == null || !c0068.hasNext()) {
                        while (!c0067.hasNext() && !arrayList3.isEmpty()) {
                            c0067 = (Iterator) AbstractC0739.m2296(arrayList3);
                            AbstractC0745.m2319(arrayList3);
                        }
                    } else {
                        arrayList3.add(c0067);
                        c0067 = c0068;
                    }
                    if (view2 instanceof TextView) {
                        String[] strArr9 = AbstractC1471.f5234;
                        List listM2311 = AbstractC0740.m2311("微信号", "微信 ID", "Weixin ID", "WeChat ID");
                        if (!listM2311.isEmpty()) {
                            Iterator it = listM2311.iterator();
                            while (it.hasNext()) {
                                TextView textView = (TextView) view2;
                                if (AbstractC2901.m4861(textView.getText(), (String) it.next(), true)) {
                                    textView.setVisibility(4);
                                }
                                break;
                            }
                        }
                    }
                }
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr10 = AbstractC1471.f5234;
                View viewM4625 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_hide_msg_avatar_iv, null, false);
                int i13 = R.id.moduleDialogCbHideMsgAvatarIvHideLeft;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4625, R.id.moduleDialogCbHideMsgAvatarIvHideLeft);
                if (materialCheckBox != null) {
                    i13 = R.id.moduleDialogCbHideMsgAvatarIvHideRight;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4625, R.id.moduleDialogCbHideMsgAvatarIvHideRight);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout4 = (LinearLayout) viewM4625;
                        C2046 c2046 = new C2046(linearLayout4, materialCheckBox, materialCheckBox2, 2);
                        materialCheckBox.setChecked(C1554.f5426.m2660());
                        materialCheckBox2.setChecked(C1555.f5427.m2660());
                        C2037 c20310 = new C2037();
                        C1556.f5428.getClass();
                        c20310.f6779 = C1556.f5430;
                        c20310.f6781 = linearLayout4;
                        c20310.m4057("保存", new C0114(c2046, i4));
                        AbstractC2844.m4788(c20310, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4625.getResources().getResourceName(i13)));
            case Opcodes.ALOAD /* 25 */:
                ((C1023) obj).f3740 = new C1493(i4);
                return c3554;
            case 26:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                new C0383(i7, i5, c1576).m1714(8);
                return c3554;
            case 27:
                C1335 c1336 = (C1335) obj;
                String[] strArr11 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.ui.conversation.banner");
                C2012 c2014 = new C2012();
                c2014.m4021("com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility");
                c1336.f4794 = c2014;
                return c3554;
            case 28:
                ((C1023) obj).f3740 = new C1559(i7);
                return c3554;
            default:
                int i14 = AbstractC1768.f5906;
                C1300 c1300M4773 = AbstractC2844.m4772((C1574) obj);
                c1300M4773.f4724 = AbstractC2574.m4549(TextView.class);
                Iterator it2 = c1300M4773.m3117().iterator();
                while (it2.hasNext()) {
                    TextView textView2 = (TextView) ((C1316) it2.next()).m3127();
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                }
                return c3554;
        }
    }
}
