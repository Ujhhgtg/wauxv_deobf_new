package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.data.bean.ContactLabelBean;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱᛲ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3472Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10796Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10797Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10798Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10799Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3472Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3, int i) {
        this.f10796Ujhhgtgfeyxiexzf = i;
        this.f10797Ujhhgtgfeyxiexzf = obj;
        this.f10798Ujhhgtgfeyxiexzf = obj2;
        this.f10799Ujhhgtgfeyxiexzf = obj3;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg;
        C0544Ujhhgtgfeyxiexzf c0544Ujhhgtgfeyxiexzf;
        C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf;
        InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg;
        ArrayList<C1381feyxiexzfUjhhgtg> arrayList;
        switch (this.f10796Ujhhgtgfeyxiexzf) {
            case 0:
                C0310Ujhhgtgfeyxiexzf c0310Ujhhgtgfeyxiexzf = (C0310Ujhhgtgfeyxiexzf) this.f10797Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = (ArrayList) this.f10798Ujhhgtgfeyxiexzf;
                C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg = (C0976feyxiexzfUjhhgtg) this.f10799Ujhhgtgfeyxiexzf;
                C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf = (C3485Ujhhgtgfeyxiexzf) obj;
                C3613Ujhhgtgfeyxiexzf c3613Ujhhgtgfeyxiexzf = C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf;
                Context context = c0310Ujhhgtgfeyxiexzf.f1849Ujhhgtgfeyxiexzf.getContext();
                Object obj2 = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                if (obj2 == null) {
                    "adapter";
                    c3476feyxiexzfUjhhgtg = null;
                } else {
                    c3476feyxiexzfUjhhgtg = (C3476feyxiexzfUjhhgtg) obj2;
                }
                c3613Ujhhgtgfeyxiexzf.getClass();
                C3613Ujhhgtgfeyxiexzf.m5254feyxiexzfUjhhgtg(context, c3485Ujhhgtgfeyxiexzf, arrayList2, c3476feyxiexzfUjhhgtg);
                break;
            case 1:
                C0544Ujhhgtgfeyxiexzf c0544Ujhhgtgfeyxiexzf2 = (C0544Ujhhgtgfeyxiexzf) this.f10797Ujhhgtgfeyxiexzf;
                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf2 = (C0627Ujhhgtgfeyxiexzf) this.f10798Ujhhgtgfeyxiexzf;
                InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg2 = (InterfaceC3545feyxiexzfUjhhgtg) this.f10799Ujhhgtgfeyxiexzf;
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = "搜索好友/群聊/公众号";
                Set setM3654feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3654feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf2.f2661Ujhhgtgfeyxiexzf);
                c0544Ujhhgtgfeyxiexzf2.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                List listM5361feyxiexzfUjhhgtg = C3673feyxiexzfUjhhgtg.m5361feyxiexzfUjhhgtg();
                ArrayList arrayList7 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM5361feyxiexzfUjhhgtg, 10));
                Iterator it = listM5361feyxiexzfUjhhgtg.iterator();
                while (it.hasNext()) {
                    arrayList7.add(new ContactLabelBean(it.next()));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Iterator it2 = arrayList7.iterator(); it2.hasNext(); it2 = it2) {
                    ContactLabelBean contactLabelBean = (ContactLabelBean) it2.next();
                    String strValueOf = String.valueOf(contactLabelBean.getId());
                    C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                    List listM4253feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(AbstractC2856feyxiexzfUjhhgtg.m4255Ujhhgtgfeyxiexzf(C3673feyxiexzfUjhhgtg.m5362feyxiexzfUjhhgtg(strValueOf)));
                    C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = listM4253feyxiexzfUjhhgtg.isEmpty() ? null : new C1381feyxiexzfUjhhgtg(contactLabelBean.getName(), listM4253feyxiexzfUjhhgtg);
                    if (c1381feyxiexzfUjhhgtg != null) {
                        arrayList8.add(c1381feyxiexzfUjhhgtg);
                    }
                }
                Cursor cursorM5194feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11711Ujhhgtgfeyxiexzf, EnumC3684feyxiexzfUjhhgtg.f11712Ujhhgtgfeyxiexzf, EnumC3684feyxiexzfUjhhgtg.f11713Ujhhgtgfeyxiexzf});
                if (cursorM5194feyxiexzfUjhhgtg != null) {
                    while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
                        try {
                            String string = cursorM5194feyxiexzfUjhhgtg.getString(cursorM5194feyxiexzfUjhhgtg.getColumnIndex("username"));
                            C0544Ujhhgtgfeyxiexzf c0544Ujhhgtgfeyxiexzf3 = c0544Ujhhgtgfeyxiexzf2;
                            boolean z = (cursorM5194feyxiexzfUjhhgtg.getInt(cursorM5194feyxiexzfUjhhgtg.getColumnIndex("verifyFlag")) & 8) != 0;
                            if (string.endsWith("@chatroom")) {
                                GroupInfo groupInfoM1316Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1316Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String roomId = groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId();
                                StringBuilder sb = new StringBuilder();
                                String name = groupInfoM1316Ujhhgtgfeyxiexzf.getName();
                                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(name)) {
                                    name = groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId();
                                }
                                sb.append(name);
                                if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(groupInfoM1316Ujhhgtgfeyxiexzf.getRemark())) {
                                    sb.append('(' + groupInfoM1316Ujhhgtgfeyxiexzf.getRemark() + ')');
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append('(');
                                sb2.append(groupInfoM1316Ujhhgtgfeyxiexzf.getGroupData().getMemberCount());
                                sb2.append(')');
                                sb.append(sb2.toString());
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = new C3663feyxiexzfUjhhgtg(roomId, sb.toString(), groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId(), setM3654feyxiexzfUjhhgtg.contains(groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId()));
                                arrayList3.add(c3663feyxiexzfUjhhgtg);
                                arrayList5.add(c3663feyxiexzfUjhhgtg);
                                linkedHashMap.put(roomId, c3663feyxiexzfUjhhgtg);
                                c0544Ujhhgtgfeyxiexzf2 = c0544Ujhhgtgfeyxiexzf3;
                                arrayList8 = arrayList8;
                            } else {
                                ArrayList arrayList9 = arrayList8;
                                if (z) {
                                    FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                    String wxid = friendInfoM1315Ujhhgtgfeyxiexzf.getWxid();
                                    StringBuilder sb3 = new StringBuilder();
                                    String nickname = friendInfoM1315Ujhhgtgfeyxiexzf.getNickname();
                                    if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(nickname)) {
                                        nickname = friendInfoM1315Ujhhgtgfeyxiexzf.getWxid();
                                    }
                                    if (nickname.length() > 24) {
                                        nickname = AbstractC1152feyxiexzfUjhhgtg.m2643feyxiexzfUjhhgtg(24, nickname) + "...";
                                    }
                                    sb3.append(nickname);
                                    if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(friendInfoM1315Ujhhgtgfeyxiexzf.getRemark())) {
                                        sb3.append('(' + friendInfoM1315Ujhhgtgfeyxiexzf.getRemark() + ')');
                                    }
                                    C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg2 = new C3663feyxiexzfUjhhgtg(wxid, sb3.toString(), friendInfoM1315Ujhhgtgfeyxiexzf.getWxid(), setM3654feyxiexzfUjhhgtg.contains(friendInfoM1315Ujhhgtgfeyxiexzf.getWxid()));
                                    arrayList3.add(c3663feyxiexzfUjhhgtg2);
                                    arrayList6.add(c3663feyxiexzfUjhhgtg2);
                                    linkedHashMap.put(wxid, c3663feyxiexzfUjhhgtg2);
                                } else {
                                    c0627Ujhhgtgfeyxiexzf2 = c0627Ujhhgtgfeyxiexzf2;
                                    interfaceC3545feyxiexzfUjhhgtg2 = interfaceC3545feyxiexzfUjhhgtg2;
                                    FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf2 = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                    String wxid2 = friendInfoM1315Ujhhgtgfeyxiexzf2.getWxid();
                                    StringBuilder sb4 = new StringBuilder();
                                    String nickname2 = friendInfoM1315Ujhhgtgfeyxiexzf2.getNickname();
                                    if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(nickname2)) {
                                        nickname2 = friendInfoM1315Ujhhgtgfeyxiexzf2.getWxid();
                                    }
                                    if (nickname2.length() > 24) {
                                        nickname2 = AbstractC1152feyxiexzfUjhhgtg.m2643feyxiexzfUjhhgtg(24, nickname2) + "...";
                                    }
                                    sb4.append(nickname2);
                                    if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(friendInfoM1315Ujhhgtgfeyxiexzf2.getRemark())) {
                                        sb4.append('(' + friendInfoM1315Ujhhgtgfeyxiexzf2.getRemark() + ')');
                                    }
                                    C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg3 = new C3663feyxiexzfUjhhgtg(wxid2, sb4.toString(), friendInfoM1315Ujhhgtgfeyxiexzf2.getWxid(), setM3654feyxiexzfUjhhgtg.contains(friendInfoM1315Ujhhgtgfeyxiexzf2.getWxid()));
                                    arrayList3.add(c3663feyxiexzfUjhhgtg3);
                                    arrayList4.add(c3663feyxiexzfUjhhgtg3);
                                    linkedHashMap.put(wxid2, c3663feyxiexzfUjhhgtg3);
                                }
                                c0544Ujhhgtgfeyxiexzf2 = c0544Ujhhgtgfeyxiexzf3;
                                arrayList8 = arrayList9;
                                c0627Ujhhgtgfeyxiexzf2 = c0627Ujhhgtgfeyxiexzf2;
                                interfaceC3545feyxiexzfUjhhgtg2 = interfaceC3545feyxiexzfUjhhgtg2;
                            }
                            break;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg, th);
                                throw th2;
                            }
                        }
                    }
                    c0544Ujhhgtgfeyxiexzf = c0544Ujhhgtgfeyxiexzf2;
                    c0627Ujhhgtgfeyxiexzf = c0627Ujhhgtgfeyxiexzf2;
                    interfaceC3545feyxiexzfUjhhgtg = interfaceC3545feyxiexzfUjhhgtg2;
                    arrayList = arrayList8;
                    cursorM5194feyxiexzfUjhhgtg.close();
                } else {
                    c0544Ujhhgtgfeyxiexzf = c0544Ujhhgtgfeyxiexzf2;
                    c0627Ujhhgtgfeyxiexzf = c0627Ujhhgtgfeyxiexzf2;
                    interfaceC3545feyxiexzfUjhhgtg = interfaceC3545feyxiexzfUjhhgtg2;
                    arrayList = arrayList8;
                }
                ArrayList<C0543Ujhhgtgfeyxiexzf> arrayList10 = new ArrayList();
                for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg2 : arrayList) {
                    String str = (String) c1381feyxiexzfUjhhgtg2.f4874Ujhhgtgfeyxiexzf;
                    List list = (List) c1381feyxiexzfUjhhgtg2.f4875Ujhhgtgfeyxiexzf;
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg4 = (C3663feyxiexzfUjhhgtg) linkedHashMap.get((String) it3.next());
                        if (c3663feyxiexzfUjhhgtg4 != null) {
                            arrayList11.add(c3663feyxiexzfUjhhgtg4);
                        }
                    }
                    C0543Ujhhgtgfeyxiexzf c0543Ujhhgtgfeyxiexzf = arrayList11.isEmpty() ? null : new C0543Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), "标签:", str), arrayList11);
                    if (c0543Ujhhgtgfeyxiexzf != null) {
                        arrayList10.add(c0543Ujhhgtgfeyxiexzf);
                    }
                }
                c3678feyxiexzfUjhhgtg.m5371Ujhhgtgfeyxiexzf(arrayList3);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf("好友", arrayList4);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf("群聊", arrayList5);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf("公众号", arrayList6);
                for (C0543Ujhhgtgfeyxiexzf c0543Ujhhgtgfeyxiexzf2 : arrayList10) {
                    c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(c0543Ujhhgtgfeyxiexzf2.f2530Ujhhgtgfeyxiexzf, c0543Ujhhgtgfeyxiexzf2.f2531Ujhhgtgfeyxiexzf);
                }
                String str2 = "保存";
                C0542Ujhhgtgfeyxiexzf c0542Ujhhgtgfeyxiexzf = new C0542Ujhhgtgfeyxiexzf(c0544Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf, interfaceC3545feyxiexzfUjhhgtg);
                c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str2;
                c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = c0542Ujhhgtgfeyxiexzf;
                break;
            case 2:
                Activity activity = (Activity) this.f10797Ujhhgtgfeyxiexzf;
                String str3 = (String) this.f10798Ujhhgtgfeyxiexzf;
                String str4 = (String) this.f10799Ujhhgtgfeyxiexzf;
                Intent intent = new Intent();
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                intent.setClassName(activity, "com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI");
                intent.putExtra("title", "历史发言记录");
                intent.putExtra("RoomInfo_Id", str3);
                intent.putExtra("room_member", str4);
                activity.startActivity(intent);
                break;
            default:
                Activity activity2 = (Activity) this.f10797Ujhhgtgfeyxiexzf;
                ArrayList<String> arrayList12 = (ArrayList) this.f10798Ujhhgtgfeyxiexzf;
                String str5 = (String) this.f10799Ujhhgtgfeyxiexzf;
                Intent intent2 = new Intent();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                intent2.setClassName(activity2, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent2.putStringArrayListExtra("sns_kemdia_path_list", arrayList12);
                intent2.putExtra("Kdescription", str5);
                activity2.startActivity(intent2);
                break;
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
