package p000;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲈᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2066 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6921;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6923;

    public /* synthetic */ C2066(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f6921 = i;
        this.f6922 = arrayList;
        this.f6923 = arrayList2;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IOException {
        C3554 c3554;
        StringBuilder sb;
        int i = this.f6921;
        C3554 c3555 = C3554.UNIT;
        ArrayList arrayList = this.f6923;
        ArrayList arrayList2 = this.f6922;
        switch (i) {
            case 0:
                C2066 c2066 = new C2066(arrayList2, arrayList, 1);
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c2066, (InterfaceC0841) null));
                return c3555;
            default:
                C0815 c0815 = (C0815) obj;
                String[] strArr = AbstractC1471.f5234;
                c0815.f3205 = "搜索好友/群聊";
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
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
                                arrayList5.add(c0800);
                                arrayList4.add(c0800);
                                c3555 = c3555;
                            } else {
                                FriendInfo friendInfoM4697 = AbstractC2727.m4697(cursorM4265);
                                String wxid = friendInfoM4697.getWxid();
                                StringBuilder sb4 = new StringBuilder();
                                String nickname = friendInfoM4697.getNickname();
                                if ((AbstractC2713.m4687(C2579.m4552(new C2579("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
                                    sb4.append("已过滤此昵称...");
                                    c3555 = c3555;
                                } else {
                                    String str = nickname.length() > 8 ? nickname : null;
                                    if (str != null) {
                                        String strSubstring = str.substring(0, 8);
                                        "substring(...)";
                                        sb4.append(strSubstring);
                                        sb4.append("...");
                                        sb = sb4;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb4.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM4697.getRemark();
                                if (remark2.length() <= 0) {
                                    remark2 = null;
                                }
                                if (remark2 != null) {
                                    sb4.append('(' + remark2 + ')');
                                }
                                C0800 c0801 = new C0800(wxid, sb4.toString(), friendInfoM4697.getWxid(), false);
                                arrayList5.add(c0801);
                                arrayList3.add(c0801);
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
                c0815.m2486(arrayList5);
                c0815.m2483("好友", arrayList3);
                c0815.m2483("群聊", arrayList4);
                c0815.f3206 = R.drawable.ic_contact_send_24dp;
                String str2 = "转发";
                C0748 c0748 = new C0748(arrayList2, arrayList, 1);
                c0815.f3209 = str2;
                c0815.f3211 = c0748;
                return c3554;
        }
    }
}
