package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲈᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2501 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7931;

    public /* synthetic */ C2501(Object obj, int i) {
        this.f7930 = i;
        this.f7931 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[LOOP:0: B:26:0x006a->B:37:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[LOOP:2: B:43:0x00a5->B:54:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0030 A[SYNTHETIC] */
    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object next;
        String str;
        C2348 c2348;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.f7930) {
            case 0:
                ConversationBean conversationBean = (ConversationBean) this.f7931;
                List list = (List) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str5 = ((C0800) it.next()).f3167;
                    List listSingletonList = Collections.singletonList(conversationBean.getUsername());
                    C2202.f7252.getClass();
                    C2213.m4153(C2213.f7263, AbstractC0972.m2609(C2201.f7251).newInstance(str5, listSingletonList, 0, null));
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC1471.f5234;
                sb.append("已邀请至");
                sb.append(list.size());
                sb.append("个群聊");
                AbstractC2894.m4856(null, 3, sb.toString());
                return Boolean.FALSE;
            case 1:
                int iM4868 = AbstractC2901.m4868((CharSequence) obj, (char[]) this.f7931, ((Integer) obj2).intValue(), false);
                if (iM4868 < 0) {
                    return null;
                }
                return new C2348(Integer.valueOf(iM4868), 1);
            default:
                List list2 = (List) this.f7931;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (list2.size() == 1) {
                    int size = list2.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str6 = (String) list2.get(0);
                    int iM4867 = AbstractC2901.m4867(charSequence, str6, iIntValue, false, 4);
                    if (iM4867 < 0) {
                        c2348 = null;
                    } else {
                        c2348 = new C2348(Integer.valueOf(iM4867), str6);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    C1679 c1679 = new C1679(iIntValue, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i = c1679.f5652;
                    int i2 = c1679.f5651;
                    if (z) {
                        if ((i <= 0 || iIntValue > i2) && (i >= 0 || i2 > iIntValue)) {
                            c2348 = null;
                        } else {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c2348 = new C2348(Integer.valueOf(iIntValue), str3);
                                    } else if (iIntValue != i2) {
                                        iIntValue += i;
                                    } else {
                                        c2348 = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c2348 = new C2348(Integer.valueOf(iIntValue), str3);
                                } else if (iIntValue != i2) {
                                    iIntValue += i;
                                } else {
                                    c2348 = null;
                                }
                            }
                        }
                    } else if ((i <= 0 || iIntValue > i2) && (i >= 0 || i2 > iIntValue)) {
                        c2348 = null;
                    } else {
                        int i3 = iIntValue;
                        while (true) {
                            Iterator it3 = list2.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c2348 = new C2348(Integer.valueOf(i3), str);
                                } else if (i3 != i2) {
                                    i3 += i;
                                } else {
                                    c2348 = null;
                                }
                            } while (!AbstractC2901.m4873(str2, 0, charSequence, i3, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                c2348 = new C2348(Integer.valueOf(i3), str);
                            } else if (i3 != i2) {
                                i3 += i;
                            } else {
                                c2348 = null;
                            }
                        }
                    }
                }
                if (c2348 != null) {
                    return new C2348(c2348.f7567, Integer.valueOf(((String) c2348.f7568).length()));
                }
                return null;
        }
    }
}
