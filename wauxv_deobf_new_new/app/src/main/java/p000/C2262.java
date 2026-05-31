package p000;

import android.content.ContentValues;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2262 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7348;

    public /* synthetic */ C2262(int i) {
        this.f7348 = i;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x02b1  */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        boolean zIsInterface;
        Object c2642;
        C2352 c2352;
        int i = this.f7348;
        int i2 = 8;
        int i3 = 7;
        int i4 = 2;
        int i5 = 10;
        Class<Integer> cls = Integer.class;
        int i6 = 3;
        int i7 = 1;
        Object obj2 = null;
        int i8 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.booter.notification");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s");
                c1335.f4794 = c2012;
                return c3554;
            case 1:
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
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(c2641);
                for (Object obj3 : C2264.f7351) {
                    try {
                        if (((C0194) obj3).mo3445() && msgInfoBean.isNotifyAll() && C0193.f1310.m2665().contains(msgInfoBean.getTalker())) {
                            c1574.m3452(null);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr2 = AbstractC1471.f5234;
                        sb.append("onHandleMsg ");
                        sb.append(obj3 instanceof AbstractC2927 ? ((AbstractC2927) obj3).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 2:
                ((C1023) obj).f3740 = new C2262(i6);
                return c3554;
            case 3:
                C1335 c1336 = (C1335) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.pluginsdk.ui.chat");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.ChatFooter", "send msg onClick");
                c1336.f4794 = c2013;
                return c3554;
            case 4:
                C1574 c1575 = (C1574) obj;
                String[] strArr4 = AbstractC1471.f5234;
                int i9 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772(c1575);
                c1300M4772.f4724 = C0588.f2397.m2123();
                C1300 c1300M3558 = AbstractC2727.m4713((FrameLayout) ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3127()).m3558();
                c1300M3558.f4725 = new C2262(5);
                Object obj4 = null;
                boolean z = false;
                for (Object obj5 : c1300M3558.m3117()) {
                    Object objM3126 = ((C1316) obj5).m3126();
                    if (AbstractC1469.m3322(objM3126 != null ? objM3126.getClass().getSimpleName() : null, "MMFlexEditText")) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj4 = obj5;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                FrameLayout frameLayout = (FrameLayout) ((C1316) obj4).m3127();
                int i10 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(frameLayout).m3560();
                c2004M3560.f6475 = "getText";
                String string = ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4026(new Object[0]).toString();
                if (string.length() > 0) {
                    ArrayList arrayListM4354 = AbstractC2419.m4354();
                    ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(arrayListM4354, 10));
                    Iterator it = arrayListM4354.iterator();
                    while (it.hasNext()) {
                        C2426 c2426M4355 = AbstractC2419.m4355((C2400) it.next());
                        arrayList2.add(Boolean.valueOf(c2426M4355 != null && AbstractC1469.m3322(c2426M4355.m4360("onClickSendBtn", string), Boolean.TRUE)));
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (((Boolean) it2.next()).booleanValue()) {
                                int i11 = AbstractC1768.f5906;
                                C2004 c2004M3561 = AbstractC2727.m4713(frameLayout).m3560();
                                c2004M3561.f6475 = "setText";
                                ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4025("");
                                c1575.m3452(null);
                            }
                        }
                    }
                }
                return c3554;
            case 5:
                zIsInterface = ((Class) obj).isInterface();
                break;
            case 6:
                ((C1023) obj).f3740 = new C2262(i2);
                return c3554;
            case 7:
                C1574 c1576 = (C1574) obj;
                int i12 = AbstractC1768.f5906;
                C2004 c2004M3562 = AbstractC2727.m4713(c1576.m3448()).m3560();
                c2004M3562.f6648 = AbstractC2574.m4549(Integer.TYPE);
                int iIntValue = ((Number) ((C2013) AbstractC2844.m4776(c2004M3562)).m4026(new Object[0])).intValue();
                Object objM3449 = c1576.m3449();
                String[] strArr5 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.ByteArray";
                byte[] bArr = (byte[]) objM3449;
                for (Object obj6 : C2327.f7512) {
                    try {
                        ((C0723) obj6).m2249(c1576, iIntValue, bArr);
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onGetBuffer ");
                        sb2.append(obj6 instanceof AbstractC2927 ? ((AbstractC2927) obj6).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case 8:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1337);
                Class<byte[]> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(byte[].class));
                c2012M4773.m4018(clsM4232 != null ? clsM4232 : byte[].class);
                String[] strArr6 = AbstractC1471.f5234;
                c2012M4773.m4021("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: ");
                c1337.f4794 = c2012M4773;
                return c3554;
            case 9:
                String[] strArr7 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_open_info, null, false);
                int i13 = R.id.moduleDialogEdtOpenInfoId;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtOpenInfoId);
                if (textInputEditText != null) {
                    i13 = R.id.moduleDialogInputOpenInfoId;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputOpenInfoId)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                        C2041 c2041 = new C2041(linearLayout, textInputEditText, i3);
                        C2037 c2037 = new C2037();
                        C2331.f7527.getClass();
                        c2037.f6779 = C2331.f7529;
                        c2037.f6781 = linearLayout;
                        c2037.m4057("确定", new C2070(c2041, i2));
                        AbstractC2844.m4788(c2037, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i13)));
            case 10:
                Class cls2 = (Class) obj;
                Class<Boolean> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                zIsInterface = !AbstractC1469.m3322(cls2, clsM4233 != null ? clsM4233 : Boolean.class);
                break;
            case 11:
                ((C1023) obj).f3740 = new C2262(18);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3740 = new C2262(20);
                return c3554;
            case 13:
                ((C1023) obj).f3740 = new C2262(21);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C2053 c2053 = (C2053) obj;
                C2361.f7587.getClass();
                ArrayList arrayList4 = new ArrayList(C2361.m4306());
                C0713 c0713 = new C0713(arrayList4, new C2349(arrayList4, i8));
                RecyclerView recyclerView = c2053.f6895;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(c0713);
                recyclerView.setItemAnimator(null);
                new C1700(new C0602(c0713, arrayList4, new C2349(arrayList4, 1), i4)).m3579(c2053.f6895);
                return c3554;
            case 15:
                C1730 c1730 = (C1730) obj;
                c1730.f5853 = true;
                c1730.f5852 = true;
                return c3554;
            case 16:
                String[] strArr8 = AbstractC1471.f5234;
                Object objM34410 = ((C1574) obj).m3449();
                if ((objM34410 instanceof List) && (!(objM34410 instanceof InterfaceC1761) || (objM34410 instanceof InterfaceC1762))) {
                    obj2 = objM34410;
                }
                List list = (List) obj2;
                Iterator it3 = new C2645(C2361.f7590).iterator();
                while (true) {
                    ListIterator listIterator = ((C2644) it3).f8347;
                    if (!listIterator.hasPrevious()) {
                        return c3554;
                    }
                    C2352 c2353 = (C2352) listIterator.previous();
                    ContentValues contentValues = new ContentValues();
                    int i14 = i7;
                    contentValues.put("packGrayIconUrl", "https://avatars.githubusercontent.com/u/49312623");
                    contentValues.put("packIconUrl", "https://avatars.githubusercontent.com/u/49312623");
                    contentValues.put("packName", c2353.f7573.f7582);
                    contentValues.put("packStatus", Integer.valueOf(i14));
                    contentValues.put("productID", "wauxv.panel.emoji." + c2353.f7573.f7581);
                    contentValues.put("status", (Integer) 7);
                    contentValues.put("sync", (Integer) 2);
                    Object objM2224 = AbstractC0705.m2224(AbstractC0972.m2606("com.tencent.mm.storage.emotion.EmojiGroupInfo"), new Object[0]);
                    int i15 = AbstractC1768.f5906;
                    C2004 c2004M3563 = AbstractC2727.m4713(objM2224).m3560();
                    c2004M3563.f6475 = "convertFrom";
                    c2004M3563.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(ContentValues.class), AbstractC2574.m4549(Boolean.TYPE)}, 2));
                    c2004M3563.m3926();
                    ((C2013) AbstractC0739.m2290(c2004M3563.m3993())).m4025(contentValues, Boolean.TRUE);
                    list = list;
                    list.add(0, objM2224);
                    i7 = i14;
                }
                break;
            case Opcodes.SIPUSH /* 17 */:
                C1574 c1577 = (C1574) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1577.getClass();
                try {
                    c2642 = c1577.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                int i16 = AbstractC1768.f5906;
                C1681 c1681M4713 = AbstractC2727.m4713(c2642);
                C2004 c2004M3564 = c1681M4713.m3560();
                c2004M3564.m3994(EnumC2030.FINAL);
                c2004M3564.f6649 = new C2262(i5);
                C1300 c1300M3559 = AbstractC2727.m4713(((C2013) AbstractC2844.m4776(c2004M3564)).m4025(new Object[0])).m3558();
                c1300M3559.f4724 = AbstractC0972.m2606("com.tencent.mm.storage.emotion.EmojiGroupInfo");
                C1300 c1300M35510 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3126()).m3558();
                c1300M35510.f6475 = "field_productID";
                String str = (String) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
                for (Object obj7 : C2361.f7590) {
                    if (AbstractC1469.m3322("wauxv.panel.emoji." + ((C2352) obj7).f7573.f7581, str)) {
                        obj2 = obj7;
                        c2352 = (C2352) obj2;
                        if (c2352 != null) {
                            C2004 c2004M3565 = c1681M4713.m3560();
                            c2004M3565.f6648 = AbstractC2574.m4549(List.class);
                            ((List) ((C2013) AbstractC2844.m4776(c2004M3565)).m4026(new Object[0])).addAll(c2352.f7574);
                        }
                        return c3554;
                    }
                }
                c2352 = (C2352) obj2;
                if (c2352 != null) {
                    C2004 c2004M3566 = c1681M4713.m3560();
                    c2004M3566.f6648 = AbstractC2574.m4549(List.class);
                    ((List) ((C2013) AbstractC2844.m4776(c2004M3566)).m4026(new Object[0])).addAll(c2352.f7574);
                }
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1335) obj).m3155(new C2262(22));
                return c3554;
            case 19:
                C2012 c2014 = (C2012) obj;
                c2014.m4021("data");
                C2262 c2262 = new C2262(23);
                C2015 c2015 = new C2015();
                c2262.invoke(c2015);
                c2014.f6669 = c2015;
                return c3554;
            case 20:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1338);
                Class<ArrayList> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(ArrayList.class));
                Class<Integer> clsM4774 = AbstractC2844.m4774(c2012M4774, clsM4234 != null ? clsM4234 : ArrayList.class, cls);
                c2012M4774.m4017(clsM4774 != null ? clsM4774 : Integer.class);
                String[] strArr10 = AbstractC1471.f5234;
                c2012M4774.m4021("MicroMsg.emoji.EmojiGroupInfoStorage", "get Panel EmojiGroupInfo.");
                c1338.f4794 = c2012M4774;
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1335) obj).m3155(new C2262(19));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C2012 c2016 = (C2012) obj;
                String[] strArr11 = AbstractC1471.f5234;
                Class clsM2606 = AbstractC0972.m2606("com.tencent.mm.api.IEmojiInfo");
                Class<Integer> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4235 == null) {
                    clsM4235 = cls;
                }
                Class<String> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls3 = clsM4236 != null ? clsM4236 : String.class;
                Class<Integer> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                c2016.m4017(clsM2606, clsM4235, cls3, clsM4237 != null ? clsM4237 : Integer.class);
                c2016.m4021("emojiInfo", "sosDocId");
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C2015) obj).m4043(new C2262(24));
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C2012) obj).m4021("checkScrollToPosition: ");
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_panel_emoji, null, false);
                int i17 = R.id.moduleDialogBtnPanelEmojiClearGroup;
                MaterialButton materialButton = (MaterialButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogBtnPanelEmojiClearGroup);
                if (materialButton != null) {
                    i17 = R.id.moduleDialogBtnPanelEmojiCopyPath;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogBtnPanelEmojiCopyPath);
                    if (materialButton2 != null) {
                        materialButton2.setOnClickListener(new ViewOnClickListenerC2350(i8));
                        materialButton.setOnClickListener(new ViewOnClickListenerC2350(i7));
                        C2037 c2038 = new C2037();
                        C2361.f7587.getClass();
                        c2038.f6779 = C2361.f7592;
                        c2038.f6781 = (LinearLayout) viewM4623;
                        C2037.m4054(c2038, null, 3);
                        AbstractC2844.m4788(c2038, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i17)));
            case 26:
                C2136 c2136 = new C2136(((View) obj).getContext(), C2360.f7586);
                C2361.f7587.getClass();
                c2136.f7061 = C2361.f7592;
                c2136.f7062 = new C2262(14);
                c2136.m4094().m2556();
                return c3554;
            case 27:
                ((C1023) obj).f3739 = new C2262(28);
                return c3554;
            case 28:
                ((C1334) obj).m3153(new C2262(29));
                return c3554;
            default:
                String[] strArr12 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.PatMsgExtension", "insert pat msg %d %s %s");
                return c3554;
        }
        return Boolean.valueOf(zIsInterface);
    }
}
