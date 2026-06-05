package p000;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛴ能不能ᛲ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0346Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1985Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1986Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1987Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0346Ujhhgtgfeyxiexzf(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f1985Ujhhgtgfeyxiexzf = i;
        this.f1986Ujhhgtgfeyxiexzf = arrayList;
        this.f1987Ujhhgtgfeyxiexzf = arrayList2;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IOException {
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf;
        StringBuilder sb;
        int i = this.f1985Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf2 = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f1987Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = this.f1986Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0346Ujhhgtgfeyxiexzf c0346Ujhhgtgfeyxiexzf = new C0346Ujhhgtgfeyxiexzf(arrayList2, arrayList, 1);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c0346Ujhhgtgfeyxiexzf, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                return c1943Ujhhgtgfeyxiexzf2;
            default:
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = MagicFactory.get(4928900633483806090L, strArr);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Cursor cursorM5194feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11711Ujhhgtgfeyxiexzf, EnumC3684feyxiexzfUjhhgtg.f11712Ujhhgtgfeyxiexzf});
                if (cursorM5194feyxiexzfUjhhgtg != null) {
                    while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
                        try {
                            if (cursorM5194feyxiexzfUjhhgtg.getString(cursorM5194feyxiexzfUjhhgtg.getColumnIndex(MagicFactory.get(4928900736563021194L, strArr))).endsWith(MagicFactory.get(4928900697908315530L, strArr))) {
                                GroupInfo groupInfoM1316Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1316Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String roomId = groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(groupInfoM1316Ujhhgtgfeyxiexzf.getName());
                                String remark = groupInfoM1316Ujhhgtgfeyxiexzf.getRemark();
                                if (remark.length() <= 0) {
                                    remark = null;
                                }
                                if (remark != null) {
                                    sb2.append('(' + remark + ')');
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append('(');
                                sb3.append(groupInfoM1316Ujhhgtgfeyxiexzf.getGroupData().getMemberCount());
                                sb3.append(')');
                                sb2.append(sb3.toString());
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = new C3663feyxiexzfUjhhgtg(roomId, sb2.toString(), groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId(), false);
                                arrayList5.add(c3663feyxiexzfUjhhgtg);
                                arrayList4.add(c3663feyxiexzfUjhhgtg);
                                c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf2;
                            } else {
                                FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String wxid = friendInfoM1315Ujhhgtgfeyxiexzf.getWxid();
                                StringBuilder sb4 = new StringBuilder();
                                String nickname = friendInfoM1315Ujhhgtgfeyxiexzf.getNickname();
                                if ((AbstractC1119feyxiexzfUjhhgtg.m2589feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928900792397596042L, strArr)), nickname)) > 3 ? nickname : null) != null) {
                                    sb4.append(MagicFactory.get(4928900762332824970L, strArr));
                                    c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf2;
                                } else {
                                    String str = nickname.length() > 8 ? nickname : null;
                                    if (str != null) {
                                        String strSubstring = str.substring(0, 8);
                                        MagicFactory.get(4928900856822105482L, strArr);
                                        sb4.append(strSubstring);
                                        sb4.append(MagicFactory.get(4928900929836549514L, strArr));
                                        sb = sb4;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb4.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM1315Ujhhgtgfeyxiexzf.getRemark();
                                if (remark2.length() <= 0) {
                                    remark2 = null;
                                }
                                if (remark2 != null) {
                                    sb4.append('(' + remark2 + ')');
                                }
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg2 = new C3663feyxiexzfUjhhgtg(wxid, sb4.toString(), friendInfoM1315Ujhhgtgfeyxiexzf.getWxid(), false);
                                arrayList5.add(c3663feyxiexzfUjhhgtg2);
                                arrayList3.add(c3663feyxiexzfUjhhgtg2);
                            }
                            c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf2;
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
                    c1943Ujhhgtgfeyxiexzf = c1943Ujhhgtgfeyxiexzf2;
                    cursorM5194feyxiexzfUjhhgtg.close();
                } else {
                    c1943Ujhhgtgfeyxiexzf = c1943Ujhhgtgfeyxiexzf2;
                }
                c3678feyxiexzfUjhhgtg.m5371Ujhhgtgfeyxiexzf(arrayList5);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928900912656680330L, strArr), arrayList3);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928900899771778442L, strArr), arrayList4);
                c3678feyxiexzfUjhhgtg.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_send_24dp;
                String str2 = MagicFactory.get(4928901024325830026L, strArr);
                C2860feyxiexzfUjhhgtg c2860feyxiexzfUjhhgtg = new C2860feyxiexzfUjhhgtg(arrayList2, arrayList, 1);
                c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str2;
                c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = c2860feyxiexzfUjhhgtg;
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
