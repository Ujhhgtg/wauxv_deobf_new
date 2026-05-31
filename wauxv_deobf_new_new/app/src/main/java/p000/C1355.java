package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.data.bean.ContactLabelBean;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1355 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4856;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4858;

    public /* synthetic */ C1355(Object obj, Object obj2, Object obj3, int i) {
        this.f4855 = i;
        this.f4856 = obj;
        this.f4857 = obj2;
        this.f4858 = obj3;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IOException {
        C1359 c1359;
        C1515 c1515;
        C1496 c1496;
        InterfaceC1422 interfaceC1422;
        ArrayList<C2348> arrayList;
        switch (this.f4855) {
            case 0:
                C2050 c2050 = (C2050) this.f4856;
                ArrayList arrayList2 = (ArrayList) this.f4857;
                C2571 c2571 = (C2571) this.f4858;
                C1363 c1363 = (C1363) obj;
                C1369 c1369 = C1369.f4885;
                Context context = c2050.f6866.getContext();
                Object obj2 = c2571.f8191;
                if (obj2 == null) {
                    "adapter";
                    c1359 = null;
                } else {
                    c1359 = (C1359) obj2;
                }
                c1369.getClass();
                C1369.m3187(context, c1363, arrayList2, c1359);
                break;
            case 1:
                C1515 c1516 = (C1515) this.f4856;
                C1496 c1497 = (C1496) this.f4857;
                InterfaceC1422 interfaceC1423 = (InterfaceC1422) this.f4858;
                C0815 c0815 = (C0815) obj;
                String[] strArr = AbstractC1471.f5234;
                c0815.f3205 = "搜索好友/群聊/公众号";
                Set setM1536 = AbstractC0280.m1536(c1497.f5296);
                c1516.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0810.f3180.getClass();
                List listM2476 = C0810.m2476();
                ArrayList arrayList7 = new ArrayList(AbstractC0741.m2313(listM2476, 10));
                Iterator it = listM2476.iterator();
                while (it.hasNext()) {
                    arrayList7.add(new ContactLabelBean(it.next()));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Iterator it2 = arrayList7.iterator(); it2.hasNext(); it2 = it2) {
                    ContactLabelBean contactLabelBean = (ContactLabelBean) it2.next();
                    String strValueOf = String.valueOf(contactLabelBean.getId());
                    C0810.f3180.getClass();
                    List listM2305 = AbstractC0739.m2305(AbstractC0739.m2307(C0810.m2477(strValueOf)));
                    C2348 c2348 = listM2305.isEmpty() ? null : new C2348(contactLabelBean.getName(), listM2305);
                    if (c2348 != null) {
                        arrayList8.add(c2348);
                    }
                }
                Cursor cursorM4265 = AbstractC2240.m4265(new EnumC0821[]{EnumC0821.f3221, EnumC0821.f3222, EnumC0821.f3223});
                if (cursorM4265 != null) {
                    while (cursorM4265.moveToNext()) {
                        try {
                            String string = cursorM4265.getString(cursorM4265.getColumnIndex("username"));
                            C1515 c1517 = c1516;
                            boolean z = (cursorM4265.getInt(cursorM4265.getColumnIndex("verifyFlag")) & 8) != 0;
                            if (string.endsWith("@chatroom")) {
                                GroupInfo groupInfoM4698 = AbstractC2727.m4698(cursorM4265);
                                String roomId = groupInfoM4698.getRoomId();
                                StringBuilder sb = new StringBuilder();
                                String name = groupInfoM4698.getName();
                                if (AbstractC2901.m4869(name)) {
                                    name = groupInfoM4698.getRoomId();
                                }
                                sb.append(name);
                                if (!AbstractC2901.m4869(groupInfoM4698.getRemark())) {
                                    sb.append('(' + groupInfoM4698.getRemark() + ')');
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append('(');
                                sb2.append(groupInfoM4698.getGroupData().getMemberCount());
                                sb2.append(')');
                                sb.append(sb2.toString());
                                C0800 c0800 = new C0800(roomId, sb.toString(), groupInfoM4698.getRoomId(), setM1536.contains(groupInfoM4698.getRoomId()));
                                arrayList3.add(c0800);
                                arrayList5.add(c0800);
                                linkedHashMap.put(roomId, c0800);
                                c1516 = c1517;
                                arrayList8 = arrayList8;
                            } else {
                                ArrayList arrayList9 = arrayList8;
                                if (z) {
                                    FriendInfo friendInfoM4697 = AbstractC2727.m4697(cursorM4265);
                                    String wxid = friendInfoM4697.getWxid();
                                    StringBuilder sb3 = new StringBuilder();
                                    String nickname = friendInfoM4697.getNickname();
                                    if (AbstractC2901.m4869(nickname)) {
                                        nickname = friendInfoM4697.getWxid();
                                    }
                                    if (nickname.length() > 24) {
                                        nickname = AbstractC2901.m4881(24, nickname) + "...";
                                    }
                                    sb3.append(nickname);
                                    if (!AbstractC2901.m4869(friendInfoM4697.getRemark())) {
                                        sb3.append('(' + friendInfoM4697.getRemark() + ')');
                                    }
                                    C0800 c0801 = new C0800(wxid, sb3.toString(), friendInfoM4697.getWxid(), setM1536.contains(friendInfoM4697.getWxid()));
                                    arrayList3.add(c0801);
                                    arrayList6.add(c0801);
                                    linkedHashMap.put(wxid, c0801);
                                } else {
                                    c1497 = c1497;
                                    interfaceC1423 = interfaceC1423;
                                    FriendInfo friendInfoM4698 = AbstractC2727.m4697(cursorM4265);
                                    String wxid2 = friendInfoM4698.getWxid();
                                    StringBuilder sb4 = new StringBuilder();
                                    String nickname2 = friendInfoM4698.getNickname();
                                    if (AbstractC2901.m4869(nickname2)) {
                                        nickname2 = friendInfoM4698.getWxid();
                                    }
                                    if (nickname2.length() > 24) {
                                        nickname2 = AbstractC2901.m4881(24, nickname2) + "...";
                                    }
                                    sb4.append(nickname2);
                                    if (!AbstractC2901.m4869(friendInfoM4698.getRemark())) {
                                        sb4.append('(' + friendInfoM4698.getRemark() + ')');
                                    }
                                    C0800 c0802 = new C0800(wxid2, sb4.toString(), friendInfoM4698.getWxid(), setM1536.contains(friendInfoM4698.getWxid()));
                                    arrayList3.add(c0802);
                                    arrayList4.add(c0802);
                                    linkedHashMap.put(wxid2, c0802);
                                }
                                c1516 = c1517;
                                arrayList8 = arrayList9;
                                c1497 = c1497;
                                interfaceC1423 = interfaceC1423;
                            }
                            break;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC3528.m5090(cursorM4265, th);
                                throw th2;
                            }
                        }
                    }
                    c1515 = c1516;
                    c1496 = c1497;
                    interfaceC1422 = interfaceC1423;
                    arrayList = arrayList8;
                    cursorM4265.close();
                } else {
                    c1515 = c1516;
                    c1496 = c1497;
                    interfaceC1422 = interfaceC1423;
                    arrayList = arrayList8;
                }
                ArrayList<C1514> arrayList10 = new ArrayList();
                for (C2348 c2349 : arrayList) {
                    String str = (String) c2349.f7567;
                    List list = (List) c2349.f7568;
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C0800 c0803 = (C0800) linkedHashMap.get((String) it3.next());
                        if (c0803 != null) {
                            arrayList11.add(c0803);
                        }
                    }
                    C1514 c1514 = arrayList11.isEmpty() ? null : new C1514(AbstractC2844.m4786(new StringBuilder(), "标签:", str), arrayList11);
                    if (c1514 != null) {
                        arrayList10.add(c1514);
                    }
                }
                c0815.m2486(arrayList3);
                c0815.m2483("好友", arrayList4);
                c0815.m2483("群聊", arrayList5);
                c0815.m2483("公众号", arrayList6);
                for (C1514 c1518 : arrayList10) {
                    c0815.m2483(c1518.f5341, c1518.f5342);
                }
                String str2 = "保存";
                C1513 c1513 = new C1513(c1515, c1496, interfaceC1422);
                c0815.f3209 = str2;
                c0815.f3211 = c1513;
                break;
            case 2:
                Activity activity = (Activity) this.f4856;
                String str3 = (String) this.f4857;
                String str4 = (String) this.f4858;
                Intent intent = new Intent();
                String[] strArr2 = AbstractC1471.f5234;
                intent.setClassName(activity, "com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI");
                intent.putExtra("title", "历史发言记录");
                intent.putExtra("RoomInfo_Id", str3);
                intent.putExtra("room_member", str4);
                activity.startActivity(intent);
                break;
            default:
                Activity activity2 = (Activity) this.f4856;
                ArrayList<String> arrayList12 = (ArrayList) this.f4857;
                String str5 = (String) this.f4858;
                Intent intent2 = new Intent();
                String[] strArr3 = AbstractC1471.f5234;
                intent2.setClassName(activity2, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent2.putStringArrayListExtra("sns_kemdia_path_list", arrayList12);
                intent2.putExtra("Kdescription", str5);
                activity2.startActivity(intent2);
                break;
        }
        return C3554.UNIT;
    }
}
