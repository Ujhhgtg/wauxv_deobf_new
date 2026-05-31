package p000;

import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3674 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f11454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f11455;

    public /* synthetic */ C3674(String str, int i, int i2) {
        this.f11453 = i2;
        this.f11454 = str;
        this.f11455 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IOException {
        C3554 c3554;
        String str;
        String str2;
        StringBuilder sb;
        int i = this.f11453;
        C3554 c3555 = C3554.UNIT;
        final int i2 = this.f11455;
        final String str3 = this.f11454;
        switch (i) {
            case 0:
                C3674 c3674 = new C3674(str3, i2, 1);
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c3674, (InterfaceC0841) null));
                return c3555;
            default:
                C0815 c0815 = (C0815) obj;
                String[] strArr = AbstractC1471.f5234;
                c0815.f3205 = "搜索好友/群聊";
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Cursor cursorM4265 = AbstractC2240.m4265(new EnumC0821[]{EnumC0821.f3221, EnumC0821.f3222});
                if (cursorM4265 != null) {
                    while (cursorM4265.moveToNext()) {
                        try {
                            if (cursorM4265.getString(cursorM4265.getColumnIndex("username")).endsWith("@chatroom")) {
                                GroupInfo groupInfoM4698 = AbstractC2727.m4698(cursorM4265);
                                String roomId = groupInfoM4698.getRoomId();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(groupInfoM4698.getName());
                                String remark = groupInfoM4698.getRemark();
                                if (remark.length() <= 0) {
                                    remark = null;
                                }
                                if (remark != null) {
                                    sb2.append('(' + remark + ')');
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append('(');
                                sb3.append(groupInfoM4698.getGroupData().getMemberCount());
                                sb3.append(')');
                                sb2.append(sb3.toString());
                                C0800 c0800 = new C0800(roomId, sb2.toString(), groupInfoM4698.getRoomId(), false);
                                arrayList3.add(c0800);
                                arrayList2.add(c0800);
                                c3555 = c3555;
                            } else {
                                FriendInfo friendInfoM4697 = AbstractC2727.m4697(cursorM4265);
                                String wxid = friendInfoM4697.getWxid();
                                StringBuilder sb4 = new StringBuilder();
                                String nickname = friendInfoM4697.getNickname();
                                if (AbstractC2713.m4687(C2579.m4552(new C2579("\r\n|\r|\n"), nickname)) <= 3) {
                                    str = null;
                                }
                                if (str != null) {
                                    str = nickname;
                                    sb4.append("已过滤此昵称...");
                                    c3555 = c3555;
                                } else {
                                    if (nickname.length() <= 8) {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        str = nickname;
                                        String strSubstring = str2.substring(0, 8);
                                        "substring(...)";
                                        sb4.append(strSubstring);
                                        sb4.append("...");
                                        sb = sb4;
                                    } else {
                                        str = nickname;
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        str = nickname;
                                        str2 = nickname;
                                        str = nickname;
                                        str2 = nickname;
                                        sb4.append(nickname);
                                    }
                                }
                                str = nickname;
                                str2 = nickname;
                                str = nickname;
                                str2 = nickname;
                                String remark2 = friendInfoM4697.getRemark();
                                if (remark2.length() <= 0) {
                                    remark2 = null;
                                }
                                if (remark2 != null) {
                                    sb4.append('(' + remark2 + ')');
                                }
                                C0800 c0801 = new C0800(wxid, sb4.toString(), friendInfoM4697.getWxid(), false);
                                arrayList3.add(c0801);
                                arrayList.add(c0801);
                            }
                            c3555 = c3555;
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
                    c3554 = c3555;
                    cursorM4265.close();
                } else {
                    c3554 = c3555;
                }
                c0815.m2486(arrayList3);
                c0815.m2483("好友", arrayList);
                c0815.m2483("群聊", arrayList2);
                c0815.f3206 = R.drawable.ic_contact_send_24dp;
                String str4 = "转发";
                InterfaceC1437 interfaceC1437 = new InterfaceC1437() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᤞᲁᲀ
                    @Override // p000.InterfaceC1437
                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
                    public final Object mo1342(Object obj2, Object obj3) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
                        List list = (List) obj2;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C2199.m4148(i2, ((C0800) it.next()).f3167, str3);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        String[] strArr2 = AbstractC1471.f5234;
                        sb5.append("已转发至");
                        sb5.append(list.size());
                        sb5.append("个会话");
                        AbstractC2894.m4856(null, 3, sb5.toString());
                        return Boolean.FALSE;
                    }
                };
                c0815.f3209 = str4;
                c0815.f3211 = interfaceC1437;
                return c3554;
        }
    }
}
